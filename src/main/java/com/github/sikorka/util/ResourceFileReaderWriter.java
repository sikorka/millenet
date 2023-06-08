package com.github.sikorka.util;

import lombok.experimental.UtilityClass;
import lombok.extern.log4j.Log4j;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Path;

import static com.github.sikorka.util.FilesAndPaths.*;

/**
 * Utility for reading resource files.
 * */
@Log4j
@UtilityClass
public final class ResourceFileReaderWriter {

    public static String getPathToResources() {
        return ResourceFileReaderWriter.class.getResource(File.separator).getPath();
    }

    /**
     * Will read a file that was placed in nearest /resources module, which later is placed in classpath.
     *
     * @param fileName a relative to /resources file name, for example "log4j.properties", also /resources is relative to where class calling this method is placed
     * */
    public static InputStream getInputStreamFromResources(String fileName) {
        log.info("Reading '" + fileName + "'...");

        if (StringUtils.isBlank(fileName)) {
            log.warn("🟡️ File name is empty.");

            return null;
        }

        InputStream inputStream = ResourceFileReaderWriter.class.getClassLoader().getResourceAsStream(fileName);

        if (inputStream == null) {
            log.error("🔴 Couldn't read '" + fileName + "'!");
        } else {
            log.info("🟢 Done reading '" + fileName + "'.");
        }

        return inputStream;
    }

    /**
     * Get path to directory or file under resources.
     *
     * @param path path to file or directory
     * @return path, or null if directory of file does not exist
     * */
    public static String getDirectoryUnderResources(String path) {
        if (path == null || StringUtils.isBlank(path)) {
            return null;
        }

        if (!path.startsWith(File.separator)) {
            path = File.separator + path;
        }

        URL url = ResourceFileReaderWriter.class.getResource(path);

        if (url != null) {
            return url.getPath();
        }

        return null;
    }

    /**
     * Gets URL for existing dir under resources.
     *
     * @param directoryNames list of directory names from parent to child
     * @return URL for an existing directory under resources or null if not existing or not proper directory
     * */
    public static String getDirectoryUnderResources(String... directoryNames) {
        return getDirectoryUnderResources(buildDirectoryPath(directoryNames));
    }

    private static File getFileUnderResources(String path) {
        return getFile(getDirectoryUnderResources(path));
    }

    public static File getFileUnderResources(String fileName, String directoryPath) {
        String path = buildPath(fileName, directoryPath);

        return getFileUnderResources(path);
    }

    private static File[] getFilesUnderResourcesDirectory(String directoryPath) {
        String pathUnderResources = getDirectoryUnderResources(buildPath(directoryPath));

        if (pathUnderResources == null) {
            log.error("🔴 Directory name '" + directoryPath + "' does not exist or no files under it!");

            return null;
        }

        return getFile(pathUnderResources).listFiles();
    }

    public static File[] getFilesUnderResourcesDirectory(String... directoryNames) {
        return getFilesUnderResourcesDirectory(buildDirectoryPath(directoryNames));
    }

    public static Path writeToFileUnderResources(String fileContents, String fileName, String... directoryNames) throws IOException {
        String pathToDirectory = buildPath(buildDirectoryPath(directoryNames), getPathToResources());

        return writeToFile(fileContents, fileName, pathToDirectory);
    }
}
