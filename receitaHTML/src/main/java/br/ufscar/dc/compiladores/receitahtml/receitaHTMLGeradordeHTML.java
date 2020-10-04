package br.ufscar.dc.compiladores.receitahtml;

public class receitaHTMLGeradordeHTML extends receitaHTML_Exp_reg_BaseVisitor<Void> {

    StringBuilder saida; // Para construir o código HTML é usado a classe StringBuilder. O objeto saida do tipo StringBuilder é um acumulador de Strings.
    Escopo escopoReceitaHTML; // Para construir o código HTML é usado a classe Escopo.
    int duracaoTotal = -1;
    public receitaHTMLGeradordeHTML() {
        escopoReceitaHTML = new Escopo();
        saida = new StringBuilder();
    }

    @Override
    //Visitante que chama todos os outros para geração de código.
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
        
        visitTitulo(ctx.titulo()); 
        visitDescricao(ctx.descricao());
        visitRendimento(ctx.rendimento()); 
        
        visitTempo_de_preparo(ctx.tempo_de_preparo());
        
        visitUtensilios(ctx.utensilios());
        visitIngredientes(ctx.ingredientes());
        visitModo_de_preparo(ctx.modo_de_preparo());
        
        visitTempo_de_preparo(ctx.tempo_de_preparo());
        
        saida.append("</body>\n");
        saida.append("</html>");

