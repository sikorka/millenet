Chcesz poczytać po polsku? Kliknij [tutaj](README.md).

What this does
==============

Have you ever wondered how many CHF / PLN you have already payed the Millenium bank for your CHF credit? This program helps with answer. It works like so: 

    Given PDF files with Millenium Bank's CHF Credit Operations History
    When this program is run 
    Then a CSV file is saved, containing payment values extracted from PDFs 
    And the values are all fields from PDF, including Kwota transakcji in CHF 
    And the values contain CHF odsetki, CHF odsetki przeterminowane and PLN kwota from Tytuł operacji field 

With the produced CSV file you can easier calculate how much you payed the bank - just import to excel / google docs, check if everything is fine and run your calculations. 


Operation > CSV row
-------------------

The Credit History Operation read from PDF file `Potwierdzenie wykonania operacji_20230603_123456.pdf`: 

    Potwierdzenie wykonania operacji
    Data transakcji 2020-04-01
    Data waluty 2020-04-02
    Kwota transakcji 300,00 CHF
    Typ transakcji: SPŁ.RATY-REGULARNA
    Tytuł operacji KAPITAŁ ODSETKI 50.00 ODSETKI PRZETERMINOWANE 5.00 KWOTA RATY (KAPITAŁ + ODSETKI) 350.00 SPŁATA RATY KREDYTU

becomes a CSV record:

    Data transakcji,Data waluty,Kwota transakcji,Waluta transakcji,Typ transakcji,Tytuł operacji,CHF kwota odsetki,CHF kwota odsetki przeterminowane,PLN kwota kapitał + odsetki + odsetki przeterminowane,Nazwa pliku
    2020-04-01,2020-04-02,300.00,CHF,SPŁ.RATY-REGULARNA,KAPITAŁ ODSETKI 50.00 ODSETKI PRZETERMINOWANE 5.00 KWOTA RATY (KAPITAŁ + ODSETKI) 350.00 SPŁATA RATY KREDYTU,50.00,5.00,,Potwierdzenie wykonania operacji_20230603_123456.pdf.txt,

For a set of Credit Operation History files from various years, with tens of operations each, you'll get a CSV combining all of their operations. 

Info
----

In the Credit Operations History, what you actually payed is not in **Kwota transakcji** (Transaction amount) but in **Tytul operacji** (Operation title). Credit history is the only source of the full information (even account history does not state **Odsetki przeterminowane** explicitly). Also you can download account history for only 3 years, so that does not help, but Credit History you can download for all years. 

In Zaswiadczenie o Odsetkach document, which can be downloaded also for all years, there is amount in PLN for what is in Credit Operations History under operation title "KAPITAŁ POTR.". You can merge that information manually. Otherwise it is reasonable to use Kurs Sredni NBP to calculate that value. 


How to
======

PDF
---

Log in to millenium.pl, go under your credit, and download all PDF files of Credit History (not account). They are available for the whole credit history since beginning. Save them under [/pdf](src/main/resources/pdf). 

Run
---

First make sure you have Java 8 installed. 

Run on Mac: 

    ./mvnw clean compile exec:java

If you need more logs, run: 

    ./mvnw clean compile exec:java -Dprint.on=true

Run on Windows (not tested): 

    mvnw.cmd clean compile exec:java

CSV will be saved as `credit.csv`. Copy and do with it what you like. 

Good luck! 

If any errors appear, it does not mean CSV is bad. U should investigate manually, the grammar errors will appear if there are 2 spaces where they're not expected or for operations that are in new format, added by bank. You can send them to the author, so this program can be improved, and in the meantime add them manually into your CSV.


TODO
====

Jar it, test it. 

Add calculated, additional columns: 'payed in CHF', 'payed in PLN'.

Calculating sum of CHF spent and PLN spent. 

Parsing Zaswiadczenie o Odsetkach PDF. 

Combining the amounts from Zaswiadczenie into CSV field with Operation Title 'KAPITAŁ POTR'. 

Add Kurs Sredni NBP. 

Add calculated, additional column: 'payed in CHF converted to PLN based on NBP CHF/PLN rate`.

Calculate overall PLN amount based on Kurs Sredni NBP. 

🔄 Make spaces optional in grammar. 

☑️ Parsing Credit History PDF into TXT.

☑️ Sanitizing TXT.

☑️ Saving to CSV file. 
