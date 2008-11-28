// $ANTLR 3.1.1 src/tr/fn/grammar/Fun.g 2008-11-28 05:00:30

package tr.fn.grammar;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class FunParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "APP", "ID", "DEFINE", "ENDEXPR", "HASH", "INT", "IF", "THEN", "ELSE", "LAMBDA", "RIGHTARROW", "LET", "IN", "LETREC", "LEFTPAREN", "RIGHTPAREN", "OR", "AND", "NOT", "PLUS", "MINUS", "STAR", "SLASH", "PERCENT", "LESS", "GREATER", "EQUAL", "GREATEREQUAL", "LESSEQUAL", "NOTEQUAL", "WS", "NL", "ML_COMMENT", "SL_COMMENT"
    };
    public static final int STAR=25;
    public static final int PERCENT=27;
    public static final int RIGHTARROW=14;
    public static final int ELSE=12;
    public static final int HASH=8;
    public static final int GREATEREQUAL=31;
    public static final int APP=4;
    public static final int INT=9;
    public static final int NOT=22;
    public static final int MINUS=24;
    public static final int AND=21;
    public static final int ID=5;
    public static final int DEFINE=6;
    public static final int EOF=-1;
    public static final int ENDEXPR=7;
    public static final int IF=10;
    public static final int NOTEQUAL=33;
    public static final int ML_COMMENT=36;
    public static final int LEFTPAREN=18;
    public static final int LETREC=17;
    public static final int WS=34;
    public static final int GREATER=29;
    public static final int SLASH=26;
    public static final int THEN=11;
    public static final int IN=16;
    public static final int RIGHTPAREN=19;
    public static final int EQUAL=30;
    public static final int SL_COMMENT=37;
    public static final int OR=20;
    public static final int LESS=28;
    public static final int PLUS=23;
    public static final int NL=35;
    public static final int LAMBDA=13;
    public static final int LESSEQUAL=32;
    public static final int LET=15;

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
    // src/tr/fn/grammar/Fun.g:27:1: program : ( decl )* EOF ;
    public final FunParser.program_return program() throws RecognitionException {
        FunParser.program_return retval = new FunParser.program_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EOF2=null;
        FunParser.decl_return decl1 = null;


        Object EOF2_tree=null;

        try {
            // src/tr/fn/grammar/Fun.g:27:12: ( ( decl )* EOF )
            // src/tr/fn/grammar/Fun.g:27:14: ( decl )* EOF
            {
            root_0 = (Object)adaptor.nil();

            // src/tr/fn/grammar/Fun.g:27:14: ( decl )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // src/tr/fn/grammar/Fun.g:27:14: decl
            	    {
            	    pushFollow(FOLLOW_decl_in_program70);
            	    decl1=decl();

            	    state._fsp--;

            	    adaptor.addChild(root_0, decl1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_program73); 
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
    // src/tr/fn/grammar/Fun.g:29:1: decl : fname ( ID )* DEFINE expr ENDEXPR -> ^( DEFINE fname expr ( ID )* ) ;
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
            // src/tr/fn/grammar/Fun.g:29:12: ( fname ( ID )* DEFINE expr ENDEXPR -> ^( DEFINE fname expr ( ID )* ) )
            // src/tr/fn/grammar/Fun.g:29:14: fname ( ID )* DEFINE expr ENDEXPR
            {
            pushFollow(FOLLOW_fname_in_decl87);
            fname3=fname();

            state._fsp--;

            stream_fname.add(fname3.getTree());
            // src/tr/fn/grammar/Fun.g:29:20: ( ID )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // src/tr/fn/grammar/Fun.g:29:20: ID
            	    {
            	    ID4=(Token)match(input,ID,FOLLOW_ID_in_decl89);  
            	    stream_ID.add(ID4);


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            DEFINE5=(Token)match(input,DEFINE,FOLLOW_DEFINE_in_decl92);  
            stream_DEFINE.add(DEFINE5);

            pushFollow(FOLLOW_expr_in_decl94);
            expr6=expr();

            state._fsp--;

            stream_expr.add(expr6.getTree());
            ENDEXPR7=(Token)match(input,ENDEXPR,FOLLOW_ENDEXPR_in_decl96);  
            stream_ENDEXPR.add(ENDEXPR7);



            // AST REWRITE
            // elements: DEFINE, expr, ID, fname
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 29:44: -> ^( DEFINE fname expr ( ID )* )
            {
                // src/tr/fn/grammar/Fun.g:29:47: ^( DEFINE fname expr ( ID )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_DEFINE.nextNode(), root_1);

                adaptor.addChild(root_1, stream_fname.nextTree());
                adaptor.addChild(root_1, stream_expr.nextTree());
                // src/tr/fn/grammar/Fun.g:29:67: ( ID )*
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
    // src/tr/fn/grammar/Fun.g:31:1: fname : ID ;
    public final FunParser.fname_return fname() throws RecognitionException {
        FunParser.fname_return retval = new FunParser.fname_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID8=null;

        Object ID8_tree=null;

        try {
            // src/tr/fn/grammar/Fun.g:31:12: ( ID )
            // src/tr/fn/grammar/Fun.g:31:14: ID
            {
            root_0 = (Object)adaptor.nil();

            ID8=(Token)match(input,ID,FOLLOW_ID_in_fname123); 
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
    // src/tr/fn/grammar/Fun.g:33:1: expr : single ( expr )? ;
    public final FunParser.expr_return expr() throws RecognitionException {
        FunParser.expr_return retval = new FunParser.expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        FunParser.single_return single9 = null;

        FunParser.expr_return expr10 = null;



        try {
            // src/tr/fn/grammar/Fun.g:33:12: ( single ( expr )? )
            // src/tr/fn/grammar/Fun.g:33:14: single ( expr )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_single_in_expr138);
            single9=single();

            state._fsp--;

            adaptor.addChild(root_0, single9.getTree());
            // src/tr/fn/grammar/Fun.g:33:21: ( expr )?
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // src/tr/fn/grammar/Fun.g:33:21: expr
                    {
                    pushFollow(FOLLOW_expr_in_expr140);
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
    // src/tr/fn/grammar/Fun.g:35:1: single : ( HASH INT expr | IF or THEN expr ELSE expr -> ^( IF or expr expr ) | LAMBDA ( ID )* RIGHTARROW expr -> ^( LAMBDA expr ( ID )* ) | LET ( decl )+ IN expr -> ^( LET expr ( decl )+ ) | LETREC ( decl )+ IN expr -> ^( LETREC expr ( decl )+ ) | LEFTPAREN expr RIGHTPAREN -> ^( expr ) | or );
    public final FunParser.single_return single() throws RecognitionException {
        FunParser.single_return retval = new FunParser.single_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token HASH11=null;
        Token INT12=null;
        Token IF14=null;
        Token THEN16=null;
        Token ELSE18=null;
        Token LAMBDA20=null;
        Token ID21=null;
        Token RIGHTARROW22=null;
        Token LET24=null;
        Token IN26=null;
        Token LETREC28=null;
        Token IN30=null;
        Token LEFTPAREN32=null;
        Token RIGHTPAREN34=null;
        FunParser.expr_return expr13 = null;

        FunParser.or_return or15 = null;

        FunParser.expr_return expr17 = null;

        FunParser.expr_return expr19 = null;

        FunParser.expr_return expr23 = null;

        FunParser.decl_return decl25 = null;

        FunParser.expr_return expr27 = null;

        FunParser.decl_return decl29 = null;

        FunParser.expr_return expr31 = null;

        FunParser.expr_return expr33 = null;

        FunParser.or_return or35 = null;


        Object HASH11_tree=null;
        Object INT12_tree=null;
        Object IF14_tree=null;
        Object THEN16_tree=null;
        Object ELSE18_tree=null;
        Object LAMBDA20_tree=null;
        Object ID21_tree=null;
        Object RIGHTARROW22_tree=null;
        Object LET24_tree=null;
        Object IN26_tree=null;
        Object LETREC28_tree=null;
        Object IN30_tree=null;
        Object LEFTPAREN32_tree=null;
        Object RIGHTPAREN34_tree=null;
        RewriteRuleTokenStream stream_LEFTPAREN=new RewriteRuleTokenStream(adaptor,"token LEFTPAREN");
        RewriteRuleTokenStream stream_LETREC=new RewriteRuleTokenStream(adaptor,"token LETREC");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_THEN=new RewriteRuleTokenStream(adaptor,"token THEN");
        RewriteRuleTokenStream stream_LAMBDA=new RewriteRuleTokenStream(adaptor,"token LAMBDA");
        RewriteRuleTokenStream stream_RIGHTPAREN=new RewriteRuleTokenStream(adaptor,"token RIGHTPAREN");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_LET=new RewriteRuleTokenStream(adaptor,"token LET");
        RewriteRuleTokenStream stream_RIGHTARROW=new RewriteRuleTokenStream(adaptor,"token RIGHTARROW");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_or=new RewriteRuleSubtreeStream(adaptor,"rule or");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_decl=new RewriteRuleSubtreeStream(adaptor,"rule decl");
        try {
            // src/tr/fn/grammar/Fun.g:35:12: ( HASH INT expr | IF or THEN expr ELSE expr -> ^( IF or expr expr ) | LAMBDA ( ID )* RIGHTARROW expr -> ^( LAMBDA expr ( ID )* ) | LET ( decl )+ IN expr -> ^( LET expr ( decl )+ ) | LETREC ( decl )+ IN expr -> ^( LETREC expr ( decl )+ ) | LEFTPAREN expr RIGHTPAREN -> ^( expr ) | or )
            int alt7=7;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // src/tr/fn/grammar/Fun.g:35:14: HASH INT expr
                    {
                    root_0 = (Object)adaptor.nil();

                    HASH11=(Token)match(input,HASH,FOLLOW_HASH_in_single165); 
                    HASH11_tree = (Object)adaptor.create(HASH11);
                    adaptor.addChild(root_0, HASH11_tree);

                    INT12=(Token)match(input,INT,FOLLOW_INT_in_single167); 
                    INT12_tree = (Object)adaptor.create(INT12);
                    adaptor.addChild(root_0, INT12_tree);

                    pushFollow(FOLLOW_expr_in_single169);
                    expr13=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr13.getTree());

                    }
                    break;
                case 2 :
                    // src/tr/fn/grammar/Fun.g:36:14: IF or THEN expr ELSE expr
                    {
                    IF14=(Token)match(input,IF,FOLLOW_IF_in_single184);  
                    stream_IF.add(IF14);

                    pushFollow(FOLLOW_or_in_single186);
                    or15=or();

                    state._fsp--;

                    stream_or.add(or15.getTree());
                    THEN16=(Token)match(input,THEN,FOLLOW_THEN_in_single188);  
                    stream_THEN.add(THEN16);

                    pushFollow(FOLLOW_expr_in_single190);
                    expr17=expr();

                    state._fsp--;

                    stream_expr.add(expr17.getTree());
                    ELSE18=(Token)match(input,ELSE,FOLLOW_ELSE_in_single192);  
                    stream_ELSE.add(ELSE18);

                    pushFollow(FOLLOW_expr_in_single194);
                    expr19=expr();

                    state._fsp--;

                    stream_expr.add(expr19.getTree());


                    // AST REWRITE
                    // elements: IF, expr, expr, or
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 36:42: -> ^( IF or expr expr )
                    {
                        // src/tr/fn/grammar/Fun.g:36:45: ^( IF or expr expr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_IF.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_or.nextTree());
                        adaptor.addChild(root_1, stream_expr.nextTree());
                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // src/tr/fn/grammar/Fun.g:37:14: LAMBDA ( ID )* RIGHTARROW expr
                    {
                    LAMBDA20=(Token)match(input,LAMBDA,FOLLOW_LAMBDA_in_single223);  
                    stream_LAMBDA.add(LAMBDA20);

                    // src/tr/fn/grammar/Fun.g:37:21: ( ID )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==ID) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // src/tr/fn/grammar/Fun.g:37:21: ID
                    	    {
                    	    ID21=(Token)match(input,ID,FOLLOW_ID_in_single225);  
                    	    stream_ID.add(ID21);


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    RIGHTARROW22=(Token)match(input,RIGHTARROW,FOLLOW_RIGHTARROW_in_single228);  
                    stream_RIGHTARROW.add(RIGHTARROW22);

                    pushFollow(FOLLOW_expr_in_single230);
                    expr23=expr();

                    state._fsp--;

                    stream_expr.add(expr23.getTree());


                    // AST REWRITE
                    // elements: expr, LAMBDA, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 37:42: -> ^( LAMBDA expr ( ID )* )
                    {
                        // src/tr/fn/grammar/Fun.g:37:45: ^( LAMBDA expr ( ID )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_LAMBDA.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());
                        // src/tr/fn/grammar/Fun.g:37:59: ( ID )*
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
                    // src/tr/fn/grammar/Fun.g:38:14: LET ( decl )+ IN expr
                    {
                    LET24=(Token)match(input,LET,FOLLOW_LET_in_single257);  
                    stream_LET.add(LET24);

                    // src/tr/fn/grammar/Fun.g:38:18: ( decl )+
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
                    	    // src/tr/fn/grammar/Fun.g:38:18: decl
                    	    {
                    	    pushFollow(FOLLOW_decl_in_single259);
                    	    decl25=decl();

                    	    state._fsp--;

                    	    stream_decl.add(decl25.getTree());

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

                    IN26=(Token)match(input,IN,FOLLOW_IN_in_single262);  
                    stream_IN.add(IN26);

                    pushFollow(FOLLOW_expr_in_single264);
                    expr27=expr();

                    state._fsp--;

                    stream_expr.add(expr27.getTree());


                    // AST REWRITE
                    // elements: LET, expr, decl
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 38:42: -> ^( LET expr ( decl )+ )
                    {
                        // src/tr/fn/grammar/Fun.g:38:45: ^( LET expr ( decl )+ )
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
                    // src/tr/fn/grammar/Fun.g:39:14: LETREC ( decl )+ IN expr
                    {
                    LETREC28=(Token)match(input,LETREC,FOLLOW_LETREC_in_single300);  
                    stream_LETREC.add(LETREC28);

                    // src/tr/fn/grammar/Fun.g:39:21: ( decl )+
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
                    	    // src/tr/fn/grammar/Fun.g:39:21: decl
                    	    {
                    	    pushFollow(FOLLOW_decl_in_single302);
                    	    decl29=decl();

                    	    state._fsp--;

                    	    stream_decl.add(decl29.getTree());

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

                    IN30=(Token)match(input,IN,FOLLOW_IN_in_single305);  
                    stream_IN.add(IN30);

                    pushFollow(FOLLOW_expr_in_single307);
                    expr31=expr();

                    state._fsp--;

                    stream_expr.add(expr31.getTree());


                    // AST REWRITE
                    // elements: decl, LETREC, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 39:42: -> ^( LETREC expr ( decl )+ )
                    {
                        // src/tr/fn/grammar/Fun.g:39:45: ^( LETREC expr ( decl )+ )
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
                    // src/tr/fn/grammar/Fun.g:40:14: LEFTPAREN expr RIGHTPAREN
                    {
                    LEFTPAREN32=(Token)match(input,LEFTPAREN,FOLLOW_LEFTPAREN_in_single340);  
                    stream_LEFTPAREN.add(LEFTPAREN32);

                    pushFollow(FOLLOW_expr_in_single342);
                    expr33=expr();

                    state._fsp--;

                    stream_expr.add(expr33.getTree());
                    RIGHTPAREN34=(Token)match(input,RIGHTPAREN,FOLLOW_RIGHTPAREN_in_single344);  
                    stream_RIGHTPAREN.add(RIGHTPAREN34);



                    // AST REWRITE
                    // elements: expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 40:42: -> ^( expr )
                    {
                        // src/tr/fn/grammar/Fun.g:40:45: ^( expr )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_expr.nextNode(), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    // src/tr/fn/grammar/Fun.g:41:14: or
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_or_in_single367);
                    or35=or();

                    state._fsp--;

                    adaptor.addChild(root_0, or35.getTree());

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

    public static class fapp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fapp"
    // src/tr/fn/grammar/Fun.g:43:1: fapp : fname ( farg )+ -> ^( APP fname ( farg )+ ) ;
    public final FunParser.fapp_return fapp() throws RecognitionException {
        FunParser.fapp_return retval = new FunParser.fapp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        FunParser.fname_return fname36 = null;

        FunParser.farg_return farg37 = null;


        RewriteRuleSubtreeStream stream_farg=new RewriteRuleSubtreeStream(adaptor,"rule farg");
        RewriteRuleSubtreeStream stream_fname=new RewriteRuleSubtreeStream(adaptor,"rule fname");
        try {
            // src/tr/fn/grammar/Fun.g:43:12: ( fname ( farg )+ -> ^( APP fname ( farg )+ ) )
            // src/tr/fn/grammar/Fun.g:43:14: fname ( farg )+
            {
            pushFollow(FOLLOW_fname_in_fapp382);
            fname36=fname();

            state._fsp--;

            stream_fname.add(fname36.getTree());
            // src/tr/fn/grammar/Fun.g:43:20: ( farg )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                alt8 = dfa8.predict(input);
                switch (alt8) {
            	case 1 :
            	    // src/tr/fn/grammar/Fun.g:43:20: farg
            	    {
            	    pushFollow(FOLLOW_farg_in_fapp384);
            	    farg37=farg();

            	    state._fsp--;

            	    stream_farg.add(farg37.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);



            // AST REWRITE
            // elements: fname, farg
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 43:26: -> ^( APP fname ( farg )+ )
            {
                // src/tr/fn/grammar/Fun.g:43:29: ^( APP fname ( farg )+ )
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
    // src/tr/fn/grammar/Fun.g:45:1: farg : ( LEFTPAREN expr RIGHTPAREN -> ^( expr ) | ID | INT );
    public final FunParser.farg_return farg() throws RecognitionException {
        FunParser.farg_return retval = new FunParser.farg_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LEFTPAREN38=null;
        Token RIGHTPAREN40=null;
        Token ID41=null;
        Token INT42=null;
        FunParser.expr_return expr39 = null;


        Object LEFTPAREN38_tree=null;
        Object RIGHTPAREN40_tree=null;
        Object ID41_tree=null;
        Object INT42_tree=null;
        RewriteRuleTokenStream stream_LEFTPAREN=new RewriteRuleTokenStream(adaptor,"token LEFTPAREN");
        RewriteRuleTokenStream stream_RIGHTPAREN=new RewriteRuleTokenStream(adaptor,"token RIGHTPAREN");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // src/tr/fn/grammar/Fun.g:45:12: ( LEFTPAREN expr RIGHTPAREN -> ^( expr ) | ID | INT )
            int alt9=3;
            switch ( input.LA(1) ) {
            case LEFTPAREN:
                {
                alt9=1;
                }
                break;
            case ID:
                {
                alt9=2;
                }
                break;
            case INT:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // src/tr/fn/grammar/Fun.g:45:14: LEFTPAREN expr RIGHTPAREN
                    {
                    LEFTPAREN38=(Token)match(input,LEFTPAREN,FOLLOW_LEFTPAREN_in_farg411);  
                    stream_LEFTPAREN.add(LEFTPAREN38);

                    pushFollow(FOLLOW_expr_in_farg413);
                    expr39=expr();

                    state._fsp--;

                    stream_expr.add(expr39.getTree());
                    RIGHTPAREN40=(Token)match(input,RIGHTPAREN,FOLLOW_RIGHTPAREN_in_farg415);  
                    stream_RIGHTPAREN.add(RIGHTPAREN40);



                    // AST REWRITE
                    // elements: expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 45:40: -> ^( expr )
                    {
                        // src/tr/fn/grammar/Fun.g:45:43: ^( expr )
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
                    // src/tr/fn/grammar/Fun.g:46:14: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID41=(Token)match(input,ID,FOLLOW_ID_in_farg436); 
                    ID41_tree = (Object)adaptor.create(ID41);
                    adaptor.addChild(root_0, ID41_tree);


                    }
                    break;
                case 3 :
                    // src/tr/fn/grammar/Fun.g:47:14: INT
                    {
                    root_0 = (Object)adaptor.nil();

                    INT42=(Token)match(input,INT,FOLLOW_INT_in_farg451); 
                    INT42_tree = (Object)adaptor.create(INT42);
                    adaptor.addChild(root_0, INT42_tree);


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
    // src/tr/fn/grammar/Fun.g:49:1: or : and ( OR and )* ;
    public final FunParser.or_return or() throws RecognitionException {
        FunParser.or_return retval = new FunParser.or_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OR44=null;
        FunParser.and_return and43 = null;

        FunParser.and_return and45 = null;


        Object OR44_tree=null;

        try {
            // src/tr/fn/grammar/Fun.g:49:12: ( and ( OR and )* )
            // src/tr/fn/grammar/Fun.g:49:14: and ( OR and )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_and_in_or468);
            and43=and();

            state._fsp--;

            adaptor.addChild(root_0, and43.getTree());
            // src/tr/fn/grammar/Fun.g:49:18: ( OR and )*
            loop10:
            do {
                int alt10=2;
                alt10 = dfa10.predict(input);
                switch (alt10) {
            	case 1 :
            	    // src/tr/fn/grammar/Fun.g:49:19: OR and
            	    {
            	    OR44=(Token)match(input,OR,FOLLOW_OR_in_or471); 
            	    OR44_tree = (Object)adaptor.create(OR44);
            	    root_0 = (Object)adaptor.becomeRoot(OR44_tree, root_0);

            	    pushFollow(FOLLOW_and_in_or474);
            	    and45=and();

            	    state._fsp--;

            	    adaptor.addChild(root_0, and45.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
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
    // src/tr/fn/grammar/Fun.g:51:1: and : not ( AND not )* ;
    public final FunParser.and_return and() throws RecognitionException {
        FunParser.and_return retval = new FunParser.and_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token AND47=null;
        FunParser.not_return not46 = null;

        FunParser.not_return not48 = null;


        Object AND47_tree=null;

        try {
            // src/tr/fn/grammar/Fun.g:51:12: ( not ( AND not )* )
            // src/tr/fn/grammar/Fun.g:51:14: not ( AND not )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_not_in_and492);
            not46=not();

            state._fsp--;

            adaptor.addChild(root_0, not46.getTree());
            // src/tr/fn/grammar/Fun.g:51:18: ( AND not )*
            loop11:
            do {
                int alt11=2;
                alt11 = dfa11.predict(input);
                switch (alt11) {
            	case 1 :
            	    // src/tr/fn/grammar/Fun.g:51:19: AND not
            	    {
            	    AND47=(Token)match(input,AND,FOLLOW_AND_in_and495); 
            	    AND47_tree = (Object)adaptor.create(AND47);
            	    root_0 = (Object)adaptor.becomeRoot(AND47_tree, root_0);

            	    pushFollow(FOLLOW_not_in_and498);
            	    not48=not();

            	    state._fsp--;

            	    adaptor.addChild(root_0, not48.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
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
    // src/tr/fn/grammar/Fun.g:53:1: not : ( NOT not | comp );
    public final FunParser.not_return not() throws RecognitionException {
        FunParser.not_return retval = new FunParser.not_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NOT49=null;
        FunParser.not_return not50 = null;

        FunParser.comp_return comp51 = null;


        Object NOT49_tree=null;

        try {
            // src/tr/fn/grammar/Fun.g:53:12: ( NOT not | comp )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==NOT) ) {
                alt12=1;
            }
            else if ( (LA12_0==ID||LA12_0==INT||(LA12_0>=PLUS && LA12_0<=MINUS)) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // src/tr/fn/grammar/Fun.g:53:14: NOT not
                    {
                    root_0 = (Object)adaptor.nil();

                    NOT49=(Token)match(input,NOT,FOLLOW_NOT_in_not516); 
                    NOT49_tree = (Object)adaptor.create(NOT49);
                    root_0 = (Object)adaptor.becomeRoot(NOT49_tree, root_0);

                    pushFollow(FOLLOW_not_in_not519);
                    not50=not();

                    state._fsp--;

                    adaptor.addChild(root_0, not50.getTree());

                    }
                    break;
                case 2 :
                    // src/tr/fn/grammar/Fun.g:54:14: comp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_comp_in_not534);
                    comp51=comp();

                    state._fsp--;

                    adaptor.addChild(root_0, comp51.getTree());

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
    // src/tr/fn/grammar/Fun.g:56:1: comp : arith ( comp_op arith )* ;
    public final FunParser.comp_return comp() throws RecognitionException {
        FunParser.comp_return retval = new FunParser.comp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        FunParser.arith_return arith52 = null;

        FunParser.comp_op_return comp_op53 = null;

        FunParser.arith_return arith54 = null;



        try {
            // src/tr/fn/grammar/Fun.g:56:12: ( arith ( comp_op arith )* )
            // src/tr/fn/grammar/Fun.g:56:14: arith ( comp_op arith )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_arith_in_comp560);
            arith52=arith();

            state._fsp--;

            adaptor.addChild(root_0, arith52.getTree());
            // src/tr/fn/grammar/Fun.g:56:20: ( comp_op arith )*
            loop13:
            do {
                int alt13=2;
                alt13 = dfa13.predict(input);
                switch (alt13) {
            	case 1 :
            	    // src/tr/fn/grammar/Fun.g:56:21: comp_op arith
            	    {
            	    pushFollow(FOLLOW_comp_op_in_comp563);
            	    comp_op53=comp_op();

            	    state._fsp--;

            	    root_0 = (Object)adaptor.becomeRoot(comp_op53.getTree(), root_0);
            	    pushFollow(FOLLOW_arith_in_comp566);
            	    arith54=arith();

            	    state._fsp--;

            	    adaptor.addChild(root_0, arith54.getTree());

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
    // $ANTLR end "comp"

    public static class arith_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arith"
    // src/tr/fn/grammar/Fun.g:58:1: arith : term ( ( PLUS | MINUS ) term )* ;
    public final FunParser.arith_return arith() throws RecognitionException {
        FunParser.arith_return retval = new FunParser.arith_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set56=null;
        FunParser.term_return term55 = null;

        FunParser.term_return term57 = null;


        Object set56_tree=null;

        try {
            // src/tr/fn/grammar/Fun.g:58:12: ( term ( ( PLUS | MINUS ) term )* )
            // src/tr/fn/grammar/Fun.g:58:14: term ( ( PLUS | MINUS ) term )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_term_in_arith589);
            term55=term();

            state._fsp--;

            adaptor.addChild(root_0, term55.getTree());
            // src/tr/fn/grammar/Fun.g:58:19: ( ( PLUS | MINUS ) term )*
            loop14:
            do {
                int alt14=2;
                alt14 = dfa14.predict(input);
                switch (alt14) {
            	case 1 :
            	    // src/tr/fn/grammar/Fun.g:58:20: ( PLUS | MINUS ) term
            	    {
            	    set56=(Token)input.LT(1);
            	    set56=(Token)input.LT(1);
            	    if ( (input.LA(1)>=PLUS && input.LA(1)<=MINUS) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set56), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_term_in_arith601);
            	    term57=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term57.getTree());

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
    // $ANTLR end "arith"

    public static class term_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "term"
    // src/tr/fn/grammar/Fun.g:60:1: term : factor ( ( STAR | SLASH | PERCENT ) factor )* ;
    public final FunParser.term_return term() throws RecognitionException {
        FunParser.term_return retval = new FunParser.term_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set59=null;
        FunParser.factor_return factor58 = null;

        FunParser.factor_return factor60 = null;


        Object set59_tree=null;

        try {
            // src/tr/fn/grammar/Fun.g:60:12: ( factor ( ( STAR | SLASH | PERCENT ) factor )* )
            // src/tr/fn/grammar/Fun.g:60:14: factor ( ( STAR | SLASH | PERCENT ) factor )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_factor_in_term625);
            factor58=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor58.getTree());
            // src/tr/fn/grammar/Fun.g:60:21: ( ( STAR | SLASH | PERCENT ) factor )*
            loop15:
            do {
                int alt15=2;
                alt15 = dfa15.predict(input);
                switch (alt15) {
            	case 1 :
            	    // src/tr/fn/grammar/Fun.g:60:22: ( STAR | SLASH | PERCENT ) factor
            	    {
            	    set59=(Token)input.LT(1);
            	    set59=(Token)input.LT(1);
            	    if ( (input.LA(1)>=STAR && input.LA(1)<=PERCENT) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set59), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_factor_in_term641);
            	    factor60=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor60.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // src/tr/fn/grammar/Fun.g:62:1: factor : ( fapp | PLUS factor | MINUS factor | INT | ID );
    public final FunParser.factor_return factor() throws RecognitionException {
        FunParser.factor_return retval = new FunParser.factor_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PLUS62=null;
        Token MINUS64=null;
        Token INT66=null;
        Token ID67=null;
        FunParser.fapp_return fapp61 = null;

        FunParser.factor_return factor63 = null;

        FunParser.factor_return factor65 = null;


        Object PLUS62_tree=null;
        Object MINUS64_tree=null;
        Object INT66_tree=null;
        Object ID67_tree=null;

        try {
            // src/tr/fn/grammar/Fun.g:62:12: ( fapp | PLUS factor | MINUS factor | INT | ID )
            int alt16=5;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // src/tr/fn/grammar/Fun.g:62:14: fapp
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_fapp_in_factor656);
                    fapp61=fapp();

                    state._fsp--;

                    adaptor.addChild(root_0, fapp61.getTree());

                    }
                    break;
                case 2 :
                    // src/tr/fn/grammar/Fun.g:63:14: PLUS factor
                    {
                    root_0 = (Object)adaptor.nil();

                    PLUS62=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor671); 
                    PLUS62_tree = (Object)adaptor.create(PLUS62);
                    adaptor.addChild(root_0, PLUS62_tree);

                    pushFollow(FOLLOW_factor_in_factor673);
                    factor63=factor();

                    state._fsp--;

                    adaptor.addChild(root_0, factor63.getTree());

                    }
                    break;
                case 3 :
                    // src/tr/fn/grammar/Fun.g:64:14: MINUS factor
                    {
                    root_0 = (Object)adaptor.nil();

                    MINUS64=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor688); 
                    MINUS64_tree = (Object)adaptor.create(MINUS64);
                    adaptor.addChild(root_0, MINUS64_tree);

                    pushFollow(FOLLOW_factor_in_factor690);
                    factor65=factor();

                    state._fsp--;

                    adaptor.addChild(root_0, factor65.getTree());

                    }
                    break;
                case 4 :
                    // src/tr/fn/grammar/Fun.g:65:14: INT
                    {
                    root_0 = (Object)adaptor.nil();

                    INT66=(Token)match(input,INT,FOLLOW_INT_in_factor705); 
                    INT66_tree = (Object)adaptor.create(INT66);
                    adaptor.addChild(root_0, INT66_tree);


                    }
                    break;
                case 5 :
                    // src/tr/fn/grammar/Fun.g:66:14: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID67=(Token)match(input,ID,FOLLOW_ID_in_factor720); 
                    ID67_tree = (Object)adaptor.create(ID67);
                    adaptor.addChild(root_0, ID67_tree);


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
    // src/tr/fn/grammar/Fun.g:68:1: comp_op : ( LESS | GREATER | EQUAL | GREATEREQUAL | LESSEQUAL | NOTEQUAL );
    public final FunParser.comp_op_return comp_op() throws RecognitionException {
        FunParser.comp_op_return retval = new FunParser.comp_op_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set68=null;

        Object set68_tree=null;

        try {
            // src/tr/fn/grammar/Fun.g:68:12: ( LESS | GREATER | EQUAL | GREATEREQUAL | LESSEQUAL | NOTEQUAL )
            // src/tr/fn/grammar/Fun.g:
            {
            root_0 = (Object)adaptor.nil();

            set68=(Token)input.LT(1);
            if ( (input.LA(1)>=LESS && input.LA(1)<=NOTEQUAL) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set68));
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
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA3_eotS =
        "\17\uffff";
    static final String DFA3_eofS =
        "\17\uffff";
    static final String DFA3_minS =
        "\1\5\16\uffff";
    static final String DFA3_maxS =
        "\1\30\16\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\13\1\1\2\2\uffff";
    static final String DFA3_specialS =
        "\17\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\10\1\uffff\1\14\1\1\1\13\1\2\1\uffff\1\14\1\3\1\uffff\1\4"+
            "\1\uffff\1\5\1\6\1\14\2\uffff\1\7\1\11\1\12",
            "",
            "",
            "",
            "",
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
            return "33:21: ( expr )?";
        }
    }
    static final String DFA7_eotS =
        "\14\uffff";
    static final String DFA7_eofS =
        "\14\uffff";
    static final String DFA7_minS =
        "\1\5\13\uffff";
    static final String DFA7_maxS =
        "\1\30\13\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\4\uffff";
    static final String DFA7_specialS =
        "\14\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\7\2\uffff\1\1\1\7\1\2\2\uffff\1\3\1\uffff\1\4\1\uffff\1\5"+
            "\1\6\3\uffff\3\7",
            "",
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
            return "35:1: single : ( HASH INT expr | IF or THEN expr ELSE expr -> ^( IF or expr expr ) | LAMBDA ( ID )* RIGHTARROW expr -> ^( LAMBDA expr ( ID )* ) | LET ( decl )+ IN expr -> ^( LET expr ( decl )+ ) | LETREC ( decl )+ IN expr -> ^( LETREC expr ( decl )+ ) | LEFTPAREN expr RIGHTPAREN -> ^( expr ) | or );";
        }
    }
    static final String DFA8_eotS =
        "\37\uffff";
    static final String DFA8_eofS =
        "\37\uffff";
    static final String DFA8_minS =
        "\1\5\13\uffff\1\5\22\uffff";
    static final String DFA8_maxS =
        "\1\41\13\uffff\1\30\22\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\2\14\uffff\1\1\1\uffff\1\1\3\uffff\13\1";
    static final String DFA8_specialS =
        "\37\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\16\1\uffff\2\1\1\20\4\1\1\uffff\1\1\1\uffff\1\1\1\14\17\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\33\2\uffff\1\24\1\36\1\25\2\uffff\1\26\1\uffff\1\27\1\uffff"+
            "\1\30\1\31\3\uffff\1\32\1\34\1\35",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()+ loopback of 43:20: ( farg )+";
        }
    }
    static final String DFA10_eotS =
        "\21\uffff";
    static final String DFA10_eofS =
        "\21\uffff";
    static final String DFA10_minS =
        "\1\5\20\uffff";
    static final String DFA10_maxS =
        "\1\30\20\uffff";
    static final String DFA10_acceptS =
        "\1\uffff\1\2\16\uffff\1\1";
    static final String DFA10_specialS =
        "\21\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\1\1\uffff\7\1\1\uffff\1\1\1\uffff\3\1\1\20\1\uffff\3\1",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 49:18: ( OR and )*";
        }
    }
    static final String DFA11_eotS =
        "\22\uffff";
    static final String DFA11_eofS =
        "\22\uffff";
    static final String DFA11_minS =
        "\1\5\21\uffff";
    static final String DFA11_maxS =
        "\1\30\21\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\2\17\uffff\1\1";
    static final String DFA11_specialS =
        "\22\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\1\1\uffff\7\1\1\uffff\1\1\1\uffff\4\1\1\21\3\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 51:18: ( AND not )*";
        }
    }
    static final String DFA13_eotS =
        "\23\uffff";
    static final String DFA13_eofS =
        "\23\uffff";
    static final String DFA13_minS =
        "\1\5\22\uffff";
    static final String DFA13_maxS =
        "\1\41\22\uffff";
    static final String DFA13_acceptS =
        "\1\uffff\1\2\20\uffff\1\1";
    static final String DFA13_specialS =
        "\23\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\1\1\uffff\7\1\1\uffff\1\1\1\uffff\10\1\3\uffff\6\22",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "()* loopback of 56:20: ( comp_op arith )*";
        }
    }
    static final String DFA14_eotS =
        "\33\uffff";
    static final String DFA14_eofS =
        "\33\uffff";
    static final String DFA14_minS =
        "\1\5\14\uffff\2\5\14\uffff";
    static final String DFA14_maxS =
        "\1\41\14\uffff\2\30\14\uffff";
    static final String DFA14_acceptS =
        "\1\uffff\1\2\21\uffff\10\1";
    static final String DFA14_specialS =
        "\33\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\1\1\uffff\7\1\1\uffff\1\1\1\uffff\6\1\1\15\1\16\3\uffff\6"+
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
            "\1\23\3\uffff\1\26\15\uffff\1\24\1\25",
            "\1\27\3\uffff\1\32\15\uffff\1\30\1\31",
            "",
            "",
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
            return "()* loopback of 58:19: ( ( PLUS | MINUS ) term )*";
        }
    }
    static final String DFA15_eotS =
        "\24\uffff";
    static final String DFA15_eofS =
        "\24\uffff";
    static final String DFA15_minS =
        "\1\5\23\uffff";
    static final String DFA15_maxS =
        "\1\41\23\uffff";
    static final String DFA15_acceptS =
        "\1\uffff\1\2\21\uffff\1\1";
    static final String DFA15_specialS =
        "\24\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\1\1\uffff\7\1\1\uffff\1\1\1\uffff\10\1\3\23\6\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "()* loopback of 60:21: ( ( STAR | SLASH | PERCENT ) factor )*";
        }
    }
    static final String DFA16_eotS =
        "\30\uffff";
    static final String DFA16_eofS =
        "\30\uffff";
    static final String DFA16_minS =
        "\2\5\26\uffff";
    static final String DFA16_maxS =
        "\1\30\1\41\26\uffff";
    static final String DFA16_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\12\uffff\1\1\1\uffff\1\1\1\uffff\1\1\3"+
        "\uffff";
    static final String DFA16_specialS =
        "\30\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\1\3\uffff\1\4\15\uffff\1\2\1\3",
            "\1\22\1\uffff\2\5\1\24\4\5\1\uffff\1\5\1\uffff\1\5\1\20\17"+
            "\5",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "62:1: factor : ( fapp | PLUS factor | MINUS factor | INT | ID );";
        }
    }
 

    public static final BitSet FOLLOW_decl_in_program70 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EOF_in_program73 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fname_in_decl87 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_ID_in_decl89 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_DEFINE_in_decl92 = new BitSet(new long[]{0x0000000001C6A720L});
    public static final BitSet FOLLOW_expr_in_decl94 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ENDEXPR_in_decl96 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_fname123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_single_in_expr138 = new BitSet(new long[]{0x0000000001C6A722L});
    public static final BitSet FOLLOW_expr_in_expr140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HASH_in_single165 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_INT_in_single167 = new BitSet(new long[]{0x0000000001C6A720L});
    public static final BitSet FOLLOW_expr_in_single169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_single184 = new BitSet(new long[]{0x0000000001C6A720L});
    public static final BitSet FOLLOW_or_in_single186 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_THEN_in_single188 = new BitSet(new long[]{0x0000000001C6A720L});
    public static final BitSet FOLLOW_expr_in_single190 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ELSE_in_single192 = new BitSet(new long[]{0x0000000001C6A720L});
    public static final BitSet FOLLOW_expr_in_single194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LAMBDA_in_single223 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_ID_in_single225 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_RIGHTARROW_in_single228 = new BitSet(new long[]{0x0000000001C6A720L});
    public static final BitSet FOLLOW_expr_in_single230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LET_in_single257 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_decl_in_single259 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_IN_in_single262 = new BitSet(new long[]{0x0000000001C6A720L});
    public static final BitSet FOLLOW_expr_in_single264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LETREC_in_single300 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_decl_in_single302 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_IN_in_single305 = new BitSet(new long[]{0x0000000001C6A720L});
    public static final BitSet FOLLOW_expr_in_single307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFTPAREN_in_single340 = new BitSet(new long[]{0x0000000001C6A720L});
    public static final BitSet FOLLOW_expr_in_single342 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RIGHTPAREN_in_single344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_or_in_single367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fname_in_fapp382 = new BitSet(new long[]{0x0000000000040220L});
    public static final BitSet FOLLOW_farg_in_fapp384 = new BitSet(new long[]{0x0000000000040222L});
    public static final BitSet FOLLOW_LEFTPAREN_in_farg411 = new BitSet(new long[]{0x0000000001C6A720L});
    public static final BitSet FOLLOW_expr_in_farg413 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RIGHTPAREN_in_farg415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_farg436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_farg451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_and_in_or468 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_OR_in_or471 = new BitSet(new long[]{0x0000000001C6A720L});
    public static final BitSet FOLLOW_and_in_or474 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_not_in_and492 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_AND_in_and495 = new BitSet(new long[]{0x0000000001C6A720L});
    public static final BitSet FOLLOW_not_in_and498 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_NOT_in_not516 = new BitSet(new long[]{0x0000000001C6A720L});
    public static final BitSet FOLLOW_not_in_not519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comp_in_not534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_in_comp560 = new BitSet(new long[]{0x00000003F0000002L});
    public static final BitSet FOLLOW_comp_op_in_comp563 = new BitSet(new long[]{0x0000000001C6A720L});
    public static final BitSet FOLLOW_arith_in_comp566 = new BitSet(new long[]{0x00000003F0000002L});
    public static final BitSet FOLLOW_term_in_arith589 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_set_in_arith592 = new BitSet(new long[]{0x0000000001C6A720L});
    public static final BitSet FOLLOW_term_in_arith601 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_factor_in_term625 = new BitSet(new long[]{0x000000000E000002L});
    public static final BitSet FOLLOW_set_in_term628 = new BitSet(new long[]{0x0000000001C6A720L});
    public static final BitSet FOLLOW_factor_in_term641 = new BitSet(new long[]{0x000000000E000002L});
    public static final BitSet FOLLOW_fapp_in_factor656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_factor671 = new BitSet(new long[]{0x0000000001C6A720L});
    public static final BitSet FOLLOW_factor_in_factor673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_factor688 = new BitSet(new long[]{0x0000000001C6A720L});
    public static final BitSet FOLLOW_factor_in_factor690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_factor705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_factor720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_comp_op0 = new BitSet(new long[]{0x0000000000000002L});

}