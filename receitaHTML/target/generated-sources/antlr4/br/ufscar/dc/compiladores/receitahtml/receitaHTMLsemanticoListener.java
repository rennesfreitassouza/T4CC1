// Generated from br\u005Cufscar\dc\compiladores\receitahtml\receitaHTMLsemantico.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores.receitahtml;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link receitaHTMLsemanticoParser}.
 */
public interface receitaHTMLsemanticoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link receitaHTMLsemanticoParser#receita}.
	 * @param ctx the parse tree
	 */
	void enterReceita(receitaHTMLsemanticoParser.ReceitaContext ctx);
	/**
	 * Exit a parse tree produced by {@link receitaHTMLsemanticoParser#receita}.
	 * @param ctx the parse tree
	 */
	void exitReceita(receitaHTMLsemanticoParser.ReceitaContext ctx);
	/**
	 * Enter a parse tree produced by {@link receitaHTMLsemanticoParser#titulo}.
	 * @param ctx the parse tree
	 */
	void enterTitulo(receitaHTMLsemanticoParser.TituloContext ctx);
	/**
	 * Exit a parse tree produced by {@link receitaHTMLsemanticoParser#titulo}.
	 * @param ctx the parse tree
	 */
	void exitTitulo(receitaHTMLsemanticoParser.TituloContext ctx);
	/**
	 * Enter a parse tree produced by {@link receitaHTMLsemanticoParser#descricao}.
	 * @param ctx the parse tree
	 */
	void enterDescricao(receitaHTMLsemanticoParser.DescricaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link receitaHTMLsemanticoParser#descricao}.
	 * @param ctx the parse tree
	 */
	void exitDescricao(receitaHTMLsemanticoParser.DescricaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link receitaHTMLsemanticoParser#rendimento}.
	 * @param ctx the parse tree
	 */
	void enterRendimento(receitaHTMLsemanticoParser.RendimentoContext ctx);
	/**
	 * Exit a parse tree produced by {@link receitaHTMLsemanticoParser#rendimento}.
	 * @param ctx the parse tree
	 */
	void exitRendimento(receitaHTMLsemanticoParser.RendimentoContext ctx);
	/**
	 * Enter a parse tree produced by {@link receitaHTMLsemanticoParser#tempo_de_preparo}.
	 * @param ctx the parse tree
	 */
	void enterTempo_de_preparo(receitaHTMLsemanticoParser.Tempo_de_preparoContext ctx);
	/**
	 * Exit a parse tree produced by {@link receitaHTMLsemanticoParser#tempo_de_preparo}.
	 * @param ctx the parse tree
	 */
	void exitTempo_de_preparo(receitaHTMLsemanticoParser.Tempo_de_preparoContext ctx);
	/**
	 * Enter a parse tree produced by {@link receitaHTMLsemanticoParser#utensilios}.
	 * @param ctx the parse tree
	 */
	void enterUtensilios(receitaHTMLsemanticoParser.UtensiliosContext ctx);
	/**
	 * Exit a parse tree produced by {@link receitaHTMLsemanticoParser#utensilios}.
	 * @param ctx the parse tree
	 */
	void exitUtensilios(receitaHTMLsemanticoParser.UtensiliosContext ctx);
	/**
	 * Enter a parse tree produced by {@link receitaHTMLsemanticoParser#utensilio}.
	 * @param ctx the parse tree
	 */
	void enterUtensilio(receitaHTMLsemanticoParser.UtensilioContext ctx);
	/**
	 * Exit a parse tree produced by {@link receitaHTMLsemanticoParser#utensilio}.
	 * @param ctx the parse tree
	 */
	void exitUtensilio(receitaHTMLsemanticoParser.UtensilioContext ctx);
	/**
	 * Enter a parse tree produced by {@link receitaHTMLsemanticoParser#faz_o_que}.
	 * @param ctx the parse tree
	 */
	void enterFaz_o_que(receitaHTMLsemanticoParser.Faz_o_queContext ctx);
	/**
	 * Exit a parse tree produced by {@link receitaHTMLsemanticoParser#faz_o_que}.
	 * @param ctx the parse tree
	 */
	void exitFaz_o_que(receitaHTMLsemanticoParser.Faz_o_queContext ctx);
	/**
	 * Enter a parse tree produced by {@link receitaHTMLsemanticoParser#ingredientes}.
	 * @param ctx the parse tree
	 */
	void enterIngredientes(receitaHTMLsemanticoParser.IngredientesContext ctx);
	/**
	 * Exit a parse tree produced by {@link receitaHTMLsemanticoParser#ingredientes}.
	 * @param ctx the parse tree
	 */
	void exitIngredientes(receitaHTMLsemanticoParser.IngredientesContext ctx);
	/**
	 * Enter a parse tree produced by {@link receitaHTMLsemanticoParser#ingrediente}.
	 * @param ctx the parse tree
	 */
	void enterIngrediente(receitaHTMLsemanticoParser.IngredienteContext ctx);
	/**
	 * Exit a parse tree produced by {@link receitaHTMLsemanticoParser#ingrediente}.
	 * @param ctx the parse tree
	 */
	void exitIngrediente(receitaHTMLsemanticoParser.IngredienteContext ctx);
	/**
	 * Enter a parse tree produced by {@link receitaHTMLsemanticoParser#modo_de_preparo}.
	 * @param ctx the parse tree
	 */
	void enterModo_de_preparo(receitaHTMLsemanticoParser.Modo_de_preparoContext ctx);
	/**
	 * Exit a parse tree produced by {@link receitaHTMLsemanticoParser#modo_de_preparo}.
	 * @param ctx the parse tree
	 */
	void exitModo_de_preparo(receitaHTMLsemanticoParser.Modo_de_preparoContext ctx);
	/**
	 * Enter a parse tree produced by {@link receitaHTMLsemanticoParser#instrucoes_preparacao}.
	 * @param ctx the parse tree
	 */
	void enterInstrucoes_preparacao(receitaHTMLsemanticoParser.Instrucoes_preparacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link receitaHTMLsemanticoParser#instrucoes_preparacao}.
	 * @param ctx the parse tree
	 */
	void exitInstrucoes_preparacao(receitaHTMLsemanticoParser.Instrucoes_preparacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link receitaHTMLsemanticoParser#chamada_utensilio}.
	 * @param ctx the parse tree
	 */
	void enterChamada_utensilio(receitaHTMLsemanticoParser.Chamada_utensilioContext ctx);
	/**
	 * Exit a parse tree produced by {@link receitaHTMLsemanticoParser#chamada_utensilio}.
	 * @param ctx the parse tree
	 */
	void exitChamada_utensilio(receitaHTMLsemanticoParser.Chamada_utensilioContext ctx);
}