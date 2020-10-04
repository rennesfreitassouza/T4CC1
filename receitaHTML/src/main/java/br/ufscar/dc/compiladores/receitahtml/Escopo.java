package br.ufscar.dc.compiladores.receitahtml;

import java.util.LinkedList;
import java.util.List;

    // Na classe escopo é criada uma variável do tipo LinkedList. Esta variável, que representa uma lista,
    // terá apenas um item do tipo TabelaDeSimbolos, que representará o escopo de uma tabela de símbolos.

public class Escopo {
    private LinkedList<TabelaDeSimbolos> EscopoTabela;

    //Construtor da classe:
    public Escopo() {
        EscopoTabela = new LinkedList<>(); // Inicialização de uma lista ligada.
        EscopoTabela.push(new TabelaDeSimbolos()); //Empilha a única tabela de símbolos do escopo.
    }

    public TabelaDeSimbolos getEscopoTabela() // Método que obtém o escopo.
    {
        return EscopoTabela.peek(); // Retorna um item do tipo TabelaDeSimbolos do topo da pilha chamada EscopoTabela,
                                    // mas sem remover.
    }
    
    //Método ainda não usado.
    public void abandonarEscopo()
    {
        EscopoTabela.pop(); // Remove um item do topo da lista chamada EscopoTabela.
    }

}
