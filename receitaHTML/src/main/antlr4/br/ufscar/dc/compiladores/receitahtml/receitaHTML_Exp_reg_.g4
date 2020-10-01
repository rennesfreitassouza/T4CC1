grammar receitaHTML_Exp_reg_;

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

IDENTIFICADOR /*Expressão regular definida para reconhecer identificadores (nomes de variáveis, nomes de funções e identificadores de chamadas de funções).*/
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

utensilios /*Regra definida para reconhecer o padrão de formação de nenhum, um ou vários utensílios na linguagem receitaHTML.*/
        : 'UTENSILIOS' ':' (utensilio)*
        ;

utensilio /*Regra definida para reconhecer o padrão de formação de um utensílio na linguagem receitaHTML.*/
        : '-' IDENTIFICADOR '=' STRING '{' (faz_o_que)+ '}'
        ;

faz_o_que /*Regra definida para reconhecer o padrão de formação de definição do que um utensílio faz.*/
        : '*' IDENTIFICADOR '=' STRING
        ;

ingredientes /*Regra definida para reconhecer o padrão de formação de um ou vários ingredientes na linguagem receitaHTML.*/
        : 'INGREDIENTES' ':' (ingrediente)+
        ;

ingrediente /*Regra definida para reconhecer o padrão de formação de um ingrediente na linguagem receitaHTML.*/
        : '-' IDENTIFICADOR '=' STRING
        ;

modo_de_preparo /*Regra definida para reconhecer o padrão de formação do modo de preparo na linguagem receitaHTML.*/
        : 'MODO' 'DE' 'PREPARO' ':' (instrucoes_preparacao)+
        ;


instrucoes_preparacao /*Regra definida para reconhecer o padrão de formação das instruções de preparação de uma receita escrita na linguagem receitaHTML.*/
        : IDENTIFICADOR ':' '{'
                (condicional_ate)? (chamada_utensilio)+  (INSTRUCAO_PARAEXECUCAO)?
            '}'
        ;

chamada_utensilio /*Regra definida para reconhecer o padrão de formação de uma chamada a uma função e de sua respectiva subfunção.*/
    :   (instrucao_para_utensilio)?
            identificador_utensilio=IDENTIFICADOR '.' identificador_subfuncao_utensilio=IDENTIFICADOR 
                '(' (parametro ('+' parametro)*)? ')'
    ;

parametro /*Regra definida para reconhecer os dois padrões de formação de um possível parâmetro da linguagem receitaHTML.*/
    :
        IDENTIFICADOR | STRING
    ;
condicional_ate /*Regra definida para reconhecer o padrão de formação de um condicional ATE da linguagem receitaHTML.*/
    : palavra_reservada_ate='ATE' STRING chamada_utensilio
    ;

instrucao_para_utensilio /*Regra definida para reconhecer o padrão de formação de uma instrução para um utensílio que não foi definida e precisa ser escrita para que a receita esteja completa.*/
    : STRING1=STRING IDENTIFICADOR (STRING_OPCIONAL=STRING)?
    ;
