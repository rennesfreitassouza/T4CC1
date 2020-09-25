package br.ufscar.dc.compiladores.receitahtml;

public class receitaHTMLGeradordeHTML extends receitaHTML_Exp_reg_BaseVisitor<Void> {

    StringBuilder saida; // Para construir o código HTML é usado a classe StringBuilder. O objeto saida do tipo StringBuilder é um acumulador de Strings.
    Escopo escopoReceitaHTML; // Para construir o código HTML é usado a classe Escopo.

    public receitaHTMLGeradordeHTML() {
        escopoReceitaHTML = new Escopo();
        saida = new StringBuilder();
    }

    @Override
    public Void visitReceita(receitaHTML_Exp_reg_Parser.ReceitaContext ctx) {
        saida.append("<doctype html>\n");
        saida.append("<html lang=\"pt-br\">\n");
        saida.append("<head>\n");
        saida.append("<title>Minhas Receitas</title>\n");
        saida.append("<meta charset=\"utf-8\">\n");
        saida.append("<meta name=\"description\" content=\"Esta é uma página gerada a partir de um código na linguagem receitaHTML.\">\n");
        
        // Código CSS?
        
        saida.append("</head>\n");
        saida.append("<body>\n");
        
        //TABELAS AQUI.
        
        saida.append("</body>\n");
        saida.append("</html>");
//        if (ctx.corpo().declaracao_local().isEmpty()) // Se não houver nenhum padrão reconhecido na regra declaracao_local, insere a String a seguir no acumulador de Strings.
//        {
//          saida.append("int main() {\n");
//        }
//        ctx.declaracoes().decl_local_global().forEach(declaracoes -> visitDeclaracoes(ctx.declaracoes()));
        //ctx.corpo().
        // TESTAR WHILE <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
//        visitCorpo(ctx.corpo());
//        ctx.declaracao().forEach(dec -> visitDeclaracao(dec)); // Aqui é feita as declarações de variáveis. No arquivo Alguma.g4, declarações da regra programa é uma lista
//        .forEach varre a lista de declarações. Para cada declaração, ocorre a chamada do visitDeclaracao(dec). No visitDeclaracao(dec) é feito o código da declaração.
//        saida.append("\treturn 0;\n");
//        saida.append("}");
//        saida.append("int main() {\n");
//        ctx.comando().forEach(cmd -> visitComando(cmd));//Semelhante a declaração.
//        saida.append("}\n");
        return null;
    }
    
}
