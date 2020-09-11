// Generated from br\u005Cufscar\dc\compiladores\receitahtml\receitaHTMLsintatico.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores.receitahtml;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class receitaHTMLsintaticoParser extends Parser {
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
	public static final int
		RULE_receita = 0, RULE_titulo = 1, RULE_descricao = 2, RULE_rendimento = 3, 
		RULE_tempo_de_preparo = 4, RULE_utensilios = 5, RULE_utensilio = 6, RULE_ingredientes = 7, 
		RULE_ingrediente = 8, RULE_modo_de_preparo = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"receita", "titulo", "descricao", "rendimento", "tempo_de_preparo", "utensilios", 
			"utensilio", "ingredientes", "ingrediente", "modo_de_preparo"
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

	@Override
	public String getGrammarFileName() { return "receitaHTMLsintatico.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public receitaHTMLsintaticoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ReceitaContext extends ParserRuleContext {
		public TituloContext titulo() {
			return getRuleContext(TituloContext.class,0);
		}
		public DescricaoContext descricao() {
			return getRuleContext(DescricaoContext.class,0);
		}
		public RendimentoContext rendimento() {
			return getRuleContext(RendimentoContext.class,0);
		}
		public Tempo_de_preparoContext tempo_de_preparo() {
			return getRuleContext(Tempo_de_preparoContext.class,0);
		}
		public UtensiliosContext utensilios() {
			return getRuleContext(UtensiliosContext.class,0);
		}
		public IngredientesContext ingredientes() {
			return getRuleContext(IngredientesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(receitaHTMLsintaticoParser.EOF, 0); }
		public ReceitaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receita; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTMLsintaticoListener ) ((receitaHTMLsintaticoListener)listener).enterReceita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTMLsintaticoListener ) ((receitaHTMLsintaticoListener)listener).exitReceita(this);
		}
	}

	public final ReceitaContext receita() throws RecognitionException {
		ReceitaContext _localctx = new ReceitaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_receita);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			titulo();
			setState(21);
			descricao();
			setState(22);
			rendimento();
			setState(23);
			tempo_de_preparo();
			setState(24);
			utensilios();
			setState(25);
			ingredientes();
			setState(26);
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

	public static class TituloContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(receitaHTMLsintaticoParser.STRING, 0); }
		public TituloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_titulo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTMLsintaticoListener ) ((receitaHTMLsintaticoListener)listener).enterTitulo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTMLsintaticoListener ) ((receitaHTMLsintaticoListener)listener).exitTitulo(this);
		}
	}

	public final TituloContext titulo() throws RecognitionException {
		TituloContext _localctx = new TituloContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_titulo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(T__0);
			setState(29);
			match(T__1);
			setState(30);
			match(STRING);
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

	public static class DescricaoContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(receitaHTMLsintaticoParser.STRING, 0); }
		public DescricaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_descricao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTMLsintaticoListener ) ((receitaHTMLsintaticoListener)listener).enterDescricao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTMLsintaticoListener ) ((receitaHTMLsintaticoListener)listener).exitDescricao(this);
		}
	}

	public final DescricaoContext descricao() throws RecognitionException {
		DescricaoContext _localctx = new DescricaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_descricao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(T__2);
			setState(33);
			match(T__1);
			setState(34);
			match(STRING);
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

	public static class RendimentoContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(receitaHTMLsintaticoParser.STRING, 0); }
		public RendimentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rendimento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTMLsintaticoListener ) ((receitaHTMLsintaticoListener)listener).enterRendimento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTMLsintaticoListener ) ((receitaHTMLsintaticoListener)listener).exitRendimento(this);
		}
	}

	public final RendimentoContext rendimento() throws RecognitionException {
		RendimentoContext _localctx = new RendimentoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_rendimento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(T__3);
			setState(37);
			match(T__1);
			setState(38);
			match(STRING);
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

	public static class Tempo_de_preparoContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(receitaHTMLsintaticoParser.STRING, 0); }
		public Tempo_de_preparoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tempo_de_preparo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTMLsintaticoListener ) ((receitaHTMLsintaticoListener)listener).enterTempo_de_preparo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTMLsintaticoListener ) ((receitaHTMLsintaticoListener)listener).exitTempo_de_preparo(this);
		}
	}

	public final Tempo_de_preparoContext tempo_de_preparo() throws RecognitionException {
		Tempo_de_preparoContext _localctx = new Tempo_de_preparoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tempo_de_preparo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(T__4);
			setState(41);
			match(T__5);
			setState(42);
			match(T__6);
			setState(43);
			match(T__1);
			setState(44);
			match(STRING);
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

	public static class UtensiliosContext extends ParserRuleContext {
		public List<UtensilioContext> utensilio() {
			return getRuleContexts(UtensilioContext.class);
		}
		public UtensilioContext utensilio(int i) {
			return getRuleContext(UtensilioContext.class,i);
		}
		public UtensiliosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_utensilios; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTMLsintaticoListener ) ((receitaHTMLsintaticoListener)listener).enterUtensilios(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTMLsintaticoListener ) ((receitaHTMLsintaticoListener)listener).exitUtensilios(this);
		}
	}

	public final UtensiliosContext utensilios() throws RecognitionException {
		UtensiliosContext _localctx = new UtensiliosContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_utensilios);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(46);
					utensilio();
					}
					} 
				}
				setState(51);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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

	public static class UtensilioContext extends ParserRuleContext {
		public List<TerminalNode> IdentVarfuncCham() { return getTokens(receitaHTMLsintaticoParser.IdentVarfuncCham); }
		public TerminalNode IdentVarfuncCham(int i) {
			return getToken(receitaHTMLsintaticoParser.IdentVarfuncCham, i);
		}
		public List<TerminalNode> STRING() { return getTokens(receitaHTMLsintaticoParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(receitaHTMLsintaticoParser.STRING, i);
		}
		public UtensilioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_utensilio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTMLsintaticoListener ) ((receitaHTMLsintaticoListener)listener).enterUtensilio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTMLsintaticoListener ) ((receitaHTMLsintaticoListener)listener).exitUtensilio(this);
		}
	}

	public final UtensilioContext utensilio() throws RecognitionException {
		UtensilioContext _localctx = new UtensilioContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_utensilio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(T__7);
			setState(53);
			match(IdentVarfuncCham);
			setState(54);
			match(T__8);
			setState(55);
			match(STRING);
			setState(56);
			match(T__9);
			setState(61); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(57);
				match(T__10);
				setState(58);
				match(IdentVarfuncCham);
				setState(59);
				match(T__8);
				setState(60);
				match(STRING);
				}
				}
				setState(63); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__10 );
			setState(65);
			match(T__11);
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

	public static class IngredientesContext extends ParserRuleContext {
		public List<IngredienteContext> ingrediente() {
			return getRuleContexts(IngredienteContext.class);
		}
		public IngredienteContext ingrediente(int i) {
			return getRuleContext(IngredienteContext.class,i);
		}
		public IngredientesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ingredientes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTMLsintaticoListener ) ((receitaHTMLsintaticoListener)listener).enterIngredientes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTMLsintaticoListener ) ((receitaHTMLsintaticoListener)listener).exitIngredientes(this);
		}
	}

	public final IngredientesContext ingredientes() throws RecognitionException {
		IngredientesContext _localctx = new IngredientesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ingredientes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(67);
				ingrediente();
				}
				}
				setState(70); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__7 );
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

	public static class IngredienteContext extends ParserRuleContext {
		public TerminalNode IdentVarfuncCham() { return getToken(receitaHTMLsintaticoParser.IdentVarfuncCham, 0); }
		public TerminalNode STRING() { return getToken(receitaHTMLsintaticoParser.STRING, 0); }
		public IngredienteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ingrediente; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTMLsintaticoListener ) ((receitaHTMLsintaticoListener)listener).enterIngrediente(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTMLsintaticoListener ) ((receitaHTMLsintaticoListener)listener).exitIngrediente(this);
		}
	}

	public final IngredienteContext ingrediente() throws RecognitionException {
		IngredienteContext _localctx = new IngredienteContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ingrediente);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(T__7);
			setState(73);
			match(IdentVarfuncCham);
			setState(74);
			match(T__8);
			setState(75);
			match(STRING);
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

	public static class Modo_de_preparoContext extends ParserRuleContext {
		public List<TerminalNode> IdentVarfuncCham() { return getTokens(receitaHTMLsintaticoParser.IdentVarfuncCham); }
		public TerminalNode IdentVarfuncCham(int i) {
			return getToken(receitaHTMLsintaticoParser.IdentVarfuncCham, i);
		}
		public List<TerminalNode> LOOP() { return getTokens(receitaHTMLsintaticoParser.LOOP); }
		public TerminalNode LOOP(int i) {
			return getToken(receitaHTMLsintaticoParser.LOOP, i);
		}
		public TerminalNode INSTRUCAO_PARAEXECUCAO() { return getToken(receitaHTMLsintaticoParser.INSTRUCAO_PARAEXECUCAO, 0); }
		public List<TerminalNode> STRING() { return getTokens(receitaHTMLsintaticoParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(receitaHTMLsintaticoParser.STRING, i);
		}
		public Modo_de_preparoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modo_de_preparo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTMLsintaticoListener ) ((receitaHTMLsintaticoListener)listener).enterModo_de_preparo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTMLsintaticoListener ) ((receitaHTMLsintaticoListener)listener).exitModo_de_preparo(this);
		}
	}

	public final Modo_de_preparoContext modo_de_preparo() throws RecognitionException {
		Modo_de_preparoContext _localctx = new Modo_de_preparoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_modo_de_preparo);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(T__12);
			setState(78);
			match(T__5);
			setState(79);
			match(T__6);
			setState(80);
			match(T__1);
			setState(81);
			match(T__9);
			setState(82);
			match(IdentVarfuncCham);
			setState(83);
			match(T__1);
			setState(84);
			match(T__9);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOOP) {
				{
				{
				setState(85);
				match(LOOP);
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
			match(IdentVarfuncCham);
			setState(92);
			match(T__13);
			setState(93);
			match(IdentVarfuncCham);
			setState(113); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(94);
				match(T__14);
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IdentVarfuncCham || _la==STRING) {
					{
					{
					setState(95);
					_la = _input.LA(1);
					if ( !(_la==IdentVarfuncCham || _la==STRING) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(104);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__15) {
						{
						{
						setState(96);
						match(T__15);
						setState(98); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(97);
								_la = _input.LA(1);
								if ( !(_la==IdentVarfuncCham || _la==STRING) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(100); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						}
						setState(106);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(111);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(112);
				match(T__16);
				}
				}
				setState(115); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__14 );
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INSTRUCAO_PARAEXECUCAO) {
				{
				setState(117);
				match(INSTRUCAO_PARAEXECUCAO);
				}
			}

			setState(120);
			match(T__11);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36}\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\7\7\62\n\7\f\7\16\7\65\13\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\6\b@\n\b\r\b\16\bA\3\b\3\b\3\t\6\tG\n\t"+
		"\r\t\16\tH\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\7\13Y\n\13\f\13\16\13\\\13\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\6\13e\n\13\r\13\16\13f\7\13i\n\13\f\13\16\13l\13\13\7\13n\n\13\f\13\16"+
		"\13q\13\13\3\13\6\13t\n\13\r\13\16\13u\3\13\5\13y\n\13\3\13\3\13\3\13"+
		"\2\2\f\2\4\6\b\n\f\16\20\22\24\2\3\3\2\27\30\2{\2\26\3\2\2\2\4\36\3\2"+
		"\2\2\6\"\3\2\2\2\b&\3\2\2\2\n*\3\2\2\2\f\63\3\2\2\2\16\66\3\2\2\2\20F"+
		"\3\2\2\2\22J\3\2\2\2\24O\3\2\2\2\26\27\5\4\3\2\27\30\5\6\4\2\30\31\5\b"+
		"\5\2\31\32\5\n\6\2\32\33\5\f\7\2\33\34\5\20\t\2\34\35\7\2\2\3\35\3\3\2"+
		"\2\2\36\37\7\3\2\2\37 \7\4\2\2 !\7\30\2\2!\5\3\2\2\2\"#\7\5\2\2#$\7\4"+
		"\2\2$%\7\30\2\2%\7\3\2\2\2&\'\7\6\2\2\'(\7\4\2\2()\7\30\2\2)\t\3\2\2\2"+
		"*+\7\7\2\2+,\7\b\2\2,-\7\t\2\2-.\7\4\2\2./\7\30\2\2/\13\3\2\2\2\60\62"+
		"\5\16\b\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\r"+
		"\3\2\2\2\65\63\3\2\2\2\66\67\7\n\2\2\678\7\27\2\289\7\13\2\29:\7\30\2"+
		"\2:?\7\f\2\2;<\7\r\2\2<=\7\27\2\2=>\7\13\2\2>@\7\30\2\2?;\3\2\2\2@A\3"+
		"\2\2\2A?\3\2\2\2AB\3\2\2\2BC\3\2\2\2CD\7\16\2\2D\17\3\2\2\2EG\5\22\n\2"+
		"FE\3\2\2\2GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2I\21\3\2\2\2JK\7\n\2\2KL\7\27"+
		"\2\2LM\7\13\2\2MN\7\30\2\2N\23\3\2\2\2OP\7\17\2\2PQ\7\b\2\2QR\7\t\2\2"+
		"RS\7\4\2\2ST\7\f\2\2TU\7\27\2\2UV\7\4\2\2VZ\7\f\2\2WY\7\36\2\2XW\3\2\2"+
		"\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\Z\3\2\2\2]^\7\27\2\2^_\7"+
		"\20\2\2_s\7\27\2\2`o\7\21\2\2aj\t\2\2\2bd\7\22\2\2ce\t\2\2\2dc\3\2\2\2"+
		"ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2hb\3\2\2\2il\3\2\2\2jh\3\2\2\2"+
		"jk\3\2\2\2kn\3\2\2\2lj\3\2\2\2ma\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2"+
		"pr\3\2\2\2qo\3\2\2\2rt\7\23\2\2s`\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2"+
		"\2vx\3\2\2\2wy\7\26\2\2xw\3\2\2\2xy\3\2\2\2yz\3\2\2\2z{\7\16\2\2{\25\3"+
		"\2\2\2\13\63AHZfjoux";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}