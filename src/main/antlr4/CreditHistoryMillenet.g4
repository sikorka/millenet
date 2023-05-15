grammar CreditHistoryMillenet;

/** See example input files in /resources/sanitized/. */

credit : (operation)+ EOF;

operation :
    operationStart NEWLINE
    headingRow NEWLINE
    transactionDate NEWLINE
    currencyDate NEWLINE
    currencyAmount SPACE currency NEWLINE
    transactionType NEWLINE
    operationTitle NEWLINE
    NEWLINE*;

operationStart : Potwierdzenie_wykonania_operacji;
headingRow : Header;
transactionDate : DATE;
currencyDate : DATE;
currencyAmount : AMOUNT;
currency : CHF | PLN;
transactionType :
                    Wyplata_kredytu |
                    Naliczenie_oplat |
                    Sp_raty_nieplanowana |
                    Spl_raty_regularna |
                    Dodatkowa_wy_kredytu |
                    Zmiana_stopy_proc |
                    Sp_raty_nieregularna
                    ;

operationTitle :
    stopa |
    wyplata |
    oplata |
    kapital_potr |

    splata_pln |
    splata_chf
    ;

stopa : nowa_stopa poprzednia_stopa;
nowa_stopa :       'NOWA STOPA PROCENTOWA ' STOPA_NUMBER;
poprzednia_stopa : ' POPRZEDNIA STOPA PROCENTOWA ' STOPA_NUMBER;

wyplata :
            WYPLATA_URUCHOMIENIE |
            WYPLATA_TRANSZA |
            WYPLATA
            ;

WYPLATA:             'KAPITAŁ KWOTA WYPŁATY ' KWOTA ' TYP RACHUNKU ' DIGIT+ ' NUMER RACHUNKU DO WYPŁATY ' DIGIT+;
WYPLATA_URUCHOMIENIE: WYPLATA ' URUCHOMIENIE';
WYPLATA_TRANSZA:      WYPLATA ' TRANSZA';

oplata :
        OPLATA_PROWIZJA |
        OPLATA_URUCHOMIENIE;

OPLATA_PROWIZJA :     'OPŁATA 1 ' KWOTA ' PROWIZJA ZA KREDYT';
OPLATA_URUCHOMIENIE : 'KWOTA OPŁATY TYP OPŁATY ' DIGIT ' URUCHOMIENIE';

kapital_potr : Kapital_space 'POTR.' THREEDIGIT THREE_CAPITAL_LETTERS SIXDIGIT 'z' EIGHTDIGIT;


//SPLATA PLN

splata_pln :
       pln_odsetki |
       pln_kapital_odsetki |
       pln_kapital_odsetki_przeterminowane |
       pln_kapital_odsetki_odsetki_przeterminowane |
       pln_kapital
       ;

pln_odsetki :                                               chf_odsetki_block                                                                                 SPACE pln_platnosc_czesciowa_block;
pln_kapital_odsetki_przeterminowane :         Kapital_space                         chf_odsetki_przeterminowane_block                                         SPACE pln_platnosc_czesciowa_block;
pln_kapital_odsetki :                         Kapital_space chf_odsetki_block                                         Space_kwota_raty_kapital_odsetki_space KWOTA SPACE pln_platnosc_czesciowa_block;
pln_kapital_odsetki_odsetki_przeterminowane : Kapital_space chf_odsetki_block SPACE chf_odsetki_przeterminowane_block Space_kwota_raty_kapital_odsetki_space KWOTA SPACE pln_platnosc_czesciowa_block;
pln_kapital :
    pln_kapital_platnosc_czesciowa |
    pln_kapital_spl_dysp |
    pln_kapital_dysp
    ;

pln_kapital_platnosc_czesciowa : Kapital_space pln_platnosc_czesciowa_block;
pln_kapital_spl_dysp :           Kapital_spl_dysp_x IDENTIFIER SPACE PLN SPACE? pln_kwota;
pln_kapital_dysp :               Kapital_dysp_ddn_x IDENTIFIER SPACE PLN SPACE pln_kwota;

pln_platnosc_czesciowa_block : Platnosc_czesciowa_wal_pln pln_kwota;

pln_kwota : KWOTA;

