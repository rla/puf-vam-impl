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

// $ANTLR src "src/tr/fn/grammar/Puf.g" 241
LESS         : '<'      ;
// $ANTLR src "src/tr/fn/grammar/Puf.g" 242
GREATER      : '>'      ;
// $ANTLR src "src/tr/fn/grammar/Puf.g" 243
EQUAL        : '=='     ;
// $ANTLR src "src/tr/fn/grammar/Puf.g" 244
NOTEQUAL     : '!='     ;
// $ANTLR src "src/tr/fn/grammar/Puf.g" 245
LESSEQUAL    : '<='     ;
// $ANTLR src "src/tr/fn/grammar/Puf.g" 246
GREATEREQUAL : '>='     ;

// $ANTLR src "src/tr/fn/grammar/Puf.g" 248
AND          : '&&'     ;
// $ANTLR src "src/tr/fn/grammar/Puf.g" 249
OR           : '||'     ;
// $ANTLR src "src/tr/fn/grammar/Puf.g" 250
PLUS         : '+'      ;
// $ANTLR src "src/tr/fn/grammar/Puf.g" 251
MINUS        : '-'      ;
// $ANTLR src "src/tr/fn/grammar/Puf.g" 252
STAR         : '*'      ;
// $ANTLR src "src/tr/fn/grammar/Puf.g" 253
SLASH        : '/'      ;
// $ANTLR src "src/tr/fn/grammar/Puf.g" 254
PERCENT      : '%'      ;
// $ANTLR src "src/tr/fn/grammar/Puf.g" 255
CONS         : ':'      ;

// $ANTLR src "src/tr/fn/grammar/Puf.g" 257
ID           : (('a' .. 'z') | ('A' .. 'Z')) (('a' .. 'z') | ('A' .. 'Z') | ('0' .. '9'))*
             | '#';
           
// $ANTLR src "src/tr/fn/grammar/Puf.g" 260
INT          : ('0' .. '9')+ ;

// $ANTLR src "src/tr/fn/grammar/Puf.g" 262
WS           : (' ' | '\t')+ { skip(); };

// $ANTLR src "src/tr/fn/grammar/Puf.g" 264
NL           : ('\r'? '\n')+ { skip(); };

// $ANTLR src "src/tr/fn/grammar/Puf.g" 266
ML_COMMENT   : '/*' (options {greedy=false;} : . )* '*/' { skip(); } ;

// $ANTLR src "src/tr/fn/grammar/Puf.g" 268
SL_COMMENT   : '//' ~('\n'|'\r')* ('\r\n' | '\r' | '\n') { skip(); }
             | '//' ~('\n'|'\r')* { skip(); };
