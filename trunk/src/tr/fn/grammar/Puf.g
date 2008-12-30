grammar Puf;

options {
  output = AST;
  k = 3;
}

tokens {
  APP;
  TUPLE;
  LIST;
  CALT;
  NALT;
  LET;
  LETREC;
  IF;
  LAMBDA;
  CASE;
  DEFINE;
  TLHS;
  FLHS;
  EXPR;
}

@header {
package tr.fn.grammar;

import tr.fn.ast.*;
import tr.fn.ast.list.*;
import java.util.Collections;
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

program    returns [List<Declaration> v]
           @init { List<Declaration> l = new ArrayList<Declaration>(); }
           : (d = rdecl { l.add($d.v); })* EOF {
               $v = l;
           };

rdecl      returns [Declaration v]
           @init { List<Identifier> a = new ArrayList<Identifier>(); }
           : f = id (arg = id { a.add($arg.v); })* '=' e = expr ';' {
               if ($e.v instanceof Simple && a.isEmpty()) {
                   $v = new Declaration($f.v, $e.v);
               } else {
                   $v = new Declaration($f.v, new Lambda(a, $e.v));
               }
           };

ldecl      returns [Declaration v]
           : rdecl { $v = $rdecl.v; } ;
           /*
           | tlhs '=' expr ';' {
               if ($tlhs.v instanceof Tuple) {
                   $v = new TupleDeclaration((Tuple) $tlhs.v, $expr.v);
               } else {
                   List<Identifier> a = Collections.emptyList();
                   $v = new NamedDeclaration((Identifier) $tlhs.v, new Lambda(a, $expr.v));
               }
           };*/

tlhs       returns [Tuple v]
           @init { List<Identifier> a = new ArrayList<Identifier>(); }
           : '(' (i = id { a.add($i.v); })? (',' in = id { a.add($in.v); })* ')' {
               //if (a.size() == 1) {
               //    $v = a.get(0);
               //} else {
                   $v = new Tuple(a);
               //}
           };

expr       returns [Expression v]
           @init { List<Expression> l = new ArrayList<Expression>(); }
           : (e = oexpr { l.add($e.v); })+ {
               if (l.size() == 1) {
                   $v = l.get(0);
               } else {
                   Expression fe = l.get(0);
                   l.remove(0);
                   $v = new Application(fe, l);
               }
           };

oexpr      returns [Expression v]
           @init { List<Expression> l = new ArrayList<Expression>(); }
           : e = aexpr { l.add($e.v); } (OR e1 = aexpr { l.add($e1.v); } )* {
                $v = AstUtil.makeBinaryOperator($OR.text, l, true);
           };

aexpr      returns [Expression v]
           @init { List<Expression> l = new ArrayList<Expression>(); }
           : e = cexpr { l.add($e.v); } (AND e1 = cexpr { l.add($e1.v); } )* {
               $v = AstUtil.makeBinaryOperator($AND.text, l, true);
           };

cexpr      returns [Expression v]
           @init { List<Expression> l = new ArrayList<Expression>(); }
           : e = lexpr { l.add($e.v); } (c = cop e1 = lexpr { l.add($e1.v); } )? {
               $v = AstUtil.makeBinaryOperator($c.text, l, true);
           };

lexpr      returns [Expression v]
           @init { List<Expression> l = new ArrayList<Expression>(); }
           : e = pexpr { l.add($e.v); } (CONS e1 = pexpr { l.add($e1.v); } )* {
               $v = AstUtil.makeHeadTailList(l, true);
           };

pexpr      returns [Expression v]
           @init { List<Expression> l = new ArrayList<Expression>(); }
           : e = mexpr { l.add($e.v); } (o = (PLUS | MINUS) e1 = mexpr { l.add($e1.v); } )* {
               $v = AstUtil.makeBinaryOperator($o.text, l, true);
           };

mexpr      returns [Expression v]
           @init { List<Expression> l = new ArrayList<Expression>(); }
           : e = fexpr { l.add($e.v); } (o = (STAR | SLASH | PERCENT) e1 = fexpr { l.add($e1.v); } )* {
               $v = AstUtil.makeBinaryOperator($o.text, l, true);
           };

fexpr      returns [Expression v]
           : fappl     { $v = $fappl.v; }
           | id        { $v = $id.v; }
           | integer   { $v = $integer.v; }
           | tuple     { $v = $tuple.v; }
           | list      { $v = $list.v; }
           | iexpr     { $v = $iexpr.v; }
           | let       { $v = $let.v; }
           | letrec    { $v = $letrec.v; }
           | lambda    { $v = $lambda.v; }
           | casee     { $v = $casee.v; }
           | tlet      { $v = $tlet.v; };
           
fappl      returns [Expression v]
           : id (fargm { $v = new Application($id.v, $fargm.v); } | fsarg { $v = new Application($id.v, $fsarg.v); }) ;

fargm      returns [List<Expression> v]
           @init { List<Expression> l = new ArrayList<Expression>(); }
           : (e = fmarg { l.add($e.v); })+ {
               $v = l;
           };

fmarg      returns [Expression v]
           : tuple   { $v = $tuple.v; }
           | id      { $v = $id.v; }
           | integer { $v = $integer.v; }
           | list    { $v = $list.v; };

fsarg      returns [List<Expression> v]
           : let     { $v = Collections.singletonList((Expression) $let.v); }
           | letrec  { $v = Collections.singletonList((Expression) $letrec.v); }
           | lambda  { $v = Collections.singletonList((Expression) $lambda.v); }
           | casee   { $v = Collections.singletonList((Expression) $casee.v); }
           | tlet    { $v = Collections.singletonList((Expression) $tlet.v); };
           
tlet       returns [Expression v]
           : 'let' tlhs '=' e1 = expr 'in' e2 = expr {
               $v = new TupleLet($tlhs.v, $e1.v, $e2.v);
           };
           
iexpr      returns [Expression v]
           : 'if' c = expr 'then' t = expr 'else' e = expr {
               $v = new IfThenElse($c.v, $t.v, $e.v);
           };
           
tuple      returns [Expression v]
           @init { List<Expression> l = new ArrayList<Expression>(); }
           : '(' (e = expr { l.add($e.v); })? (',' e = expr { l.add($e.v); } )* ')' {
               if (l.size() == 1) {
                   $v = l.get(0);
               } else {
                   $v = new Tuple(l);
               }
           };

list       returns [Expression v]
           @init { List<Expression> l = new ArrayList<Expression>(); }
           : '[]' {
               $v = AstUtil.makeHeadTailList(l, false);
           }
           | '[' e = expr { l.add($e.v); } (',' e = expr { l.add($e.v); } )* ']' {
               $v = AstUtil.makeHeadTailList(l, false);
           };

lambda     returns [Expression v]
           @init { List<Identifier> a = new ArrayList<Identifier>(); }
           : 'fn' (i = id { a.add($i.v); })* '->' e = expr {
               $v = new Lambda(a, $e.v);
           };

let        returns [Let v]
           @init { List<Declaration> l = new ArrayList<Declaration>(); }
           : 'let' (d = ldecl { l.add($d.v); })+ 'in' e = expr {
               $v = new Let(l, $e.v);
           };

letrec     returns [LetRec v]
           @init { List<Declaration> l = new ArrayList<Declaration>(); }
           : 'letrec' (d = rdecl { l.add($d.v); })+ 'in' e = expr {
               $v = new LetRec(l, $e.v);
           };

casee      returns [Case v]
           : 'case' e = expr 'of' n = nalt ';' c = calt {
               $v = new Case($e.v, $n.v, $c.v);
           };

nalt       returns [Nalt v]
           : '[]' '->' e = expr {
               $v = new Nalt($e.v);
           };

calt       returns [Calt v]
           : i1 = id ':' i2 = id '->' e = expr {
               $v = new Calt($i1.v, $i2.v, $e.v);
           };
           
integer    returns [tr.fn.ast.Number v]
           : INT {
               $v = new tr.fn.ast.Number(Integer.valueOf($INT.text));
           };

id         returns [Identifier v]
           : ID {
               $v = new Identifier($ID.text);
           };

cop          : LESS
             | GREATER
             | EQUAL
             | GREATEREQUAL
             | LESSEQUAL
             | NOTEQUAL ;

LESS         : '<'      ;
GREATER      : '>'      ;
EQUAL        : '=='     ;
NOTEQUAL     : '!='     ;
LESSEQUAL    : '<='     ;
GREATEREQUAL : '>='     ;

AND          : '&&'     ;
OR           : '||'     ;
PLUS         : '+'      ;
MINUS        : '-'      ;
STAR         : '*'      ;
SLASH        : '/'      ;
PERCENT      : '%'      ;
CONS         : ':'      ;

ID           : (('a' .. 'z') | ('A' .. 'Z')) (('a' .. 'z') | ('A' .. 'Z') | ('0' .. '9'))*
             | '#';
           
INT          : ('0' .. '9')+ ;

WS           : (' ' | '\t')+ { skip(); };

NL           : ('\r'? '\n')+ { skip(); };

ML_COMMENT   : '/*' (options {greedy=false;} : . )* '*/' { skip(); } ;

SL_COMMENT   : '//' ~('\n'|'\r')* ('\r\n' | '\r' | '\n') { skip(); }
             | '//' ~('\n'|'\r')* { skip(); };
