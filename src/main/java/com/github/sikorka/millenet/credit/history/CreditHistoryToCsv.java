package com.github.sikorka.millenet.credit.history;

import com.github.sikorka.util.PdfReader;
import com.github.sikorka.util.AppProperties;
import lombok.extern.log4j.Log4j;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

import static com.github.sikorka.util.FilesAndPaths.*;
import static com.github.sikorka.util.FilesAndPaths.getFiles;
import static com.github.sikorka.util.ScreenPrinter.*;
import static com.github.sikorka.util.ResourceFileReaderWriter.getDirectoryUnderResources;
import static com.github.sikorka.util.ResourceFileReaderWriter.writeToFileUnderResources;
import static com.github.sikorka.util.TextHelper.*;
import static com.github.sikorka.TinyLog.*;

@Log4j
public class CreditHistoryToCsv {

    private static final String CSV_FILE_NAME = "credit.csv";

    private static int pdfToTxtCount = 0;
    private static int sanitizedCount = 0;

    public static void main(String[] args) throws IOException {
        String subdirectory = AppProperties.getSubfolder();

        savePdfsToTxts(subdirectory);

        if (pdfToTxtCount > 0) {
            sanitizeTxtFiles(subdirectory);

            if (sanitizedCount > 0) {
                saveCreditHistoriesAsCsv(subdirectory);

                shout(CSV_FILE_NAME + " created!");
            }
        }
    }

    private static String saveCreditHistoriesAsCsv(String whereToReadFrom) throws IOException {
        log.info("Subfolder: '" + whereToReadFrom + "'");

        String sanitizedDirectory = buildDirectoryPath(whereToReadFrom, SANITIZED_DIR_NAME);
        log.info("Path: '" + sanitizedDirectory + "'");

        Credit credit = CreditHistoryParserReader.getCreditHistoriesFromUnderResources(sanitizedDirectory);

        log.info("Saving CSV with credit operations...");
        print(THICK_LINE_DIVIDER);

        String csv = credit.toCsv();
        print(csv); //boom, gotya!
        Path savedDirectory = writeToFileUnderResources(csv, CSV_FILE_NAME,  whereToReadFrom);

        print(THICK_LINE_DIVIDER);
        log.info("🟢 Saved to " + savedDirectory + ".");

        return savedDirectory.toString();
    }

    /** Saves PDF files from resources /pdf directory to TXT files in resources /txt directory. */
    public static void savePdfsToTxts(String whereToSave) {
        //TODO clean TXT directory at some point

        log.info("Transforming PDFs from '/" + PDF_DIR_NAME + "' directory to TXT files in '/" + TXT_DIR_NAME + "' directory...");
        log.info("Subfolder: '" + whereToSave + "'");

        String pdfDirectory = getDirectoryUnderResources(whereToSave, PDF_DIR_NAME);

        if (pdfDirectory == null) {
            log.error("🔴 Directory name '" + PDF_DIR_NAME + "' not found!");

            return;
        }

        log.info("Full path: '" + pdfDirectory + "'");
        print(THICK_LINE_DIVIDER);

        File[] pdfDirectoryFiles = getFiles(pdfDirectory);
        List<File> pdfFiles = filterPdfs(pdfDirectoryFiles);

        String txtFileName;
        if (pdfFiles != null && pdfFiles.size() > 0) {
            for (File pdfFile : pdfFiles) {
                try {
                    String contents = PdfReader.readPdf(pdfFile);
                    contents += "\n";

                    txtFileName = pdfFile.getName() + ".txt";
                    writeToFileUnderResources(contents, txtFileName, whereToSave, TXT_DIR_NAME);

                    pdfToTxtCount += 1;
                } catch (IOException ioException) {
                    log.error("🔴 Could not transform '" + pdfFile.getName() + "'.");
                }
            }

            print(THICK_LINE_DIVIDER);
            log.info("🟢 Done transforming " + pdfToTxtCount + " pdf file(s).");
        } else {
            log.error("🔴 No PDF files found. Path: '" + pdfDirectory + "'");
        }
    }

    /** Sanitizes TXT files from resources /txt directory to TXT files in resources /sanitized directory.  */
    public static void sanitizeTxtFiles(String whereToSave) {
        //TODO clean this directory

        log.info("Sanitizing TXT files from '/" + TXT_DIR_NAME + "' directory to TXT files in '/" + SANITIZED_DIR_NAME + "' directory...");
        log.info("Subfolder: '" + whereToSave + "'");

        String txtDirectory = getDirectoryUnderResources(whereToSave, TXT_DIR_NAME);
        log.info("Full path: '" + txtDirectory + "'");
        print(THICK_LINE_DIVIDER);

        File[] txtFiles = getFiles(txtDirectory);

        if (txtFiles != null && txtFiles.length > 0) {
            sanitizedCount = 0;

            for (File txtFile : txtFiles) {
                try {
                    String contents = CreditHistorySanitizer.sanitize(txtFile);
                    writeToFileUnderResources(contents, txtFile.getName(), whereToSave, SANITIZED_DIR_NAME);
                    sanitizedCount += 1;
                } catch (IOException ioException) {
                    log.error("🔴 Could not sanitize '" + txtFile.getName() + "'.");
                }
            }

            print(THICK_LINE_DIVIDER);
            log.info("🟢 Done sanitizing " + sanitizedCount + " txt file(s).");
        } else {
            log.error("🔴 No TXT files found to sanitize. Path: '" + txtDirectory + "'");
        }
    }
}
