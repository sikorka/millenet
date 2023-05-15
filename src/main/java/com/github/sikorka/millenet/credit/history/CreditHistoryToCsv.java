package com.github.sikorka.millenet.credit.history;

import com.github.sikorka.millenet.credit.history.grammar.CreditHistoryListener;
import com.github.sikorka.millenet.credit.history.grammar.CreditHistoryMillenetLexer;
import com.github.sikorka.millenet.credit.history.grammar.CreditHistoryMillenetParser;
import com.github.sikorka.util.ResourceFileReader;
import lombok.extern.log4j.Log4j;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;

@Log4j
public class CreditHistoryToCsv {

    private static final String LONG_EQUALS = StringUtils.repeat('=', CreditOperation.HEADER.length());

    static CreditHistory getCreditHistory(String fileName) throws IOException {
        InputStream stream = ResourceFileReader.getInputStreamFromResources(fileName);

        if (stream == null) {
            log.error("🔴 Could not get stream for file '" + fileName + "'!");

            return null;
        }

        CreditHistoryMillenetLexer lexer = new CreditHistoryMillenetLexer(CharStreams.fromStream(stream));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CreditHistoryMillenetParser parser = new CreditHistoryMillenetParser(tokens);

        ParseTreeWalker walker = new ParseTreeWalker();
        CreditHistoryListener listener = new CreditHistoryListener(fileName);
        walker.walk(listener, parser.credit());

        return listener.getCreditHistory();
    }

    public static void main(String[] args) throws IOException, URISyntaxException {
        String directoryUnderResources = "sanitized";

        Credit credit = getCreditHistories(directoryUnderResources);

        log.info("Printing CSV with credit operations...");
        System.out.println(LONG_EQUALS);
        System.out.print(credit.toCsv()); //boom, gotya!
        System.out.println(LONG_EQUALS);
        log.info("🟢 Printed.");
    }

    private static Credit getCreditHistories(String directoryUnderResources) throws URISyntaxException, IOException {
        Credit credit = new Credit();

        File[] files = ResourceFileReader.getFilesFromDirectoryUnderResources(File.separator + directoryUnderResources);

        if (files != null) {
            for (File f : files) {
                credit.creditHistories.add(getCreditHistory(directoryUnderResources + File.separator + f.getName()));
            }
        }

        return credit;
    }
}
