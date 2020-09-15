// Generated from br\u005Cufscar\dc\compiladores\receitahtml\receitaHTMLsintatico.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores.receitahtml;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link receitaHTMLsintaticoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface receitaHTMLsintaticoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link receitaHTMLsintaticoParser#receita}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceita(receitaHTMLsintaticoParser.ReceitaContext ctx);
	/**
	 * Visit a parse tree produced by {@link receitaHTMLsintaticoParser#titulo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitulo(receitaHTMLsintaticoParser.TituloContext ctx);
	/**
	 * Visit a parse tree produced by {@link receitaHTMLsintaticoParser#descricao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescricao(receitaHTMLsintaticoParser.DescricaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link receitaHTMLsintaticoParser#rendimento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRendimento(receitaHTMLsintaticoParser.RendimentoContext ctx);
	/**
	 * Visit a parse tree produced by {@link receitaHTMLsintaticoParser#tempo_de_preparo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTempo_de_preparo(receitaHTMLsintaticoParser.Tempo_de_preparoContext ctx);
	/**
	 * Visit a parse tree produced by {@link receitaHTMLsintaticoParser#utensilios}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUtensilios(receitaHTMLsintaticoParser.UtensiliosContext ctx);
	/**
	 * Visit a parse tree produced by {@link receitaHTMLsintaticoParser#utensilio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUtensilio(receitaHTMLsintaticoParser.UtensilioContext ctx);
	/**
	 * Visit a parse tree produced by {@link receitaHTMLsintaticoParser#faz_o_que}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFaz_o_que(receitaHTMLsintaticoParser.Faz_o_queContext ctx);
	/**
	 * Visit a parse tree produced by {@link receitaHTMLsintaticoParser#ingredientes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIngredientes(receitaHTMLsintaticoParser.IngredientesContext ctx);
	/**
	 * Visit a parse tree produced by {@link receitaHTMLsintaticoParser#ingrediente}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIngrediente(receitaHTMLsintaticoParser.IngredienteContext ctx);
	/**
	 * Visit a parse tree produced by {@link receitaHTMLsintaticoParser#modo_de_preparo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModo_de_preparo(receitaHTMLsintaticoParser.Modo_de_preparoContext ctx);
	/**
	 * Visit a parse tree produced by {@link receitaHTMLsintaticoParser#instrucoes_preparacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucoes_preparacao(receitaHTMLsintaticoParser.Instrucoes_preparacaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link receitaHTMLsintaticoParser#chamada_utensilio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChamada_utensilio(receitaHTMLsintaticoParser.Chamada_utensilioContext ctx);
}