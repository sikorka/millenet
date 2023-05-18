package com.github.sikorka.millenet.credit.history;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

import static com.github.sikorka.util.TextHelper.*;

@Data
public class Credit {
    List<CreditHistory> creditHistories = new ArrayList<>();

    public String toCsv() {
        StringBuilder builder = new StringBuilder();

        builder.append(CreditOperation.CSV_HEADER).append(NEWLINE);

        for (CreditHistory creditHistory : creditHistories) {
            builder.append(creditHistory.toCsvRows());
        }

        return builder.toString();
    }
}
