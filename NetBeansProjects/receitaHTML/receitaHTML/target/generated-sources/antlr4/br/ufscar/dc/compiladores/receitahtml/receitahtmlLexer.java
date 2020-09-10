// Generated from br\u005Cufscar\dc\compiladores\receitahtml\receitahtml.g4 by ANTLR 4.7.2
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
public class receitahtmlLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, PALAVRAS_RESERVADAS=2, NUM_INT=3, IdentVarfuncCham=4, STRING=5, 
		CARACTERESIGNORADOS=6, COMENTARIO=7, COMENTARIOSEMBARRA=8, CADEIANFECHADA=9, 
		ErrorCharacter=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "PALAVRAS_RESERVADAS", "NUM_INT", "IdentVarfuncCham", "STRING", 
			"ESC_SEQ", "CARACTERESIGNORADOS", "COMENTARIO", "COMENTARIOSEMBARRA", 
			"CADEIANFECHADA", "ErrorCharacter"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'8'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "PALAVRAS_RESERVADAS", "NUM_INT", "IdentVarfuncCham", "STRING", 
			"CARACTERESIGNORADOS", "COMENTARIO", "COMENTARIOSEMBARRA", "CADEIANFECHADA", 
			"ErrorCharacter"
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


	public receitahtmlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "receitahtml.g4"; }

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
		case 6:
			CARACTERESIGNORADOS_action((RuleContext)_localctx, actionIndex);
			break;
		case 7:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\f\u00a5\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5"+
		"\3\\\n\3\3\4\6\4_\n\4\r\4\16\4`\3\5\3\5\7\5e\n\5\f\5\16\5h\13\5\3\6\3"+
		"\6\3\6\7\6m\n\6\f\6\16\6p\13\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\7\t}\n\t\f\t\16\t\u0080\13\t\3\t\7\t\u0083\n\t\f\t\16\t\u0086\13"+
		"\t\3\t\3\t\3\t\3\n\3\n\7\n\u008d\n\n\f\n\16\n\u0090\13\n\3\n\7\n\u0093"+
		"\n\n\f\n\16\n\u0096\13\n\3\n\3\n\3\13\3\13\3\13\7\13\u009d\n\13\f\13\16"+
		"\13\u00a0\13\13\3\13\3\13\3\f\3\f\2\2\r\3\3\5\4\7\5\t\6\13\7\r\2\17\b"+
		"\21\t\23\n\25\13\27\f\3\2\t\b\2*,/\60<<??}}\177\177\4\2C\\c|\6\2\62;C"+
		"\\aac|\5\2\f\f$$^^\5\2\13\f\17\17\"\"\4\2\f\f\17\17\3\2$$\2\u00b6\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\3\31\3\2\2\2\5[\3"+
		"\2\2\2\7^\3\2\2\2\tb\3\2\2\2\13i\3\2\2\2\rs\3\2\2\2\17v\3\2\2\2\21y\3"+
		"\2\2\2\23\u008a\3\2\2\2\25\u0099\3\2\2\2\27\u00a3\3\2\2\2\31\32\7:\2\2"+
		"\32\4\3\2\2\2\33\34\7P\2\2\34\35\7Q\2\2\35\36\7O\2\2\36\\\7G\2\2\37 \7"+
		"F\2\2 !\7G\2\2!\"\7U\2\2\"#\7E\2\2#$\7T\2\2$%\7K\2\2%&\7E\2\2&\'\7C\2"+
		"\2\'\\\7Q\2\2()\7T\2\2)*\7G\2\2*+\7P\2\2+,\7F\2\2,-\7K\2\2-.\7O\2\2./"+
		"\7G\2\2/\60\7P\2\2\60\61\7V\2\2\61\\\7Q\2\2\62\63\7V\2\2\63\64\7G\2\2"+
		"\64\65\7O\2\2\65\66\7R\2\2\66\\\7Q\2\2\678\7R\2\289\7T\2\29:\7G\2\2:;"+
		"\7R\2\2;<\7C\2\2<=\7T\2\2=\\\7Q\2\2>?\7K\2\2?@\7P\2\2@A\7I\2\2AB\7T\2"+
		"\2BC\7G\2\2CD\7F\2\2DE\7K\2\2EF\7G\2\2FG\7P\2\2GH\7V\2\2HI\7G\2\2I\\\7"+
		"U\2\2JK\7O\2\2KL\7Q\2\2LM\7F\2\2M\\\7Q\2\2NO\7F\2\2O\\\7G\2\2PQ\7W\2\2"+
		"QR\7V\2\2RS\7G\2\2ST\7P\2\2TU\7U\2\2UV\7K\2\2VW\7N\2\2WX\7K\2\2XY\7Q\2"+
		"\2Y\\\7U\2\2Z\\\t\2\2\2[\33\3\2\2\2[\37\3\2\2\2[(\3\2\2\2[\62\3\2\2\2"+
		"[\67\3\2\2\2[>\3\2\2\2[J\3\2\2\2[N\3\2\2\2[P\3\2\2\2[Z\3\2\2\2\\\6\3\2"+
		"\2\2]_\4\62;\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\b\3\2\2\2bf\t"+
		"\3\2\2ce\t\4\2\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2g\n\3\2\2\2hf"+
		"\3\2\2\2in\7$\2\2jm\5\r\7\2km\n\5\2\2lj\3\2\2\2lk\3\2\2\2mp\3\2\2\2nl"+
		"\3\2\2\2no\3\2\2\2oq\3\2\2\2pn\3\2\2\2qr\7$\2\2r\f\3\2\2\2st\7^\2\2tu"+
		"\7$\2\2u\16\3\2\2\2vw\t\6\2\2wx\b\b\2\2x\20\3\2\2\2yz\7\61\2\2z~\7\61"+
		"\2\2{}\n\7\2\2|{\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0084"+
		"\3\2\2\2\u0080~\3\2\2\2\u0081\u0083\7\17\2\2\u0082\u0081\3\2\2\2\u0083"+
		"\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2"+
		"\2\2\u0086\u0084\3\2\2\2\u0087\u0088\7\f\2\2\u0088\u0089\b\t\3\2\u0089"+
		"\22\3\2\2\2\u008a\u008e\7\61\2\2\u008b\u008d\n\7\2\2\u008c\u008b\3\2\2"+
		"\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0094"+
		"\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0093\7\17\2\2\u0092\u0091\3\2\2\2"+
		"\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097"+
		"\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0098\7\f\2\2\u0098\24\3\2\2\2\u0099"+
		"\u009e\7$\2\2\u009a\u009d\5\r\7\2\u009b\u009d\n\b\2\2\u009c\u009a\3\2"+
		"\2\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\7\f"+
		"\2\2\u00a2\26\3\2\2\2\u00a3\u00a4\13\2\2\2\u00a4\30\3\2\2\2\16\2[`fln"+
		"~\u0084\u008e\u0094\u009c\u009e\4\3\b\2\3\t\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}