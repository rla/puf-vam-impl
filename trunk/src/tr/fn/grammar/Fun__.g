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

// $ANTLR src "src/tr/fn/grammar/Fun.g" 76
DEFINE     : '='      ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 77
LAMBDA     : 'fn'     ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 78
RIGHTARROW : '->'     ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 79
LET        : 'let'    ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 80
LETREC     : 'letrec' ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 81
IN         : 'in'     ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 82
HASH       : '#'      ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 83
ENDEXPR    : ';'      ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 84
LEFTPAREN  : '('      ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 85
RIGHTPAREN : ')'      ;

// $ANTLR src "src/tr/fn/grammar/Fun.g" 87
LESS         : '<'  ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 88
GREATER      : '>'  ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 89
EQUAL        : '==' ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 90
NOTEQUAL     : '!=' ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 91
LESSEQUAL    : '<=' ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 92
GREATEREQUAL : '>=' ;

// $ANTLR src "src/tr/fn/grammar/Fun.g" 94
IF         : 'if'   ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 95
THEN       : 'then' ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 96
ELSE       : 'else' ;

// $ANTLR src "src/tr/fn/grammar/Fun.g" 98
NOT        : 'not' ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 99
AND        : '&&'  ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 100
OR         : '||'  ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 101
PLUS       : '+'   ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 102
MINUS      : '-'   ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 103
STAR       : '*'   ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 104
SLASH      : '/'   ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 105
PERCENT    : '%'   ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 106
ID         : (('a' .. 'z') | ('A' .. 'Z')) (('a' .. 'z') | ('A' .. 'Z') | ('0' .. '9'))* ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 107
INT        : '0' .. '9'+ ;
// $ANTLR src "src/tr/fn/grammar/Fun.g" 108
WS         : (' ' | '\t')+ { skip(); };
// $ANTLR src "src/tr/fn/grammar/Fun.g" 109
NL         : ('\r'? '\n')+ { skip(); };

// $ANTLR src "src/tr/fn/grammar/Fun.g" 111
ML_COMMENT : '/*' (options {greedy=false;} : . )* '*/' { skip(); };
// $ANTLR src "src/tr/fn/grammar/Fun.g" 112
SL_COMMENT : '//' ~('\n'|'\r')* ('\r\n' | '\r' | '\n') { skip(); }
           | '//' ~('\n'|'\r')* { skip(); };
