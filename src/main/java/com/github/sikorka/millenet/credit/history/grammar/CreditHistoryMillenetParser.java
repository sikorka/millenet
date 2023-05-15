package com.github.sikorka.millenet.credit.history.grammar;// Generated from CreditHistoryMillenet.g4 by ANTLR 4.8

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CreditHistoryMillenetParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, WYPLATA=5, WYPLATA_URUCHOMIENIE=6, WYPLATA_TRANSZA=7, 
		OPLATA_PROWIZJA=8, OPLATA_URUCHOMIENIE=9, IDENTIFIER=10, STOPA_NUMBER=11, 
		KWOTA=12, DATE=13, AMOUNT=14, CHF=15, PLN=16, THREEDIGIT=17, SIXDIGIT=18, 
		EIGHTDIGIT=19, THREE_CAPITAL_LETTERS=20, SPECIAL=21, COMMA=22, DOT=23, 
		NEWLINE=24, SPACE=25, Odsetki_space=26, Kapital_space=27, Space_kwota_raty_kapital_odsetki_space=28, 
		Platnosc_czesciowa_wal_pln=29, Space_splata_raty_kredytu=30, Odsetki_przeterminowane_space=31, 
		Potwierdzenie_wykonania_operacji=32, Header=33, Wyplata_kredytu=34, Naliczenie_oplat=35, 
		Sp_raty_nieplanowana=36, Spl_raty_regularna=37, Dodatkowa_wy_kredytu=38, 
		Zmiana_stopy_proc=39, Sp_raty_nieregularna=40, Kapital_spl_dysp_x=41, 
		Kapital_dysp_ddn_x=42, Kapital_splata_raty_kredytu=43, Kapital_splata_raty_w_pln=44;
	public static final int
		RULE_credit = 0, RULE_operation = 1, RULE_operationStart = 2, RULE_headingRow = 3, 
		RULE_transactionDate = 4, RULE_currencyDate = 5, RULE_currencyAmount = 6, 
		RULE_currency = 7, RULE_transactionType = 8, RULE_operationTitle = 9, 
		RULE_stopa = 10, RULE_nowa_stopa = 11, RULE_poprzednia_stopa = 12, RULE_wyplata = 13, 
		RULE_oplata = 14, RULE_kapital_potr = 15, RULE_splata_pln = 16, RULE_pln_odsetki = 17, 
		RULE_pln_kapital_odsetki_przeterminowane = 18, RULE_pln_kapital_odsetki = 19, 
		RULE_pln_kapital_odsetki_odsetki_przeterminowane = 20, RULE_pln_kapital = 21, 
		RULE_pln_kapital_platnosc_czesciowa = 22, RULE_pln_kapital_spl_dysp = 23, 
		RULE_pln_kapital_dysp = 24, RULE_pln_platnosc_czesciowa_block = 25, RULE_pln_kwota = 26, 
		RULE_splata_chf = 27, RULE_chfy_meat = 28, RULE_chf_odsetki = 29, RULE_chf_kapital_odsetki_przeterminowane = 30, 
		RULE_chf_kapital_odsetki_odsetki_przeterminowane = 31, RULE_chf_kapital_odsetki = 32, 
		RULE_chf_kapital_splata_raty = 33, RULE_chf_odsetki_przeterminowane_block = 34, 
		RULE_chf_odsetki_block = 35, RULE_chf_kwota_odsetki = 36, RULE_chf_kwota_odsetki_przeterminowane = 37;
	private static String[] makeRuleNames() {
		return new String[] {
			"credit", "operation", "operationStart", "headingRow", "transactionDate", 
			"currencyDate", "currencyAmount", "currency", "transactionType", "operationTitle", 
			"stopa", "nowa_stopa", "poprzednia_stopa", "wyplata", "oplata", "kapital_potr", 
			"splata_pln", "pln_odsetki", "pln_kapital_odsetki_przeterminowane", "pln_kapital_odsetki", 
			"pln_kapital_odsetki_odsetki_przeterminowane", "pln_kapital", "pln_kapital_platnosc_czesciowa", 
			"pln_kapital_spl_dysp", "pln_kapital_dysp", "pln_platnosc_czesciowa_block", 
			"pln_kwota", "splata_chf", "chfy_meat", "chf_odsetki", "chf_kapital_odsetki_przeterminowane", 
			"chf_kapital_odsetki_odsetki_przeterminowane", "chf_kapital_odsetki", 
			"chf_kapital_splata_raty", "chf_odsetki_przeterminowane_block", "chf_odsetki_block", 
			"chf_kwota_odsetki", "chf_kwota_odsetki_przeterminowane"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'NOWA STOPA PROCENTOWA '", "' POPRZEDNIA STOPA PROCENTOWA '", 
			"'POTR.'", "'z'", null, null, null, null, null, null, null, null, null, 
			null, "'CHF'", "'PLN'", null, null, null, null, null, "','", "'.'", "'\n'", 
			null, "'ODSETKI '", "'KAPITA\u0141 '", "' KWOTA RATY (KAPITA\u0141 + ODSETKI) '", 
			"'P\u0141ATNO\u015A\u0106 CZ\u0118\u015ACIOWA - WAL/PLN PLN'", "' SP\u0141ATA RATY KREDYTU'", 
			null, "'Potwierdzenie wykonania operacji'", "'Data transakcji Data waluty Kwota transakcji Typ transakcji: Tytu\u0142 operacji'", 
			"'WYP\u0141ATA KREDYTU'", "'NALICZENIE OP\u0141AT'", "'SP.RATY-NIEPLANOWANA'", 
			"'SP\u0141.RATY-REGULARNA'", "'DODATKOWA WY.KREDYTU'", "'ZMIANA STOPY PROC.'", 
			"'SP.RATY-NIEREGULARNA'", "'KAPITA\u0141 Sp\u0142.dysp.x'", "'KAPITA\u0141 DYSP DDN X'", 
			"'KAPITA\u0141 SP\u0141ATA RATY KREDYTU'", "'KAPITA\u0141 Sp\u0142ata raty w PLN'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "WYPLATA", "WYPLATA_URUCHOMIENIE", "WYPLATA_TRANSZA", 
			"OPLATA_PROWIZJA", "OPLATA_URUCHOMIENIE", "IDENTIFIER", "STOPA_NUMBER", 
			"KWOTA", "DATE", "AMOUNT", "CHF", "PLN", "THREEDIGIT", "SIXDIGIT", "EIGHTDIGIT", 
			"THREE_CAPITAL_LETTERS", "SPECIAL", "COMMA", "DOT", "NEWLINE", "SPACE", 
			"Odsetki_space", "Kapital_space", "Space_kwota_raty_kapital_odsetki_space", 
			"Platnosc_czesciowa_wal_pln", "Space_splata_raty_kredytu", "Odsetki_przeterminowane_space", 
			"Potwierdzenie_wykonania_operacji", "Header", "Wyplata_kredytu", "Naliczenie_oplat", 
			"Sp_raty_nieplanowana", "Spl_raty_regularna", "Dodatkowa_wy_kredytu", 
			"Zmiana_stopy_proc", "Sp_raty_nieregularna", "Kapital_spl_dysp_x", "Kapital_dysp_ddn_x", 
			"Kapital_splata_raty_kredytu", "Kapital_splata_raty_w_pln"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "CreditHistoryMillenet.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CreditHistoryMillenetParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CreditContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CreditHistoryMillenetParser.EOF, 0); }
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public CreditContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_credit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).enterCredit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).exitCredit(this);
		}
	}

	public final CreditContext credit() throws RecognitionException {
		CreditContext _localctx = new CreditContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_credit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(76);
				operation();
				}
				}
				setState(79); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Potwierdzenie_wykonania_operacji );
			setState(81);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperationContext extends ParserRuleContext {
		public OperationStartContext operationStart() {
			return getRuleContext(OperationStartContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CreditHistoryMillenetParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CreditHistoryMillenetParser.NEWLINE, i);
		}
		public HeadingRowContext headingRow() {
			return getRuleContext(HeadingRowContext.class,0);
		}
		public TransactionDateContext transactionDate() {
			return getRuleContext(TransactionDateContext.class,0);
		}
		public CurrencyDateContext currencyDate() {
			return getRuleContext(CurrencyDateContext.class,0);
		}
		public CurrencyAmountContext currencyAmount() {
			return getRuleContext(CurrencyAmountContext.class,0);
		}
		public TerminalNode SPACE() { return getToken(CreditHistoryMillenetParser.SPACE, 0); }
		public CurrencyContext currency() {
			return getRuleContext(CurrencyContext.class,0);
		}
		public TransactionTypeContext transactionType() {
			return getRuleContext(TransactionTypeContext.class,0);
		}
		public OperationTitleContext operationTitle() {
			return getRuleContext(OperationTitleContext.class,0);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).exitOperation(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			operationStart();
			setState(84);
			match(NEWLINE);
			setState(85);
			headingRow();
			setState(86);
			match(NEWLINE);
			setState(87);
			transactionDate();
			setState(88);
			match(NEWLINE);
			setState(89);
			currencyDate();
			setState(90);
			match(NEWLINE);
			setState(91);
			currencyAmount();
			setState(92);
			match(SPACE);
			setState(93);
			currency();
			setState(94);
			match(NEWLINE);
			setState(95);
			transactionType();
			setState(96);
			match(NEWLINE);
			setState(97);
			operationTitle();
			setState(98);
			match(NEWLINE);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(99);
				match(NEWLINE);
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperationStartContext extends ParserRuleContext {
		public TerminalNode Potwierdzenie_wykonania_operacji() { return getToken(CreditHistoryMillenetParser.Potwierdzenie_wykonania_operacji, 0); }
		public OperationStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operationStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).enterOperationStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).exitOperationStart(this);
		}
	}

	public final OperationStartContext operationStart() throws RecognitionException {
		OperationStartContext _localctx = new OperationStartContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_operationStart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(Potwierdzenie_wykonania_operacji);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HeadingRowContext extends ParserRuleContext {
		public TerminalNode Header() { return getToken(CreditHistoryMillenetParser.Header, 0); }
		public HeadingRowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headingRow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).enterHeadingRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).exitHeadingRow(this);
		}
	}

	public final HeadingRowContext headingRow() throws RecognitionException {
		HeadingRowContext _localctx = new HeadingRowContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_headingRow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(Header);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransactionDateContext extends ParserRuleContext {
		public TerminalNode DATE() { return getToken(CreditHistoryMillenetParser.DATE, 0); }
		public TransactionDateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transactionDate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).enterTransactionDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).exitTransactionDate(this);
		}
	}

	public final TransactionDateContext transactionDate() throws RecognitionException {
		TransactionDateContext _localctx = new TransactionDateContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_transactionDate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(DATE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CurrencyDateContext extends ParserRuleContext {
		public TerminalNode DATE() { return getToken(CreditHistoryMillenetParser.DATE, 0); }
		public CurrencyDateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_currencyDate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).enterCurrencyDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).exitCurrencyDate(this);
		}
	}

	public final CurrencyDateContext currencyDate() throws RecognitionException {
		CurrencyDateContext _localctx = new CurrencyDateContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_currencyDate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(DATE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CurrencyAmountContext extends ParserRuleContext {
		public TerminalNode AMOUNT() { return getToken(CreditHistoryMillenetParser.AMOUNT, 0); }
		public CurrencyAmountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_currencyAmount; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).enterCurrencyAmount(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).exitCurrencyAmount(this);
		}
	}

	public final CurrencyAmountContext currencyAmount() throws RecognitionException {
		CurrencyAmountContext _localctx = new CurrencyAmountContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_currencyAmount);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(AMOUNT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CurrencyContext extends ParserRuleContext {
		public TerminalNode CHF() { return getToken(CreditHistoryMillenetParser.CHF, 0); }
		public TerminalNode PLN() { return getToken(CreditHistoryMillenetParser.PLN, 0); }
		public CurrencyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_currency; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).enterCurrency(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).exitCurrency(this);
		}
	}

	public final CurrencyContext currency() throws RecognitionException {
		CurrencyContext _localctx = new CurrencyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_currency);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_la = _input.LA(1);
			if ( !(_la==CHF || _la==PLN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransactionTypeContext extends ParserRuleContext {
		public TerminalNode Wyplata_kredytu() { return getToken(CreditHistoryMillenetParser.Wyplata_kredytu, 0); }
		public TerminalNode Naliczenie_oplat() { return getToken(CreditHistoryMillenetParser.Naliczenie_oplat, 0); }
		public TerminalNode Sp_raty_nieplanowana() { return getToken(CreditHistoryMillenetParser.Sp_raty_nieplanowana, 0); }
		public TerminalNode Spl_raty_regularna() { return getToken(CreditHistoryMillenetParser.Spl_raty_regularna, 0); }
		public TerminalNode Dodatkowa_wy_kredytu() { return getToken(CreditHistoryMillenetParser.Dodatkowa_wy_kredytu, 0); }
		public TerminalNode Zmiana_stopy_proc() { return getToken(CreditHistoryMillenetParser.Zmiana_stopy_proc, 0); }
		public TerminalNode Sp_raty_nieregularna() { return getToken(CreditHistoryMillenetParser.Sp_raty_nieregularna, 0); }
		public TransactionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transactionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).enterTransactionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).exitTransactionType(this);
		}
	}

	public final TransactionTypeContext transactionType() throws RecognitionException {
		TransactionTypeContext _localctx = new TransactionTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_transactionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Wyplata_kredytu) | (1L << Naliczenie_oplat) | (1L << Sp_raty_nieplanowana) | (1L << Spl_raty_regularna) | (1L << Dodatkowa_wy_kredytu) | (1L << Zmiana_stopy_proc) | (1L << Sp_raty_nieregularna))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperationTitleContext extends ParserRuleContext {
		public StopaContext stopa() {
			return getRuleContext(StopaContext.class,0);
		}
		public WyplataContext wyplata() {
			return getRuleContext(WyplataContext.class,0);
		}
		public OplataContext oplata() {
			return getRuleContext(OplataContext.class,0);
		}
		public Kapital_potrContext kapital_potr() {
			return getRuleContext(Kapital_potrContext.class,0);
		}
		public Splata_plnContext splata_pln() {
			return getRuleContext(Splata_plnContext.class,0);
		}
		public Splata_chfContext splata_chf() {
			return getRuleContext(Splata_chfContext.class,0);
		}
		public OperationTitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operationTitle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).enterOperationTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).exitOperationTitle(this);
		}
	}

	public final OperationTitleContext operationTitle() throws RecognitionException {
		OperationTitleContext _localctx = new OperationTitleContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_operationTitle);
		try {
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				stopa();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				wyplata();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				oplata();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(122);
				kapital_potr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(123);
				splata_pln();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(124);
				splata_chf();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StopaContext extends ParserRuleContext {
		public Nowa_stopaContext nowa_stopa() {
			return getRuleContext(Nowa_stopaContext.class,0);
		}
		public Poprzednia_stopaContext poprzednia_stopa() {
			return getRuleContext(Poprzednia_stopaContext.class,0);
		}
		public StopaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stopa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).enterStopa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).exitStopa(this);
		}
	}

	public final StopaContext stopa() throws RecognitionException {
		StopaContext _localctx = new StopaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_stopa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			nowa_stopa();
			setState(128);
			poprzednia_stopa();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nowa_stopaContext extends ParserRuleContext {
		public TerminalNode STOPA_NUMBER() { return getToken(CreditHistoryMillenetParser.STOPA_NUMBER, 0); }
		public Nowa_stopaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nowa_stopa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).enterNowa_stopa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).exitNowa_stopa(this);
		}
	}

	public final Nowa_stopaContext nowa_stopa() throws RecognitionException {
		Nowa_stopaContext _localctx = new Nowa_stopaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_nowa_stopa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(T__0);
			setState(131);
			match(STOPA_NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Poprzednia_stopaContext extends ParserRuleContext {
		public TerminalNode STOPA_NUMBER() { return getToken(CreditHistoryMillenetParser.STOPA_NUMBER, 0); }
		public Poprzednia_stopaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_poprzednia_stopa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).enterPoprzednia_stopa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).exitPoprzednia_stopa(this);
		}
	}

	public final Poprzednia_stopaContext poprzednia_stopa() throws RecognitionException {
		Poprzednia_stopaContext _localctx = new Poprzednia_stopaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_poprzednia_stopa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(T__1);
			setState(134);
			match(STOPA_NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WyplataContext extends ParserRuleContext {
		public TerminalNode WYPLATA_URUCHOMIENIE() { return getToken(CreditHistoryMillenetParser.WYPLATA_URUCHOMIENIE, 0); }
		public TerminalNode WYPLATA_TRANSZA() { return getToken(CreditHistoryMillenetParser.WYPLATA_TRANSZA, 0); }
		public TerminalNode WYPLATA() { return getToken(CreditHistoryMillenetParser.WYPLATA, 0); }
		public WyplataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wyplata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).enterWyplata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).exitWyplata(this);
		}
	}

	public final WyplataContext wyplata() throws RecognitionException {
		WyplataContext _localctx = new WyplataContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_wyplata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WYPLATA) | (1L << WYPLATA_URUCHOMIENIE) | (1L << WYPLATA_TRANSZA))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OplataContext extends ParserRuleContext {
		public TerminalNode OPLATA_PROWIZJA() { return getToken(CreditHistoryMillenetParser.OPLATA_PROWIZJA, 0); }
		public TerminalNode OPLATA_URUCHOMIENIE() { return getToken(CreditHistoryMillenetParser.OPLATA_URUCHOMIENIE, 0); }
		public OplataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oplata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).enterOplata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).exitOplata(this);
		}
	}

	public final OplataContext oplata() throws RecognitionException {
		OplataContext _localctx = new OplataContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_oplata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_la = _input.LA(1);
			if ( !(_la==OPLATA_PROWIZJA || _la==OPLATA_URUCHOMIENIE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Kapital_potrContext extends ParserRuleContext {
		public TerminalNode Kapital_space() { return getToken(CreditHistoryMillenetParser.Kapital_space, 0); }
		public TerminalNode THREEDIGIT() { return getToken(CreditHistoryMillenetParser.THREEDIGIT, 0); }
		public TerminalNode THREE_CAPITAL_LETTERS() { return getToken(CreditHistoryMillenetParser.THREE_CAPITAL_LETTERS, 0); }
		public TerminalNode SIXDIGIT() { return getToken(CreditHistoryMillenetParser.SIXDIGIT, 0); }
		public TerminalNode EIGHTDIGIT() { return getToken(CreditHistoryMillenetParser.EIGHTDIGIT, 0); }
		public Kapital_potrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kapital_potr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).enterKapital_potr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).exitKapital_potr(this);
		}
	}

	public final Kapital_potrContext kapital_potr() throws RecognitionException {
		Kapital_potrContext _localctx = new Kapital_potrContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_kapital_potr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(Kapital_space);
			setState(141);
			match(T__2);
			setState(142);
			match(THREEDIGIT);
			setState(143);
			match(THREE_CAPITAL_LETTERS);
			setState(144);
			match(SIXDIGIT);
			setState(145);
			match(T__3);
			setState(146);
			match(EIGHTDIGIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Splata_plnContext extends ParserRuleContext {
		public Pln_odsetkiContext pln_odsetki() {
			return getRuleContext(Pln_odsetkiContext.class,0);
		}
		public Pln_kapital_odsetkiContext pln_kapital_odsetki() {
			return getRuleContext(Pln_kapital_odsetkiContext.class,0);
		}
		public Pln_kapital_odsetki_przeterminowaneContext pln_kapital_odsetki_przeterminowane() {
			return getRuleContext(Pln_kapital_odsetki_przeterminowaneContext.class,0);
		}
		public Pln_kapital_odsetki_odsetki_przeterminowaneContext pln_kapital_odsetki_odsetki_przeterminowane() {
			return getRuleContext(Pln_kapital_odsetki_odsetki_przeterminowaneContext.class,0);
		}
		public Pln_kapitalContext pln_kapital() {
			return getRuleContext(Pln_kapitalContext.class,0);
		}
		public Splata_plnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_splata_pln; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).enterSplata_pln(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).exitSplata_pln(this);
		}
	}

	public final Splata_plnContext splata_pln() throws RecognitionException {
		Splata_plnContext _localctx = new Splata_plnContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_splata_pln);
		try {
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				pln_odsetki();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				pln_kapital_odsetki();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
				pln_kapital_odsetki_przeterminowane();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(151);
				pln_kapital_odsetki_odsetki_przeterminowane();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(152);
				pln_kapital();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pln_odsetkiContext extends ParserRuleContext {
		public Chf_odsetki_blockContext chf_odsetki_block() {
			return getRuleContext(Chf_odsetki_blockContext.class,0);
		}
		public TerminalNode SPACE() { return getToken(CreditHistoryMillenetParser.SPACE, 0); }
		public Pln_platnosc_czesciowa_blockContext pln_platnosc_czesciowa_block() {
			return getRuleContext(Pln_platnosc_czesciowa_blockContext.class,0);
		}
		public Pln_odsetkiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pln_odsetki; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).enterPln_odsetki(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).exitPln_odsetki(this);
		}
	}

	public final Pln_odsetkiContext pln_odsetki() throws RecognitionException {
		Pln_odsetkiContext _localctx = new Pln_odsetkiContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_pln_odsetki);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			chf_odsetki_block();
			setState(156);
			match(SPACE);
			setState(157);
			pln_platnosc_czesciowa_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pln_kapital_odsetki_przeterminowaneContext extends ParserRuleContext {
		public TerminalNode Kapital_space() { return getToken(CreditHistoryMillenetParser.Kapital_space, 0); }
		public Chf_odsetki_przeterminowane_blockContext chf_odsetki_przeterminowane_block() {
			return getRuleContext(Chf_odsetki_przeterminowane_blockContext.class,0);
		}
		public TerminalNode SPACE() { return getToken(CreditHistoryMillenetParser.SPACE, 0); }
		public Pln_platnosc_czesciowa_blockContext pln_platnosc_czesciowa_block() {
			return getRuleContext(Pln_platnosc_czesciowa_blockContext.class,0);
		}
		public Pln_kapital_odsetki_przeterminowaneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pln_kapital_odsetki_przeterminowane; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).enterPln_kapital_odsetki_przeterminowane(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).exitPln_kapital_odsetki_przeterminowane(this);
		}
	}

	public final Pln_kapital_odsetki_przeterminowaneContext pln_kapital_odsetki_przeterminowane() throws RecognitionException {
		Pln_kapital_odsetki_przeterminowaneContext _localctx = new Pln_kapital_odsetki_przeterminowaneContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_pln_kapital_odsetki_przeterminowane);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(Kapital_space);
			setState(160);
			chf_odsetki_przeterminowane_block();
			setState(161);
			match(SPACE);
			setState(162);
			pln_platnosc_czesciowa_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pln_kapital_odsetkiContext extends ParserRuleContext {
		public TerminalNode Kapital_space() { return getToken(CreditHistoryMillenetParser.Kapital_space, 0); }
		public Chf_odsetki_blockContext chf_odsetki_block() {
			return getRuleContext(Chf_odsetki_blockContext.class,0);
		}
		public TerminalNode Space_kwota_raty_kapital_odsetki_space() { return getToken(CreditHistoryMillenetParser.Space_kwota_raty_kapital_odsetki_space, 0); }
		public TerminalNode KWOTA() { return getToken(CreditHistoryMillenetParser.KWOTA, 0); }
		public TerminalNode SPACE() { return getToken(CreditHistoryMillenetParser.SPACE, 0); }
		public Pln_platnosc_czesciowa_blockContext pln_platnosc_czesciowa_block() {
			return getRuleContext(Pln_platnosc_czesciowa_blockContext.class,0);
		}
		public Pln_kapital_odsetkiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pln_kapital_odsetki; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).enterPln_kapital_odsetki(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).exitPln_kapital_odsetki(this);
		}
	}

	public final Pln_kapital_odsetkiContext pln_kapital_odsetki() throws RecognitionException {
		Pln_kapital_odsetkiContext _localctx = new Pln_kapital_odsetkiContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_pln_kapital_odsetki);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(Kapital_space);
			setState(165);
			chf_odsetki_block();
			setState(166);
			match(Space_kwota_raty_kapital_odsetki_space);
			setState(167);
			match(KWOTA);
			setState(168);
			match(SPACE);
			setState(169);
			pln_platnosc_czesciowa_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pln_kapital_odsetki_odsetki_przeterminowaneContext extends ParserRuleContext {
		public TerminalNode Kapital_space() { return getToken(CreditHistoryMillenetParser.Kapital_space, 0); }
		public Chf_odsetki_blockContext chf_odsetki_block() {
			return getRuleContext(Chf_odsetki_blockContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(CreditHistoryMillenetParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(CreditHistoryMillenetParser.SPACE, i);
		}
		public Chf_odsetki_przeterminowane_blockContext chf_odsetki_przeterminowane_block() {
			return getRuleContext(Chf_odsetki_przeterminowane_blockContext.class,0);
		}
		public TerminalNode Space_kwota_raty_kapital_odsetki_space() { return getToken(CreditHistoryMillenetParser.Space_kwota_raty_kapital_odsetki_space, 0); }
		public TerminalNode KWOTA() { return getToken(CreditHistoryMillenetParser.KWOTA, 0); }
		public Pln_platnosc_czesciowa_blockContext pln_platnosc_czesciowa_block() {
			return getRuleContext(Pln_platnosc_czesciowa_blockContext.class,0);
		}
		public Pln_kapital_odsetki_odsetki_przeterminowaneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pln_kapital_odsetki_odsetki_przeterminowane; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).enterPln_kapital_odsetki_odsetki_przeterminowane(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).exitPln_kapital_odsetki_odsetki_przeterminowane(this);
		}
	}

	public final Pln_kapital_odsetki_odsetki_przeterminowaneContext pln_kapital_odsetki_odsetki_przeterminowane() throws RecognitionException {
		Pln_kapital_odsetki_odsetki_przeterminowaneContext _localctx = new Pln_kapital_odsetki_odsetki_przeterminowaneContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_pln_kapital_odsetki_odsetki_przeterminowane);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(Kapital_space);
			setState(172);
			chf_odsetki_block();
			setState(173);
			match(SPACE);
			setState(174);
			chf_odsetki_przeterminowane_block();
			setState(175);
			match(Space_kwota_raty_kapital_odsetki_space);
			setState(176);
			match(KWOTA);
			setState(177);
			match(SPACE);
			setState(178);
			pln_platnosc_czesciowa_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pln_kapitalContext extends ParserRuleContext {
		public Pln_kapital_platnosc_czesciowaContext pln_kapital_platnosc_czesciowa() {
			return getRuleContext(Pln_kapital_platnosc_czesciowaContext.class,0);
		}
		public Pln_kapital_spl_dyspContext pln_kapital_spl_dysp() {
			return getRuleContext(Pln_kapital_spl_dyspContext.class,0);
		}
		public Pln_kapital_dyspContext pln_kapital_dysp() {
			return getRuleContext(Pln_kapital_dyspContext.class,0);
		}
		public Pln_kapitalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pln_kapital; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).enterPln_kapital(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).exitPln_kapital(this);
		}
	}

	public final Pln_kapitalContext pln_kapital() throws RecognitionException {
		Pln_kapitalContext _localctx = new Pln_kapitalContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_pln_kapital);
		try {
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Kapital_space:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				pln_kapital_platnosc_czesciowa();
				}
				break;
			case Kapital_spl_dysp_x:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				pln_kapital_spl_dysp();
				}
				break;
			case Kapital_dysp_ddn_x:
				enterOuterAlt(_localctx, 3);
				{
				setState(182);
				pln_kapital_dysp();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pln_kapital_platnosc_czesciowaContext extends ParserRuleContext {
		public TerminalNode Kapital_space() { return getToken(CreditHistoryMillenetParser.Kapital_space, 0); }
		public Pln_platnosc_czesciowa_blockContext pln_platnosc_czesciowa_block() {
			return getRuleContext(Pln_platnosc_czesciowa_blockContext.class,0);
		}
		public Pln_kapital_platnosc_czesciowaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pln_kapital_platnosc_czesciowa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).enterPln_kapital_platnosc_czesciowa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).exitPln_kapital_platnosc_czesciowa(this);
		}
	}

	public final Pln_kapital_platnosc_czesciowaContext pln_kapital_platnosc_czesciowa() throws RecognitionException {
		Pln_kapital_platnosc_czesciowaContext _localctx = new Pln_kapital_platnosc_czesciowaContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_pln_kapital_platnosc_czesciowa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(Kapital_space);
			setState(186);
			pln_platnosc_czesciowa_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pln_kapital_spl_dyspContext extends ParserRuleContext {
		public TerminalNode Kapital_spl_dysp_x() { return getToken(CreditHistoryMillenetParser.Kapital_spl_dysp_x, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CreditHistoryMillenetParser.IDENTIFIER, 0); }
		public List<TerminalNode> SPACE() { return getTokens(CreditHistoryMillenetParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(CreditHistoryMillenetParser.SPACE, i);
		}
		public TerminalNode PLN() { return getToken(CreditHistoryMillenetParser.PLN, 0); }
		public Pln_kwotaContext pln_kwota() {
			return getRuleContext(Pln_kwotaContext.class,0);
		}
		public Pln_kapital_spl_dyspContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pln_kapital_spl_dysp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).enterPln_kapital_spl_dysp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).exitPln_kapital_spl_dysp(this);
		}
	}

	public final Pln_kapital_spl_dyspContext pln_kapital_spl_dysp() throws RecognitionException {
		Pln_kapital_spl_dyspContext _localctx = new Pln_kapital_spl_dyspContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_pln_kapital_spl_dysp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(Kapital_spl_dysp_x);
			setState(189);
			match(IDENTIFIER);
			setState(190);
			match(SPACE);
			setState(191);
			match(PLN);
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(192);
				match(SPACE);
				}
			}

			setState(195);
			pln_kwota();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pln_kapital_dyspContext extends ParserRuleContext {
		public TerminalNode Kapital_dysp_ddn_x() { return getToken(CreditHistoryMillenetParser.Kapital_dysp_ddn_x, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CreditHistoryMillenetParser.IDENTIFIER, 0); }
		public List<TerminalNode> SPACE() { return getTokens(CreditHistoryMillenetParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(CreditHistoryMillenetParser.SPACE, i);
		}
		public TerminalNode PLN() { return getToken(CreditHistoryMillenetParser.PLN, 0); }
		public Pln_kwotaContext pln_kwota() {
			return getRuleContext(Pln_kwotaContext.class,0);
		}
		public Pln_kapital_dyspContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pln_kapital_dysp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).enterPln_kapital_dysp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).exitPln_kapital_dysp(this);
		}
	}

	public final Pln_kapital_dyspContext pln_kapital_dysp() throws RecognitionException {
		Pln_kapital_dyspContext _localctx = new Pln_kapital_dyspContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_pln_kapital_dysp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(Kapital_dysp_ddn_x);
			setState(198);
			match(IDENTIFIER);
			setState(199);
			match(SPACE);
			setState(200);
			match(PLN);
			setState(201);
			match(SPACE);
			setState(202);
			pln_kwota();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pln_platnosc_czesciowa_blockContext extends ParserRuleContext {
		public TerminalNode Platnosc_czesciowa_wal_pln() { return getToken(CreditHistoryMillenetParser.Platnosc_czesciowa_wal_pln, 0); }
		public Pln_kwotaContext pln_kwota() {
			return getRuleContext(Pln_kwotaContext.class,0);
		}
		public Pln_platnosc_czesciowa_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pln_platnosc_czesciowa_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).enterPln_platnosc_czesciowa_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).exitPln_platnosc_czesciowa_block(this);
		}
	}

	public final Pln_platnosc_czesciowa_blockContext pln_platnosc_czesciowa_block() throws RecognitionException {
		Pln_platnosc_czesciowa_blockContext _localctx = new Pln_platnosc_czesciowa_blockContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_pln_platnosc_czesciowa_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(Platnosc_czesciowa_wal_pln);
			setState(205);
			pln_kwota();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pln_kwotaContext extends ParserRuleContext {
		public TerminalNode KWOTA() { return getToken(CreditHistoryMillenetParser.KWOTA, 0); }
		public Pln_kwotaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pln_kwota; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).enterPln_kwota(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).exitPln_kwota(this);
		}
	}

	public final Pln_kwotaContext pln_kwota() throws RecognitionException {
		Pln_kwotaContext _localctx = new Pln_kwotaContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_pln_kwota);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(KWOTA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Splata_chfContext extends ParserRuleContext {
		public Chf_odsetkiContext chf_odsetki() {
			return getRuleContext(Chf_odsetkiContext.class,0);
		}
		public TerminalNode Space_splata_raty_kredytu() { return getToken(CreditHistoryMillenetParser.Space_splata_raty_kredytu, 0); }
		public TerminalNode Kapital_space() { return getToken(CreditHistoryMillenetParser.Kapital_space, 0); }
		public Chfy_meatContext chfy_meat() {
			return getRuleContext(Chfy_meatContext.class,0);
		}
		public Chf_kapital_splata_ratyContext chf_kapital_splata_raty() {
			return getRuleContext(Chf_kapital_splata_ratyContext.class,0);
		}
		public Splata_chfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_splata_chf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).enterSplata_chf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).exitSplata_chf(this);
		}
	}

	public final Splata_chfContext splata_chf() throws RecognitionException {
		Splata_chfContext _localctx = new Splata_chfContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_splata_chf);
		try {
			setState(217);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Odsetki_space:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				chf_odsetki();
				setState(210);
				match(Space_splata_raty_kredytu);
				}
				break;
			case Kapital_space:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				match(Kapital_space);
				setState(213);
				chfy_meat();
				setState(214);
				match(Space_splata_raty_kredytu);
				}
				break;
			case Kapital_splata_raty_kredytu:
			case Kapital_splata_raty_w_pln:
				enterOuterAlt(_localctx, 3);
				{
				setState(216);
				chf_kapital_splata_raty();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Chfy_meatContext extends ParserRuleContext {
		public Chf_kapital_odsetkiContext chf_kapital_odsetki() {
			return getRuleContext(Chf_kapital_odsetkiContext.class,0);
		}
		public Chf_kapital_odsetki_odsetki_przeterminowaneContext chf_kapital_odsetki_odsetki_przeterminowane() {
			return getRuleContext(Chf_kapital_odsetki_odsetki_przeterminowaneContext.class,0);
		}
		public Chf_kapital_odsetki_przeterminowaneContext chf_kapital_odsetki_przeterminowane() {
			return getRuleContext(Chf_kapital_odsetki_przeterminowaneContext.class,0);
		}
		public Chfy_meatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chfy_meat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).enterChfy_meat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).exitChfy_meat(this);
		}
	}

	public final Chfy_meatContext chfy_meat() throws RecognitionException {
		Chfy_meatContext _localctx = new Chfy_meatContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_chfy_meat);
		try {
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				chf_kapital_odsetki();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				chf_kapital_odsetki_odsetki_przeterminowane();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				chf_kapital_odsetki_przeterminowane();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Chf_odsetkiContext extends ParserRuleContext {
		public Chf_odsetki_blockContext chf_odsetki_block() {
			return getRuleContext(Chf_odsetki_blockContext.class,0);
		}
		public Chf_odsetkiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chf_odsetki; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).enterChf_odsetki(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).exitChf_odsetki(this);
		}
	}

	public final Chf_odsetkiContext chf_odsetki() throws RecognitionException {
		Chf_odsetkiContext _localctx = new Chf_odsetkiContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_chf_odsetki);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			chf_odsetki_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Chf_kapital_odsetki_przeterminowaneContext extends ParserRuleContext {
		public Chf_odsetki_przeterminowane_blockContext chf_odsetki_przeterminowane_block() {
			return getRuleContext(Chf_odsetki_przeterminowane_blockContext.class,0);
		}
		public Chf_kapital_odsetki_przeterminowaneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chf_kapital_odsetki_przeterminowane; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).enterChf_kapital_odsetki_przeterminowane(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).exitChf_kapital_odsetki_przeterminowane(this);
		}
	}

	public final Chf_kapital_odsetki_przeterminowaneContext chf_kapital_odsetki_przeterminowane() throws RecognitionException {
		Chf_kapital_odsetki_przeterminowaneContext _localctx = new Chf_kapital_odsetki_przeterminowaneContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_chf_kapital_odsetki_przeterminowane);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			chf_odsetki_przeterminowane_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Chf_kapital_odsetki_odsetki_przeterminowaneContext extends ParserRuleContext {
		public Chf_odsetki_blockContext chf_odsetki_block() {
			return getRuleContext(Chf_odsetki_blockContext.class,0);
		}
		public TerminalNode SPACE() { return getToken(CreditHistoryMillenetParser.SPACE, 0); }
		public Chf_odsetki_przeterminowane_blockContext chf_odsetki_przeterminowane_block() {
			return getRuleContext(Chf_odsetki_przeterminowane_blockContext.class,0);
		}
		public TerminalNode Space_kwota_raty_kapital_odsetki_space() { return getToken(CreditHistoryMillenetParser.Space_kwota_raty_kapital_odsetki_space, 0); }
		public TerminalNode KWOTA() { return getToken(CreditHistoryMillenetParser.KWOTA, 0); }
		public Chf_kapital_odsetki_odsetki_przeterminowaneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chf_kapital_odsetki_odsetki_przeterminowane; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).enterChf_kapital_odsetki_odsetki_przeterminowane(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).exitChf_kapital_odsetki_odsetki_przeterminowane(this);
		}
	}

	public final Chf_kapital_odsetki_odsetki_przeterminowaneContext chf_kapital_odsetki_odsetki_przeterminowane() throws RecognitionException {
		Chf_kapital_odsetki_odsetki_przeterminowaneContext _localctx = new Chf_kapital_odsetki_odsetki_przeterminowaneContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_chf_kapital_odsetki_odsetki_przeterminowane);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			chf_odsetki_block();
			setState(229);
			match(SPACE);
			setState(230);
			chf_odsetki_przeterminowane_block();
			setState(231);
			match(Space_kwota_raty_kapital_odsetki_space);
			setState(232);
			match(KWOTA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Chf_kapital_odsetkiContext extends ParserRuleContext {
		public Chf_odsetki_blockContext chf_odsetki_block() {
			return getRuleContext(Chf_odsetki_blockContext.class,0);
		}
		public TerminalNode Space_kwota_raty_kapital_odsetki_space() { return getToken(CreditHistoryMillenetParser.Space_kwota_raty_kapital_odsetki_space, 0); }
		public TerminalNode KWOTA() { return getToken(CreditHistoryMillenetParser.KWOTA, 0); }
		public Chf_kapital_odsetkiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chf_kapital_odsetki; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).enterChf_kapital_odsetki(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).exitChf_kapital_odsetki(this);
		}
	}

	public final Chf_kapital_odsetkiContext chf_kapital_odsetki() throws RecognitionException {
		Chf_kapital_odsetkiContext _localctx = new Chf_kapital_odsetkiContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_chf_kapital_odsetki);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			chf_odsetki_block();
			setState(235);
			match(Space_kwota_raty_kapital_odsetki_space);
			setState(236);
			match(KWOTA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Chf_kapital_splata_ratyContext extends ParserRuleContext {
		public TerminalNode Kapital_splata_raty_kredytu() { return getToken(CreditHistoryMillenetParser.Kapital_splata_raty_kredytu, 0); }
		public TerminalNode Kapital_splata_raty_w_pln() { return getToken(CreditHistoryMillenetParser.Kapital_splata_raty_w_pln, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CreditHistoryMillenetParser.IDENTIFIER, 0); }
		public Chf_kapital_splata_ratyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chf_kapital_splata_raty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).enterChf_kapital_splata_raty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).exitChf_kapital_splata_raty(this);
		}
	}

	public final Chf_kapital_splata_ratyContext chf_kapital_splata_raty() throws RecognitionException {
		Chf_kapital_splata_ratyContext _localctx = new Chf_kapital_splata_ratyContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_chf_kapital_splata_raty);
		try {
			setState(241);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Kapital_splata_raty_kredytu:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				match(Kapital_splata_raty_kredytu);
				}
				break;
			case Kapital_splata_raty_w_pln:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				match(Kapital_splata_raty_w_pln);
				setState(240);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Chf_odsetki_przeterminowane_blockContext extends ParserRuleContext {
		public TerminalNode Odsetki_przeterminowane_space() { return getToken(CreditHistoryMillenetParser.Odsetki_przeterminowane_space, 0); }
		public Chf_kwota_odsetki_przeterminowaneContext chf_kwota_odsetki_przeterminowane() {
			return getRuleContext(Chf_kwota_odsetki_przeterminowaneContext.class,0);
		}
		public Chf_odsetki_przeterminowane_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chf_odsetki_przeterminowane_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).enterChf_odsetki_przeterminowane_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).exitChf_odsetki_przeterminowane_block(this);
		}
	}

	public final Chf_odsetki_przeterminowane_blockContext chf_odsetki_przeterminowane_block() throws RecognitionException {
		Chf_odsetki_przeterminowane_blockContext _localctx = new Chf_odsetki_przeterminowane_blockContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_chf_odsetki_przeterminowane_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(Odsetki_przeterminowane_space);
			setState(244);
			chf_kwota_odsetki_przeterminowane();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Chf_odsetki_blockContext extends ParserRuleContext {
		public TerminalNode Odsetki_space() { return getToken(CreditHistoryMillenetParser.Odsetki_space, 0); }
		public Chf_kwota_odsetkiContext chf_kwota_odsetki() {
			return getRuleContext(Chf_kwota_odsetkiContext.class,0);
		}
		public Chf_odsetki_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chf_odsetki_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).enterChf_odsetki_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).exitChf_odsetki_block(this);
		}
	}

	public final Chf_odsetki_blockContext chf_odsetki_block() throws RecognitionException {
		Chf_odsetki_blockContext _localctx = new Chf_odsetki_blockContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_chf_odsetki_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(Odsetki_space);
			setState(247);
			chf_kwota_odsetki();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Chf_kwota_odsetkiContext extends ParserRuleContext {
		public TerminalNode KWOTA() { return getToken(CreditHistoryMillenetParser.KWOTA, 0); }
		public Chf_kwota_odsetkiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chf_kwota_odsetki; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).enterChf_kwota_odsetki(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).exitChf_kwota_odsetki(this);
		}
	}

	public final Chf_kwota_odsetkiContext chf_kwota_odsetki() throws RecognitionException {
		Chf_kwota_odsetkiContext _localctx = new Chf_kwota_odsetkiContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_chf_kwota_odsetki);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(KWOTA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Chf_kwota_odsetki_przeterminowaneContext extends ParserRuleContext {
		public TerminalNode KWOTA() { return getToken(CreditHistoryMillenetParser.KWOTA, 0); }
		public Chf_kwota_odsetki_przeterminowaneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chf_kwota_odsetki_przeterminowane; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).enterChf_kwota_odsetki_przeterminowane(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).exitChf_kwota_odsetki_przeterminowane(this);
		}
	}

	public final Chf_kwota_odsetki_przeterminowaneContext chf_kwota_odsetki_przeterminowane() throws RecognitionException {
		Chf_kwota_odsetki_przeterminowaneContext _localctx = new Chf_kwota_odsetki_przeterminowaneContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_chf_kwota_odsetki_przeterminowane);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(KWOTA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u0100\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\6\2P\n\2\r\2\16\2Q\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\7\3g\n\3\f\3\16\3j\13\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0080\n\13\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\5\22\u009c\n\22\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\5\27\u00ba"+
		"\n\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\5\31\u00c4\n\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u00dc\n\35\3\36\3\36\3\36\5\36\u00e1"+
		"\n\36\3\37\3\37\3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\5#\u00f4"+
		"\n#\3$\3$\3$\3%\3%\3%\3&\3&\3\'\3\'\3\'\2\2(\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL\2\6\3\2\21\22\3\2$*\3\2\7"+
		"\t\3\2\n\13\2\u00ec\2O\3\2\2\2\4U\3\2\2\2\6k\3\2\2\2\bm\3\2\2\2\no\3\2"+
		"\2\2\fq\3\2\2\2\16s\3\2\2\2\20u\3\2\2\2\22w\3\2\2\2\24\177\3\2\2\2\26"+
		"\u0081\3\2\2\2\30\u0084\3\2\2\2\32\u0087\3\2\2\2\34\u008a\3\2\2\2\36\u008c"+
		"\3\2\2\2 \u008e\3\2\2\2\"\u009b\3\2\2\2$\u009d\3\2\2\2&\u00a1\3\2\2\2"+
		"(\u00a6\3\2\2\2*\u00ad\3\2\2\2,\u00b9\3\2\2\2.\u00bb\3\2\2\2\60\u00be"+
		"\3\2\2\2\62\u00c7\3\2\2\2\64\u00ce\3\2\2\2\66\u00d1\3\2\2\28\u00db\3\2"+
		"\2\2:\u00e0\3\2\2\2<\u00e2\3\2\2\2>\u00e4\3\2\2\2@\u00e6\3\2\2\2B\u00ec"+
		"\3\2\2\2D\u00f3\3\2\2\2F\u00f5\3\2\2\2H\u00f8\3\2\2\2J\u00fb\3\2\2\2L"+
		"\u00fd\3\2\2\2NP\5\4\3\2ON\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2RS\3\2"+
		"\2\2ST\7\2\2\3T\3\3\2\2\2UV\5\6\4\2VW\7\32\2\2WX\5\b\5\2XY\7\32\2\2YZ"+
		"\5\n\6\2Z[\7\32\2\2[\\\5\f\7\2\\]\7\32\2\2]^\5\16\b\2^_\7\33\2\2_`\5\20"+
		"\t\2`a\7\32\2\2ab\5\22\n\2bc\7\32\2\2cd\5\24\13\2dh\7\32\2\2eg\7\32\2"+
		"\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\5\3\2\2\2jh\3\2\2\2kl\7\""+
		"\2\2l\7\3\2\2\2mn\7#\2\2n\t\3\2\2\2op\7\17\2\2p\13\3\2\2\2qr\7\17\2\2"+
		"r\r\3\2\2\2st\7\20\2\2t\17\3\2\2\2uv\t\2\2\2v\21\3\2\2\2wx\t\3\2\2x\23"+
		"\3\2\2\2y\u0080\5\26\f\2z\u0080\5\34\17\2{\u0080\5\36\20\2|\u0080\5 \21"+
		"\2}\u0080\5\"\22\2~\u0080\58\35\2\177y\3\2\2\2\177z\3\2\2\2\177{\3\2\2"+
		"\2\177|\3\2\2\2\177}\3\2\2\2\177~\3\2\2\2\u0080\25\3\2\2\2\u0081\u0082"+
		"\5\30\r\2\u0082\u0083\5\32\16\2\u0083\27\3\2\2\2\u0084\u0085\7\3\2\2\u0085"+
		"\u0086\7\r\2\2\u0086\31\3\2\2\2\u0087\u0088\7\4\2\2\u0088\u0089\7\r\2"+
		"\2\u0089\33\3\2\2\2\u008a\u008b\t\4\2\2\u008b\35\3\2\2\2\u008c\u008d\t"+
		"\5\2\2\u008d\37\3\2\2\2\u008e\u008f\7\35\2\2\u008f\u0090\7\5\2\2\u0090"+
		"\u0091\7\23\2\2\u0091\u0092\7\26\2\2\u0092\u0093\7\24\2\2\u0093\u0094"+
		"\7\6\2\2\u0094\u0095\7\25\2\2\u0095!\3\2\2\2\u0096\u009c\5$\23\2\u0097"+
		"\u009c\5(\25\2\u0098\u009c\5&\24\2\u0099\u009c\5*\26\2\u009a\u009c\5,"+
		"\27\2\u009b\u0096\3\2\2\2\u009b\u0097\3\2\2\2\u009b\u0098\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009b\u009a\3\2\2\2\u009c#\3\2\2\2\u009d\u009e\5H%\2\u009e"+
		"\u009f\7\33\2\2\u009f\u00a0\5\64\33\2\u00a0%\3\2\2\2\u00a1\u00a2\7\35"+
		"\2\2\u00a2\u00a3\5F$\2\u00a3\u00a4\7\33\2\2\u00a4\u00a5\5\64\33\2\u00a5"+
		"\'\3\2\2\2\u00a6\u00a7\7\35\2\2\u00a7\u00a8\5H%\2\u00a8\u00a9\7\36\2\2"+
		"\u00a9\u00aa\7\16\2\2\u00aa\u00ab\7\33\2\2\u00ab\u00ac\5\64\33\2\u00ac"+
		")\3\2\2\2\u00ad\u00ae\7\35\2\2\u00ae\u00af\5H%\2\u00af\u00b0\7\33\2\2"+
		"\u00b0\u00b1\5F$\2\u00b1\u00b2\7\36\2\2\u00b2\u00b3\7\16\2\2\u00b3\u00b4"+
		"\7\33\2\2\u00b4\u00b5\5\64\33\2\u00b5+\3\2\2\2\u00b6\u00ba\5.\30\2\u00b7"+
		"\u00ba\5\60\31\2\u00b8\u00ba\5\62\32\2\u00b9\u00b6\3\2\2\2\u00b9\u00b7"+
		"\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba-\3\2\2\2\u00bb\u00bc\7\35\2\2\u00bc"+
		"\u00bd\5\64\33\2\u00bd/\3\2\2\2\u00be\u00bf\7+\2\2\u00bf\u00c0\7\f\2\2"+
		"\u00c0\u00c1\7\33\2\2\u00c1\u00c3\7\22\2\2\u00c2\u00c4\7\33\2\2\u00c3"+
		"\u00c2\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\5\66"+
		"\34\2\u00c6\61\3\2\2\2\u00c7\u00c8\7,\2\2\u00c8\u00c9\7\f\2\2\u00c9\u00ca"+
		"\7\33\2\2\u00ca\u00cb\7\22\2\2\u00cb\u00cc\7\33\2\2\u00cc\u00cd\5\66\34"+
		"\2\u00cd\63\3\2\2\2\u00ce\u00cf\7\37\2\2\u00cf\u00d0\5\66\34\2\u00d0\65"+
		"\3\2\2\2\u00d1\u00d2\7\16\2\2\u00d2\67\3\2\2\2\u00d3\u00d4\5<\37\2\u00d4"+
		"\u00d5\7 \2\2\u00d5\u00dc\3\2\2\2\u00d6\u00d7\7\35\2\2\u00d7\u00d8\5:"+
		"\36\2\u00d8\u00d9\7 \2\2\u00d9\u00dc\3\2\2\2\u00da\u00dc\5D#\2\u00db\u00d3"+
		"\3\2\2\2\u00db\u00d6\3\2\2\2\u00db\u00da\3\2\2\2\u00dc9\3\2\2\2\u00dd"+
		"\u00e1\5B\"\2\u00de\u00e1\5@!\2\u00df\u00e1\5> \2\u00e0\u00dd\3\2\2\2"+
		"\u00e0\u00de\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1;\3\2\2\2\u00e2\u00e3\5"+
		"H%\2\u00e3=\3\2\2\2\u00e4\u00e5\5F$\2\u00e5?\3\2\2\2\u00e6\u00e7\5H%\2"+
		"\u00e7\u00e8\7\33\2\2\u00e8\u00e9\5F$\2\u00e9\u00ea\7\36\2\2\u00ea\u00eb"+
		"\7\16\2\2\u00ebA\3\2\2\2\u00ec\u00ed\5H%\2\u00ed\u00ee\7\36\2\2\u00ee"+
		"\u00ef\7\16\2\2\u00efC\3\2\2\2\u00f0\u00f4\7-\2\2\u00f1\u00f2\7.\2\2\u00f2"+
		"\u00f4\7\f\2\2\u00f3\u00f0\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4E\3\2\2\2"+
		"\u00f5\u00f6\7!\2\2\u00f6\u00f7\5L\'\2\u00f7G\3\2\2\2\u00f8\u00f9\7\34"+
		"\2\2\u00f9\u00fa\5J&\2\u00faI\3\2\2\2\u00fb\u00fc\7\16\2\2\u00fcK\3\2"+
		"\2\2\u00fd\u00fe\7\16\2\2\u00feM\3\2\2\2\13Qh\177\u009b\u00b9\u00c3\u00db"+
		"\u00e0\u00f3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}