package br.ufscar.dc.compiladores.receitahtml;

import java.util.LinkedList;
import java.util.List;
import org.antlr.v4.runtime.Token;

public class receitaHTMLSemantico extends receitaHTML_Exp_reg_BaseVisitor<Void>{
    Escopo escopoReceitaHTML; // Variável que armazenará o escopo que contém a tabela de símbolos.
    private LinkedList<Token> listaDeIngredientesDeclarados = new LinkedList<>(); //Lista que faz o controle dos Tokens com nomes de ingredientes
                                                                                   //inseridos na tabela, para posterior verificação do uso de todos
                                                                                   //eles no modo de preparo. 
    @Override
    public Void visitReceita(receitaHTML_Exp_reg_Parser.ReceitaContext ctx) {
        escopoReceitaHTML = new Escopo();
        return super.visitReceita(ctx);
    }
    
    @Override
    public Void visitUtensilio(receitaHTML_Exp_reg_Parser.UtensilioContext ctx){
        String nomeDaFuncao = new String(); //Utensílios foram considerados funções.
        List<receitaHTML_Exp_reg_Parser.Faz_o_queContext> listaDesubfuncoes = new LinkedList<receitaHTML_Exp_reg_Parser.Faz_o_queContext>();
        nomeDaFuncao = receitaHTMLSemanticoUtils.retornaIdentificador(escopoReceitaHTML.getEscopoTabela(), ctx.IDENTIFICADOR());
        if (!escopoReceitaHTML.getEscopoTabela().existe(nomeDaFuncao)) 
        //Se não existir na tabela de símbolos, adiciona uma nova entrada na tabela.
        {
            escopoReceitaHTML.getEscopoTabela().adicionar(EntradaTabelaDeSimbolos.TiporeceitaHTML.funcao, EntradaTabelaDeSimbolos.CategoriareceitaHTML.utensilio, nomeDaFuncao, "");
            listaDesubfuncoes = ctx.faz_o_que(); // Um um mesmo utensílio tem um identificador para cada utilidade deste utensílio. Essa utilidade foi classificada como uma subfunção.
            
            // A checagem de identificadores já declarados anteriormente para subfunções de uma mesma função também é feita neste visitante.            
            for (receitaHTML_Exp_reg_Parser.Faz_o_queContext subfuncao : listaDesubfuncoes){
                String identificadorsubfuncao = subfuncao.IDENTIFICADOR().getSymbol().getText();
                
                // Caso o identificador da subfunção (que fica armazenado na tabela no formato nomeDaFuncao.identificadorsubfuncao)
                // não seja encontrado na tabela, adiciona mais uma nova entrada na tabela.
                if(!escopoReceitaHTML.getEscopoTabela().existe(nomeDaFuncao +"."+identificadorsubfuncao)){
                    escopoReceitaHTML.getEscopoTabela().adicionar(EntradaTabelaDeSimbolos.TiporeceitaHTML.subfuncao, EntradaTabelaDeSimbolos.CategoriareceitaHTML.utilidade_utensilio, nomeDaFuncao +"."+identificadorsubfuncao, "");
                }
                else{
                    
                    // Caso o identificador da função seja encontrado na tabela, nenhum verificação quanto ao nome
                    // de subfunções já declarados nesta função é feita.
                    receitaHTMLSemanticoUtils.insereErroIdentificadorJaDeclarado(subfuncao.IDENTIFICADOR().getSymbol());
                }    
            }
        }
        else
        // Se existir na tabela, insere um erro na lista de erros semânticos.
        {
            receitaHTMLSemanticoUtils.insereErroIdentificadorJaDeclarado(ctx.IDENTIFICADOR().getSymbol());
        }
        return super.visitUtensilio(ctx);
    }

    @Override
    public Void visitIngrediente(receitaHTML_Exp_reg_Parser.IngredienteContext ctx){
        String nomeDaVariavel = new String(); //Ingredientes foram considerados variáveis.
        
        nomeDaVariavel = receitaHTMLSemanticoUtils.retornaIdentificador(escopoReceitaHTML.getEscopoTabela(), ctx.IDENTIFICADOR());
        if (!escopoReceitaHTML.getEscopoTabela().existe(nomeDaVariavel)) //Se não existir na tabela de símbolos, adiciona uma nova entrada na tabela.
        {
            escopoReceitaHTML.getEscopoTabela().adicionar(EntradaTabelaDeSimbolos.TiporeceitaHTML.variavel, EntradaTabelaDeSimbolos.CategoriareceitaHTML.ingrediente, nomeDaVariavel, "");
            listaDeIngredientesDeclarados.add(ctx.IDENTIFICADOR().getSymbol());
        }
        else // Se existir na tabela, insere um erro na lista de erros semânticos.
        {
            receitaHTMLSemanticoUtils.insereErroIdentificadorJaDeclarado(ctx.IDENTIFICADOR().getSymbol());
        }
        return super.visitIngrediente(ctx);
    }
    
