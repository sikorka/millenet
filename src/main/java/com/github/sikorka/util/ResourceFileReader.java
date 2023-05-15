package com.github.sikorka.util;

import lombok.experimental.UtilityClass;
import lombok.extern.log4j.Log4j;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;

/**
 * Utility for reading resource files.
 * */
@Log4j
@UtilityClass
public final class ResourceFileReader {

    /**
     * Will read a file that was placed in nearest /resources module, which later is placed in classpath.
     *
     * @param fileName a relative to /resources file name, for example "log4j.properties", also /resources is relative to where class calling this method is placed
     * */
    public static InputStream getInputStreamFromResources(String fileName) {
        log.info("Reading '" + fileName + "'...");

        if (StringUtils.isBlank(fileName)) {
            log.info("🟡️ File name is empty.");

            return null;
        }

        InputStream inputStream = ResourceFileReader.class.getClassLoader().getResourceAsStream(fileName);

        if (inputStream == null) {
            log.error("🔴 Couldn't read '" + fileName + "'!");
        } else {
            log.info("🟢 Done reading '" + fileName + "'.");
        }

        return inputStream;
    }

    public static File[] getFilesFromDirectoryUnderResources(String directoryName) throws URISyntaxException {
        URL url = ResourceFileReader.class.getResource(directoryName);

        if (url == null) {
            log.error("🔴 Directory name '" + directoryName + "' does not exist or no files under it!");

            return null;
        }

        return new File(url.toURI()).listFiles();
    }
}
