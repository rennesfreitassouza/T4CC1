package br.ufscar.dc.compiladores.receitahtml;

import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import org.antlr.v4.runtime.RecognitionException;

public class Principal {
    public static void main(String args[])  throws IOException {
        CharStream cs = CharStreams.fromFileName(args[0]); //Objeto cs da classe CharStream (que gera um fluxo de caracteres) que chama o método utilitário da classe CharStreams.fromFileName para ser construído.
        //A classe CharStreams.fromFileName tem como argumento aquilo que é passado por linha de comando quando o programa é chamado.
       
        //Caso o código fonte não possuir erros léxicos, os tokens que seriam armazenados em arquivo são descartados e um novo arquivo é criado.
        FileOutputStream arquivo = new FileOutputStream(args[1]); //Objeto com nome de 'arquivo' do tipo FileOutputStream que cria um arquivo .txt no diretório passado no segundo argumento por linha de comando para ser escrito.
        PrintWriter pr = new PrintWriter(arquivo); // Objeto do tipo PrintWriter que escreve no objeto 'arquivo' que está aberto para gravar dados.

        receitaHTML_Exp_reg_Lexer lexicoParaSintatico = new receitaHTML_Exp_reg_Lexer(cs); //Construção do léxico.
        CommonTokenStream tokens = new CommonTokenStream(lexicoParaSintatico); //Inicialização do buffer de tokens.
        receitaHTML_Exp_reg_Parser parser = new receitaHTML_Exp_reg_Parser(tokens); //Inicialização do parser. Para sua inicialização é passado como argumento o fluxo de tokens, que aponta para o lexer, que aponta para o arquivo inserido na linha de comando.
        MeuErrorListener meuErrorListener = new MeuErrorListener(pr);
        
        
        parser.addErrorListener(meuErrorListener);
        parser.receita(); // A execução do parser começa chamando o símbolo inicial (regra receita), já que esse é um analisador sintático descendente (ele começa pelo o símbolo inicial da gramática e vai descendo na árvore para construir a árvore sintática).
        //retorna. flag para identificar errros imantico
        pr.close();
        arquivo.close();
        
        //Análise semantica começa a partir daqui.
    }
}
