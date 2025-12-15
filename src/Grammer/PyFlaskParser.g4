parser grammar PyFlaskParser;

options { tokenVocab=PyFlaskLexer; }

/* =======================
   Program structure
   ======================= */

program
    : (statement (NEWLINE)*)* EOF
    ;

statement
    : importStmt
    | routeStmt
    | functionDef
    | assignment
    | simpleStmt
    ;

/* =======================
   Imports
   ======================= */

importStmt
    : IMPORT importList
    | FROM ID IMPORT importList
    ;

importList
    : ID (COMMA ID)*
    ;

/* =======================
   Routes
   ======================= */

routeStmt
    : ID DOT ROUTE LPAREN STRING RPAREN
    ;

/* =======================
   Functions
   ======================= */

functionDef
    : DEF ID LPAREN RPAREN COLON block
    ;

block
    : (simpleStmt (NEWLINE)*)*
    ;

/* =======================
   Statements
   ======================= */

simpleStmt
    : RETURN exprStart
    | exprStart
    ;

assignment
    : ID EQUAL exprStart
    ;

/* =======================
   Expressions (NEWLINE-safe)
   ======================= */

exprStart
    : (NEWLINE)* expr
    ;

expr
    : ID LPAREN arglist? RPAREN      # CallExpr
    | listLiteral                    # ListExpr
    | dictLiteral                    # DictExpr
    | ID                             # IdExpr
    | STRING                         # StringExpr
    | NUMBER                         # NumberExpr
    ;

/* =======================
   Function arguments
   ======================= */

arglist
    : arg ((COMMA | NEWLINE)+ arg)* (COMMA | NEWLINE)*
    ;

arg
    : ID EQUAL exprStart             # KeywordArg
    | exprStart                      # PositionalArg
    ;

/* =======================
   List literal
   ======================= */

listLiteral
    : LBRACK elementList? RBRACK
    ;

elementList
    : element ((COMMA | NEWLINE)+ element)* (COMMA | NEWLINE)*
    ;

element
    : exprStart
    ;

/* =======================
   Dict literal
   ======================= */

dictLiteral
    : LBRACE pairList? RBRACE
    ;

pairList
    : pair ((COMMA | NEWLINE)+ pair)* (COMMA | NEWLINE)*
    ;

pair
    : (STRING | ID) COLON exprStart
    ;
