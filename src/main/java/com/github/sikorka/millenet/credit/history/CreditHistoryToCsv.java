package com.github.sikorka.millenet.credit.history;

import lombok.extern.log4j.Log4j;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.net.URISyntaxException;

@Log4j
public class CreditHistoryToCsv {
    public static final String SANITIZED_DIR_UNDER_RESOURCES = "sanitized";

    public static void main(String[] args) throws IOException, URISyntaxException {
        Credit credit = CreditHistoryParserReader.getCreditHistories(SANITIZED_DIR_UNDER_RESOURCES);

        String lineSeparator = StringUtils.repeat('=', CreditOperation.CSV_HEADER.length());

        log.info("Printing CSV with credit operations...");
        System.out.println(lineSeparator);
        System.out.print(credit.toCsv()); //boom, gotya!
        System.out.println(lineSeparator);
        log.info("🟢 Printed.");
    }
}
