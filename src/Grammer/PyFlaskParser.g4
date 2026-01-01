parser grammar PyFlaskParser;

options { tokenVocab=PyFlaskLexer; }

// ============ ENTRY ============
program : (statement | NEWLINE)* EOF # ProgramRoot ;
// ============ STATEMENTS ============
statement
    : importstatement                     # StmtImport
    | decorator functionDef               # StmtDecoratedFunction
    | functionDef                         # StmtFunction
    | simpleStmt                          # StmtSimple
    ;

// ============ STATEMENTS ============

simpleStmt
    : assignment                          # SimpleAssign
    | returnStmt                          # SimpleReturn
    | ifstatement                         # SimpleIf
    | forstatement                        # SimpleFor
    | BREAK                               # BreakStmtNode
    | CONTINUE                            # ContinueStmt
    | expr                                # ExprStmtNode
    ;

// ============ IMPORT ============
importstatement
    : FROM ID (DOT ID)* IMPORT importList # FromImportStmt
    | IMPORT importList                   # GlobalImportStmt
    ;

importList
    : ID (COMMA ID)* # ImportListNode
    ;

// ============ DECORATOR ============
decorator
    : ATSIGN expr                         # DecoratorNode
    ;

// ============ FUNCTION ============
functionDef
    : DEF ID LPAREN parameters? RPAREN COLON block # FunctionDefNode
    ;

parameters
    : ID (COMMA ID)*
    ;

// ============ BLOCK ============
// الفيزيتور يتوقع وجود كلاس اسمه BlockNode
block
       : BLOCKSTART (NEWLINE | statement)* BLOCKEND # BlockNode
    ;
// ============ CONTROL ============
ifstatement
     : IF expr COLON block (ELSE COLON block)? # IfStmtNode
    ;

forstatement
    : FOR ID IN expr COLON block          # ForStmtNode
    ;

// ============ RETURN & ASSIGN ============
returnStmt
    : RETURN expr?                        # ReturnStmtNode
    ;

assignment
    : expr ASSIGN expr                    # AssignStmtNode
    ;






// ============ EXPRESSIONS ============
expr
    : LPAREN expr RPAREN               # Parens
    | expr LBRACK expr RBRACK          # Subscript
    | expr DOT ID                      # Attribute
    | expr LPAREN argList? RPAREN # FunctionCall
//    | expr LPAREN ( (expr | ID ASSIGN expr) (COMMA (expr | ID ASSIGN expr))*)? RPAREN # FunctionCall
    | expr STAR expr                   # Multiplication
    | expr SLASH expr                  # Division
    | expr PLUS expr                   # Addition
    | expr MINUS expr                  # Subtraction
    | expr (GT | LT | GTE | LTE | EQ | NEQ) expr     # CompareExpr
    | expr IS expr                                  # IsExpr
    | expr IN expr                                  # InExpr
    // أولوية الـ Inline If (Ternary) تأتي هنا
    | expr IF expr ELSE expr           # TernaryExpr
    | ID                               # AtomIdNode
    | NUMBER                           # AtomNumberNode
    | STRING                           # AtomStringNode
    | TRUE                             # TrueLit
    | FALSE                            # FalseLit
    | NONE                             # NoneLit
    | LBRACK (expr (COMMA expr)*)? RBRACK # ListLiteralNode
    | LBRACE (STRING COLON expr (COMMA STRING COLON expr)*)? RBRACE # DictLiteralNode
    ;




    arg
        : expr
        | ID ASSIGN expr
        ;

    argList
        : arg (COMMA NEWLINE* arg)* COMMA? NEWLINE*
        ;