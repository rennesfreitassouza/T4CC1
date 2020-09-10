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
public class receitahtml extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PALAVRAS_RESERVADAS=1, NUM_INT=2, IDENT=3, STRING=4;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PALAVRAS_RESERVADAS", "NUM_INT", "IDENT", "STRING", "ESC_SEQ"
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
			null, "PALAVRAS_RESERVADAS", "NUM_INT", "IDENT", "STRING"
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


	public receitahtml(CharStream input) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\6j\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\5\2P\n\2\3\3\6\3S\n\3\r\3\16\3T\3\4\3\4\7\4Y\n\4\f\4\16"+
		"\4\\\13\4\3\5\3\5\3\5\7\5a\n\5\f\5\16\5d\13\5\3\5\3\5\3\6\3\6\3\6\2\2"+
		"\7\3\3\5\4\7\5\t\6\13\2\3\2\6\6\2*+/\60<<??\4\2C\\c|\5\2C\\aac|\4\2\f"+
		"\f$$\2u\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\3O\3\2\2\2\5R"+
		"\3\2\2\2\7V\3\2\2\2\t]\3\2\2\2\13g\3\2\2\2\r\16\7V\2\2\16\17\7K\2\2\17"+
		"\20\7V\2\2\20\21\7W\2\2\21\22\7N\2\2\22P\7Q\2\2\23\24\7F\2\2\24\25\7G"+
		"\2\2\25\26\7U\2\2\26\27\7E\2\2\27\30\7T\2\2\30\31\7K\2\2\31\32\7E\2\2"+
		"\32\33\7C\2\2\33P\7Q\2\2\34\35\7T\2\2\35\36\7G\2\2\36\37\7P\2\2\37 \7"+
		"F\2\2 !\7K\2\2!\"\7O\2\2\"#\7G\2\2#$\7P\2\2$%\7V\2\2%P\7Q\2\2&\'\7V\2"+
		"\2\'(\7G\2\2()\7O\2\2)*\7R\2\2*P\7Q\2\2+,\7R\2\2,-\7T\2\2-.\7G\2\2./\7"+
		"R\2\2/\60\7C\2\2\60\61\7T\2\2\61P\7Q\2\2\62\63\7K\2\2\63\64\7P\2\2\64"+
		"\65\7I\2\2\65\66\7T\2\2\66\67\7G\2\2\678\7F\2\289\7K\2\29:\7G\2\2:;\7"+
		"P\2\2;<\7V\2\2<=\7G\2\2=P\7U\2\2>?\7O\2\2?@\7Q\2\2@A\7F\2\2AP\7Q\2\2B"+
		"C\7F\2\2CP\7G\2\2DE\7W\2\2EF\7V\2\2FG\7G\2\2GH\7P\2\2HI\7U\2\2IJ\7K\2"+
		"\2JK\7N\2\2KL\7K\2\2LM\7Q\2\2MP\7U\2\2NP\t\2\2\2O\r\3\2\2\2O\23\3\2\2"+
		"\2O\34\3\2\2\2O&\3\2\2\2O+\3\2\2\2O\62\3\2\2\2O>\3\2\2\2OB\3\2\2\2OD\3"+
		"\2\2\2ON\3\2\2\2P\4\3\2\2\2QS\4\62;\2RQ\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU"+
		"\3\2\2\2U\6\3\2\2\2VZ\t\3\2\2WY\t\4\2\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2"+
		"Z[\3\2\2\2[\b\3\2\2\2\\Z\3\2\2\2]b\7$\2\2^a\5\13\6\2_a\n\5\2\2`^\3\2\2"+
		"\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2db\3\2\2\2ef\7$\2"+
		"\2f\n\3\2\2\2gh\7^\2\2hi\7$\2\2i\f\3\2\2\2\b\2OTZ`b\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}