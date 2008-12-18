lexer grammar Fun;

@members {
@Override
public void reportError(RecognitionException e) {
    throw new RuntimeException(e);
}
}
@header {
package tr.fn.grammar;
}

// $ANTLR src "src/tr/fn/grammar/Fun.g" 95
OPEN_SQUARE  : '['      ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 96
CLOSE_SQUARE : ']'      ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 97
EMPTY_TUPLE  : '()'     ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 98
COMMA        : ','      ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 99
EMPTY_LIST   : '[]'     ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 100
CONS         : ':'      ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 101
DEFINE       : '='      ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 102
LAMBDA       : 'fn'     ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 103
RIGHTARROW   : '->'     ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 104
LET          : 'let'    ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 105
LETREC       : 'letrec' ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 106
IN           : 'in'     ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 107
HASH         : '#'      ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 108
ENDEXPR      : ';'      ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 109
LEFTPAREN    : '('      ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 110
RIGHTPAREN   : ')'      ;

// $ANTLR src "src/tr/fn/grammar/Fun.g" 112
LESS         : '<'  ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 113
GREATER      : '>'  ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 114
EQUAL        : '==' ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 115
NOTEQUAL     : '!=' ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 116
LESSEQUAL    : '<=' ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 117
GREATEREQUAL : '>=' ;

// $ANTLR src "src/tr/fn/grammar/Fun.g" 119
IF         : 'if'   ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 120
THEN       : 'then' ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 121
ELSE       : 'else' ;

// $ANTLR src "src/tr/fn/grammar/Fun.g" 123
NOT        : 'not' ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 124
AND        : '&&'  ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 125
OR         : '||'  ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 126
PLUS       : '+'   ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 127
MINUS      : '-'   ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 128
STAR       : '*'   ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 129
SLASH      : '/'   ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 130
PERCENT    : '%'   ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 131
ID         : (('a' .. 'z') | ('A' .. 'Z')) (('a' .. 'z') | ('A' .. 'Z') | ('0' .. '9'))* ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 132
INT        : '0' .. '9'+ ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 133
WS         : (' ' | '\t')+ { skip(); };
// $ANTLR src "src/tr/fn/grammar/Fun.g" 134
NL         : ('\r'? '\n')+ { skip(); };

// $ANTLR src "src/tr/fn/grammar/Fun.g" 136
ML_COMMENT : '/*' (options {greedy=false;} : . )* '*/' { skip(); };
// $ANTLR src "src/tr/fn/grammar/Fun.g" 137
SL_COMMENT : '//' ~('\n'|'\r')* ('\r\n' | '\r' | '\n') { skip(); }
           | '//' ~('\n'|'\r')* { skip(); };
