parser grammar JinjaParser;

options { tokenVocab=JinjaLexer; }


// ======================================================
// ENTRY
// ======================================================
document
    : node* EOF                              #documentRoot
    ;

// ======================================================
// GENERIC NODE
// ======================================================
node
    : htmlElement                            #nodeHtml
    | jinjaExpr                              #nodeJinjaExpr
    | jinjaStmt                              #nodeJinjaStmt
    | HTML_TEXT                              #nodeHtmlText
    | HTML_COMMENT                           #nodeHtmlComment
    | HTML_DOCTYPE                            #nodeHtmlDoctype   // دعم DOCTYPE
    ;

// ======================================================
// HTML
// ======================================================
htmlElement
    : TAG_OPEN TAG_NAME htmlAttribute* TAG_CLOSE htmlContent+ endTag    #htmlNormalElement
    | TAG_OPEN TAG_NAME htmlAttribute* TAG_SLASH_CLOSE                   #htmlSelfClosingElement
    ;

endTag
    : TAG_OPEN TAG_SLASH TAG_NAME TAG_CLOSE   #htmlEndTag
    ;

htmlAttribute
    : TAG_NAME TAG_EQUALS TAG_STRING          #htmlAttr
    ;

htmlContent
    : node+                                  #htmlContentBlock
    ;

// ======================================================
// JINJA
// ======================================================
jinjaExpr
    : JINJA_EXPR_START expression JINJA_END_EXPR
                                              #jinjaExpression
    ;

jinjaStmt
    : JINJA_BLOCK_START stmt JINJA_END_BLOCK  #jinjaStatement
    ;

// ---------------- statements ----------------
stmt
    : ifStmt                                 #stmtIf
    | elifStmt                               #stmtElif
    | elseStmt                               #stmtElse
    | forStmt                                #stmtFor
    | setStmt                                #stmtSet
    | JINJA_ENDIF                            #stmtEndIf
    | JINJA_ENDFOR                           #stmtEndFor
    | JINJA_CONTINUE                         #stmtContinue
    | JINJA_BREAK                            #stmtBreak
    ;

ifStmt
    : JINJA_IF expression                    #ifStatement
    ;

elifStmt
    : JINJA_ELIF expression                  #elifStatement
    ;

elseStmt
    : JINJA_ELSE                             #elseStatement
    ;

forStmt
    : JINJA_FOR JINJA_ID JINJA_IN expression #forStatement
    ;

setStmt
    : JINJA_SET JINJA_ID JINJA_ASSIGN expression
                                              #setStatement
    ;

// ======================================================
// EXPRESSIONS
// ======================================================
expression
    : logicalOrExpr                          #exprRoot
    ;

logicalOrExpr
    : logicalAndExpr (JINJA_OR logicalAndExpr)*
                                              #exprOr
    ;

logicalAndExpr
    : logicalNotExpr (JINJA_AND logicalNotExpr)*
                                              #exprAnd
    ;

logicalNotExpr
    : JINJA_NOT logicalNotExpr               #exprNot
    | comparisonExpr                         #exprAtom
    ;

comparisonExpr
    : additiveExpr
      (
        ( JINJA_EQ
        | JINJA_NEQ
        | JINJA_GT
        | JINJA_GTE
        | JINJA_LT
        | JINJA_LTE
        | JINJA_IS
        )
        additiveExpr
      )*                                     #exprCompare
    ;

additiveExpr
    : multiplicativeExpr
      ((JINJA_ADD | JINJA_SUB) multiplicativeExpr)*
                                              #exprAdd
    ;

multiplicativeExpr
    : unaryExpr
      ((JINJA_MUL | JINJA_DIV | JINJA_MOD) unaryExpr)*
                                              #exprMul
    ;

unaryExpr
    : JINJA_SUB unaryExpr                    #exprUnaryMinus
    | postfixExpr                            #exprUnary
    ;

postfixExpr
    : primary postfixPart*                   #exprPostfix
    ;

postfixPart
    : JINJA_DOT JINJA_ID                     #postfixProperty
    | JINJA_PIPE JINJA_ID                    #postfixFilter
    | JINJA_LBRACK sliceExpr JINJA_RBRACK   #postfixIndex
    ;

sliceExpr
    : expression? JINJA_COLON expression?    #sliceRange
    | expression                             #sliceIndex
    ;

primary
    : JINJA_ID                               #literalId
    | JINJA_DOUBLE                           #literalDouble
    | JINJA_INT                              #literalInt
    | JINJA_STRING                           #literalString
    | JINJA_TRUE                             #literalTrue
    | JINJA_FALSE                            #literalFalse
    | JINJA_NONE                             #literalNone
    | JINJA_LPAREN expression JINJA_RPAREN   #literalParen
    ;