        return null;
    }
    
    
    @Override
    // Inserção da string referente ao titulo da receita no objeto desta classe chamado saida.
    public Void visitTitulo(receitaHTML_Exp_reg_Parser.TituloContext ctx){
        String tituloSemAspas = ctx.STRING().getText().replaceAll("\"", "");
        saida.append("<h1 id=\"titulo\">"+tituloSemAspas+"</h1>\n");
        return null;
    }

    @Override
    // Inserção da string referente a descrição da receita no objeto desta classe chamado saida.
    public Void visitDescricao(receitaHTML_Exp_reg_Parser.DescricaoContext ctx) {
        String descricaoSemAspas = ctx.STRING().getText().replaceAll("\"", "");
        saida.append("<h2 class=\"descricao\">Descrição: " +descricaoSemAspas+ "</h2>\n");
        return null;
    }
    
    @Override
    // Inserção da string referente ao rendimento da receita no objeto desta classe chamado saida.
    public Void visitRendimento(receitaHTML_Exp_reg_Parser.RendimentoContext ctx) {
        String rendimentoSemAspas = ctx.STRING().getText().replaceAll("\"", "");
        saida.append("<strong>Rendimento: </strong>\n");
        saida.append(rendimentoSemAspas+"<br>\n");
        return null;
    }
    
    @Override
    // Inserção da string referente ao tempo de preparo da receita no objeto desta classe chamado saida.
    // Caso nenhum número inteiro que representa a duração do tempo de preparo de cada passo, ou apenas o número 0 ou menor que 0 for inserido em todos os passos
    // no código na linguagem receitaHTML, o valor impresso no arquivo de saida não será contabilizado e a string entre aspas presente no código 
    // será impressa (ela deve sempre estar presente no código).
    public Void visitTempo_de_preparo(receitaHTML_Exp_reg_Parser.Tempo_de_preparoContext ctx){
        String tempo_de_preparoSemAspas = ctx.STRING().getText().replaceAll("\"", "");
        if (duracaoTotal == -1){
            saida.append("<strong>Tempo de preparo: </strong>\n");
            saida.append(tempo_de_preparoSemAspas+ "<br>\n");
            duracaoTotal = 0;
        }
        else
        {
            if(duracaoTotal > 0){
                saida.replace(saida.indexOf(tempo_de_preparoSemAspas+ "<br>\n"), saida.indexOf("<strong>Utensílios:</strong>\n"), duracaoTotal+" minutos.<br>\n");
            }
        }
        return null;
    }
    
    @Override
    // Aqui é feita a chamada ao visitor visitUtensilio para inserção de uma string no objeto desta classe chamado
    // saida e também inserção de valores na tabela de símbolos.
    public Void visitUtensilios(receitaHTML_Exp_reg_Parser.UtensiliosContext ctx){
        saida.append("<strong>Utensílios:</strong>\n");
        
        saida.append("<ul id=\"listaNaoOrdenada\">\n");        
        if (!ctx.utensilio().isEmpty()) {
            for(receitaHTML_Exp_reg_Parser.UtensilioContext utensilio : ctx.utensilio()) {
                visitUtensilio(utensilio);
            }
        }
        else{
            saida.append("---Nenhum item declarado---<br>");
        }
        
        saida.append("</ul>\n");
        return null;
    }
    
    @Override
    // Inserção da string referente a cada identificador de utensílio da receita no objeto desta classe chamado saida.
    // Inserção dos dados necessário na tabela de símbolos que serão necessários para produzir o modo de preparo.
    public Void visitUtensilio(receitaHTML_Exp_reg_Parser.UtensilioContext ctx) {
        
        saida.append("<li>"+ctx.STRING().getText().replaceAll("\"", "")+"</li>\n");
        //Adiciona na tabela de símbolos todos os dados necessários para que a página HTML seja construída como
        //descrito no código na linguagem receitaHTML.
        escopoReceitaHTML.getEscopoTabela().adicionar(EntradaTabelaDeSimbolos.TiporeceitaHTML.funcao, 
                                                EntradaTabelaDeSimbolos.CategoriareceitaHTML.utensilio, 
                                                ctx.IDENTIFICADOR().getText(),
                                                ctx.STRING().getText().replaceAll("\"", "")); // Descrição.
        // A regra faz_o_que deste visitor nunca será vazia. Essa verificação é desnecessária.
        // Dessa forma, é adiciona na tabela o nome das subfunções e suas respectivas strings para posterior substituição
        // nas listas do código HTML.
        for (receitaHTML_Exp_reg_Parser.Faz_o_queContext utilidade : ctx.faz_o_que()) {
            escopoReceitaHTML.getEscopoTabela().adicionar(EntradaTabelaDeSimbolos.TiporeceitaHTML.subfuncao,
                    EntradaTabelaDeSimbolos.CategoriareceitaHTML.utilidade_utensilio,
                    ctx.IDENTIFICADOR().getText()+ "." +utilidade.IDENTIFICADOR().getText(),
                    utilidade.STRING().getText().replaceAll("\"", "")); // Foram retiradas as aspas da String.
        }
        return null;
    }
    
    @Override
    // Aqui é feita a chamada ao visitor visitIngrediente para inserção de uma string no objeto desta classe chamado
    // saida e também a inserção de valores na tabela de símbolos.
    public Void visitIngredientes(receitaHTML_Exp_reg_Parser.IngredientesContext ctx){
        saida.append("<strong>Ingredientes:</strong>\n");
        
        saida.append("<ul id=\"listaNaoOrdenada\">\n");
        for (receitaHTML_Exp_reg_Parser.IngredienteContext ingrediente : ctx.ingrediente()) {
            visitIngrediente(ingrediente);
        }
        saida.append("</ul>\n");
        return null;
    }
    
    @Override
    // Inserção da string referente a cada descrição de ingrediente da receita no objeto desta classe chamado saida.
    // Inserção dos dados necessário na tabela de símbolos que serão necessários para produzir o modo de preparo.
    public Void visitIngrediente(receitaHTML_Exp_reg_Parser.IngredienteContext ctx) {
        saida.append("<li>" + ctx.STRING().getText().replaceAll("\"", "") + "</li>");
        // Adiciona na tabela de símbolos todos os dados necessários para que a página HTML seja construída como
        // descrito no código na linguagem receitaHTML.
        escopoReceitaHTML.getEscopoTabela().adicionar(EntradaTabelaDeSimbolos.TiporeceitaHTML.variavel,
                EntradaTabelaDeSimbolos.CategoriareceitaHTML.ingrediente,
                ctx.IDENTIFICADOR().getText(),
                ctx.STRING().getText().replaceAll("\"", ""));        
        
        return null;
    }
    
    @Override
    // Neste visitor ocorre a chamada do visitor instrucoes_preparacao, onde a substituição dos valores
    // encontrados na tabela pelos respectivos valores encontrados no código na linguagem receitaHTML começarão a ocorrer. 
    // Assim, o armazenamento das instruções da lógica do modo de preparo poderá ser feita no arquivo HTML.
    public Void visitModo_de_preparo(receitaHTML_Exp_reg_Parser.Modo_de_preparoContext ctx){
        saida.append("<strong>Modo de preparo:</strong>\n");
        saida.append("<ol id=\"listaOrdenada\">\n");
        
        // Para cada bloco (é considerado bloco tudo aquilo que está entre chaves), é feita uma chamada ao visitor
        // instrucoes_preparacao, que será um passo do modo de preparo da receita.
        for (receitaHTML_Exp_reg_Parser.Instrucoes_preparacaoContext instrucoes_preparacao : ctx.instrucoes_preparacao()) {
            saida.append("<li>");
            visitInstrucoes_preparacao(instrucoes_preparacao);
            saida.append("</li>\n");
        }
        saida.append("<ol id=\"listaOdenada\">\n");
        return null;
    }
    
    @Override
    // Verificação da existencia das regras que fazem parte desta regra que reconhecem certos padrões.
    // Assim, o modo de preparo pode ser gerado.
    public Void visitInstrucoes_preparacao(receitaHTML_Exp_reg_Parser.Instrucoes_preparacaoContext ctx){
        if (ctx.NUM_INT() != null){
            duracaoTotal += Integer.parseInt(ctx.NUM_INT().getText());
        }
        if(ctx.condicional_ate() != null){
            visitCondicional_ate(ctx.condicional_ate());
            saida.append(".");
        }
        
        for (receitaHTML_Exp_reg_Parser.Chamada_utensilioContext chamada_utensilio : ctx.chamada_utensilio()){
            visitChamada_utensilio(chamada_utensilio);
        }
        
        if(!ctx.formato_INSTRUCAO_PARAEXECUCAO().isEmpty()){
            for  (receitaHTML_Exp_reg_Parser.Formato_INSTRUCAO_PARAEXECUCAOContext formato_INSTRUCAO_PARAEXECUCAO : ctx.formato_INSTRUCAO_PARAEXECUCAO()){
                saida.append (" "+formato_INSTRUCAO_PARAEXECUCAO.STRING().getText().replaceAll("\"", " "));
            }
        }
        
        //O que é melhor para otimização da execução do compilador: um condicional + um comando, ou varios comandos e nenhum condicional?
        
        return null;
    }
    
    @Override
    // Este método insere no objeto saida desta classe das strings as strings necessárias para que o modo de preparo seja impresso na formatação
    // padrão da linguagem receitaHTML.
    public Void visitChamada_utensilio(receitaHTML_Exp_reg_Parser.Chamada_utensilioContext ctx){
        if(ctx.instrucao_para_utensilio() != null){
            visitInstrucao_para_utensilio(ctx.instrucao_para_utensilio());
        }
        if (ctx.identificador_utensilio != null){
            saida.append(" "+escopoReceitaHTML.getEscopoTabela().getDescricao(ctx.identificador_utensilio.getText()+"."
                            +ctx.identificador_subfuncao_utensilio.getText()));
            saida.append(" "+escopoReceitaHTML.getEscopoTabela().getDescricao(ctx.identificador_utensilio.getText()));

            if (!ctx.parametro().isEmpty()){
                saida.append(":");
            }

            int qtdparametros = ctx.parametro().size();
            for(receitaHTML_Exp_reg_Parser.ParametroContext parametro : ctx.parametro()){
                if(parametro.IDENTIFICADOR() != null)
                {
                    saida.append(" "+escopoReceitaHTML.getEscopoTabela().getDescricao(parametro.getText()));
                }
                else{
                    if(parametro.STRING() != null){
                        saida.append(" "+parametro.STRING().getText().replaceAll("\"", ""));
                    }
                }
                qtdparametros--;
                if (qtdparametros != 0){
                    if (qtdparametros != 1){
                        saida.append(",");
                    }
                    else{
                        saida.append(" e");
                    }
                }

            }
            saida.append(".");
        }
        return null;
    }
    
    @Override
    // Este visitor faz as chamadas a visitChamada_utensilio e faz o armazenamento no objeto saida desta classe das strings que fazem parte do 
    // condicional ate da linguagem receitaHTML.
    public Void visitCondicional_ate(receitaHTML_Exp_reg_Parser.Condicional_ateContext ctx){
        
        visitChamada_utensilio(ctx.chamada_utensilio());
        saida.append(" "+ctx.palavra_reservada_ate.getText().toLowerCase());
        saida.append(" "+ctx.STRING().getText().replaceAll("\"", ""));
        
        
        return null;
    }
    
    @Override
    // Este visitor faz o armazenamento no objeto saida desta classe das strings que precisam ser armazenadas no arquivo HTML de saída para que
    // a instrução do que fazer com um utensílio apareça na receita formatada em HTML.
    public Void visitInstrucao_para_utensilio(receitaHTML_Exp_reg_Parser.Instrucao_para_utensilioContext ctx){
        saida.append(ctx.STRING1.getText().replaceAll("\"", ""));
        saida.append(" "+escopoReceitaHTML.getEscopoTabela().getDescricao(ctx.IDENTIFICADOR().getText()));
        if (ctx.STRING_OPCIONAL != null){
            saida.append(" "+ctx.STRING_OPCIONAL.getText().replaceAll("\"", ""));
        }
        saida.append(".");
        return null;
    }
}
