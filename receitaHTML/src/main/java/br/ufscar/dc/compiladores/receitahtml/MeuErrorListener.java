
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
      System.out.println("Erro identificado.");
      pw.println("Erro identificado:"+msg);
   } 
}
