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
        receitaHTMLlexicoLexer lex = new receitaHTMLlexicoLexer(cs); //Construção do léxico.
        Token t = null; //Declaração de um token.
        
        //Saída dos tokens no terminal
//        while((t = lex.nextToken()).getType() != Token.EOF){
//            System.out.println("<'" + t.getText() + "','" + t.getType() + "'>"); // Impressão do Token.
//        }
        FileOutputStream arquivo = new FileOutputStream(args[1]); //Objeto com nome de 'arquivo' do tipo FileOutputStream que cria um arquivo .txt no diretório passado no segundo argumento por linha de comando para ser escrito.
        PrintWriter pr = new PrintWriter(arquivo); // Objeto do tipo PrintWriter que escreve no objeto 'arquivo' que está aberto para gravar dados.
        boolean possuiErroLexico = false; // Variável que armazena um falor true caso houver um erro léxico no código na linguagem receitaHTML.
        
        while ((t = lex.nextToken()).getType() != Token.EOF) //Loop criado para ler todos os tokens do arquivo até que o tipo do token retornado não seja fim de arquivo.
        {
            if (t.getType() == 1) {
                pr.println("<'" + t.getText() + "','" + t.getText() + "'>"); // Impressão do token referente a regra léxica PALAVRAS_RESERVADAS (presente no arquivo receitaHTMLlexico.tokens) no formato exigido no Trabalho 1 da disciplina chamada Construção de Compiladores.
            } else {
                if (t.getType() == 2 || t.getType() == 3 || t.getType() == 4 ||  t.getType() == 5) {
                    pr.println("<'" + t.getText() + "'," + receitaHTMLlexicoLexer.VOCABULARY.getDisplayName(t.getType()) + ">"); // Impressão,  no formato exigido, do token referente a uma das regras léxicas seguintes: NUM_INT, INSTRUCAO_PARAEXECUCAO, IdentVarfuncCham e STRING
                } else {
                    if (t.getType() == 9) {
                        pr.println("Linha " +t.getLine()+ ": string nao fechada."); // Impressão de um aviso que é criado a partir da detecção pela regra léxica CADEIANFECHADA de uma string não fechada com aspas duplas.
                        possuiErroLexico = true;
                        System.out.println("Erro léxico identificado.");
                        break;
                    } else {
                        if (t.getType() == 8) {
                            pr.println("Linha " +t.getLine()+ ": comentario sem barra dupla."); // Impressão de um aviso que é criado a partir da detecção pela regra léxica COMENTARIOSEMBARRA  de um possível comentário em que está faltando um caractere '/' no início do comentário.
                            possuiErroLexico = true;
                            System.out.println("Erro léxico identificado.");
                            break;
                        } else {
                            pr.println("Linha " + t.getLine() + ": símbolo não identificado."); // Impressão de um aviso que é criado a partir da detecção pela regra léxica ErrorCharacter de um símbolo não identificado.
                            possuiErroLexico = true;
                            System.out.println("Erro léxico identificado.");
                            break;
                        }
                    }

                }
            }
        }
        if(possuiErroLexico == true){
            pr.close();
            arquivo.close();
            System.exit(0);
        }
        //Caso o código fonte não possuir erros léxicos, os tokens que seriam armazenados em arquivo são descartados e um novo arquivo é criado.
        arquivo = new FileOutputStream(args[1]); //Objeto com nome de 'arquivo' do tipo FileOutputStream que cria um arquivo .txt no diretório passado no segundo argumento por linha de comando para ser escrito.
        pr = new PrintWriter(arquivo); // Objeto do tipo PrintWriter que escreve no objeto 'arquivo' que está aberto para gravar dados.

        receitaHTMLsintaticoLexer lexicoParaSintatico = new receitaHTMLsintaticoLexer(cs); //Construção do léxico.
        CommonTokenStream tokens = new CommonTokenStream(lex); //Inicialização do buffer de tokens.
        receitaHTMLsintaticoParser parser = new receitaHTMLsintaticoParser(tokens); //Inicialização do parser. Para sua inicialização é passado como argumento o fluxo de tokens, que aponta para o lexer, que aponta para o arquivo inserido na linha de comando.
        MeuErrorListener meuErrorListener = new MeuErrorListener(pr);
        
        
        parser.addErrorListener(meuErrorListener);
        parser.receita(); // A execução do parser começa chamando o símbolo inicial (regra receita), já que esse é um analisador sintático descendente (ele começa pelo o símbolo inicial da gramática e vai descendo na árvore para construir a árvore sintática).
        
        pr.close();
        arquivo.close();
    }
}
