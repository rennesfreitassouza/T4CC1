grammar receitaHTMLsintatico;

/*Início das regras léxicas:*/

PALAVRAS_RESERVADAS /*Expressão regular definida para identificar palavras reservadas da linguagem receitaHTML.*/
    : 'NOME' | 'DESCRICAO' | 'RENDIMENTO' | 'TEMPO' | 'PREPARO' | 'INGREDIENTES' |'MODO' | 'DE' 
    | 'UTENSILIOS' | ':' | '-' | '=' | '.' | '(' | ')' | '*' | '{' | '}' | ',' | '+' | 'ATE'
    ;

NUM_INT /*Expressão regular definida para reconhecer números inteiros*/
    :('0'..'9')+;

INSTRUCAO_PARAEXECUCAO
    : ('A'..'Z')+ ('_') ('A'..'Z')*
    ;

IdentVarfuncCham /*Expressão regular definida para reconhecer identificadores (nomes de variáveis, nomes de funções e identificadores de chamadas de funções).*/
    : ('a'..'z' | 'A'..'Z')('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*
    ;

STRING /*Expressão regular definida para reconhecer uma cadeia de caracteres delimitada por aspas duplas. */
    : '"' (ESC_SEQ | ~('"' | '\n' | '\\'))* '"'; /*Foi retirado o caractere '\\' */

fragment /*Fragmento defino como regra auxiliar para definição da expressão regular STRING*/
ESC_SEQ
    : '\\"';

CARACTERESIGNORADOS /*Expressão regular definida para reconhecer e ignorar espaços em branco e os caracteres '\t' e '\r'*/
    : ( ' ' | '\t' | '\r' | '\n' ) {skip();};

COMENTARIO /*Expressão regular definida para reconhecer e ignorar comentários da linguagem receitaHTML*/
    : '/' '/' ~('\n'|'\r')* ('\r')* '\n' {skip();} /*Somente são permitidos comentários de um linha e terminados com '\n'.*/
    ;

COMENTARIOSEMBARRA /*Expressão regular definida para reconhecer um comentário sem barras duplas.*/
    : '/'  ~('\n'|'\r')* ('\r')* '\n'
    ;

CADEIANFECHADA /*Expressão regular definida para reconhecer uma STRING não fechada por aspas duplas. */
    : '"' (ESC_SEQ | ~('"'))* '\n';

ErrorCharacter /*Expressão regular definida para reconhecer qualquer caractere que não esteja definido nas outras regras léxicas acima.*/
    : . ;

/*Início das regras sintáticas:*/
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