package com.github.sikorka.util;

import lombok.experimental.UtilityClass;
import lombok.extern.log4j.Log4j;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@UtilityClass
@Log4j
public class FilesAndPaths {

    public static final String SANITIZED_DIR_NAME = "sanitized";
    public static final String TXT_DIR_NAME = "txt";
    public static final String PDF_DIR_NAME = "pdf";

    /**
     * Returns directory string proper for system where it is run preceded with File.separator.
     *
     * @param directoriesNames list of directories, for example "all", "pdf"
     * @return proper directory string for this system, for above example "/all/pdf" on Mac (notice the preceding "/")
     * */
    public static String buildDirectoryPath(String... directoriesNames) {
        if (directoriesNames == null || directoriesNames.length <= 0) {
            return File.separator;
        }

        if (!directoriesNames[0].startsWith(File.separator)) {
            directoriesNames[0] = File.separator + directoriesNames[0];
        }

        if (directoriesNames.length == 1) {
            return directoriesNames[0];
        }

        return Paths.get("", directoriesNames).toString(); //String.join(File.separator, directoriesNames);
    }

    /** Builds a path. Does not check if resource exists. Adds preceding File.separator. */
    public static String buildPath(String lastFileOrFolderName, String... directoryNames) {
        return Paths.get(buildDirectoryPath(directoryNames), lastFileOrFolderName).toString();
    }

    public static File getFile(String absolutePathToFileOrDirectory) {
        if (absolutePathToFileOrDirectory == null) {
            return null;
        }

        return new File(absolutePathToFileOrDirectory);
    }

    public static File[] getFiles(String absoluteDirectoryPath) {
        absoluteDirectoryPath = buildPath(absoluteDirectoryPath);

        File handle = getFile(absoluteDirectoryPath);

        if (handle != null) {
            return handle.listFiles();
        }

        return null;
    }

    /** Creates the necessary directory and file if it does not exist. */
    public static Path writeToFile(String fileContents, String fileName, String directoryPath) throws IOException {
        String pathToFile = buildPath(fileName, directoryPath);

        File theDirectory = new File(directoryPath);

        if (theDirectory.isFile()) {
            theDirectory.delete();
        }

        if (!theDirectory.exists()) {
            theDirectory.mkdirs();
        }

        byte[] fileContentsAsBytes = fileContents.getBytes();

        return Files.write(Paths.get(pathToFile), fileContentsAsBytes, StandardOpenOption.CREATE);
    }

    public static String readText(File txtFile) throws IOException {
        Stream<String> stream = Files.lines(txtFile.toPath());
        String contents = stream.collect(Collectors.joining("\n"));
        stream.close();

        return contents;
    }

    public static List<String> getFileNames(File[] files) {
        return Arrays.stream(files).map(File::getName).collect(Collectors.toList());
    }

    public static List<File> filterPdfs(File[] pdfDirectoryFiles) {
        return filterFiles(pdfDirectoryFiles, ".pdf");
    }

    public static List<File> filterFiles(File[] pdfDirectoryFiles, String filterString) {
        if (pdfDirectoryFiles != null) {
            return Arrays.stream(pdfDirectoryFiles).filter(pdfFile -> pdfFile.getName().endsWith(filterString)).collect(Collectors.toList());
        }

        return null;
    }

    public static InputStream getInputStream(File file) throws IOException {
        if (file == null) {
            return null;
        }

        log.info("Reading '" + file.getName() + "'...");

        InputStream inputStream = Files.newInputStream(file.toPath());

        log.info("🟢 Done reading '" + file.getName() + "'.");

        return inputStream;
    }
}
