package com.github.sikorka.millenet.credit.history;

import com.github.sikorka.millenet.credit.history.grammar.CreditHistoryListener;
import com.github.sikorka.millenet.credit.history.grammar.CreditHistoryMillenetLexer;
import com.github.sikorka.millenet.credit.history.grammar.CreditHistoryMillenetParser;
import com.github.sikorka.util.ResourceFileReader;
import lombok.extern.log4j.Log4j;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;

@Log4j
public class CreditHistoryParserReader {

    public static Credit getCreditHistories(String directoryUnderResources) throws URISyntaxException, IOException {
        Credit credit = new Credit();

        File[] files = ResourceFileReader.getFilesFromDirectoryUnderResources(File.separator + directoryUnderResources);

        if (files != null) {
            for (File f : files) {
                credit.creditHistories.add(parseCreditHistory(directoryUnderResources + File.separator + f.getName()));
            }
        }

        return credit;
    }

    public static CreditHistory parseCreditHistory(String fileName) throws IOException {
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
}
