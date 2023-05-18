What this does
==============

    Given PDF files with Millenium Bank's CHF Credit Operations History 
    When they are copy-pasted into TXT files 
    And sanitized 
    When CreditHistoryToCsv is run 
    Then a CSV file is printed with payed values extracted from PDFs 
    And the values are all fields from PDF, including Kwota transakcji in CHF 
    And the values contain CHF odsetki, CHF odsetki przeterminowane and PLN kwota from Operation title field 

With this CSV file you can easier calculate how much you payed the bank - just import to excel / google docs, check if everything is fine and run your calculations. 

How
---

The Credit History Operation read from file `example sanitized.txt`: 

    Potwierdzenie wykonania operacji
    Data transakcji Data waluty Kwota transakcji Typ transakcji: Tytuł operacji
    2010-07-01
    2010-07-02
    300,00 CHF
    SPŁ.RATY-REGULARNA
    KAPITAŁ ODSETKI 100.00 ODSETKI PRZETERMINOWANE 1.00 KWOTA RATY (KAPITAŁ + ODSETKI) 400.00 PŁATNOŚĆ CZĘŚCIOWA - WAL/PLN PLN1604.00

becomes a CSV record:

    Data transakcji;Data waluty;Kwota transakcji;Waluta transakcji;Typ transakcji;Tytuł operacji;CHF kwota odsetki;CHF kwota odsetki przeterminowane;PLN kwota;Nazwa pliku;
    2010-07-01;2010-07-02;300,00;CHF;SPŁ.RATY-REGULARNA;KAPITAŁ ODSETKI 100.00 ODSETKI PRZETERMINOWANE 1.00 KWOTA RATY (KAPITAŁ + ODSETKI) 400.00 PŁATNOŚĆ CZĘŚCIOWA - WAL/PLN PLN1604.00;100.00;1.00;1604.00;example sanitized.txt;

For a set of Credit Operation History files from various years, with hundreds of operations each, you'll get a CSV combining all of their operations. 

Info
----

In the Credit Operations History, what you actually payed is not in **Kwota transakcji** (Transaction amount) but in **Tytul operacji** (Operation title). Credit history is the only source of the full information (even account history does not state **Odsetki przeterminowane** explicitly). Also you can download account history for only 3 years, so that does not help, but Credit History you can download for all years. 

In Zaswiadczenie o Odsetkach document, which can be downloaded also for all years, there is amount in PLN for what is in Credit Operations History under operation title "KAPITAŁ POTR.". You can merge that information manually. Otherwise it is reasonable to use Kurs Sredni NBP to calculate that value. 

How to
======

PDF
---

Log in to millenium.pl, go under your credit, and download all PDF files of Credit History (not account). They are available for the whole credit history since beginning. Save them under [/pdf](src/main/resources/pdf). 

TXT
---

Just open each PDF, select all, copy and paste into TXT file with same name and save file with `.txt` in the end. Save them under [/sanitized](src/main/resources/sanitized). 

Sanitize
--------

In a text editor (like JEdit, TextMate or Notepad), open each TXT file and remove gibberish + suit it for grammar (which is not perfectly perfect), you can use some of the rules in file [sanitize.txt](./src/main/resources/sanitize.txt). Save the files after edit back in [/sanitized](src/main/resources/sanitized). You have [examples](src/main/resources/sanitized/) there. 

Note: you have to check the TXT files as every operation can have weird discrepancies, like missing spaces or added new lines - that's what the bank delivers, don't kill the messenger. Any problems will be listed as errors (with line numbers) during running the program. 

Run
---

    ./mvnw clean compile exec:java

Or open [`CreditHistoryToCsv`](src/main/java/com/github/sikorka/millenet/credit/history/CreditHistoryToCsv.java) and run it. 

In console you will have the whole CSV. Copy and do with it what you like. 

Good luck! 

If any errors appear it does not mean CSV is bad. U should investigate manually - given your sanitized files are similar to what you see in [examples](src/main/resources/sanitized/), the errors will appear only for operations that are in new format, added by bank. You can send them to an@sikorka.eu and add them manually into your CSV.

TODO
====

Parsing Credit History PDF into TXT. 

Sanitizing TXT. 

Calculating sum of CHF spent and PLN spent. 

Parsing Zaswiadczenie o Odsetkach PDF. 

Combining the amounts from Zaswiadczenie into CSV field with Operation Title 'KAPITAŁ POTR'. 

Add Kurs Sredni NBP. 

Calculate overall PLN amount based on Kurs Sredni NBP. 

Saving to CSV file. 