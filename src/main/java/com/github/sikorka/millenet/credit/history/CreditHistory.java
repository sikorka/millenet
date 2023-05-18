package com.github.sikorka.millenet.credit.history;

import com.sun.org.apache.bcel.internal.generic.NEW;
import lombok.Getter;

import static com.github.sikorka.millenet.credit.history.CreditOperation.*;
import static com.github.sikorka.util.CsvHelper.*;
import static com.github.sikorka.util.TextHelper.*;

import java.util.ArrayList;
import java.util.List;

@Getter
public class CreditHistory {
    String fileName;

    private final List<CreditOperation> operations = new ArrayList<>();

    public CreditHistory(String fileName) {
        this.fileName = fileName;
    }

    String toCsvRows() {
        StringBuilder builder = new StringBuilder();

        for (CreditOperation operation : operations) {
            builder.append(operation.toCsvRow()).append(CSV_DELIMITER)
                    .append(fileName).append(CSV_DELIMITER)
                    .append(NEWLINE);
        }

        return builder.toString();
    }

    String toCsvRowsWithHeader() {
        StringBuilder builder = new StringBuilder();

        builder.append(CSV_HEADER).append(CSV_DELIMITER)
//                .append(NAZWA_PLIKU_9).append(CSV_DELIMITER)
                .append(NEWLINE);

        builder.append(toCsvRows());

        return builder.toString();
    }

    @Override
    public String toString() {
        return fileName + NEWLINE + NEWLINE + toCsvRows();
    }
}
