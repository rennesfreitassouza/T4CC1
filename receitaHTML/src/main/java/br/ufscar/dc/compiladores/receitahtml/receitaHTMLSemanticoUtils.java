package br.ufscar.dc.compiladores.receitahtml;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

public class receitaHTMLSemanticoUtils {
    
    public static List<String> errosSemanticos = new ArrayList<>();
    //errosSemanticos é uma lista de Strings. quando o método add for invocado a partir dela, a String indicada é adicionada na lista.
    
    public static String retornaIdentificador(TabelaDeSimbolos tabela, TerminalNode Identificador) {
        String ret = new String();
        
        ret = Identificador.getText();
        return ret;
    }
    
    public static void insereErroIdentificadorJaDeclarado(Token identificador){
        errosSemanticos.add("Linha "+identificador.getLine()+": identificador "+identificador.getText()+" já declarado anteriormente.");
    }

    public static void insereErroChamadaDeFuncaoInvalida(Token identificador_utensilio) {
        errosSemanticos.add("Linha "+identificador_utensilio.getLine()+": "+identificador_utensilio.getText()+" é uma chamada inválida para um utensílio.");
    }

    static void insereErroSubfuncaoInvalida(Token identificador_funcao_utensilio, String identificador_utensilio) {
        errosSemanticos.add("Linha "+identificador_funcao_utensilio.getLine()+": "+identificador_funcao_utensilio.getText()+" não é uma utilidade válida para o utensílio "+identificador_utensilio+".");
    }

    static void insereErroIngredienteInvalido(Token identificador_ingrediente) {
        errosSemanticos.add("Linha "+identificador_ingrediente.getLine()+": identificador "+identificador_ingrediente.getText()+" para ingrediente inválido.");
    }
    
    static void insereAvisoDeIngredienteNaoUtilizado(Token ingredienteNaoUtilizado){
        errosSemanticos.add("Aviso: ingrediente "+ingredienteNaoUtilizado.getText()+" declarado na linha "+ingredienteNaoUtilizado.getLine()+" não utilizado na receita.");

    }
}
