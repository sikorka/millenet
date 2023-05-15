package com.github.sikorka.millenet.credit.history.grammar;// Generated from CreditHistoryMillenet.g4 by ANTLR 4.8

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CreditHistoryMillenetLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "WYPLATA", "WYPLATA_URUCHOMIENIE", "WYPLATA_TRANSZA", 
			"OPLATA_PROWIZJA", "OPLATA_URUCHOMIENIE", "IDENTIFIER", "STOPA_NUMBER", 
			"KWOTA", "DATE", "AMOUNT", "CHF", "PLN", "DIGIT", "TWODIGIT", "THREEDIGIT", 
			"SIXDIGIT", "EIGHTDIGIT", "CAPITAL_LETTER", "THREE_CAPITAL_LETTERS", 
			"SPECIAL", "COMMA", "DOT", "NEWLINE", "SPACE", "Odsetki_space", "Kapital_space", 
			"Space_kwota_raty_kapital_odsetki_space", "Platnosc_czesciowa_wal_pln", 
			"Space_splata_raty_kredytu", "Odsetki_przeterminowane_space", "Potwierdzenie_wykonania_operacji", 
			"Header", "Wyplata_kredytu", "Naliczenie_oplat", "Sp_raty_nieplanowana", 
			"Spl_raty_regularna", "Dodatkowa_wy_kredytu", "Zmiana_stopy_proc", "Sp_raty_nieregularna", 
			"Kapital_spl_dysp_x", "Kapital_dysp_ddn_x", "Kapital_splata_raty_kredytu", 
			"Kapital_splata_raty_w_pln"
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


	public CreditHistoryMillenetLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CreditHistoryMillenet.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2.\u036d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\6\6\u00c7\n\6\r\6\16\6\u00c8\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\6\6\u00e8\n\6\r\6\16\6\u00e9\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\6\13\u014d\n\13\r\13\16\13\u014e\3\13\3\13\6\13"+
		"\u0153\n\13\r\13\16\13\u0154\3\f\7\f\u0158\n\f\f\f\16\f\u015b\13\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\r\7\r\u0163\n\r\f\r\16\r\u0166\13\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\17\6\17\u0173\n\17\r\17\16\17\u0174\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3"+
		"\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\6\35\u01a0"+
		"\n\35\r\35\16\35\u01a1\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$"+
		"\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%"+
		"\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3"+
		",\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3"+
		"-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3/\3"+
		"/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\2\2\61\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\2%\2\'\23)\24+\25-\2/\26\61\27\63\30\65\31\67\329\33"+
		";\34=\35?\36A\37C E!G\"I#K$M%O&Q\'S(U)W*Y+[,]-_.\3\2\6\3\2\62;\3\2C\\"+
		"\6\2*+--/\61<=\3\2\"\"\2\u0371\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3"+
		"\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\3a\3\2\2"+
		"\2\5x\3\2\2\2\7\u0096\3\2\2\2\t\u009c\3\2\2\2\13\u009e\3\2\2\2\r\u00eb"+
		"\3\2\2\2\17\u00fa\3\2\2\2\21\u0104\3\2\2\2\23\u0123\3\2\2\2\25\u014c\3"+
		"\2\2\2\27\u0159\3\2\2\2\31\u0164\3\2\2\2\33\u016a\3\2\2\2\35\u0172\3\2"+
		"\2\2\37\u0179\3\2\2\2!\u017d\3\2\2\2#\u0181\3\2\2\2%\u0183\3\2\2\2\'\u0186"+
		"\3\2\2\2)\u0189\3\2\2\2+\u018d\3\2\2\2-\u0190\3\2\2\2/\u0192\3\2\2\2\61"+
		"\u0196\3\2\2\2\63\u0198\3\2\2\2\65\u019a\3\2\2\2\67\u019c\3\2\2\29\u019f"+
		"\3\2\2\2;\u01a3\3\2\2\2=\u01ac\3\2\2\2?\u01b5\3\2\2\2A\u01d6\3\2\2\2C"+
		"\u01f7\3\2\2\2E\u020c\3\2\2\2G\u021e\3\2\2\2I\u023f\3\2\2\2K\u028b\3\2"+
		"\2\2M\u029b\3\2\2\2O\u02ac\3\2\2\2Q\u02c1\3\2\2\2S\u02d4\3\2\2\2U\u02e9"+
		"\3\2\2\2W\u02fc\3\2\2\2Y\u0311\3\2\2\2[\u0324\3\2\2\2]\u0337\3\2\2\2_"+
		"\u0353\3\2\2\2ab\7P\2\2bc\7Q\2\2cd\7Y\2\2de\7C\2\2ef\7\"\2\2fg\7U\2\2"+
		"gh\7V\2\2hi\7Q\2\2ij\7R\2\2jk\7C\2\2kl\7\"\2\2lm\7R\2\2mn\7T\2\2no\7Q"+
		"\2\2op\7E\2\2pq\7G\2\2qr\7P\2\2rs\7V\2\2st\7Q\2\2tu\7Y\2\2uv\7C\2\2vw"+
		"\7\"\2\2w\4\3\2\2\2xy\7\"\2\2yz\7R\2\2z{\7Q\2\2{|\7R\2\2|}\7T\2\2}~\7"+
		"\\\2\2~\177\7G\2\2\177\u0080\7F\2\2\u0080\u0081\7P\2\2\u0081\u0082\7K"+
		"\2\2\u0082\u0083\7C\2\2\u0083\u0084\7\"\2\2\u0084\u0085\7U\2\2\u0085\u0086"+
		"\7V\2\2\u0086\u0087\7Q\2\2\u0087\u0088\7R\2\2\u0088\u0089\7C\2\2\u0089"+
		"\u008a\7\"\2\2\u008a\u008b\7R\2\2\u008b\u008c\7T\2\2\u008c\u008d\7Q\2"+
		"\2\u008d\u008e\7E\2\2\u008e\u008f\7G\2\2\u008f\u0090\7P\2\2\u0090\u0091"+
		"\7V\2\2\u0091\u0092\7Q\2\2\u0092\u0093\7Y\2\2\u0093\u0094\7C\2\2\u0094"+
		"\u0095\7\"\2\2\u0095\6\3\2\2\2\u0096\u0097\7R\2\2\u0097\u0098\7Q\2\2\u0098"+
		"\u0099\7V\2\2\u0099\u009a\7T\2\2\u009a\u009b\7\60\2\2\u009b\b\3\2\2\2"+
		"\u009c\u009d\7|\2\2\u009d\n\3\2\2\2\u009e\u009f\7M\2\2\u009f\u00a0\7C"+
		"\2\2\u00a0\u00a1\7R\2\2\u00a1\u00a2\7K\2\2\u00a2\u00a3\7V\2\2\u00a3\u00a4"+
		"\7C\2\2\u00a4\u00a5\7\u0143\2\2\u00a5\u00a6\7\"\2\2\u00a6\u00a7\7M\2\2"+
		"\u00a7\u00a8\7Y\2\2\u00a8\u00a9\7Q\2\2\u00a9\u00aa\7V\2\2\u00aa\u00ab"+
		"\7C\2\2\u00ab\u00ac\7\"\2\2\u00ac\u00ad\7Y\2\2\u00ad\u00ae\7[\2\2\u00ae"+
		"\u00af\7R\2\2\u00af\u00b0\7\u0143\2\2\u00b0\u00b1\7C\2\2\u00b1\u00b2\7"+
		"V\2\2\u00b2\u00b3\7[\2\2\u00b3\u00b4\7\"\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"\u00b6\5\31\r\2\u00b6\u00b7\7\"\2\2\u00b7\u00b8\7V\2\2\u00b8\u00b9\7["+
		"\2\2\u00b9\u00ba\7R\2\2\u00ba\u00bb\7\"\2\2\u00bb\u00bc\7T\2\2\u00bc\u00bd"+
		"\7C\2\2\u00bd\u00be\7E\2\2\u00be\u00bf\7J\2\2\u00bf\u00c0\7W\2\2\u00c0"+
		"\u00c1\7P\2\2\u00c1\u00c2\7M\2\2\u00c2\u00c3\7W\2\2\u00c3\u00c4\7\"\2"+
		"\2\u00c4\u00c6\3\2\2\2\u00c5\u00c7\5#\22\2\u00c6\u00c5\3\2\2\2\u00c7\u00c8"+
		"\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"\u00cb\7\"\2\2\u00cb\u00cc\7P\2\2\u00cc\u00cd\7W\2\2\u00cd\u00ce\7O\2"+
		"\2\u00ce\u00cf\7G\2\2\u00cf\u00d0\7T\2\2\u00d0\u00d1\7\"\2\2\u00d1\u00d2"+
		"\7T\2\2\u00d2\u00d3\7C\2\2\u00d3\u00d4\7E\2\2\u00d4\u00d5\7J\2\2\u00d5"+
		"\u00d6\7W\2\2\u00d6\u00d7\7P\2\2\u00d7\u00d8\7M\2\2\u00d8\u00d9\7W\2\2"+
		"\u00d9\u00da\7\"\2\2\u00da\u00db\7F\2\2\u00db\u00dc\7Q\2\2\u00dc\u00dd"+
		"\7\"\2\2\u00dd\u00de\7Y\2\2\u00de\u00df\7[\2\2\u00df\u00e0\7R\2\2\u00e0"+
		"\u00e1\7\u0143\2\2\u00e1\u00e2\7C\2\2\u00e2\u00e3\7V\2\2\u00e3\u00e4\7"+
		"[\2\2\u00e4\u00e5\7\"\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00e8\5#\22\2\u00e7"+
		"\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2"+
		"\2\2\u00ea\f\3\2\2\2\u00eb\u00ec\5\13\6\2\u00ec\u00ed\7\"\2\2\u00ed\u00ee"+
		"\7W\2\2\u00ee\u00ef\7T\2\2\u00ef\u00f0\7W\2\2\u00f0\u00f1\7E\2\2\u00f1"+
		"\u00f2\7J\2\2\u00f2\u00f3\7Q\2\2\u00f3\u00f4\7O\2\2\u00f4\u00f5\7K\2\2"+
		"\u00f5\u00f6\7G\2\2\u00f6\u00f7\7P\2\2\u00f7\u00f8\7K\2\2\u00f8\u00f9"+
		"\7G\2\2\u00f9\16\3\2\2\2\u00fa\u00fb\5\13\6\2\u00fb\u00fc\7\"\2\2\u00fc"+
		"\u00fd\7V\2\2\u00fd\u00fe\7T\2\2\u00fe\u00ff\7C\2\2\u00ff\u0100\7P\2\2"+
		"\u0100\u0101\7U\2\2\u0101\u0102\7\\\2\2\u0102\u0103\7C\2\2\u0103\20\3"+
		"\2\2\2\u0104\u0105\7Q\2\2\u0105\u0106\7R\2\2\u0106\u0107\7\u0143\2\2\u0107"+
		"\u0108\7C\2\2\u0108\u0109\7V\2\2\u0109\u010a\7C\2\2\u010a\u010b\7\"\2"+
		"\2\u010b\u010c\7\63\2\2\u010c\u010d\7\"\2\2\u010d\u010e\3\2\2\2\u010e"+
		"\u010f\5\31\r\2\u010f\u0110\7\"\2\2\u0110\u0111\7R\2\2\u0111\u0112\7T"+
		"\2\2\u0112\u0113\7Q\2\2\u0113\u0114\7Y\2\2\u0114\u0115\7K\2\2\u0115\u0116"+
		"\7\\\2\2\u0116\u0117\7L\2\2\u0117\u0118\7C\2\2\u0118\u0119\7\"\2\2\u0119"+
		"\u011a\7\\\2\2\u011a\u011b\7C\2\2\u011b\u011c\7\"\2\2\u011c\u011d\7M\2"+
		"\2\u011d\u011e\7T\2\2\u011e\u011f\7G\2\2\u011f\u0120\7F\2\2\u0120\u0121"+
		"\7[\2\2\u0121\u0122\7V\2\2\u0122\22\3\2\2\2\u0123\u0124\7M\2\2\u0124\u0125"+
		"\7Y\2\2\u0125\u0126\7Q\2\2\u0126\u0127\7V\2\2\u0127\u0128\7C\2\2\u0128"+
		"\u0129\7\"\2\2\u0129\u012a\7Q\2\2\u012a\u012b\7R\2\2\u012b\u012c\7\u0143"+
		"\2\2\u012c\u012d\7C\2\2\u012d\u012e\7V\2\2\u012e\u012f\7[\2\2\u012f\u0130"+
		"\7\"\2\2\u0130\u0131\7V\2\2\u0131\u0132\7[\2\2\u0132\u0133\7R\2\2\u0133"+
		"\u0134\7\"\2\2\u0134\u0135\7Q\2\2\u0135\u0136\7R\2\2\u0136\u0137\7\u0143"+
		"\2\2\u0137\u0138\7C\2\2\u0138\u0139\7V\2\2\u0139\u013a\7[\2\2\u013a\u013b"+
		"\7\"\2\2\u013b\u013c\3\2\2\2\u013c\u013d\5#\22\2\u013d\u013e\7\"\2\2\u013e"+
		"\u013f\7W\2\2\u013f\u0140\7T\2\2\u0140\u0141\7W\2\2\u0141\u0142\7E\2\2"+
		"\u0142\u0143\7J\2\2\u0143\u0144\7Q\2\2\u0144\u0145\7O\2\2\u0145\u0146"+
		"\7K\2\2\u0146\u0147\7G\2\2\u0147\u0148\7P\2\2\u0148\u0149\7K\2\2\u0149"+
		"\u014a\7G\2\2\u014a\24\3\2\2\2\u014b\u014d\5#\22\2\u014c\u014b\3\2\2\2"+
		"\u014d\u014e\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150"+
		"\3\2\2\2\u0150\u0152\7/\2\2\u0151\u0153\5#\22\2\u0152\u0151\3\2\2\2\u0153"+
		"\u0154\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\26\3\2\2"+
		"\2\u0156\u0158\5#\22\2\u0157\u0156\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157"+
		"\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015c\3\2\2\2\u015b\u0159\3\2\2\2\u015c"+
		"\u015d\5\65\33\2\u015d\u015e\5%\23\2\u015e\u015f\5%\23\2\u015f\u0160\5"+
		"#\22\2\u0160\30\3\2\2\2\u0161\u0163\5#\22\2\u0162\u0161\3\2\2\2\u0163"+
		"\u0166\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0167\3\2"+
		"\2\2\u0166\u0164\3\2\2\2\u0167\u0168\5\65\33\2\u0168\u0169\5%\23\2\u0169"+
		"\32\3\2\2\2\u016a\u016b\5%\23\2\u016b\u016c\5%\23\2\u016c\u016d\7/\2\2"+
		"\u016d\u016e\5%\23\2\u016e\u016f\7/\2\2\u016f\u0170\5%\23\2\u0170\34\3"+
		"\2\2\2\u0171\u0173\5#\22\2\u0172\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174"+
		"\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177\5\63"+
		"\32\2\u0177\u0178\5%\23\2\u0178\36\3\2\2\2\u0179\u017a\7E\2\2\u017a\u017b"+
		"\7J\2\2\u017b\u017c\7H\2\2\u017c \3\2\2\2\u017d\u017e\7R\2\2\u017e\u017f"+
		"\7N\2\2\u017f\u0180\7P\2\2\u0180\"\3\2\2\2\u0181\u0182\t\2\2\2\u0182$"+
		"\3\2\2\2\u0183\u0184\5#\22\2\u0184\u0185\5#\22\2\u0185&\3\2\2\2\u0186"+
		"\u0187\5%\23\2\u0187\u0188\5#\22\2\u0188(\3\2\2\2\u0189\u018a\5%\23\2"+
		"\u018a\u018b\5%\23\2\u018b\u018c\5%\23\2\u018c*\3\2\2\2\u018d\u018e\5"+
		")\25\2\u018e\u018f\5%\23\2\u018f,\3\2\2\2\u0190\u0191\t\3\2\2\u0191.\3"+
		"\2\2\2\u0192\u0193\5-\27\2\u0193\u0194\5-\27\2\u0194\u0195\5-\27\2\u0195"+
		"\60\3\2\2\2\u0196\u0197\t\4\2\2\u0197\62\3\2\2\2\u0198\u0199\7.\2\2\u0199"+
		"\64\3\2\2\2\u019a\u019b\7\60\2\2\u019b\66\3\2\2\2\u019c\u019d\7\f\2\2"+
		"\u019d8\3\2\2\2\u019e\u01a0\t\5\2\2\u019f\u019e\3\2\2\2\u01a0\u01a1\3"+
		"\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2:\3\2\2\2\u01a3\u01a4"+
		"\7Q\2\2\u01a4\u01a5\7F\2\2\u01a5\u01a6\7U\2\2\u01a6\u01a7\7G\2\2\u01a7"+
		"\u01a8\7V\2\2\u01a8\u01a9\7M\2\2\u01a9\u01aa\7K\2\2\u01aa\u01ab\7\"\2"+
		"\2\u01ab<\3\2\2\2\u01ac\u01ad\7M\2\2\u01ad\u01ae\7C\2\2\u01ae\u01af\7"+
		"R\2\2\u01af\u01b0\7K\2\2\u01b0\u01b1\7V\2\2\u01b1\u01b2\7C\2\2\u01b2\u01b3"+
		"\7\u0143\2\2\u01b3\u01b4\7\"\2\2\u01b4>\3\2\2\2\u01b5\u01b6\7\"\2\2\u01b6"+
		"\u01b7\7M\2\2\u01b7\u01b8\7Y\2\2\u01b8\u01b9\7Q\2\2\u01b9\u01ba\7V\2\2"+
		"\u01ba\u01bb\7C\2\2\u01bb\u01bc\7\"\2\2\u01bc\u01bd\7T\2\2\u01bd\u01be"+
		"\7C\2\2\u01be\u01bf\7V\2\2\u01bf\u01c0\7[\2\2\u01c0\u01c1\7\"\2\2\u01c1"+
		"\u01c2\7*\2\2\u01c2\u01c3\7M\2\2\u01c3\u01c4\7C\2\2\u01c4\u01c5\7R\2\2"+
		"\u01c5\u01c6\7K\2\2\u01c6\u01c7\7V\2\2\u01c7\u01c8\7C\2\2\u01c8\u01c9"+
		"\7\u0143\2\2\u01c9\u01ca\7\"\2\2\u01ca\u01cb\7-\2\2\u01cb\u01cc\7\"\2"+
		"\2\u01cc\u01cd\7Q\2\2\u01cd\u01ce\7F\2\2\u01ce\u01cf\7U\2\2\u01cf\u01d0"+
		"\7G\2\2\u01d0\u01d1\7V\2\2\u01d1\u01d2\7M\2\2\u01d2\u01d3\7K\2\2\u01d3"+
		"\u01d4\7+\2\2\u01d4\u01d5\7\"\2\2\u01d5@\3\2\2\2\u01d6\u01d7\7R\2\2\u01d7"+
		"\u01d8\7\u0143\2\2\u01d8\u01d9\7C\2\2\u01d9\u01da\7V\2\2\u01da\u01db\7"+
		"P\2\2\u01db\u01dc\7Q\2\2\u01dc\u01dd\7\u015c\2\2\u01dd\u01de\7\u0108\2"+
		"\2\u01de\u01df\7\"\2\2\u01df\u01e0\7E\2\2\u01e0\u01e1\7\\\2\2\u01e1\u01e2"+
		"\7\u011a\2\2\u01e2\u01e3\7\u015c\2\2\u01e3\u01e4\7E\2\2\u01e4\u01e5\7"+
		"K\2\2\u01e5\u01e6\7Q\2\2\u01e6\u01e7\7Y\2\2\u01e7\u01e8\7C\2\2\u01e8\u01e9"+
		"\7\"\2\2\u01e9\u01ea\7/\2\2\u01ea\u01eb\7\"\2\2\u01eb\u01ec\7Y\2\2\u01ec"+
		"\u01ed\7C\2\2\u01ed\u01ee\7N\2\2\u01ee\u01ef\7\61\2\2\u01ef\u01f0\7R\2"+
		"\2\u01f0\u01f1\7N\2\2\u01f1\u01f2\7P\2\2\u01f2\u01f3\7\"\2\2\u01f3\u01f4"+
		"\7R\2\2\u01f4\u01f5\7N\2\2\u01f5\u01f6\7P\2\2\u01f6B\3\2\2\2\u01f7\u01f8"+
		"\7\"\2\2\u01f8\u01f9\7U\2\2\u01f9\u01fa\7R\2\2\u01fa\u01fb\7\u0143\2\2"+
		"\u01fb\u01fc\7C\2\2\u01fc\u01fd\7V\2\2\u01fd\u01fe\7C\2\2\u01fe\u01ff"+
		"\7\"\2\2\u01ff\u0200\7T\2\2\u0200\u0201\7C\2\2\u0201\u0202\7V\2\2\u0202"+
		"\u0203\7[\2\2\u0203\u0204\7\"\2\2\u0204\u0205\7M\2\2\u0205\u0206\7T\2"+
		"\2\u0206\u0207\7G\2\2\u0207\u0208\7F\2\2\u0208\u0209\7[\2\2\u0209\u020a"+
		"\7V\2\2\u020a\u020b\7W\2\2\u020bD\3\2\2\2\u020c\u020d\5;\36\2\u020d\u020e"+
		"\7R\2\2\u020e\u020f\7T\2\2\u020f\u0210\7\\\2\2\u0210\u0211\7G\2\2\u0211"+
		"\u0212\7V\2\2\u0212\u0213\7G\2\2\u0213\u0214\7T\2\2\u0214\u0215\7O\2\2"+
		"\u0215\u0216\7K\2\2\u0216\u0217\7P\2\2\u0217\u0218\7Q\2\2\u0218\u0219"+
		"\7Y\2\2\u0219\u021a\7C\2\2\u021a\u021b\7P\2\2\u021b\u021c\7G\2\2\u021c"+
		"\u021d\7\"\2\2\u021dF\3\2\2\2\u021e\u021f\7R\2\2\u021f\u0220\7q\2\2\u0220"+
		"\u0221\7v\2\2\u0221\u0222\7y\2\2\u0222\u0223\7k\2\2\u0223\u0224\7g\2\2"+
		"\u0224\u0225\7t\2\2\u0225\u0226\7f\2\2\u0226\u0227\7|\2\2\u0227\u0228"+
		"\7g\2\2\u0228\u0229\7p\2\2\u0229\u022a\7k\2\2\u022a\u022b\7g\2\2\u022b"+
		"\u022c\7\"\2\2\u022c\u022d\7y\2\2\u022d\u022e\7{\2\2\u022e\u022f\7m\2"+
		"\2\u022f\u0230\7q\2\2\u0230\u0231\7p\2\2\u0231\u0232\7c\2\2\u0232\u0233"+
		"\7p\2\2\u0233\u0234\7k\2\2\u0234\u0235\7c\2\2\u0235\u0236\7\"\2\2\u0236"+
		"\u0237\7q\2\2\u0237\u0238\7r\2\2\u0238\u0239\7g\2\2\u0239\u023a\7t\2\2"+
		"\u023a\u023b\7c\2\2\u023b\u023c\7e\2\2\u023c\u023d\7l\2\2\u023d\u023e"+
		"\7k\2\2\u023eH\3\2\2\2\u023f\u0240\7F\2\2\u0240\u0241\7c\2\2\u0241\u0242"+
		"\7v\2\2\u0242\u0243\7c\2\2\u0243\u0244\7\"\2\2\u0244\u0245\7v\2\2\u0245"+
		"\u0246\7t\2\2\u0246\u0247\7c\2\2\u0247\u0248\7p\2\2\u0248\u0249\7u\2\2"+
		"\u0249\u024a\7c\2\2\u024a\u024b\7m\2\2\u024b\u024c\7e\2\2\u024c\u024d"+
		"\7l\2\2\u024d\u024e\7k\2\2\u024e\u024f\7\"\2\2\u024f\u0250\7F\2\2\u0250"+
		"\u0251\7c\2\2\u0251\u0252\7v\2\2\u0252\u0253\7c\2\2\u0253\u0254\7\"\2"+
		"\2\u0254\u0255\7y\2\2\u0255\u0256\7c\2\2\u0256\u0257\7n\2\2\u0257\u0258"+
		"\7w\2\2\u0258\u0259\7v\2\2\u0259\u025a\7{\2\2\u025a\u025b\7\"\2\2\u025b"+
		"\u025c\7M\2\2\u025c\u025d\7y\2\2\u025d\u025e\7q\2\2\u025e\u025f\7v\2\2"+
		"\u025f\u0260\7c\2\2\u0260\u0261\7\"\2\2\u0261\u0262\7v\2\2\u0262\u0263"+
		"\7t\2\2\u0263\u0264\7c\2\2\u0264\u0265\7p\2\2\u0265\u0266\7u\2\2\u0266"+
		"\u0267\7c\2\2\u0267\u0268\7m\2\2\u0268\u0269\7e\2\2\u0269\u026a\7l\2\2"+
		"\u026a\u026b\7k\2\2\u026b\u026c\7\"\2\2\u026c\u026d\7V\2\2\u026d\u026e"+
		"\7{\2\2\u026e\u026f\7r\2\2\u026f\u0270\7\"\2\2\u0270\u0271\7v\2\2\u0271"+
		"\u0272\7t\2\2\u0272\u0273\7c\2\2\u0273\u0274\7p\2\2\u0274\u0275\7u\2\2"+
		"\u0275\u0276\7c\2\2\u0276\u0277\7m\2\2\u0277\u0278\7e\2\2\u0278\u0279"+
		"\7l\2\2\u0279\u027a\7k\2\2\u027a\u027b\7<\2\2\u027b\u027c\7\"\2\2\u027c"+
		"\u027d\7V\2\2\u027d\u027e\7{\2\2\u027e\u027f\7v\2\2\u027f\u0280\7w\2\2"+
		"\u0280\u0281\7\u0144\2\2\u0281\u0282\7\"\2\2\u0282\u0283\7q\2\2\u0283"+
		"\u0284\7r\2\2\u0284\u0285\7g\2\2\u0285\u0286\7t\2\2\u0286\u0287\7c\2\2"+
		"\u0287\u0288\7e\2\2\u0288\u0289\7l\2\2\u0289\u028a\7k\2\2\u028aJ\3\2\2"+
		"\2\u028b\u028c\7Y\2\2\u028c\u028d\7[\2\2\u028d\u028e\7R\2\2\u028e\u028f"+
		"\7\u0143\2\2\u028f\u0290\7C\2\2\u0290\u0291\7V\2\2\u0291\u0292\7C\2\2"+
		"\u0292\u0293\7\"\2\2\u0293\u0294\7M\2\2\u0294\u0295\7T\2\2\u0295\u0296"+
		"\7G\2\2\u0296\u0297\7F\2\2\u0297\u0298\7[\2\2\u0298\u0299\7V\2\2\u0299"+
		"\u029a\7W\2\2\u029aL\3\2\2\2\u029b\u029c\7P\2\2\u029c\u029d\7C\2\2\u029d"+
		"\u029e\7N\2\2\u029e\u029f\7K\2\2\u029f\u02a0\7E\2\2\u02a0\u02a1\7\\\2"+
		"\2\u02a1\u02a2\7G\2\2\u02a2\u02a3\7P\2\2\u02a3\u02a4\7K\2\2\u02a4\u02a5"+
		"\7G\2\2\u02a5\u02a6\7\"\2\2\u02a6\u02a7\7Q\2\2\u02a7\u02a8\7R\2\2\u02a8"+
		"\u02a9\7\u0143\2\2\u02a9\u02aa\7C\2\2\u02aa\u02ab\7V\2\2\u02abN\3\2\2"+
		"\2\u02ac\u02ad\7U\2\2\u02ad\u02ae\7R\2\2\u02ae\u02af\7\60\2\2\u02af\u02b0"+
		"\7T\2\2\u02b0\u02b1\7C\2\2\u02b1\u02b2\7V\2\2\u02b2\u02b3\7[\2\2\u02b3"+
		"\u02b4\7/\2\2\u02b4\u02b5\7P\2\2\u02b5\u02b6\7K\2\2\u02b6\u02b7\7G\2\2"+
		"\u02b7\u02b8\7R\2\2\u02b8\u02b9\7N\2\2\u02b9\u02ba\7C\2\2\u02ba\u02bb"+
		"\7P\2\2\u02bb\u02bc\7Q\2\2\u02bc\u02bd\7Y\2\2\u02bd\u02be\7C\2\2\u02be"+
		"\u02bf\7P\2\2\u02bf\u02c0\7C\2\2\u02c0P\3\2\2\2\u02c1\u02c2\7U\2\2\u02c2"+
		"\u02c3\7R\2\2\u02c3\u02c4\7\u0143\2\2\u02c4\u02c5\7\60\2\2\u02c5\u02c6"+
		"\7T\2\2\u02c6\u02c7\7C\2\2\u02c7\u02c8\7V\2\2\u02c8\u02c9\7[\2\2\u02c9"+
		"\u02ca\7/\2\2\u02ca\u02cb\7T\2\2\u02cb\u02cc\7G\2\2\u02cc\u02cd\7I\2\2"+
		"\u02cd\u02ce\7W\2\2\u02ce\u02cf\7N\2\2\u02cf\u02d0\7C\2\2\u02d0\u02d1"+
		"\7T\2\2\u02d1\u02d2\7P\2\2\u02d2\u02d3\7C\2\2\u02d3R\3\2\2\2\u02d4\u02d5"+
		"\7F\2\2\u02d5\u02d6\7Q\2\2\u02d6\u02d7\7F\2\2\u02d7\u02d8\7C\2\2\u02d8"+
		"\u02d9\7V\2\2\u02d9\u02da\7M\2\2\u02da\u02db\7Q\2\2\u02db\u02dc\7Y\2\2"+
		"\u02dc\u02dd\7C\2\2\u02dd\u02de\7\"\2\2\u02de\u02df\7Y\2\2\u02df\u02e0"+
		"\7[\2\2\u02e0\u02e1\7\60\2\2\u02e1\u02e2\7M\2\2\u02e2\u02e3\7T\2\2\u02e3"+
		"\u02e4\7G\2\2\u02e4\u02e5\7F\2\2\u02e5\u02e6\7[\2\2\u02e6\u02e7\7V\2\2"+
		"\u02e7\u02e8\7W\2\2\u02e8T\3\2\2\2\u02e9\u02ea\7\\\2\2\u02ea\u02eb\7O"+
		"\2\2\u02eb\u02ec\7K\2\2\u02ec\u02ed\7C\2\2\u02ed\u02ee\7P\2\2\u02ee\u02ef"+
		"\7C\2\2\u02ef\u02f0\7\"\2\2\u02f0\u02f1\7U\2\2\u02f1\u02f2\7V\2\2\u02f2"+
		"\u02f3\7Q\2\2\u02f3\u02f4\7R\2\2\u02f4\u02f5\7[\2\2\u02f5\u02f6\7\"\2"+
		"\2\u02f6\u02f7\7R\2\2\u02f7\u02f8\7T\2\2\u02f8\u02f9\7Q\2\2\u02f9\u02fa"+
		"\7E\2\2\u02fa\u02fb\7\60\2\2\u02fbV\3\2\2\2\u02fc\u02fd\7U\2\2\u02fd\u02fe"+
		"\7R\2\2\u02fe\u02ff\7\60\2\2\u02ff\u0300\7T\2\2\u0300\u0301\7C\2\2\u0301"+
		"\u0302\7V\2\2\u0302\u0303\7[\2\2\u0303\u0304\7/\2\2\u0304\u0305\7P\2\2"+
		"\u0305\u0306\7K\2\2\u0306\u0307\7G\2\2\u0307\u0308\7T\2\2\u0308\u0309"+
		"\7G\2\2\u0309\u030a\7I\2\2\u030a\u030b\7W\2\2\u030b\u030c\7N\2\2\u030c"+
		"\u030d\7C\2\2\u030d\u030e\7T\2\2\u030e\u030f\7P\2\2\u030f\u0310\7C\2\2"+
		"\u0310X\3\2\2\2\u0311\u0312\7M\2\2\u0312\u0313\7C\2\2\u0313\u0314\7R\2"+
		"\2\u0314\u0315\7K\2\2\u0315\u0316\7V\2\2\u0316\u0317\7C\2\2\u0317\u0318"+
		"\7\u0143\2\2\u0318\u0319\7\"\2\2\u0319\u031a\7U\2\2\u031a\u031b\7r\2\2"+
		"\u031b\u031c\7\u0144\2\2\u031c\u031d\7\60\2\2\u031d\u031e\7f\2\2\u031e"+
		"\u031f\7{\2\2\u031f\u0320\7u\2\2\u0320\u0321\7r\2\2\u0321\u0322\7\60\2"+
		"\2\u0322\u0323\7z\2\2\u0323Z\3\2\2\2\u0324\u0325\7M\2\2\u0325\u0326\7"+
		"C\2\2\u0326\u0327\7R\2\2\u0327\u0328\7K\2\2\u0328\u0329\7V\2\2\u0329\u032a"+
		"\7C\2\2\u032a\u032b\7\u0143\2\2\u032b\u032c\7\"\2\2\u032c\u032d\7F\2\2"+
		"\u032d\u032e\7[\2\2\u032e\u032f\7U\2\2\u032f\u0330\7R\2\2\u0330\u0331"+
		"\7\"\2\2\u0331\u0332\7F\2\2\u0332\u0333\7F\2\2\u0333\u0334\7P\2\2\u0334"+
		"\u0335\7\"\2\2\u0335\u0336\7Z\2\2\u0336\\\3\2\2\2\u0337\u0338\7M\2\2\u0338"+
		"\u0339\7C\2\2\u0339\u033a\7R\2\2\u033a\u033b\7K\2\2\u033b\u033c\7V\2\2"+
		"\u033c\u033d\7C\2\2\u033d\u033e\7\u0143\2\2\u033e\u033f\7\"\2\2\u033f"+
		"\u0340\7U\2\2\u0340\u0341\7R\2\2\u0341\u0342\7\u0143\2\2\u0342\u0343\7"+
		"C\2\2\u0343\u0344\7V\2\2\u0344\u0345\7C\2\2\u0345\u0346\7\"\2\2\u0346"+
		"\u0347\7T\2\2\u0347\u0348\7C\2\2\u0348\u0349\7V\2\2\u0349\u034a\7[\2\2"+
		"\u034a\u034b\7\"\2\2\u034b\u034c\7M\2\2\u034c\u034d\7T\2\2\u034d\u034e"+
		"\7G\2\2\u034e\u034f\7F\2\2\u034f\u0350\7[\2\2\u0350\u0351\7V\2\2\u0351"+
		"\u0352\7W\2\2\u0352^\3\2\2\2\u0353\u0354\7M\2\2\u0354\u0355\7C\2\2\u0355"+
		"\u0356\7R\2\2\u0356\u0357\7K\2\2\u0357\u0358\7V\2\2\u0358\u0359\7C\2\2"+
		"\u0359\u035a\7\u0143\2\2\u035a\u035b\7\"\2\2\u035b\u035c\7U\2\2\u035c"+
		"\u035d\7r\2\2\u035d\u035e\7\u0144\2\2\u035e\u035f\7c\2\2\u035f\u0360\7"+
		"v\2\2\u0360\u0361\7c\2\2\u0361\u0362\7\"\2\2\u0362\u0363\7t\2\2\u0363"+
		"\u0364\7c\2\2\u0364\u0365\7v\2\2\u0365\u0366\7{\2\2\u0366\u0367\7\"\2"+
		"\2\u0367\u0368\7y\2\2\u0368\u0369\7\"\2\2\u0369\u036a\7R\2\2\u036a\u036b"+
		"\7N\2\2\u036b\u036c\7P\2\2\u036c`\3\2\2\2\13\2\u00c8\u00e9\u014e\u0154"+
		"\u0159\u0164\u0174\u01a1\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}