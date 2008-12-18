// $ANTLR 3.1.1 src/tr/fn/grammar/Fun.g 2008-12-18 16:32:58

package tr.fn.grammar;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class FunParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "APP", "TUPLE", "LIST", "ID", "DEFINE", "ENDEXPR", "HASH", "INT", "IF", "THEN", "ELSE", "LAMBDA", "RIGHTARROW", "LET", "IN", "LETREC", "EMPTY_LIST", "OPEN_SQUARE", "CLOSE_SQUARE", "COMMA", "EMPTY_TUPLE", "LEFTPAREN", "RIGHTPAREN", "OR", "AND", "NOT", "CONS", "PLUS", "MINUS", "STAR", "SLASH", "PERCENT", "LESS", "GREATER", "EQUAL", "GREATEREQUAL", "LESSEQUAL", "NOTEQUAL", "WS", "NL", "ML_COMMENT", "SL_COMMENT"
    };
    public static final int STAR=33;
    public static final int RIGHTARROW=16;
    public static final int APP=4;
    public static final int GREATEREQUAL=39;
    public static final int NOT=29;
    public static final int ID=7;
    public static final int AND=28;
    public static final int DEFINE=8;
    public static final int EOF=-1;
    public static final int ENDEXPR=9;
    public static final int IF=12;
    public static final int NOTEQUAL=41;
    public static final int ML_COMMENT=44;
    public static final int LEFTPAREN=25;
    public static final int TUPLE=5;
    public static final int EMPTY_LIST=20;
    public static final int LETREC=19;
    public static final int SLASH=34;
    public static final int GREATER=37;
    public static final int IN=18;
    public static final int THEN=13;
    public static final int COMMA=23;
    public static final int EQUAL=38;
    public static final int LESS=36;
    public static final int OPEN_SQUARE=21;
    public static final int PLUS=31;
    public static final int LAMBDA=15;
    public static final int NL=43;
    public static final int CLOSE_SQUARE=22;
    public static final int PERCENT=35;
    public static final int ELSE=14;
    public static final int EMPTY_TUPLE=24;
    public static final int HASH=10;
    public static final int INT=11;
    public static final int MINUS=32;
    public static final int LIST=6;
    public static final int WS=42;
    public static final int RIGHTPAREN=26;
    public static final int CONS=30;
    public static final int SL_COMMENT=45;
    public static final int OR=27;
    public static final int LESSEQUAL=40;
    public static final int LET=17;

    // delegates
    // delegators


        public FunParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public FunParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return FunParser.tokenNames; }
    public String getGrammarFileName() { return "src/tr/fn/grammar/Fun.g"; }


    public static class program_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "program"
    // src/tr/fn/grammar/Fun.g:29:1: program : ( decl )* EOF ;
    public final FunParser.program_return program() throws RecognitionException {
        FunParser.program_return retval = new FunParser.program_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EOF2=null;
        FunParser.decl_return decl1 = null;


        Object EOF2_tree=null;

        try {
            // src/tr/fn/grammar/Fun.g:29:12: ( ( decl )* EOF )
            // src/tr/fn/grammar/Fun.g:29:14: ( decl )* EOF
            {
            root_0 = (Object)adaptor.nil();

            // src/tr/fn/grammar/Fun.g:29:14: ( decl )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // src/tr/fn/grammar/Fun.g:29:14: decl
            	    {
            	    pushFollow(FOLLOW_decl_in_program80);
            	    decl1=decl();

            	    state._fsp--;

            	    adaptor.addChild(root_0, decl1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_program83); 
            EOF2_tree = (Object)adaptor.create(EOF2);
            adaptor.addChild(root_0, EOF2_tree);


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

    public static class decl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "decl"
    // src/tr/fn/grammar/Fun.g:31:1: decl : fname ( ID )* DEFINE expr ENDEXPR -> ^( DEFINE fname expr ( ID )* ) ;
    public final FunParser.decl_return decl() throws RecognitionException {
        FunParser.decl_return retval = new FunParser.decl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID4=null;
        Token DEFINE5=null;
        Token ENDEXPR7=null;
        FunParser.fname_return fname3 = null;

        FunParser.expr_return expr6 = null;


        Object ID4_tree=null;
        Object DEFINE5_tree=null;
        Object ENDEXPR7_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_DEFINE=new RewriteRuleTokenStream(adaptor,"token DEFINE");
        RewriteRuleTokenStream stream_ENDEXPR=new RewriteRuleTokenStream(adaptor,"token ENDEXPR");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_fname=new RewriteRuleSubtreeStream(adaptor,"rule fname");
        try {
            // src/tr/fn/grammar/Fun.g:31:12: ( fname ( ID )* DEFINE expr ENDEXPR -> ^( DEFINE fname expr ( ID )* ) )
            // src/tr/fn/grammar/Fun.g:31:14: fname ( ID )* DEFINE expr ENDEXPR
            {
            pushFollow(FOLLOW_fname_in_decl97);
            fname3=fname();

            state._fsp--;

            stream_fname.add(fname3.getTree());
            // src/tr/fn/grammar/Fun.g:31:20: ( ID )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // src/tr/fn/grammar/Fun.g:31:20: ID
            	    {
            	    ID4=(Token)match(input,ID,FOLLOW_ID_in_decl99);  
            	    stream_ID.add(ID4);


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            DEFINE5=(Token)match(input,DEFINE,FOLLOW_DEFINE_in_decl102);  
            stream_DEFINE.add(DEFINE5);

            pushFollow(FOLLOW_expr_in_decl104);
            expr6=expr();

            state._fsp--;

            stream_expr.add(expr6.getTree());
            ENDEXPR7=(Token)match(input,ENDEXPR,FOLLOW_ENDEXPR_in_decl106);  
            stream_ENDEXPR.add(ENDEXPR7);



            // AST REWRITE
            // elements: ID, fname, DEFINE, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 31:44: -> ^( DEFINE fname expr ( ID )* )
            {
                // src/tr/fn/grammar/Fun.g:31:47: ^( DEFINE fname expr ( ID )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_DEFINE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_fname.nextTree());
                adaptor.addChild(root_1, stream_expr.nextTree());
                // src/tr/fn/grammar/Fun.g:31:67: ( ID )*
                while ( stream_ID.hasNext() ) {
                    adaptor.addChild(root_1, stream_ID.nextNode());

                }
                stream_ID.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
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
    // $ANTLR end "decl"

    public static class fname_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fname"
    // src/tr/fn/grammar/Fun.g:33:1: fname : ID ;
    public final FunParser.fname_return fname() throws RecognitionException {
        FunParser.fname_return retval = new FunParser.fname_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID8=null;

        Object ID8_tree=null;

        try {
            // src/tr/fn/grammar/Fun.g:33:12: ( ID )
            // src/tr/fn/grammar/Fun.g:33:14: ID
            {
            root_0 = (Object)adaptor.nil();

            ID8=(Token)match(input,ID,FOLLOW_ID_in_fname133); 
            ID8_tree = (Object)adaptor.create(ID8);
            adaptor.addChild(root_0, ID8_tree);


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
    // $ANTLR end "fname"

    public static class expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // src/tr/fn/grammar/Fun.g:35:1: expr : single ( expr )? ;
    public final FunParser.expr_return expr() throws RecognitionException {
        FunParser.expr_return retval = new FunParser.expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        FunParser.single_return single9 = null;

        FunParser.expr_return expr10 = null;



        try {
            // src/tr/fn/grammar/Fun.g:35:12: ( single ( expr )? )
            // src/tr/fn/grammar/Fun.g:35:14: single ( expr )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_single_in_expr148);
            single9=single();

            state._fsp--;

            adaptor.addChild(root_0, single9.getTree());
            // src/tr/fn/grammar/Fun.g:35:21: ( expr )?
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // src/tr/fn/grammar/Fun.g:35:21: expr
                    {
                    pushFollow(FOLLOW_expr_in_expr150);
                    expr10=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr10.getTree());

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
    // $ANTLR end "expr"

    public static class single_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "single"
    // src/tr/fn/grammar/Fun.g:37:1: single : ( HASH INT expr | IF or THEN e1= expr ELSE e2= expr -> ^( IF or $e1 $e2) | LAMBDA ( ID )* RIGHTARROW expr -> ^( LAMBDA expr ( ID )* ) | LET ( decl )+ IN expr -> ^( LET expr ( decl )+ ) | LETREC ( decl )+ IN expr -> ^( LETREC expr ( decl )+ ) | EMPTY_LIST | list_sugar | tuple | or );
    public final FunParser.single_return single() throws RecognitionException {
        FunParser.single_return retval = new FunParser.single_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token HASH11=null;
        Token INT12=null;
        Token IF14=null;
        Token THEN16=null;
        Token ELSE17=null;
        Token LAMBDA18=null;
        Token ID19=null;
        Token RIGHTARROW20=null;
        Token LET22=null;
        Token IN24=null;
        Token LETREC26=null;
        Token IN28=null;
        Token EMPTY_LIST30=null;
        FunParser.expr_return e1 = null;

        FunParser.expr_return e2 = null;

        FunParser.expr_return expr13 = null;

        FunParser.or_return or15 = null;

        FunParser.expr_return expr21 = null;

        FunParser.decl_return decl23 = null;

        FunParser.expr_return expr25 = null;

        FunParser.decl_return decl27 = null;

        FunParser.expr_return expr29 = null;

        FunParser.list_sugar_return list_sugar31 = null;

        FunParser.tuple_return tuple32 = null;

        FunParser.or_return or33 = null;


        Object HASH11_tree=null;
        Object INT12_tree=null;
        Object IF14_tree=null;
        Object THEN16_tree=null;
        Object ELSE17_tree=null;
        Object LAMBDA18_tree=null;
        Object ID19_tree=null;
        Object RIGHTARROW20_tree=null;
        Object LET22_tree=null;
        Object IN24_tree=null;
        Object LETREC26_tree=null;
        Object IN28_tree=null;
        Object EMPTY_LIST30_tree=null;
        RewriteRuleTokenStream stream_LETREC=new RewriteRuleTokenStream(adaptor,"token LETREC");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_THEN=new RewriteRuleTokenStream(adaptor,"token THEN");
        RewriteRuleTokenStream stream_LAMBDA=new RewriteRuleTokenStream(adaptor,"token LAMBDA");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_LET=new RewriteRuleTokenStream(adaptor,"token LET");
        RewriteRuleTokenStream stream_RIGHTARROW=new RewriteRuleTokenStream(adaptor,"token RIGHTARROW");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_or=new RewriteRuleSubtreeStream(adaptor,"rule or");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_decl=new RewriteRuleSubtreeStream(adaptor,"rule decl");
        try {
            // src/tr/fn/grammar/Fun.g:37:12: ( HASH INT expr | IF or THEN e1= expr ELSE e2= expr -> ^( IF or $e1 $e2) | LAMBDA ( ID )* RIGHTARROW expr -> ^( LAMBDA expr ( ID )* ) | LET ( decl )+ IN expr -> ^( LET expr ( decl )+ ) | LETREC ( decl )+ IN expr -> ^( LETREC expr ( decl )+ ) | EMPTY_LIST | list_sugar | tuple | or )
            int alt7=9;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // src/tr/fn/grammar/Fun.g:37:14: HASH INT expr
                    {
                    root_0 = (Object)adaptor.nil();

                    HASH11=(Token)match(input,HASH,FOLLOW_HASH_in_single175); 
                    HASH11_tree = (Object)adaptor.create(HASH11);
                    adaptor.addChild(root_0, HASH11_tree);

                    INT12=(Token)match(input,INT,FOLLOW_INT_in_single177); 
                    INT12_tree = (Object)adaptor.create(INT12);
                    adaptor.addChild(root_0, INT12_tree);

                    pushFollow(FOLLOW_expr_in_single179);
                    expr13=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr13.getTree());

                    }
                    break;
                case 2 :
                    // src/tr/fn/grammar/Fun.g:38:14: IF or THEN e1= expr ELSE e2= expr
                    {
                    IF14=(Token)match(input,IF,FOLLOW_IF_in_single194);  
                    stream_IF.add(IF14);

                    pushFollow(FOLLOW_or_in_single196);
                    or15=or();

                    state._fsp--;

                    stream_or.add(or15.getTree());
                    THEN16=(Token)match(input,THEN,FOLLOW_THEN_in_single198);  
                    stream_THEN.add(THEN16);

                    pushFollow(FOLLOW_expr_in_single202);
                    e1=expr();

                    state._fsp--;

                    stream_expr.add(e1.getTree());
                    ELSE17=(Token)match(input,ELSE,FOLLOW_ELSE_in_single204);  
                    stream_ELSE.add(ELSE17);

                    pushFollow(FOLLOW_expr_in_single208);
                    e2=expr();

                    state._fsp--;

                    stream_expr.add(e2.getTree());


                    // AST REWRITE
                    // elements: IF, or, e2, e1
                    // token labels: 
                    // rule labels: retval, e1, e2
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_e1=new RewriteRuleSubtreeStream(adaptor,"token e1",e1!=null?e1.tree:null);
                    RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"token e2",e2!=null?e2.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 38:48: -> ^( IF or $e1 $e2)
                    {
                        // src/tr/fn/grammar/Fun.g:38:51: ^( IF or $e1 $e2)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_or.nextTree());
                        adaptor.addChild(root_1, stream_e1.nextTree());
                        adaptor.addChild(root_1, stream_e2.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // src/tr/fn/grammar/Fun.g:39:14: LAMBDA ( ID )* RIGHTARROW expr
                    {
                    LAMBDA18=(Token)match(input,LAMBDA,FOLLOW_LAMBDA_in_single239);  
                    stream_LAMBDA.add(LAMBDA18);

                    // src/tr/fn/grammar/Fun.g:39:21: ( ID )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==ID) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // src/tr/fn/grammar/Fun.g:39:21: ID
                    	    {
                    	    ID19=(Token)match(input,ID,FOLLOW_ID_in_single241);  
                    	    stream_ID.add(ID19);


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    RIGHTARROW20=(Token)match(input,RIGHTARROW,FOLLOW_RIGHTARROW_in_single244);  
                    stream_RIGHTARROW.add(RIGHTARROW20);

                    pushFollow(FOLLOW_expr_in_single246);
                    expr21=expr();

                    state._fsp--;

                    stream_expr.add(expr21.getTree());


                    // AST REWRITE
                    // elements: ID, expr, LAMBDA
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 39:42: -> ^( LAMBDA expr ( ID )* )
                    {
                        // src/tr/fn/grammar/Fun.g:39:45: ^( LAMBDA expr ( ID )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_LAMBDA.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());
                        // src/tr/fn/grammar/Fun.g:39:59: ( ID )*
                        while ( stream_ID.hasNext() ) {
                            adaptor.addChild(root_1, stream_ID.nextNode());

                        }
                        stream_ID.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // src/tr/fn/grammar/Fun.g:40:14: LET ( decl )+ IN expr
                    {
                    LET22=(Token)match(input,LET,FOLLOW_LET_in_single273);  
                    stream_LET.add(LET22);

                    // src/tr/fn/grammar/Fun.g:40:18: ( decl )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==ID) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // src/tr/fn/grammar/Fun.g:40:18: decl
                    	    {
                    	    pushFollow(FOLLOW_decl_in_single275);
                    	    decl23=decl();

                    	    state._fsp--;

                    	    stream_decl.add(decl23.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);

                    IN24=(Token)match(input,IN,FOLLOW_IN_in_single278);  
                    stream_IN.add(IN24);

                    pushFollow(FOLLOW_expr_in_single280);
                    expr25=expr();

                    state._fsp--;

                    stream_expr.add(expr25.getTree());


                    // AST REWRITE
                    // elements: expr, LET, decl
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 40:42: -> ^( LET expr ( decl )+ )
                    {
                        // src/tr/fn/grammar/Fun.g:40:45: ^( LET expr ( decl )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_LET.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());
                        if ( !(stream_decl.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_decl.hasNext() ) {
                            adaptor.addChild(root_1, stream_decl.nextTree());

                        }
                        stream_decl.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // src/tr/fn/grammar/Fun.g:41:14: LETREC ( decl )+ IN expr
                    {
                    LETREC26=(Token)match(input,LETREC,FOLLOW_LETREC_in_single316);  
                    stream_LETREC.add(LETREC26);

                    // src/tr/fn/grammar/Fun.g:41:21: ( decl )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==ID) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // src/tr/fn/grammar/Fun.g:41:21: decl
                    	    {
                    	    pushFollow(FOLLOW_decl_in_single318);
                    	    decl27=decl();

                    	    state._fsp--;

                    	    stream_decl.add(decl27.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);

                    IN28=(Token)match(input,IN,FOLLOW_IN_in_single321);  
                    stream_IN.add(IN28);

                    pushFollow(FOLLOW_expr_in_single323);
                    expr29=expr();

                    state._fsp--;

                    stream_expr.add(expr29.getTree());


                    // AST REWRITE
                    // elements: expr, decl, LETREC
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 41:42: -> ^( LETREC expr ( decl )+ )
                    {
                        // src/tr/fn/grammar/Fun.g:41:45: ^( LETREC expr ( decl )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_LETREC.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());
                        if ( !(stream_decl.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_decl.hasNext() ) {
                            adaptor.addChild(root_1, stream_decl.nextTree());

                        }
                        stream_decl.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // src/tr/fn/grammar/Fun.g:42:14: EMPTY_LIST
                    {
                    root_0 = (Object)adaptor.nil();

                    EMPTY_LIST30=(Token)match(input,EMPTY_LIST,FOLLOW_EMPTY_LIST_in_single356); 
                    EMPTY_LIST30_tree = (Object)adaptor.create(EMPTY_LIST30);
                    adaptor.addChild(root_0, EMPTY_LIST30_tree);


                    }
                    break;
                case 7 :
                    // src/tr/fn/grammar/Fun.g:43:14: list_sugar
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_list_sugar_in_single371);
                    list_sugar31=list_sugar();

                    state._fsp--;

                    adaptor.addChild(root_0, list_sugar31.getTree());

                    }
                    break;
                case 8 :
                    // src/tr/fn/grammar/Fun.g:44:14: tuple
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_tuple_in_single386);
                    tuple32=tuple();

                    state._fsp--;

                    adaptor.addChild(root_0, tuple32.getTree());

                    }
                    break;
                case 9 :
                    // src/tr/fn/grammar/Fun.g:45:14: or
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_or_in_single401);
                    or33=or();

                    state._fsp--;

                    adaptor.addChild(root_0, or33.getTree());

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
    // $ANTLR end "single"

    public static class list_sugar_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "list_sugar"
    // src/tr/fn/grammar/Fun.g:47:1: list_sugar : OPEN_SQUARE expr list_sugar_end -> ^( LIST expr list_sugar_end ) ;
    public final FunParser.list_sugar_return list_sugar() throws RecognitionException {
        FunParser.list_sugar_return retval = new FunParser.list_sugar_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OPEN_SQUARE34=null;
        FunParser.expr_return expr35 = null;

        FunParser.list_sugar_end_return list_sugar_end36 = null;


        Object OPEN_SQUARE34_tree=null;
        RewriteRuleTokenStream stream_OPEN_SQUARE=new RewriteRuleTokenStream(adaptor,"token OPEN_SQUARE");
        RewriteRuleSubtreeStream stream_list_sugar_end=new RewriteRuleSubtreeStream(adaptor,"rule list_sugar_end");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // src/tr/fn/grammar/Fun.g:47:16: ( OPEN_SQUARE expr list_sugar_end -> ^( LIST expr list_sugar_end ) )
            // src/tr/fn/grammar/Fun.g:47:18: OPEN_SQUARE expr list_sugar_end
            {
            OPEN_SQUARE34=(Token)match(input,OPEN_SQUARE,FOLLOW_OPEN_SQUARE_in_list_sugar425);  
            stream_OPEN_SQUARE.add(OPEN_SQUARE34);

            pushFollow(FOLLOW_expr_in_list_sugar428);
            expr35=expr();

            state._fsp--;

            stream_expr.add(expr35.getTree());
            pushFollow(FOLLOW_list_sugar_end_in_list_sugar430);
            list_sugar_end36=list_sugar_end();

            state._fsp--;

            stream_list_sugar_end.add(list_sugar_end36.getTree());


            // AST REWRITE
            // elements: expr, list_sugar_end
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 47:51: -> ^( LIST expr list_sugar_end )
            {
                // src/tr/fn/grammar/Fun.g:47:54: ^( LIST expr list_sugar_end )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());
                adaptor.addChild(root_1, stream_list_sugar_end.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
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
    // $ANTLR end "list_sugar"

    public static class list_sugar_end_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "list_sugar_end"
    // src/tr/fn/grammar/Fun.g:48:1: list_sugar_end : ( CLOSE_SQUARE | COMMA expr list_sugar_end );
    public final FunParser.list_sugar_end_return list_sugar_end() throws RecognitionException {
        FunParser.list_sugar_end_return retval = new FunParser.list_sugar_end_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CLOSE_SQUARE37=null;
        Token COMMA38=null;
        FunParser.expr_return expr39 = null;

        FunParser.list_sugar_end_return list_sugar_end40 = null;


        Object CLOSE_SQUARE37_tree=null;
        Object COMMA38_tree=null;

        try {
            // src/tr/fn/grammar/Fun.g:48:16: ( CLOSE_SQUARE | COMMA expr list_sugar_end )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==CLOSE_SQUARE) ) {
                alt8=1;
            }
            else if ( (LA8_0==COMMA) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // src/tr/fn/grammar/Fun.g:48:18: CLOSE_SQUARE
                    {
                    root_0 = (Object)adaptor.nil();

                    CLOSE_SQUARE37=(Token)match(input,CLOSE_SQUARE,FOLLOW_CLOSE_SQUARE_in_list_sugar_end448); 
                    CLOSE_SQUARE37_tree = (Object)adaptor.create(CLOSE_SQUARE37);
                    adaptor.addChild(root_0, CLOSE_SQUARE37_tree);


                    }
                    break;
                case 2 :
                    // src/tr/fn/grammar/Fun.g:49:18: COMMA expr list_sugar_end
                    {
                    root_0 = (Object)adaptor.nil();

                    COMMA38=(Token)match(input,COMMA,FOLLOW_COMMA_in_list_sugar_end467); 
                    pushFollow(FOLLOW_expr_in_list_sugar_end470);
                    expr39=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr39.getTree());
                    pushFollow(FOLLOW_list_sugar_end_in_list_sugar_end472);
                    list_sugar_end40=list_sugar_end();

                    state._fsp--;

                    adaptor.addChild(root_0, list_sugar_end40.getTree());

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
    // $ANTLR end "list_sugar_end"

    public static class tuple_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "tuple"
    // src/tr/fn/grammar/Fun.g:51:1: tuple : ( EMPTY_TUPLE | LEFTPAREN expr tuple_end -> ^( TUPLE expr tuple_end ) );
    public final FunParser.tuple_return tuple() throws RecognitionException {
        FunParser.tuple_return retval = new FunParser.tuple_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EMPTY_TUPLE41=null;
        Token LEFTPAREN42=null;
        FunParser.expr_return expr43 = null;

        FunParser.tuple_end_return tuple_end44 = null;


        Object EMPTY_TUPLE41_tree=null;
        Object LEFTPAREN42_tree=null;
        RewriteRuleTokenStream stream_LEFTPAREN=new RewriteRuleTokenStream(adaptor,"token LEFTPAREN");
        RewriteRuleSubtreeStream stream_tuple_end=new RewriteRuleSubtreeStream(adaptor,"rule tuple_end");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // src/tr/fn/grammar/Fun.g:51:12: ( EMPTY_TUPLE | LEFTPAREN expr tuple_end -> ^( TUPLE expr tuple_end ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==EMPTY_TUPLE) ) {
                alt9=1;
            }
            else if ( (LA9_0==LEFTPAREN) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // src/tr/fn/grammar/Fun.g:51:14: EMPTY_TUPLE
                    {
                    root_0 = (Object)adaptor.nil();

                    EMPTY_TUPLE41=(Token)match(input,EMPTY_TUPLE,FOLLOW_EMPTY_TUPLE_in_tuple493); 
                    EMPTY_TUPLE41_tree = (Object)adaptor.create(EMPTY_TUPLE41);
                    adaptor.addChild(root_0, EMPTY_TUPLE41_tree);


                    }
                    break;
                case 2 :
                    // src/tr/fn/grammar/Fun.g:52:14: LEFTPAREN expr tuple_end
                    {
                    LEFTPAREN42=(Token)match(input,LEFTPAREN,FOLLOW_LEFTPAREN_in_tuple508);  
                    stream_LEFTPAREN.add(LEFTPAREN42);

                    pushFollow(FOLLOW_expr_in_tuple511);
                    expr43=expr();

                    state._fsp--;

                    stream_expr.add(expr43.getTree());
                    pushFollow(FOLLOW_tuple_end_in_tuple513);
                    tuple_end44=tuple_end();

                    state._fsp--;

                    stream_tuple_end.add(tuple_end44.getTree());


                    // AST REWRITE
                    // elements: expr, tuple_end
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 52:43: -> ^( TUPLE expr tuple_end )
                    {
                        // src/tr/fn/grammar/Fun.g:52:46: ^( TUPLE expr tuple_end )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TUPLE, "TUPLE"), root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());
                        adaptor.addChild(root_1, stream_tuple_end.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
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
    // $ANTLR end "tuple"

    public static class tuple_end_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "tuple_end"
    // src/tr/fn/grammar/Fun.g:54:1: tuple_end : ( RIGHTPAREN | COMMA expr tuple_end );
    public final FunParser.tuple_end_return tuple_end() throws RecognitionException {
        FunParser.tuple_end_return retval = new FunParser.tuple_end_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token RIGHTPAREN45=null;
        Token COMMA46=null;
        FunParser.expr_return expr47 = null;

        FunParser.tuple_end_return tuple_end48 = null;


        Object RIGHTPAREN45_tree=null;
        Object COMMA46_tree=null;

        try {
            // src/tr/fn/grammar/Fun.g:54:12: ( RIGHTPAREN | COMMA expr tuple_end )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RIGHTPAREN) ) {
                alt10=1;
            }
            else if ( (LA10_0==COMMA) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // src/tr/fn/grammar/Fun.g:54:14: RIGHTPAREN
                    {
                    root_0 = (Object)adaptor.nil();

                    RIGHTPAREN45=(Token)match(input,RIGHTPAREN,FOLLOW_RIGHTPAREN_in_tuple_end547); 
                    RIGHTPAREN45_tree = (Object)adaptor.create(RIGHTPAREN45);
                    adaptor.addChild(root_0, RIGHTPAREN45_tree);


                    }
                    break;
                case 2 :
                    // src/tr/fn/grammar/Fun.g:55:14: COMMA expr tuple_end
                    {
                    root_0 = (Object)adaptor.nil();

                    COMMA46=(Token)match(input,COMMA,FOLLOW_COMMA_in_tuple_end562); 
                    pushFollow(FOLLOW_expr_in_tuple_end565);
                    expr47=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr47.getTree());
                    pushFollow(FOLLOW_tuple_end_in_tuple_end567);
                    tuple_end48=tuple_end();

                    state._fsp--;

                    adaptor.addChild(root_0, tuple_end48.getTree());

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
    // $ANTLR end "tuple_end"

    public static class fapp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fapp"
    // src/tr/fn/grammar/Fun.g:57:1: fapp : fname ( farg )+ -> ^( APP fname ( farg )+ ) ;
    public final FunParser.fapp_return fapp() throws RecognitionException {
        FunParser.fapp_return retval = new FunParser.fapp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        FunParser.fname_return fname49 = null;

        FunParser.farg_return farg50 = null;


        RewriteRuleSubtreeStream stream_farg=new RewriteRuleSubtreeStream(adaptor,"rule farg");
        RewriteRuleSubtreeStream stream_fname=new RewriteRuleSubtreeStream(adaptor,"rule fname");
        try {
            // src/tr/fn/grammar/Fun.g:57:12: ( fname ( farg )+ -> ^( APP fname ( farg )+ ) )
            // src/tr/fn/grammar/Fun.g:57:14: fname ( farg )+
            {
            pushFollow(FOLLOW_fname_in_fapp582);
            fname49=fname();

            state._fsp--;

            stream_fname.add(fname49.getTree());
            // src/tr/fn/grammar/Fun.g:57:20: ( farg )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                alt11 = dfa11.predict(input);
                switch (alt11) {
            	case 1 :
            	    // src/tr/fn/grammar/Fun.g:57:20: farg
            	    {
            	    pushFollow(FOLLOW_farg_in_fapp584);
            	    farg50=farg();

            	    state._fsp--;

            	    stream_farg.add(farg50.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);



            // AST REWRITE
            // elements: farg, fname
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 57:26: -> ^( APP fname ( farg )+ )
            {
                // src/tr/fn/grammar/Fun.g:57:29: ^( APP fname ( farg )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(APP, "APP"), root_1);

                adaptor.addChild(root_1, stream_fname.nextTree());
                if ( !(stream_farg.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_farg.hasNext() ) {
                    adaptor.addChild(root_1, stream_farg.nextTree());

                }
                stream_farg.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
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
    // $ANTLR end "fapp"

    public static class farg_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "farg"
    // src/tr/fn/grammar/Fun.g:59:1: farg : ( LEFTPAREN expr RIGHTPAREN -> ^( expr ) | ID | INT );
    public final FunParser.farg_return farg() throws RecognitionException {
        FunParser.farg_return retval = new FunParser.farg_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LEFTPAREN51=null;
        Token RIGHTPAREN53=null;
        Token ID54=null;
        Token INT55=null;
        FunParser.expr_return expr52 = null;


        Object LEFTPAREN51_tree=null;
        Object RIGHTPAREN53_tree=null;
        Object ID54_tree=null;
        Object INT55_tree=null;
        RewriteRuleTokenStream stream_LEFTPAREN=new RewriteRuleTokenStream(adaptor,"token LEFTPAREN");
        RewriteRuleTokenStream stream_RIGHTPAREN=new RewriteRuleTokenStream(adaptor,"token RIGHTPAREN");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // src/tr/fn/grammar/Fun.g:59:12: ( LEFTPAREN expr RIGHTPAREN -> ^( expr ) | ID | INT )
            int alt12=3;
            switch ( input.LA(1) ) {
            case LEFTPAREN:
                {
                alt12=1;
                }
                break;
            case ID:
                {
                alt12=2;
                }
                break;
            case INT:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // src/tr/fn/grammar/Fun.g:59:14: LEFTPAREN expr RIGHTPAREN
                    {
                    LEFTPAREN51=(Token)match(input,LEFTPAREN,FOLLOW_LEFTPAREN_in_farg611);  
                    stream_LEFTPAREN.add(LEFTPAREN51);

                    pushFollow(FOLLOW_expr_in_farg613);
                    expr52=expr();

                    state._fsp--;

                    stream_expr.add(expr52.getTree());
                    RIGHTPAREN53=(Token)match(input,RIGHTPAREN,FOLLOW_RIGHTPAREN_in_farg615);  
                    stream_RIGHTPAREN.add(RIGHTPAREN53);



                    // AST REWRITE
                    // elements: expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 59:40: -> ^( expr )
                    {
                        // src/tr/fn/grammar/Fun.g:59:43: ^( expr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_expr.nextNode(), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // src/tr/fn/grammar/Fun.g:60:14: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID54=(Token)match(input,ID,FOLLOW_ID_in_farg636); 
                    ID54_tree = (Object)adaptor.create(ID54);
                    adaptor.addChild(root_0, ID54_tree);


                    }
                    break;
                case 3 :
                    // src/tr/fn/grammar/Fun.g:61:14: INT
                    {
                    root_0 = (Object)adaptor.nil();

                    INT55=(Token)match(input,INT,FOLLOW_INT_in_farg651); 
                    INT55_tree = (Object)adaptor.create(INT55);
                    adaptor.addChild(root_0, INT55_tree);


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
    // $ANTLR end "farg"

    public static class or_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "or"
    // src/tr/fn/grammar/Fun.g:63:1: or : and ( OR and )* ;
    public final FunParser.or_return or() throws RecognitionException {
        FunParser.or_return retval = new FunParser.or_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR57=null;
        FunParser.and_return and56 = null;

        FunParser.and_return and58 = null;


        Object OR57_tree=null;

        try {
            // src/tr/fn/grammar/Fun.g:63:12: ( and ( OR and )* )
            // src/tr/fn/grammar/Fun.g:63:14: and ( OR and )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_and_in_or668);
            and56=and();

            state._fsp--;

            adaptor.addChild(root_0, and56.getTree());
            // src/tr/fn/grammar/Fun.g:63:18: ( OR and )*
            loop13:
            do {
                int alt13=2;
                alt13 = dfa13.predict(input);
                switch (alt13) {
            	case 1 :
            	    // src/tr/fn/grammar/Fun.g:63:19: OR and
            	    {
            	    OR57=(Token)match(input,OR,FOLLOW_OR_in_or671); 
            	    OR57_tree = (Object)adaptor.create(OR57);
            	    root_0 = (Object)adaptor.becomeRoot(OR57_tree, root_0);

            	    pushFollow(FOLLOW_and_in_or674);
            	    and58=and();

            	    state._fsp--;

            	    adaptor.addChild(root_0, and58.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


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
    // $ANTLR end "or"

    public static class and_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "and"
    // src/tr/fn/grammar/Fun.g:65:1: and : not ( AND not )* ;
    public final FunParser.and_return and() throws RecognitionException {
        FunParser.and_return retval = new FunParser.and_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AND60=null;
        FunParser.not_return not59 = null;

        FunParser.not_return not61 = null;


        Object AND60_tree=null;

        try {
            // src/tr/fn/grammar/Fun.g:65:12: ( not ( AND not )* )
            // src/tr/fn/grammar/Fun.g:65:14: not ( AND not )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_not_in_and692);
            not59=not();

            state._fsp--;

            adaptor.addChild(root_0, not59.getTree());
            // src/tr/fn/grammar/Fun.g:65:18: ( AND not )*
            loop14:
            do {
                int alt14=2;
                alt14 = dfa14.predict(input);
                switch (alt14) {
            	case 1 :
            	    // src/tr/fn/grammar/Fun.g:65:19: AND not
            	    {
            	    AND60=(Token)match(input,AND,FOLLOW_AND_in_and695); 
            	    AND60_tree = (Object)adaptor.create(AND60);
            	    root_0 = (Object)adaptor.becomeRoot(AND60_tree, root_0);

            	    pushFollow(FOLLOW_not_in_and698);
            	    not61=not();

            	    state._fsp--;

            	    adaptor.addChild(root_0, not61.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


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
    // $ANTLR end "and"

    public static class not_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "not"
    // src/tr/fn/grammar/Fun.g:67:1: not : ( NOT not | comp );
    public final FunParser.not_return not() throws RecognitionException {
        FunParser.not_return retval = new FunParser.not_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NOT62=null;
        FunParser.not_return not63 = null;

        FunParser.comp_return comp64 = null;


        Object NOT62_tree=null;

        try {
            // src/tr/fn/grammar/Fun.g:67:12: ( NOT not | comp )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==NOT) ) {
                alt15=1;
            }
            else if ( (LA15_0==ID||LA15_0==INT||LA15_0==LEFTPAREN||(LA15_0>=PLUS && LA15_0<=MINUS)) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // src/tr/fn/grammar/Fun.g:67:14: NOT not
                    {
                    root_0 = (Object)adaptor.nil();

                    NOT62=(Token)match(input,NOT,FOLLOW_NOT_in_not716); 
                    NOT62_tree = (Object)adaptor.create(NOT62);
                    root_0 = (Object)adaptor.becomeRoot(NOT62_tree, root_0);

                    pushFollow(FOLLOW_not_in_not719);
                    not63=not();

                    state._fsp--;

                    adaptor.addChild(root_0, not63.getTree());

                    }
                    break;
                case 2 :
                    // src/tr/fn/grammar/Fun.g:68:14: comp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_comp_in_not734);
                    comp64=comp();

                    state._fsp--;

                    adaptor.addChild(root_0, comp64.getTree());

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
    // $ANTLR end "not"

    public static class comp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "comp"
    // src/tr/fn/grammar/Fun.g:70:1: comp : list ( comp_op list )* ;
    public final FunParser.comp_return comp() throws RecognitionException {
        FunParser.comp_return retval = new FunParser.comp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        FunParser.list_return list65 = null;

        FunParser.comp_op_return comp_op66 = null;

        FunParser.list_return list67 = null;



        try {
            // src/tr/fn/grammar/Fun.g:70:12: ( list ( comp_op list )* )
            // src/tr/fn/grammar/Fun.g:70:14: list ( comp_op list )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_list_in_comp760);
            list65=list();

            state._fsp--;

            adaptor.addChild(root_0, list65.getTree());
            // src/tr/fn/grammar/Fun.g:70:19: ( comp_op list )*
            loop16:
            do {
                int alt16=2;
                alt16 = dfa16.predict(input);
                switch (alt16) {
            	case 1 :
            	    // src/tr/fn/grammar/Fun.g:70:20: comp_op list
            	    {
            	    pushFollow(FOLLOW_comp_op_in_comp763);
            	    comp_op66=comp_op();

            	    state._fsp--;

            	    root_0 = (Object)adaptor.becomeRoot(comp_op66.getTree(), root_0);
            	    pushFollow(FOLLOW_list_in_comp766);
            	    list67=list();

            	    state._fsp--;

            	    adaptor.addChild(root_0, list67.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


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
    // $ANTLR end "comp"

    public static class list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "list"
    // src/tr/fn/grammar/Fun.g:72:1: list : arith ( CONS tail )? ;
    public final FunParser.list_return list() throws RecognitionException {
        FunParser.list_return retval = new FunParser.list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token CONS69=null;
        FunParser.arith_return arith68 = null;

        FunParser.tail_return tail70 = null;


        Object CONS69_tree=null;

        try {
            // src/tr/fn/grammar/Fun.g:72:12: ( arith ( CONS tail )? )
            // src/tr/fn/grammar/Fun.g:72:14: arith ( CONS tail )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_arith_in_list783);
            arith68=arith();

            state._fsp--;

            adaptor.addChild(root_0, arith68.getTree());
            // src/tr/fn/grammar/Fun.g:72:20: ( CONS tail )?
            int alt17=2;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // src/tr/fn/grammar/Fun.g:72:21: CONS tail
                    {
                    CONS69=(Token)match(input,CONS,FOLLOW_CONS_in_list786); 
                    CONS69_tree = (Object)adaptor.create(CONS69);
                    root_0 = (Object)adaptor.becomeRoot(CONS69_tree, root_0);

                    pushFollow(FOLLOW_tail_in_list789);
                    tail70=tail();

                    state._fsp--;

                    adaptor.addChild(root_0, tail70.getTree());

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
    // $ANTLR end "list"

    public static class tail_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "tail"
    // src/tr/fn/grammar/Fun.g:74:1: tail : ( list | EMPTY_LIST );
    public final FunParser.tail_return tail() throws RecognitionException {
        FunParser.tail_return retval = new FunParser.tail_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EMPTY_LIST72=null;
        FunParser.list_return list71 = null;


        Object EMPTY_LIST72_tree=null;

        try {
            // src/tr/fn/grammar/Fun.g:74:12: ( list | EMPTY_LIST )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==ID||LA18_0==INT||LA18_0==LEFTPAREN||(LA18_0>=PLUS && LA18_0<=MINUS)) ) {
                alt18=1;
            }
            else if ( (LA18_0==EMPTY_LIST) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // src/tr/fn/grammar/Fun.g:74:14: list
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_list_in_tail806);
                    list71=list();

                    state._fsp--;

                    adaptor.addChild(root_0, list71.getTree());

                    }
                    break;
                case 2 :
                    // src/tr/fn/grammar/Fun.g:75:14: EMPTY_LIST
                    {
                    root_0 = (Object)adaptor.nil();

                    EMPTY_LIST72=(Token)match(input,EMPTY_LIST,FOLLOW_EMPTY_LIST_in_tail821); 
                    EMPTY_LIST72_tree = (Object)adaptor.create(EMPTY_LIST72);
                    adaptor.addChild(root_0, EMPTY_LIST72_tree);


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
    // $ANTLR end "tail"

    public static class arith_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arith"
    // src/tr/fn/grammar/Fun.g:77:1: arith : term ( ( PLUS | MINUS ) term )* ;
    public final FunParser.arith_return arith() throws RecognitionException {
        FunParser.arith_return retval = new FunParser.arith_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set74=null;
        FunParser.term_return term73 = null;

        FunParser.term_return term75 = null;


        Object set74_tree=null;

        try {
            // src/tr/fn/grammar/Fun.g:77:12: ( term ( ( PLUS | MINUS ) term )* )
            // src/tr/fn/grammar/Fun.g:77:14: term ( ( PLUS | MINUS ) term )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_term_in_arith842);
            term73=term();

            state._fsp--;

            adaptor.addChild(root_0, term73.getTree());
            // src/tr/fn/grammar/Fun.g:77:19: ( ( PLUS | MINUS ) term )*
            loop19:
            do {
                int alt19=2;
                alt19 = dfa19.predict(input);
                switch (alt19) {
            	case 1 :
            	    // src/tr/fn/grammar/Fun.g:77:20: ( PLUS | MINUS ) term
            	    {
            	    set74=(Token)input.LT(1);
            	    set74=(Token)input.LT(1);
            	    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set74), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_term_in_arith854);
            	    term75=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term75.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


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
    // $ANTLR end "arith"

    public static class term_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "term"
    // src/tr/fn/grammar/Fun.g:79:1: term : factor ( ( STAR | SLASH | PERCENT ) factor )* ;
    public final FunParser.term_return term() throws RecognitionException {
        FunParser.term_return retval = new FunParser.term_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set77=null;
        FunParser.factor_return factor76 = null;

        FunParser.factor_return factor78 = null;


        Object set77_tree=null;

        try {
            // src/tr/fn/grammar/Fun.g:79:12: ( factor ( ( STAR | SLASH | PERCENT ) factor )* )
            // src/tr/fn/grammar/Fun.g:79:14: factor ( ( STAR | SLASH | PERCENT ) factor )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_factor_in_term878);
            factor76=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor76.getTree());
            // src/tr/fn/grammar/Fun.g:79:21: ( ( STAR | SLASH | PERCENT ) factor )*
            loop20:
            do {
                int alt20=2;
                alt20 = dfa20.predict(input);
                switch (alt20) {
            	case 1 :
            	    // src/tr/fn/grammar/Fun.g:79:22: ( STAR | SLASH | PERCENT ) factor
            	    {
            	    set77=(Token)input.LT(1);
            	    set77=(Token)input.LT(1);
            	    if ( (input.LA(1)>=STAR && input.LA(1)<=PERCENT) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set77), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_factor_in_term894);
            	    factor78=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor78.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


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
    // $ANTLR end "term"

    public static class factor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "factor"
    // src/tr/fn/grammar/Fun.g:81:1: factor : ( fapp | LEFTPAREN or RIGHTPAREN -> ^( or ) | PLUS factor | MINUS factor | INT | ID );
    public final FunParser.factor_return factor() throws RecognitionException {
        FunParser.factor_return retval = new FunParser.factor_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LEFTPAREN80=null;
        Token RIGHTPAREN82=null;
        Token PLUS83=null;
        Token MINUS85=null;
        Token INT87=null;
        Token ID88=null;
        FunParser.fapp_return fapp79 = null;

        FunParser.or_return or81 = null;

        FunParser.factor_return factor84 = null;

        FunParser.factor_return factor86 = null;


        Object LEFTPAREN80_tree=null;
        Object RIGHTPAREN82_tree=null;
        Object PLUS83_tree=null;
        Object MINUS85_tree=null;
        Object INT87_tree=null;
        Object ID88_tree=null;
        RewriteRuleTokenStream stream_LEFTPAREN=new RewriteRuleTokenStream(adaptor,"token LEFTPAREN");
        RewriteRuleTokenStream stream_RIGHTPAREN=new RewriteRuleTokenStream(adaptor,"token RIGHTPAREN");
        RewriteRuleSubtreeStream stream_or=new RewriteRuleSubtreeStream(adaptor,"rule or");
        try {
            // src/tr/fn/grammar/Fun.g:81:12: ( fapp | LEFTPAREN or RIGHTPAREN -> ^( or ) | PLUS factor | MINUS factor | INT | ID )
            int alt21=6;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // src/tr/fn/grammar/Fun.g:81:14: fapp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_fapp_in_factor909);
                    fapp79=fapp();

                    state._fsp--;

                    adaptor.addChild(root_0, fapp79.getTree());

                    }
                    break;
                case 2 :
                    // src/tr/fn/grammar/Fun.g:82:14: LEFTPAREN or RIGHTPAREN
                    {
                    LEFTPAREN80=(Token)match(input,LEFTPAREN,FOLLOW_LEFTPAREN_in_factor924);  
                    stream_LEFTPAREN.add(LEFTPAREN80);

                    pushFollow(FOLLOW_or_in_factor926);
                    or81=or();

                    state._fsp--;

                    stream_or.add(or81.getTree());
                    RIGHTPAREN82=(Token)match(input,RIGHTPAREN,FOLLOW_RIGHTPAREN_in_factor928);  
                    stream_RIGHTPAREN.add(RIGHTPAREN82);



                    // AST REWRITE
                    // elements: or
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 82:38: -> ^( or )
                    {
                        // src/tr/fn/grammar/Fun.g:82:41: ^( or )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_or.nextNode(), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // src/tr/fn/grammar/Fun.g:83:14: PLUS factor
                    {
                    root_0 = (Object)adaptor.nil();

                    PLUS83=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor949); 
                    PLUS83_tree = (Object)adaptor.create(PLUS83);
                    adaptor.addChild(root_0, PLUS83_tree);

                    pushFollow(FOLLOW_factor_in_factor951);
                    factor84=factor();

                    state._fsp--;

                    adaptor.addChild(root_0, factor84.getTree());

                    }
                    break;
                case 4 :
                    // src/tr/fn/grammar/Fun.g:84:14: MINUS factor
                    {
                    root_0 = (Object)adaptor.nil();

                    MINUS85=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor966); 
                    MINUS85_tree = (Object)adaptor.create(MINUS85);
                    adaptor.addChild(root_0, MINUS85_tree);

                    pushFollow(FOLLOW_factor_in_factor968);
                    factor86=factor();

                    state._fsp--;

                    adaptor.addChild(root_0, factor86.getTree());

                    }
                    break;
                case 5 :
                    // src/tr/fn/grammar/Fun.g:85:14: INT
                    {
                    root_0 = (Object)adaptor.nil();

                    INT87=(Token)match(input,INT,FOLLOW_INT_in_factor983); 
                    INT87_tree = (Object)adaptor.create(INT87);
                    adaptor.addChild(root_0, INT87_tree);


                    }
                    break;
                case 6 :
                    // src/tr/fn/grammar/Fun.g:86:14: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID88=(Token)match(input,ID,FOLLOW_ID_in_factor998); 
                    ID88_tree = (Object)adaptor.create(ID88);
                    adaptor.addChild(root_0, ID88_tree);


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
    // $ANTLR end "factor"

    public static class comp_op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "comp_op"
    // src/tr/fn/grammar/Fun.g:88:1: comp_op : ( LESS | GREATER | EQUAL | GREATEREQUAL | LESSEQUAL | NOTEQUAL );
    public final FunParser.comp_op_return comp_op() throws RecognitionException {
        FunParser.comp_op_return retval = new FunParser.comp_op_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set89=null;

        Object set89_tree=null;

        try {
            // src/tr/fn/grammar/Fun.g:88:12: ( LESS | GREATER | EQUAL | GREATEREQUAL | LESSEQUAL | NOTEQUAL )
            // src/tr/fn/grammar/Fun.g:
            {
            root_0 = (Object)adaptor.nil();

            set89=(Token)input.LT(1);
            if ( (input.LA(1)>=LESS && input.LA(1)<=NOTEQUAL) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set89));
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
    // $ANTLR end "comp_op"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA21 dfa21 = new DFA21(this);
    static final String DFA3_eotS =
        "\24\uffff";
    static final String DFA3_eofS =
        "\24\uffff";
    static final String DFA3_minS =
        "\1\7\23\uffff";
    static final String DFA3_maxS =
        "\1\40\23\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\16\1\1\2\4\uffff";
    static final String DFA3_specialS =
        "\24\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\13\1\uffff\1\17\1\1\1\16\1\2\1\uffff\1\17\1\3\1\uffff\1"+
            "\4\1\uffff\1\5\1\6\1\7\2\17\1\10\1\11\1\17\2\uffff\1\12\1\uffff"+
            "\1\14\1\15",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "35:21: ( expr )?";
        }
    }
    static final String DFA7_eotS =
        "\35\uffff";
    static final String DFA7_eofS =
        "\35\uffff";
    static final String DFA7_minS =
        "\1\7\10\uffff\1\7\23\uffff";
    static final String DFA7_maxS =
        "\1\40\10\uffff\1\40\23\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff\1\11\4\uffff"+
        "\6\10\10\uffff";
    static final String DFA7_specialS =
        "\35\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\12\2\uffff\1\1\1\12\1\2\2\uffff\1\3\1\uffff\1\4\1\uffff"+
            "\1\5\1\6\1\7\2\uffff\1\10\1\11\3\uffff\1\12\1\uffff\2\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\20\2\uffff\1\10\1\24\1\10\2\uffff\1\10\1\uffff\1\10\1\uffff"+
            "\3\10\2\uffff\1\10\1\21\3\uffff\1\17\1\uffff\1\22\1\23",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "37:1: single : ( HASH INT expr | IF or THEN e1= expr ELSE e2= expr -> ^( IF or $e1 $e2) | LAMBDA ( ID )* RIGHTARROW expr -> ^( LAMBDA expr ( ID )* ) | LET ( decl )+ IN expr -> ^( LET expr ( decl )+ ) | LETREC ( decl )+ IN expr -> ^( LETREC expr ( decl )+ ) | EMPTY_LIST | list_sugar | tuple | or );";
        }
    }
    static final String DFA11_eotS =
        "\50\uffff";
    static final String DFA11_eofS =
        "\50\uffff";
    static final String DFA11_minS =
        "\1\7\17\uffff\1\7\27\uffff";
    static final String DFA11_maxS =
        "\1\51\17\uffff\1\40\27\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\2\20\uffff\1\1\1\uffff\1\1\5\uffff\16\1";
    static final String DFA11_specialS =
        "\50\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\22\1\uffff\2\1\1\24\4\1\1\uffff\1\1\1\uffff\6\1\1\20\20"+
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
            "\1\33\2\uffff\1\40\1\37\1\41\2\uffff\1\42\1\uffff\1\43\1\uffff"+
            "\1\44\1\45\1\46\2\uffff\1\47\1\34\3\uffff\1\32\1\uffff\1\35"+
            "\1\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()+ loopback of 57:20: ( farg )+";
        }
    }
    static final String DFA13_eotS =
        "\26\uffff";
    static final String DFA13_eofS =
        "\26\uffff";
    static final String DFA13_minS =
        "\1\7\25\uffff";
    static final String DFA13_maxS =
        "\1\40\25\uffff";
    static final String DFA13_acceptS =
        "\1\uffff\1\2\23\uffff\1\1";
    static final String DFA13_specialS =
        "\26\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\1\1\uffff\7\1\1\uffff\1\1\1\uffff\10\1\1\25\1\uffff\1\1"+
            "\1\uffff\2\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 63:18: ( OR and )*";
        }
    }
    static final String DFA14_eotS =
        "\27\uffff";
    static final String DFA14_eofS =
        "\27\uffff";
    static final String DFA14_minS =
        "\1\7\26\uffff";
    static final String DFA14_maxS =
        "\1\40\26\uffff";
    static final String DFA14_acceptS =
        "\1\uffff\1\2\24\uffff\1\1";
    static final String DFA14_specialS =
        "\27\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\1\1\uffff\7\1\1\uffff\1\1\1\uffff\11\1\1\26\1\1\1\uffff"+
            "\2\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "()* loopback of 65:18: ( AND not )*";
        }
    }
    static final String DFA16_eotS =
        "\30\uffff";
    static final String DFA16_eofS =
        "\30\uffff";
    static final String DFA16_minS =
        "\1\7\27\uffff";
    static final String DFA16_maxS =
        "\1\51\27\uffff";
    static final String DFA16_acceptS =
        "\1\uffff\1\2\25\uffff\1\1";
    static final String DFA16_specialS =
        "\30\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\1\1\uffff\7\1\1\uffff\1\1\1\uffff\13\1\1\uffff\2\1\3\uffff"+
            "\6\27",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "()* loopback of 70:19: ( comp_op list )*";
        }
    }
    static final String DFA17_eotS =
        "\31\uffff";
    static final String DFA17_eofS =
        "\31\uffff";
    static final String DFA17_minS =
        "\1\7\30\uffff";
    static final String DFA17_maxS =
        "\1\51\30\uffff";
    static final String DFA17_acceptS =
        "\1\uffff\1\1\1\2\26\uffff";
    static final String DFA17_specialS =
        "\31\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\2\1\uffff\7\2\1\uffff\1\2\1\uffff\13\2\1\1\2\2\3\uffff\6"+
            "\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "72:20: ( CONS tail )?";
        }
    }
    static final String DFA19_eotS =
        "\43\uffff";
    static final String DFA19_eofS =
        "\43\uffff";
    static final String DFA19_minS =
        "\1\7\20\uffff\2\7\20\uffff";
    static final String DFA19_maxS =
        "\1\51\20\uffff\2\40\20\uffff";
    static final String DFA19_acceptS =
        "\1\uffff\1\2\27\uffff\12\1";
    static final String DFA19_specialS =
        "\43\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\1\1\uffff\7\1\1\uffff\1\1\1\uffff\14\1\1\21\1\22\3\uffff"+
            "\6\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\31\3\uffff\1\35\15\uffff\1\32\5\uffff\1\33\1\34",
            "\1\36\3\uffff\1\42\15\uffff\1\37\5\uffff\1\40\1\41",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "()* loopback of 77:19: ( ( PLUS | MINUS ) term )*";
        }
    }
    static final String DFA20_eotS =
        "\32\uffff";
    static final String DFA20_eofS =
        "\32\uffff";
    static final String DFA20_minS =
        "\1\7\31\uffff";
    static final String DFA20_maxS =
        "\1\51\31\uffff";
    static final String DFA20_acceptS =
        "\1\uffff\1\2\27\uffff\1\1";
    static final String DFA20_specialS =
        "\32\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\1\1\uffff\7\1\1\uffff\1\1\1\uffff\16\1\3\31\6\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "()* loopback of 79:21: ( ( STAR | SLASH | PERCENT ) factor )*";
        }
    }
    static final String DFA21_eotS =
        "\37\uffff";
    static final String DFA21_eofS =
        "\37\uffff";
    static final String DFA21_minS =
        "\2\7\35\uffff";
    static final String DFA21_maxS =
        "\1\40\1\51\35\uffff";
    static final String DFA21_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\1\6\16\uffff\1\1\1\uffff\1\1\1\uffff\1"+
        "\1\5\uffff";
    static final String DFA21_specialS =
        "\37\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\1\3\uffff\1\5\15\uffff\1\2\5\uffff\1\3\1\4",
            "\1\27\1\uffff\2\6\1\31\4\6\1\uffff\1\6\1\uffff\6\6\1\25\20"+
            "\6",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "81:1: factor : ( fapp | LEFTPAREN or RIGHTPAREN -> ^( or ) | PLUS factor | MINUS factor | INT | ID );";
        }
    }
 

    public static final BitSet FOLLOW_decl_in_program80 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_EOF_in_program83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fname_in_decl97 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_ID_in_decl99 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_DEFINE_in_decl102 = new BitSet(new long[]{0x00000001A33A9C80L});
    public static final BitSet FOLLOW_expr_in_decl104 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ENDEXPR_in_decl106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_fname133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_single_in_expr148 = new BitSet(new long[]{0x00000001A33A9C82L});
    public static final BitSet FOLLOW_expr_in_expr150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HASH_in_single175 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_INT_in_single177 = new BitSet(new long[]{0x00000001A33A9C80L});
    public static final BitSet FOLLOW_expr_in_single179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_single194 = new BitSet(new long[]{0x00000001A33A9C80L});
    public static final BitSet FOLLOW_or_in_single196 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_THEN_in_single198 = new BitSet(new long[]{0x00000001A33A9C80L});
    public static final BitSet FOLLOW_expr_in_single202 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ELSE_in_single204 = new BitSet(new long[]{0x00000001A33A9C80L});
    public static final BitSet FOLLOW_expr_in_single208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LAMBDA_in_single239 = new BitSet(new long[]{0x0000000000010080L});
    public static final BitSet FOLLOW_ID_in_single241 = new BitSet(new long[]{0x0000000000010080L});
    public static final BitSet FOLLOW_RIGHTARROW_in_single244 = new BitSet(new long[]{0x00000001A33A9C80L});
    public static final BitSet FOLLOW_expr_in_single246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LET_in_single273 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_decl_in_single275 = new BitSet(new long[]{0x0000000000040080L});
    public static final BitSet FOLLOW_IN_in_single278 = new BitSet(new long[]{0x00000001A33A9C80L});
    public static final BitSet FOLLOW_expr_in_single280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LETREC_in_single316 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_decl_in_single318 = new BitSet(new long[]{0x0000000000040080L});
    public static final BitSet FOLLOW_IN_in_single321 = new BitSet(new long[]{0x00000001A33A9C80L});
    public static final BitSet FOLLOW_expr_in_single323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EMPTY_LIST_in_single356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_sugar_in_single371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tuple_in_single386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_or_in_single401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPEN_SQUARE_in_list_sugar425 = new BitSet(new long[]{0x00000001A33A9C80L});
    public static final BitSet FOLLOW_expr_in_list_sugar428 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_list_sugar_end_in_list_sugar430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLOSE_SQUARE_in_list_sugar_end448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_list_sugar_end467 = new BitSet(new long[]{0x00000001A33A9C80L});
    public static final BitSet FOLLOW_expr_in_list_sugar_end470 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_list_sugar_end_in_list_sugar_end472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EMPTY_TUPLE_in_tuple493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFTPAREN_in_tuple508 = new BitSet(new long[]{0x00000001A33A9C80L});
    public static final BitSet FOLLOW_expr_in_tuple511 = new BitSet(new long[]{0x0000000004800000L});
    public static final BitSet FOLLOW_tuple_end_in_tuple513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RIGHTPAREN_in_tuple_end547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_tuple_end562 = new BitSet(new long[]{0x00000001A33A9C80L});
    public static final BitSet FOLLOW_expr_in_tuple_end565 = new BitSet(new long[]{0x0000000004800000L});
    public static final BitSet FOLLOW_tuple_end_in_tuple_end567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fname_in_fapp582 = new BitSet(new long[]{0x0000000002000880L});
    public static final BitSet FOLLOW_farg_in_fapp584 = new BitSet(new long[]{0x0000000002000882L});
    public static final BitSet FOLLOW_LEFTPAREN_in_farg611 = new BitSet(new long[]{0x00000001A33A9C80L});
    public static final BitSet FOLLOW_expr_in_farg613 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_RIGHTPAREN_in_farg615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_farg636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_farg651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_and_in_or668 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_OR_in_or671 = new BitSet(new long[]{0x00000001A33A9C80L});
    public static final BitSet FOLLOW_and_in_or674 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_not_in_and692 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_AND_in_and695 = new BitSet(new long[]{0x00000001A33A9C80L});
    public static final BitSet FOLLOW_not_in_and698 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_NOT_in_not716 = new BitSet(new long[]{0x00000001A33A9C80L});
    public static final BitSet FOLLOW_not_in_not719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comp_in_not734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_in_comp760 = new BitSet(new long[]{0x000003F000000002L});
    public static final BitSet FOLLOW_comp_op_in_comp763 = new BitSet(new long[]{0x00000001A33A9C80L});
    public static final BitSet FOLLOW_list_in_comp766 = new BitSet(new long[]{0x000003F000000002L});
    public static final BitSet FOLLOW_arith_in_list783 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_CONS_in_list786 = new BitSet(new long[]{0x00000001A33A9C80L});
    public static final BitSet FOLLOW_tail_in_list789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_in_tail806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EMPTY_LIST_in_tail821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_arith842 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_set_in_arith845 = new BitSet(new long[]{0x00000001A33A9C80L});
    public static final BitSet FOLLOW_term_in_arith854 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_factor_in_term878 = new BitSet(new long[]{0x0000000E00000002L});
    public static final BitSet FOLLOW_set_in_term881 = new BitSet(new long[]{0x00000001A33A9C80L});
    public static final BitSet FOLLOW_factor_in_term894 = new BitSet(new long[]{0x0000000E00000002L});
    public static final BitSet FOLLOW_fapp_in_factor909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFTPAREN_in_factor924 = new BitSet(new long[]{0x00000001A33A9C80L});
    public static final BitSet FOLLOW_or_in_factor926 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_RIGHTPAREN_in_factor928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_factor949 = new BitSet(new long[]{0x00000001A33A9C80L});
    public static final BitSet FOLLOW_factor_in_factor951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_factor966 = new BitSet(new long[]{0x00000001A33A9C80L});
    public static final BitSet FOLLOW_factor_in_factor968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_factor983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_factor998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_comp_op0 = new BitSet(new long[]{0x0000000000000002L});

}