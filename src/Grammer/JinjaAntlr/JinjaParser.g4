parser grammar JinjaParser;

options { tokenVocab=JinjaLexer; }

// الجذر: المستند يتكون من مجموعة من العقد
document
    : node* EOF                              #documentRoot
    ;

// العقدة قد تكون أي عنصر من العناصر التالية
node
    : htmlElement                            #nodeHtml
    | jinjaExpr                              #nodeJinjaExpr
    | jinjaBlock                             #nodeJinjaBlock   // تم التعديل هنا ليدعم الكتل
    | HTML_TEXT                              #nodeHtmlText
    | HTML_COMMENT                           #nodeHtmlComment
    | HTML_DOCTYPE                           #nodeHtmlDoctype
    ;

// ======================================================
// HTML STRUCTURE (Hierarchical)
// ======================================================
htmlElement
    : TAG_OPEN TAG_NAME htmlAttribute* TAG_CLOSE htmlContent* endTag    #htmlNormalElement
    | TAG_OPEN TAG_NAME htmlAttribute* TAG_SLASH_CLOSE                   #htmlSelfClosingElement
    ;

endTag
    : TAG_OPEN TAG_SLASH TAG_NAME TAG_CLOSE   #htmlEndTag
    ;

htmlAttribute
    : TAG_NAME TAG_EQUALS TAG_STRING          #htmlAttr
    ;

htmlContent
    : node                                   #htmlContentNode
    ;

// ======================================================
// JINJA STRUCTURE (Hierarchical)
// ======================================================

// تعبير جينجا {{ expr }}
jinjaExpr
    : JINJA_EXPR_START expression JINJA_END_EXPR #jinjaExpression
    ;

// الكتل التي تحتوي على بداية ونهاية (Blocks)
jinjaBlock
    : ifBlock
    | forBlock
    | setStmt
    | jinjaSimpleStmt
    ;

// كتلة If الكاملة مع elif و else
ifBlock
    : JINJA_BLOCK_START JINJA_IF expression JINJA_END_BLOCK
        node* elifBlock*
        elseBlock?
      JINJA_BLOCK_START JINJA_ENDIF JINJA_END_BLOCK
     #blockIf ;

elifBlock
    : JINJA_BLOCK_START JINJA_ELIF expression JINJA_END_BLOCK
        node*
   #elifBlockStmt ;

elseBlock
    : JINJA_BLOCK_START JINJA_ELSE JINJA_END_BLOCK
        node*
  #elseBlockStmt ;

// كتلة For الكاملة
forBlock
    : JINJA_BLOCK_START JINJA_FOR JINJA_ID JINJA_IN expression JINJA_END_BLOCK
        node*
      JINJA_BLOCK_START JINJA_ENDFOR JINJA_END_BLOCK
     #blockFor ;

// عبارات بسيطة لا تفتح بلوك (مثل set أو break)
setStmt
    : JINJA_BLOCK_START JINJA_SET JINJA_ID JINJA_ASSIGN expression JINJA_END_BLOCK
     #blockSet ;

jinjaSimpleStmt
    : JINJA_BLOCK_START (JINJA_CONTINUE | JINJA_BREAK) JINJA_END_BLOCK
    #blockSimple  ;

// ======================================================
// EXPRESSIONS (بقيت كما هي لأنها ممتازة)
// ======================================================
expression
    : logicalOrExpr                          #exprRoot
    ;

logicalOrExpr
    : logicalAndExpr (JINJA_OR logicalAndExpr)* #exprOr
    ;

logicalAndExpr
    : logicalNotExpr (JINJA_AND logicalNotExpr)* #exprAnd
    ;

logicalNotExpr
    : JINJA_NOT logicalNotExpr               #exprNot
    | comparisonExpr                         #exprAtom
    ;

comparisonExpr
    : additiveExpr
      (
        ( JINJA_EQ | JINJA_NEQ | JINJA_GT | JINJA_GTE | JINJA_LT | JINJA_LTE | JINJA_IS )
        additiveExpr
      )* #exprCompare
    ;

additiveExpr
    : multiplicativeExpr
      ((JINJA_ADD | JINJA_SUB) multiplicativeExpr)* #exprAdd
    ;

multiplicativeExpr
    : unaryExpr
      ((JINJA_MUL | JINJA_DIV | JINJA_MOD) unaryExpr)* #exprMul
    ;

unaryExpr
    : JINJA_SUB unaryExpr                    #exprUnaryMinus
    | postfixExpr                            #exprUnary
    ;

postfixExpr
    : primary postfixPart* #exprPostfix
    ;

postfixPart
    : JINJA_DOT JINJA_ID                     #postfixProperty
    | JINJA_PIPE JINJA_ID                    #postfixFilter
    | JINJA_LBRACK sliceExpr JINJA_RBRACK    #postfixIndex
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