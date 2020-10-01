
package br.ufscar.dc.compiladores.receitahtml;

import br.ufscar.dc.compiladores.receitahtml.EntradaTabelaDeSimbolos.CategoriareceitaHTML;
import br.ufscar.dc.compiladores.receitahtml.EntradaTabelaDeSimbolos.TiporeceitaHTML;
import java.util.HashMap;
import java.util.Map;

//-  Entrada tabela de símbolos (é apenas um escopo por código em receitaHTML, portanto haverá apenas uma tabela de símbolos.
//TIPO 		CATEGORIA	 NOME
//variavel 	ingrediente 	nomedadoAoElemento
//funcao 		utensilio	nomedadoAoElemento
//sub-funcao	utensilio 	nomedafuncao.nomedasubfuncao

public class TabelaDeSimbolos {
    private final Map<String, EntradaTabelaDeSimbolos> tabela;

    public TabelaDeSimbolos() {
        this.tabela = new HashMap<>();
    }

    public void adicionar(TiporeceitaHTML tipo, CategoriareceitaHTML categoria, String nome, String descricao) {
        EntradaTabelaDeSimbolos etds = new EntradaTabelaDeSimbolos();
        etds.tipo = tipo;
        etds.categoria = categoria;
        etds.nome = nome;
        etds.descricao = descricao;
        tabela.put(nome, etds); // Insere na tabela por meio do método put. É passado para o método uma chave, nesse caso,
                                // o nome e um objeto do tipo EntradaTabelaDeSimbolos, que é a entrada.
                                // Então a tabeça de símbolos fica indexada através do nome.
    }

    public boolean existe(String nome) {
        return tabela.containsKey(nome);
    }

    public TiporeceitaHTML getTiporeceitaHTML(String nome) {
        return tabela.get(nome).tipo; // Método get retorna nulo se o mapa não contém aquela chave.
    }

    public CategoriareceitaHTML getCategoriareceitaHTML(String nome) {
        return tabela.get(nome).categoria; // Método get retorna nulo se o mapa não contém aquela chave.
    }
    
    public String getStringAtribuidaAoNome(String nome){
        return tabela.get(nome).nome;
    }
    
    public String getDescricao(String nome){
        return tabela.get(nome).descricao;
    }
    
}
