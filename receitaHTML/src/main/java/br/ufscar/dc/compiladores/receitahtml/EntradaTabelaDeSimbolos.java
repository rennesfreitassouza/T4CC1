package br.ufscar.dc.compiladores.receitahtml;



public class EntradaTabelaDeSimbolos {
    public enum TiporeceitaHTML{
        variavel,
        funcao,
        subfuncao
    }
    
    public enum CategoriareceitaHTML {
        ingrediente,
        utensilio,
        utilidade_utensilio
    }
    
    TiporeceitaHTML tipo;
    CategoriareceitaHTML categoria;
    String nome;
    String descricao;
}
