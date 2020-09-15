grammar receitaHTMLsemantico;

receita /*Regra definidas para reconhecer a estrutura básica de um código na linguagem receitahtml.*/
        : titulo descricao rendimento tempo_de_preparo utensilios ingredientes modo_de_preparo EOF
        ;

titulo /*Regra definida para reconhecer o padrão de formação de um título na linguagem receitaHTML.*/
        : 'NOME' ':' STRING
        ;

descricao /*Regra definida para reconhecer o padrão de formação de uma descrição na linguagem receitaHTML.*/
        : 'DESCRICAO' ':' STRING
        ;
rendimento /*Regra definida para reconhecer o padrão de formação de um rendimento na linguagem receitaHTML.*/
        : 'RENDIMENTO' ':' STRING
        ;

tempo_de_preparo /*Regra definida para reconhecer o padrão de formação de um tempo de preparo na linguagem receitaHTML.*/
        : 'TEMPO' 'DE' 'PREPARO' ':' STRING
        ;

utensilios /*Regra definida para reconhecer o padrão de formação de um ou vários utensílios na linguagem receitaHTML.*/
        : 'UTENSILIOS' ':' (utensilio)*
        ;

utensilio /*Regra definida para reconhecer o padrão de formação de um utensílio na linguagem receitaHTML.*/
        : '-' IdentVarfuncCham '=' STRING '{' (faz_o_que)+ '}'
        ;

faz_o_que /*Regra definida para reconhecer o padrão de formação de definição do que um utensílio faz.*/
        : '*' IdentVarfuncCham '=' STRING
        ;

ingredientes /*Regra definida para reconhecer o padrão de formação de um ou vários ingredientes na linguagem receitaHTML.*/
        : 'INGREDIENTES' ':' (ingrediente)+
        ;

ingrediente /*Regra definida para reconhecer o padrão de formação de um ingrediente na linguagem receitaHTML.*/
        : '-' IdentVarfuncCham '=' STRING
        ;

modo_de_preparo /*Regra definida para reconhecer o padrão de formação do modo de preparo na linguagem receitaHTML.*/
        : 'MODO' 'DE' 'PREPARO' ':' (instrucoes_preparacao)+
        ;


instrucoes_preparacao
        : IdentVarfuncCham ':' '{'
                ('ATE' STRING chamada_utensilio)? (chamada_utensilio)*  (INSTRUCAO_PARAEXECUCAO)?
            '}'
        ;

chamada_utensilio
    :   (STRING IdentVarfuncCham STRING)?
            IdentVarfuncCham '.' IdentVarfuncCham 
        ( '(' ( (IdentVarfuncCham | STRING) ('+' (IdentVarfuncCham | STRING)+ )* )* ')' )+
    ;
