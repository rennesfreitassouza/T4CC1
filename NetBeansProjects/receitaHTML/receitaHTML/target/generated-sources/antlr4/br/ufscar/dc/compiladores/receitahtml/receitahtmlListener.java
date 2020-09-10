// Generated from br\u005Cufscar\dc\compiladores\receitahtml\receitahtml.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores.receitahtml;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link receitahtmlParser}.
 */
public interface receitahtmlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link receitahtmlParser#receita}.
	 * @param ctx the parse tree
	 */
	void enterReceita(receitahtmlParser.ReceitaContext ctx);
	/**
	 * Exit a parse tree produced by {@link receitahtmlParser#receita}.
	 * @param ctx the parse tree
	 */
	void exitReceita(receitahtmlParser.ReceitaContext ctx);
	/**
	 * Enter a parse tree produced by {@link receitahtmlParser#titulo}.
	 * @param ctx the parse tree
	 */
	void enterTitulo(receitahtmlParser.TituloContext ctx);
	/**
	 * Exit a parse tree produced by {@link receitahtmlParser#titulo}.
	 * @param ctx the parse tree
	 */
	void exitTitulo(receitahtmlParser.TituloContext ctx);
}