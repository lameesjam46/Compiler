parser grammar JinjaParser;

options { tokenVocab=JinjaLexer; }

// =====================
// START
// =====================
template
    : element* EOF
    ;

// =====================
// ELEMENTS
// =====================
element
    : TEXT                 # TextNode
    | variable             # JinjaExprNode
    | ifStatement          # JinjaIfNode
    | forStatement         # JinjaForNode
    ;

// =====================
// {{ variable }}
// =====================
variable
    : VAR_START ID VAR_END
    ;

// =====================
// {% if %}
// =====================
ifStatement
    : BLOCK_START IF ID BLOCK_END
      element*
      BLOCK_START ENDIF BLOCK_END
    ;

// =====================
// {% for %}
// =====================
forStatement
    : BLOCK_START FOR ID IN ID BLOCK_END
      element*
      BLOCK_START ENDFOR BLOCK_END
    ;
