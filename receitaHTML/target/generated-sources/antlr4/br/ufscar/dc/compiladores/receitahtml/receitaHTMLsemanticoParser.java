// Generated from br\u005Cufscar\dc\compiladores\receitahtml\receitaHTMLsemantico.g4 by ANTLR 4.7.2
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
public class receitaHTMLsemanticoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, STRING=21, IdentVarfuncCham=22, INSTRUCAO_PARAEXECUCAO=23;
	public static final int
		RULE_receita = 0, RULE_titulo = 1, RULE_descricao = 2, RULE_rendimento = 3, 
		RULE_tempo_de_preparo = 4, RULE_utensilios = 5, RULE_utensilio = 6, RULE_faz_o_que = 7, 
		RULE_ingredientes = 8, RULE_ingrediente = 9, RULE_modo_de_preparo = 10, 
		RULE_instrucoes_preparacao = 11, RULE_chamada_utensilio = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"receita", "titulo", "descricao", "rendimento", "tempo_de_preparo", "utensilios", 
			"utensilio", "faz_o_que", "ingredientes", "ingrediente", "modo_de_preparo", 
			"instrucoes_preparacao", "chamada_utensilio"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'NOME'", "':'", "'DESCRICAO'", "'RENDIMENTO'", "'TEMPO'", "'DE'", 
			"'PREPARO'", "'UTENSILIOS'", "'-'", "'='", "'{'", "'}'", "'*'", "'INGREDIENTES'", 
			"'MODO'", "'ATE'", "'.'", "'('", "'+'", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "STRING", "IdentVarfuncCham", 
			"INSTRUCAO_PARAEXECUCAO"
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
	public String getGrammarFileName() { return "receitaHTMLsemantico.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public receitaHTMLsemanticoParser(TokenStream input) {
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
		public Modo_de_preparoContext modo_de_preparo() {
			return getRuleContext(Modo_de_preparoContext.class,0);
		}
		public TerminalNode EOF() { return getToken(receitaHTMLsemanticoParser.EOF, 0); }
		public ReceitaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receita; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTMLsemanticoListener ) ((receitaHTMLsemanticoListener)listener).enterReceita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTMLsemanticoListener ) ((receitaHTMLsemanticoListener)listener).exitReceita(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof receitaHTMLsemanticoVisitor ) return ((receitaHTMLsemanticoVisitor<? extends T>)visitor).visitReceita(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReceitaContext receita() throws RecognitionException {
		ReceitaContext _localctx = new ReceitaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_receita);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			titulo();
			setState(27);
			descricao();
			setState(28);
			rendimento();
			setState(29);
			tempo_de_preparo();
			setState(30);
			utensilios();
			setState(31);
			ingredientes();
			setState(32);
			modo_de_preparo();
			setState(33);
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
		public TerminalNode STRING() { return getToken(receitaHTMLsemanticoParser.STRING, 0); }
		public TituloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_titulo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTMLsemanticoListener ) ((receitaHTMLsemanticoListener)listener).enterTitulo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTMLsemanticoListener ) ((receitaHTMLsemanticoListener)listener).exitTitulo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof receitaHTMLsemanticoVisitor ) return ((receitaHTMLsemanticoVisitor<? extends T>)visitor).visitTitulo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TituloContext titulo() throws RecognitionException {
		TituloContext _localctx = new TituloContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_titulo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(T__0);
			setState(36);
			match(T__1);
			setState(37);
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
		public TerminalNode STRING() { return getToken(receitaHTMLsemanticoParser.STRING, 0); }
		public DescricaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_descricao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTMLsemanticoListener ) ((receitaHTMLsemanticoListener)listener).enterDescricao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTMLsemanticoListener ) ((receitaHTMLsemanticoListener)listener).exitDescricao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof receitaHTMLsemanticoVisitor ) return ((receitaHTMLsemanticoVisitor<? extends T>)visitor).visitDescricao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescricaoContext descricao() throws RecognitionException {
		DescricaoContext _localctx = new DescricaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_descricao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(T__2);
			setState(40);
			match(T__1);
			setState(41);
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
		public TerminalNode STRING() { return getToken(receitaHTMLsemanticoParser.STRING, 0); }
		public RendimentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rendimento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTMLsemanticoListener ) ((receitaHTMLsemanticoListener)listener).enterRendimento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTMLsemanticoListener ) ((receitaHTMLsemanticoListener)listener).exitRendimento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof receitaHTMLsemanticoVisitor ) return ((receitaHTMLsemanticoVisitor<? extends T>)visitor).visitRendimento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RendimentoContext rendimento() throws RecognitionException {
		RendimentoContext _localctx = new RendimentoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_rendimento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(T__3);
			setState(44);
			match(T__1);
			setState(45);
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
		public TerminalNode STRING() { return getToken(receitaHTMLsemanticoParser.STRING, 0); }
		public Tempo_de_preparoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tempo_de_preparo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTMLsemanticoListener ) ((receitaHTMLsemanticoListener)listener).enterTempo_de_preparo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTMLsemanticoListener ) ((receitaHTMLsemanticoListener)listener).exitTempo_de_preparo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof receitaHTMLsemanticoVisitor ) return ((receitaHTMLsemanticoVisitor<? extends T>)visitor).visitTempo_de_preparo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tempo_de_preparoContext tempo_de_preparo() throws RecognitionException {
		Tempo_de_preparoContext _localctx = new Tempo_de_preparoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tempo_de_preparo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(T__4);
			setState(48);
			match(T__5);
			setState(49);
			match(T__6);
			setState(50);
			match(T__1);
			setState(51);
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
			if ( listener instanceof receitaHTMLsemanticoListener ) ((receitaHTMLsemanticoListener)listener).enterUtensilios(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTMLsemanticoListener ) ((receitaHTMLsemanticoListener)listener).exitUtensilios(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof receitaHTMLsemanticoVisitor ) return ((receitaHTMLsemanticoVisitor<? extends T>)visitor).visitUtensilios(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UtensiliosContext utensilios() throws RecognitionException {
		UtensiliosContext _localctx = new UtensiliosContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_utensilios);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(T__7);
			setState(54);
			match(T__1);
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(55);
				utensilio();
				}
				}
				setState(60);
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

	public static class UtensilioContext extends ParserRuleContext {
		public TerminalNode IdentVarfuncCham() { return getToken(receitaHTMLsemanticoParser.IdentVarfuncCham, 0); }
		public TerminalNode STRING() { return getToken(receitaHTMLsemanticoParser.STRING, 0); }
		public List<Faz_o_queContext> faz_o_que() {
			return getRuleContexts(Faz_o_queContext.class);
		}
		public Faz_o_queContext faz_o_que(int i) {
			return getRuleContext(Faz_o_queContext.class,i);
		}
		public UtensilioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_utensilio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTMLsemanticoListener ) ((receitaHTMLsemanticoListener)listener).enterUtensilio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTMLsemanticoListener ) ((receitaHTMLsemanticoListener)listener).exitUtensilio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof receitaHTMLsemanticoVisitor ) return ((receitaHTMLsemanticoVisitor<? extends T>)visitor).visitUtensilio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UtensilioContext utensilio() throws RecognitionException {
		UtensilioContext _localctx = new UtensilioContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_utensilio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(T__8);
			setState(62);
			match(IdentVarfuncCham);
			setState(63);
			match(T__9);
			setState(64);
			match(STRING);
			setState(65);
			match(T__10);
			setState(67); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(66);
				faz_o_que();
				}
				}
				setState(69); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__12 );
			setState(71);
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

	public static class Faz_o_queContext extends ParserRuleContext {
		public TerminalNode IdentVarfuncCham() { return getToken(receitaHTMLsemanticoParser.IdentVarfuncCham, 0); }
		public TerminalNode STRING() { return getToken(receitaHTMLsemanticoParser.STRING, 0); }
		public Faz_o_queContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_faz_o_que; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTMLsemanticoListener ) ((receitaHTMLsemanticoListener)listener).enterFaz_o_que(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTMLsemanticoListener ) ((receitaHTMLsemanticoListener)listener).exitFaz_o_que(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof receitaHTMLsemanticoVisitor ) return ((receitaHTMLsemanticoVisitor<? extends T>)visitor).visitFaz_o_que(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Faz_o_queContext faz_o_que() throws RecognitionException {
		Faz_o_queContext _localctx = new Faz_o_queContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_faz_o_que);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__12);
			setState(74);
			match(IdentVarfuncCham);
			setState(75);
			match(T__9);
			setState(76);
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
			if ( listener instanceof receitaHTMLsemanticoListener ) ((receitaHTMLsemanticoListener)listener).enterIngredientes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTMLsemanticoListener ) ((receitaHTMLsemanticoListener)listener).exitIngredientes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof receitaHTMLsemanticoVisitor ) return ((receitaHTMLsemanticoVisitor<? extends T>)visitor).visitIngredientes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IngredientesContext ingredientes() throws RecognitionException {
		IngredientesContext _localctx = new IngredientesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ingredientes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__13);
			setState(79);
			match(T__1);
			setState(81); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(80);
				ingrediente();
				}
				}
				setState(83); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__8 );
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
		public TerminalNode IdentVarfuncCham() { return getToken(receitaHTMLsemanticoParser.IdentVarfuncCham, 0); }
		public TerminalNode STRING() { return getToken(receitaHTMLsemanticoParser.STRING, 0); }
		public IngredienteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ingrediente; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTMLsemanticoListener ) ((receitaHTMLsemanticoListener)listener).enterIngrediente(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTMLsemanticoListener ) ((receitaHTMLsemanticoListener)listener).exitIngrediente(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof receitaHTMLsemanticoVisitor ) return ((receitaHTMLsemanticoVisitor<? extends T>)visitor).visitIngrediente(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IngredienteContext ingrediente() throws RecognitionException {
		IngredienteContext _localctx = new IngredienteContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ingrediente);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(T__8);
			setState(86);
			match(IdentVarfuncCham);
			setState(87);
			match(T__9);
			setState(88);
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
		public List<Instrucoes_preparacaoContext> instrucoes_preparacao() {
			return getRuleContexts(Instrucoes_preparacaoContext.class);
		}
		public Instrucoes_preparacaoContext instrucoes_preparacao(int i) {
			return getRuleContext(Instrucoes_preparacaoContext.class,i);
		}
		public Modo_de_preparoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modo_de_preparo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTMLsemanticoListener ) ((receitaHTMLsemanticoListener)listener).enterModo_de_preparo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTMLsemanticoListener ) ((receitaHTMLsemanticoListener)listener).exitModo_de_preparo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof receitaHTMLsemanticoVisitor ) return ((receitaHTMLsemanticoVisitor<? extends T>)visitor).visitModo_de_preparo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Modo_de_preparoContext modo_de_preparo() throws RecognitionException {
		Modo_de_preparoContext _localctx = new Modo_de_preparoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_modo_de_preparo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T__14);
			setState(91);
			match(T__5);
			setState(92);
			match(T__6);
			setState(93);
			match(T__1);
			setState(95); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(94);
				instrucoes_preparacao();
				}
				}
				setState(97); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IdentVarfuncCham );
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

	public static class Instrucoes_preparacaoContext extends ParserRuleContext {
		public TerminalNode IdentVarfuncCham() { return getToken(receitaHTMLsemanticoParser.IdentVarfuncCham, 0); }
		public TerminalNode STRING() { return getToken(receitaHTMLsemanticoParser.STRING, 0); }
		public List<Chamada_utensilioContext> chamada_utensilio() {
			return getRuleContexts(Chamada_utensilioContext.class);
		}
		public Chamada_utensilioContext chamada_utensilio(int i) {
			return getRuleContext(Chamada_utensilioContext.class,i);
		}
		public TerminalNode INSTRUCAO_PARAEXECUCAO() { return getToken(receitaHTMLsemanticoParser.INSTRUCAO_PARAEXECUCAO, 0); }
		public Instrucoes_preparacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucoes_preparacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTMLsemanticoListener ) ((receitaHTMLsemanticoListener)listener).enterInstrucoes_preparacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTMLsemanticoListener ) ((receitaHTMLsemanticoListener)listener).exitInstrucoes_preparacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof receitaHTMLsemanticoVisitor ) return ((receitaHTMLsemanticoVisitor<? extends T>)visitor).visitInstrucoes_preparacao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instrucoes_preparacaoContext instrucoes_preparacao() throws RecognitionException {
		Instrucoes_preparacaoContext _localctx = new Instrucoes_preparacaoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_instrucoes_preparacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(IdentVarfuncCham);
			setState(100);
			match(T__1);
			setState(101);
			match(T__10);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(102);
				match(T__15);
				setState(103);
				match(STRING);
				setState(104);
				chamada_utensilio();
				}
			}

			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING || _la==IdentVarfuncCham) {
				{
				{
				setState(107);
				chamada_utensilio();
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INSTRUCAO_PARAEXECUCAO) {
				{
				setState(113);
				match(INSTRUCAO_PARAEXECUCAO);
				}
			}

			setState(116);
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

	public static class Chamada_utensilioContext extends ParserRuleContext {
		public List<TerminalNode> IdentVarfuncCham() { return getTokens(receitaHTMLsemanticoParser.IdentVarfuncCham); }
		public TerminalNode IdentVarfuncCham(int i) {
			return getToken(receitaHTMLsemanticoParser.IdentVarfuncCham, i);
		}
		public List<TerminalNode> STRING() { return getTokens(receitaHTMLsemanticoParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(receitaHTMLsemanticoParser.STRING, i);
		}
		public Chamada_utensilioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada_utensilio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTMLsemanticoListener ) ((receitaHTMLsemanticoListener)listener).enterChamada_utensilio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTMLsemanticoListener ) ((receitaHTMLsemanticoListener)listener).exitChamada_utensilio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof receitaHTMLsemanticoVisitor ) return ((receitaHTMLsemanticoVisitor<? extends T>)visitor).visitChamada_utensilio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Chamada_utensilioContext chamada_utensilio() throws RecognitionException {
		Chamada_utensilioContext _localctx = new Chamada_utensilioContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_chamada_utensilio);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(118);
				match(STRING);
				setState(119);
				match(IdentVarfuncCham);
				setState(120);
				match(STRING);
				}
			}

			setState(123);
			match(IdentVarfuncCham);
			setState(124);
			match(T__16);
			setState(125);
			match(IdentVarfuncCham);
			setState(145); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(126);
				match(T__17);
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==STRING || _la==IdentVarfuncCham) {
					{
					{
					setState(127);
					_la = _input.LA(1);
					if ( !(_la==STRING || _la==IdentVarfuncCham) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(136);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__18) {
						{
						{
						setState(128);
						match(T__18);
						setState(130); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(129);
								_la = _input.LA(1);
								if ( !(_la==STRING || _la==IdentVarfuncCham) ) {
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
							setState(132); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						}
						setState(138);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(144);
				match(T__19);
				}
				}
				setState(147); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__17 );
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31\u0098\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\7\7;\n\7\f\7\16\7>\13\7\3\b\3\b\3\b\3\b\3\b\3\b\6\bF\n\b"+
		"\r\b\16\bG\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\6\nT\n\n\r\n\16\nU"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\6\fb\n\f\r\f\16\fc\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\5\rl\n\r\3\r\7\ro\n\r\f\r\16\rr\13\r\3\r\5\ru\n\r\3"+
		"\r\3\r\3\16\3\16\3\16\5\16|\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\6"+
		"\16\u0085\n\16\r\16\16\16\u0086\7\16\u0089\n\16\f\16\16\16\u008c\13\16"+
		"\7\16\u008e\n\16\f\16\16\16\u0091\13\16\3\16\6\16\u0094\n\16\r\16\16\16"+
		"\u0095\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\3\3\2\27\30\2\u0096"+
		"\2\34\3\2\2\2\4%\3\2\2\2\6)\3\2\2\2\b-\3\2\2\2\n\61\3\2\2\2\f\67\3\2\2"+
		"\2\16?\3\2\2\2\20K\3\2\2\2\22P\3\2\2\2\24W\3\2\2\2\26\\\3\2\2\2\30e\3"+
		"\2\2\2\32{\3\2\2\2\34\35\5\4\3\2\35\36\5\6\4\2\36\37\5\b\5\2\37 \5\n\6"+
		"\2 !\5\f\7\2!\"\5\22\n\2\"#\5\26\f\2#$\7\2\2\3$\3\3\2\2\2%&\7\3\2\2&\'"+
		"\7\4\2\2\'(\7\27\2\2(\5\3\2\2\2)*\7\5\2\2*+\7\4\2\2+,\7\27\2\2,\7\3\2"+
		"\2\2-.\7\6\2\2./\7\4\2\2/\60\7\27\2\2\60\t\3\2\2\2\61\62\7\7\2\2\62\63"+
		"\7\b\2\2\63\64\7\t\2\2\64\65\7\4\2\2\65\66\7\27\2\2\66\13\3\2\2\2\678"+
		"\7\n\2\28<\7\4\2\29;\5\16\b\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2"+
		"=\r\3\2\2\2><\3\2\2\2?@\7\13\2\2@A\7\30\2\2AB\7\f\2\2BC\7\27\2\2CE\7\r"+
		"\2\2DF\5\20\t\2ED\3\2\2\2FG\3\2\2\2GE\3\2\2\2GH\3\2\2\2HI\3\2\2\2IJ\7"+
		"\16\2\2J\17\3\2\2\2KL\7\17\2\2LM\7\30\2\2MN\7\f\2\2NO\7\27\2\2O\21\3\2"+
		"\2\2PQ\7\20\2\2QS\7\4\2\2RT\5\24\13\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV"+
		"\3\2\2\2V\23\3\2\2\2WX\7\13\2\2XY\7\30\2\2YZ\7\f\2\2Z[\7\27\2\2[\25\3"+
		"\2\2\2\\]\7\21\2\2]^\7\b\2\2^_\7\t\2\2_a\7\4\2\2`b\5\30\r\2a`\3\2\2\2"+
		"bc\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\27\3\2\2\2ef\7\30\2\2fg\7\4\2\2gk\7\r"+
		"\2\2hi\7\22\2\2ij\7\27\2\2jl\5\32\16\2kh\3\2\2\2kl\3\2\2\2lp\3\2\2\2m"+
		"o\5\32\16\2nm\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qt\3\2\2\2rp\3\2\2"+
		"\2su\7\31\2\2ts\3\2\2\2tu\3\2\2\2uv\3\2\2\2vw\7\16\2\2w\31\3\2\2\2xy\7"+
		"\27\2\2yz\7\30\2\2z|\7\27\2\2{x\3\2\2\2{|\3\2\2\2|}\3\2\2\2}~\7\30\2\2"+
		"~\177\7\23\2\2\177\u0093\7\30\2\2\u0080\u008f\7\24\2\2\u0081\u008a\t\2"+
		"\2\2\u0082\u0084\7\25\2\2\u0083\u0085\t\2\2\2\u0084\u0083\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\3\2"+
		"\2\2\u0088\u0082\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u0081\3\2"+
		"\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u0092\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0094\7\26\2\2\u0093\u0080\3"+
		"\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\33\3\2\2\2\16<GUckpt{\u0086\u008a\u008f\u0095";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}