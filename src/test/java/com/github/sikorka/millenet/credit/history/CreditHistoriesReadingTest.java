package com.github.sikorka.millenet.credit.history;

import com.github.sikorka.util.FilesAndPaths;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class CreditHistoriesReadingTest {
    String directoryUnderResources = Paths.get(FilesAndPaths.SANITIZED_DIR_NAME).toString();

    @Test
    public void whenCreditHistoryTxtRead_thenCorrectOperation() throws IOException {
        Credit credit;

        when:
        credit = CreditHistoryParserReader.getCreditHistories(directoryUnderResources);
        System.out.println(credit.toCsv());

        then:
        assertThat(credit).isNotNull();
        assertThat(credit.getCreditHistories()).isNotNull();
        assertThat(credit.getCreditHistories()).hasSize(4);

        List<CreditOperation> allOperations = credit.getCreditHistories().stream()
                .flatMap(creditHistory -> creditHistory.getOperations().stream())
                .collect(Collectors.toList());
        assertThat(allOperations).hasSize(22);
        assertThat(allOperations.stream()
                .filter(CreditOperation::isWyplataKredytu)
                .collect(Collectors.toList())).hasSize(3);
    }
}
