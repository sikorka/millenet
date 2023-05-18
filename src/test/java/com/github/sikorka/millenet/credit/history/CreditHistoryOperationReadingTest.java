package com.github.sikorka.millenet.credit.history;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class CreditHistoryOperationReadingTest {
    String directoryUnderResources = "sanitized";
    String fileNameWithDirectory = directoryUnderResources + File.separator + "example sanitized.txt";

    //TODO do this for every type of operation
    @Test
    public void whenCreditHistoryTxtRead_thenCorrectOperation() throws IOException {
        CreditHistory creditHistory;

        when:
        creditHistory = CreditHistoryParserReader.parseCreditHistory(fileNameWithDirectory);

        then:
        assertThat(creditHistory).isNotNull();
        assertThat(creditHistory.getOperations()).isNotNull();
        assertThat(creditHistory.getOperations()).hasSize(1);

        CreditOperation firstOperation = creditHistory.getOperations().get(0);
        System.out.println(firstOperation);

        assertThat(firstOperation).isNotNull();
        assertThat(firstOperation.getTransactionDate()).isEqualTo("2010-07-01");
        assertThat(firstOperation.getCurrencyDate()).isEqualTo("2010-07-02");
        assertThat(firstOperation.getCurrencyAmount()).isEqualTo("300,00");
        assertThat(firstOperation.getCurrency()).isEqualTo("CHF");
        assertThat(firstOperation.getTransactionType()).isEqualTo("SPŁ.RATY-REGULARNA");
        assertThat(firstOperation.getOperationTitle()).isEqualTo("KAPITAŁ ODSETKI 100.00 ODSETKI PRZETERMINOWANE 1.00 KWOTA RATY (KAPITAŁ + ODSETKI) 400.00 PŁATNOŚĆ CZĘŚCIOWA - WAL/PLN PLN1604.00");
        assertThat(firstOperation.getChfKwotaOdsetki()).isEqualTo("100.00");
        assertThat(firstOperation.getChfKwotaOdsetkiPrzeterminowane()).isEqualTo("1.00");
        assertThat(firstOperation.getPlnKwota()).isEqualTo("1604.00");
    }
}
