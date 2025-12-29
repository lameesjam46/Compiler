lexer grammar LexerCss;
//1
LKB: '{';
RKB: '}';
LSB:'[';
RSB:']';
LP:'(';
RP:')';
COMMA:',';
COLON:':';
DOT:'.';
HASH: '#';
SEMICOLON:';';

//2
IMPORT: 'import';
MEDIA: '@media';

//PROPERTIES
COLOR: 'color';
FONT_FAMILY: 'font-family';
FONT_SIZE: 'font-size';
TEXT_ALIGN: 'text-align';
BAK_GROUND:'background';
OPACITY     : 'opacity';
BORDER      : 'border';
DISPLAY : 'display';
POSITION : 'position';
FONT_WEIGHT : 'font-weight';
BACKGROUND_COLOR : 'background-color';


//VALUE

VALUE_FONT_WEIGHT
    : 'normal'
    | 'bold'
    | 'lighter'
    | 'bolder'
    | '100'
    | '200'
    | '300'
    | '400'
    | '500'
    | '600'
    | '700'
    | '800'
    | '900'
    ;

VALUE_FONT_SIZE
       :'small'
       |'medium'
       |'large'
       |'x-large'
       |'x-small'
       ;


VALUE_DISPLAY
    : 'block'
    | 'inline'
    | 'inline-block'
    | 'flex'
    | 'grid'
    ;




VALUE_POSITION
    : 'static'
    | 'relative'
    | 'absolute'
    | 'fixed'
    ;
BORDER_STYLE
    : 'solid'
    | 'dashed'
    | 'dotted'
    | 'double'
    | 'groove'
    | 'ridge'
    | 'inset'
    | 'outset'
    | 'hidden'
    ;




VALUE_TEXT_ALIGN
       :'left'
       |'right'
       |'center'
       |'justify'
       ;
SIZE_1
  : 'width'
  |'height'
  ;
SIZE_2
  :'padding'
  |'margin'
  ;

fragment HEX : [0-9a-fA-F];

 COLOR_VALUE
    : 'rgb(' WS? [0-9]+ WS? ',' WS? [0-9]+ WS? ',' WS? [0-9]+ WS? ')'
       | '#' HEX HEX HEX
       | '#' HEX HEX HEX HEX HEX HEX
       | 'black'
       | 'white'
       | 'red'
       | 'green'
       | 'blue'
       | 'transparent'
       ;


NONE_KW : 'none' ;
AUTO_KW : 'auto' ;


VALUE_GENERAL
    : [0-9]+ ('.' [0-9]+)? ('px' | 'em' | 'rem' | '%' | 'vw' | 'vh')?
    | AUTO_KW
    | NONE_KW
    ;





/*VALUE*/


CSS_ID       : '#' [a-zA-Z_\-][a-zA-Z0-9_\-]* ;
CSS_CLASS    : '.' [a-zA-Z_\-][a-zA-Z0-9_\-]* ;
CSS_PSEUDO   : ':' [a-zA-Z\-]+ ;
STAR : '*';
CSS_ELEMENT  : [a-zA-Z_][a-zA-Z0-9_\-]* ;



FLOAT : [0-9]+ '.' [0-9]+;

STRING
    : '"' (~["\r\n])* '"'
    | '\'' (~['\r\n])* '\''
    ;

CSS_COMMENT : '/*' .*? '*/' -> skip ;

WS : [ \t\r\n]+ -> skip;



