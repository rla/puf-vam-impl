// $ANTLR 3.1.1 src/tr/fn/grammar/Puf.g 2008-12-18 04:41:59

package tr.fn.grammar;

import tr.fn.ast.*;
import tr.fn.ast.list.*;

import java.util.Collections;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class PufParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "APP", "TUPLE", "LIST", "CALT", "NALT", "LET", "LETREC", "IF", "LAMBDA", "CASE", "DEFINE", "TLHS", "FLHS", "EXPR", "OR", "AND", "CONS", "PLUS", "MINUS", "STAR", "SLASH", "PERCENT", "INT", "ID", "LESS", "GREATER", "EQUAL", "GREATEREQUAL", "LESSEQUAL", "NOTEQUAL", "WS", "NL", "ML_COMMENT", "SL_COMMENT", "'='", "';'", "'('", "','", "')'", "'let'", "'in'", "'if'", "'then'", "'else'", "'['", "']'", "'fn'", "'->'", "'letrec'", "'case'", "'of'", "'[]'"
    };
    public static final int STAR=23;
    public static final int FLHS=16;
    public static final int CASE=13;
    public static final int GREATEREQUAL=31;
    public static final int APP=4;
    public static final int ID=27;
    public static final int AND=19;
    public static final int EOF=-1;
    public static final int DEFINE=14;
    public static final int IF=11;
    public static final int NOTEQUAL=33;
    public static final int T__55=55;
    public static final int ML_COMMENT=36;
    public static final int TUPLE=5;
    public static final int LETREC=10;
    public static final int GREATER=29;
    public static final int T__51=51;
    public static final int TLHS=15;
    public static final int EXPR=17;
    public static final int SLASH=24;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int EQUAL=30;
    public static final int LESS=28;
    public static final int PLUS=21;
    public static final int NL=35;
    public static final int LAMBDA=12;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int PERCENT=25;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int CALT=7;
    public static final int INT=26;
    public static final int MINUS=22;
    public static final int LIST=6;
    public static final int NALT=8;
    public static final int WS=34;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int CONS=20;
    public static final int SL_COMMENT=37;
    public static final int OR=18;
    public static final int LESSEQUAL=32;
    public static final int LET=9;

    // delegates
    // delegators


        public PufParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public PufParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return PufParser.tokenNames; }
    public String getGrammarFileName() { return "src/tr/fn/grammar/Puf.g"; }


    public static class program_return extends ParserRuleReturnScope {
        public List<Declaration> v;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "program"
    // src/tr/fn/grammar/Puf.g:44:1: program returns [List<Declaration> v] : (d= rdecl )* EOF ;
    public final PufParser.program_return program() throws RecognitionException {
        PufParser.program_return retval = new PufParser.program_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EOF1=null;
        PufParser.rdecl_return d = null;


        Object EOF1_tree=null;

         List<Declaration> l = new ArrayList<Declaration>(); 
        try {
            // src/tr/fn/grammar/Puf.g:46:12: ( (d= rdecl )* EOF )
            // src/tr/fn/grammar/Puf.g:46:14: (d= rdecl )* EOF
            {
            root_0 = (Object)adaptor.nil();

            // src/tr/fn/grammar/Puf.g:46:14: (d= rdecl )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // src/tr/fn/grammar/Puf.g:46:15: d= rdecl
            	    {
            	    pushFollow(FOLLOW_rdecl_in_program171);
            	    d=rdecl();

            	    state._fsp--;

            	    adaptor.addChild(root_0, d.getTree());
            	     l.add((d!=null?d.v:null)); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            EOF1=(Token)match(input,EOF,FOLLOW_EOF_in_program177); 
            EOF1_tree = (Object)adaptor.create(EOF1);
            adaptor.addChild(root_0, EOF1_tree);


                           retval.v = l;
                       

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "program"

    public static class rdecl_return extends ParserRuleReturnScope {
        public Declaration v;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rdecl"
    // src/tr/fn/grammar/Puf.g:50:1: rdecl returns [Declaration v] : f= id (arg= id )* '=' e= expr ';' ;
    public final PufParser.rdecl_return rdecl() throws RecognitionException {
        PufParser.rdecl_return retval = new PufParser.rdecl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal2=null;
        Token char_literal3=null;
        PufParser.id_return f = null;

        PufParser.id_return arg = null;

        PufParser.expr_return e = null;


        Object char_literal2_tree=null;
        Object char_literal3_tree=null;

         List<Identifier> a = new ArrayList<Identifier>(); 
        try {
            // src/tr/fn/grammar/Puf.g:52:12: (f= id (arg= id )* '=' e= expr ';' )
            // src/tr/fn/grammar/Puf.g:52:14: f= id (arg= id )* '=' e= expr ';'
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_id_in_rdecl227);
            f=id();

            state._fsp--;

            adaptor.addChild(root_0, f.getTree());
            // src/tr/fn/grammar/Puf.g:52:21: (arg= id )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // src/tr/fn/grammar/Puf.g:52:22: arg= id
            	    {
            	    pushFollow(FOLLOW_id_in_rdecl234);
            	    arg=id();

            	    state._fsp--;

            	    adaptor.addChild(root_0, arg.getTree());
            	     a.add((arg!=null?arg.v:null)); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            char_literal2=(Token)match(input,38,FOLLOW_38_in_rdecl240); 
            char_literal2_tree = (Object)adaptor.create(char_literal2);
            adaptor.addChild(root_0, char_literal2_tree);

            pushFollow(FOLLOW_expr_in_rdecl246);
            e=expr();

            state._fsp--;

            adaptor.addChild(root_0, e.getTree());
            char_literal3=(Token)match(input,39,FOLLOW_39_in_rdecl248); 
            char_literal3_tree = (Object)adaptor.create(char_literal3);
            adaptor.addChild(root_0, char_literal3_tree);


                           if ((e!=null?e.v:null) instanceof Simple) {
                               retval.v = new Declaration((f!=null?f.v:null), (e!=null?e.v:null));
                           } else {
                               retval.v = new Declaration((f!=null?f.v:null), new Lambda(a, (e!=null?e.v:null)));
                           }
                       

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rdecl"

    public static class ldecl_return extends ParserRuleReturnScope {
        public Declaration v;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ldecl"
    // src/tr/fn/grammar/Puf.g:60:1: ldecl returns [Declaration v] : rdecl ;
    public final PufParser.ldecl_return ldecl() throws RecognitionException {
        PufParser.ldecl_return retval = new PufParser.ldecl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PufParser.rdecl_return rdecl4 = null;



        try {
            // src/tr/fn/grammar/Puf.g:61:12: ( rdecl )
            // src/tr/fn/grammar/Puf.g:61:14: rdecl
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_rdecl_in_ldecl278);
            rdecl4=rdecl();

            state._fsp--;

            adaptor.addChild(root_0, rdecl4.getTree());
             retval.v = (rdecl4!=null?rdecl4.v:null); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ldecl"

    public static class tlhs_return extends ParserRuleReturnScope {
        public Tuple v;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "tlhs"
    // src/tr/fn/grammar/Puf.g:72:1: tlhs returns [Tuple v] : '(' i= id ( ',' in= id )* ')' ;
    public final PufParser.tlhs_return tlhs() throws RecognitionException {
        PufParser.tlhs_return retval = new PufParser.tlhs_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal5=null;
        Token char_literal6=null;
        Token char_literal7=null;
        PufParser.id_return i = null;

        PufParser.id_return in = null;


        Object char_literal5_tree=null;
        Object char_literal6_tree=null;
        Object char_literal7_tree=null;

         List<Identifier> a = new ArrayList<Identifier>(); 
        try {
            // src/tr/fn/grammar/Puf.g:74:12: ( '(' i= id ( ',' in= id )* ')' )
            // src/tr/fn/grammar/Puf.g:74:14: '(' i= id ( ',' in= id )* ')'
            {
            root_0 = (Object)adaptor.nil();

            char_literal5=(Token)match(input,40,FOLLOW_40_in_tlhs339); 
            char_literal5_tree = (Object)adaptor.create(char_literal5);
            adaptor.addChild(root_0, char_literal5_tree);

            pushFollow(FOLLOW_id_in_tlhs345);
            i=id();

            state._fsp--;

            adaptor.addChild(root_0, i.getTree());
             a.add((i!=null?i.v:null)); 
            // src/tr/fn/grammar/Puf.g:74:42: ( ',' in= id )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==41) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // src/tr/fn/grammar/Puf.g:74:43: ',' in= id
            	    {
            	    char_literal6=(Token)match(input,41,FOLLOW_41_in_tlhs350); 
            	    char_literal6_tree = (Object)adaptor.create(char_literal6);
            	    adaptor.addChild(root_0, char_literal6_tree);

            	    pushFollow(FOLLOW_id_in_tlhs356);
            	    in=id();

            	    state._fsp--;

            	    adaptor.addChild(root_0, in.getTree());
            	     a.add((in!=null?in.v:null)); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            char_literal7=(Token)match(input,42,FOLLOW_42_in_tlhs362); 
            char_literal7_tree = (Object)adaptor.create(char_literal7);
            adaptor.addChild(root_0, char_literal7_tree);


                           //if (a.size() == 1) {
                           //    retval.v = a.get(0);
                           //} else {
                               retval.v = new Tuple(a);
                           //}
                       

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "tlhs"

    public static class expr_return extends ParserRuleReturnScope {
        public Expression v;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // src/tr/fn/grammar/Puf.g:82:1: expr returns [Expression v] : (e= oexpr )+ ;
    public final PufParser.expr_return expr() throws RecognitionException {
        PufParser.expr_return retval = new PufParser.expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PufParser.oexpr_return e = null;



         List<Expression> l = new ArrayList<Expression>(); 
        try {
            // src/tr/fn/grammar/Puf.g:84:12: ( (e= oexpr )+ )
            // src/tr/fn/grammar/Puf.g:84:14: (e= oexpr )+
            {
            root_0 = (Object)adaptor.nil();

            // src/tr/fn/grammar/Puf.g:84:14: (e= oexpr )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                alt4 = dfa4.predict(input);
                switch (alt4) {
            	case 1 :
            	    // src/tr/fn/grammar/Puf.g:84:15: e= oexpr
            	    {
            	    pushFollow(FOLLOW_oexpr_in_expr414);
            	    e=oexpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, e.getTree());
            	     l.add((e!=null?e.v:null)); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


                           if (l.size() == 1) {
                               retval.v = l.get(0);
                           } else {
                               Expression fe = l.get(0);
                               l.remove(0);
                               retval.v = new Application(fe, l);
                           }
                       

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr"

    public static class oexpr_return extends ParserRuleReturnScope {
        public Expression v;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "oexpr"
    // src/tr/fn/grammar/Puf.g:94:1: oexpr returns [Expression v] : e= aexpr ( OR e= aexpr )* ;
    public final PufParser.oexpr_return oexpr() throws RecognitionException {
        PufParser.oexpr_return retval = new PufParser.oexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR8=null;
        PufParser.aexpr_return e = null;


        Object OR8_tree=null;

         List<Expression> l = new ArrayList<Expression>(); 
        try {
            // src/tr/fn/grammar/Puf.g:96:12: (e= aexpr ( OR e= aexpr )* )
            // src/tr/fn/grammar/Puf.g:96:14: e= aexpr ( OR e= aexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_aexpr_in_oexpr468);
            e=aexpr();

            state._fsp--;

            adaptor.addChild(root_0, e.getTree());
             l.add((e!=null?e.v:null)); 
            // src/tr/fn/grammar/Puf.g:96:41: ( OR e= aexpr )*
            loop5:
            do {
                int alt5=2;
                alt5 = dfa5.predict(input);
                switch (alt5) {
            	case 1 :
            	    // src/tr/fn/grammar/Puf.g:96:42: OR e= aexpr
            	    {
            	    OR8=(Token)match(input,OR,FOLLOW_OR_in_oexpr473); 
            	    OR8_tree = (Object)adaptor.create(OR8);
            	    adaptor.addChild(root_0, OR8_tree);

            	    pushFollow(FOLLOW_aexpr_in_oexpr479);
            	    e=aexpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, e.getTree());
            	     l.add((e!=null?e.v:null)); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


                            retval.v = AstUtil.makeBinaryOperator((OR8!=null?OR8.getText():null), l, true);
                       

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "oexpr"

    public static class aexpr_return extends ParserRuleReturnScope {
        public Expression v;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "aexpr"
    // src/tr/fn/grammar/Puf.g:100:1: aexpr returns [Expression v] : e= cexpr ( AND e= cexpr )* ;
    public final PufParser.aexpr_return aexpr() throws RecognitionException {
        PufParser.aexpr_return retval = new PufParser.aexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AND9=null;
        PufParser.cexpr_return e = null;


        Object AND9_tree=null;

         List<Expression> l = new ArrayList<Expression>(); 
        try {
            // src/tr/fn/grammar/Puf.g:102:12: (e= cexpr ( AND e= cexpr )* )
            // src/tr/fn/grammar/Puf.g:102:14: e= cexpr ( AND e= cexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_cexpr_in_aexpr534);
            e=cexpr();

            state._fsp--;

            adaptor.addChild(root_0, e.getTree());
             l.add((e!=null?e.v:null)); 
            // src/tr/fn/grammar/Puf.g:102:41: ( AND e= cexpr )*
            loop6:
            do {
                int alt6=2;
                alt6 = dfa6.predict(input);
                switch (alt6) {
            	case 1 :
            	    // src/tr/fn/grammar/Puf.g:102:42: AND e= cexpr
            	    {
            	    AND9=(Token)match(input,AND,FOLLOW_AND_in_aexpr539); 
            	    AND9_tree = (Object)adaptor.create(AND9);
            	    adaptor.addChild(root_0, AND9_tree);

            	    pushFollow(FOLLOW_cexpr_in_aexpr545);
            	    e=cexpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, e.getTree());
            	     l.add((e!=null?e.v:null)); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


                           retval.v = AstUtil.makeBinaryOperator((AND9!=null?AND9.getText():null), l, true);
                       

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "aexpr"

    public static class cexpr_return extends ParserRuleReturnScope {
        public Expression v;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cexpr"
    // src/tr/fn/grammar/Puf.g:106:1: cexpr returns [Expression v] : e= lexpr (c= cop e= lexpr )? ;
    public final PufParser.cexpr_return cexpr() throws RecognitionException {
        PufParser.cexpr_return retval = new PufParser.cexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PufParser.lexpr_return e = null;

        PufParser.cop_return c = null;



         List<Expression> l = new ArrayList<Expression>(); 
        try {
            // src/tr/fn/grammar/Puf.g:108:12: (e= lexpr (c= cop e= lexpr )? )
            // src/tr/fn/grammar/Puf.g:108:14: e= lexpr (c= cop e= lexpr )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_lexpr_in_cexpr600);
            e=lexpr();

            state._fsp--;

            adaptor.addChild(root_0, e.getTree());
             l.add((e!=null?e.v:null)); 
            // src/tr/fn/grammar/Puf.g:108:41: (c= cop e= lexpr )?
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // src/tr/fn/grammar/Puf.g:108:42: c= cop e= lexpr
                    {
                    pushFollow(FOLLOW_cop_in_cexpr609);
                    c=cop();

                    state._fsp--;

                    adaptor.addChild(root_0, c.getTree());
                    pushFollow(FOLLOW_lexpr_in_cexpr615);
                    e=lexpr();

                    state._fsp--;

                    adaptor.addChild(root_0, e.getTree());
                     l.add((e!=null?e.v:null)); 

                    }
                    break;

            }


                           retval.v = AstUtil.makeBinaryOperator((c!=null?input.toString(c.start,c.stop):null), l, true);
                       

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "cexpr"

    public static class lexpr_return extends ParserRuleReturnScope {
        public Expression v;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lexpr"
    // src/tr/fn/grammar/Puf.g:112:1: lexpr returns [Expression v] : e= pexpr ( CONS e= pexpr )* ;
    public final PufParser.lexpr_return lexpr() throws RecognitionException {
        PufParser.lexpr_return retval = new PufParser.lexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CONS10=null;
        PufParser.pexpr_return e = null;


        Object CONS10_tree=null;

         List<Expression> l = new ArrayList<Expression>(); 
        try {
            // src/tr/fn/grammar/Puf.g:114:12: (e= pexpr ( CONS e= pexpr )* )
            // src/tr/fn/grammar/Puf.g:114:14: e= pexpr ( CONS e= pexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_pexpr_in_lexpr670);
            e=pexpr();

            state._fsp--;

            adaptor.addChild(root_0, e.getTree());
             l.add((e!=null?e.v:null)); 
            // src/tr/fn/grammar/Puf.g:114:41: ( CONS e= pexpr )*
            loop8:
            do {
                int alt8=2;
                alt8 = dfa8.predict(input);
                switch (alt8) {
            	case 1 :
            	    // src/tr/fn/grammar/Puf.g:114:42: CONS e= pexpr
            	    {
            	    CONS10=(Token)match(input,CONS,FOLLOW_CONS_in_lexpr675); 
            	    CONS10_tree = (Object)adaptor.create(CONS10);
            	    adaptor.addChild(root_0, CONS10_tree);

            	    pushFollow(FOLLOW_pexpr_in_lexpr681);
            	    e=pexpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, e.getTree());
            	     l.add((e!=null?e.v:null)); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


                           retval.v = AstUtil.makeHeadTailList(l);
                       

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "lexpr"

    public static class pexpr_return extends ParserRuleReturnScope {
        public Expression v;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pexpr"
    // src/tr/fn/grammar/Puf.g:118:1: pexpr returns [Expression v] : e= mexpr (o= ( PLUS | MINUS ) e= mexpr )* ;
    public final PufParser.pexpr_return pexpr() throws RecognitionException {
        PufParser.pexpr_return retval = new PufParser.pexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token o=null;
        PufParser.mexpr_return e = null;


        Object o_tree=null;

         List<Expression> l = new ArrayList<Expression>(); 
        try {
            // src/tr/fn/grammar/Puf.g:120:12: (e= mexpr (o= ( PLUS | MINUS ) e= mexpr )* )
            // src/tr/fn/grammar/Puf.g:120:14: e= mexpr (o= ( PLUS | MINUS ) e= mexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_mexpr_in_pexpr736);
            e=mexpr();

            state._fsp--;

            adaptor.addChild(root_0, e.getTree());
             l.add((e!=null?e.v:null)); 
            // src/tr/fn/grammar/Puf.g:120:41: (o= ( PLUS | MINUS ) e= mexpr )*
            loop9:
            do {
                int alt9=2;
                alt9 = dfa9.predict(input);
                switch (alt9) {
            	case 1 :
            	    // src/tr/fn/grammar/Puf.g:120:42: o= ( PLUS | MINUS ) e= mexpr
            	    {
            	    o=(Token)input.LT(1);
            	    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(o));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_mexpr_in_pexpr757);
            	    e=mexpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, e.getTree());
            	     l.add((e!=null?e.v:null)); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


                           retval.v = AstUtil.makeBinaryOperator((o!=null?o.getText():null), l, true);
                       

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "pexpr"

    public static class mexpr_return extends ParserRuleReturnScope {
        public Expression v;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mexpr"
    // src/tr/fn/grammar/Puf.g:124:1: mexpr returns [Expression v] : e= fexpr (o= ( STAR | SLASH | PERCENT ) e= fexpr )* ;
    public final PufParser.mexpr_return mexpr() throws RecognitionException {
        PufParser.mexpr_return retval = new PufParser.mexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token o=null;
        PufParser.fexpr_return e = null;


        Object o_tree=null;

         List<Expression> l = new ArrayList<Expression>(); 
        try {
            // src/tr/fn/grammar/Puf.g:126:12: (e= fexpr (o= ( STAR | SLASH | PERCENT ) e= fexpr )* )
            // src/tr/fn/grammar/Puf.g:126:14: e= fexpr (o= ( STAR | SLASH | PERCENT ) e= fexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_fexpr_in_mexpr812);
            e=fexpr();

            state._fsp--;

            adaptor.addChild(root_0, e.getTree());
             l.add((e!=null?e.v:null)); 
            // src/tr/fn/grammar/Puf.g:126:41: (o= ( STAR | SLASH | PERCENT ) e= fexpr )*
            loop10:
            do {
                int alt10=2;
                alt10 = dfa10.predict(input);
                switch (alt10) {
            	case 1 :
            	    // src/tr/fn/grammar/Puf.g:126:42: o= ( STAR | SLASH | PERCENT ) e= fexpr
            	    {
            	    o=(Token)input.LT(1);
            	    if ( (input.LA(1)>=STAR && input.LA(1)<=PERCENT) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(o));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_fexpr_in_mexpr837);
            	    e=fexpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, e.getTree());
            	     l.add((e!=null?e.v:null)); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


                           retval.v = AstUtil.makeBinaryOperator((o!=null?o.getText():null), l, true);
                       

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "mexpr"

    public static class fexpr_return extends ParserRuleReturnScope {
        public Expression v;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fexpr"
    // src/tr/fn/grammar/Puf.g:130:1: fexpr returns [Expression v] : ( id | integer | tuple | list | iexpr | let | letrec | lambda | casee | tlet );
    public final PufParser.fexpr_return fexpr() throws RecognitionException {
        PufParser.fexpr_return retval = new PufParser.fexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PufParser.id_return id11 = null;

        PufParser.integer_return integer12 = null;

        PufParser.tuple_return tuple13 = null;

        PufParser.list_return list14 = null;

        PufParser.iexpr_return iexpr15 = null;

        PufParser.let_return let16 = null;

        PufParser.letrec_return letrec17 = null;

        PufParser.lambda_return lambda18 = null;

        PufParser.casee_return casee19 = null;

        PufParser.tlet_return tlet20 = null;



        try {
            // src/tr/fn/grammar/Puf.g:131:12: ( id | integer | tuple | list | iexpr | let | letrec | lambda | casee | tlet )
            int alt11=10;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // src/tr/fn/grammar/Puf.g:131:14: id
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_id_in_fexpr872);
                    id11=id();

                    state._fsp--;

                    adaptor.addChild(root_0, id11.getTree());
                     retval.v = (id11!=null?id11.v:null); 

                    }
                    break;
                case 2 :
                    // src/tr/fn/grammar/Puf.g:132:14: integer
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_integer_in_fexpr896);
                    integer12=integer();

                    state._fsp--;

                    adaptor.addChild(root_0, integer12.getTree());
                     retval.v = (integer12!=null?integer12.v:null); 

                    }
                    break;
                case 3 :
                    // src/tr/fn/grammar/Puf.g:133:14: tuple
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_tuple_in_fexpr915);
                    tuple13=tuple();

                    state._fsp--;

                    adaptor.addChild(root_0, tuple13.getTree());
                     retval.v = (tuple13!=null?tuple13.v:null); 

                    }
                    break;
                case 4 :
                    // src/tr/fn/grammar/Puf.g:134:14: list
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_list_in_fexpr936);
                    list14=list();

                    state._fsp--;

                    adaptor.addChild(root_0, list14.getTree());
                     retval.v = (list14!=null?list14.v:null); 

                    }
                    break;
                case 5 :
                    // src/tr/fn/grammar/Puf.g:135:14: iexpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_iexpr_in_fexpr958);
                    iexpr15=iexpr();

                    state._fsp--;

                    adaptor.addChild(root_0, iexpr15.getTree());
                     retval.v = (iexpr15!=null?iexpr15.v:null); 

                    }
                    break;
                case 6 :
                    // src/tr/fn/grammar/Puf.g:136:14: let
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_let_in_fexpr979);
                    let16=let();

                    state._fsp--;

                    adaptor.addChild(root_0, let16.getTree());
                     retval.v = (let16!=null?let16.v:null); 

                    }
                    break;
                case 7 :
                    // src/tr/fn/grammar/Puf.g:137:14: letrec
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_letrec_in_fexpr1002);
                    letrec17=letrec();

                    state._fsp--;

                    adaptor.addChild(root_0, letrec17.getTree());
                     retval.v = (letrec17!=null?letrec17.v:null); 

                    }
                    break;
                case 8 :
                    // src/tr/fn/grammar/Puf.g:138:14: lambda
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_lambda_in_fexpr1022);
                    lambda18=lambda();

                    state._fsp--;

                    adaptor.addChild(root_0, lambda18.getTree());
                     retval.v = (lambda18!=null?lambda18.v:null); 

                    }
                    break;
                case 9 :
                    // src/tr/fn/grammar/Puf.g:139:14: casee
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_casee_in_fexpr1042);
                    casee19=casee();

                    state._fsp--;

                    adaptor.addChild(root_0, casee19.getTree());
                     retval.v = (casee19!=null?casee19.v:null); 

                    }
                    break;
                case 10 :
                    // src/tr/fn/grammar/Puf.g:140:14: tlet
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_tlet_in_fexpr1063);
                    tlet20=tlet();

                    state._fsp--;

                    adaptor.addChild(root_0, tlet20.getTree());
                     retval.v = (tlet20!=null?tlet20.v:null); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "fexpr"

    public static class tlet_return extends ParserRuleReturnScope {
        public Expression v;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "tlet"
    // src/tr/fn/grammar/Puf.g:142:1: tlet returns [Expression v] : 'let' tlhs '=' e1= expr 'in' e2= expr ;
    public final PufParser.tlet_return tlet() throws RecognitionException {
        PufParser.tlet_return retval = new PufParser.tlet_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal21=null;
        Token char_literal23=null;
        Token string_literal24=null;
        PufParser.expr_return e1 = null;

        PufParser.expr_return e2 = null;

        PufParser.tlhs_return tlhs22 = null;


        Object string_literal21_tree=null;
        Object char_literal23_tree=null;
        Object string_literal24_tree=null;

        try {
            // src/tr/fn/grammar/Puf.g:143:12: ( 'let' tlhs '=' e1= expr 'in' e2= expr )
            // src/tr/fn/grammar/Puf.g:143:14: 'let' tlhs '=' e1= expr 'in' e2= expr
            {
            root_0 = (Object)adaptor.nil();

            string_literal21=(Token)match(input,43,FOLLOW_43_in_tlet1110); 
            string_literal21_tree = (Object)adaptor.create(string_literal21);
            adaptor.addChild(root_0, string_literal21_tree);

            pushFollow(FOLLOW_tlhs_in_tlet1112);
            tlhs22=tlhs();

            state._fsp--;

            adaptor.addChild(root_0, tlhs22.getTree());
            char_literal23=(Token)match(input,38,FOLLOW_38_in_tlet1114); 
            char_literal23_tree = (Object)adaptor.create(char_literal23);
            adaptor.addChild(root_0, char_literal23_tree);

            pushFollow(FOLLOW_expr_in_tlet1120);
            e1=expr();

            state._fsp--;

            adaptor.addChild(root_0, e1.getTree());
            string_literal24=(Token)match(input,44,FOLLOW_44_in_tlet1122); 
            string_literal24_tree = (Object)adaptor.create(string_literal24);
            adaptor.addChild(root_0, string_literal24_tree);

            pushFollow(FOLLOW_expr_in_tlet1128);
            e2=expr();

            state._fsp--;

            adaptor.addChild(root_0, e2.getTree());

                           retval.v = new TupleLet((tlhs22!=null?tlhs22.v:null), (e1!=null?e1.v:null), (e2!=null?e2.v:null));
                       

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "tlet"

    public static class iexpr_return extends ParserRuleReturnScope {
        public Expression v;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "iexpr"
    // src/tr/fn/grammar/Puf.g:147:1: iexpr returns [Expression v] : 'if' c= expr 'then' t= expr 'else' e= expr ;
    public final PufParser.iexpr_return iexpr() throws RecognitionException {
        PufParser.iexpr_return retval = new PufParser.iexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal25=null;
        Token string_literal26=null;
        Token string_literal27=null;
        PufParser.expr_return c = null;

        PufParser.expr_return t = null;

        PufParser.expr_return e = null;


        Object string_literal25_tree=null;
        Object string_literal26_tree=null;
        Object string_literal27_tree=null;

        try {
            // src/tr/fn/grammar/Puf.g:148:12: ( 'if' c= expr 'then' t= expr 'else' e= expr )
            // src/tr/fn/grammar/Puf.g:148:14: 'if' c= expr 'then' t= expr 'else' e= expr
            {
            root_0 = (Object)adaptor.nil();

            string_literal25=(Token)match(input,45,FOLLOW_45_in_iexpr1169); 
            string_literal25_tree = (Object)adaptor.create(string_literal25);
            adaptor.addChild(root_0, string_literal25_tree);

            pushFollow(FOLLOW_expr_in_iexpr1175);
            c=expr();

            state._fsp--;

            adaptor.addChild(root_0, c.getTree());
            string_literal26=(Token)match(input,46,FOLLOW_46_in_iexpr1177); 
            string_literal26_tree = (Object)adaptor.create(string_literal26);
            adaptor.addChild(root_0, string_literal26_tree);

            pushFollow(FOLLOW_expr_in_iexpr1183);
            t=expr();

            state._fsp--;

            adaptor.addChild(root_0, t.getTree());
            string_literal27=(Token)match(input,47,FOLLOW_47_in_iexpr1185); 
            string_literal27_tree = (Object)adaptor.create(string_literal27);
            adaptor.addChild(root_0, string_literal27_tree);

            pushFollow(FOLLOW_expr_in_iexpr1191);
            e=expr();

            state._fsp--;

            adaptor.addChild(root_0, e.getTree());

                           retval.v = new IfThenElse((c!=null?c.v:null), (t!=null?t.v:null), (e!=null?e.v:null));
                       

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "iexpr"

    public static class tuple_return extends ParserRuleReturnScope {
        public Expression v;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "tuple"
    // src/tr/fn/grammar/Puf.g:152:1: tuple returns [Expression v] : '(' e= expr ( ',' e= expr )* ')' ;
    public final PufParser.tuple_return tuple() throws RecognitionException {
        PufParser.tuple_return retval = new PufParser.tuple_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal28=null;
        Token char_literal29=null;
        Token char_literal30=null;
        PufParser.expr_return e = null;


        Object char_literal28_tree=null;
        Object char_literal29_tree=null;
        Object char_literal30_tree=null;

         List<Expression> l = new ArrayList<Expression>(); 
        try {
            // src/tr/fn/grammar/Puf.g:154:12: ( '(' e= expr ( ',' e= expr )* ')' )
            // src/tr/fn/grammar/Puf.g:154:14: '(' e= expr ( ',' e= expr )* ')'
            {
            root_0 = (Object)adaptor.nil();

            char_literal28=(Token)match(input,40,FOLLOW_40_in_tuple1248); 
            char_literal28_tree = (Object)adaptor.create(char_literal28);
            adaptor.addChild(root_0, char_literal28_tree);

            pushFollow(FOLLOW_expr_in_tuple1254);
            e=expr();

            state._fsp--;

            adaptor.addChild(root_0, e.getTree());
             l.add((e!=null?e.v:null)); 
            // src/tr/fn/grammar/Puf.g:154:44: ( ',' e= expr )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==41) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // src/tr/fn/grammar/Puf.g:154:45: ',' e= expr
            	    {
            	    char_literal29=(Token)match(input,41,FOLLOW_41_in_tuple1259); 
            	    char_literal29_tree = (Object)adaptor.create(char_literal29);
            	    adaptor.addChild(root_0, char_literal29_tree);

            	    pushFollow(FOLLOW_expr_in_tuple1265);
            	    e=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, e.getTree());
            	     l.add((e!=null?e.v:null)); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            char_literal30=(Token)match(input,42,FOLLOW_42_in_tuple1272); 
            char_literal30_tree = (Object)adaptor.create(char_literal30);
            adaptor.addChild(root_0, char_literal30_tree);


                           if (l.size() == 1) {
                               retval.v = l.get(0);
                           } else {
                               retval.v = new Tuple(l);
                           }
                       

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "tuple"

    public static class list_return extends ParserRuleReturnScope {
        public Expression v;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "list"
    // src/tr/fn/grammar/Puf.g:162:1: list returns [Expression v] : '[' e= expr ( ',' e= expr )* ']' ;
    public final PufParser.list_return list() throws RecognitionException {
        PufParser.list_return retval = new PufParser.list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal31=null;
        Token char_literal32=null;
        Token char_literal33=null;
        PufParser.expr_return e = null;


        Object char_literal31_tree=null;
        Object char_literal32_tree=null;
        Object char_literal33_tree=null;

         List<Expression> l = new ArrayList<Expression>(); 
        try {
            // src/tr/fn/grammar/Puf.g:164:12: ( '[' e= expr ( ',' e= expr )* ']' )
            // src/tr/fn/grammar/Puf.g:164:14: '[' e= expr ( ',' e= expr )* ']'
            {
            root_0 = (Object)adaptor.nil();

            char_literal31=(Token)match(input,48,FOLLOW_48_in_list1319); 
            char_literal31_tree = (Object)adaptor.create(char_literal31);
            adaptor.addChild(root_0, char_literal31_tree);

            pushFollow(FOLLOW_expr_in_list1325);
            e=expr();

            state._fsp--;

            adaptor.addChild(root_0, e.getTree());
             l.add((e!=null?e.v:null)); 
            // src/tr/fn/grammar/Puf.g:164:44: ( ',' e= expr )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==41) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // src/tr/fn/grammar/Puf.g:164:45: ',' e= expr
            	    {
            	    char_literal32=(Token)match(input,41,FOLLOW_41_in_list1330); 
            	    char_literal32_tree = (Object)adaptor.create(char_literal32);
            	    adaptor.addChild(root_0, char_literal32_tree);

            	    pushFollow(FOLLOW_expr_in_list1336);
            	    e=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, e.getTree());
            	     l.add((e!=null?e.v:null)); 

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            char_literal33=(Token)match(input,49,FOLLOW_49_in_list1343); 
            char_literal33_tree = (Object)adaptor.create(char_literal33);
            adaptor.addChild(root_0, char_literal33_tree);


                           retval.v = AstUtil.makeHeadTailList(l);
                       

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "list"

    public static class lambda_return extends ParserRuleReturnScope {
        public Expression v;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lambda"
    // src/tr/fn/grammar/Puf.g:168:1: lambda returns [Expression v] : 'fn' (i= id )* '->' e= expr ;
    public final PufParser.lambda_return lambda() throws RecognitionException {
        PufParser.lambda_return retval = new PufParser.lambda_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal34=null;
        Token string_literal35=null;
        PufParser.id_return i = null;

        PufParser.expr_return e = null;


        Object string_literal34_tree=null;
        Object string_literal35_tree=null;

         List<Identifier> a = new ArrayList<Identifier>(); 
        try {
            // src/tr/fn/grammar/Puf.g:170:12: ( 'fn' (i= id )* '->' e= expr )
            // src/tr/fn/grammar/Puf.g:170:14: 'fn' (i= id )* '->' e= expr
            {
            root_0 = (Object)adaptor.nil();

            string_literal34=(Token)match(input,50,FOLLOW_50_in_lambda1388); 
            string_literal34_tree = (Object)adaptor.create(string_literal34);
            adaptor.addChild(root_0, string_literal34_tree);

            // src/tr/fn/grammar/Puf.g:170:19: (i= id )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // src/tr/fn/grammar/Puf.g:170:20: i= id
            	    {
            	    pushFollow(FOLLOW_id_in_lambda1395);
            	    i=id();

            	    state._fsp--;

            	    adaptor.addChild(root_0, i.getTree());
            	     a.add((i!=null?i.v:null)); 

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            string_literal35=(Token)match(input,51,FOLLOW_51_in_lambda1401); 
            string_literal35_tree = (Object)adaptor.create(string_literal35);
            adaptor.addChild(root_0, string_literal35_tree);

            pushFollow(FOLLOW_expr_in_lambda1407);
            e=expr();

            state._fsp--;

            adaptor.addChild(root_0, e.getTree());

                           retval.v = new Lambda(a, (e!=null?e.v:null));
                       

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "lambda"

    public static class let_return extends ParserRuleReturnScope {
        public Let v;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "let"
    // src/tr/fn/grammar/Puf.g:174:1: let returns [Let v] : 'let' (d= ldecl )+ 'in' e= expr ;
    public final PufParser.let_return let() throws RecognitionException {
        PufParser.let_return retval = new PufParser.let_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal36=null;
        Token string_literal37=null;
        PufParser.ldecl_return d = null;

        PufParser.expr_return e = null;


        Object string_literal36_tree=null;
        Object string_literal37_tree=null;

         List<Declaration> l = new ArrayList<Declaration>(); 
        try {
            // src/tr/fn/grammar/Puf.g:176:12: ( 'let' (d= ldecl )+ 'in' e= expr )
            // src/tr/fn/grammar/Puf.g:176:14: 'let' (d= ldecl )+ 'in' e= expr
            {
            root_0 = (Object)adaptor.nil();

            string_literal36=(Token)match(input,43,FOLLOW_43_in_let1455); 
            string_literal36_tree = (Object)adaptor.create(string_literal36);
            adaptor.addChild(root_0, string_literal36_tree);

            // src/tr/fn/grammar/Puf.g:176:20: (d= ldecl )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // src/tr/fn/grammar/Puf.g:176:21: d= ldecl
            	    {
            	    pushFollow(FOLLOW_ldecl_in_let1462);
            	    d=ldecl();

            	    state._fsp--;

            	    adaptor.addChild(root_0, d.getTree());
            	     l.add((d!=null?d.v:null)); 

            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            string_literal37=(Token)match(input,44,FOLLOW_44_in_let1468); 
            string_literal37_tree = (Object)adaptor.create(string_literal37);
            adaptor.addChild(root_0, string_literal37_tree);

            pushFollow(FOLLOW_expr_in_let1474);
            e=expr();

            state._fsp--;

            adaptor.addChild(root_0, e.getTree());

                           retval.v = new Let(l, (e!=null?e.v:null));
                       

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "let"

    public static class letrec_return extends ParserRuleReturnScope {
        public LetRec v;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "letrec"
    // src/tr/fn/grammar/Puf.g:180:1: letrec returns [LetRec v] : 'letrec' (d= rdecl )+ 'in' e= expr ;
    public final PufParser.letrec_return letrec() throws RecognitionException {
        PufParser.letrec_return retval = new PufParser.letrec_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal38=null;
        Token string_literal39=null;
        PufParser.rdecl_return d = null;

        PufParser.expr_return e = null;


        Object string_literal38_tree=null;
        Object string_literal39_tree=null;

         List<Declaration> l = new ArrayList<Declaration>(); 
        try {
            // src/tr/fn/grammar/Puf.g:182:12: ( 'letrec' (d= rdecl )+ 'in' e= expr )
            // src/tr/fn/grammar/Puf.g:182:14: 'letrec' (d= rdecl )+ 'in' e= expr
            {
            root_0 = (Object)adaptor.nil();

            string_literal38=(Token)match(input,52,FOLLOW_52_in_letrec1519); 
            string_literal38_tree = (Object)adaptor.create(string_literal38);
            adaptor.addChild(root_0, string_literal38_tree);

            // src/tr/fn/grammar/Puf.g:182:23: (d= rdecl )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // src/tr/fn/grammar/Puf.g:182:24: d= rdecl
            	    {
            	    pushFollow(FOLLOW_rdecl_in_letrec1526);
            	    d=rdecl();

            	    state._fsp--;

            	    adaptor.addChild(root_0, d.getTree());
            	     l.add((d!=null?d.v:null)); 

            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

            string_literal39=(Token)match(input,44,FOLLOW_44_in_letrec1532); 
            string_literal39_tree = (Object)adaptor.create(string_literal39);
            adaptor.addChild(root_0, string_literal39_tree);

            pushFollow(FOLLOW_expr_in_letrec1538);
            e=expr();

            state._fsp--;

            adaptor.addChild(root_0, e.getTree());

                           retval.v = new LetRec(l, (e!=null?e.v:null));
                       

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "letrec"

    public static class casee_return extends ParserRuleReturnScope {
        public Case v;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "casee"
    // src/tr/fn/grammar/Puf.g:186:1: casee returns [Case v] : 'case' e= expr 'of' n= nalt ';' c= calt ;
    public final PufParser.casee_return casee() throws RecognitionException {
        PufParser.casee_return retval = new PufParser.casee_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal40=null;
        Token string_literal41=null;
        Token char_literal42=null;
        PufParser.expr_return e = null;

        PufParser.nalt_return n = null;

        PufParser.calt_return c = null;


        Object string_literal40_tree=null;
        Object string_literal41_tree=null;
        Object char_literal42_tree=null;

        try {
            // src/tr/fn/grammar/Puf.g:187:12: ( 'case' e= expr 'of' n= nalt ';' c= calt )
            // src/tr/fn/grammar/Puf.g:187:14: 'case' e= expr 'of' n= nalt ';' c= calt
            {
            root_0 = (Object)adaptor.nil();

            string_literal40=(Token)match(input,53,FOLLOW_53_in_casee1568); 
            string_literal40_tree = (Object)adaptor.create(string_literal40);
            adaptor.addChild(root_0, string_literal40_tree);

            pushFollow(FOLLOW_expr_in_casee1574);
            e=expr();

            state._fsp--;

            adaptor.addChild(root_0, e.getTree());
            string_literal41=(Token)match(input,54,FOLLOW_54_in_casee1576); 
            string_literal41_tree = (Object)adaptor.create(string_literal41);
            adaptor.addChild(root_0, string_literal41_tree);

            pushFollow(FOLLOW_nalt_in_casee1582);
            n=nalt();

            state._fsp--;

            adaptor.addChild(root_0, n.getTree());
            char_literal42=(Token)match(input,39,FOLLOW_39_in_casee1584); 
            char_literal42_tree = (Object)adaptor.create(char_literal42);
            adaptor.addChild(root_0, char_literal42_tree);

            pushFollow(FOLLOW_calt_in_casee1590);
            c=calt();

            state._fsp--;

            adaptor.addChild(root_0, c.getTree());

                           retval.v = new Case((e!=null?e.v:null), (n!=null?n.v:null), (c!=null?c.v:null));
                       

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "casee"

    public static class nalt_return extends ParserRuleReturnScope {
        public Nalt v;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nalt"
    // src/tr/fn/grammar/Puf.g:191:1: nalt returns [Nalt v] : '[]' '->' e= expr ;
    public final PufParser.nalt_return nalt() throws RecognitionException {
        PufParser.nalt_return retval = new PufParser.nalt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal43=null;
        Token string_literal44=null;
        PufParser.expr_return e = null;


        Object string_literal43_tree=null;
        Object string_literal44_tree=null;

        try {
            // src/tr/fn/grammar/Puf.g:192:12: ( '[]' '->' e= expr )
            // src/tr/fn/grammar/Puf.g:192:14: '[]' '->' e= expr
            {
            root_0 = (Object)adaptor.nil();

            string_literal43=(Token)match(input,55,FOLLOW_55_in_nalt1621); 
            string_literal43_tree = (Object)adaptor.create(string_literal43);
            adaptor.addChild(root_0, string_literal43_tree);

            string_literal44=(Token)match(input,51,FOLLOW_51_in_nalt1623); 
            string_literal44_tree = (Object)adaptor.create(string_literal44);
            adaptor.addChild(root_0, string_literal44_tree);

            pushFollow(FOLLOW_expr_in_nalt1629);
            e=expr();

            state._fsp--;

            adaptor.addChild(root_0, e.getTree());

                           retval.v = new Nalt((e!=null?e.v:null));
                       

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "nalt"

    public static class calt_return extends ParserRuleReturnScope {
        public Calt v;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "calt"
    // src/tr/fn/grammar/Puf.g:196:1: calt returns [Calt v] : i1= id ':' i2= id '->' e= expr ;
    public final PufParser.calt_return calt() throws RecognitionException {
        PufParser.calt_return retval = new PufParser.calt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal45=null;
        Token string_literal46=null;
        PufParser.id_return i1 = null;

        PufParser.id_return i2 = null;

        PufParser.expr_return e = null;


        Object char_literal45_tree=null;
        Object string_literal46_tree=null;

        try {
            // src/tr/fn/grammar/Puf.g:197:12: (i1= id ':' i2= id '->' e= expr )
            // src/tr/fn/grammar/Puf.g:197:14: i1= id ':' i2= id '->' e= expr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_id_in_calt1664);
            i1=id();

            state._fsp--;

            adaptor.addChild(root_0, i1.getTree());
            char_literal45=(Token)match(input,CONS,FOLLOW_CONS_in_calt1666); 
            char_literal45_tree = (Object)adaptor.create(char_literal45);
            adaptor.addChild(root_0, char_literal45_tree);

            pushFollow(FOLLOW_id_in_calt1672);
            i2=id();

            state._fsp--;

            adaptor.addChild(root_0, i2.getTree());
            string_literal46=(Token)match(input,51,FOLLOW_51_in_calt1674); 
            string_literal46_tree = (Object)adaptor.create(string_literal46);
            adaptor.addChild(root_0, string_literal46_tree);

            pushFollow(FOLLOW_expr_in_calt1680);
            e=expr();

            state._fsp--;

            adaptor.addChild(root_0, e.getTree());

                           retval.v = new Calt((i1!=null?i1.v:null), (i2!=null?i2.v:null), (e!=null?e.v:null));
                       

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "calt"

    public static class integer_return extends ParserRuleReturnScope {
        public tr.fn.ast.Number v;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "integer"
    // src/tr/fn/grammar/Puf.g:201:1: integer returns [tr.fn.grammar.ast.Number v] : INT ;
    public final PufParser.integer_return integer() throws RecognitionException {
        PufParser.integer_return retval = new PufParser.integer_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT47=null;

        Object INT47_tree=null;

        try {
            // src/tr/fn/grammar/Puf.g:202:12: ( INT )
            // src/tr/fn/grammar/Puf.g:202:14: INT
            {
            root_0 = (Object)adaptor.nil();

            INT47=(Token)match(input,INT,FOLLOW_INT_in_integer1719); 
            INT47_tree = (Object)adaptor.create(INT47);
            adaptor.addChild(root_0, INT47_tree);


                           retval.v = new tr.fn.ast.Number(Integer.valueOf((INT47!=null?INT47.getText():null)));
                       

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "integer"

    public static class id_return extends ParserRuleReturnScope {
        public Identifier v;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "id"
    // src/tr/fn/grammar/Puf.g:206:1: id returns [Identifier v] : ID ;
    public final PufParser.id_return id() throws RecognitionException {
        PufParser.id_return retval = new PufParser.id_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID48=null;

        Object ID48_tree=null;

        try {
            // src/tr/fn/grammar/Puf.g:207:12: ( ID )
            // src/tr/fn/grammar/Puf.g:207:14: ID
            {
            root_0 = (Object)adaptor.nil();

            ID48=(Token)match(input,ID,FOLLOW_ID_in_id1752); 
            ID48_tree = (Object)adaptor.create(ID48);
            adaptor.addChild(root_0, ID48_tree);


                           retval.v = new Identifier((ID48!=null?ID48.getText():null));
                       

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "id"

    public static class cop_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cop"
    // src/tr/fn/grammar/Puf.g:211:1: cop : ( LESS | GREATER | EQUAL | GREATEREQUAL | LESSEQUAL | NOTEQUAL );
    public final PufParser.cop_return cop() throws RecognitionException {
        PufParser.cop_return retval = new PufParser.cop_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set49=null;

        Object set49_tree=null;

        try {
            // src/tr/fn/grammar/Puf.g:211:14: ( LESS | GREATER | EQUAL | GREATEREQUAL | LESSEQUAL | NOTEQUAL )
            // src/tr/fn/grammar/Puf.g:
            {
            root_0 = (Object)adaptor.nil();

            set49=(Token)input.LT(1);
            if ( (input.LA(1)>=LESS && input.LA(1)<=NOTEQUAL) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set49));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "cop"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA4_eotS =
        "\30\uffff";
    static final String DFA4_eofS =
        "\30\uffff";
    static final String DFA4_minS =
        "\1\22\27\uffff";
    static final String DFA4_maxS =
        "\1\66\27\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\2\7\uffff\11\1\6\uffff";
    static final String DFA4_specialS =
        "\30\uffff}>";
    static final String[] DFA4_transitionS = {
            "\10\1\1\12\1\11\6\1\5\uffff\1\1\1\13\2\1\1\16\1\1\1\15\2\1\1"+
            "\14\1\1\1\20\1\uffff\1\17\1\21\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "()+ loopback of 84:14: (e= oexpr )+";
        }
    }
    static final String DFA5_eotS =
        "\30\uffff";
    static final String DFA5_eofS =
        "\30\uffff";
    static final String DFA5_minS =
        "\1\22\27\uffff";
    static final String DFA5_maxS =
        "\1\66\27\uffff";
    static final String DFA5_acceptS =
        "\1\uffff\1\2\6\uffff\1\1\17\uffff";
    static final String DFA5_specialS =
        "\30\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\10\17\1\5\uffff\14\1\1\uffff\3\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "()* loopback of 96:41: ( OR e= aexpr )*";
        }
    }
    static final String DFA6_eotS =
        "\30\uffff";
    static final String DFA6_eofS =
        "\30\uffff";
    static final String DFA6_minS =
        "\1\22\27\uffff";
    static final String DFA6_maxS =
        "\1\66\27\uffff";
    static final String DFA6_acceptS =
        "\1\uffff\1\2\6\uffff\1\1\17\uffff";
    static final String DFA6_specialS =
        "\30\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\1\1\10\16\1\5\uffff\14\1\1\uffff\3\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "()* loopback of 102:41: ( AND e= cexpr )*";
        }
    }
    static final String DFA7_eotS =
        "\30\uffff";
    static final String DFA7_eofS =
        "\30\uffff";
    static final String DFA7_minS =
        "\1\22\27\uffff";
    static final String DFA7_maxS =
        "\1\66\27\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\1\1\2\25\uffff";
    static final String DFA7_specialS =
        "\30\uffff}>";
    static final String[] DFA7_transitionS = {
            "\12\2\6\1\5\uffff\14\2\1\uffff\3\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "108:41: (c= cop e= lexpr )?";
        }
    }
    static final String DFA8_eotS =
        "\30\uffff";
    static final String DFA8_eofS =
        "\30\uffff";
    static final String DFA8_minS =
        "\1\22\27\uffff";
    static final String DFA8_maxS =
        "\1\66\27\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\2\6\uffff\1\1\17\uffff";
    static final String DFA8_specialS =
        "\30\uffff}>";
    static final String[] DFA8_transitionS = {
            "\2\1\1\10\15\1\5\uffff\14\1\1\uffff\3\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "()* loopback of 114:41: ( CONS e= pexpr )*";
        }
    }
    static final String DFA9_eotS =
        "\30\uffff";
    static final String DFA9_eofS =
        "\30\uffff";
    static final String DFA9_minS =
        "\1\22\27\uffff";
    static final String DFA9_maxS =
        "\1\66\27\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\2\6\uffff\1\1\17\uffff";
    static final String DFA9_specialS =
        "\30\uffff}>";
    static final String[] DFA9_transitionS = {
            "\3\1\2\10\13\1\5\uffff\14\1\1\uffff\3\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "()* loopback of 120:41: (o= ( PLUS | MINUS ) e= mexpr )*";
        }
    }
    static final String DFA10_eotS =
        "\30\uffff";
    static final String DFA10_eofS =
        "\30\uffff";
    static final String DFA10_minS =
        "\1\22\27\uffff";
    static final String DFA10_maxS =
        "\1\66\27\uffff";
    static final String DFA10_acceptS =
        "\1\uffff\1\2\6\uffff\1\1\17\uffff";
    static final String DFA10_specialS =
        "\30\uffff}>";
    static final String[] DFA10_transitionS = {
            "\5\1\3\10\10\1\5\uffff\14\1\1\uffff\3\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "()* loopback of 126:41: (o= ( STAR | SLASH | PERCENT ) e= fexpr )*";
        }
    }
    static final String DFA11_eotS =
        "\14\uffff";
    static final String DFA11_eofS =
        "\14\uffff";
    static final String DFA11_minS =
        "\1\32\5\uffff\1\33\5\uffff";
    static final String DFA11_maxS =
        "\1\65\5\uffff\1\50\5\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\7\1\10\1\11\1\12\1\6";
    static final String DFA11_specialS =
        "\14\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\2\1\1\14\uffff\1\3\2\uffff\1\6\1\uffff\1\5\2\uffff\1\4\1"+
            "\uffff\1\10\1\uffff\1\7\1\11",
            "",
            "",
            "",
            "",
            "",
            "\1\13\14\uffff\1\12",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "130:1: fexpr returns [Expression v] : ( id | integer | tuple | list | iexpr | let | letrec | lambda | casee | tlet );";
        }
    }
 

    public static final BitSet FOLLOW_rdecl_in_program171 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_EOF_in_program177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_rdecl227 = new BitSet(new long[]{0x0000004008000000L});
    public static final BitSet FOLLOW_id_in_rdecl234 = new BitSet(new long[]{0x0000004008000000L});
    public static final BitSet FOLLOW_38_in_rdecl240 = new BitSet(new long[]{0x003529000C000000L});
    public static final BitSet FOLLOW_expr_in_rdecl246 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_rdecl248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rdecl_in_ldecl278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_tlhs339 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_id_in_tlhs345 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_41_in_tlhs350 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_id_in_tlhs356 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_42_in_tlhs362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oexpr_in_expr414 = new BitSet(new long[]{0x003529000C000002L});
    public static final BitSet FOLLOW_aexpr_in_oexpr468 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_OR_in_oexpr473 = new BitSet(new long[]{0x003529000C000000L});
    public static final BitSet FOLLOW_aexpr_in_oexpr479 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_cexpr_in_aexpr534 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_AND_in_aexpr539 = new BitSet(new long[]{0x003529000C000000L});
    public static final BitSet FOLLOW_cexpr_in_aexpr545 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_lexpr_in_cexpr600 = new BitSet(new long[]{0x00000003F0000002L});
    public static final BitSet FOLLOW_cop_in_cexpr609 = new BitSet(new long[]{0x003529000C000000L});
    public static final BitSet FOLLOW_lexpr_in_cexpr615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pexpr_in_lexpr670 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_CONS_in_lexpr675 = new BitSet(new long[]{0x003529000C000000L});
    public static final BitSet FOLLOW_pexpr_in_lexpr681 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_mexpr_in_pexpr736 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_set_in_pexpr745 = new BitSet(new long[]{0x003529000C000000L});
    public static final BitSet FOLLOW_mexpr_in_pexpr757 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_fexpr_in_mexpr812 = new BitSet(new long[]{0x0000000003800002L});
    public static final BitSet FOLLOW_set_in_mexpr821 = new BitSet(new long[]{0x003529000C000000L});
    public static final BitSet FOLLOW_fexpr_in_mexpr837 = new BitSet(new long[]{0x0000000003800002L});
    public static final BitSet FOLLOW_id_in_fexpr872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_in_fexpr896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tuple_in_fexpr915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_in_fexpr936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iexpr_in_fexpr958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_let_in_fexpr979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_letrec_in_fexpr1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_in_fexpr1022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_casee_in_fexpr1042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tlet_in_fexpr1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_tlet1110 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_tlhs_in_tlet1112 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_tlet1114 = new BitSet(new long[]{0x003529000C000000L});
    public static final BitSet FOLLOW_expr_in_tlet1120 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_tlet1122 = new BitSet(new long[]{0x003529000C000000L});
    public static final BitSet FOLLOW_expr_in_tlet1128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_iexpr1169 = new BitSet(new long[]{0x003529000C000000L});
    public static final BitSet FOLLOW_expr_in_iexpr1175 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_iexpr1177 = new BitSet(new long[]{0x003529000C000000L});
    public static final BitSet FOLLOW_expr_in_iexpr1183 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_iexpr1185 = new BitSet(new long[]{0x003529000C000000L});
    public static final BitSet FOLLOW_expr_in_iexpr1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_tuple1248 = new BitSet(new long[]{0x003529000C000000L});
    public static final BitSet FOLLOW_expr_in_tuple1254 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_41_in_tuple1259 = new BitSet(new long[]{0x003529000C000000L});
    public static final BitSet FOLLOW_expr_in_tuple1265 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_42_in_tuple1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_list1319 = new BitSet(new long[]{0x003529000C000000L});
    public static final BitSet FOLLOW_expr_in_list1325 = new BitSet(new long[]{0x0002020000000000L});
    public static final BitSet FOLLOW_41_in_list1330 = new BitSet(new long[]{0x003529000C000000L});
    public static final BitSet FOLLOW_expr_in_list1336 = new BitSet(new long[]{0x0002020000000000L});
    public static final BitSet FOLLOW_49_in_list1343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_lambda1388 = new BitSet(new long[]{0x0008000008000000L});
    public static final BitSet FOLLOW_id_in_lambda1395 = new BitSet(new long[]{0x0008000008000000L});
    public static final BitSet FOLLOW_51_in_lambda1401 = new BitSet(new long[]{0x003529000C000000L});
    public static final BitSet FOLLOW_expr_in_lambda1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_let1455 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ldecl_in_let1462 = new BitSet(new long[]{0x0000100008000000L});
    public static final BitSet FOLLOW_44_in_let1468 = new BitSet(new long[]{0x003529000C000000L});
    public static final BitSet FOLLOW_expr_in_let1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_letrec1519 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rdecl_in_letrec1526 = new BitSet(new long[]{0x0000100008000000L});
    public static final BitSet FOLLOW_44_in_letrec1532 = new BitSet(new long[]{0x003529000C000000L});
    public static final BitSet FOLLOW_expr_in_letrec1538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_casee1568 = new BitSet(new long[]{0x003529000C000000L});
    public static final BitSet FOLLOW_expr_in_casee1574 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_casee1576 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_nalt_in_casee1582 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_casee1584 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_calt_in_casee1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_nalt1621 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_nalt1623 = new BitSet(new long[]{0x003529000C000000L});
    public static final BitSet FOLLOW_expr_in_nalt1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_calt1664 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_CONS_in_calt1666 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_id_in_calt1672 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_calt1674 = new BitSet(new long[]{0x003529000C000000L});
    public static final BitSet FOLLOW_expr_in_calt1680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_integer1719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_id1752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_cop0 = new BitSet(new long[]{0x0000000000000002L});

}