    @Override
    public Void visitChamada_utensilio(receitaHTML_Exp_reg_Parser.Chamada_utensilioContext ctx){
        
        if (ctx.identificador_utensilio != null){
            if(escopoReceitaHTML.getEscopoTabela().existe(ctx.identificador_utensilio.getText()))
            // Se o identificador retornado por ctx.identificador_utensilio.getText() estiver na tabela, mas ....
            {
                if (escopoReceitaHTML.getEscopoTabela().getCategoriareceitaHTML(ctx.identificador_utensilio.getText()) 
                     != EntradaTabelaDeSimbolos.CategoriareceitaHTML.utensilio)
                // .... se não for de um utensílio, apresenta o erro semântico.
                {
                        receitaHTMLSemanticoUtils.insereErroChamadaDeFuncaoInvalida(ctx.identificador_utensilio);
                }
                else // ... senão, se for um utensílio, verifica se o próximo identificador é o de sua respectiva função.
                {
                    String identificador_utensilio = ctx.identificador_utensilio.getText();
                    String identificador_funcao_utensilio = identificador_utensilio + "." + ctx.identificador_subfuncao_utensilio.getText(); //Formato padrão que uma função de um utensílio é armazenada na tabela.
                    if (!escopoReceitaHTML.getEscopoTabela().existe(identificador_funcao_utensilio))
                    // Se a função existir, mas se a string identificador_funcao_utensilio
                    // não estiver armazenada na tabela neste formato, então ela não identifica uma subfunção daquela função.
                    // Por isso, um erro deverá ser apresentado.
                    {
                        receitaHTMLSemanticoUtils.insereErroSubfuncaoInvalida(ctx.identificador_subfuncao_utensilio, identificador_utensilio);
                    }
                    else // Senão, se a função e sua respectiva subfunção existirem na tabela, verifica escritas válidas
                         // para inserção ou não de ingredientes e outras especificações no utensílio.
                    {
                        for(receitaHTML_Exp_reg_Parser.ParametroContext par: ctx.parametro()){
                            if (par.IDENTIFICADOR() != null){
                                if (escopoReceitaHTML.getEscopoTabela().existe(par.IDENTIFICADOR().getText())){
                                    if (escopoReceitaHTML.getEscopoTabela().getCategoriareceitaHTML(par.IDENTIFICADOR().getText()) 
                                            != EntradaTabelaDeSimbolos.CategoriareceitaHTML.ingrediente){
                                        //Se existir na tabela, mas não for classificado como ingrediente, apresenta erro.
                                        receitaHTMLSemanticoUtils.insereErroIngredienteInvalido(par.IDENTIFICADOR().getSymbol());
                                    }
                                    else //Senão, se existir na tabela e for classificado como ingrediente, remove da listaDeIngredientesDeclarados a primeira ocorrencia da String par.IDENTIFICADOR().getText().
                                    {
                                        System.out.println(par.IDENTIFICADOR().getSymbol());
                                        escopoReceitaHTML.getEscopoTabela().setIngredienteFoiUsado(par.IDENTIFICADOR().getText());
                                    }
                                }
                                // Se foi identificado como um identificador, mas não está na tabela de símbolos, 
                                // também é considerado um ingrediente inválido.
                                else{
                                    receitaHTMLSemanticoUtils.insereErroIngredienteInvalido(par.IDENTIFICADOR().getSymbol());
                                }
                            }
                        }
                    }
                }
            }
            else // Senão, se o identificador retornado por ctx.identificador_utensilio.getText() não estiver na tabela.
            {
                receitaHTMLSemanticoUtils.insereErroChamadaDeFuncaoInvalida(ctx.identificador_utensilio);
            } // VERIFICAÇÃO DE VALIDADE DOS INGREDIENTES NÃO É FEITA.
        }
       
        
        return super.visitChamada_utensilio(ctx);
    }
    
    @Override
    public Void visitFim_de_arquivo(receitaHTML_Exp_reg_Parser.Fim_de_arquivoContext ctx){
        //Assim, por fim, caso listaDeIngredientesDeclarados ainda conter alguma String, um aviso será apresentado.
        for (Token ingrediente : listaDeIngredientesDeclarados){
            if (!escopoReceitaHTML.getEscopoTabela().getIngredienteFoiUsado(ingrediente.getText())) {
                receitaHTMLSemanticoUtils.insereAvisoDeIngredienteNaoUtilizado(ingrediente);
            }
        }
        return super.visitFim_de_arquivo(ctx);
    }
}

