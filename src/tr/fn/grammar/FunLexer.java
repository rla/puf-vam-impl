// $ANTLR 3.1.1 src/tr/fn/grammar/Fun.g 2008-11-28 05:00:31

package tr.fn.grammar;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class FunLexer extends Lexer {
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
    public static final int EOF=-1;
    public static final int DEFINE=6;
    public static final int ENDEXPR=7;
    public static final int IF=10;
    public static final int NOTEQUAL=33;
    public static final int LEFTPAREN=18;
    public static final int ML_COMMENT=36;
    public static final int LETREC=17;
    public static final int SLASH=26;
    public static final int GREATER=29;
    public static final int WS=34;
    public static final int IN=16;
    public static final int THEN=11;
    public static final int RIGHTPAREN=19;
    public static final int EQUAL=30;
    public static final int OR=20;
    public static final int SL_COMMENT=37;
    public static final int LESS=28;
    public static final int PLUS=23;
    public static final int LAMBDA=13;
    public static final int NL=35;
    public static final int LESSEQUAL=32;
    public static final int LET=15;

    @Override
    public void reportError(RecognitionException e) {
        throw new RuntimeException(e);
    }


    // delegates
    // delegators

    public FunLexer() {;} 
    public FunLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public FunLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "src/tr/fn/grammar/Fun.g"; }

    // $ANTLR start "DEFINE"
    public final void mDEFINE() throws RecognitionException {
        try {
            int _type = DEFINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/tr/fn/grammar/Fun.g:75:12: ( '=' )
            // src/tr/fn/grammar/Fun.g:75:14: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEFINE"

    // $ANTLR start "LAMBDA"
    public final void mLAMBDA() throws RecognitionException {
        try {
            int _type = LAMBDA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/tr/fn/grammar/Fun.g:76:12: ( 'fn' )
            // src/tr/fn/grammar/Fun.g:76:14: 'fn'
            {
            match("fn"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LAMBDA"

    // $ANTLR start "RIGHTARROW"
    public final void mRIGHTARROW() throws RecognitionException {
        try {
            int _type = RIGHTARROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/tr/fn/grammar/Fun.g:77:12: ( '->' )
            // src/tr/fn/grammar/Fun.g:77:14: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RIGHTARROW"

    // $ANTLR start "LET"
    public final void mLET() throws RecognitionException {
        try {
            int _type = LET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/tr/fn/grammar/Fun.g:78:12: ( 'let' )
            // src/tr/fn/grammar/Fun.g:78:14: 'let'
            {
            match("let"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LET"

    // $ANTLR start "LETREC"
    public final void mLETREC() throws RecognitionException {
        try {
            int _type = LETREC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/tr/fn/grammar/Fun.g:79:12: ( 'letrec' )
            // src/tr/fn/grammar/Fun.g:79:14: 'letrec'
            {
            match("letrec"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LETREC"

    // $ANTLR start "IN"
    public final void mIN() throws RecognitionException {
        try {
            int _type = IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/tr/fn/grammar/Fun.g:80:12: ( 'in' )
            // src/tr/fn/grammar/Fun.g:80:14: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IN"

    // $ANTLR start "HASH"
    public final void mHASH() throws RecognitionException {
        try {
            int _type = HASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/tr/fn/grammar/Fun.g:81:12: ( '#' )
            // src/tr/fn/grammar/Fun.g:81:14: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HASH"

    // $ANTLR start "ENDEXPR"
    public final void mENDEXPR() throws RecognitionException {
        try {
            int _type = ENDEXPR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/tr/fn/grammar/Fun.g:82:12: ( ';' )
            // src/tr/fn/grammar/Fun.g:82:14: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ENDEXPR"

    // $ANTLR start "LEFTPAREN"
    public final void mLEFTPAREN() throws RecognitionException {
        try {
            int _type = LEFTPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/tr/fn/grammar/Fun.g:83:12: ( '(' )
            // src/tr/fn/grammar/Fun.g:83:14: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LEFTPAREN"

    // $ANTLR start "RIGHTPAREN"
    public final void mRIGHTPAREN() throws RecognitionException {
        try {
            int _type = RIGHTPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/tr/fn/grammar/Fun.g:84:12: ( ')' )
            // src/tr/fn/grammar/Fun.g:84:14: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RIGHTPAREN"

    // $ANTLR start "LESS"
    public final void mLESS() throws RecognitionException {
        try {
            int _type = LESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/tr/fn/grammar/Fun.g:86:14: ( '<' )
            // src/tr/fn/grammar/Fun.g:86:16: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LESS"

    // $ANTLR start "GREATER"
    public final void mGREATER() throws RecognitionException {
        try {
            int _type = GREATER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/tr/fn/grammar/Fun.g:87:14: ( '>' )
            // src/tr/fn/grammar/Fun.g:87:16: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GREATER"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/tr/fn/grammar/Fun.g:88:14: ( '==' )
            // src/tr/fn/grammar/Fun.g:88:16: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "NOTEQUAL"
    public final void mNOTEQUAL() throws RecognitionException {
        try {
            int _type = NOTEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/tr/fn/grammar/Fun.g:89:14: ( '!=' )
            // src/tr/fn/grammar/Fun.g:89:16: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOTEQUAL"

    // $ANTLR start "LESSEQUAL"
    public final void mLESSEQUAL() throws RecognitionException {
        try {
            int _type = LESSEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/tr/fn/grammar/Fun.g:90:14: ( '<=' )
            // src/tr/fn/grammar/Fun.g:90:16: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LESSEQUAL"

    // $ANTLR start "GREATEREQUAL"
    public final void mGREATEREQUAL() throws RecognitionException {
        try {
            int _type = GREATEREQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/tr/fn/grammar/Fun.g:91:14: ( '>=' )
            // src/tr/fn/grammar/Fun.g:91:16: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GREATEREQUAL"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/tr/fn/grammar/Fun.g:93:12: ( 'if' )
            // src/tr/fn/grammar/Fun.g:93:14: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "THEN"
    public final void mTHEN() throws RecognitionException {
        try {
            int _type = THEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/tr/fn/grammar/Fun.g:94:12: ( 'then' )
            // src/tr/fn/grammar/Fun.g:94:14: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THEN"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/tr/fn/grammar/Fun.g:95:12: ( 'else' )
            // src/tr/fn/grammar/Fun.g:95:14: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/tr/fn/grammar/Fun.g:97:12: ( 'not' )
            // src/tr/fn/grammar/Fun.g:97:14: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/tr/fn/grammar/Fun.g:98:12: ( '&&' )
            // src/tr/fn/grammar/Fun.g:98:14: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/tr/fn/grammar/Fun.g:99:12: ( '||' )
            // src/tr/fn/grammar/Fun.g:99:14: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/tr/fn/grammar/Fun.g:100:12: ( '+' )
            // src/tr/fn/grammar/Fun.g:100:14: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/tr/fn/grammar/Fun.g:101:12: ( '-' )
            // src/tr/fn/grammar/Fun.g:101:14: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "STAR"
    public final void mSTAR() throws RecognitionException {
        try {
            int _type = STAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/tr/fn/grammar/Fun.g:102:12: ( '*' )
            // src/tr/fn/grammar/Fun.g:102:14: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STAR"

    // $ANTLR start "SLASH"
    public final void mSLASH() throws RecognitionException {
        try {
            int _type = SLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/tr/fn/grammar/Fun.g:103:12: ( '/' )
            // src/tr/fn/grammar/Fun.g:103:14: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SLASH"

    // $ANTLR start "PERCENT"
    public final void mPERCENT() throws RecognitionException {
        try {
            int _type = PERCENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/tr/fn/grammar/Fun.g:104:12: ( '%' )
            // src/tr/fn/grammar/Fun.g:104:14: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PERCENT"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/tr/fn/grammar/Fun.g:105:12: ( ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) )+ )
            // src/tr/fn/grammar/Fun.g:105:14: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) )+
            {
            // src/tr/fn/grammar/Fun.g:105:14: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }
                else if ( ((LA1_0>='A' && LA1_0<='Z')) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // src/tr/fn/grammar/Fun.g:105:15: ( 'a' .. 'z' )
            	    {
            	    // src/tr/fn/grammar/Fun.g:105:15: ( 'a' .. 'z' )
            	    // src/tr/fn/grammar/Fun.g:105:16: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

            	    }


            	    }
            	    break;
            	case 2 :
            	    // src/tr/fn/grammar/Fun.g:105:30: ( 'A' .. 'Z' )
            	    {
            	    // src/tr/fn/grammar/Fun.g:105:30: ( 'A' .. 'Z' )
            	    // src/tr/fn/grammar/Fun.g:105:31: 'A' .. 'Z'
            	    {
            	    matchRange('A','Z'); 

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/tr/fn/grammar/Fun.g:106:12: ( ( '0' .. '9' )+ )
            // src/tr/fn/grammar/Fun.g:106:14: ( '0' .. '9' )+
            {
            // src/tr/fn/grammar/Fun.g:106:14: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // src/tr/fn/grammar/Fun.g:106:14: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/tr/fn/grammar/Fun.g:107:12: ( ( ' ' | '\\t' )+ )
            // src/tr/fn/grammar/Fun.g:107:14: ( ' ' | '\\t' )+
            {
            // src/tr/fn/grammar/Fun.g:107:14: ( ' ' | '\\t' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\t'||LA3_0==' ') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // src/tr/fn/grammar/Fun.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

             skip(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "NL"
    public final void mNL() throws RecognitionException {
        try {
            int _type = NL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/tr/fn/grammar/Fun.g:108:12: ( ( ( '\\r' )? '\\n' )+ )
            // src/tr/fn/grammar/Fun.g:108:14: ( ( '\\r' )? '\\n' )+
            {
            // src/tr/fn/grammar/Fun.g:108:14: ( ( '\\r' )? '\\n' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\n'||LA5_0=='\r') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // src/tr/fn/grammar/Fun.g:108:15: ( '\\r' )? '\\n'
            	    {
            	    // src/tr/fn/grammar/Fun.g:108:15: ( '\\r' )?
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0=='\r') ) {
            	        alt4=1;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // src/tr/fn/grammar/Fun.g:108:15: '\\r'
            	            {
            	            match('\r'); 

            	            }
            	            break;

            	    }

            	    match('\n'); 

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

             skip(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NL"

    // $ANTLR start "ML_COMMENT"
    public final void mML_COMMENT() throws RecognitionException {
        try {
            int _type = ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/tr/fn/grammar/Fun.g:110:12: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // src/tr/fn/grammar/Fun.g:110:14: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // src/tr/fn/grammar/Fun.g:110:19: ( options {greedy=false; } : . )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='*') ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1=='/') ) {
                        alt6=2;
                    }
                    else if ( ((LA6_1>='\u0000' && LA6_1<='.')||(LA6_1>='0' && LA6_1<='\uFFFF')) ) {
                        alt6=1;
                    }


                }
                else if ( ((LA6_0>='\u0000' && LA6_0<=')')||(LA6_0>='+' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // src/tr/fn/grammar/Fun.g:110:46: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match("*/"); 

             skip(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ML_COMMENT"

    // $ANTLR start "SL_COMMENT"
    public final void mSL_COMMENT() throws RecognitionException {
        try {
            int _type = SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/tr/fn/grammar/Fun.g:111:12: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r\\n' | '\\r' | '\\n' ) | '//' (~ ( '\\n' | '\\r' ) )* )
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // src/tr/fn/grammar/Fun.g:111:14: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r\\n' | '\\r' | '\\n' )
                    {
                    match("//"); 

                    // src/tr/fn/grammar/Fun.g:111:19: (~ ( '\\n' | '\\r' ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='\uFFFF')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // src/tr/fn/grammar/Fun.g:111:19: ~ ( '\\n' | '\\r' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    // src/tr/fn/grammar/Fun.g:111:33: ( '\\r\\n' | '\\r' | '\\n' )
                    int alt8=3;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='\r') ) {
                        int LA8_1 = input.LA(2);

                        if ( (LA8_1=='\n') ) {
                            alt8=1;
                        }
                        else {
                            alt8=2;}
                    }
                    else if ( (LA8_0=='\n') ) {
                        alt8=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;
                    }
                    switch (alt8) {
                        case 1 :
                            // src/tr/fn/grammar/Fun.g:111:34: '\\r\\n'
                            {
                            match("\r\n"); 


                            }
                            break;
                        case 2 :
                            // src/tr/fn/grammar/Fun.g:111:43: '\\r'
                            {
                            match('\r'); 

                            }
                            break;
                        case 3 :
                            // src/tr/fn/grammar/Fun.g:111:50: '\\n'
                            {
                            match('\n'); 

                            }
                            break;

                    }

                     skip(); 

                    }
                    break;
                case 2 :
                    // src/tr/fn/grammar/Fun.g:112:14: '//' (~ ( '\\n' | '\\r' ) )*
                    {
                    match("//"); 

                    // src/tr/fn/grammar/Fun.g:112:19: (~ ( '\\n' | '\\r' ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // src/tr/fn/grammar/Fun.g:112:19: ~ ( '\\n' | '\\r' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                     skip(); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SL_COMMENT"

    public void mTokens() throws RecognitionException {
        // src/tr/fn/grammar/Fun.g:1:8: ( DEFINE | LAMBDA | RIGHTARROW | LET | LETREC | IN | HASH | ENDEXPR | LEFTPAREN | RIGHTPAREN | LESS | GREATER | EQUAL | NOTEQUAL | LESSEQUAL | GREATEREQUAL | IF | THEN | ELSE | NOT | AND | OR | PLUS | MINUS | STAR | SLASH | PERCENT | ID | INT | WS | NL | ML_COMMENT | SL_COMMENT )
        int alt11=33;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // src/tr/fn/grammar/Fun.g:1:10: DEFINE
                {
                mDEFINE(); 

                }
                break;
            case 2 :
                // src/tr/fn/grammar/Fun.g:1:17: LAMBDA
                {
                mLAMBDA(); 

                }
                break;
            case 3 :
                // src/tr/fn/grammar/Fun.g:1:24: RIGHTARROW
                {
                mRIGHTARROW(); 

                }
                break;
            case 4 :
                // src/tr/fn/grammar/Fun.g:1:35: LET
                {
                mLET(); 

                }
                break;
            case 5 :
                // src/tr/fn/grammar/Fun.g:1:39: LETREC
                {
                mLETREC(); 

                }
                break;
            case 6 :
                // src/tr/fn/grammar/Fun.g:1:46: IN
                {
                mIN(); 

                }
                break;
            case 7 :
                // src/tr/fn/grammar/Fun.g:1:49: HASH
                {
                mHASH(); 

                }
                break;
            case 8 :
                // src/tr/fn/grammar/Fun.g:1:54: ENDEXPR
                {
                mENDEXPR(); 

                }
                break;
            case 9 :
                // src/tr/fn/grammar/Fun.g:1:62: LEFTPAREN
                {
                mLEFTPAREN(); 

                }
                break;
            case 10 :
                // src/tr/fn/grammar/Fun.g:1:72: RIGHTPAREN
                {
                mRIGHTPAREN(); 

                }
                break;
            case 11 :
                // src/tr/fn/grammar/Fun.g:1:83: LESS
                {
                mLESS(); 

                }
                break;
            case 12 :
                // src/tr/fn/grammar/Fun.g:1:88: GREATER
                {
                mGREATER(); 

                }
                break;
            case 13 :
                // src/tr/fn/grammar/Fun.g:1:96: EQUAL
                {
                mEQUAL(); 

                }
                break;
            case 14 :
                // src/tr/fn/grammar/Fun.g:1:102: NOTEQUAL
                {
                mNOTEQUAL(); 

                }
                break;
            case 15 :
                // src/tr/fn/grammar/Fun.g:1:111: LESSEQUAL
                {
                mLESSEQUAL(); 

                }
                break;
            case 16 :
                // src/tr/fn/grammar/Fun.g:1:121: GREATEREQUAL
                {
                mGREATEREQUAL(); 

                }
                break;
            case 17 :
                // src/tr/fn/grammar/Fun.g:1:134: IF
                {
                mIF(); 

                }
                break;
            case 18 :
                // src/tr/fn/grammar/Fun.g:1:137: THEN
                {
                mTHEN(); 

                }
                break;
            case 19 :
                // src/tr/fn/grammar/Fun.g:1:142: ELSE
                {
                mELSE(); 

                }
                break;
            case 20 :
                // src/tr/fn/grammar/Fun.g:1:147: NOT
                {
                mNOT(); 

                }
                break;
            case 21 :
                // src/tr/fn/grammar/Fun.g:1:151: AND
                {
                mAND(); 

                }
                break;
            case 22 :
                // src/tr/fn/grammar/Fun.g:1:155: OR
                {
                mOR(); 

                }
                break;
            case 23 :
                // src/tr/fn/grammar/Fun.g:1:158: PLUS
                {
                mPLUS(); 

                }
                break;
            case 24 :
                // src/tr/fn/grammar/Fun.g:1:163: MINUS
                {
                mMINUS(); 

                }
                break;
            case 25 :
                // src/tr/fn/grammar/Fun.g:1:169: STAR
                {
                mSTAR(); 

                }
                break;
            case 26 :
                // src/tr/fn/grammar/Fun.g:1:174: SLASH
                {
                mSLASH(); 

                }
                break;
            case 27 :
                // src/tr/fn/grammar/Fun.g:1:180: PERCENT
                {
                mPERCENT(); 

                }
                break;
            case 28 :
                // src/tr/fn/grammar/Fun.g:1:188: ID
                {
                mID(); 

                }
                break;
            case 29 :
                // src/tr/fn/grammar/Fun.g:1:191: INT
                {
                mINT(); 

                }
                break;
            case 30 :
                // src/tr/fn/grammar/Fun.g:1:195: WS
                {
                mWS(); 

                }
                break;
            case 31 :
                // src/tr/fn/grammar/Fun.g:1:198: NL
                {
                mNL(); 

                }
                break;
            case 32 :
                // src/tr/fn/grammar/Fun.g:1:201: ML_COMMENT
                {
                mML_COMMENT(); 

                }
                break;
            case 33 :
                // src/tr/fn/grammar/Fun.g:1:212: SL_COMMENT
                {
                mSL_COMMENT(); 

                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA10_eotS =
        "\2\uffff\2\4\2\uffff";
    static final String DFA10_eofS =
        "\6\uffff";
    static final String DFA10_minS =
        "\2\57\2\0\2\uffff";
    static final String DFA10_maxS =
        "\2\57\2\uffff\2\uffff";
    static final String DFA10_acceptS =
        "\4\uffff\1\2\1\1";
    static final String DFA10_specialS =
        "\2\uffff\1\0\1\1\2\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\1",
            "\1\2",
            "\12\3\1\5\2\3\1\5\ufff2\3",
            "\12\3\1\5\2\3\1\5\ufff2\3",
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
            return "111:1: SL_COMMENT : ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r\\n' | '\\r' | '\\n' ) | '//' (~ ( '\\n' | '\\r' ) )* );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_2 = input.LA(1);

                        s = -1;
                        if ( ((LA10_2>='\u0000' && LA10_2<='\t')||(LA10_2>='\u000B' && LA10_2<='\f')||(LA10_2>='\u000E' && LA10_2<='\uFFFF')) ) {s = 3;}

                        else if ( (LA10_2=='\n'||LA10_2=='\r') ) {s = 5;}

                        else s = 4;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA10_3 = input.LA(1);

                        s = -1;
                        if ( (LA10_3=='\n'||LA10_3=='\r') ) {s = 5;}

                        else if ( ((LA10_3>='\u0000' && LA10_3<='\t')||(LA10_3>='\u000B' && LA10_3<='\f')||(LA10_3>='\u000E' && LA10_3<='\uFFFF')) ) {s = 3;}

                        else s = 4;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 10, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA11_eotS =
        "\1\uffff\1\33\1\26\1\36\2\26\4\uffff\1\43\1\45\1\uffff\3\26\4\uffff"+
        "\1\53\7\uffff\1\54\2\uffff\1\26\1\56\1\57\4\uffff\3\26\4\uffff\1"+
        "\64\2\uffff\2\26\1\67\1\26\1\uffff\1\71\1\72\1\uffff\1\26\2\uffff"+
        "\1\74\1\uffff";
    static final String DFA11_eofS =
        "\75\uffff";
    static final String DFA11_minS =
        "\1\11\1\75\1\156\1\76\1\145\1\146\4\uffff\2\75\1\uffff\1\150\1\154"+
        "\1\157\4\uffff\1\52\7\uffff\1\101\2\uffff\1\164\2\101\4\uffff\1"+
        "\145\1\163\1\164\4\uffff\1\101\2\uffff\1\156\1\145\1\101\1\145\1"+
        "\uffff\2\101\1\uffff\1\143\2\uffff\1\101\1\uffff";
    static final String DFA11_maxS =
        "\1\174\1\75\1\156\1\76\1\145\1\156\4\uffff\2\75\1\uffff\1\150\1"+
        "\154\1\157\4\uffff\1\57\7\uffff\1\172\2\uffff\1\164\2\172\4\uffff"+
        "\1\145\1\163\1\164\4\uffff\1\172\2\uffff\1\156\1\145\1\172\1\145"+
        "\1\uffff\2\172\1\uffff\1\143\2\uffff\1\172\1\uffff";
    static final String DFA11_acceptS =
        "\6\uffff\1\7\1\10\1\11\1\12\2\uffff\1\16\3\uffff\1\25\1\26\1\27"+
        "\1\31\1\uffff\1\33\1\34\1\35\1\36\1\37\1\15\1\1\1\uffff\1\3\1\30"+
        "\3\uffff\1\17\1\13\1\20\1\14\3\uffff\1\40\1\41\1\32\1\2\1\uffff"+
        "\1\6\1\21\4\uffff\1\4\2\uffff\1\24\1\uffff\1\22\1\23\1\uffff\1\5";
    static final String DFA11_specialS =
        "\75\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\30\1\31\2\uffff\1\31\22\uffff\1\30\1\14\1\uffff\1\6\1\uffff"+
            "\1\25\1\20\1\uffff\1\10\1\11\1\23\1\22\1\uffff\1\3\1\uffff\1"+
            "\24\12\27\1\uffff\1\7\1\12\1\1\1\13\2\uffff\32\26\6\uffff\4"+
            "\26\1\16\1\2\2\26\1\5\2\26\1\4\1\26\1\17\5\26\1\15\6\26\1\uffff"+
            "\1\21",
            "\1\32",
            "\1\34",
            "\1\35",
            "\1\37",
            "\1\41\7\uffff\1\40",
            "",
            "",
            "",
            "",
            "\1\42",
            "\1\44",
            "",
            "\1\46",
            "\1\47",
            "\1\50",
            "",
            "",
            "",
            "",
            "\1\51\4\uffff\1\52",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\32\26\6\uffff\32\26",
            "",
            "",
            "\1\55",
            "\32\26\6\uffff\32\26",
            "\32\26\6\uffff\32\26",
            "",
            "",
            "",
            "",
            "\1\60",
            "\1\61",
            "\1\62",
            "",
            "",
            "",
            "",
            "\32\26\6\uffff\21\26\1\63\10\26",
            "",
            "",
            "\1\65",
            "\1\66",
            "\32\26\6\uffff\32\26",
            "\1\70",
            "",
            "\32\26\6\uffff\32\26",
            "\32\26\6\uffff\32\26",
            "",
            "\1\73",
            "",
            "",
            "\32\26\6\uffff\32\26",
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
            return "1:1: Tokens : ( DEFINE | LAMBDA | RIGHTARROW | LET | LETREC | IN | HASH | ENDEXPR | LEFTPAREN | RIGHTPAREN | LESS | GREATER | EQUAL | NOTEQUAL | LESSEQUAL | GREATEREQUAL | IF | THEN | ELSE | NOT | AND | OR | PLUS | MINUS | STAR | SLASH | PERCENT | ID | INT | WS | NL | ML_COMMENT | SL_COMMENT );";
        }
    }
 

}