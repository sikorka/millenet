package com.github.sikorka.millenet.credit.history;

import com.github.sikorka.util.FilesAndPaths;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

import static com.github.sikorka.util.FilesAndPaths.*;
import static org.assertj.core.api.Assertions.assertThat;

public class CreditHistoryOperationReadingTest {
    String fileNameWithDirectory = Paths.get(SANITIZED_DIR_NAME, "example sanitized.txt").toString();

    @Test
    public void whenCreditHistorySanitizedTxtRead_thenCorrectOperation() throws IOException {
        CreditHistory creditHistory;
        CreditOperation firstOperation;

        when:
        creditHistory = CreditHistoryParserReader.parseCreditHistory(fileNameWithDirectory);

        then:
        assertThat(creditHistory).isNotNull();
        assertThat(creditHistory.getOperations()).isNotNull();
        assertThat(creditHistory.getOperations()).hasSize(1);

        and:
        firstOperation = creditHistory.getOperations().get(0);
        System.out.println(firstOperation);

        SoftAssertions softly = new SoftAssertions();

        softly.assertThat(firstOperation).isNotNull();
        softly.assertThat(firstOperation.getTransactionDate()).isEqualTo("2010-07-01");
        softly.assertThat(firstOperation.getCurrencyDate()).isEqualTo("2010-07-02");
        softly.assertThat(firstOperation.getCurrencyAmount()).isEqualTo("300.00");
        softly.assertThat(firstOperation.getCurrency()).isEqualTo("CHF");
        softly.assertThat(firstOperation.getTransactionType()).isEqualTo("SPŁ.RATY-REGULARNA");
        softly.assertThat(firstOperation.getOperationTitle()).isEqualTo("KAPITAŁ ODSETKI 100.00 ODSETKI PRZETERMINOWANE 1.00 KWOTA RATY (KAPITAŁ + ODSETKI) 400.00 PŁATNOŚĆ CZĘŚCIOWA - WAL/PLN PLN1,604.00");
        softly.assertThat(firstOperation.getChfKwotaOdsetki()).isEqualTo("100.00");
        softly.assertThat(firstOperation.getChfKwotaOdsetkiPrzeterminowane()).isEqualTo("1.00");
        softly.assertThat(firstOperation.getPlnKwota()).isEqualTo("1604.00");

        softly.assertAll();
    }
}
