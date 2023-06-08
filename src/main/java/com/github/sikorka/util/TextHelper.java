package com.github.sikorka.util;

import lombok.experimental.UtilityClass;
import org.apache.commons.lang3.StringUtils;

@UtilityClass
public class TextHelper {

    public static final String NEWLINE = System.lineSeparator();

    public static final String THICK_LINE_DIVIDER = StringUtils.repeat('=', 121);
    public static final String THIN_LINE_DIVIDER = thinLineDivider(30);

    public static String thinLineDivider(int howLong) {
        if (howLong <= 0) {
            howLong = 30;
        }

        return StringUtils.repeat('-', howLong);
    }
}
