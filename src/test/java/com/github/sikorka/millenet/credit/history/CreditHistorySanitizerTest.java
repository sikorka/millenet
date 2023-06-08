package com.github.sikorka.millenet.credit.history;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CreditHistorySanitizerTest {

    @Test
    void givenPdfOperationsInTxt_whenSanitized_thenTextCorrect() {
        String sanitizedText = CreditHistorySanitizer.sanitize(TEXT);

        assertThat(sanitizedText).isEqualTo(SANITIZED_TEXT);
    }

    @Test
    void givenPdfOperationTxtWithLineBreaksInTytulOperacji_whenSanitized_thenTextCorrect() {
        String sanitizedText = CreditHistorySanitizer.sanitize("Potwierdzenie wykonania operacji\n" +
                "Data transakcji 2019-01-01\n" +
                "Data waluty 2019-01-01\n" +
                "Kwota transakcji 200,00 CHF\n" +
                "Typ transakcji: SPŁ.RATY-REGULARNA\n" +
                "Tytuł operacji\n" +
                "KAPITAŁ ODSETKI 20.00 ODSETKI PRZETERMINOWANE\n" +
                "2.00 KWOTA RATY (KAPITAŁ + ODSETKI) 220.00SPŁATA\n" +
                "RATY KREDYTU\n" +
                "Data wystawienia dokumentu:   2023-05-03\n" +
                " \n" +
                "Potwierdzenie wykonania operacji zostało wygenerowane elektronicznie i nie wymaga podpisu ani stempla.\n" +
                "Dokument został sporządzony na podstawie art. 7 Ustawy Prawo Bankowe (Dz.U.Nr 140 z 1997 roku, poz. 939 z późniejszymi\n" +
                "zmianami).\n" +
                " \n" +
                " \n" +
                "Bank Millennium S.A. z siedzibą w Warszawie, ul. Stanisława Żaryna 2A, 02-593 Warszawa, wpisany pod nr KRS 0000010186 do\n" +
                "Rejestru Przedsiębiorców Krajowego Rejestru Sądowego, prowadzonego przez Sąd Rejonowy dla m.st. Warszawy, XIII Wydział\n" +
                "Gospodarczy Krajowego Rejestru Sądowego, o numerze identyfikacji podatkowej (NIP) - 526-021-29-31 i kapitale zakładowym\n" +
                "całkowicie wpłaconym w wysokości 1.213.116.777,00 złotych.\n");

        assertThat(sanitizedText).isEqualTo("Potwierdzenie wykonania operacji\n" +
                "Data transakcji 2019-01-01\n" +
                "Data waluty 2019-01-01\n" +
                "Kwota transakcji 200,00 CHF\n" +
                "Typ transakcji: SPŁ.RATY-REGULARNA\n" +
                "Tytuł operacji KAPITAŁ ODSETKI 20.00 ODSETKI PRZETERMINOWANE 2.00 KWOTA RATY (KAPITAŁ + ODSETKI) 220.00SPŁATA RATY KREDYTU\n");
    }

    @Test
    void givenPdfOperationTxtWithLineBreaksInTytulOperacjiAndPlus_whenSanitized_thenTextCorrect() {
        String sanitizedText = CreditHistorySanitizer.sanitize("Potwierdzenie wykonania operacji\n" +
                "Data transakcji 2007-08-01\n" +
                "Data waluty 2007-08-01\n" +
                "Kwota transakcji 150,00 CHF\n" +
                "Typ transakcji: SPŁ.RATY-REGULARNA\n" +
                "Tytuł operacji\n" +
                "KAPITAŁ ODSETKI 200.00 KWOTA RATY (KAPITAŁ +\n" +
                "ODSETKI) 350.00 PŁATNOŚĆ CZĘŚCIOWA - WAL/PLN\n" +
                "PLN1050.00\n" +
                "\n" +
                "\n");

        assertThat(sanitizedText).isEqualTo("Potwierdzenie wykonania operacji\n" +
                "Data transakcji 2007-08-01\n" +
                "Data waluty 2007-08-01\n" +
                "Kwota transakcji 150,00 CHF\n" +
                "Typ transakcji: SPŁ.RATY-REGULARNA\n" +
                "Tytuł operacji KAPITAŁ ODSETKI 200.00 KWOTA RATY (KAPITAŁ + ODSETKI) 350.00 PŁATNOŚĆ CZĘŚCIOWA - WAL/PLN PLN1050.00\n");
    }

    public static final String TEXT = "Ul. Stanisława Żaryna 2A\n" +
            "02-593 Warszawa\n" +
            "www.bankmillennium.pl\n" +
            "Potwierdzenie wykonania operacji\n" +
            "Data transakcji 2006-07-01\n" +
            "Data waluty 2006-07-01\n" +
            "Kwota transakcji 0,00 CHF\n" +
            "Typ transakcji: SP.RATY-NIEPLANOWANA\n" +
            "Tytuł operacji OPŁATA 1 1111.00 PROWIZJA ZA KREDYT\n" +
            "Data wystawienia dokumentu:   2023-05-03\n" +
            " \n" +
            "Potwierdzenie wykonania operacji zostało wygenerowane elektronicznie i nie wymaga podpisu ani stempla.\n" +
            "Dokument został sporządzony na podstawie art. 7 Ustawy Prawo Bankowe (Dz.U.Nr 140 z 1997 roku, poz. 939 z późniejszymi\n" +
            "zmianami).\n" +
            " \n" +
            " \n" +
            "Bank Millennium S.A. z siedzibą w Warszawie, ul. Stanisława Żaryna 2A, 02-593 Warszawa, wpisany pod nr KRS 0000010186 do\n" +
            "Rejestru Przedsiębiorców Krajowego Rejestru Sądowego, prowadzonego przez Sąd Rejonowy dla m.st. Warszawy, XIII Wydział\n" +
            "Gospodarczy Krajowego Rejestru Sądowego, o numerze identyfikacji podatkowej (NIP) - 526-021-29-31 i kapitale zakładowym\n" +
            "całkowicie wpłaconym w wysokości 1.213.116.777,00 złotych.\n" +
            "Ul. Stanisława Żaryna 2A\n" +
            "02-593 Warszawa\n" +
            "www.bankmillennium.pl\n" +
            "Potwierdzenie wykonania operacji\n" +
            "Data transakcji 2006-07-01\n" +
            "Data waluty 2006-07-01\n" +
            "Kwota transakcji 1111,00 CHF\n" +
            "Typ transakcji: NALICZENIE OPŁAT\n" +
            "Tytuł operacji KWOTA OPŁATY TYP OPŁATY 8 URUCHOMIENIE\n" +
            "Data wystawienia dokumentu:   2023-05-03\n" +
            " \n" +
            "Potwierdzenie wykonania operacji zostało wygenerowane elektronicznie i nie wymaga podpisu ani stempla.\n" +
            "Dokument został sporządzony na podstawie art. 7 Ustawy Prawo Bankowe (Dz.U.Nr 140 z 1997 roku, poz. 939 z późniejszymi\n" +
            "zmianami).\n" +
            " \n" +
            " \n" +
            "Bank Millennium S.A. z siedzibą w Warszawie, ul. Stanisława Żaryna 2A, 02-593 Warszawa, wpisany pod nr KRS 0000010186 do\n" +
            "Rejestru Przedsiębiorców Krajowego Rejestru Sądowego, prowadzonego przez Sąd Rejonowy dla m.st. Warszawy, XIII Wydział\n" +
            "Gospodarczy Krajowego Rejestru Sądowego, o numerze identyfikacji podatkowej (NIP) - 526-021-29-31 i kapitale zakładowym\n" +
            "całkowicie wpłaconym w wysokości 1.213.116.777,00 złotych.\n" +
            "Ul. Stanisława Żaryna 2A\n" +
            "02-593 Warszawa\n" +
            "www.bankmillennium.pl\n" +
            "Potwierdzenie wykonania operacji\n" +
            "Data transakcji 2006-07-01\n" +
            "Data waluty 2006-07-01\n" +
            "Kwota transakcji 50000.00 CHF\n" +
            "Typ transakcji: WYPŁATA KREDYTU\n" +
            "Tytuł operacji\n" +
            "KAPITAŁ KWOTA WYPŁATY 50000.00 TYP RACHUNKU 20\n" +
            "NUMER RACHUNKU DO WYPŁATY\n" +
            "12345678URUCHOMIENIE\n" +
            "Data wystawienia dokumentu:   2023-05-03\n" +
            " \n" +
            "Potwierdzenie wykonania operacji zostało wygenerowane elektronicznie i nie wymaga podpisu ani stempla.\n" +
            "Dokument został sporządzony na podstawie art. 7 Ustawy Prawo Bankowe (Dz.U.Nr 140 z 1997 roku, poz. 939 z późniejszymi\n" +
            "zmianami).\n" +
            " \n" +
            " \n" +
            "Bank Millennium S.A. z siedzibą w Warszawie, ul. Stanisława Żaryna 2A, 02-593 Warszawa, wpisany pod nr KRS 0000010186 do\n" +
            "Rejestru Przedsiębiorców Krajowego Rejestru Sądowego, prowadzonego przez Sąd Rejonowy dla m.st. Warszawy, XIII Wydział\n" +
            "Gospodarczy Krajowego Rejestru Sądowego, o numerze identyfikacji podatkowej (NIP) - 526-021-29-31 i kapitale zakładowym\n" +
            "całkowicie wpłaconym w wysokości 1.213.116.777,00 złotych.\n";

    public static final String SANITIZED_TEXT =
            "Potwierdzenie wykonania operacji\n" +
                    "Data transakcji 2006-07-01\n" +
                    "Data waluty 2006-07-01\n" +
                    "Kwota transakcji 0,00 CHF\n" +
                    "Typ transakcji: SP.RATY-NIEPLANOWANA\n" +
                    "Tytuł operacji OPŁATA 1 1111.00 PROWIZJA ZA KREDYT\n" +
                    "Potwierdzenie wykonania operacji\n" +
                    "Data transakcji 2006-07-01\n" +
                    "Data waluty 2006-07-01\n" +
                    "Kwota transakcji 1111,00 CHF\n" +
                    "Typ transakcji: NALICZENIE OPŁAT\n" +
                    "Tytuł operacji KWOTA OPŁATY TYP OPŁATY 8 URUCHOMIENIE\n" +
                    "Potwierdzenie wykonania operacji\n" +
                    "Data transakcji 2006-07-01\n" +
                    "Data waluty 2006-07-01\n" +
                    "Kwota transakcji 50000.00 CHF\n" +
                    "Typ transakcji: WYPŁATA KREDYTU\n" +
                    "Tytuł operacji KAPITAŁ KWOTA WYPŁATY 50000.00 TYP RACHUNKU 20 NUMER RACHUNKU DO WYPŁATY 12345678URUCHOMIENIE\n";
}