grammar CreditHistoryMillenet;

/** See example input files in /resources/sanitized/. */

//TODO ' ' => SPACE?

credit : (operation)+ EOF;

operation :
    operationStart NEWLINE
    transactionDateRow NEWLINE
    currencyDateRow NEWLINE
    currencyAmountRow SPACE currency NEWLINE
    transactionTypeRow NEWLINE
    operationTitleRow NEWLINE
    NEWLINE*;

operationStart : Potwierdzenie_wykonania_operacji;
transactionDateRow : Data_Transakcji_SPACE transactionDate;
currencyDateRow : Data_waluty_SPACE currencyDate;
currencyAmountRow : Kwota_Transakcji_SPACE currencyAmount;
currency : CHF | PLN;
transactionTypeRow : Typ_transakcji_SPACE transactionType;
transactionType:
                    Wyplata_kredytu |
                    Naliczenie_oplat |
                    Sp_raty_nieplanowana |
                    Spl_raty_regularna |
                    Dodatkowa_wy_kredytu |
                    Zmiana_stopy_proc |
                    Sp_raty_nieregularna
                    ;

transactionDate: DATE;
currencyDate: DATE;
currencyAmount: AMOUNT;

operationTitleRow : Tytul_operacji_SPACE operationTitle;
operationTitle:
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

WYPLATA:             'KAPITAŁ KWOTA WYPŁATY ' KWOTA ' TYP RACHUNKU ' DIGIT+ SPACE? 'NUMER RACHUNKU DO WYPŁATY ' DIGIT+;
WYPLATA_URUCHOMIENIE: WYPLATA SPACE? 'URUCHOMIENIE';
WYPLATA_TRANSZA:      WYPLATA SPACE? 'TRANSZA';

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
pln_kapital_odsetki :                         Kapital_space chf_odsetki_block                                         Space_kwota_raty_kapital_odsetki_space KWOTA SPACE? pln_platnosc_czesciowa_block;
pln_kapital_odsetki_odsetki_przeterminowane : Kapital_space chf_odsetki_block SPACE chf_odsetki_przeterminowane_block Space_kwota_raty_kapital_odsetki_space KWOTA SPACE? pln_platnosc_czesciowa_block;
pln_kapital :
    pln_kapital_platnosc_czesciowa |
    pln_kapital_spl_dysp |
    pln_kapital_dysp
    ;

pln_kapital_platnosc_czesciowa : Kapital_space pln_platnosc_czesciowa_block;
pln_kapital_spl_dysp :           Kapital_spl_dysp_x IDENTIFIER SPACE PLN SPACE? pln_kwota;
pln_kapital_dysp :               Kapital_dysp_ddn_x IDENTIFIER SPACE PLN SPACE pln_kwota;

pln_platnosc_czesciowa_block : Platnosc_czesciowa_wal_pln pln_kwota;

pln_kwota : KWOTA | KWOTA_Z_PRZECINKIEM_I_KROPKA;

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
chf_kapital_odsetki_odsetki_przeterminowane :   chf_odsetki_block SPACE chf_odsetki_przeterminowane_block Space_kwota_raty_kapital_odsetki_space KWOTA SPACE?;
chf_kapital_odsetki :                           chf_odsetki_block                                         Space_kwota_raty_kapital_odsetki_space KWOTA SPACE?;

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
KWOTA_Z_PRZECINKIEM_I_KROPKA : DIGIT+ COMMA DIGIT+ DOT TWODIGIT;

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
Platnosc_czesciowa_wal_pln : 'PŁATNOŚĆ' SPACE? 'CZĘŚCIOWA - WAL/PLN PLN' SPACE?;
Space_splata_raty_kredytu: SPACE? 'SPŁATA' SPACE* 'RATY' SPACE* 'KREDYTU' SPACE?;

Odsetki_przeterminowane_space : Odsetki_space 'PRZETERMINOWANE' SPACE+;

Potwierdzenie_wykonania_operacji : 'Potwierdzenie wykonania operacji';

Wyplata_kredytu :       'WYPŁATA KREDYTU';
Naliczenie_oplat :      'NALICZENIE OPŁAT';
Sp_raty_nieplanowana :  'SP.RATY-NIEPLANOWANA';
Spl_raty_regularna :    'SPŁ.RATY-REGULARNA';
Dodatkowa_wy_kredytu :  'DODATKOWA WY.KREDYTU';
Zmiana_stopy_proc :     'ZMIANA STOPY PROC.';
Sp_raty_nieregularna :  'SP.RATY-NIEREGULARNA';

Kapital_spl_dysp_x :    'KAPITAŁ Spł.dysp.x';
Kapital_dysp_ddn_x :    'KAPITAŁ DYSP DDN X';

Kapital_splata_raty_kredytu :   'KAPITAŁ' SPACE? 'SPŁATA' SPACE? 'RATY' SPACE? 'KREDYTU' SPACE?;
Kapital_splata_raty_w_pln :     'KAPITAŁ Spłata raty w PLN' SPACE?;

Data_Transakcji_SPACE : 'Data transakcji ';
Data_waluty_SPACE : 'Data waluty ';
Kwota_Transakcji_SPACE : 'Kwota transakcji ';
Typ_transakcji_SPACE : 'Typ transakcji: ';
Tytul_operacji_SPACE : 'Tytuł operacji ';