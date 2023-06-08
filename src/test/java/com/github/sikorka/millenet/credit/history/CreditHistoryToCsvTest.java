package com.github.sikorka.millenet.credit.history;

import com.github.sikorka.util.CsvHelper;
import com.github.sikorka.util.FilesAndPaths;
import org.apache.commons.csv.CSVRecord;

import static com.github.sikorka.millenet.credit.history.CreditOperation.*;
import static org.assertj.core.api.Assertions.*;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

class CreditHistoryToCsvTest {
    String directoryUnderResources = FilesAndPaths.SANITIZED_DIR_NAME;
    String fileNameWithDirectory = Paths.get(directoryUnderResources, "example sanitized.txt").toString();

    @Test
    void whenCreditHistoryTxtRead_andCsvGenerated_thenCsvCorrect() throws IOException {
        CreditHistory creditHistory;
        String csv;

        when:
        creditHistory = CreditHistoryParserReader.parseCreditHistory(fileNameWithDirectory);
        assertThat(creditHistory).isNotNull();

        when:
        csv = creditHistory.toCsvRows();
        System.out.println(csv);

        Iterable<CSVRecord> records  = CsvHelper.fromCsv(csv);
        List<CSVRecord> recordsList = new ArrayList<>();
        records.forEach(recordsList::add);
        assertThat(recordsList).hasSize(1);

        CSVRecord firstOperation = recordsList.get(0);

        then:
        assertThat(firstOperation).isNotNull();

        SoftAssertions softly = new SoftAssertions();

        softly.assertThat(firstOperation.get(0)).isEqualTo("2010-07-01");
        softly.assertThat(firstOperation.get(1)).isEqualTo("2010-07-02");
        softly.assertThat(firstOperation.get(2)).isEqualTo("300.00");
        softly.assertThat(firstOperation.get(3)).isEqualTo("CHF");
        softly.assertThat(firstOperation.get(4)).isEqualTo("SPŁ.RATY-REGULARNA");
        softly.assertThat(firstOperation.get(5)).isEqualTo("KAPITAŁ ODSETKI 100.00 ODSETKI PRZETERMINOWANE 1.00 KWOTA RATY (KAPITAŁ + ODSETKI) 400.00 PŁATNOŚĆ CZĘŚCIOWA - WAL/PLN PLN1,604.00");
        softly.assertThat(firstOperation.get(6)).isEqualTo("100.00");
        softly.assertThat(firstOperation.get(7)).isEqualTo("1.00");
        softly.assertThat(firstOperation.get(8)).isEqualTo("1604.00");
        softly.assertThat(firstOperation.get(9)).isEqualTo(fileNameWithDirectory);

        softly.assertAll();
    }

    @Test
    void whenCreditHistoryTxtRead_andCsvGenerated_thenCsvWithHeaderCorrect() throws IOException {
        CreditHistory creditHistory;
        String csv;

        when:
        creditHistory = CreditHistoryParserReader.parseCreditHistory(fileNameWithDirectory);
        assertThat(creditHistory).isNotNull();

        when:
        csv = creditHistory.toCsvRowsWithHeader();
        System.out.println(csv);

        Iterable<CSVRecord> records  = CsvHelper.fromCsv(csv, COLUMN_NAMES);
        List<CSVRecord> recordsList = new ArrayList<>();
        records.forEach(recordsList::add);
        assertThat(recordsList).hasSize(1);

        CSVRecord firstOperation = recordsList.get(0);

        then:
        assertThat(firstOperation).isNotNull();

        SoftAssertions softly = new SoftAssertions();

        softly.assertThat(firstOperation.get(TRANSACTION_DATE_HEADER_0)).isEqualTo("2010-07-01");
        softly.assertThat(firstOperation.get(CURRENCY_DATE_HEADER_1)).isEqualTo("2010-07-02");
        softly.assertThat(firstOperation.get(CURRENCY_AMOUNT_HEADER_2)).isEqualTo("300.00");
        softly.assertThat(firstOperation.get(CURRENCY_HEADER_3)).isEqualTo("CHF");
        softly.assertThat(firstOperation.get(TRANSACTION_TYPE_HEADER_4)).isEqualTo("SPŁ.RATY-REGULARNA");
        softly.assertThat(firstOperation.get(OPERATION_TITLE_HEADER_5)).isEqualTo("KAPITAŁ ODSETKI 100.00 ODSETKI PRZETERMINOWANE 1.00 KWOTA RATY (KAPITAŁ + ODSETKI) 400.00 PŁATNOŚĆ CZĘŚCIOWA - WAL/PLN PLN1,604.00");
        softly.assertThat(firstOperation.get(CHF_KWOTA_ODSETKI_HEADER_6)).isEqualTo("100.00");
        softly.assertThat(firstOperation.get(CHF_KWOTA_ODSETKI_PRZETERMINOWANE_HEADER_7)).isEqualTo("1.00");
        softly.assertThat(firstOperation.get(PLN_KWOTA_HEADER_8)).isEqualTo("1604.00");
        softly.assertThat(firstOperation.get(NAZWA_PLIKU_9)).isEqualTo(fileNameWithDirectory);

        softly.assertAll();
    }
}