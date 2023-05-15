package com.github.sikorka.millenet.credit.history;

import lombok.Getter;
import lombok.Setter;

import static com.github.sikorka.util.TextHelper.*;

@Getter @Setter
public class CreditOperation {
    public static final String HEADER = "Data transakcji;Data waluty;Kwota transakcji;Waluta transakcji;Data transakcji;Typ transakcji;Tytuł operacji;CHF kwota odsetki;CHF kwota odsetki przeterminowane;PLN kwota;";

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


    public String toCsv() {
        return transactionDate + CSV_SEPARATOR +
                currencyDate + CSV_SEPARATOR +
                currencyAmount + CSV_SEPARATOR +
                currency + CSV_SEPARATOR +
                transactionDate + CSV_SEPARATOR +
                transactionType + CSV_SEPARATOR +
                operationTitle + CSV_SEPARATOR +
                chfKwotaOdsetki + CSV_SEPARATOR +
                chfKwotaOdsetkiPrzeterminowane + CSV_SEPARATOR +
                plnKwota + CSV_SEPARATOR;
    }

    @Override
    public String toString() {
        return toCsv();
    }
}
