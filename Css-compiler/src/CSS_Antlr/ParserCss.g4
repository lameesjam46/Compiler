parser grammar ParserCss;

options {
tokenVocab=LexerCss;
}

style
    : statement* EOF
    ;
statement
         : importStatement
         | rule
         | mediaRule
         ;

importStatement : IMPORT STRING SEMICOLON ;

rule
    : selectorGroup LKB property* RKB
    ;

selectorGroup
    : selector (COMMA selector)*
    ;

selector
    : simpleSelector
    ;

simpleSelector
    : elementName? (CSS_ID | CSS_CLASS | CSS_PSEUDO)*
    ;

elementName
    : CSS_ELEMENT
    | STAR
    ;


property
     :size1_rule
     |size2_rule
     |textalign_rule
     |color_rule
     |font_size_rule
     |font_family
     | display_rule
     | opacity_rule
     | border_rule
     |position_rule
     |font_weight_rule
     |background_rule
     ;
box_atom
    : VALUE_GENERAL
    | AUTO_KW
    | NONE_KW
    ;

box_value
    : box_atom
    | box_atom box_atom
    | box_atom box_atom box_atom
    | box_atom box_atom box_atom box_atom
    ;

size1_rule
  :SIZE_1 COLON (VALUE_GENERAL|AUTO_KW) SEMICOLON
  ;
size2_rule
    : SIZE_2 COLON box_value SEMICOLON
    ;

textalign_rule
              : TEXT_ALIGN COLON VALUE_TEXT_ALIGN SEMICOLON
              ;
color_rule
      : COLOR COLON COLOR_VALUE SEMICOLON
      ;

font_size_rule
    : FONT_SIZE COLON (VALUE_GENERAL | VALUE_FONT_SIZE) SEMICOLON
    ;

font_family
     :FONT_FAMILY COLON CSS_ELEMENT SEMICOLON
     ;
display_rule
        :DISPLAY COLON display_value SEMICOLON
        ;
  display_value
  :VALUE_DISPLAY
  |NONE_KW
  ;
border_rule
    : BORDER COLON NONE_KW SEMICOLON
    | BORDER COLON VALUE_GENERAL BORDER_STYLE COLOR_VALUE? SEMICOLON
    ;


mediaRule
         : MEDIA LKB rule* RKB
         ;
opacity_rule
        : OPACITY COLON VALUE_GENERAL SEMICOLON
        ;
position_rule
    : POSITION COLON VALUE_POSITION SEMICOLON
    ;
font_weight_rule
    : FONT_WEIGHT COLON VALUE_FONT_WEIGHT SEMICOLON
    ;
background_rule
   : BACKGROUND_COLOR COLON COLOR_VALUE SEMICOLON
   ;

