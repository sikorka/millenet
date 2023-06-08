package com.github.sikorka.millenet.credit.history;

import com.github.sikorka.util.FilesAndPaths;

import java.io.File;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.github.sikorka.util.ScreenPrinter.*;

public class CreditHistorySanitizer {
    static final String ANY_CHAR = "([\\w\\sżźćńółęąśŻŹĆĄŚĘŁÓŃ.,()/+-]*)"; //TODO how to include polish chars

    static final String REGEX_FROM_0 = " "; // => ""
    static final String REGEX_TO_0 = "";
    static final String REGEX_FROM_1 = "Data wystawienia dokumentu:" + ANY_CHAR + "złotych.";
    static final String REGEX_TO_1 = "\n";
    static final String REGEX_FROM_2 = "Ul." + ANY_CHAR + "www.bankmillennium.pl" + "(\n*)";
    static final String REGEX_TO_2 = "";
    static final String REGEX_FROM_3 = "Tytuł operacji" + ANY_CHAR + "(\n\n\n)";

    static final String REGEX_FROM_4_KAPITAL_ODSETKI = "KAPITAŁ(\\s)*\\+(\\s)*ODSETKI";
    static final String REGEX_TO_4 = "KAPITAŁ + ODSETKI";
    static final String REGEX_FROM_5_STOPA = "POPRZEDNIA(\\s)*STOPA(\\s)*PROCENTOWA";
    static final String REGEX_TO_5 = "POPRZEDNIA STOPA PROCENTOWA";

    static final String REGEX_FROM_6 = "(\n\n\n)";
    static final String REGEX_TO_6 = "\n";

    public static String sanitize(String text) {
        String newText = text.replaceAll(REGEX_FROM_0, REGEX_TO_0);
        newText = newText.replaceAll(REGEX_FROM_1, REGEX_TO_1);
        newText = newText.replaceAll(REGEX_FROM_2, REGEX_TO_2);

        Pattern pattern = Pattern.compile(REGEX_FROM_3);
        Matcher matcher = pattern.matcher(newText);

        //replace line breaks with spaces inside Tytul operacji
        while (matcher.find()) {
            String stringToReplace = matcher.group(1);
            if (stringToReplace.contains("\n")) {
                String newString = stringToReplace.replaceAll("\n", " ");

                newText = newText.replace(stringToReplace, newString);
            }
        }

        newText = newText.replaceAll(REGEX_FROM_4_KAPITAL_ODSETKI, REGEX_TO_4);
        newText = newText.replaceAll(REGEX_FROM_5_STOPA, REGEX_TO_5);

        newText = newText.replaceAll(REGEX_FROM_6, REGEX_TO_6);

        return newText;
    }

    public static String sanitize(File file) throws IOException {
        String text = FilesAndPaths.readText(file);

        String newText = sanitize(text);

        printUnderlinedThinly(file.getName());
        print(newText);

        return newText;
    }
}
