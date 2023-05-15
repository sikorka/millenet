package com.github.sikorka.millenet.credit.history;

import lombok.Getter;

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

    String toCsv() {
        StringBuilder builder = new StringBuilder();

        for (CreditOperation o : operations) {
            builder.append(o.toCsv())
                    .append(fileName).append(CSV_SEPARATOR)
                    .append(NEWLINE);
        }

        return builder.toString();
    }

    @Override
    public String toString() {
        return fileName + NEWLINE + NEWLINE + toCsv();
    }
}
