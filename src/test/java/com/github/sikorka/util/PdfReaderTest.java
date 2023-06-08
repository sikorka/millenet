package com.github.sikorka.util;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

class PdfReaderTest {

    @Test
    void whenSinglePdfRead_thenTextCorrect() throws IOException {
        File pdfFile;
        String pdfText;

        given:
        pdfFile = ResourceFileReaderWriter.getFileUnderResources("sample.pdf", FilesAndPaths.PDF_DIR_NAME);

        when:
        pdfText = PdfReader.readPdf(pdfFile);

        then:
        assertThat(pdfText).isEqualTo("Some\n" +
                "One\n" +
                "Location: Somewhere in the clouds, Earth\n" +
                "some@one.cloud\n" +
                "");
    }
}
