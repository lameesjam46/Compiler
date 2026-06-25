lexer grammar PyFlaskLexer;

@header {
    import org.antlr.v4.runtime.*;
    import java.util.*;
}

@lexer::members {

    java.util.Stack<Integer> stack = new java.util.Stack<>();
    java.util.LinkedList<Token> queue = new java.util.LinkedList<>();
    boolean needBlock = false;

    int p = 0, b = 0, c = 0;

    private CommonToken makeToken(int type, String text) {
        CommonToken t = new CommonToken(type, text);
        t.setStartIndex(_input.index());
        t.setStopIndex(_input.index() - 1);
        t.setLine(getLine());
        t.setCharPositionInLine(getCharPositionInLine());
        return t;
    }

    void checkSpace() {
            int count = 0;

            // قمنا بفصل الشرط في متغير مستقل لتجنب مشاكل الأقواس أثناء التوليد
            while (true) {
                int currentLA = _input.LA(1);
                if (currentLA == ' ' || currentLA == '\t') {
                    count++;
                    _input.consume();
                } else {
                    break;
                }
            }

            int next = _input.LA(1);
            // صياغة صريحة ومفصّلة ليفهمها الـ Compiler بدون أي لبس
            if (next == '\r' || next == '\n' || next == -1) {
                return;
            }

            int last = stack.isEmpty() ? 0 : stack.peek();

            if (needBlock) {
                stack.push(count);
                queue.add(makeToken(BLOCKSTART, "<BLOCKSTART>"));
                needBlock = false;
            } else if (count > last) {
                stack.push(count);
                queue.add(makeToken(BLOCKSTART, "<BLOCKSTART>"));
            } else {
                while (!stack.isEmpty() && stack.peek() > count) {
                    stack.pop();
                    queue.add(makeToken(BLOCKEND, "<BLOCKEND>"));
                }
            }
        }

    @Override
    public Token nextToken() {
        while (true) {
            if (!queue.isEmpty()) return queue.pollFirst();

            Token t = super.nextToken();

            if (t.getType() == EOF) {
                while (!stack.isEmpty()) {
                    stack.pop();
                    queue.add(makeToken(BLOCKEND, "<BLOCKEND>"));
                }
                if (!queue.isEmpty()) continue;
                return t;
            }

            if (t.getType() == NEWLINE) {
                if (p == 0 && b == 0 && c == 0) {
                    checkSpace();
                }
                continue;
            }
            return t;
        }
    }
}

LPAREN  : '(' { p++; } ;
RPAREN  : ')' { p--; } ;
LBRACK  : '[' { b++; } ;
RBRACK  : ']' { b--; } ;
LBRACE  : '{' { c++; } ;
RBRACE  : '}' { c--; } ;

ATSIGN  : '@' ;
DOT     : '.' ;
COMMA   : ',' ;
COLON   : ':' {
    if (p == 0 && b == 0 && c == 0) needBlock = true;
};
ASSIGN  : '=' ;
EQ      : '==' ;
PLUS    : '+' ;
MINUS   : '-' ;
STAR    : '*' ;
SLASH   : '/' ;
BREAK   : 'break';
CONTINUE: 'continue';

DEF     : 'def' ;
IF      : 'if' ;
ELSE    : 'else' ;
FOR     : 'for' ;
IN      : 'in' ;
FROM    : 'from' ;
IMPORT  : 'import' ;
RETURN  : 'return' ;
TRUE    : 'True' ;
FALSE   : 'False' ;
NONE    : 'None' ;
IS : 'is';
AND : 'and' ;
OR  : 'or' ;
NOT : 'not' ;

ID      : [a-zA-Z_][a-zA-Z0-9_]* ;
NUMBER  : '-'? [0-9]+ ('.' [0-9]+)? ;
STRING  : '"'  (~["\\] | '\\' .)* '"'
        | '\'' (~['\\] | '\\' .)* '\'' ;

NEWLINE : '\r'? '\n' ;
WS      : [ \t]+ -> skip ;
COMMENT : '#' ~[\r\n]* -> skip ;

BLOCKSTART : '<BLOCKSTART>' ;
BLOCKEND   : '<BLOCKEND>' ;

GT   : '>' ;
LT   : '<' ;
GTE  : '>=' ;
LTE  : '<=' ;
NEQ  : '!=' ;