package com.github.sikorka.util;

import lombok.experimental.UtilityClass;
import lombok.extern.log4j.Log4j;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.IOException;

import static com.github.sikorka.util.ScreenPrinter.*;

@UtilityClass
@Log4j
public class PdfReader {

    public static String readPdf(File pdfFile) throws IOException {
        PDDocument document = PDDocument.load(pdfFile);
        PDFTextStripper stripper = new PDFTextStripper();
        String pdfText = stripper.getText(document);
        document.close();

        printUnderlinedThinly(pdfFile.getName());
        print(pdfText);

        return pdfText;
    }
}
