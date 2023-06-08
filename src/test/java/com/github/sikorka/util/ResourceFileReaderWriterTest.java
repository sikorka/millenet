package com.github.sikorka.util;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;

import static com.github.sikorka.util.FilesAndPaths.*;
import static com.github.sikorka.util.ResourceFileReaderWriter.*;
import static org.assertj.core.api.Assertions.assertThat;

class ResourceFileReaderWriterTest {

    @Test
    void givenDirectoryNotExisting_whenGetFileFromDirectoryUnderResourcesExecuted_thenNullReturned() {
        File file;

        when:
        file = getFileUnderResources("file.txt", "not_existing_directory_1234");

        then:
        assertThat(file).isNull();
    }

    @Test
    void givenDirectoryNotExisting_whenGetFilesFromDirectoryUnderResourcesExecuted_thenNullReturned() {
        File[] files;

        when:
        files = getFilesUnderResourcesDirectory("not_existing_directory_" + System.currentTimeMillis());

        then:
        assertThat(files).isNull();
    }

    @Test
    void givenDirectoryExists_whenGetFileFromDirectoryUnderResourcesExecuted_thenReturned() {
        File file;

        when:
        file = getFileUnderResources("sample.pdf", "existingDirectory");

        then:
        assertThat(file).isNotNull();
        assertThat(file.getName()).isEqualTo("sample.pdf");
    }

    @Test
    void givenDirectoryExists_whenGetFilesFromDirectoryUnderResourcesExecuted_thenReturned() {
        File[] files;

        when:
        files = getFilesUnderResourcesDirectory("existingDirectory");

        then:
        assertThat(files).isNotNull();
        assertThat(getFileNames(files)).contains("sample.pdf");
    }

    @Test
    void givenExistingDirectoryWithDirSeparatorInFront_whenGetFileFromDirectoryUnderResourcesExecuted_thenFileReturned() {
        File file;

        when:
        file = getFileUnderResources("sample.pdf", File.separator + "existingDirectory");

        then:
        assertThat(file).isNotNull();
        assertThat(file.getName()).isEqualTo("sample.pdf");
    }

    @Test
    void givenExistingDirectoryWithDirSeparatorInFront_whenGetFilesFromDirectoryUnderResourcesExecuted_thenFilesReturned() {
        File[] files;

        when:
        files = getFilesUnderResourcesDirectory(File.separator + "existingDirectory");

        then:
        assertThat(files).isNotNull();
        assertThat(getFileNames(files)).contains("sample.pdf");
    }

    @Test
    void givenExistingDirectoryWithDoubleDirSeparatorInFront_whenGetFileFromDirectoryUnderResourcesExecuted_thenFound() {
        File file;

        when:
        file = getFileUnderResources("sample.pdf", File.separator + File.separator + "existingDirectory");

        then:
        assertThat(file).isNotNull();
        assertThat(file.getPath()).endsWith(Paths.get("existingDirectory", "sample.pdf").toString());
    }

    @Test
    void givenExistingDirectoryWithDoubleDirSeparatorInFront_whenGetFilesFromDirectoryUnderResourcesExecuted_thenNotNull() {
        File[] files;

        when:
        files = getFilesUnderResourcesDirectory(File.separator + File.separator + "existingDirectory");

        then:
        assertThat(files).isNotNull();
        assertThat(files[0].getPath()).contains(Paths.get("existingDirectory", files[0].getName()).toString());
    }
}
