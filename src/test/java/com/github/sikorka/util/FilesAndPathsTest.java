package com.github.sikorka.util;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static com.github.sikorka.util.ResourceFileReaderWriter.getFileUnderResources;
import static com.github.sikorka.util.ResourceFileReaderWriter.getDirectoryUnderResources;
import static org.assertj.core.api.Assertions.assertThat;

class FilesAndPathsTest {

    @Test
    void givenString_whenWriteNewFileIntoDirectoryUnderResources_thenWritten() throws IOException {
        File file;

        //given
        long currentTimeMillis = System.currentTimeMillis();

        String stringToWriteToFile = "One\nTwo" + currentTimeMillis;
        String fileName = "some" + currentTimeMillis + ".txt";
        String directoryNameUnderResources = "existingDirectory";

        String directoryURLUnderResources = getDirectoryUnderResources(directoryNameUnderResources);

        file = getFileUnderResources(fileName, directoryNameUnderResources);
        assertThat(file).isNull();

        //when
        FilesAndPaths.writeToFile(stringToWriteToFile, fileName, directoryURLUnderResources);

        //then
        file = getFileUnderResources(fileName, directoryNameUnderResources);
        assertThat(file).isNotNull();
        assertThat(file.exists()).isTrue();

        //when
        List<String> contents = Files.readAllLines(Paths.get(directoryURLUnderResources, fileName));
        //then
        assertThat(contents.get(0)).isEqualTo("One");
        assertThat(contents.get(1)).isEqualTo("Two" + currentTimeMillis);
    }
}