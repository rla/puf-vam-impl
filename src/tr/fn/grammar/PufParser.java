// $ANTLR 3.1.1 src/tr/fn/grammar/Puf.g 2008-12-18 18:03:16

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


                           if ((e!=null?e.v:null) instanceof Simple && a.isEmpty()) {
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
    // src/tr/fn/grammar/Puf.g:94:1: oexpr returns [Expression v] : e= aexpr ( OR e1= aexpr )* ;
    public final PufParser.oexpr_return oexpr() throws RecognitionException {
        PufParser.oexpr_return retval = new PufParser.oexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR8=null;
        PufParser.aexpr_return e = null;

        PufParser.aexpr_return e1 = null;


        Object OR8_tree=null;

         List<Expression> l = new ArrayList<Expression>(); 
        try {
            // src/tr/fn/grammar/Puf.g:96:12: (e= aexpr ( OR e1= aexpr )* )
            // src/tr/fn/grammar/Puf.g:96:14: e= aexpr ( OR e1= aexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_aexpr_in_oexpr468);
            e=aexpr();

            state._fsp--;

            adaptor.addChild(root_0, e.getTree());
             l.add((e!=null?e.v:null)); 
            // src/tr/fn/grammar/Puf.g:96:41: ( OR e1= aexpr )*
            loop5:
            do {
                int alt5=2;
                alt5 = dfa5.predict(input);
                switch (alt5) {
            	case 1 :
            	    // src/tr/fn/grammar/Puf.g:96:42: OR e1= aexpr
            	    {
            	    OR8=(Token)match(input,OR,FOLLOW_OR_in_oexpr473); 
            	    OR8_tree = (Object)adaptor.create(OR8);
            	    adaptor.addChild(root_0, OR8_tree);

            	    pushFollow(FOLLOW_aexpr_in_oexpr479);
            	    e1=aexpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, e1.getTree());
            	     l.add((e1!=null?e1.v:null)); 

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
    // src/tr/fn/grammar/Puf.g:100:1: aexpr returns [Expression v] : e= cexpr ( AND e1= cexpr )* ;
    public final PufParser.aexpr_return aexpr() throws RecognitionException {
        PufParser.aexpr_return retval = new PufParser.aexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AND9=null;
        PufParser.cexpr_return e = null;

        PufParser.cexpr_return e1 = null;


        Object AND9_tree=null;

         List<Expression> l = new ArrayList<Expression>(); 
        try {
            // src/tr/fn/grammar/Puf.g:102:12: (e= cexpr ( AND e1= cexpr )* )
            // src/tr/fn/grammar/Puf.g:102:14: e= cexpr ( AND e1= cexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_cexpr_in_aexpr534);
            e=cexpr();

            state._fsp--;

            adaptor.addChild(root_0, e.getTree());
             l.add((e!=null?e.v:null)); 
            // src/tr/fn/grammar/Puf.g:102:41: ( AND e1= cexpr )*
            loop6:
            do {
                int alt6=2;
                alt6 = dfa6.predict(input);
                switch (alt6) {
            	case 1 :
            	    // src/tr/fn/grammar/Puf.g:102:42: AND e1= cexpr
            	    {
            	    AND9=(Token)match(input,AND,FOLLOW_AND_in_aexpr539); 
            	    AND9_tree = (Object)adaptor.create(AND9);
            	    adaptor.addChild(root_0, AND9_tree);

            	    pushFollow(FOLLOW_cexpr_in_aexpr545);
            	    e1=cexpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, e1.getTree());
            	     l.add((e1!=null?e1.v:null)); 

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
    // src/tr/fn/grammar/Puf.g:106:1: cexpr returns [Expression v] : e= lexpr (c= cop e1= lexpr )? ;
    public final PufParser.cexpr_return cexpr() throws RecognitionException {
        PufParser.cexpr_return retval = new PufParser.cexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PufParser.lexpr_return e = null;

        PufParser.cop_return c = null;

        PufParser.lexpr_return e1 = null;



         List<Expression> l = new ArrayList<Expression>(); 
        try {
            // src/tr/fn/grammar/Puf.g:108:12: (e= lexpr (c= cop e1= lexpr )? )
            // src/tr/fn/grammar/Puf.g:108:14: e= lexpr (c= cop e1= lexpr )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_lexpr_in_cexpr600);
            e=lexpr();

            state._fsp--;

            adaptor.addChild(root_0, e.getTree());
             l.add((e!=null?e.v:null)); 
            // src/tr/fn/grammar/Puf.g:108:41: (c= cop e1= lexpr )?
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // src/tr/fn/grammar/Puf.g:108:42: c= cop e1= lexpr
                    {
                    pushFollow(FOLLOW_cop_in_cexpr609);
                    c=cop();

                    state._fsp--;

                    adaptor.addChild(root_0, c.getTree());
                    pushFollow(FOLLOW_lexpr_in_cexpr615);
                    e1=lexpr();

                    state._fsp--;

                    adaptor.addChild(root_0, e1.getTree());
                     l.add((e1!=null?e1.v:null)); 

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
    // src/tr/fn/grammar/Puf.g:112:1: lexpr returns [Expression v] : e= pexpr ( CONS e1= pexpr )* ;
    public final PufParser.lexpr_return lexpr() throws RecognitionException {
        PufParser.lexpr_return retval = new PufParser.lexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CONS10=null;
        PufParser.pexpr_return e = null;

        PufParser.pexpr_return e1 = null;


        Object CONS10_tree=null;

         List<Expression> l = new ArrayList<Expression>(); 
        try {
            // src/tr/fn/grammar/Puf.g:114:12: (e= pexpr ( CONS e1= pexpr )* )
            // src/tr/fn/grammar/Puf.g:114:14: e= pexpr ( CONS e1= pexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_pexpr_in_lexpr670);
            e=pexpr();

            state._fsp--;

            adaptor.addChild(root_0, e.getTree());
             l.add((e!=null?e.v:null)); 
            // src/tr/fn/grammar/Puf.g:114:41: ( CONS e1= pexpr )*
            loop8:
            do {
                int alt8=2;
                alt8 = dfa8.predict(input);
                switch (alt8) {
            	case 1 :
            	    // src/tr/fn/grammar/Puf.g:114:42: CONS e1= pexpr
            	    {
            	    CONS10=(Token)match(input,CONS,FOLLOW_CONS_in_lexpr675); 
            	    CONS10_tree = (Object)adaptor.create(CONS10);
            	    adaptor.addChild(root_0, CONS10_tree);

            	    pushFollow(FOLLOW_pexpr_in_lexpr681);
            	    e1=pexpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, e1.getTree());
            	     l.add((e1!=null?e1.v:null)); 

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
    // src/tr/fn/grammar/Puf.g:118:1: pexpr returns [Expression v] : e= mexpr (o= ( PLUS | MINUS ) e1= mexpr )* ;
    public final PufParser.pexpr_return pexpr() throws RecognitionException {
        PufParser.pexpr_return retval = new PufParser.pexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token o=null;
        PufParser.mexpr_return e = null;

        PufParser.mexpr_return e1 = null;


        Object o_tree=null;

         List<Expression> l = new ArrayList<Expression>(); 
        try {
            // src/tr/fn/grammar/Puf.g:120:12: (e= mexpr (o= ( PLUS | MINUS ) e1= mexpr )* )
            // src/tr/fn/grammar/Puf.g:120:14: e= mexpr (o= ( PLUS | MINUS ) e1= mexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_mexpr_in_pexpr736);
            e=mexpr();

            state._fsp--;

            adaptor.addChild(root_0, e.getTree());
             l.add((e!=null?e.v:null)); 
            // src/tr/fn/grammar/Puf.g:120:41: (o= ( PLUS | MINUS ) e1= mexpr )*
            loop9:
            do {
                int alt9=2;
                alt9 = dfa9.predict(input);
                switch (alt9) {
            	case 1 :
            	    // src/tr/fn/grammar/Puf.g:120:42: o= ( PLUS | MINUS ) e1= mexpr
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
            	    e1=mexpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, e1.getTree());
            	     l.add((e1!=null?e1.v:null)); 

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
    // src/tr/fn/grammar/Puf.g:124:1: mexpr returns [Expression v] : e= fexpr (o= ( STAR | SLASH | PERCENT ) e1= fexpr )* ;
    public final PufParser.mexpr_return mexpr() throws RecognitionException {
        PufParser.mexpr_return retval = new PufParser.mexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token o=null;
        PufParser.fexpr_return e = null;

        PufParser.fexpr_return e1 = null;


        Object o_tree=null;

         List<Expression> l = new ArrayList<Expression>(); 
        try {
            // src/tr/fn/grammar/Puf.g:126:12: (e= fexpr (o= ( STAR | SLASH | PERCENT ) e1= fexpr )* )
            // src/tr/fn/grammar/Puf.g:126:14: e= fexpr (o= ( STAR | SLASH | PERCENT ) e1= fexpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_fexpr_in_mexpr812);
            e=fexpr();

            state._fsp--;

            adaptor.addChild(root_0, e.getTree());
             l.add((e!=null?e.v:null)); 
            // src/tr/fn/grammar/Puf.g:126:41: (o= ( STAR | SLASH | PERCENT ) e1= fexpr )*
            loop10:
            do {
                int alt10=2;
                alt10 = dfa10.predict(input);
                switch (alt10) {
            	case 1 :
            	    // src/tr/fn/grammar/Puf.g:126:42: o= ( STAR | SLASH | PERCENT ) e1= fexpr
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
            	    e1=fexpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, e1.getTree());
            	     l.add((e1!=null?e1.v:null)); 

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
    // src/tr/fn/grammar/Puf.g:130:1: fexpr returns [Expression v] : ( fappl | id | integer | tuple | list | iexpr | let | letrec | lambda | casee | tlet );
    public final PufParser.fexpr_return fexpr() throws RecognitionException {
        PufParser.fexpr_return retval = new PufParser.fexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PufParser.fappl_return fappl11 = null;

        PufParser.id_return id12 = null;

        PufParser.integer_return integer13 = null;

        PufParser.tuple_return tuple14 = null;

        PufParser.list_return list15 = null;

        PufParser.iexpr_return iexpr16 = null;

        PufParser.let_return let17 = null;

        PufParser.letrec_return letrec18 = null;

        PufParser.lambda_return lambda19 = null;

        PufParser.casee_return casee20 = null;

        PufParser.tlet_return tlet21 = null;



        try {
            // src/tr/fn/grammar/Puf.g:131:12: ( fappl | id | integer | tuple | list | iexpr | let | letrec | lambda | casee | tlet )
            int alt11=11;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // src/tr/fn/grammar/Puf.g:131:14: fappl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_fappl_in_fexpr872);
                    fappl11=fappl();

                    state._fsp--;

                    adaptor.addChild(root_0, fappl11.getTree());
                     retval.v = (fappl11!=null?fappl11.v:null); 

                    }
                    break;
                case 2 :
                    // src/tr/fn/grammar/Puf.g:132:14: id
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_id_in_fexpr893);
                    id12=id();

                    state._fsp--;

                    adaptor.addChild(root_0, id12.getTree());
                     retval.v = (id12!=null?id12.v:null); 

                    }
                    break;
                case 3 :
                    // src/tr/fn/grammar/Puf.g:133:14: integer
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_integer_in_fexpr917);
                    integer13=integer();

                    state._fsp--;

                    adaptor.addChild(root_0, integer13.getTree());
                     retval.v = (integer13!=null?integer13.v:null); 

                    }
                    break;
                case 4 :
                    // src/tr/fn/grammar/Puf.g:134:14: tuple
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_tuple_in_fexpr936);
                    tuple14=tuple();

                    state._fsp--;

                    adaptor.addChild(root_0, tuple14.getTree());
                     retval.v = (tuple14!=null?tuple14.v:null); 

                    }
                    break;
                case 5 :
                    // src/tr/fn/grammar/Puf.g:135:14: list
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_list_in_fexpr957);
                    list15=list();

                    state._fsp--;

                    adaptor.addChild(root_0, list15.getTree());
                     retval.v = (list15!=null?list15.v:null); 

                    }
                    break;
                case 6 :
                    // src/tr/fn/grammar/Puf.g:136:14: iexpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_iexpr_in_fexpr979);
                    iexpr16=iexpr();

                    state._fsp--;

                    adaptor.addChild(root_0, iexpr16.getTree());
                     retval.v = (iexpr16!=null?iexpr16.v:null); 

                    }
                    break;
                case 7 :
                    // src/tr/fn/grammar/Puf.g:137:14: let
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_let_in_fexpr1000);
                    let17=let();

                    state._fsp--;

                    adaptor.addChild(root_0, let17.getTree());
                     retval.v = (let17!=null?let17.v:null); 

                    }
                    break;
                case 8 :
                    // src/tr/fn/grammar/Puf.g:138:14: letrec
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_letrec_in_fexpr1023);
                    letrec18=letrec();

                    state._fsp--;

                    adaptor.addChild(root_0, letrec18.getTree());
                     retval.v = (letrec18!=null?letrec18.v:null); 

                    }
                    break;
                case 9 :
                    // src/tr/fn/grammar/Puf.g:139:14: lambda
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_lambda_in_fexpr1043);
                    lambda19=lambda();

                    state._fsp--;

                    adaptor.addChild(root_0, lambda19.getTree());
                     retval.v = (lambda19!=null?lambda19.v:null); 

                    }
                    break;
                case 10 :
                    // src/tr/fn/grammar/Puf.g:140:14: casee
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_casee_in_fexpr1063);
                    casee20=casee();

                    state._fsp--;

                    adaptor.addChild(root_0, casee20.getTree());
                     retval.v = (casee20!=null?casee20.v:null); 

                    }
                    break;
                case 11 :
                    // src/tr/fn/grammar/Puf.g:141:14: tlet
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_tlet_in_fexpr1084);
                    tlet21=tlet();

                    state._fsp--;

                    adaptor.addChild(root_0, tlet21.getTree());
                     retval.v = (tlet21!=null?tlet21.v:null); 

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

    public static class fappl_return extends ParserRuleReturnScope {
        public Expression v;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fappl"
    // src/tr/fn/grammar/Puf.g:143:1: fappl returns [Expression v] : id ( fargm | fsarg ) ;
    public final PufParser.fappl_return fappl() throws RecognitionException {
        PufParser.fappl_return retval = new PufParser.fappl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PufParser.id_return id22 = null;

        PufParser.fargm_return fargm23 = null;

        PufParser.fsarg_return fsarg24 = null;



        try {
            // src/tr/fn/grammar/Puf.g:144:12: ( id ( fargm | fsarg ) )
            // src/tr/fn/grammar/Puf.g:144:14: id ( fargm | fsarg )
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_id_in_fappl1130);
            id22=id();

            state._fsp--;

            adaptor.addChild(root_0, id22.getTree());
            // src/tr/fn/grammar/Puf.g:144:17: ( fargm | fsarg )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=INT && LA12_0<=ID)||LA12_0==40||LA12_0==48) ) {
                alt12=1;
            }
            else if ( (LA12_0==43||LA12_0==50||(LA12_0>=52 && LA12_0<=53)) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // src/tr/fn/grammar/Puf.g:144:18: fargm
                    {
                    pushFollow(FOLLOW_fargm_in_fappl1133);
                    fargm23=fargm();

                    state._fsp--;

                    adaptor.addChild(root_0, fargm23.getTree());
                     retval.v = new Application((id22!=null?id22.v:null), (fargm23!=null?fargm23.v:null)); 

                    }
                    break;
                case 2 :
                    // src/tr/fn/grammar/Puf.g:144:69: fsarg
                    {
                    pushFollow(FOLLOW_fsarg_in_fappl1139);
                    fsarg24=fsarg();

                    state._fsp--;

                    adaptor.addChild(root_0, fsarg24.getTree());
                     retval.v = new Application((id22!=null?id22.v:null), (fsarg24!=null?fsarg24.v:null)); 

                    }
                    break;

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
    // $ANTLR end "fappl"

    public static class fargm_return extends ParserRuleReturnScope {
        public List<Expression> v;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fargm"
    // src/tr/fn/grammar/Puf.g:146:1: fargm returns [List<Expression> v] : (e= fmarg )+ ;
    public final PufParser.fargm_return fargm() throws RecognitionException {
        PufParser.fargm_return retval = new PufParser.fargm_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PufParser.fmarg_return e = null;



         List<Expression> l = new ArrayList<Expression>(); 
        try {
            // src/tr/fn/grammar/Puf.g:148:12: ( (e= fmarg )+ )
            // src/tr/fn/grammar/Puf.g:148:14: (e= fmarg )+
            {
            root_0 = (Object)adaptor.nil();

            // src/tr/fn/grammar/Puf.g:148:14: (e= fmarg )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                alt13 = dfa13.predict(input);
                switch (alt13) {
            	case 1 :
            	    // src/tr/fn/grammar/Puf.g:148:15: e= fmarg
            	    {
            	    pushFollow(FOLLOW_fmarg_in_fargm1192);
            	    e=fmarg();

            	    state._fsp--;

            	    adaptor.addChild(root_0, e.getTree());
            	     l.add((e!=null?e.v:null)); 

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


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
    // $ANTLR end "fargm"

    public static class fmarg_return extends ParserRuleReturnScope {
        public Expression v;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fmarg"
    // src/tr/fn/grammar/Puf.g:152:1: fmarg returns [Expression v] : ( tuple | id | integer | list );
    public final PufParser.fmarg_return fmarg() throws RecognitionException {
        PufParser.fmarg_return retval = new PufParser.fmarg_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PufParser.tuple_return tuple25 = null;

        PufParser.id_return id26 = null;

        PufParser.integer_return integer27 = null;

        PufParser.list_return list28 = null;



        try {
            // src/tr/fn/grammar/Puf.g:153:12: ( tuple | id | integer | list )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt14=1;
                }
                break;
            case ID:
                {
                alt14=2;
                }
                break;
            case INT:
                {
                alt14=3;
                }
                break;
            case 48:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // src/tr/fn/grammar/Puf.g:153:14: tuple
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_tuple_in_fmarg1226);
                    tuple25=tuple();

                    state._fsp--;

                    adaptor.addChild(root_0, tuple25.getTree());
                     retval.v = (tuple25!=null?tuple25.v:null); 

                    }
                    break;
                case 2 :
                    // src/tr/fn/grammar/Puf.g:154:14: id
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_id_in_fmarg1245);
                    id26=id();

                    state._fsp--;

                    adaptor.addChild(root_0, id26.getTree());
                     retval.v = (id26!=null?id26.v:null); 

                    }
                    break;
                case 3 :
                    // src/tr/fn/grammar/Puf.g:155:14: integer
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_integer_in_fmarg1267);
                    integer27=integer();

                    state._fsp--;

                    adaptor.addChild(root_0, integer27.getTree());
                     retval.v = (integer27!=null?integer27.v:null); 

                    }
                    break;
                case 4 :
                    // src/tr/fn/grammar/Puf.g:156:14: list
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_list_in_fmarg1284);
                    list28=list();

                    state._fsp--;

                    adaptor.addChild(root_0, list28.getTree());
                     retval.v = (list28!=null?list28.v:null); 

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
    // $ANTLR end "fmarg"

    public static class fsarg_return extends ParserRuleReturnScope {
        public List<Expression> v;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fsarg"
    // src/tr/fn/grammar/Puf.g:158:1: fsarg returns [List<Expression> v] : ( let | letrec | lambda | casee | tlet );
    public final PufParser.fsarg_return fsarg() throws RecognitionException {
        PufParser.fsarg_return retval = new PufParser.fsarg_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        PufParser.let_return let29 = null;

        PufParser.letrec_return letrec30 = null;

        PufParser.lambda_return lambda31 = null;

        PufParser.casee_return casee32 = null;

        PufParser.tlet_return tlet33 = null;



        try {
            // src/tr/fn/grammar/Puf.g:159:12: ( let | letrec | lambda | casee | tlet )
            int alt15=5;
            switch ( input.LA(1) ) {
            case 43:
                {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==ID) ) {
                    alt15=1;
                }
                else if ( (LA15_1==40) ) {
                    alt15=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
                }
                break;
            case 52:
                {
                alt15=2;
                }
                break;
            case 50:
                {
                alt15=3;
                }
                break;
            case 53:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // src/tr/fn/grammar/Puf.g:159:14: let
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_let_in_fsarg1317);
                    let29=let();

                    state._fsp--;

                    adaptor.addChild(root_0, let29.getTree());
                     retval.v = Collections.singletonList((Expression) (let29!=null?let29.v:null)); 

                    }
                    break;
                case 2 :
                    // src/tr/fn/grammar/Puf.g:160:14: letrec
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_letrec_in_fsarg1338);
                    letrec30=letrec();

                    state._fsp--;

                    adaptor.addChild(root_0, letrec30.getTree());
                     retval.v = Collections.singletonList((Expression) (letrec30!=null?letrec30.v:null)); 

                    }
                    break;
                case 3 :
                    // src/tr/fn/grammar/Puf.g:161:14: lambda
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_lambda_in_fsarg1356);
                    lambda31=lambda();

                    state._fsp--;

                    adaptor.addChild(root_0, lambda31.getTree());
                     retval.v = Collections.singletonList((Expression) (lambda31!=null?lambda31.v:null)); 

                    }
                    break;
                case 4 :
                    // src/tr/fn/grammar/Puf.g:162:14: casee
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_casee_in_fsarg1374);
                    casee32=casee();

                    state._fsp--;

                    adaptor.addChild(root_0, casee32.getTree());
                     retval.v = Collections.singletonList((Expression) (casee32!=null?casee32.v:null)); 

                    }
                    break;
                case 5 :
                    // src/tr/fn/grammar/Puf.g:163:14: tlet
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_tlet_in_fsarg1393);
                    tlet33=tlet();

                    state._fsp--;

                    adaptor.addChild(root_0, tlet33.getTree());
                     retval.v = Collections.singletonList((Expression) (tlet33!=null?tlet33.v:null)); 

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
    // $ANTLR end "fsarg"

    public static class tlet_return extends ParserRuleReturnScope {
        public Expression v;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "tlet"
    // src/tr/fn/grammar/Puf.g:165:1: tlet returns [Expression v] : 'let' tlhs '=' e1= expr 'in' e2= expr ;
    public final PufParser.tlet_return tlet() throws RecognitionException {
        PufParser.tlet_return retval = new PufParser.tlet_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal34=null;
        Token char_literal36=null;
        Token string_literal37=null;
        PufParser.expr_return e1 = null;

        PufParser.expr_return e2 = null;

        PufParser.tlhs_return tlhs35 = null;


        Object string_literal34_tree=null;
        Object char_literal36_tree=null;
        Object string_literal37_tree=null;

        try {
            // src/tr/fn/grammar/Puf.g:166:12: ( 'let' tlhs '=' e1= expr 'in' e2= expr )
            // src/tr/fn/grammar/Puf.g:166:14: 'let' tlhs '=' e1= expr 'in' e2= expr
            {
            root_0 = (Object)adaptor.nil();

            string_literal34=(Token)match(input,43,FOLLOW_43_in_tlet1438); 
            string_literal34_tree = (Object)adaptor.create(string_literal34);
            adaptor.addChild(root_0, string_literal34_tree);

            pushFollow(FOLLOW_tlhs_in_tlet1440);
            tlhs35=tlhs();

            state._fsp--;

            adaptor.addChild(root_0, tlhs35.getTree());
            char_literal36=(Token)match(input,38,FOLLOW_38_in_tlet1442); 
            char_literal36_tree = (Object)adaptor.create(char_literal36);
            adaptor.addChild(root_0, char_literal36_tree);

            pushFollow(FOLLOW_expr_in_tlet1448);
            e1=expr();

            state._fsp--;

            adaptor.addChild(root_0, e1.getTree());
            string_literal37=(Token)match(input,44,FOLLOW_44_in_tlet1450); 
            string_literal37_tree = (Object)adaptor.create(string_literal37);
            adaptor.addChild(root_0, string_literal37_tree);

            pushFollow(FOLLOW_expr_in_tlet1456);
            e2=expr();

            state._fsp--;

            adaptor.addChild(root_0, e2.getTree());

                           retval.v = new TupleLet((tlhs35!=null?tlhs35.v:null), (e1!=null?e1.v:null), (e2!=null?e2.v:null));
                       

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
    // src/tr/fn/grammar/Puf.g:170:1: iexpr returns [Expression v] : 'if' c= expr 'then' t= expr 'else' e= expr ;
    public final PufParser.iexpr_return iexpr() throws RecognitionException {
        PufParser.iexpr_return retval = new PufParser.iexpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal38=null;
        Token string_literal39=null;
        Token string_literal40=null;
        PufParser.expr_return c = null;

        PufParser.expr_return t = null;

        PufParser.expr_return e = null;


        Object string_literal38_tree=null;
        Object string_literal39_tree=null;
        Object string_literal40_tree=null;

        try {
            // src/tr/fn/grammar/Puf.g:171:12: ( 'if' c= expr 'then' t= expr 'else' e= expr )
            // src/tr/fn/grammar/Puf.g:171:14: 'if' c= expr 'then' t= expr 'else' e= expr
            {
            root_0 = (Object)adaptor.nil();

            string_literal38=(Token)match(input,45,FOLLOW_45_in_iexpr1497); 
            string_literal38_tree = (Object)adaptor.create(string_literal38);
            adaptor.addChild(root_0, string_literal38_tree);

            pushFollow(FOLLOW_expr_in_iexpr1503);
            c=expr();

            state._fsp--;

            adaptor.addChild(root_0, c.getTree());
            string_literal39=(Token)match(input,46,FOLLOW_46_in_iexpr1505); 
            string_literal39_tree = (Object)adaptor.create(string_literal39);
            adaptor.addChild(root_0, string_literal39_tree);

            pushFollow(FOLLOW_expr_in_iexpr1511);
            t=expr();

            state._fsp--;

            adaptor.addChild(root_0, t.getTree());
            string_literal40=(Token)match(input,47,FOLLOW_47_in_iexpr1513); 
            string_literal40_tree = (Object)adaptor.create(string_literal40);
            adaptor.addChild(root_0, string_literal40_tree);

            pushFollow(FOLLOW_expr_in_iexpr1519);
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
    // src/tr/fn/grammar/Puf.g:175:1: tuple returns [Expression v] : '(' e= expr ( ',' e= expr )* ')' ;
    public final PufParser.tuple_return tuple() throws RecognitionException {
        PufParser.tuple_return retval = new PufParser.tuple_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal41=null;
        Token char_literal42=null;
        Token char_literal43=null;
        PufParser.expr_return e = null;


        Object char_literal41_tree=null;
        Object char_literal42_tree=null;
        Object char_literal43_tree=null;

         List<Expression> l = new ArrayList<Expression>(); 
        try {
            // src/tr/fn/grammar/Puf.g:177:12: ( '(' e= expr ( ',' e= expr )* ')' )
            // src/tr/fn/grammar/Puf.g:177:14: '(' e= expr ( ',' e= expr )* ')'
            {
            root_0 = (Object)adaptor.nil();

            char_literal41=(Token)match(input,40,FOLLOW_40_in_tuple1576); 
            char_literal41_tree = (Object)adaptor.create(char_literal41);
            adaptor.addChild(root_0, char_literal41_tree);

            pushFollow(FOLLOW_expr_in_tuple1582);
            e=expr();

            state._fsp--;

            adaptor.addChild(root_0, e.getTree());
             l.add((e!=null?e.v:null)); 
            // src/tr/fn/grammar/Puf.g:177:44: ( ',' e= expr )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==41) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // src/tr/fn/grammar/Puf.g:177:45: ',' e= expr
            	    {
            	    char_literal42=(Token)match(input,41,FOLLOW_41_in_tuple1587); 
            	    char_literal42_tree = (Object)adaptor.create(char_literal42);
            	    adaptor.addChild(root_0, char_literal42_tree);

            	    pushFollow(FOLLOW_expr_in_tuple1593);
            	    e=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, e.getTree());
            	     l.add((e!=null?e.v:null)); 

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            char_literal43=(Token)match(input,42,FOLLOW_42_in_tuple1600); 
            char_literal43_tree = (Object)adaptor.create(char_literal43);
            adaptor.addChild(root_0, char_literal43_tree);


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
    // src/tr/fn/grammar/Puf.g:185:1: list returns [Expression v] : '[' e= expr ( ',' e= expr )* ']' ;
    public final PufParser.list_return list() throws RecognitionException {
        PufParser.list_return retval = new PufParser.list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal44=null;
        Token char_literal45=null;
        Token char_literal46=null;
        PufParser.expr_return e = null;


        Object char_literal44_tree=null;
        Object char_literal45_tree=null;
        Object char_literal46_tree=null;

         List<Expression> l = new ArrayList<Expression>(); 
        try {
            // src/tr/fn/grammar/Puf.g:187:12: ( '[' e= expr ( ',' e= expr )* ']' )
            // src/tr/fn/grammar/Puf.g:187:14: '[' e= expr ( ',' e= expr )* ']'
            {
            root_0 = (Object)adaptor.nil();

            char_literal44=(Token)match(input,48,FOLLOW_48_in_list1647); 
            char_literal44_tree = (Object)adaptor.create(char_literal44);
            adaptor.addChild(root_0, char_literal44_tree);

            pushFollow(FOLLOW_expr_in_list1653);
            e=expr();

            state._fsp--;

            adaptor.addChild(root_0, e.getTree());
             l.add((e!=null?e.v:null)); 
            // src/tr/fn/grammar/Puf.g:187:44: ( ',' e= expr )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==41) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // src/tr/fn/grammar/Puf.g:187:45: ',' e= expr
            	    {
            	    char_literal45=(Token)match(input,41,FOLLOW_41_in_list1658); 
            	    char_literal45_tree = (Object)adaptor.create(char_literal45);
            	    adaptor.addChild(root_0, char_literal45_tree);

            	    pushFollow(FOLLOW_expr_in_list1664);
            	    e=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, e.getTree());
            	     l.add((e!=null?e.v:null)); 

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            char_literal46=(Token)match(input,49,FOLLOW_49_in_list1671); 
            char_literal46_tree = (Object)adaptor.create(char_literal46);
            adaptor.addChild(root_0, char_literal46_tree);


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
    // src/tr/fn/grammar/Puf.g:191:1: lambda returns [Expression v] : 'fn' (i= id )* '->' e= expr ;
    public final PufParser.lambda_return lambda() throws RecognitionException {
        PufParser.lambda_return retval = new PufParser.lambda_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal47=null;
        Token string_literal48=null;
        PufParser.id_return i = null;

        PufParser.expr_return e = null;


        Object string_literal47_tree=null;
        Object string_literal48_tree=null;

         List<Identifier> a = new ArrayList<Identifier>(); 
        try {
            // src/tr/fn/grammar/Puf.g:193:12: ( 'fn' (i= id )* '->' e= expr )
            // src/tr/fn/grammar/Puf.g:193:14: 'fn' (i= id )* '->' e= expr
            {
            root_0 = (Object)adaptor.nil();

            string_literal47=(Token)match(input,50,FOLLOW_50_in_lambda1716); 
            string_literal47_tree = (Object)adaptor.create(string_literal47);
            adaptor.addChild(root_0, string_literal47_tree);

            // src/tr/fn/grammar/Puf.g:193:19: (i= id )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // src/tr/fn/grammar/Puf.g:193:20: i= id
            	    {
            	    pushFollow(FOLLOW_id_in_lambda1723);
            	    i=id();

            	    state._fsp--;

            	    adaptor.addChild(root_0, i.getTree());
            	     a.add((i!=null?i.v:null)); 

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            string_literal48=(Token)match(input,51,FOLLOW_51_in_lambda1729); 
            string_literal48_tree = (Object)adaptor.create(string_literal48);
            adaptor.addChild(root_0, string_literal48_tree);

            pushFollow(FOLLOW_expr_in_lambda1735);
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
    // src/tr/fn/grammar/Puf.g:197:1: let returns [Let v] : 'let' (d= ldecl )+ 'in' e= expr ;
    public final PufParser.let_return let() throws RecognitionException {
        PufParser.let_return retval = new PufParser.let_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal49=null;
        Token string_literal50=null;
        PufParser.ldecl_return d = null;

        PufParser.expr_return e = null;


        Object string_literal49_tree=null;
        Object string_literal50_tree=null;

         List<Declaration> l = new ArrayList<Declaration>(); 
        try {
            // src/tr/fn/grammar/Puf.g:199:12: ( 'let' (d= ldecl )+ 'in' e= expr )
            // src/tr/fn/grammar/Puf.g:199:14: 'let' (d= ldecl )+ 'in' e= expr
            {
            root_0 = (Object)adaptor.nil();

            string_literal49=(Token)match(input,43,FOLLOW_43_in_let1783); 
            string_literal49_tree = (Object)adaptor.create(string_literal49);
            adaptor.addChild(root_0, string_literal49_tree);

            // src/tr/fn/grammar/Puf.g:199:20: (d= ldecl )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // src/tr/fn/grammar/Puf.g:199:21: d= ldecl
            	    {
            	    pushFollow(FOLLOW_ldecl_in_let1790);
            	    d=ldecl();

            	    state._fsp--;

            	    adaptor.addChild(root_0, d.getTree());
            	     l.add((d!=null?d.v:null)); 

            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);

            string_literal50=(Token)match(input,44,FOLLOW_44_in_let1796); 
            string_literal50_tree = (Object)adaptor.create(string_literal50);
            adaptor.addChild(root_0, string_literal50_tree);

            pushFollow(FOLLOW_expr_in_let1802);
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
    // src/tr/fn/grammar/Puf.g:203:1: letrec returns [LetRec v] : 'letrec' (d= rdecl )+ 'in' e= expr ;
    public final PufParser.letrec_return letrec() throws RecognitionException {
        PufParser.letrec_return retval = new PufParser.letrec_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal51=null;
        Token string_literal52=null;
        PufParser.rdecl_return d = null;

        PufParser.expr_return e = null;


        Object string_literal51_tree=null;
        Object string_literal52_tree=null;

         List<Declaration> l = new ArrayList<Declaration>(); 
        try {
            // src/tr/fn/grammar/Puf.g:205:12: ( 'letrec' (d= rdecl )+ 'in' e= expr )
            // src/tr/fn/grammar/Puf.g:205:14: 'letrec' (d= rdecl )+ 'in' e= expr
            {
            root_0 = (Object)adaptor.nil();

            string_literal51=(Token)match(input,52,FOLLOW_52_in_letrec1847); 
            string_literal51_tree = (Object)adaptor.create(string_literal51);
            adaptor.addChild(root_0, string_literal51_tree);

            // src/tr/fn/grammar/Puf.g:205:23: (d= rdecl )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // src/tr/fn/grammar/Puf.g:205:24: d= rdecl
            	    {
            	    pushFollow(FOLLOW_rdecl_in_letrec1854);
            	    d=rdecl();

            	    state._fsp--;

            	    adaptor.addChild(root_0, d.getTree());
            	     l.add((d!=null?d.v:null)); 

            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);

            string_literal52=(Token)match(input,44,FOLLOW_44_in_letrec1860); 
            string_literal52_tree = (Object)adaptor.create(string_literal52);
            adaptor.addChild(root_0, string_literal52_tree);

            pushFollow(FOLLOW_expr_in_letrec1866);
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
    // src/tr/fn/grammar/Puf.g:209:1: casee returns [Case v] : 'case' e= expr 'of' n= nalt ';' c= calt ;
    public final PufParser.casee_return casee() throws RecognitionException {
        PufParser.casee_return retval = new PufParser.casee_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal53=null;
        Token string_literal54=null;
        Token char_literal55=null;
        PufParser.expr_return e = null;

        PufParser.nalt_return n = null;

        PufParser.calt_return c = null;


        Object string_literal53_tree=null;
        Object string_literal54_tree=null;
        Object char_literal55_tree=null;

        try {
            // src/tr/fn/grammar/Puf.g:210:12: ( 'case' e= expr 'of' n= nalt ';' c= calt )
            // src/tr/fn/grammar/Puf.g:210:14: 'case' e= expr 'of' n= nalt ';' c= calt
            {
            root_0 = (Object)adaptor.nil();

            string_literal53=(Token)match(input,53,FOLLOW_53_in_casee1896); 
            string_literal53_tree = (Object)adaptor.create(string_literal53);
            adaptor.addChild(root_0, string_literal53_tree);

            pushFollow(FOLLOW_expr_in_casee1902);
            e=expr();

            state._fsp--;

            adaptor.addChild(root_0, e.getTree());
            string_literal54=(Token)match(input,54,FOLLOW_54_in_casee1904); 
            string_literal54_tree = (Object)adaptor.create(string_literal54);
            adaptor.addChild(root_0, string_literal54_tree);

            pushFollow(FOLLOW_nalt_in_casee1910);
            n=nalt();

            state._fsp--;

            adaptor.addChild(root_0, n.getTree());
            char_literal55=(Token)match(input,39,FOLLOW_39_in_casee1912); 
            char_literal55_tree = (Object)adaptor.create(char_literal55);
            adaptor.addChild(root_0, char_literal55_tree);

            pushFollow(FOLLOW_calt_in_casee1918);
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
    // src/tr/fn/grammar/Puf.g:214:1: nalt returns [Nalt v] : '[]' '->' e= expr ;
    public final PufParser.nalt_return nalt() throws RecognitionException {
        PufParser.nalt_return retval = new PufParser.nalt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal56=null;
        Token string_literal57=null;
        PufParser.expr_return e = null;


        Object string_literal56_tree=null;
        Object string_literal57_tree=null;

        try {
            // src/tr/fn/grammar/Puf.g:215:12: ( '[]' '->' e= expr )
            // src/tr/fn/grammar/Puf.g:215:14: '[]' '->' e= expr
            {
            root_0 = (Object)adaptor.nil();

            string_literal56=(Token)match(input,55,FOLLOW_55_in_nalt1949); 
            string_literal56_tree = (Object)adaptor.create(string_literal56);
            adaptor.addChild(root_0, string_literal56_tree);

            string_literal57=(Token)match(input,51,FOLLOW_51_in_nalt1951); 
            string_literal57_tree = (Object)adaptor.create(string_literal57);
            adaptor.addChild(root_0, string_literal57_tree);

            pushFollow(FOLLOW_expr_in_nalt1957);
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
    // src/tr/fn/grammar/Puf.g:219:1: calt returns [Calt v] : i1= id ':' i2= id '->' e= expr ;
    public final PufParser.calt_return calt() throws RecognitionException {
        PufParser.calt_return retval = new PufParser.calt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal58=null;
        Token string_literal59=null;
        PufParser.id_return i1 = null;

        PufParser.id_return i2 = null;

        PufParser.expr_return e = null;


        Object char_literal58_tree=null;
        Object string_literal59_tree=null;

        try {
            // src/tr/fn/grammar/Puf.g:220:12: (i1= id ':' i2= id '->' e= expr )
            // src/tr/fn/grammar/Puf.g:220:14: i1= id ':' i2= id '->' e= expr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_id_in_calt1992);
            i1=id();

            state._fsp--;

            adaptor.addChild(root_0, i1.getTree());
            char_literal58=(Token)match(input,CONS,FOLLOW_CONS_in_calt1994); 
            char_literal58_tree = (Object)adaptor.create(char_literal58);
            adaptor.addChild(root_0, char_literal58_tree);

            pushFollow(FOLLOW_id_in_calt2000);
            i2=id();

            state._fsp--;

            adaptor.addChild(root_0, i2.getTree());
            string_literal59=(Token)match(input,51,FOLLOW_51_in_calt2002); 
            string_literal59_tree = (Object)adaptor.create(string_literal59);
            adaptor.addChild(root_0, string_literal59_tree);

            pushFollow(FOLLOW_expr_in_calt2008);
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
    // src/tr/fn/grammar/Puf.g:224:1: integer returns [tr.fn.ast.Number v] : INT ;
    public final PufParser.integer_return integer() throws RecognitionException {
        PufParser.integer_return retval = new PufParser.integer_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT60=null;

        Object INT60_tree=null;

        try {
            // src/tr/fn/grammar/Puf.g:225:12: ( INT )
            // src/tr/fn/grammar/Puf.g:225:14: INT
            {
            root_0 = (Object)adaptor.nil();

            INT60=(Token)match(input,INT,FOLLOW_INT_in_integer2047); 
            INT60_tree = (Object)adaptor.create(INT60);
            adaptor.addChild(root_0, INT60_tree);


                           retval.v = new tr.fn.ast.Number(Integer.valueOf((INT60!=null?INT60.getText():null)));
                       

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
    // src/tr/fn/grammar/Puf.g:229:1: id returns [Identifier v] : ID ;
    public final PufParser.id_return id() throws RecognitionException {
        PufParser.id_return retval = new PufParser.id_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID61=null;

        Object ID61_tree=null;

        try {
            // src/tr/fn/grammar/Puf.g:230:12: ( ID )
            // src/tr/fn/grammar/Puf.g:230:14: ID
            {
            root_0 = (Object)adaptor.nil();

            ID61=(Token)match(input,ID,FOLLOW_ID_in_id2080); 
            ID61_tree = (Object)adaptor.create(ID61);
            adaptor.addChild(root_0, ID61_tree);


                           retval.v = new Identifier((ID61!=null?ID61.getText():null));
                       

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
    // src/tr/fn/grammar/Puf.g:234:1: cop : ( LESS | GREATER | EQUAL | GREATEREQUAL | LESSEQUAL | NOTEQUAL );
    public final PufParser.cop_return cop() throws RecognitionException {
        PufParser.cop_return retval = new PufParser.cop_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set62=null;

        Object set62_tree=null;

        try {
            // src/tr/fn/grammar/Puf.g:234:14: ( LESS | GREATER | EQUAL | GREATEREQUAL | LESSEQUAL | NOTEQUAL )
            // src/tr/fn/grammar/Puf.g:
            {
            root_0 = (Object)adaptor.nil();

            set62=(Token)input.LT(1);
            if ( (input.LA(1)>=LESS && input.LA(1)<=NOTEQUAL) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set62));
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
    protected DFA13 dfa13 = new DFA13(this);
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
            return "()* loopback of 96:41: ( OR e1= aexpr )*";
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
            return "()* loopback of 102:41: ( AND e1= cexpr )*";
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
            return "108:41: (c= cop e1= lexpr )?";
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
            return "()* loopback of 114:41: ( CONS e1= pexpr )*";
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
            return "()* loopback of 120:41: (o= ( PLUS | MINUS ) e1= mexpr )*";
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
            return "()* loopback of 126:41: (o= ( STAR | SLASH | PERCENT ) e1= fexpr )*";
        }
    }
    static final String DFA11_eotS =
        "\103\uffff";
    static final String DFA11_eofS =
        "\103\uffff";
    static final String DFA11_minS =
        "\1\32\1\22\4\uffff\1\33\23\uffff\2\32\1\uffff\3\33\1\32\42\uffff";
    static final String DFA11_maxS =
        "\1\65\1\66\4\uffff\1\50\23\uffff\2\65\1\uffff\1\50\1\33\1\63\1\65"+
        "\42\uffff";
    static final String DFA11_acceptS =
        "\2\uffff\1\3\1\4\1\5\1\6\1\uffff\1\10\1\11\1\12\1\2\15\uffff\2\1"+
        "\7\uffff\1\7\1\13\40\1";
    static final String DFA11_specialS =
        "\103\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\2\1\1\14\uffff\1\3\2\uffff\1\6\1\uffff\1\5\2\uffff\1\4\1"+
            "\uffff\1\10\1\uffff\1\7\1\11",
            "\10\12\1\31\1\30\6\12\5\uffff\1\12\1\32\2\12\1\35\4\12\1\33"+
            "\1\12\1\37\1\uffff\1\36\1\40\1\12",
            "",
            "",
            "",
            "",
            "\1\41\14\uffff\1\42",
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
            "\1\44\1\43\14\uffff\1\45\2\uffff\1\50\1\uffff\1\47\2\uffff"+
            "\1\46\1\uffff\1\52\1\uffff\1\51\1\53",
            "\1\55\1\54\14\uffff\1\56\2\uffff\1\61\1\uffff\1\60\2\uffff"+
            "\1\57\1\uffff\1\63\1\uffff\1\62\1\64",
            "",
            "\1\66\14\uffff\1\65",
            "\1\67",
            "\1\70\27\uffff\1\71",
            "\1\73\1\72\14\uffff\1\74\2\uffff\1\77\1\uffff\1\76\2\uffff"+
            "\1\75\1\uffff\1\101\1\uffff\1\100\1\102",
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
            return "130:1: fexpr returns [Expression v] : ( fappl | id | integer | tuple | list | iexpr | let | letrec | lambda | casee | tlet );";
        }
    }
    static final String DFA13_eotS =
        "\u00c0\uffff";
    static final String DFA13_eofS =
        "\u00c0\uffff";
    static final String DFA13_minS =
        "\1\22\20\uffff\2\32\5\uffff\2\22\3\32\3\33\1\32\2\22\3\32\3\33\1"+
        "\32\u0096\uffff";
    static final String DFA13_maxS =
        "\1\66\20\uffff\2\65\5\uffff\5\65\1\50\1\33\1\63\6\65\1\50\1\33\1"+
        "\63\1\65\u0096\uffff";
    static final String DFA13_acceptS =
        "\1\uffff\1\2\15\uffff\2\1\31\uffff\u0096\1";
    static final String DFA13_specialS =
        "\u00c0\uffff}>";
    static final String[] DFA13_transitionS = {
            "\10\1\1\20\1\17\6\1\5\uffff\1\1\1\21\7\1\1\22\2\1\1\uffff\3"+
            "\1",
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
            "\1\31\1\30\14\uffff\1\32\2\uffff\1\35\1\uffff\1\34\2\uffff"+
            "\1\33\1\uffff\1\37\1\uffff\1\36\1\40",
            "\1\42\1\41\14\uffff\1\43\2\uffff\1\46\1\uffff\1\45\2\uffff"+
            "\1\44\1\uffff\1\50\1\uffff\1\47\1\51",
            "",
            "",
            "",
            "",
            "",
            "\1\57\1\56\1\54\2\53\3\52\1\63\1\62\6\55\6\uffff\1\64\1\60"+
            "\1\61\1\67\1\uffff\1\66\2\uffff\1\65\1\uffff\1\71\1\uffff\1"+
            "\70\1\72",
            "\1\100\1\77\1\75\2\74\3\73\1\104\1\103\6\76\6\uffff\1\105\1"+
            "\101\1\102\1\110\1\uffff\1\107\2\uffff\1\106\1\uffff\1\112\1"+
            "\uffff\1\111\1\113",
            "\1\115\1\114\14\uffff\1\116\2\uffff\1\121\1\uffff\1\120\2\uffff"+
            "\1\117\1\uffff\1\123\1\uffff\1\122\1\124",
            "\1\126\1\125\14\uffff\1\127\2\uffff\1\132\1\uffff\1\131\2\uffff"+
            "\1\130\1\uffff\1\134\1\uffff\1\133\1\135",
            "\1\137\1\136\14\uffff\1\140\2\uffff\1\143\1\uffff\1\142\2\uffff"+
            "\1\141\1\uffff\1\145\1\uffff\1\144\1\146",
            "\1\147\14\uffff\1\150",
            "\1\151",
            "\1\152\27\uffff\1\153",
            "\1\155\1\154\14\uffff\1\156\2\uffff\1\161\1\uffff\1\160\2\uffff"+
            "\1\157\1\uffff\1\163\1\uffff\1\162\1\164",
            "\1\u0082\1\u0081\1\177\2\176\3\175\1\167\1\166\6\u0080\6\uffff"+
            "\1\165\1\u0083\1\uffff\1\171\1\uffff\1\u0085\2\uffff\1\170\1"+
            "\u0084\1\173\1\uffff\1\172\1\174",
            "\1\u008b\1\u008a\1\u0088\2\u0087\3\u0086\1\u008f\1\u008e\6"+
            "\u0089\6\uffff\1\u0090\1\u008c\1\uffff\1\u0093\1\uffff\1\u0092"+
            "\2\uffff\1\u0091\1\u008d\1\u0095\1\uffff\1\u0094\1\u0096",
            "\1\u0098\1\u0097\14\uffff\1\u0099\2\uffff\1\u009c\1\uffff\1"+
            "\u009b\2\uffff\1\u009a\1\uffff\1\u009e\1\uffff\1\u009d\1\u009f",
            "\1\u00a1\1\u00a0\14\uffff\1\u00a2\2\uffff\1\u00a5\1\uffff\1"+
            "\u00a4\2\uffff\1\u00a3\1\uffff\1\u00a7\1\uffff\1\u00a6\1\u00a8",
            "\1\u00aa\1\u00a9\14\uffff\1\u00ab\2\uffff\1\u00ae\1\uffff\1"+
            "\u00ad\2\uffff\1\u00ac\1\uffff\1\u00b0\1\uffff\1\u00af\1\u00b1",
            "\1\u00b3\14\uffff\1\u00b2",
            "\1\u00b4",
            "\1\u00b5\27\uffff\1\u00b6",
            "\1\u00b8\1\u00b7\14\uffff\1\u00b9\2\uffff\1\u00bc\1\uffff\1"+
            "\u00bb\2\uffff\1\u00ba\1\uffff\1\u00be\1\uffff\1\u00bd\1\u00bf",
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

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "()+ loopback of 148:14: (e= fmarg )+";
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
    public static final BitSet FOLLOW_fappl_in_fexpr872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_fexpr893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_in_fexpr917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tuple_in_fexpr936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_in_fexpr957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iexpr_in_fexpr979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_let_in_fexpr1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_letrec_in_fexpr1023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_in_fexpr1043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_casee_in_fexpr1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tlet_in_fexpr1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_fappl1130 = new BitSet(new long[]{0x003529000C000000L});
    public static final BitSet FOLLOW_fargm_in_fappl1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fsarg_in_fappl1139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fmarg_in_fargm1192 = new BitSet(new long[]{0x000101000C000002L});
    public static final BitSet FOLLOW_tuple_in_fmarg1226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_fmarg1245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_in_fmarg1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_in_fmarg1284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_let_in_fsarg1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_letrec_in_fsarg1338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambda_in_fsarg1356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_casee_in_fsarg1374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tlet_in_fsarg1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_tlet1438 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_tlhs_in_tlet1440 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_tlet1442 = new BitSet(new long[]{0x003529000C000000L});
    public static final BitSet FOLLOW_expr_in_tlet1448 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_tlet1450 = new BitSet(new long[]{0x003529000C000000L});
    public static final BitSet FOLLOW_expr_in_tlet1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_iexpr1497 = new BitSet(new long[]{0x003529000C000000L});
    public static final BitSet FOLLOW_expr_in_iexpr1503 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_iexpr1505 = new BitSet(new long[]{0x003529000C000000L});
    public static final BitSet FOLLOW_expr_in_iexpr1511 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_iexpr1513 = new BitSet(new long[]{0x003529000C000000L});
    public static final BitSet FOLLOW_expr_in_iexpr1519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_tuple1576 = new BitSet(new long[]{0x003529000C000000L});
    public static final BitSet FOLLOW_expr_in_tuple1582 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_41_in_tuple1587 = new BitSet(new long[]{0x003529000C000000L});
    public static final BitSet FOLLOW_expr_in_tuple1593 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_42_in_tuple1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_list1647 = new BitSet(new long[]{0x003529000C000000L});
    public static final BitSet FOLLOW_expr_in_list1653 = new BitSet(new long[]{0x0002020000000000L});
    public static final BitSet FOLLOW_41_in_list1658 = new BitSet(new long[]{0x003529000C000000L});
    public static final BitSet FOLLOW_expr_in_list1664 = new BitSet(new long[]{0x0002020000000000L});
    public static final BitSet FOLLOW_49_in_list1671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_lambda1716 = new BitSet(new long[]{0x0008000008000000L});
    public static final BitSet FOLLOW_id_in_lambda1723 = new BitSet(new long[]{0x0008000008000000L});
    public static final BitSet FOLLOW_51_in_lambda1729 = new BitSet(new long[]{0x003529000C000000L});
    public static final BitSet FOLLOW_expr_in_lambda1735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_let1783 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ldecl_in_let1790 = new BitSet(new long[]{0x0000100008000000L});
    public static final BitSet FOLLOW_44_in_let1796 = new BitSet(new long[]{0x003529000C000000L});
    public static final BitSet FOLLOW_expr_in_let1802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_letrec1847 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rdecl_in_letrec1854 = new BitSet(new long[]{0x0000100008000000L});
    public static final BitSet FOLLOW_44_in_letrec1860 = new BitSet(new long[]{0x003529000C000000L});
    public static final BitSet FOLLOW_expr_in_letrec1866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_casee1896 = new BitSet(new long[]{0x003529000C000000L});
    public static final BitSet FOLLOW_expr_in_casee1902 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_casee1904 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_nalt_in_casee1910 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_casee1912 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_calt_in_casee1918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_nalt1949 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_nalt1951 = new BitSet(new long[]{0x003529000C000000L});
    public static final BitSet FOLLOW_expr_in_nalt1957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_calt1992 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_CONS_in_calt1994 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_id_in_calt2000 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_calt2002 = new BitSet(new long[]{0x003529000C000000L});
    public static final BitSet FOLLOW_expr_in_calt2008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_integer2047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_id2080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_cop0 = new BitSet(new long[]{0x0000000000000002L});

}