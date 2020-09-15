// Generated from br\u005Cufscar\dc\compiladores\receitahtml\receitaHTMLsintatico.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores.receitahtml;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link receitaHTMLsintaticoParser}.
 */
public interface receitaHTMLsintaticoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link receitaHTMLsintaticoParser#receita}.
	 * @param ctx the parse tree
	 */
	void enterReceita(receitaHTMLsintaticoParser.ReceitaContext ctx);
	/**
	 * Exit a parse tree produced by {@link receitaHTMLsintaticoParser#receita}.
	 * @param ctx the parse tree
	 */
	void exitReceita(receitaHTMLsintaticoParser.ReceitaContext ctx);
	/**
	 * Enter a parse tree produced by {@link receitaHTMLsintaticoParser#titulo}.
	 * @param ctx the parse tree
	 */
	void enterTitulo(receitaHTMLsintaticoParser.TituloContext ctx);
	/**
	 * Exit a parse tree produced by {@link receitaHTMLsintaticoParser#titulo}.
	 * @param ctx the parse tree
	 */
	void exitTitulo(receitaHTMLsintaticoParser.TituloContext ctx);
	/**
	 * Enter a parse tree produced by {@link receitaHTMLsintaticoParser#descricao}.
	 * @param ctx the parse tree
	 */
	void enterDescricao(receitaHTMLsintaticoParser.DescricaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link receitaHTMLsintaticoParser#descricao}.
	 * @param ctx the parse tree
	 */
	void exitDescricao(receitaHTMLsintaticoParser.DescricaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link receitaHTMLsintaticoParser#rendimento}.
	 * @param ctx the parse tree
	 */
	void enterRendimento(receitaHTMLsintaticoParser.RendimentoContext ctx);
	/**
	 * Exit a parse tree produced by {@link receitaHTMLsintaticoParser#rendimento}.
	 * @param ctx the parse tree
	 */
	void exitRendimento(receitaHTMLsintaticoParser.RendimentoContext ctx);
	/**
	 * Enter a parse tree produced by {@link receitaHTMLsintaticoParser#tempo_de_preparo}.
	 * @param ctx the parse tree
	 */
	void enterTempo_de_preparo(receitaHTMLsintaticoParser.Tempo_de_preparoContext ctx);
	/**
	 * Exit a parse tree produced by {@link receitaHTMLsintaticoParser#tempo_de_preparo}.
	 * @param ctx the parse tree
	 */
	void exitTempo_de_preparo(receitaHTMLsintaticoParser.Tempo_de_preparoContext ctx);
	/**
	 * Enter a parse tree produced by {@link receitaHTMLsintaticoParser#utensilios}.
	 * @param ctx the parse tree
	 */
	void enterUtensilios(receitaHTMLsintaticoParser.UtensiliosContext ctx);
	/**
	 * Exit a parse tree produced by {@link receitaHTMLsintaticoParser#utensilios}.
	 * @param ctx the parse tree
	 */
	void exitUtensilios(receitaHTMLsintaticoParser.UtensiliosContext ctx);
	/**
	 * Enter a parse tree produced by {@link receitaHTMLsintaticoParser#utensilio}.
	 * @param ctx the parse tree
	 */
	void enterUtensilio(receitaHTMLsintaticoParser.UtensilioContext ctx);
	/**
	 * Exit a parse tree produced by {@link receitaHTMLsintaticoParser#utensilio}.
	 * @param ctx the parse tree
	 */
	void exitUtensilio(receitaHTMLsintaticoParser.UtensilioContext ctx);
	/**
	 * Enter a parse tree produced by {@link receitaHTMLsintaticoParser#faz_o_que}.
	 * @param ctx the parse tree
	 */
	void enterFaz_o_que(receitaHTMLsintaticoParser.Faz_o_queContext ctx);
	/**
	 * Exit a parse tree produced by {@link receitaHTMLsintaticoParser#faz_o_que}.
	 * @param ctx the parse tree
	 */
	void exitFaz_o_que(receitaHTMLsintaticoParser.Faz_o_queContext ctx);
	/**
	 * Enter a parse tree produced by {@link receitaHTMLsintaticoParser#ingredientes}.
	 * @param ctx the parse tree
	 */
	void enterIngredientes(receitaHTMLsintaticoParser.IngredientesContext ctx);
	/**
	 * Exit a parse tree produced by {@link receitaHTMLsintaticoParser#ingredientes}.
	 * @param ctx the parse tree
	 */
	void exitIngredientes(receitaHTMLsintaticoParser.IngredientesContext ctx);
	/**
	 * Enter a parse tree produced by {@link receitaHTMLsintaticoParser#ingrediente}.
	 * @param ctx the parse tree
	 */
	void enterIngrediente(receitaHTMLsintaticoParser.IngredienteContext ctx);
	/**
	 * Exit a parse tree produced by {@link receitaHTMLsintaticoParser#ingrediente}.
	 * @param ctx the parse tree
	 */
	void exitIngrediente(receitaHTMLsintaticoParser.IngredienteContext ctx);
	/**
	 * Enter a parse tree produced by {@link receitaHTMLsintaticoParser#modo_de_preparo}.
	 * @param ctx the parse tree
	 */
	void enterModo_de_preparo(receitaHTMLsintaticoParser.Modo_de_preparoContext ctx);
	/**
	 * Exit a parse tree produced by {@link receitaHTMLsintaticoParser#modo_de_preparo}.
	 * @param ctx the parse tree
	 */
	void exitModo_de_preparo(receitaHTMLsintaticoParser.Modo_de_preparoContext ctx);
	/**
	 * Enter a parse tree produced by {@link receitaHTMLsintaticoParser#instrucoes_preparacao}.
	 * @param ctx the parse tree
	 */
	void enterInstrucoes_preparacao(receitaHTMLsintaticoParser.Instrucoes_preparacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link receitaHTMLsintaticoParser#instrucoes_preparacao}.
	 * @param ctx the parse tree
	 */
	void exitInstrucoes_preparacao(receitaHTMLsintaticoParser.Instrucoes_preparacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link receitaHTMLsintaticoParser#chamada_utensilio}.
	 * @param ctx the parse tree
	 */
	void enterChamada_utensilio(receitaHTMLsintaticoParser.Chamada_utensilioContext ctx);
	/**
	 * Exit a parse tree produced by {@link receitaHTMLsintaticoParser#chamada_utensilio}.
	 * @param ctx the parse tree
	 */
	void exitChamada_utensilio(receitaHTMLsintaticoParser.Chamada_utensilioContext ctx);
}