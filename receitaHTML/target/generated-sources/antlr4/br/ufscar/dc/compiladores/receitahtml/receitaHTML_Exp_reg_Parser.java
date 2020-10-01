// Generated from br\u005Cufscar\dc\compiladores\receitahtml\receitaHTML_Exp_reg_.g4 by ANTLR 4.7.2
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
public class receitaHTML_Exp_reg_Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, PALAVRAS_RESERVADAS=21, NUM_INT=22, INSTRUCAO_PARAEXECUCAO=23, 
		IDENTIFICADOR=24, STRING=25, CARACTERESIGNORADOS=26, COMENTARIO=27, COMENTARIOSEMBARRA=28, 
		CADEIANFECHADA=29, ErrorCharacter=30;
	public static final int
		RULE_receita = 0, RULE_titulo = 1, RULE_descricao = 2, RULE_rendimento = 3, 
		RULE_tempo_de_preparo = 4, RULE_utensilios = 5, RULE_utensilio = 6, RULE_faz_o_que = 7, 
		RULE_ingredientes = 8, RULE_ingrediente = 9, RULE_modo_de_preparo = 10, 
		RULE_instrucoes_preparacao = 11, RULE_chamada_utensilio = 12, RULE_parametro = 13, 
		RULE_condicional_ate = 14, RULE_instrucao_para_utensilio = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"receita", "titulo", "descricao", "rendimento", "tempo_de_preparo", "utensilios", 
			"utensilio", "faz_o_que", "ingredientes", "ingrediente", "modo_de_preparo", 
			"instrucoes_preparacao", "chamada_utensilio", "parametro", "condicional_ate", 
			"instrucao_para_utensilio"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'NOME'", "':'", "'DESCRICAO'", "'RENDIMENTO'", "'TEMPO'", "'DE'", 
			"'PREPARO'", "'UTENSILIOS'", "'-'", "'='", "'{'", "'}'", "'*'", "'INGREDIENTES'", 
			"'MODO'", "'.'", "'('", "'+'", "')'", "'ATE'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "PALAVRAS_RESERVADAS", 
			"NUM_INT", "INSTRUCAO_PARAEXECUCAO", "IDENTIFICADOR", "STRING", "CARACTERESIGNORADOS", 
			"COMENTARIO", "COMENTARIOSEMBARRA", "CADEIANFECHADA", "ErrorCharacter"
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
	public String getGrammarFileName() { return "receitaHTML_Exp_reg_.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public receitaHTML_Exp_reg_Parser(TokenStream input) {
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
		public TerminalNode EOF() { return getToken(receitaHTML_Exp_reg_Parser.EOF, 0); }
		public ReceitaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receita; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTML_Exp_reg_Listener ) ((receitaHTML_Exp_reg_Listener)listener).enterReceita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTML_Exp_reg_Listener ) ((receitaHTML_Exp_reg_Listener)listener).exitReceita(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof receitaHTML_Exp_reg_Visitor ) return ((receitaHTML_Exp_reg_Visitor<? extends T>)visitor).visitReceita(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReceitaContext receita() throws RecognitionException {
		ReceitaContext _localctx = new ReceitaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_receita);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			titulo();
			setState(33);
			descricao();
			setState(34);
			rendimento();
			setState(35);
			tempo_de_preparo();
			setState(36);
			utensilios();
			setState(37);
			ingredientes();
			setState(38);
			modo_de_preparo();
			setState(39);
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
		public TerminalNode STRING() { return getToken(receitaHTML_Exp_reg_Parser.STRING, 0); }
		public TituloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_titulo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTML_Exp_reg_Listener ) ((receitaHTML_Exp_reg_Listener)listener).enterTitulo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTML_Exp_reg_Listener ) ((receitaHTML_Exp_reg_Listener)listener).exitTitulo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof receitaHTML_Exp_reg_Visitor ) return ((receitaHTML_Exp_reg_Visitor<? extends T>)visitor).visitTitulo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TituloContext titulo() throws RecognitionException {
		TituloContext _localctx = new TituloContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_titulo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(T__0);
			setState(42);
			match(T__1);
			setState(43);
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
		public TerminalNode STRING() { return getToken(receitaHTML_Exp_reg_Parser.STRING, 0); }
		public DescricaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_descricao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTML_Exp_reg_Listener ) ((receitaHTML_Exp_reg_Listener)listener).enterDescricao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTML_Exp_reg_Listener ) ((receitaHTML_Exp_reg_Listener)listener).exitDescricao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof receitaHTML_Exp_reg_Visitor ) return ((receitaHTML_Exp_reg_Visitor<? extends T>)visitor).visitDescricao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescricaoContext descricao() throws RecognitionException {
		DescricaoContext _localctx = new DescricaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_descricao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(T__2);
			setState(46);
			match(T__1);
			setState(47);
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
		public TerminalNode STRING() { return getToken(receitaHTML_Exp_reg_Parser.STRING, 0); }
		public RendimentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rendimento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTML_Exp_reg_Listener ) ((receitaHTML_Exp_reg_Listener)listener).enterRendimento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTML_Exp_reg_Listener ) ((receitaHTML_Exp_reg_Listener)listener).exitRendimento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof receitaHTML_Exp_reg_Visitor ) return ((receitaHTML_Exp_reg_Visitor<? extends T>)visitor).visitRendimento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RendimentoContext rendimento() throws RecognitionException {
		RendimentoContext _localctx = new RendimentoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_rendimento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(T__3);
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

	public static class Tempo_de_preparoContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(receitaHTML_Exp_reg_Parser.STRING, 0); }
		public Tempo_de_preparoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tempo_de_preparo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTML_Exp_reg_Listener ) ((receitaHTML_Exp_reg_Listener)listener).enterTempo_de_preparo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTML_Exp_reg_Listener ) ((receitaHTML_Exp_reg_Listener)listener).exitTempo_de_preparo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof receitaHTML_Exp_reg_Visitor ) return ((receitaHTML_Exp_reg_Visitor<? extends T>)visitor).visitTempo_de_preparo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tempo_de_preparoContext tempo_de_preparo() throws RecognitionException {
		Tempo_de_preparoContext _localctx = new Tempo_de_preparoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tempo_de_preparo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(T__4);
			setState(54);
			match(T__5);
			setState(55);
			match(T__6);
			setState(56);
			match(T__1);
			setState(57);
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
			if ( listener instanceof receitaHTML_Exp_reg_Listener ) ((receitaHTML_Exp_reg_Listener)listener).enterUtensilios(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTML_Exp_reg_Listener ) ((receitaHTML_Exp_reg_Listener)listener).exitUtensilios(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof receitaHTML_Exp_reg_Visitor ) return ((receitaHTML_Exp_reg_Visitor<? extends T>)visitor).visitUtensilios(this);
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
			setState(59);
			match(T__7);
			setState(60);
			match(T__1);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(61);
				utensilio();
				}
				}
				setState(66);
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
		public TerminalNode IDENTIFICADOR() { return getToken(receitaHTML_Exp_reg_Parser.IDENTIFICADOR, 0); }
		public TerminalNode STRING() { return getToken(receitaHTML_Exp_reg_Parser.STRING, 0); }
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
			if ( listener instanceof receitaHTML_Exp_reg_Listener ) ((receitaHTML_Exp_reg_Listener)listener).enterUtensilio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTML_Exp_reg_Listener ) ((receitaHTML_Exp_reg_Listener)listener).exitUtensilio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof receitaHTML_Exp_reg_Visitor ) return ((receitaHTML_Exp_reg_Visitor<? extends T>)visitor).visitUtensilio(this);
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
			setState(67);
			match(T__8);
			setState(68);
			match(IDENTIFICADOR);
			setState(69);
			match(T__9);
			setState(70);
			match(STRING);
			setState(71);
			match(T__10);
			setState(73); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(72);
				faz_o_que();
				}
				}
				setState(75); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__12 );
			setState(77);
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
		public TerminalNode IDENTIFICADOR() { return getToken(receitaHTML_Exp_reg_Parser.IDENTIFICADOR, 0); }
		public TerminalNode STRING() { return getToken(receitaHTML_Exp_reg_Parser.STRING, 0); }
		public Faz_o_queContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_faz_o_que; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTML_Exp_reg_Listener ) ((receitaHTML_Exp_reg_Listener)listener).enterFaz_o_que(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTML_Exp_reg_Listener ) ((receitaHTML_Exp_reg_Listener)listener).exitFaz_o_que(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof receitaHTML_Exp_reg_Visitor ) return ((receitaHTML_Exp_reg_Visitor<? extends T>)visitor).visitFaz_o_que(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Faz_o_queContext faz_o_que() throws RecognitionException {
		Faz_o_queContext _localctx = new Faz_o_queContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_faz_o_que);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(T__12);
			setState(80);
			match(IDENTIFICADOR);
			setState(81);
			match(T__9);
			setState(82);
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
			if ( listener instanceof receitaHTML_Exp_reg_Listener ) ((receitaHTML_Exp_reg_Listener)listener).enterIngredientes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTML_Exp_reg_Listener ) ((receitaHTML_Exp_reg_Listener)listener).exitIngredientes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof receitaHTML_Exp_reg_Visitor ) return ((receitaHTML_Exp_reg_Visitor<? extends T>)visitor).visitIngredientes(this);
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
			setState(84);
			match(T__13);
			setState(85);
			match(T__1);
			setState(87); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(86);
				ingrediente();
				}
				}
				setState(89); 
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
		public TerminalNode IDENTIFICADOR() { return getToken(receitaHTML_Exp_reg_Parser.IDENTIFICADOR, 0); }
		public TerminalNode STRING() { return getToken(receitaHTML_Exp_reg_Parser.STRING, 0); }
		public IngredienteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ingrediente; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTML_Exp_reg_Listener ) ((receitaHTML_Exp_reg_Listener)listener).enterIngrediente(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTML_Exp_reg_Listener ) ((receitaHTML_Exp_reg_Listener)listener).exitIngrediente(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof receitaHTML_Exp_reg_Visitor ) return ((receitaHTML_Exp_reg_Visitor<? extends T>)visitor).visitIngrediente(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IngredienteContext ingrediente() throws RecognitionException {
		IngredienteContext _localctx = new IngredienteContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ingrediente);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(T__8);
			setState(92);
			match(IDENTIFICADOR);
			setState(93);
			match(T__9);
			setState(94);
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
			if ( listener instanceof receitaHTML_Exp_reg_Listener ) ((receitaHTML_Exp_reg_Listener)listener).enterModo_de_preparo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTML_Exp_reg_Listener ) ((receitaHTML_Exp_reg_Listener)listener).exitModo_de_preparo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof receitaHTML_Exp_reg_Visitor ) return ((receitaHTML_Exp_reg_Visitor<? extends T>)visitor).visitModo_de_preparo(this);
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
			setState(96);
			match(T__14);
			setState(97);
			match(T__5);
			setState(98);
			match(T__6);
			setState(99);
			match(T__1);
			setState(101); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(100);
				instrucoes_preparacao();
				}
				}
				setState(103); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFICADOR );
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
		public TerminalNode IDENTIFICADOR() { return getToken(receitaHTML_Exp_reg_Parser.IDENTIFICADOR, 0); }
		public Condicional_ateContext condicional_ate() {
			return getRuleContext(Condicional_ateContext.class,0);
		}
		public List<Chamada_utensilioContext> chamada_utensilio() {
			return getRuleContexts(Chamada_utensilioContext.class);
		}
		public Chamada_utensilioContext chamada_utensilio(int i) {
			return getRuleContext(Chamada_utensilioContext.class,i);
		}
		public TerminalNode INSTRUCAO_PARAEXECUCAO() { return getToken(receitaHTML_Exp_reg_Parser.INSTRUCAO_PARAEXECUCAO, 0); }
		public Instrucoes_preparacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucoes_preparacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTML_Exp_reg_Listener ) ((receitaHTML_Exp_reg_Listener)listener).enterInstrucoes_preparacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTML_Exp_reg_Listener ) ((receitaHTML_Exp_reg_Listener)listener).exitInstrucoes_preparacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof receitaHTML_Exp_reg_Visitor ) return ((receitaHTML_Exp_reg_Visitor<? extends T>)visitor).visitInstrucoes_preparacao(this);
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
			setState(105);
			match(IDENTIFICADOR);
			setState(106);
			match(T__1);
			setState(107);
			match(T__10);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(108);
				condicional_ate();
				}
			}

			setState(112); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(111);
				chamada_utensilio();
				}
				}
				setState(114); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFICADOR || _la==STRING );
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INSTRUCAO_PARAEXECUCAO) {
				{
				setState(116);
				match(INSTRUCAO_PARAEXECUCAO);
				}
			}

			setState(119);
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
		public Token identificador_utensilio;
		public Token identificador_subfuncao_utensilio;
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(receitaHTML_Exp_reg_Parser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(receitaHTML_Exp_reg_Parser.IDENTIFICADOR, i);
		}
		public Instrucao_para_utensilioContext instrucao_para_utensilio() {
			return getRuleContext(Instrucao_para_utensilioContext.class,0);
		}
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public Chamada_utensilioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada_utensilio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTML_Exp_reg_Listener ) ((receitaHTML_Exp_reg_Listener)listener).enterChamada_utensilio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTML_Exp_reg_Listener ) ((receitaHTML_Exp_reg_Listener)listener).exitChamada_utensilio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof receitaHTML_Exp_reg_Visitor ) return ((receitaHTML_Exp_reg_Visitor<? extends T>)visitor).visitChamada_utensilio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Chamada_utensilioContext chamada_utensilio() throws RecognitionException {
		Chamada_utensilioContext _localctx = new Chamada_utensilioContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_chamada_utensilio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(121);
				instrucao_para_utensilio();
				}
			}

			setState(124);
			((Chamada_utensilioContext)_localctx).identificador_utensilio = match(IDENTIFICADOR);
			setState(125);
			match(T__15);
			setState(126);
			((Chamada_utensilioContext)_localctx).identificador_subfuncao_utensilio = match(IDENTIFICADOR);
			setState(127);
			match(T__16);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFICADOR || _la==STRING) {
				{
				setState(128);
				parametro();
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(129);
					match(T__17);
					setState(130);
					parametro();
					}
					}
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(138);
			match(T__18);
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

	public static class ParametroContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(receitaHTML_Exp_reg_Parser.IDENTIFICADOR, 0); }
		public TerminalNode STRING() { return getToken(receitaHTML_Exp_reg_Parser.STRING, 0); }
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTML_Exp_reg_Listener ) ((receitaHTML_Exp_reg_Listener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTML_Exp_reg_Listener ) ((receitaHTML_Exp_reg_Listener)listener).exitParametro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof receitaHTML_Exp_reg_Visitor ) return ((receitaHTML_Exp_reg_Visitor<? extends T>)visitor).visitParametro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_parametro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFICADOR || _la==STRING) ) {
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

	public static class Condicional_ateContext extends ParserRuleContext {
		public Token palavra_reservada_ate;
		public TerminalNode STRING() { return getToken(receitaHTML_Exp_reg_Parser.STRING, 0); }
		public Chamada_utensilioContext chamada_utensilio() {
			return getRuleContext(Chamada_utensilioContext.class,0);
		}
		public Condicional_ateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional_ate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTML_Exp_reg_Listener ) ((receitaHTML_Exp_reg_Listener)listener).enterCondicional_ate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTML_Exp_reg_Listener ) ((receitaHTML_Exp_reg_Listener)listener).exitCondicional_ate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof receitaHTML_Exp_reg_Visitor ) return ((receitaHTML_Exp_reg_Visitor<? extends T>)visitor).visitCondicional_ate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condicional_ateContext condicional_ate() throws RecognitionException {
		Condicional_ateContext _localctx = new Condicional_ateContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_condicional_ate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			((Condicional_ateContext)_localctx).palavra_reservada_ate = match(T__19);
			setState(143);
			match(STRING);
			setState(144);
			chamada_utensilio();
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

	public static class Instrucao_para_utensilioContext extends ParserRuleContext {
		public Token STRING1;
		public Token STRING_OPCIONAL;
		public TerminalNode IDENTIFICADOR() { return getToken(receitaHTML_Exp_reg_Parser.IDENTIFICADOR, 0); }
		public List<TerminalNode> STRING() { return getTokens(receitaHTML_Exp_reg_Parser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(receitaHTML_Exp_reg_Parser.STRING, i);
		}
		public Instrucao_para_utensilioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucao_para_utensilio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTML_Exp_reg_Listener ) ((receitaHTML_Exp_reg_Listener)listener).enterInstrucao_para_utensilio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof receitaHTML_Exp_reg_Listener ) ((receitaHTML_Exp_reg_Listener)listener).exitInstrucao_para_utensilio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof receitaHTML_Exp_reg_Visitor ) return ((receitaHTML_Exp_reg_Visitor<? extends T>)visitor).visitInstrucao_para_utensilio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instrucao_para_utensilioContext instrucao_para_utensilio() throws RecognitionException {
		Instrucao_para_utensilioContext _localctx = new Instrucao_para_utensilioContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_instrucao_para_utensilio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			((Instrucao_para_utensilioContext)_localctx).STRING1 = match(STRING);
			setState(147);
			match(IDENTIFICADOR);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(148);
				((Instrucao_para_utensilioContext)_localctx).STRING_OPCIONAL = match(STRING);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u009a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7A\n\7\f\7\16\7D\13\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\6\bL\n\b\r\b\16\bM\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\6\nZ\n\n\r\n\16\n[\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\6\fh\n\f\r\f\16\fi\3\r\3\r\3\r\3\r\5\rp\n\r\3\r\6\rs\n\r\r\r\16\rt"+
		"\3\r\5\rx\n\r\3\r\3\r\3\16\5\16}\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\7\16\u0086\n\16\f\16\16\16\u0089\13\16\5\16\u008b\n\16\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\5\21\u0098\n\21\3\21\2\2\22"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\3\3\2\32\33\2\u0094\2\"\3\2"+
		"\2\2\4+\3\2\2\2\6/\3\2\2\2\b\63\3\2\2\2\n\67\3\2\2\2\f=\3\2\2\2\16E\3"+
		"\2\2\2\20Q\3\2\2\2\22V\3\2\2\2\24]\3\2\2\2\26b\3\2\2\2\30k\3\2\2\2\32"+
		"|\3\2\2\2\34\u008e\3\2\2\2\36\u0090\3\2\2\2 \u0094\3\2\2\2\"#\5\4\3\2"+
		"#$\5\6\4\2$%\5\b\5\2%&\5\n\6\2&\'\5\f\7\2\'(\5\22\n\2()\5\26\f\2)*\7\2"+
		"\2\3*\3\3\2\2\2+,\7\3\2\2,-\7\4\2\2-.\7\33\2\2.\5\3\2\2\2/\60\7\5\2\2"+
		"\60\61\7\4\2\2\61\62\7\33\2\2\62\7\3\2\2\2\63\64\7\6\2\2\64\65\7\4\2\2"+
		"\65\66\7\33\2\2\66\t\3\2\2\2\678\7\7\2\289\7\b\2\29:\7\t\2\2:;\7\4\2\2"+
		";<\7\33\2\2<\13\3\2\2\2=>\7\n\2\2>B\7\4\2\2?A\5\16\b\2@?\3\2\2\2AD\3\2"+
		"\2\2B@\3\2\2\2BC\3\2\2\2C\r\3\2\2\2DB\3\2\2\2EF\7\13\2\2FG\7\32\2\2GH"+
		"\7\f\2\2HI\7\33\2\2IK\7\r\2\2JL\5\20\t\2KJ\3\2\2\2LM\3\2\2\2MK\3\2\2\2"+
		"MN\3\2\2\2NO\3\2\2\2OP\7\16\2\2P\17\3\2\2\2QR\7\17\2\2RS\7\32\2\2ST\7"+
		"\f\2\2TU\7\33\2\2U\21\3\2\2\2VW\7\20\2\2WY\7\4\2\2XZ\5\24\13\2YX\3\2\2"+
		"\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\23\3\2\2\2]^\7\13\2\2^_\7\32\2\2_"+
		"`\7\f\2\2`a\7\33\2\2a\25\3\2\2\2bc\7\21\2\2cd\7\b\2\2de\7\t\2\2eg\7\4"+
		"\2\2fh\5\30\r\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\27\3\2\2\2kl"+
		"\7\32\2\2lm\7\4\2\2mo\7\r\2\2np\5\36\20\2on\3\2\2\2op\3\2\2\2pr\3\2\2"+
		"\2qs\5\32\16\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2\2vx\7\31"+
		"\2\2wv\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\7\16\2\2z\31\3\2\2\2{}\5 \21\2|{"+
		"\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\177\7\32\2\2\177\u0080\7\22\2\2\u0080\u0081"+
		"\7\32\2\2\u0081\u008a\7\23\2\2\u0082\u0087\5\34\17\2\u0083\u0084\7\24"+
		"\2\2\u0084\u0086\5\34\17\2\u0085\u0083\3\2\2\2\u0086\u0089\3\2\2\2\u0087"+
		"\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2"+
		"\2\2\u008a\u0082\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u008d\7\25\2\2\u008d\33\3\2\2\2\u008e\u008f\t\2\2\2\u008f\35\3\2\2\2"+
		"\u0090\u0091\7\26\2\2\u0091\u0092\7\33\2\2\u0092\u0093\5\32\16\2\u0093"+
		"\37\3\2\2\2\u0094\u0095\7\33\2\2\u0095\u0097\7\32\2\2\u0096\u0098\7\33"+
		"\2\2\u0097\u0096\3\2\2\2\u0097\u0098\3\2\2\2\u0098!\3\2\2\2\rBM[iotw|"+
		"\u0087\u008a\u0097";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}