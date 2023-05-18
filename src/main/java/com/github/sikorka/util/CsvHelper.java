package com.github.sikorka.util;

import com.github.sikorka.millenet.credit.history.CreditOperation;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CsvHelper {
    public static final char CSV_DELIMITER = ';';

    public static String toCsvRow(String... data) {
        return Stream.of(data)
                .map(CsvHelper::escapeSpecialCharacters)
                .collect(Collectors.joining(String.valueOf(CSV_DELIMITER)));
    }

    public static String escapeSpecialCharacters(String data) {
        String escapedData = data.replaceAll("\\R", " ");

        if (data.contains(String.valueOf(CSV_DELIMITER)) || data.contains("\"") || data.contains("'")) {
            data = data.replace("\"", "\"\"");
            escapedData = "\"" + data + "\"";
        }

        return escapedData;
    }

    public static Iterable<CSVRecord> fromCsv(String csv, String[] COLUMN_NAMES) throws IOException {
        CSVFormat csvFormat = CSVFormat.newFormat(CSV_DELIMITER)
                .withHeader(COLUMN_NAMES)
                .withSkipHeaderRecord(true);

        Reader in = new StringReader(csv);

        return csvFormat.parse(in);
    }

    public static Iterable<CSVRecord> fromCsv(String csv) throws IOException {
        CSVFormat csvFormat = CSVFormat.newFormat(CSV_DELIMITER)
                .withSkipHeaderRecord(false);

        Reader in = new StringReader(csv);

        return csvFormat.parse(in);
    }
}