//SPLATA CHF

splata_chf :
       chf_odsetki Space_splata_raty_kredytu |
       Kapital_space chfy_meat Space_splata_raty_kredytu |
       chf_kapital_splata_raty
       ;

chfy_meat :
    chf_kapital_odsetki |
    chf_kapital_odsetki_odsetki_przeterminowane |
    chf_kapital_odsetki_przeterminowane
    ;

chf_odsetki :                                   chf_odsetki_block;
chf_kapital_odsetki_przeterminowane :                                   chf_odsetki_przeterminowane_block;
chf_kapital_odsetki_odsetki_przeterminowane :   chf_odsetki_block SPACE chf_odsetki_przeterminowane_block Space_kwota_raty_kapital_odsetki_space KWOTA;
chf_kapital_odsetki :                           chf_odsetki_block                                         Space_kwota_raty_kapital_odsetki_space KWOTA;

chf_kapital_splata_raty :
        Kapital_splata_raty_kredytu |
        Kapital_splata_raty_w_pln IDENTIFIER
        ;

chf_odsetki_przeterminowane_block : Odsetki_przeterminowane_space chf_kwota_odsetki_przeterminowane;
chf_odsetki_block : Odsetki_space chf_kwota_odsetki;

chf_kwota_odsetki : KWOTA;
chf_kwota_odsetki_przeterminowane : KWOTA;


//building blocks

IDENTIFIER :   DIGIT+ '-' DIGIT+;
STOPA_NUMBER : DIGIT* DOT TWODIGIT TWODIGIT DIGIT;

KWOTA : DIGIT* DOT TWODIGIT;

DATE : TWODIGIT TWODIGIT '-' TWODIGIT '-' TWODIGIT;
AMOUNT : DIGIT+ COMMA TWODIGIT;

CHF : 'CHF';
PLN : 'PLN';

fragment DIGIT : [0-9];
fragment TWODIGIT : DIGIT DIGIT;
THREEDIGIT : TWODIGIT DIGIT;
SIXDIGIT : TWODIGIT TWODIGIT TWODIGIT;
EIGHTDIGIT : SIXDIGIT TWODIGIT;

fragment CAPITAL_LETTER : [A-Z];
THREE_CAPITAL_LETTERS : CAPITAL_LETTER CAPITAL_LETTER CAPITAL_LETTER;

SPECIAL : [-.+();:/];
COMMA : ',';
DOT : '.';
NEWLINE : '\n';
SPACE : [ ]+;


// keywords

Odsetki_space : 'ODSETKI ';
Kapital_space : 'KAPITAŁ ';

Space_kwota_raty_kapital_odsetki_space : ' KWOTA RATY (KAPITAŁ + ODSETKI) ';
Platnosc_czesciowa_wal_pln : 'PŁATNOŚĆ CZĘŚCIOWA - WAL/PLN PLN';
Space_splata_raty_kredytu: ' SPŁATA RATY KREDYTU';

Odsetki_przeterminowane_space : Odsetki_space 'PRZETERMINOWANE ';

Potwierdzenie_wykonania_operacji : 'Potwierdzenie wykonania operacji';
Header : 'Data transakcji Data waluty Kwota transakcji Typ transakcji: Tytuł operacji';

Wyplata_kredytu :       'WYPŁATA KREDYTU';
Naliczenie_oplat :      'NALICZENIE OPŁAT';
Sp_raty_nieplanowana :  'SP.RATY-NIEPLANOWANA';
Spl_raty_regularna :    'SPŁ.RATY-REGULARNA';
Dodatkowa_wy_kredytu :  'DODATKOWA WY.KREDYTU';
Zmiana_stopy_proc :     'ZMIANA STOPY PROC.';
Sp_raty_nieregularna :  'SP.RATY-NIEREGULARNA';

Kapital_spl_dysp_x :    'KAPITAŁ Spł.dysp.x';
Kapital_dysp_ddn_x :    'KAPITAŁ DYSP DDN X';

Kapital_splata_raty_kredytu :   'KAPITAŁ SPŁATA RATY KREDYTU';
Kapital_splata_raty_w_pln :     'KAPITAŁ Spłata raty w PLN';