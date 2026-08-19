lexer grammar LexerCss;

// ============================================================
// 1. DELIMITERS & SYMBOLS
// ============================================================
LKB       : '{';
RKB       : '}';
LSB       : '[';
RSB       : ']';
LP        : '(';
RP        : ')';
COMMA     : ',';
COLON     : ':';
DOT       : '.';
SEMICOLON : ';';

// ============================================================
// 2. AT-RULES
// ============================================================
IMPORT    : '@import';
MEDIA     : '@media';

// ============================================================
// 3. SELECTORS
// ============================================================
STAR      : '*' ;

// ============================================================
// 4. PROPERTIES
// ============================================================
BACKGROUND_COLOR : 'background-color';
BAK_GROUND       : 'background';
BORDER_COLLAPSE  : 'border-collapse';
BORDER_TOP       : 'border-top';
BORDER_RIGHT     : 'border-right';
BORDER_BOTTOM    : 'border-bottom';
BORDER_LEFT      : 'border-left';
BORDER_RADIUS    : 'border-radius';
BORDER           : 'border';

COLOR            : 'color';
FONT_FAMILY      : 'font-family';
FONT_SIZE        : 'font-size';
FONT_WEIGHT      : 'font-weight';
TEXT_ALIGN       : 'text-align';
TEXT_DECORATION  : 'text-decoration';
OPACITY          : 'opacity';
DISPLAY          : 'display';
POSITION         : 'position';

BOX_SIZING       : 'box-sizing';
BOX_SHADOW       : 'box-shadow';
LINE_HEIGHT      : 'line-height';
MAX_WIDTH        : 'max-width';
MIN_WIDTH        : 'min-width';
CURSOR           : 'cursor';
OVERFLOW         : 'overflow';
GAP              : 'gap';
JUSTIFY_CONTENT  : 'justify-content';
ALIGN_ITEMS      : 'align-items';
FLEX_WRAP        : 'flex-wrap';
FLEX_DIRECTION   : 'flex-direction';

MARGIN_TOP       : 'margin-top';
MARGIN_RIGHT     : 'margin-right';
MARGIN_BOTTOM    : 'margin-bottom';
MARGIN_LEFT      : 'margin-left';
PADDING_TOP      : 'padding-top';
PADDING_RIGHT    : 'padding-right';
PADDING_BOTTOM   : 'padding-bottom';
PADDING_LEFT     : 'padding-left';

SIZE_1           : 'width' | 'height' ;
SIZE_2           : 'padding' | 'margin' ;

// ============================================================
// 5. ENUMERATED PROPERTY VALUES
// ============================================================
BORDER_COLLAPSE_VALUE : 'collapse' | 'separate' ;
BOX_SIZING_VALUE      : 'border-box' | 'content-box' ;

VALUE_FONT_WEIGHT
    : 'normal' | 'bold' | 'lighter' | 'bolder'
    | '100' | '200' | '300' | '400' | '500' | '600' | '700' | '800' | '900'
    ;

VALUE_FONT_SIZE       : 'small' | 'medium' | 'large' | 'x-large' | 'x-small' ;
VALUE_DISPLAY         : 'block' | 'inline' | 'inline-block' | 'flex' | 'grid' ;
VALUE_POSITION        : 'static' | 'relative' | 'absolute' | 'fixed' ;
BORDER_STYLE          : 'solid' | 'dashed' | 'dotted' | 'double' | 'groove' | 'ridge' | 'inset' | 'outset' | 'hidden' ;
VALUE_TEXT_ALIGN      : 'left' | 'right' | 'center' | 'justify' ;

FLEX_ALIGN_VALUE      : 'flex-start' | 'flex-end' | 'space-between' | 'space-around' | 'space-evenly' | 'stretch' | 'baseline' ;
FLEX_WRAP_VALUE       : 'nowrap' | 'wrap-reverse' | 'wrap' ;
FLEX_DIRECTION_VALUE  : 'row-reverse' | 'column-reverse' | 'row' | 'column' ;
TEXT_DECORATION_VALUE : 'underline' | 'line-through' | 'overline' ;
CURSOR_VALUE          : 'not-allowed' | 'pointer' | 'default' | 'move' | 'text' | 'help' | 'wait' ;
OVERFLOW_EXTRA_VALUE  : 'visible' | 'scroll' ;

NONE_KW               : 'none' ;
AUTO_KW               : 'auto' ;

// ============================================================
// 6. COLOR VALUES
// ============================================================
fragment HEX_DIGIT    : [0-9a-fA-F] ;
fragment WS_FRAG      : [ \t]* ;
fragment PERCENT_FRAG : [0-9]+ '%'? ;

COLOR_VALUE
    : '#' HEX_DIGIT HEX_DIGIT HEX_DIGIT (HEX_DIGIT HEX_DIGIT HEX_DIGIT)? (HEX_DIGIT HEX_DIGIT)?
    | 'rgb(' WS_FRAG [0-9]+ WS_FRAG ',' WS_FRAG [0-9]+ WS_FRAG ',' WS_FRAG [0-9]+ WS_FRAG ')'
    | 'rgba(' WS_FRAG [0-9]+ WS_FRAG ',' WS_FRAG [0-9]+ WS_FRAG ',' WS_FRAG [0-9]+ WS_FRAG ',' WS_FRAG [0-9]+ ('.' [0-9]+)? WS_FRAG ')'
    | 'hsl(' WS_FRAG [0-9]+ WS_FRAG ',' WS_FRAG PERCENT_FRAG WS_FRAG ',' WS_FRAG PERCENT_FRAG WS_FRAG ')'
    | 'hsla(' WS_FRAG [0-9]+ WS_FRAG ',' WS_FRAG PERCENT_FRAG WS_FRAG ',' WS_FRAG PERCENT_FRAG WS_FRAG ',' WS_FRAG [0-9]+ ('.' [0-9]+)? WS_FRAG ')'
    | 'black' | 'white' | 'red' | 'green' | 'blue' | 'yellow'
    | 'purple' | 'orange' | 'pink' | 'brown' | 'gray' | 'transparent'
    ;

// ============================================================
// 7. NUMERIC & STRINGS & IDENTIFIERS
// ============================================================
FLOAT         : '-'? [0-9]+ '.' [0-9]+ ;
VALUE_GENERAL : '-'? [0-9]+ ('.' [0-9]+)? ('px' | 'em' | 'rem' | '%' | 'vw' | 'vh' | 's' | 'ms')? ;

STRING        : '"' (~["\r\n])* '"' | '\'' (~['\r\n])* '\'' ;

CSS_ID        : '#' [a-zA-Z_\-][a-zA-Z0-9_\-]* ;
CSS_CLASS     : '.' [a-zA-Z_\-][a-zA-Z0-9_\-]* ;
CSS_PSEUDO    : ':' [a-zA-Z\-]+ ;

CSS_ELEMENT   : [a-zA-Z_][a-zA-Z0-9_\-]* ;

// ============================================================
// 8. SKIPPED TOKENS
// ============================================================
CSS_COMMENT   : '/*' .*? '*/' -> skip ;
WS            : [ \t\r\n]+ -> skip ;