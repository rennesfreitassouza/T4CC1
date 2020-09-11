lexer grammar receitaHTMLlexicoLexer;

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

