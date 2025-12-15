lexer grammar JinjaLexer;

// =====================
// JINJA DELIMITERS
// =====================
VAR_START   : '{{';
VAR_END     : '}}';
BLOCK_START : '{%';
BLOCK_END   : '%}';

// =====================
// JINJA KEYWORDS
// =====================
IF      : 'if';
ENDIF   : 'endif';
FOR     : 'for';
ENDFOR  : 'endfor';
IN      : 'in';

// =====================
// IDENTIFIER
// =====================
ID : [a-zA-Z_][a-zA-Z0-9_]*;

// =====================
// TEXT (HTML + ANYTHING)
// =====================
// ⚠️ هذه أهم قاعدة
TEXT
    : ( ~[{]+
      | '{' ~[{%]
      | '{%' ~[}]
      | '{{' ~[}]
      )+
    ;

// =====================
// WHITESPACE
// =====================
WS : [ \t\r\n]+ -> skip;
