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
		KWOTA=12, KWOTA_Z_PRZECINKIEM_I_KROPKA=13, DATE=14, AMOUNT=15, CHF=16, 
		PLN=17, THREEDIGIT=18, SIXDIGIT=19, EIGHTDIGIT=20, THREE_CAPITAL_LETTERS=21, 
		SPECIAL=22, COMMA=23, DOT=24, NEWLINE=25, SPACE=26, Odsetki_space=27, 
		Kapital_space=28, Space_kwota_raty_kapital_odsetki_space=29, Platnosc_czesciowa_wal_pln=30, 
		Space_splata_raty_kredytu=31, Odsetki_przeterminowane_space=32, Potwierdzenie_wykonania_operacji=33, 
		Wyplata_kredytu=34, Naliczenie_oplat=35, Sp_raty_nieplanowana=36, Spl_raty_regularna=37, 
		Dodatkowa_wy_kredytu=38, Zmiana_stopy_proc=39, Sp_raty_nieregularna=40, 
		Kapital_spl_dysp_x=41, Kapital_dysp_ddn_x=42, Kapital_splata_raty_kredytu=43, 
		Kapital_splata_raty_w_pln=44, Data_Transakcji_SPACE=45, Data_waluty_SPACE=46, 
		Kwota_Transakcji_SPACE=47, Typ_transakcji_SPACE=48, Tytul_operacji_SPACE=49;
	public static final int
		RULE_credit = 0, RULE_operation = 1, RULE_operationStart = 2, RULE_transactionDateRow = 3, 
		RULE_currencyDateRow = 4, RULE_currencyAmountRow = 5, RULE_currency = 6, 
		RULE_transactionTypeRow = 7, RULE_transactionType = 8, RULE_transactionDate = 9, 
		RULE_currencyDate = 10, RULE_currencyAmount = 11, RULE_operationTitleRow = 12, 
		RULE_operationTitle = 13, RULE_stopa = 14, RULE_nowa_stopa = 15, RULE_poprzednia_stopa = 16, 
		RULE_wyplata = 17, RULE_oplata = 18, RULE_kapital_potr = 19, RULE_splata_pln = 20, 
		RULE_pln_odsetki = 21, RULE_pln_kapital_odsetki_przeterminowane = 22, 
		RULE_pln_kapital_odsetki = 23, RULE_pln_kapital_odsetki_odsetki_przeterminowane = 24, 
		RULE_pln_kapital = 25, RULE_pln_kapital_platnosc_czesciowa = 26, RULE_pln_kapital_spl_dysp = 27, 
		RULE_pln_kapital_dysp = 28, RULE_pln_platnosc_czesciowa_block = 29, RULE_pln_kwota = 30, 
		RULE_splata_chf = 31, RULE_chfy_meat = 32, RULE_chf_odsetki = 33, RULE_chf_kapital_odsetki_przeterminowane = 34, 
		RULE_chf_kapital_odsetki_odsetki_przeterminowane = 35, RULE_chf_kapital_odsetki = 36, 
		RULE_chf_kapital_splata_raty = 37, RULE_chf_odsetki_przeterminowane_block = 38, 
		RULE_chf_odsetki_block = 39, RULE_chf_kwota_odsetki = 40, RULE_chf_kwota_odsetki_przeterminowane = 41;
	private static String[] makeRuleNames() {
		return new String[] {
			"credit", "operation", "operationStart", "transactionDateRow", "currencyDateRow", 
			"currencyAmountRow", "currency", "transactionTypeRow", "transactionType", 
			"transactionDate", "currencyDate", "currencyAmount", "operationTitleRow", 
			"operationTitle", "stopa", "nowa_stopa", "poprzednia_stopa", "wyplata", 
			"oplata", "kapital_potr", "splata_pln", "pln_odsetki", "pln_kapital_odsetki_przeterminowane", 
			"pln_kapital_odsetki", "pln_kapital_odsetki_odsetki_przeterminowane", 
			"pln_kapital", "pln_kapital_platnosc_czesciowa", "pln_kapital_spl_dysp", 
			"pln_kapital_dysp", "pln_platnosc_czesciowa_block", "pln_kwota", "splata_chf", 
			"chfy_meat", "chf_odsetki", "chf_kapital_odsetki_przeterminowane", "chf_kapital_odsetki_odsetki_przeterminowane", 
			"chf_kapital_odsetki", "chf_kapital_splata_raty", "chf_odsetki_przeterminowane_block", 
			"chf_odsetki_block", "chf_kwota_odsetki", "chf_kwota_odsetki_przeterminowane"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'NOWA STOPA PROCENTOWA '", "' POPRZEDNIA STOPA PROCENTOWA '", 
			"'POTR.'", "'z'", null, null, null, null, null, null, null, null, null, 
			null, null, "'CHF'", "'PLN'", null, null, null, null, null, "','", "'.'", 
			"'\n'", null, "'ODSETKI '", "'KAPITA\u0141 '", "' KWOTA RATY (KAPITA\u0141 + ODSETKI) '", 
			null, null, null, "'Potwierdzenie wykonania operacji'", "'WYP\u0141ATA KREDYTU'", 
			"'NALICZENIE OP\u0141AT'", "'SP.RATY-NIEPLANOWANA'", "'SP\u0141.RATY-REGULARNA'", 
			"'DODATKOWA WY.KREDYTU'", "'ZMIANA STOPY PROC.'", "'SP.RATY-NIEREGULARNA'", 
			"'KAPITA\u0141 Sp\u0142.dysp.x'", "'KAPITA\u0141 DYSP DDN X'", null, 
			null, "'Data transakcji '", "'Data waluty '", "'Kwota transakcji '", 
			"'Typ transakcji: '", "'Tytu\u0142 operacji '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "WYPLATA", "WYPLATA_URUCHOMIENIE", "WYPLATA_TRANSZA", 
			"OPLATA_PROWIZJA", "OPLATA_URUCHOMIENIE", "IDENTIFIER", "STOPA_NUMBER", 
			"KWOTA", "KWOTA_Z_PRZECINKIEM_I_KROPKA", "DATE", "AMOUNT", "CHF", "PLN", 
			"THREEDIGIT", "SIXDIGIT", "EIGHTDIGIT", "THREE_CAPITAL_LETTERS", "SPECIAL", 
			"COMMA", "DOT", "NEWLINE", "SPACE", "Odsetki_space", "Kapital_space", 
			"Space_kwota_raty_kapital_odsetki_space", "Platnosc_czesciowa_wal_pln", 
			"Space_splata_raty_kredytu", "Odsetki_przeterminowane_space", "Potwierdzenie_wykonania_operacji", 
			"Wyplata_kredytu", "Naliczenie_oplat", "Sp_raty_nieplanowana", "Spl_raty_regularna", 
			"Dodatkowa_wy_kredytu", "Zmiana_stopy_proc", "Sp_raty_nieregularna", 
			"Kapital_spl_dysp_x", "Kapital_dysp_ddn_x", "Kapital_splata_raty_kredytu", 
			"Kapital_splata_raty_w_pln", "Data_Transakcji_SPACE", "Data_waluty_SPACE", 
			"Kwota_Transakcji_SPACE", "Typ_transakcji_SPACE", "Tytul_operacji_SPACE"
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
			setState(85); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(84);
				operation();
				}
				}
				setState(87); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Potwierdzenie_wykonania_operacji );
			setState(89);
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
		public TransactionDateRowContext transactionDateRow() {
			return getRuleContext(TransactionDateRowContext.class,0);
		}
		public CurrencyDateRowContext currencyDateRow() {
			return getRuleContext(CurrencyDateRowContext.class,0);
		}
		public CurrencyAmountRowContext currencyAmountRow() {
			return getRuleContext(CurrencyAmountRowContext.class,0);
		}
		public TerminalNode SPACE() { return getToken(CreditHistoryMillenetParser.SPACE, 0); }
		public CurrencyContext currency() {
			return getRuleContext(CurrencyContext.class,0);
		}
		public TransactionTypeRowContext transactionTypeRow() {
			return getRuleContext(TransactionTypeRowContext.class,0);
		}
		public OperationTitleRowContext operationTitleRow() {
			return getRuleContext(OperationTitleRowContext.class,0);
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
			setState(91);
			operationStart();
			setState(92);
			match(NEWLINE);
			setState(93);
			transactionDateRow();
			setState(94);
			match(NEWLINE);
			setState(95);
			currencyDateRow();
			setState(96);
			match(NEWLINE);
			setState(97);
			currencyAmountRow();
			setState(98);
			match(SPACE);
			setState(99);
			currency();
			setState(100);
			match(NEWLINE);
			setState(101);
			transactionTypeRow();
			setState(102);
			match(NEWLINE);
			setState(103);
			operationTitleRow();
			setState(104);
			match(NEWLINE);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(105);
				match(NEWLINE);
				}
				}
				setState(110);
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
			setState(111);
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

	public static class TransactionDateRowContext extends ParserRuleContext {
		public TerminalNode Data_Transakcji_SPACE() { return getToken(CreditHistoryMillenetParser.Data_Transakcji_SPACE, 0); }
		public TransactionDateContext transactionDate() {
			return getRuleContext(TransactionDateContext.class,0);
		}
		public TransactionDateRowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transactionDateRow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).enterTransactionDateRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).exitTransactionDateRow(this);
		}
	}

	public final TransactionDateRowContext transactionDateRow() throws RecognitionException {
		TransactionDateRowContext _localctx = new TransactionDateRowContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_transactionDateRow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(Data_Transakcji_SPACE);
			setState(114);
			transactionDate();
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

	public static class CurrencyDateRowContext extends ParserRuleContext {
		public TerminalNode Data_waluty_SPACE() { return getToken(CreditHistoryMillenetParser.Data_waluty_SPACE, 0); }
		public CurrencyDateContext currencyDate() {
			return getRuleContext(CurrencyDateContext.class,0);
		}
		public CurrencyDateRowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_currencyDateRow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).enterCurrencyDateRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).exitCurrencyDateRow(this);
		}
	}

	public final CurrencyDateRowContext currencyDateRow() throws RecognitionException {
		CurrencyDateRowContext _localctx = new CurrencyDateRowContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_currencyDateRow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(Data_waluty_SPACE);
			setState(117);
			currencyDate();
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

	public static class CurrencyAmountRowContext extends ParserRuleContext {
		public TerminalNode Kwota_Transakcji_SPACE() { return getToken(CreditHistoryMillenetParser.Kwota_Transakcji_SPACE, 0); }
		public CurrencyAmountContext currencyAmount() {
			return getRuleContext(CurrencyAmountContext.class,0);
		}
		public CurrencyAmountRowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_currencyAmountRow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).enterCurrencyAmountRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).exitCurrencyAmountRow(this);
		}
	}

	public final CurrencyAmountRowContext currencyAmountRow() throws RecognitionException {
		CurrencyAmountRowContext _localctx = new CurrencyAmountRowContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_currencyAmountRow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(Kwota_Transakcji_SPACE);
			setState(120);
			currencyAmount();
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
		enterRule(_localctx, 12, RULE_currency);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
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

	public static class TransactionTypeRowContext extends ParserRuleContext {
		public TerminalNode Typ_transakcji_SPACE() { return getToken(CreditHistoryMillenetParser.Typ_transakcji_SPACE, 0); }
		public TransactionTypeContext transactionType() {
			return getRuleContext(TransactionTypeContext.class,0);
		}
		public TransactionTypeRowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transactionTypeRow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).enterTransactionTypeRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).exitTransactionTypeRow(this);
		}
	}

	public final TransactionTypeRowContext transactionTypeRow() throws RecognitionException {
		TransactionTypeRowContext _localctx = new TransactionTypeRowContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_transactionTypeRow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(Typ_transakcji_SPACE);
			setState(125);
			transactionType();
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
			setState(127);
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
		enterRule(_localctx, 18, RULE_transactionDate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
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
		enterRule(_localctx, 20, RULE_currencyDate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
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
		enterRule(_localctx, 22, RULE_currencyAmount);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
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

	public static class OperationTitleRowContext extends ParserRuleContext {
		public TerminalNode Tytul_operacji_SPACE() { return getToken(CreditHistoryMillenetParser.Tytul_operacji_SPACE, 0); }
		public OperationTitleContext operationTitle() {
			return getRuleContext(OperationTitleContext.class,0);
		}
		public OperationTitleRowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operationTitleRow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).enterOperationTitleRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CreditHistoryMillenetListener) ((CreditHistoryMillenetListener)listener).exitOperationTitleRow(this);
		}
	}

	public final OperationTitleRowContext operationTitleRow() throws RecognitionException {
		OperationTitleRowContext _localctx = new OperationTitleRowContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_operationTitleRow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(Tytul_operacji_SPACE);
			setState(136);
			operationTitle();
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
		enterRule(_localctx, 26, RULE_operationTitle);
		try {
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				stopa();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				wyplata();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				oplata();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(141);
				kapital_potr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(142);
				splata_pln();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(143);
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
		enterRule(_localctx, 28, RULE_stopa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			nowa_stopa();
			setState(147);
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
		enterRule(_localctx, 30, RULE_nowa_stopa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(T__0);
			setState(150);
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
		enterRule(_localctx, 32, RULE_poprzednia_stopa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(T__1);
			setState(153);
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
		enterRule(_localctx, 34, RULE_wyplata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
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
		enterRule(_localctx, 36, RULE_oplata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
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
		enterRule(_localctx, 38, RULE_kapital_potr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(Kapital_space);
			setState(160);
			match(T__2);
			setState(161);
			match(THREEDIGIT);
			setState(162);
			match(THREE_CAPITAL_LETTERS);
			setState(163);
			match(SIXDIGIT);
			setState(164);
			match(T__3);
			setState(165);
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
		enterRule(_localctx, 40, RULE_splata_pln);
		try {
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				pln_odsetki();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				pln_kapital_odsetki();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(169);
				pln_kapital_odsetki_przeterminowane();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(170);
				pln_kapital_odsetki_odsetki_przeterminowane();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(171);
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
		enterRule(_localctx, 42, RULE_pln_odsetki);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			chf_odsetki_block();
			setState(175);
			match(SPACE);
			setState(176);
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
		enterRule(_localctx, 44, RULE_pln_kapital_odsetki_przeterminowane);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(Kapital_space);
			setState(179);
			chf_odsetki_przeterminowane_block();
			setState(180);
			match(SPACE);
			setState(181);
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
		public Pln_platnosc_czesciowa_blockContext pln_platnosc_czesciowa_block() {
			return getRuleContext(Pln_platnosc_czesciowa_blockContext.class,0);
		}
		public TerminalNode SPACE() { return getToken(CreditHistoryMillenetParser.SPACE, 0); }
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
		enterRule(_localctx, 46, RULE_pln_kapital_odsetki);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(Kapital_space);
			setState(184);
			chf_odsetki_block();
			setState(185);
			match(Space_kwota_raty_kapital_odsetki_space);
			setState(186);
			match(KWOTA);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(187);
				match(SPACE);
				}
			}

			setState(190);
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
		enterRule(_localctx, 48, RULE_pln_kapital_odsetki_odsetki_przeterminowane);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(Kapital_space);
			setState(193);
			chf_odsetki_block();
			setState(194);
			match(SPACE);
			setState(195);
			chf_odsetki_przeterminowane_block();
			setState(196);
			match(Space_kwota_raty_kapital_odsetki_space);
			setState(197);
			match(KWOTA);
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(198);
				match(SPACE);
				}
			}

			setState(201);
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
		enterRule(_localctx, 50, RULE_pln_kapital);
		try {
			setState(206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Kapital_space:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				pln_kapital_platnosc_czesciowa();
				}
				break;
			case Kapital_spl_dysp_x:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				pln_kapital_spl_dysp();
				}
				break;
			case Kapital_dysp_ddn_x:
				enterOuterAlt(_localctx, 3);
				{
				setState(205);
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
		enterRule(_localctx, 52, RULE_pln_kapital_platnosc_czesciowa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(Kapital_space);
			setState(209);
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
		enterRule(_localctx, 54, RULE_pln_kapital_spl_dysp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(Kapital_spl_dysp_x);
			setState(212);
			match(IDENTIFIER);
			setState(213);
			match(SPACE);
			setState(214);
			match(PLN);
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(215);
				match(SPACE);
				}
			}

			setState(218);
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
		enterRule(_localctx, 56, RULE_pln_kapital_dysp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(Kapital_dysp_ddn_x);
			setState(221);
			match(IDENTIFIER);
			setState(222);
			match(SPACE);
			setState(223);
			match(PLN);
			setState(224);
			match(SPACE);
			setState(225);
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
		enterRule(_localctx, 58, RULE_pln_platnosc_czesciowa_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(Platnosc_czesciowa_wal_pln);
			setState(228);
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
		public TerminalNode KWOTA_Z_PRZECINKIEM_I_KROPKA() { return getToken(CreditHistoryMillenetParser.KWOTA_Z_PRZECINKIEM_I_KROPKA, 0); }
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
		enterRule(_localctx, 60, RULE_pln_kwota);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_la = _input.LA(1);
			if ( !(_la==KWOTA || _la==KWOTA_Z_PRZECINKIEM_I_KROPKA) ) {
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
		enterRule(_localctx, 62, RULE_splata_chf);
		try {
			setState(240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Odsetki_space:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				chf_odsetki();
				setState(233);
				match(Space_splata_raty_kredytu);
				}
				break;
			case Kapital_space:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				match(Kapital_space);
				setState(236);
				chfy_meat();
				setState(237);
				match(Space_splata_raty_kredytu);
				}
				break;
			case Kapital_splata_raty_kredytu:
			case Kapital_splata_raty_w_pln:
				enterOuterAlt(_localctx, 3);
				{
				setState(239);
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
		enterRule(_localctx, 64, RULE_chfy_meat);
		try {
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				chf_kapital_odsetki();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				chf_kapital_odsetki_odsetki_przeterminowane();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(244);
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
		enterRule(_localctx, 66, RULE_chf_odsetki);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
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
		enterRule(_localctx, 68, RULE_chf_kapital_odsetki_przeterminowane);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
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
		public List<TerminalNode> SPACE() { return getTokens(CreditHistoryMillenetParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(CreditHistoryMillenetParser.SPACE, i);
		}
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
		enterRule(_localctx, 70, RULE_chf_kapital_odsetki_odsetki_przeterminowane);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			chf_odsetki_block();
			setState(252);
			match(SPACE);
			setState(253);
			chf_odsetki_przeterminowane_block();
			setState(254);
			match(Space_kwota_raty_kapital_odsetki_space);
			setState(255);
			match(KWOTA);
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(256);
				match(SPACE);
				}
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

	public static class Chf_kapital_odsetkiContext extends ParserRuleContext {
		public Chf_odsetki_blockContext chf_odsetki_block() {
			return getRuleContext(Chf_odsetki_blockContext.class,0);
		}
		public TerminalNode Space_kwota_raty_kapital_odsetki_space() { return getToken(CreditHistoryMillenetParser.Space_kwota_raty_kapital_odsetki_space, 0); }
		public TerminalNode KWOTA() { return getToken(CreditHistoryMillenetParser.KWOTA, 0); }
		public TerminalNode SPACE() { return getToken(CreditHistoryMillenetParser.SPACE, 0); }
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
		enterRule(_localctx, 72, RULE_chf_kapital_odsetki);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			chf_odsetki_block();
			setState(260);
			match(Space_kwota_raty_kapital_odsetki_space);
			setState(261);
			match(KWOTA);
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(262);
				match(SPACE);
				}
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
		enterRule(_localctx, 74, RULE_chf_kapital_splata_raty);
		try {
			setState(268);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Kapital_splata_raty_kredytu:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				match(Kapital_splata_raty_kredytu);
				}
				break;
			case Kapital_splata_raty_w_pln:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				match(Kapital_splata_raty_w_pln);
				setState(267);
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
		enterRule(_localctx, 76, RULE_chf_odsetki_przeterminowane_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(Odsetki_przeterminowane_space);
			setState(271);
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
		enterRule(_localctx, 78, RULE_chf_odsetki_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(Odsetki_space);
			setState(274);
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
		enterRule(_localctx, 80, RULE_chf_kwota_odsetki);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
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
		enterRule(_localctx, 82, RULE_chf_kwota_odsetki_przeterminowane);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\63\u011b\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\6\2X\n\2\r\2\16\2Y\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\7\3m\n\3\f\3\16\3p\13\3\3\4\3\4\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3"+
		"\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0093\n\17\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\5\26\u00af\n\26"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31"+
		"\5\31\u00bf\n\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u00ca"+
		"\n\32\3\32\3\32\3\33\3\33\3\33\5\33\u00d1\n\33\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\5\35\u00db\n\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\5!\u00f3\n!\3\"\3\""+
		"\3\"\5\"\u00f8\n\"\3#\3#\3$\3$\3%\3%\3%\3%\3%\3%\5%\u0104\n%\3&\3&\3&"+
		"\3&\5&\u010a\n&\3\'\3\'\3\'\5\'\u010f\n\'\3(\3(\3(\3)\3)\3)\3*\3*\3+\3"+
		"+\3+\2\2,\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNPRT\2\7\3\2\22\23\3\2$*\3\2\7\t\3\2\n\13\3\2\16\17\2\u0107"+
		"\2W\3\2\2\2\4]\3\2\2\2\6q\3\2\2\2\bs\3\2\2\2\nv\3\2\2\2\fy\3\2\2\2\16"+
		"|\3\2\2\2\20~\3\2\2\2\22\u0081\3\2\2\2\24\u0083\3\2\2\2\26\u0085\3\2\2"+
		"\2\30\u0087\3\2\2\2\32\u0089\3\2\2\2\34\u0092\3\2\2\2\36\u0094\3\2\2\2"+
		" \u0097\3\2\2\2\"\u009a\3\2\2\2$\u009d\3\2\2\2&\u009f\3\2\2\2(\u00a1\3"+
		"\2\2\2*\u00ae\3\2\2\2,\u00b0\3\2\2\2.\u00b4\3\2\2\2\60\u00b9\3\2\2\2\62"+
		"\u00c2\3\2\2\2\64\u00d0\3\2\2\2\66\u00d2\3\2\2\28\u00d5\3\2\2\2:\u00de"+
		"\3\2\2\2<\u00e5\3\2\2\2>\u00e8\3\2\2\2@\u00f2\3\2\2\2B\u00f7\3\2\2\2D"+
		"\u00f9\3\2\2\2F\u00fb\3\2\2\2H\u00fd\3\2\2\2J\u0105\3\2\2\2L\u010e\3\2"+
		"\2\2N\u0110\3\2\2\2P\u0113\3\2\2\2R\u0116\3\2\2\2T\u0118\3\2\2\2VX\5\4"+
		"\3\2WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[\\\7\2\2\3\\\3"+
		"\3\2\2\2]^\5\6\4\2^_\7\33\2\2_`\5\b\5\2`a\7\33\2\2ab\5\n\6\2bc\7\33\2"+
		"\2cd\5\f\7\2de\7\34\2\2ef\5\16\b\2fg\7\33\2\2gh\5\20\t\2hi\7\33\2\2ij"+
		"\5\32\16\2jn\7\33\2\2km\7\33\2\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2"+
		"\2o\5\3\2\2\2pn\3\2\2\2qr\7#\2\2r\7\3\2\2\2st\7/\2\2tu\5\24\13\2u\t\3"+
		"\2\2\2vw\7\60\2\2wx\5\26\f\2x\13\3\2\2\2yz\7\61\2\2z{\5\30\r\2{\r\3\2"+
		"\2\2|}\t\2\2\2}\17\3\2\2\2~\177\7\62\2\2\177\u0080\5\22\n\2\u0080\21\3"+
		"\2\2\2\u0081\u0082\t\3\2\2\u0082\23\3\2\2\2\u0083\u0084\7\20\2\2\u0084"+
		"\25\3\2\2\2\u0085\u0086\7\20\2\2\u0086\27\3\2\2\2\u0087\u0088\7\21\2\2"+
		"\u0088\31\3\2\2\2\u0089\u008a\7\63\2\2\u008a\u008b\5\34\17\2\u008b\33"+
		"\3\2\2\2\u008c\u0093\5\36\20\2\u008d\u0093\5$\23\2\u008e\u0093\5&\24\2"+
		"\u008f\u0093\5(\25\2\u0090\u0093\5*\26\2\u0091\u0093\5@!\2\u0092\u008c"+
		"\3\2\2\2\u0092\u008d\3\2\2\2\u0092\u008e\3\2\2\2\u0092\u008f\3\2\2\2\u0092"+
		"\u0090\3\2\2\2\u0092\u0091\3\2\2\2\u0093\35\3\2\2\2\u0094\u0095\5 \21"+
		"\2\u0095\u0096\5\"\22\2\u0096\37\3\2\2\2\u0097\u0098\7\3\2\2\u0098\u0099"+
		"\7\r\2\2\u0099!\3\2\2\2\u009a\u009b\7\4\2\2\u009b\u009c\7\r\2\2\u009c"+
		"#\3\2\2\2\u009d\u009e\t\4\2\2\u009e%\3\2\2\2\u009f\u00a0\t\5\2\2\u00a0"+
		"\'\3\2\2\2\u00a1\u00a2\7\36\2\2\u00a2\u00a3\7\5\2\2\u00a3\u00a4\7\24\2"+
		"\2\u00a4\u00a5\7\27\2\2\u00a5\u00a6\7\25\2\2\u00a6\u00a7\7\6\2\2\u00a7"+
		"\u00a8\7\26\2\2\u00a8)\3\2\2\2\u00a9\u00af\5,\27\2\u00aa\u00af\5\60\31"+
		"\2\u00ab\u00af\5.\30\2\u00ac\u00af\5\62\32\2\u00ad\u00af\5\64\33\2\u00ae"+
		"\u00a9\3\2\2\2\u00ae\u00aa\3\2\2\2\u00ae\u00ab\3\2\2\2\u00ae\u00ac\3\2"+
		"\2\2\u00ae\u00ad\3\2\2\2\u00af+\3\2\2\2\u00b0\u00b1\5P)\2\u00b1\u00b2"+
		"\7\34\2\2\u00b2\u00b3\5<\37\2\u00b3-\3\2\2\2\u00b4\u00b5\7\36\2\2\u00b5"+
		"\u00b6\5N(\2\u00b6\u00b7\7\34\2\2\u00b7\u00b8\5<\37\2\u00b8/\3\2\2\2\u00b9"+
		"\u00ba\7\36\2\2\u00ba\u00bb\5P)\2\u00bb\u00bc\7\37\2\2\u00bc\u00be\7\16"+
		"\2\2\u00bd\u00bf\7\34\2\2\u00be\u00bd\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0\u00c1\5<\37\2\u00c1\61\3\2\2\2\u00c2\u00c3\7\36\2"+
		"\2\u00c3\u00c4\5P)\2\u00c4\u00c5\7\34\2\2\u00c5\u00c6\5N(\2\u00c6\u00c7"+
		"\7\37\2\2\u00c7\u00c9\7\16\2\2\u00c8\u00ca\7\34\2\2\u00c9\u00c8\3\2\2"+
		"\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\5<\37\2\u00cc\63"+
		"\3\2\2\2\u00cd\u00d1\5\66\34\2\u00ce\u00d1\58\35\2\u00cf\u00d1\5:\36\2"+
		"\u00d0\u00cd\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1\65"+
		"\3\2\2\2\u00d2\u00d3\7\36\2\2\u00d3\u00d4\5<\37\2\u00d4\67\3\2\2\2\u00d5"+
		"\u00d6\7+\2\2\u00d6\u00d7\7\f\2\2\u00d7\u00d8\7\34\2\2\u00d8\u00da\7\23"+
		"\2\2\u00d9\u00db\7\34\2\2\u00da\u00d9\3\2\2\2\u00da\u00db\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc\u00dd\5> \2\u00dd9\3\2\2\2\u00de\u00df\7,\2\2\u00df"+
		"\u00e0\7\f\2\2\u00e0\u00e1\7\34\2\2\u00e1\u00e2\7\23\2\2\u00e2\u00e3\7"+
		"\34\2\2\u00e3\u00e4\5> \2\u00e4;\3\2\2\2\u00e5\u00e6\7 \2\2\u00e6\u00e7"+
		"\5> \2\u00e7=\3\2\2\2\u00e8\u00e9\t\6\2\2\u00e9?\3\2\2\2\u00ea\u00eb\5"+
		"D#\2\u00eb\u00ec\7!\2\2\u00ec\u00f3\3\2\2\2\u00ed\u00ee\7\36\2\2\u00ee"+
		"\u00ef\5B\"\2\u00ef\u00f0\7!\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00f3\5L\'"+
		"\2\u00f2\u00ea\3\2\2\2\u00f2\u00ed\3\2\2\2\u00f2\u00f1\3\2\2\2\u00f3A"+
		"\3\2\2\2\u00f4\u00f8\5J&\2\u00f5\u00f8\5H%\2\u00f6\u00f8\5F$\2\u00f7\u00f4"+
		"\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f6\3\2\2\2\u00f8C\3\2\2\2\u00f9"+
		"\u00fa\5P)\2\u00faE\3\2\2\2\u00fb\u00fc\5N(\2\u00fcG\3\2\2\2\u00fd\u00fe"+
		"\5P)\2\u00fe\u00ff\7\34\2\2\u00ff\u0100\5N(\2\u0100\u0101\7\37\2\2\u0101"+
		"\u0103\7\16\2\2\u0102\u0104\7\34\2\2\u0103\u0102\3\2\2\2\u0103\u0104\3"+
		"\2\2\2\u0104I\3\2\2\2\u0105\u0106\5P)\2\u0106\u0107\7\37\2\2\u0107\u0109"+
		"\7\16\2\2\u0108\u010a\7\34\2\2\u0109\u0108\3\2\2\2\u0109\u010a\3\2\2\2"+
		"\u010aK\3\2\2\2\u010b\u010f\7-\2\2\u010c\u010d\7.\2\2\u010d\u010f\7\f"+
		"\2\2\u010e\u010b\3\2\2\2\u010e\u010c\3\2\2\2\u010fM\3\2\2\2\u0110\u0111"+
		"\7\"\2\2\u0111\u0112\5T+\2\u0112O\3\2\2\2\u0113\u0114\7\35\2\2\u0114\u0115"+
		"\5R*\2\u0115Q\3\2\2\2\u0116\u0117\7\16\2\2\u0117S\3\2\2\2\u0118\u0119"+
		"\7\16\2\2\u0119U\3\2\2\2\17Yn\u0092\u00ae\u00be\u00c9\u00d0\u00da\u00f2"+
		"\u00f7\u0103\u0109\u010e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}