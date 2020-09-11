// Generated from br\u005Cufscar\dc\compiladores\receitahtml\receitaHTMLsintatico.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores.receitahtml;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class receitaHTMLsintaticoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		PALAVRAS_RESERVADAS=18, NUM_INT=19, INSTRUCAO_PARAEXECUCAO=20, IdentVarfuncCham=21, 
		STRING=22, CARACTERESIGNORADOS=23, COMENTARIO=24, COMENTARIOSEMBARRA=25, 
		CADEIANFECHADA=26, ErrorCharacter=27, LOOP=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"PALAVRAS_RESERVADAS", "NUM_INT", "INSTRUCAO_PARAEXECUCAO", "IdentVarfuncCham", 
			"STRING", "ESC_SEQ", "CARACTERESIGNORADOS", "COMENTARIO", "COMENTARIOSEMBARRA", 
			"CADEIANFECHADA", "ErrorCharacter", "LOOP"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'NOME'", "':'", "'DESCRICAO'", "'RENDIMENTO'", "'TEMPO'", "'DE'", 
			"'PREPARO'", "'-'", "'='", "'{'", "'*'", "'}'", "'MODO'", "'.'", "'('", 
			"'+'", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "PALAVRAS_RESERVADAS", "NUM_INT", 
			"INSTRUCAO_PARAEXECUCAO", "IdentVarfuncCham", "STRING", "CARACTERESIGNORADOS", 
			"COMENTARIO", "COMENTARIOSEMBARRA", "CADEIANFECHADA", "ErrorCharacter", 
			"LOOP"
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


	public receitaHTMLsintaticoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "receitaHTMLsintatico.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 23:
			CARACTERESIGNORADOS_action((RuleContext)_localctx, actionIndex);
			break;
		case 24:
			COMENTARIO_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void CARACTERESIGNORADOS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}
	private void COMENTARIO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u0120\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00c5\n\23\3\24"+
		"\6\24\u00c8\n\24\r\24\16\24\u00c9\3\25\6\25\u00cd\n\25\r\25\16\25\u00ce"+
		"\3\25\3\25\7\25\u00d3\n\25\f\25\16\25\u00d6\13\25\3\26\3\26\7\26\u00da"+
		"\n\26\f\26\16\26\u00dd\13\26\3\27\3\27\3\27\7\27\u00e2\n\27\f\27\16\27"+
		"\u00e5\13\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\7"+
		"\32\u00f2\n\32\f\32\16\32\u00f5\13\32\3\32\7\32\u00f8\n\32\f\32\16\32"+
		"\u00fb\13\32\3\32\3\32\3\32\3\33\3\33\7\33\u0102\n\33\f\33\16\33\u0105"+
		"\13\33\3\33\7\33\u0108\n\33\f\33\16\33\u010b\13\33\3\33\3\33\3\34\3\34"+
		"\3\34\7\34\u0112\n\34\f\34\16\34\u0115\13\34\3\34\3\34\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\2\2\37\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\2"+
		"\61\31\63\32\65\33\67\349\35;\36\3\2\t\7\2*\60<<??}}\177\177\4\2C\\c|"+
		"\6\2\62;C\\aac|\5\2\f\f$$^^\5\2\13\f\17\17\"\"\4\2\f\f\17\17\3\2$$\2\u0134"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\3=\3"+
		"\2\2\2\5B\3\2\2\2\7D\3\2\2\2\tN\3\2\2\2\13Y\3\2\2\2\r_\3\2\2\2\17b\3\2"+
		"\2\2\21j\3\2\2\2\23l\3\2\2\2\25n\3\2\2\2\27p\3\2\2\2\31r\3\2\2\2\33t\3"+
		"\2\2\2\35y\3\2\2\2\37{\3\2\2\2!}\3\2\2\2#\177\3\2\2\2%\u00c4\3\2\2\2\'"+
		"\u00c7\3\2\2\2)\u00cc\3\2\2\2+\u00d7\3\2\2\2-\u00de\3\2\2\2/\u00e8\3\2"+
		"\2\2\61\u00eb\3\2\2\2\63\u00ee\3\2\2\2\65\u00ff\3\2\2\2\67\u010e\3\2\2"+
		"\29\u0118\3\2\2\2;\u011a\3\2\2\2=>\7P\2\2>?\7Q\2\2?@\7O\2\2@A\7G\2\2A"+
		"\4\3\2\2\2BC\7<\2\2C\6\3\2\2\2DE\7F\2\2EF\7G\2\2FG\7U\2\2GH\7E\2\2HI\7"+
		"T\2\2IJ\7K\2\2JK\7E\2\2KL\7C\2\2LM\7Q\2\2M\b\3\2\2\2NO\7T\2\2OP\7G\2\2"+
		"PQ\7P\2\2QR\7F\2\2RS\7K\2\2ST\7O\2\2TU\7G\2\2UV\7P\2\2VW\7V\2\2WX\7Q\2"+
		"\2X\n\3\2\2\2YZ\7V\2\2Z[\7G\2\2[\\\7O\2\2\\]\7R\2\2]^\7Q\2\2^\f\3\2\2"+
		"\2_`\7F\2\2`a\7G\2\2a\16\3\2\2\2bc\7R\2\2cd\7T\2\2de\7G\2\2ef\7R\2\2f"+
		"g\7C\2\2gh\7T\2\2hi\7Q\2\2i\20\3\2\2\2jk\7/\2\2k\22\3\2\2\2lm\7?\2\2m"+
		"\24\3\2\2\2no\7}\2\2o\26\3\2\2\2pq\7,\2\2q\30\3\2\2\2rs\7\177\2\2s\32"+
		"\3\2\2\2tu\7O\2\2uv\7Q\2\2vw\7F\2\2wx\7Q\2\2x\34\3\2\2\2yz\7\60\2\2z\36"+
		"\3\2\2\2{|\7*\2\2| \3\2\2\2}~\7-\2\2~\"\3\2\2\2\177\u0080\7+\2\2\u0080"+
		"$\3\2\2\2\u0081\u0082\7P\2\2\u0082\u0083\7Q\2\2\u0083\u0084\7O\2\2\u0084"+
		"\u00c5\7G\2\2\u0085\u0086\7F\2\2\u0086\u0087\7G\2\2\u0087\u0088\7U\2\2"+
		"\u0088\u0089\7E\2\2\u0089\u008a\7T\2\2\u008a\u008b\7K\2\2\u008b\u008c"+
		"\7E\2\2\u008c\u008d\7C\2\2\u008d\u00c5\7Q\2\2\u008e\u008f\7T\2\2\u008f"+
		"\u0090\7G\2\2\u0090\u0091\7P\2\2\u0091\u0092\7F\2\2\u0092\u0093\7K\2\2"+
		"\u0093\u0094\7O\2\2\u0094\u0095\7G\2\2\u0095\u0096\7P\2\2\u0096\u0097"+
		"\7V\2\2\u0097\u00c5\7Q\2\2\u0098\u0099\7V\2\2\u0099\u009a\7G\2\2\u009a"+
		"\u009b\7O\2\2\u009b\u009c\7R\2\2\u009c\u00c5\7Q\2\2\u009d\u009e\7R\2\2"+
		"\u009e\u009f\7T\2\2\u009f\u00a0\7G\2\2\u00a0\u00a1\7R\2\2\u00a1\u00a2"+
		"\7C\2\2\u00a2\u00a3\7T\2\2\u00a3\u00c5\7Q\2\2\u00a4\u00a5\7K\2\2\u00a5"+
		"\u00a6\7P\2\2\u00a6\u00a7\7I\2\2\u00a7\u00a8\7T\2\2\u00a8\u00a9\7G\2\2"+
		"\u00a9\u00aa\7F\2\2\u00aa\u00ab\7K\2\2\u00ab\u00ac\7G\2\2\u00ac\u00ad"+
		"\7P\2\2\u00ad\u00ae\7V\2\2\u00ae\u00af\7G\2\2\u00af\u00c5\7U\2\2\u00b0"+
		"\u00b1\7O\2\2\u00b1\u00b2\7Q\2\2\u00b2\u00b3\7F\2\2\u00b3\u00c5\7Q\2\2"+
		"\u00b4\u00b5\7F\2\2\u00b5\u00c5\7G\2\2\u00b6\u00b7\7W\2\2\u00b7\u00b8"+
		"\7V\2\2\u00b8\u00b9\7G\2\2\u00b9\u00ba\7P\2\2\u00ba\u00bb\7U\2\2\u00bb"+
		"\u00bc\7K\2\2\u00bc\u00bd\7N\2\2\u00bd\u00be\7K\2\2\u00be\u00bf\7Q\2\2"+
		"\u00bf\u00c5\7U\2\2\u00c0\u00c5\t\2\2\2\u00c1\u00c2\7C\2\2\u00c2\u00c3"+
		"\7V\2\2\u00c3\u00c5\7G\2\2\u00c4\u0081\3\2\2\2\u00c4\u0085\3\2\2\2\u00c4"+
		"\u008e\3\2\2\2\u00c4\u0098\3\2\2\2\u00c4\u009d\3\2\2\2\u00c4\u00a4\3\2"+
		"\2\2\u00c4\u00b0\3\2\2\2\u00c4\u00b4\3\2\2\2\u00c4\u00b6\3\2\2\2\u00c4"+
		"\u00c0\3\2\2\2\u00c4\u00c1\3\2\2\2\u00c5&\3\2\2\2\u00c6\u00c8\4\62;\2"+
		"\u00c7\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca"+
		"\3\2\2\2\u00ca(\3\2\2\2\u00cb\u00cd\4C\\\2\u00cc\u00cb\3\2\2\2\u00cd\u00ce"+
		"\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0"+
		"\u00d4\7a\2\2\u00d1\u00d3\4C\\\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6\3\2\2"+
		"\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5*\3\2\2\2\u00d6\u00d4"+
		"\3\2\2\2\u00d7\u00db\t\3\2\2\u00d8\u00da\t\4\2\2\u00d9\u00d8\3\2\2\2\u00da"+
		"\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc,\3\2\2\2"+
		"\u00dd\u00db\3\2\2\2\u00de\u00e3\7$\2\2\u00df\u00e2\5/\30\2\u00e0\u00e2"+
		"\n\5\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3"+
		"\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00e3\3\2"+
		"\2\2\u00e6\u00e7\7$\2\2\u00e7.\3\2\2\2\u00e8\u00e9\7^\2\2\u00e9\u00ea"+
		"\7$\2\2\u00ea\60\3\2\2\2\u00eb\u00ec\t\6\2\2\u00ec\u00ed\b\31\2\2\u00ed"+
		"\62\3\2\2\2\u00ee\u00ef\7\61\2\2\u00ef\u00f3\7\61\2\2\u00f0\u00f2\n\7"+
		"\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4\u00f9\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f8\7\17"+
		"\2\2\u00f7\u00f6\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9"+
		"\u00fa\3\2\2\2\u00fa\u00fc\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00fd\7\f"+
		"\2\2\u00fd\u00fe\b\32\3\2\u00fe\64\3\2\2\2\u00ff\u0103\7\61\2\2\u0100"+
		"\u0102\n\7\2\2\u0101\u0100\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2"+
		"\2\2\u0103\u0104\3\2\2\2\u0104\u0109\3\2\2\2\u0105\u0103\3\2\2\2\u0106"+
		"\u0108\7\17\2\2\u0107\u0106\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3"+
		"\2\2\2\u0109\u010a\3\2\2\2\u010a\u010c\3\2\2\2\u010b\u0109\3\2\2\2\u010c"+
		"\u010d\7\f\2\2\u010d\66\3\2\2\2\u010e\u0113\7$\2\2\u010f\u0112\5/\30\2"+
		"\u0110\u0112\n\b\2\2\u0111\u010f\3\2\2\2\u0111\u0110\3\2\2\2\u0112\u0115"+
		"\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0116\3\2\2\2\u0115"+
		"\u0113\3\2\2\2\u0116\u0117\7\f\2\2\u01178\3\2\2\2\u0118\u0119\13\2\2\2"+
		"\u0119:\3\2\2\2\u011a\u011b\7C\2\2\u011b\u011c\7V\2\2\u011c\u011d\7G\2"+
		"\2\u011d\u011e\3\2\2\2\u011e\u011f\5-\27\2\u011f<\3\2\2\2\20\2\u00c4\u00c9"+
		"\u00ce\u00d4\u00db\u00e1\u00e3\u00f3\u00f9\u0103\u0109\u0111\u0113\4\3"+
		"\31\2\3\32\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}