// Generated from br\u005Cufscar\dc\compiladores\receitahtml\receitaHTMLlexicoLexer.g4 by ANTLR 4.7.2
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
public class receitaHTMLlexicoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PALAVRAS_RESERVADAS=1, NUM_INT=2, INSTRUCAO_PARAEXECUCAO=3, IdentVarfuncCham=4, 
		STRING=5, CARACTERESIGNORADOS=6, COMENTARIO=7, COMENTARIOSEMBARRA=8, CADEIANFECHADA=9, 
		ErrorCharacter=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PALAVRAS_RESERVADAS", "NUM_INT", "INSTRUCAO_PARAEXECUCAO", "IdentVarfuncCham", 
			"STRING", "ESC_SEQ", "CARACTERESIGNORADOS", "COMENTARIO", "COMENTARIOSEMBARRA", 
			"CADEIANFECHADA", "ErrorCharacter"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PALAVRAS_RESERVADAS", "NUM_INT", "INSTRUCAO_PARAEXECUCAO", "IdentVarfuncCham", 
			"STRING", "CARACTERESIGNORADOS", "COMENTARIO", "COMENTARIOSEMBARRA", 
			"CADEIANFECHADA", "ErrorCharacter"
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


	public receitaHTMLlexicoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "receitaHTMLlexicoLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\f\u00b2\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\5\2]\n\2\3\3\6\3`\n\3\r\3\16\3a\3\4\6\4e\n\4\r\4\16\4f\3\4\3\4\7\4"+
		"k\n\4\f\4\16\4n\13\4\3\5\3\5\7\5r\n\5\f\5\16\5u\13\5\3\6\3\6\3\6\7\6z"+
		"\n\6\f\6\16\6}\13\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\7\t\u008a"+
		"\n\t\f\t\16\t\u008d\13\t\3\t\7\t\u0090\n\t\f\t\16\t\u0093\13\t\3\t\3\t"+
		"\3\t\3\n\3\n\7\n\u009a\n\n\f\n\16\n\u009d\13\n\3\n\7\n\u00a0\n\n\f\n\16"+
		"\n\u00a3\13\n\3\n\3\n\3\13\3\13\3\13\7\13\u00aa\n\13\f\13\16\13\u00ad"+
		"\13\13\3\13\3\13\3\f\3\f\2\2\r\3\3\5\4\7\5\t\6\13\7\r\2\17\b\21\t\23\n"+
		"\25\13\27\f\3\2\t\7\2*\60<<??}}\177\177\4\2C\\c|\6\2\62;C\\aac|\5\2\f"+
		"\f$$^^\5\2\13\f\17\17\"\"\4\2\f\f\17\17\3\2$$\2\u00c6\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\3\\\3\2\2\2\5_\3\2\2\2\7d\3"+
		"\2\2\2\to\3\2\2\2\13v\3\2\2\2\r\u0080\3\2\2\2\17\u0083\3\2\2\2\21\u0086"+
		"\3\2\2\2\23\u0097\3\2\2\2\25\u00a6\3\2\2\2\27\u00b0\3\2\2\2\31\32\7P\2"+
		"\2\32\33\7Q\2\2\33\34\7O\2\2\34]\7G\2\2\35\36\7F\2\2\36\37\7G\2\2\37 "+
		"\7U\2\2 !\7E\2\2!\"\7T\2\2\"#\7K\2\2#$\7E\2\2$%\7C\2\2%]\7Q\2\2&\'\7T"+
		"\2\2\'(\7G\2\2()\7P\2\2)*\7F\2\2*+\7K\2\2+,\7O\2\2,-\7G\2\2-.\7P\2\2."+
		"/\7V\2\2/]\7Q\2\2\60\61\7V\2\2\61\62\7G\2\2\62\63\7O\2\2\63\64\7R\2\2"+
		"\64]\7Q\2\2\65\66\7R\2\2\66\67\7T\2\2\678\7G\2\289\7R\2\29:\7C\2\2:;\7"+
		"T\2\2;]\7Q\2\2<=\7K\2\2=>\7P\2\2>?\7I\2\2?@\7T\2\2@A\7G\2\2AB\7F\2\2B"+
		"C\7K\2\2CD\7G\2\2DE\7P\2\2EF\7V\2\2FG\7G\2\2G]\7U\2\2HI\7O\2\2IJ\7Q\2"+
		"\2JK\7F\2\2K]\7Q\2\2LM\7F\2\2M]\7G\2\2NO\7W\2\2OP\7V\2\2PQ\7G\2\2QR\7"+
		"P\2\2RS\7U\2\2ST\7K\2\2TU\7N\2\2UV\7K\2\2VW\7Q\2\2W]\7U\2\2X]\t\2\2\2"+
		"YZ\7C\2\2Z[\7V\2\2[]\7G\2\2\\\31\3\2\2\2\\\35\3\2\2\2\\&\3\2\2\2\\\60"+
		"\3\2\2\2\\\65\3\2\2\2\\<\3\2\2\2\\H\3\2\2\2\\L\3\2\2\2\\N\3\2\2\2\\X\3"+
		"\2\2\2\\Y\3\2\2\2]\4\3\2\2\2^`\4\62;\2_^\3\2\2\2`a\3\2\2\2a_\3\2\2\2a"+
		"b\3\2\2\2b\6\3\2\2\2ce\4C\\\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2"+
		"gh\3\2\2\2hl\7a\2\2ik\4C\\\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2m"+
		"\b\3\2\2\2nl\3\2\2\2os\t\3\2\2pr\t\4\2\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2"+
		"st\3\2\2\2t\n\3\2\2\2us\3\2\2\2v{\7$\2\2wz\5\r\7\2xz\n\5\2\2yw\3\2\2\2"+
		"yx\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|~\3\2\2\2}{\3\2\2\2~\177\7$\2"+
		"\2\177\f\3\2\2\2\u0080\u0081\7^\2\2\u0081\u0082\7$\2\2\u0082\16\3\2\2"+
		"\2\u0083\u0084\t\6\2\2\u0084\u0085\b\b\2\2\u0085\20\3\2\2\2\u0086\u0087"+
		"\7\61\2\2\u0087\u008b\7\61\2\2\u0088\u008a\n\7\2\2\u0089\u0088\3\2\2\2"+
		"\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u0091"+
		"\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u0090\7\17\2\2\u008f\u008e\3\2\2\2"+
		"\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094"+
		"\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0095\7\f\2\2\u0095\u0096\b\t\3\2\u0096"+
		"\22\3\2\2\2\u0097\u009b\7\61\2\2\u0098\u009a\n\7\2\2\u0099\u0098\3\2\2"+
		"\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u00a1"+
		"\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u00a0\7\17\2\2\u009f\u009e\3\2\2\2"+
		"\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4"+
		"\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\7\f\2\2\u00a5\24\3\2\2\2\u00a6"+
		"\u00ab\7$\2\2\u00a7\u00aa\5\r\7\2\u00a8\u00aa\n\b\2\2\u00a9\u00a7\3\2"+
		"\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00af\7\f"+
		"\2\2\u00af\26\3\2\2\2\u00b0\u00b1\13\2\2\2\u00b1\30\3\2\2\2\20\2\\afl"+
		"sy{\u008b\u0091\u009b\u00a1\u00a9\u00ab\4\3\b\2\3\t\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}