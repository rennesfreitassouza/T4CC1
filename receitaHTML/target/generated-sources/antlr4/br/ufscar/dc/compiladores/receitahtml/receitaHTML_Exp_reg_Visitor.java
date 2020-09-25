// Generated from br\u005Cufscar\dc\compiladores\receitahtml\receitaHTML_Exp_reg_.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores.receitahtml;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link receitaHTML_Exp_reg_Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface receitaHTML_Exp_reg_Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link receitaHTML_Exp_reg_Parser#receita}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceita(receitaHTML_Exp_reg_Parser.ReceitaContext ctx);
	/**
	 * Visit a parse tree produced by {@link receitaHTML_Exp_reg_Parser#titulo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitulo(receitaHTML_Exp_reg_Parser.TituloContext ctx);
	/**
	 * Visit a parse tree produced by {@link receitaHTML_Exp_reg_Parser#descricao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescricao(receitaHTML_Exp_reg_Parser.DescricaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link receitaHTML_Exp_reg_Parser#rendimento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRendimento(receitaHTML_Exp_reg_Parser.RendimentoContext ctx);
	/**
	 * Visit a parse tree produced by {@link receitaHTML_Exp_reg_Parser#tempo_de_preparo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTempo_de_preparo(receitaHTML_Exp_reg_Parser.Tempo_de_preparoContext ctx);
	/**
	 * Visit a parse tree produced by {@link receitaHTML_Exp_reg_Parser#utensilios}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUtensilios(receitaHTML_Exp_reg_Parser.UtensiliosContext ctx);
	/**
	 * Visit a parse tree produced by {@link receitaHTML_Exp_reg_Parser#utensilio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUtensilio(receitaHTML_Exp_reg_Parser.UtensilioContext ctx);
	/**
	 * Visit a parse tree produced by {@link receitaHTML_Exp_reg_Parser#faz_o_que}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFaz_o_que(receitaHTML_Exp_reg_Parser.Faz_o_queContext ctx);
	/**
	 * Visit a parse tree produced by {@link receitaHTML_Exp_reg_Parser#ingredientes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIngredientes(receitaHTML_Exp_reg_Parser.IngredientesContext ctx);
	/**
	 * Visit a parse tree produced by {@link receitaHTML_Exp_reg_Parser#ingrediente}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIngrediente(receitaHTML_Exp_reg_Parser.IngredienteContext ctx);
	/**
	 * Visit a parse tree produced by {@link receitaHTML_Exp_reg_Parser#modo_de_preparo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModo_de_preparo(receitaHTML_Exp_reg_Parser.Modo_de_preparoContext ctx);
	/**
	 * Visit a parse tree produced by {@link receitaHTML_Exp_reg_Parser#instrucoes_preparacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucoes_preparacao(receitaHTML_Exp_reg_Parser.Instrucoes_preparacaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link receitaHTML_Exp_reg_Parser#chamada_utensilio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChamada_utensilio(receitaHTML_Exp_reg_Parser.Chamada_utensilioContext ctx);
	/**
	 * Visit a parse tree produced by {@link receitaHTML_Exp_reg_Parser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(receitaHTML_Exp_reg_Parser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link receitaHTML_Exp_reg_Parser#condicional_ate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional_ate(receitaHTML_Exp_reg_Parser.Condicional_ateContext ctx);
	/**
	 * Visit a parse tree produced by {@link receitaHTML_Exp_reg_Parser#instrucao_para_utensilio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucao_para_utensilio(receitaHTML_Exp_reg_Parser.Instrucao_para_utensilioContext ctx);
}