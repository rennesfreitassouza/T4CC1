
package br.ufscar.dc.compiladores.receitahtml;
import java.io.PrintWriter;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class MeuErrorListener extends BaseErrorListener {
    
      private static PrintWriter pw;
      
      public MeuErrorListener(PrintWriter escritaarquivo) {
        this.pw = escritaarquivo;   //Objeto do tipo PrintWriter que escreve no objeto 'arquivo' da classe Principal que está aberto para gravar dados.
    }
      
      
      @Override
      public void syntaxError(Recognizer<?,?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
      // Seu código aqui
      System.out.println("Erro sintático identificado.");
      int indexMenorQue = msg.lastIndexOf("<", msg.length() - 1);
      int indexMaiorQue = msg.lastIndexOf(">");
      pw.println("Linha "+charPositionInLine+": erro sintático proximo a "+msg.substring(indexMenorQue + 1, indexMaiorQue));
      
   } 
}
