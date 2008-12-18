lexer grammar Puf;

@members {
@Override
public void reportError(RecognitionException e) {
    throw new RuntimeException(e);
}
}
@header {
package tr.fn.grammar;
}

T__38 : '=' ;
T__39 : ';' ;
T__40 : '(' ;
T__41 : ',' ;
T__42 : ')' ;
T__43 : 'let' ;
T__44 : 'in' ;
T__45 : 'if' ;
T__46 : 'then' ;
T__47 : 'else' ;
T__48 : '[' ;
T__49 : ']' ;
T__50 : 'fn' ;
T__51 : '->' ;
T__52 : 'letrec' ;
T__53 : 'case' ;
T__54 : 'of' ;
T__55 : '[]' ;

// $ANTLR src "src/tr/fn/grammar/Puf.g" 218
LESS         : '<'      ;
// $ANTLR src "src/tr/fn/grammar/Puf.g" 219
GREATER      : '>'      ;
// $ANTLR src "src/tr/fn/grammar/Puf.g" 220
EQUAL        : '=='     ;
// $ANTLR src "src/tr/fn/grammar/Puf.g" 221
NOTEQUAL     : '!='     ;
// $ANTLR src "src/tr/fn/grammar/Puf.g" 222
LESSEQUAL    : '<='     ;
// $ANTLR src "src/tr/fn/grammar/Puf.g" 223
GREATEREQUAL : '>='     ;

// $ANTLR src "src/tr/fn/grammar/Puf.g" 225
AND          : '&&'     ;
// $ANTLR src "src/tr/fn/grammar/Puf.g" 226
OR           : '||'     ;
// $ANTLR src "src/tr/fn/grammar/Puf.g" 227
PLUS         : '+'      ;
// $ANTLR src "src/tr/fn/grammar/Puf.g" 228
MINUS        : '-'      ;
// $ANTLR src "src/tr/fn/grammar/Puf.g" 229
STAR         : '*'      ;
// $ANTLR src "src/tr/fn/grammar/Puf.g" 230
SLASH        : '/'      ;
// $ANTLR src "src/tr/fn/grammar/Puf.g" 231
PERCENT      : '%'      ;
// $ANTLR src "src/tr/fn/grammar/Puf.g" 232
CONS         : ':'      ;

// $ANTLR src "src/tr/fn/grammar/Puf.g" 234
ID           : (('a' .. 'z') | ('A' .. 'Z')) (('a' .. 'z') | ('A' .. 'Z') | ('0' .. '9'))*
             | '#';
           
// $ANTLR src "src/tr/fn/grammar/Puf.g" 237
INT          : ('0' .. '9')+ ;

// $ANTLR src "src/tr/fn/grammar/Puf.g" 239
WS           : (' ' | '\t')+ { skip(); };

// $ANTLR src "src/tr/fn/grammar/Puf.g" 241
NL           : ('\r'? '\n')+ { skip(); };

// $ANTLR src "src/tr/fn/grammar/Puf.g" 243
ML_COMMENT   : '/*' (options {greedy=false;} : . )* '*/' { skip(); } ;

// $ANTLR src "src/tr/fn/grammar/Puf.g" 245
SL_COMMENT   : '//' ~('\n'|'\r')* ('\r\n' | '\r' | '\n') { skip(); }
             | '//' ~('\n'|'\r')* { skip(); };
