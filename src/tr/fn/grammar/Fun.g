grammar Fun;
// TODO greedy + and *
options {
  output = AST;
  k = 2;
}

tokens {
  APP;
  TUPLE;
  LIST;
}

@header {
package tr.fn.grammar;
}

@lexer::header {
package tr.fn.grammar;
}

@lexer::members {
@Override
public void reportError(RecognitionException e) {
    throw new RuntimeException(e);
}
}

program    : decl* EOF;

decl       : fname ID* DEFINE expr ENDEXPR -> ^(DEFINE fname expr ID*) ;

fname      : ID ;

expr       : single expr? ;
           
single     : HASH INT expr
           | IF or THEN e1=expr ELSE e2=expr   -> ^(IF or $e1 $e2)
           | LAMBDA ID* RIGHTARROW expr  -> ^(LAMBDA expr ID*)
           | LET decl+ IN expr           -> ^(LET expr decl+)
           | LETREC decl+ IN expr        -> ^(LETREC expr decl+)
           | EMPTY_LIST
           | list_sugar
           | tuple
           | or ;
           
list_sugar     : OPEN_SQUARE! expr list_sugar_end -> ^(LIST expr list_sugar_end) ;
list_sugar_end : CLOSE_SQUARE
               | COMMA! expr list_sugar_end ;
       
tuple      : EMPTY_TUPLE
           | LEFTPAREN! expr tuple_end    -> ^(TUPLE expr tuple_end) ;
           
tuple_end  : RIGHTPAREN
           | COMMA! expr tuple_end ;

fapp       : fname farg+ -> ^(APP fname farg+) ;

farg       : LEFTPAREN expr RIGHTPAREN -> ^(expr)
           | ID
           | INT ;

or         : and (OR^ and)* ;

and        : not (AND^ not)* ;

not        : NOT^ not
           | comp ;
           
comp       : list (comp_op^ list)* ;

list       : arith (CONS^ tail)? ;

tail       : list
           | EMPTY_LIST ;
       
arith      : term ((PLUS | MINUS)^ term)* ;
       
term       : factor ((STAR | SLASH | PERCENT)^ factor)* ;

factor     : fapp
           | LEFTPAREN or RIGHTPAREN -> ^(or)
           | PLUS factor
           | MINUS factor
           | INT
           | ID ;
           
comp_op    : LESS
           | GREATER
           | EQUAL
           | GREATEREQUAL
           | LESSEQUAL
           | NOTEQUAL ;

OPEN_SQUARE  : '['      ;
CLOSE_SQUARE : ']'      ;
EMPTY_TUPLE  : '()'     ;
COMMA        : ','      ;
EMPTY_LIST   : '[]'     ;
CONS         : ':'      ;
DEFINE       : '='      ;
LAMBDA       : 'fn'     ;
RIGHTARROW   : '->'     ;
LET          : 'let'    ;
LETREC       : 'letrec' ;
IN           : 'in'     ;
HASH         : '#'      ;
ENDEXPR      : ';'      ;
LEFTPAREN    : '('      ;
RIGHTPAREN   : ')'      ;

LESS         : '<'  ;
GREATER      : '>'  ;
EQUAL        : '==' ;
NOTEQUAL     : '!=' ;
LESSEQUAL    : '<=' ;
GREATEREQUAL : '>=' ;

IF         : 'if'   ;
THEN       : 'then' ;
ELSE       : 'else' ;

NOT        : 'not' ;
AND        : '&&'  ;
OR         : '||'  ;
PLUS       : '+'   ;
MINUS      : '-'   ;
STAR       : '*'   ;
SLASH      : '/'   ;
PERCENT    : '%'   ;
ID         : (('a' .. 'z') | ('A' .. 'Z')) (('a' .. 'z') | ('A' .. 'Z') | ('0' .. '9'))* ;
INT        : '0' .. '9'+ ;
WS         : (' ' | '\t')+ { skip(); };
NL         : ('\r'? '\n')+ { skip(); };

ML_COMMENT : '/*' (options {greedy=false;} : . )* '*/' { skip(); };
SL_COMMENT : '//' ~('\n'|'\r')* ('\r\n' | '\r' | '\n') { skip(); }
           | '//' ~('\n'|'\r')* { skip(); };
