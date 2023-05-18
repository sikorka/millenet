package com.github.sikorka.millenet.credit.history;

import com.github.sikorka.util.CsvHelper;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CreditOperation {

    public static final String TRANSACTION_DATE_HEADER_0 = "Data transakcji";
    public static final String CURRENCY_DATE_HEADER_1 = "Data waluty";
    public static final String CURRENCY_AMOUNT_HEADER_2 = "Kwota transakcji";
    public static final String CURRENCY_HEADER_3 = "Waluta transakcji";
    public static final String TRANSACTION_TYPE_HEADER_4 = "Typ transakcji";
    public static final String OPERATION_TITLE_HEADER_5 = "Tytuł operacji";
    public static final String CHF_KWOTA_ODSETKI_HEADER_6 = "CHF kwota odsetki";
    public static final String CHF_KWOTA_ODSETKI_PRZETERMINOWANE_HEADER_7 = "CHF kwota odsetki przeterminowane";
    public static final String PLN_KWOTA_HEADER_8 = "PLN kwota";
    public static final String NAZWA_PLIKU_9 = "Nazwa pliku";

    public static final String[] COLUMN_NAMES = {TRANSACTION_DATE_HEADER_0, CURRENCY_DATE_HEADER_1, CURRENCY_AMOUNT_HEADER_2,
            CURRENCY_HEADER_3, TRANSACTION_TYPE_HEADER_4, OPERATION_TITLE_HEADER_5, CHF_KWOTA_ODSETKI_HEADER_6,
            CHF_KWOTA_ODSETKI_PRZETERMINOWANE_HEADER_7, PLN_KWOTA_HEADER_8, NAZWA_PLIKU_9};

    public static final String CSV_HEADER = CsvHelper.toCsvRow(COLUMN_NAMES);

    String transactionDate;
    String currencyDate;
    String currencyAmount; //this is kapitał
    String currency; //always CHF
    String transactionType;
    String operationTitle;

    //this whole shabang is for these three:
    String chfKwotaOdsetki = "";
    String chfKwotaOdsetkiPrzeterminowane = "";
    String plnKwota = "";

    public String toCsvRow() {
        return CsvHelper.toCsvRow(transactionDate, currencyDate, currencyAmount, currency, transactionType,
                operationTitle, chfKwotaOdsetki, chfKwotaOdsetkiPrzeterminowane, plnKwota);
    }

    @Override
    public String toString() {
        return toCsvRow();
    }
}
