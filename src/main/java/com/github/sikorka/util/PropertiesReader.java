package com.github.sikorka.util;

import lombok.experimental.UtilityClass;
import lombok.extern.log4j.Log4j;

import java.io.InputStream;
import java.util.Properties;
import org.apache.commons.lang3.StringUtils;

/** Utility for reading .properties files. */
@Log4j
@UtilityClass
public final class PropertiesReader {

    /**
     * Returns Properties object, given .properties file in classpath.
     *
     * @param fileName containing list of x=y properties
     * @return empty or loaded Properties object (but never null)
     * */
    public static Properties readResourcesPropertiesFor(String fileName) {
        Properties properties = new Properties();

        if (StringUtils.isBlank(fileName)) {
            log.warn("🟡 File name is blank.");

            return properties;
        }

        InputStream inputStream = ResourceFileReaderWriter.getInputStreamFromResources(fileName);
        try {
            properties.load(inputStream);
        } catch (Exception e) {
            log.error("🔴 Couldn't read file '" + fileName + "'.");
        }

        return properties;
    }
}
