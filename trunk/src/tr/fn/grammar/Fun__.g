lexer grammar Fun;

@header {
package tr.fn.grammar;
}

// $ANTLR src "src/tr/fn/grammar/Fun.g" 68
DEFINE     : '='      ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 69
LAMBDA     : 'fn'     ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 70
RIGHTARROW : '->'     ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 71
LET        : 'let'    ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 72
LETREC     : 'letrec' ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 73
IN         : 'in'     ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 74
HASH       : '#'      ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 75
ENDEXPR    : ';'      ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 76
LEFTPAREN  : '('      ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 77
RIGHTPAREN : ')'      ;

// $ANTLR src "src/tr/fn/grammar/Fun.g" 79
LESS         : '<'  ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 80
GREATER      : '>'  ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 81
EQUAL        : '==' ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 82
NOTEQUAL     : '!=' ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 83
LESSEQUAL    : '<=' ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 84
GREATEREQUAL : '>=' ;

// $ANTLR src "src/tr/fn/grammar/Fun.g" 86
IF         : 'if'   ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 87
THEN       : 'then' ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 88
ELSE       : 'else' ;

// $ANTLR src "src/tr/fn/grammar/Fun.g" 90
NOT        : 'not' ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 91
AND        : '&&'  ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 92
OR         : '||'  ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 93
PLUS       : '+'   ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 94
MINUS      : '-'   ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 95
STAR       : '*'   ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 96
SLASH      : '/'   ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 97
PERCENT    : '%'   ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 98
ID         : 'a' .. 'z'+ ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 99
INT        : '0' .. '9'+ ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 100
WS         : (' ' | '\n' | '\r' | '\t')+ { skip(); };
