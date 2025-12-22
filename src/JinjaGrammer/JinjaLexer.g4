lexer grammar JinjaLexer;




// ======================================================
// DEFAULT MODE  (HTML + JINJA entry points)
// ======================================================

// -------- HTML --------
HTML_COMMENT : '<!--' .*? '-->' ;
HTML_DOCTYPE : '<!DOCTYPE' .*? '>' ; // إضافة دعم DOCTYPE
HTML_TEXT    : (~[<{] | '{' ~[{%#])+ ;
TAG_OPEN     : '<' -> pushMode(TAG) ;

// -------- WHITESPACE --------
SEA_WS : [ \t\r\n]+ -> channel(HIDDEN);

// -------- JINJA entry --------
JINJA_EXPR_START  : '{{' -> pushMode(JINJA) ;
JINJA_BLOCK_START : '{%' -> pushMode(JINJA) ;
JINJA_COMMENT     : '{#' .*? '#}' -> skip ;

// ======================================================
// TAG MODE
// ======================================================
mode TAG;

TAG_CLOSE       : '>'  -> popMode ;
TAG_SLASH_CLOSE : '/>' -> popMode ;
TAG_SLASH       : '/' ;
TAG_EQUALS      : '=' ;

TAG_NAME
    : [a-zA-Z_:] [a-zA-Z0-9_:.-]*
    ;

TAG_WS : [ \t\r\n]+ -> channel(HIDDEN) ;

// TAG_STRING بعد تصحيح escape
TAG_STRING
    : '"' (~["\\])* '"'
    | '\'' (~['])* '\''
    ;

// ======================================================
// JINJA MODE
// ======================================================
mode JINJA;

JINJA_WS : [ \t\r\n]+ -> skip ;

// -------- block endings --------
JINJA_END_EXPR  : '}}' -> popMode ;
JINJA_END_BLOCK : '%}' -> popMode ;

// -------- keywords --------
JINJA_IF       : 'if' ;
JINJA_ELIF     : 'elif' ;
JINJA_ELSE     : 'else' ;
JINJA_FOR      : 'for' ;
JINJA_IN       : 'in' ;
JINJA_SET      : 'set' ;
JINJA_ENDIF    : 'endif' ;
JINJA_ENDFOR   : 'endfor' ;
JINJA_CONTINUE : 'continue' ;
JINJA_BREAK    : 'break' ;

// -------- constants --------
JINJA_NONE  : 'none' ;
JINJA_TRUE  : 'true' ;
JINJA_FALSE : 'false' ;

// -------- logical --------
JINJA_AND : 'and' ;
JINJA_OR  : 'or' ;
JINJA_NOT : 'not' ;
JINJA_IS  : 'is' ;

// -------- comparison --------
JINJA_EQ  : '==' ;
JINJA_NEQ : '!=' ;
JINJA_GTE : '>=' ;
JINJA_LTE : '<=' ;
JINJA_GT  : '>' ;
JINJA_LT  : '<' ;

// -------- arithmetic --------
JINJA_ASSIGN : '=' ;
JINJA_ADD    : '+' ;
JINJA_SUB    : '-' ;
JINJA_MUL    : '*' ;
JINJA_DIV    : '/' ;
JINJA_MOD    : '%' ;

// -------- access / filters --------
JINJA_DOT  : '.' ;
JINJA_PIPE : '|' ;

// -------- punctuation --------
JINJA_LPAREN : '(' ;
JINJA_RPAREN : ')' ;
JINJA_LBRACK : '[' ;
JINJA_RBRACK : ']' ;
JINJA_COLON  : ':' ;
JINJA_COMMA  : ',' ;

// -------- literals --------
JINJA_DOUBLE
    : [0-9]+ '.' [0-9]+
    | '.' [0-9]+
    ;

JINJA_INT
    : [0-9]+
    ;
JINJA_STRING : '"' (~["\\])* '"' | '\'' (~['])* '\'' ;

// -------- identifiers --------
JINJA_ID : [a-zA-Z_][a-zA-Z0-9_]* ;
