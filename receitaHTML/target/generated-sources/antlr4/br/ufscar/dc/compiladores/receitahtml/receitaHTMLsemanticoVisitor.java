// Generated from br\u005Cufscar\dc\compiladores\receitahtml\receitaHTMLsemantico.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores.receitahtml;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link receitaHTMLsemanticoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface receitaHTMLsemanticoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link receitaHTMLsemanticoParser#receita}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceita(receitaHTMLsemanticoParser.ReceitaContext ctx);
	/**
	 * Visit a parse tree produced by {@link receitaHTMLsemanticoParser#titulo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitulo(receitaHTMLsemanticoParser.TituloContext ctx);
	/**
	 * Visit a parse tree produced by {@link receitaHTMLsemanticoParser#descricao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescricao(receitaHTMLsemanticoParser.DescricaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link receitaHTMLsemanticoParser#rendimento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRendimento(receitaHTMLsemanticoParser.RendimentoContext ctx);
	/**
	 * Visit a parse tree produced by {@link receitaHTMLsemanticoParser#tempo_de_preparo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTempo_de_preparo(receitaHTMLsemanticoParser.Tempo_de_preparoContext ctx);
	/**
	 * Visit a parse tree produced by {@link receitaHTMLsemanticoParser#utensilios}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUtensilios(receitaHTMLsemanticoParser.UtensiliosContext ctx);
	/**
	 * Visit a parse tree produced by {@link receitaHTMLsemanticoParser#utensilio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUtensilio(receitaHTMLsemanticoParser.UtensilioContext ctx);
	/**
	 * Visit a parse tree produced by {@link receitaHTMLsemanticoParser#faz_o_que}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFaz_o_que(receitaHTMLsemanticoParser.Faz_o_queContext ctx);
	/**
	 * Visit a parse tree produced by {@link receitaHTMLsemanticoParser#ingredientes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIngredientes(receitaHTMLsemanticoParser.IngredientesContext ctx);
	/**
	 * Visit a parse tree produced by {@link receitaHTMLsemanticoParser#ingrediente}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIngrediente(receitaHTMLsemanticoParser.IngredienteContext ctx);
	/**
	 * Visit a parse tree produced by {@link receitaHTMLsemanticoParser#modo_de_preparo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModo_de_preparo(receitaHTMLsemanticoParser.Modo_de_preparoContext ctx);
	/**
	 * Visit a parse tree produced by {@link receitaHTMLsemanticoParser#instrucoes_preparacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucoes_preparacao(receitaHTMLsemanticoParser.Instrucoes_preparacaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link receitaHTMLsemanticoParser#chamada_utensilio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChamada_utensilio(receitaHTMLsemanticoParser.Chamada_utensilioContext ctx);
}