lexer grammar PyFlaskLexer;

// ---------- Keywords ----------
FROM    : 'from';
IMPORT  : 'import';
DEF     : 'def';
RETURN  : 'return';
IF      : 'if';
ELSE    : 'else';
FOR     : 'for';
IN      : 'in';
ROUTE   : 'route';

// ---------- Symbols ----------
LPAREN  : '(';
RPAREN  : ')';
LBRACK  : '[';
RBRACK  : ']';
LBRACE  : '{';
RBRACE  : '}';
COLON   : ':';
COMMA   : ',';
EQUAL   : '=';
DOT     : '.';

// ---------- Literals & Ids ----------
ID      : [a-zA-Z_][a-zA-Z0-9_]* ;
NUMBER  : [0-9]+ ('.' [0-9]+)? ;
STRING  : '"' ( '\\' . | ~["\\\r\n] )* '"' | '\'' ( '\\' . | ~['\\\r\n] )* '\'' ;

// ---------- Newline & WS ----------
NEWLINE : '\r'? '\n' ;
WS      : [ \t]+ -> skip ;

// ---------- Comments (optional) ----------
LINE_COMMENT : '//' ~[\r\n]* -> skip ;
BLOCK_COMMENT : '/*' .*? '*/' -> skip ;
