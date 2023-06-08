For english click [here](README_EN.md).

Co robi program
===============

Czy wiesz ile już zapłaciłeś/aś Bankowi Millenium za swój kredyt w CHF? Ten program generuje plik CSV z wszystkimi operacjami z Historii Operacji Kredytu, z kwotami za odsetki, opłaty, spłaty.

    Mając pliki PDF z Historią Operacji Kredytu CHF w Banku Millenium 
    Kiedy zapuścisz ten program
    To wygeneruje się plik CSV, zawierający wartości płatności wyekstrachowanych z PDFów
    I te wartości to wszystkie pola z PDFa, włączając w to Kwotę transakcji w CHF
    Oraz Odsetki w CHF, Odsetki przeterminowane w CHF i Kwotę PLN z pola Tytuł operacji

Mając takie dane możesz policzyć ile zapłaciłeś/aś bankowi - importujesz CSV do excela / google docs, sprawdzasz czy wszystko jest w porzadku i wykonujesz swoje obliczenia.

Operacja staje sie wierszem w pliku CSV
---------------------------------------

Operacja z Historii Kredytu CHF z pliku `Potwierdzenie wykonania operacji_20230603_123456.pdf`:

    Potwierdzenie wykonania operacji
    Data transakcji 2020-04-01
    Data waluty 2020-04-02
    Kwota transakcji 300,00 CHF
    Typ transakcji: SPŁ.RATY-REGULARNA
    Tytuł operacji KAPITAŁ ODSETKI 50.00 ODSETKI PRZETERMINOWANE 5.00 KWOTA RATY (KAPITAŁ + ODSETKI) 350.00 SPŁATA RATY KREDYTU

staje się takim wierszem w pliku CSV:

    Data transakcji,Data waluty,Kwota transakcji,Waluta transakcji,Typ transakcji,Tytuł operacji,CHF kwota odsetki,CHF kwota odsetki przeterminowane,PLN kwota kapitał + odsetki + odsetki przeterminowane,Nazwa pliku
    2020-04-01,2020-04-02,300.00,CHF,SPŁ.RATY-REGULARNA,KAPITAŁ ODSETKI 50.00 ODSETKI PRZETERMINOWANE 5.00 KWOTA RATY (KAPITAŁ + ODSETKI) 350.00 SPŁATA RATY KREDYTU,50.00,5.00,,Potwierdzenie wykonania operacji_20230603_123456.pdf.txt,

Dla zestawu plików Historii Operacji Kredytu CHF z różnych lat, z dziesiątkami operacji w każdym, otrzymasz plik CSV z wszystkimi operacjami z tych plików.


Info
----

W Historii Operacji Kredytu to co zapłaciłeś/aś nie jest w polu **Kwota transakcji** ale w polu **Tytul operacji**. Historia Operacji Kredytu jest jedynym źródłem kompletnej informacji (nawet Historia Konta nie zawiera podanej otwarcie wartości **Odsetki przeterminowane**). Dodatkowo Historię Konta można pobrać jedynie za ostatnie 3 lata, co nie pomaga, ale Historie Kredytu można pobrać za wszystkie lata.

W dokumencie Zaswiadczenie o Odsetkach, który można również ściągnąć dla wszystkich lat, jest kwota w PLN, która w Historii Kredytu jest w tytule operacji "KAPITAŁ POTR.", w kwocie w CHF. Możesz tą informację dodać manualnie lub polegać na Kursie Srednim NBP, tak jak trzeba to zrobić dla innych wartości w CHF, by policzyć tą wartość w PLN (w tej operacji są tzw. grosze). Niemniej najprawilsza ściągnięta z Twojego konta wartość, jest w Zaświadczeniu o Odsetkach. 


Jak uruchomić
=============

Po pierwsze PDFy
----------------

Zaloguj się do millenium.pl, otworz swoj kredyt w CHF i wygeneruj pliki PDF za wszystkie lata historii kredytu (nie konta - historii konta calej i tak nie mozna sciągnąć). Zapisz je pod [/pdf](src/main/resources/pdf).

Uruchom
-------

Upewnij się, że masz zainstalowaną Jave 8.

Uruchom na Macu:

    ./mvnw clean compile exec:java

Jeśli potrzebujesz więcej logów to komenda wygląda tak: 

    ./mvnw clean compile exec:java -Dprint.on=true

Uruchom na Windowsie (nie przetestowane):

    mvnw.cmd clean compile exec:java

Plik CSV bedzie zachowany jako `credit.csv`.

Powodzenia!

Jeśli pojawią się jakieś blędy, to nie znaczy od razu, że plik CSV jest niepoprawny. Błędy mogą się pojawić jeśli są dwie spacje tam gdzie nie powinny albo bank wprowadził nowy format lub nowy Tytuł operacji. Powinieneś/naś manualnie sprawdzic czy wygenerowane operacje sa takie jak powinny być. Możesz je wysłać do autorki, po to by usprawnić ten program, a w miedzy czasie sprawdź je i jeśli trzeba dodaj manualnie do CSVki. 

