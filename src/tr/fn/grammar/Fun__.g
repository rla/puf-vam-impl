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

// $ANTLR src "src/tr/fn/grammar/Fun.g" 75
DEFINE     : '='      ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 76
LAMBDA     : 'fn'     ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 77
RIGHTARROW : '->'     ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 78
LET        : 'let'    ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 79
LETREC     : 'letrec' ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 80
IN         : 'in'     ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 81
HASH       : '#'      ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 82
ENDEXPR    : ';'      ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 83
LEFTPAREN  : '('      ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 84
RIGHTPAREN : ')'      ;

// $ANTLR src "src/tr/fn/grammar/Fun.g" 86
LESS         : '<'  ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 87
GREATER      : '>'  ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 88
EQUAL        : '==' ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 89
NOTEQUAL     : '!=' ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 90
LESSEQUAL    : '<=' ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 91
GREATEREQUAL : '>=' ;

// $ANTLR src "src/tr/fn/grammar/Fun.g" 93
IF         : 'if'   ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 94
THEN       : 'then' ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 95
ELSE       : 'else' ;

// $ANTLR src "src/tr/fn/grammar/Fun.g" 97
NOT        : 'not' ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 98
AND        : '&&'  ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 99
OR         : '||'  ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 100
PLUS       : '+'   ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 101
MINUS      : '-'   ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 102
STAR       : '*'   ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 103
SLASH      : '/'   ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 104
PERCENT    : '%'   ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 105
ID         : (('a' .. 'z') | ('A' .. 'Z'))+ ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 106
INT        : '0' .. '9'+ ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 107
WS         : (' ' | '\t')+ { skip(); };
// $ANTLR src "src/tr/fn/grammar/Fun.g" 108
NL         : ('\r'? '\n')+ { skip(); };

// $ANTLR src "src/tr/fn/grammar/Fun.g" 110
ML_COMMENT : '/*' (options {greedy=false;} : . )* '*/' { skip(); };
// $ANTLR src "src/tr/fn/grammar/Fun.g" 111
SL_COMMENT : '//' ~('\n'|'\r')* ('\r\n' | '\r' | '\n') { skip(); }
           | '//' ~('\n'|'\r')* { skip(); };
