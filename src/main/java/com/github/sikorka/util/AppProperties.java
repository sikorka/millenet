package com.github.sikorka.util;

import lombok.extern.log4j.Log4j;
import org.apache.commons.lang3.StringUtils;

import java.util.Properties;

/** Properties read from app.properties, merged with system properties. */
@Log4j
public class AppProperties {
    private static Properties properties;

    private static final String PROPERTIES_FILE_NAME = "app.properties";

    private static final String SCREEN_PRINTING_ON_KEY_NAME = "print.on";
    private static final String SUBFOLDER_KEY_NAME = "subfolder";

    private AppProperties() {}

    private static String getProperty(String propertyName) {
        if (properties == null) {
            readAppProperties();
            mergeSystemPropertiesWithAppProperties();
        }

        if (properties != null) {
            return properties.getProperty(propertyName);
        }

        return null;
    }

    public static boolean getScreenPrintingOn() {
        String value = getProperty(SCREEN_PRINTING_ON_KEY_NAME);

        if (StringUtils.isBlank(value)) {
            return false;
        }

        return Boolean.parseBoolean(value.toLowerCase().trim());
    }

    public static String getSubfolder() {
        String value = getProperty(SUBFOLDER_KEY_NAME);

        if (StringUtils.isBlank(value)) {
            return "";
        }

        return value;
    }

    private static void readAppProperties() {
        properties = PropertiesReader.readResourcesPropertiesFor(PROPERTIES_FILE_NAME);

        ScreenPrinter.print(properties);
    }

    private static void mergeSystemPropertiesWithAppProperties() {
        for (String key : properties.stringPropertyNames()) {
            if (System.getProperty(key) != null) {
                log.info("Merging system property '" + key + "=" + System.getProperty(key) + "' into '" + PROPERTIES_FILE_NAME + "'.");
                properties.setProperty(key, System.getProperty(key));
            }
        }

        ScreenPrinter.print(properties);
    }
}
