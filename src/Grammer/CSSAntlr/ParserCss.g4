parser grammar ParserCss;

options {
    tokenVocab = LexerCss;
}

/* ================= ROOT ================= */

style
    : statement* EOF
    ;

statement
    : importStatement
    | rule
    | mediaRule
    ;

/* ================= IMPORT ================= */

importStatement
    : IMPORT STRING SEMICOLON
    ;

/* ================= RULE ================= */

rule
    : selectorGroup LKB property* RKB
    ;

selectorGroup
    : selector (COMMA selector)*
    ;

selector
    : simpleSelector+
    ;

simpleSelector
    : elementName modifier*
    | modifier+
    ;

modifier
    : CSS_ID
    | CSS_CLASS
    | CSS_PSEUDO
    ;

elementName
    : CSS_ELEMENT
    | STAR
    ;

/* ================= PROPERTIES ================= */

property
    : size1_rule                  #size1Property
    | size2_rule                  #size2Property
    | textalign_rule              #textAlignProperty
    | color_rule                  #colorProperty
    | font_size_rule              #fontSizeProperty
    | font_family                 #fontFamilyProperty
    | display_rule                #displayProperty
    | opacity_rule                #opacityProperty
    | border_rule                 #borderProperty
    | border_side_rule            #borderSideProperty
    | border_collapse_rule        #borderCollapseProperty
    | position_rule               #positionProperty
    | font_weight_rule            #fontWeightProperty
    | background_rule             #backgroundProperty
    | background_shorthand_rule   #backgroundShorthandProperty
    | box_sizing_rule             #boxSizingProperty
    | line_height_rule            #lineHeightProperty
    | max_width_rule              #maxWidthProperty
    | min_width_rule              #minWidthProperty
    | border_radius_rule          #borderRadiusProperty
    | box_shadow_rule             #boxShadowProperty
    | cursor_rule                 #cursorProperty
    | overflow_rule               #overflowProperty
    | gap_rule                    #gapProperty
    | text_decoration_rule        #textDecorationProperty
    | justify_content_rule        #justifyContentProperty
    | align_items_rule            #alignItemsProperty
    | flex_wrap_rule              #flexWrapProperty
    | flex_direction_rule         #flexDirectionProperty
    | margin_side_rule            #marginSideProperty
    | padding_side_rule           #paddingSideProperty
    ;

/* ================= VALUES ================= */

box_atom
    : VALUE_GENERAL
    | FLOAT
    | AUTO_KW
    | NONE_KW
    ;

box_value
    : box_atom
    | box_atom box_atom
    | box_atom box_atom box_atom
    | box_atom box_atom box_atom box_atom
    ;

/* ================= PROPERTY RULES ================= */

size1_rule
    : SIZE_1 COLON (VALUE_GENERAL | FLOAT | AUTO_KW | NONE_KW) SEMICOLON
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
    : FONT_SIZE COLON (VALUE_GENERAL | FLOAT | VALUE_FONT_SIZE) SEMICOLON
    ;

font_family
    : FONT_FAMILY COLON fontFamilyItem (COMMA fontFamilyItem)* SEMICOLON
    ;

fontFamilyItem
    : CSS_ELEMENT
    | STRING
    ;

display_rule
    : DISPLAY COLON display_value SEMICOLON
    ;

display_value
    : VALUE_DISPLAY
    | NONE_KW
    ;

border_rule
    : BORDER COLON NONE_KW SEMICOLON
    | BORDER COLON (VALUE_GENERAL | FLOAT | BORDER_STYLE | COLOR_VALUE)+ SEMICOLON
    ;

border_collapse_rule
    : BORDER_COLLAPSE COLON BORDER_COLLAPSE_VALUE SEMICOLON
    ;

border_side_rule
    : (BORDER_TOP | BORDER_RIGHT | BORDER_BOTTOM | BORDER_LEFT) COLON NONE_KW SEMICOLON
    | (BORDER_TOP | BORDER_RIGHT | BORDER_BOTTOM | BORDER_LEFT) COLON (VALUE_GENERAL | FLOAT | BORDER_STYLE | COLOR_VALUE)+ SEMICOLON
    ;

opacity_rule
    : OPACITY COLON (VALUE_GENERAL | FLOAT) SEMICOLON
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

background_shorthand_rule
    : BAK_GROUND COLON COLOR_VALUE SEMICOLON
    ;

box_sizing_rule
    : BOX_SIZING COLON BOX_SIZING_VALUE SEMICOLON
    ;

line_height_rule
    : LINE_HEIGHT COLON (VALUE_GENERAL | FLOAT) SEMICOLON
    ;

max_width_rule
    : MAX_WIDTH COLON (VALUE_GENERAL | FLOAT | NONE_KW | AUTO_KW) SEMICOLON
    ;

min_width_rule
    : MIN_WIDTH COLON (VALUE_GENERAL | FLOAT | NONE_KW | AUTO_KW) SEMICOLON
    ;

border_radius_rule
    : BORDER_RADIUS COLON box_value SEMICOLON
    ;

box_shadow_rule
    : BOX_SHADOW COLON (VALUE_GENERAL | FLOAT)+ COLOR_VALUE SEMICOLON
    ;

cursor_rule
    : CURSOR COLON CURSOR_VALUE SEMICOLON
    ;

overflow_rule
    : OVERFLOW COLON (BORDER_STYLE | OVERFLOW_EXTRA_VALUE | AUTO_KW | NONE_KW) SEMICOLON
    ;

gap_rule
    : GAP COLON (VALUE_GENERAL | FLOAT) SEMICOLON
    ;

text_decoration_rule
    : TEXT_DECORATION COLON (NONE_KW | TEXT_DECORATION_VALUE) SEMICOLON
    ;

justify_content_rule
    : JUSTIFY_CONTENT COLON (FLEX_ALIGN_VALUE | VALUE_TEXT_ALIGN) SEMICOLON
    ;

align_items_rule
    : ALIGN_ITEMS COLON (FLEX_ALIGN_VALUE | VALUE_TEXT_ALIGN) SEMICOLON
    ;

flex_wrap_rule
    : FLEX_WRAP COLON FLEX_WRAP_VALUE SEMICOLON
    ;

flex_direction_rule
    : FLEX_DIRECTION COLON FLEX_DIRECTION_VALUE SEMICOLON
    ;

margin_side_rule
    : (MARGIN_TOP | MARGIN_RIGHT | MARGIN_BOTTOM | MARGIN_LEFT) COLON (VALUE_GENERAL | FLOAT | AUTO_KW) SEMICOLON
    ;

padding_side_rule
    : (PADDING_TOP | PADDING_RIGHT | PADDING_BOTTOM | PADDING_LEFT) COLON (VALUE_GENERAL | FLOAT | AUTO_KW) SEMICOLON
    ;

/* ================= MEDIA ================= */

mediaRule
    : MEDIA LKB rule* RKB
    ;