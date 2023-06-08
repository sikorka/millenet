package com.github.sikorka.millenet.credit.history;

import com.github.sikorka.millenet.credit.history.grammar.CreditHistoryListener;
import com.github.sikorka.millenet.credit.history.grammar.CreditHistoryMillenetLexer;
import com.github.sikorka.millenet.credit.history.grammar.CreditHistoryMillenetParser;
import lombok.extern.log4j.Log4j;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import static com.github.sikorka.util.FilesAndPaths.*;
import static com.github.sikorka.util.ResourceFileReaderWriter.*;

@Log4j
public class CreditHistoryParserReader {

    public static Credit getCreditHistoriesFromUnderResources(String sanitizedFilesDirectoryUnderResources) throws IOException {
        Credit credit = new Credit();

        File[] files = getFilesUnderResourcesDirectory(sanitizedFilesDirectoryUnderResources);

        if (files != null && files.length > 0) {
            for (File sanitizedFile : files) {
                CreditHistory creditHistory = parseCreditHistory(sanitizedFile);
                credit.creditHistories.add(creditHistory);
            }
        }

        return credit;
    }

    public static Credit getCreditHistories(String absoluteSanitizedFilesDirectory) throws IOException {
        Credit credit = new Credit();

        File[] files = getFiles(absoluteSanitizedFilesDirectory);

        if (files != null && files.length > 0) {
            for (File sanitizedFile : files) {
                CreditHistory creditHistory = parseCreditHistory(sanitizedFile);
                credit.creditHistories.add(creditHistory);
            }
        }

        return credit;
    }

    static CreditHistory parseCreditHistory(String fileName) throws IOException {
        InputStream stream = getInputStreamFromResources(fileName);

        if (stream == null) {
            log.error("🔴 Could not get stream for file '" + fileName + "'!");

            return null;
        }

        return parseCreditHistory(stream, fileName);
    }

    static CreditHistory parseCreditHistory(File file) throws IOException {
        if (file == null) {
            return null;
        }

        InputStream stream = getInputStream(file);

        if (stream == null) {
            log.error("🔴 Could not get stream for file '" + file.getPath() + "'!");

            return null;
        }

        return parseCreditHistory(stream, file.getName());
    }

    static CreditHistory parseCreditHistory(InputStream stream, String name) throws IOException {
        if (stream == null) {
            log.error("🔴 Stream is null!");

            return null;
        }

        CreditHistoryMillenetLexer lexer = new CreditHistoryMillenetLexer(CharStreams.fromStream(stream));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CreditHistoryMillenetParser parser = new CreditHistoryMillenetParser(tokens);

        ParseTreeWalker walker = new ParseTreeWalker();
        CreditHistoryListener listener = new CreditHistoryListener(name);
        walker.walk(listener, parser.credit());

        return listener.getCreditHistory();
    }
}
