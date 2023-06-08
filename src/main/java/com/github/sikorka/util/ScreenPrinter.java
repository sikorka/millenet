package com.github.sikorka.util;

import lombok.experimental.UtilityClass;
import lombok.extern.log4j.Log4j;

import java.util.Properties;

import static com.github.sikorka.util.AppProperties.*;
import static com.github.sikorka.util.TextHelper.thinLineDivider;

/** Prints to screen. */
@Log4j
@UtilityClass
public class ScreenPrinter {

    public static void print(String toPrint) {
        if (getScreenPrintingOn()) {
            printAlways(toPrint);
        }
    }

    public static void printAlways(String toPrint) {
        System.out.println(toPrint);
    }

    public static void print(Properties properties) {
        if (properties == null || properties.isEmpty()) {
            log.warn("🟡 Properties are empty.");

            return;
        }

        print("Properties:");

        for (String key : properties.stringPropertyNames()) {
            print(key + "=" + properties.get(key));
        }
    }

    public static void printUnderlinedThinly(String name) {
        if (name != null) {
            print(name + "\n" + thinLineDivider(name.length()));
        }
    }
}
