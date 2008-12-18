// $ANTLR 3.1.1 src/tr/fn/grammar/Fun.g 2008-12-18 16:32:58

package tr.fn.grammar;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class FunLexer extends Lexer {
    public static final int STAR=33;
    public static final int RIGHTARROW=16;
    public static final int APP=4;
    public static final int GREATEREQUAL=39;
    public static final int NOT=29;
    public static final int AND=28;
    public static final int ID=7;
    public static final int DEFINE=8;
    public static final int EOF=-1;
    public static final int ENDEXPR=9;
    public static final int IF=12;
    public static final int NOTEQUAL=41;
    public static final int LEFTPAREN=25;
    public static final int ML_COMMENT=44;
    public static final int EMPTY_LIST=20;
    public static final int TUPLE=5;
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

    // $ANTLR start "OPEN_SQUARE"
    public final void mOPEN_SQUARE() throws RecognitionException {
        try {
            int _type = OPEN_SQUARE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/tr/fn/grammar/Fun.g:95:14: ( '[' )
            // src/tr/fn/grammar/Fun.g:95:16: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OPEN_SQUARE"

    // $ANTLR start "CLOSE_SQUARE"
    public final void mCLOSE_SQUARE() throws RecognitionException {
        try {
            int _type = CLOSE_SQUARE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/tr/fn/grammar/Fun.g:96:14: ( ']' )
            // src/tr/fn/grammar/Fun.g:96:16: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLOSE_SQUARE"

    // $ANTLR start "EMPTY_TUPLE"
    public final void mEMPTY_TUPLE() throws RecognitionException {
        try {
            int _type = EMPTY_TUPLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/tr/fn/grammar/Fun.g:97:14: ( '()' )
            // src/tr/fn/grammar/Fun.g:97:16: '()'
            {
            match("()"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EMPTY_TUPLE"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/tr/fn/grammar/Fun.g:98:14: ( ',' )
            // src/tr/fn/grammar/Fun.g:98:16: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "EMPTY_LIST"
    public final void mEMPTY_LIST() throws RecognitionException {
        try {
            int _type = EMPTY_LIST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/tr/fn/grammar/Fun.g:99:14: ( '[]' )
            // src/tr/fn/grammar/Fun.g:99:16: '[]'
            {
            match("[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EMPTY_LIST"

    // $ANTLR start "CONS"
    public final void mCONS() throws RecognitionException {
        try {
            int _type = CONS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/tr/fn/grammar/Fun.g:100:14: ( ':' )
            // src/tr/fn/grammar/Fun.g:100:16: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONS"

    // $ANTLR start "DEFINE"
    public final void mDEFINE() throws RecognitionException {
        try {
            int _type = DEFINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/tr/fn/grammar/Fun.g:101:14: ( '=' )
            // src/tr/fn/grammar/Fun.g:101:16: '='
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
            // src/tr/fn/grammar/Fun.g:102:14: ( 'fn' )
            // src/tr/fn/grammar/Fun.g:102:16: 'fn'
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
            // src/tr/fn/grammar/Fun.g:103:14: ( '->' )
            // src/tr/fn/grammar/Fun.g:103:16: '->'
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
            // src/tr/fn/grammar/Fun.g:104:14: ( 'let' )
            // src/tr/fn/grammar/Fun.g:104:16: 'let'
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
            // src/tr/fn/grammar/Fun.g:105:14: ( 'letrec' )
            // src/tr/fn/grammar/Fun.g:105:16: 'letrec'
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
            // src/tr/fn/grammar/Fun.g:106:14: ( 'in' )
            // src/tr/fn/grammar/Fun.g:106:16: 'in'
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
            // src/tr/fn/grammar/Fun.g:107:14: ( '#' )
            // src/tr/fn/grammar/Fun.g:107:16: '#'
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
            // src/tr/fn/grammar/Fun.g:108:14: ( ';' )
            // src/tr/fn/grammar/Fun.g:108:16: ';'
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
            // src/tr/fn/grammar/Fun.g:109:14: ( '(' )
            // src/tr/fn/grammar/Fun.g:109:16: '('
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
            // src/tr/fn/grammar/Fun.g:110:14: ( ')' )
            // src/tr/fn/grammar/Fun.g:110:16: ')'
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
            // src/tr/fn/grammar/Fun.g:112:14: ( '<' )
            // src/tr/fn/grammar/Fun.g:112:16: '<'
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
            // src/tr/fn/grammar/Fun.g:113:14: ( '>' )
            // src/tr/fn/grammar/Fun.g:113:16: '>'
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
            // src/tr/fn/grammar/Fun.g:114:14: ( '==' )
            // src/tr/fn/grammar/Fun.g:114:16: '=='
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
            // src/tr/fn/grammar/Fun.g:115:14: ( '!=' )
            // src/tr/fn/grammar/Fun.g:115:16: '!='
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
            // src/tr/fn/grammar/Fun.g:116:14: ( '<=' )
            // src/tr/fn/grammar/Fun.g:116:16: '<='
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
            // src/tr/fn/grammar/Fun.g:117:14: ( '>=' )
            // src/tr/fn/grammar/Fun.g:117:16: '>='
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
            // src/tr/fn/grammar/Fun.g:119:12: ( 'if' )
            // src/tr/fn/grammar/Fun.g:119:14: 'if'
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
            // src/tr/fn/grammar/Fun.g:120:12: ( 'then' )
            // src/tr/fn/grammar/Fun.g:120:14: 'then'
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
            // src/tr/fn/grammar/Fun.g:121:12: ( 'else' )
            // src/tr/fn/grammar/Fun.g:121:14: 'else'
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
            // src/tr/fn/grammar/Fun.g:123:12: ( 'not' )
            // src/tr/fn/grammar/Fun.g:123:14: 'not'
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
            // src/tr/fn/grammar/Fun.g:124:12: ( '&&' )
            // src/tr/fn/grammar/Fun.g:124:14: '&&'
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
            // src/tr/fn/grammar/Fun.g:125:12: ( '||' )
            // src/tr/fn/grammar/Fun.g:125:14: '||'
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
            // src/tr/fn/grammar/Fun.g:126:12: ( '+' )
            // src/tr/fn/grammar/Fun.g:126:14: '+'
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
            // src/tr/fn/grammar/Fun.g:127:12: ( '-' )
            // src/tr/fn/grammar/Fun.g:127:14: '-'
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
            // src/tr/fn/grammar/Fun.g:128:12: ( '*' )
            // src/tr/fn/grammar/Fun.g:128:14: '*'
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
            // src/tr/fn/grammar/Fun.g:129:12: ( '/' )
            // src/tr/fn/grammar/Fun.g:129:14: '/'
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
            // src/tr/fn/grammar/Fun.g:130:12: ( '%' )
            // src/tr/fn/grammar/Fun.g:130:14: '%'
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
            // src/tr/fn/grammar/Fun.g:131:12: ( ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) ) ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | ( '0' .. '9' ) )* )
            // src/tr/fn/grammar/Fun.g:131:14: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) ) ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | ( '0' .. '9' ) )*
            {
            // src/tr/fn/grammar/Fun.g:131:14: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>='a' && LA1_0<='z')) ) {
                alt1=1;
            }
            else if ( ((LA1_0>='A' && LA1_0<='Z')) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // src/tr/fn/grammar/Fun.g:131:15: ( 'a' .. 'z' )
                    {
                    // src/tr/fn/grammar/Fun.g:131:15: ( 'a' .. 'z' )
                    // src/tr/fn/grammar/Fun.g:131:16: 'a' .. 'z'
                    {
                    matchRange('a','z'); 

                    }


                    }
                    break;
                case 2 :
                    // src/tr/fn/grammar/Fun.g:131:30: ( 'A' .. 'Z' )
                    {
                    // src/tr/fn/grammar/Fun.g:131:30: ( 'A' .. 'Z' )
                    // src/tr/fn/grammar/Fun.g:131:31: 'A' .. 'Z'
                    {
                    matchRange('A','Z'); 

                    }


                    }
                    break;

            }

            // src/tr/fn/grammar/Fun.g:131:44: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | ( '0' .. '9' ) )*
            loop2:
            do {
                int alt2=4;
                switch ( input.LA(1) ) {
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt2=1;
                    }
                    break;
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    {
                    alt2=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    {
                    alt2=3;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // src/tr/fn/grammar/Fun.g:131:45: ( 'a' .. 'z' )
            	    {
            	    // src/tr/fn/grammar/Fun.g:131:45: ( 'a' .. 'z' )
            	    // src/tr/fn/grammar/Fun.g:131:46: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

            	    }


            	    }
            	    break;
            	case 2 :
            	    // src/tr/fn/grammar/Fun.g:131:60: ( 'A' .. 'Z' )
            	    {
            	    // src/tr/fn/grammar/Fun.g:131:60: ( 'A' .. 'Z' )
            	    // src/tr/fn/grammar/Fun.g:131:61: 'A' .. 'Z'
            	    {
            	    matchRange('A','Z'); 

            	    }


            	    }
            	    break;
            	case 3 :
            	    // src/tr/fn/grammar/Fun.g:131:75: ( '0' .. '9' )
            	    {
            	    // src/tr/fn/grammar/Fun.g:131:75: ( '0' .. '9' )
            	    // src/tr/fn/grammar/Fun.g:131:76: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
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
            // src/tr/fn/grammar/Fun.g:132:12: ( ( '0' .. '9' )+ )
            // src/tr/fn/grammar/Fun.g:132:14: ( '0' .. '9' )+
            {
            // src/tr/fn/grammar/Fun.g:132:14: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // src/tr/fn/grammar/Fun.g:132:14: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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
            // src/tr/fn/grammar/Fun.g:133:12: ( ( ' ' | '\\t' )+ )
            // src/tr/fn/grammar/Fun.g:133:14: ( ' ' | '\\t' )+
            {
            // src/tr/fn/grammar/Fun.g:133:14: ( ' ' | '\\t' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\t'||LA4_0==' ') ) {
                    alt4=1;
                }


                switch (alt4) {
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
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
            // src/tr/fn/grammar/Fun.g:134:12: ( ( ( '\\r' )? '\\n' )+ )
            // src/tr/fn/grammar/Fun.g:134:14: ( ( '\\r' )? '\\n' )+
            {
            // src/tr/fn/grammar/Fun.g:134:14: ( ( '\\r' )? '\\n' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='\n'||LA6_0=='\r') ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // src/tr/fn/grammar/Fun.g:134:15: ( '\\r' )? '\\n'
            	    {
            	    // src/tr/fn/grammar/Fun.g:134:15: ( '\\r' )?
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0=='\r') ) {
            	        alt5=1;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // src/tr/fn/grammar/Fun.g:134:15: '\\r'
            	            {
            	            match('\r'); 

            	            }
            	            break;

            	    }

            	    match('\n'); 

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
            // src/tr/fn/grammar/Fun.g:136:12: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // src/tr/fn/grammar/Fun.g:136:14: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // src/tr/fn/grammar/Fun.g:136:19: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // src/tr/fn/grammar/Fun.g:136:46: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
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
            // src/tr/fn/grammar/Fun.g:137:12: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r\\n' | '\\r' | '\\n' ) | '//' (~ ( '\\n' | '\\r' ) )* )
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // src/tr/fn/grammar/Fun.g:137:14: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r\\n' | '\\r' | '\\n' )
                    {
                    match("//"); 

                    // src/tr/fn/grammar/Fun.g:137:19: (~ ( '\\n' | '\\r' ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // src/tr/fn/grammar/Fun.g:137:19: ~ ( '\\n' | '\\r' )
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
                    	    break loop8;
                        }
                    } while (true);

                    // src/tr/fn/grammar/Fun.g:137:33: ( '\\r\\n' | '\\r' | '\\n' )
                    int alt9=3;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        int LA9_1 = input.LA(2);

                        if ( (LA9_1=='\n') ) {
                            alt9=1;
                        }
                        else {
                            alt9=2;}
                    }
                    else if ( (LA9_0=='\n') ) {
                        alt9=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }
                    switch (alt9) {
                        case 1 :
                            // src/tr/fn/grammar/Fun.g:137:34: '\\r\\n'
                            {
                            match("\r\n"); 


                            }
                            break;
                        case 2 :
                            // src/tr/fn/grammar/Fun.g:137:43: '\\r'
                            {
                            match('\r'); 

                            }
                            break;
                        case 3 :
                            // src/tr/fn/grammar/Fun.g:137:50: '\\n'
                            {
                            match('\n'); 

                            }
                            break;

                    }

                     skip(); 

                    }
                    break;
                case 2 :
                    // src/tr/fn/grammar/Fun.g:138:14: '//' (~ ( '\\n' | '\\r' ) )*
                    {
                    match("//"); 

                    // src/tr/fn/grammar/Fun.g:138:19: (~ ( '\\n' | '\\r' ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // src/tr/fn/grammar/Fun.g:138:19: ~ ( '\\n' | '\\r' )
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
                    	    break loop10;
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
        // src/tr/fn/grammar/Fun.g:1:8: ( OPEN_SQUARE | CLOSE_SQUARE | EMPTY_TUPLE | COMMA | EMPTY_LIST | CONS | DEFINE | LAMBDA | RIGHTARROW | LET | LETREC | IN | HASH | ENDEXPR | LEFTPAREN | RIGHTPAREN | LESS | GREATER | EQUAL | NOTEQUAL | LESSEQUAL | GREATEREQUAL | IF | THEN | ELSE | NOT | AND | OR | PLUS | MINUS | STAR | SLASH | PERCENT | ID | INT | WS | NL | ML_COMMENT | SL_COMMENT )
        int alt12=39;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // src/tr/fn/grammar/Fun.g:1:10: OPEN_SQUARE
                {
                mOPEN_SQUARE(); 

                }
                break;
            case 2 :
                // src/tr/fn/grammar/Fun.g:1:22: CLOSE_SQUARE
                {
                mCLOSE_SQUARE(); 

                }
                break;
            case 3 :
                // src/tr/fn/grammar/Fun.g:1:35: EMPTY_TUPLE
                {
                mEMPTY_TUPLE(); 

                }
                break;
            case 4 :
                // src/tr/fn/grammar/Fun.g:1:47: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 5 :
                // src/tr/fn/grammar/Fun.g:1:53: EMPTY_LIST
                {
                mEMPTY_LIST(); 

                }
                break;
            case 6 :
                // src/tr/fn/grammar/Fun.g:1:64: CONS
                {
                mCONS(); 

                }
                break;
            case 7 :
                // src/tr/fn/grammar/Fun.g:1:69: DEFINE
                {
                mDEFINE(); 

                }
                break;
            case 8 :
                // src/tr/fn/grammar/Fun.g:1:76: LAMBDA
                {
                mLAMBDA(); 

                }
                break;
            case 9 :
                // src/tr/fn/grammar/Fun.g:1:83: RIGHTARROW
                {
                mRIGHTARROW(); 

                }
                break;
            case 10 :
                // src/tr/fn/grammar/Fun.g:1:94: LET
                {
                mLET(); 

                }
                break;
            case 11 :
                // src/tr/fn/grammar/Fun.g:1:98: LETREC
                {
                mLETREC(); 

                }
                break;
            case 12 :
                // src/tr/fn/grammar/Fun.g:1:105: IN
                {
                mIN(); 

                }
                break;
            case 13 :
                // src/tr/fn/grammar/Fun.g:1:108: HASH
                {
                mHASH(); 

                }
                break;
            case 14 :
                // src/tr/fn/grammar/Fun.g:1:113: ENDEXPR
                {
                mENDEXPR(); 

                }
                break;
            case 15 :
                // src/tr/fn/grammar/Fun.g:1:121: LEFTPAREN
                {
                mLEFTPAREN(); 

                }
                break;
            case 16 :
                // src/tr/fn/grammar/Fun.g:1:131: RIGHTPAREN
                {
                mRIGHTPAREN(); 

                }
                break;
            case 17 :
                // src/tr/fn/grammar/Fun.g:1:142: LESS
                {
                mLESS(); 

                }
                break;
            case 18 :
                // src/tr/fn/grammar/Fun.g:1:147: GREATER
                {
                mGREATER(); 

                }
                break;
            case 19 :
                // src/tr/fn/grammar/Fun.g:1:155: EQUAL
                {
                mEQUAL(); 

                }
                break;
            case 20 :
                // src/tr/fn/grammar/Fun.g:1:161: NOTEQUAL
                {
                mNOTEQUAL(); 

                }
                break;
            case 21 :
                // src/tr/fn/grammar/Fun.g:1:170: LESSEQUAL
                {
                mLESSEQUAL(); 

                }
                break;
            case 22 :
                // src/tr/fn/grammar/Fun.g:1:180: GREATEREQUAL
                {
                mGREATEREQUAL(); 

                }
                break;
            case 23 :
                // src/tr/fn/grammar/Fun.g:1:193: IF
                {
                mIF(); 

                }
                break;
            case 24 :
                // src/tr/fn/grammar/Fun.g:1:196: THEN
                {
                mTHEN(); 

                }
                break;
            case 25 :
                // src/tr/fn/grammar/Fun.g:1:201: ELSE
                {
                mELSE(); 

                }
                break;
            case 26 :
                // src/tr/fn/grammar/Fun.g:1:206: NOT
                {
                mNOT(); 

                }
                break;
            case 27 :
                // src/tr/fn/grammar/Fun.g:1:210: AND
                {
                mAND(); 

                }
                break;
            case 28 :
                // src/tr/fn/grammar/Fun.g:1:214: OR
                {
                mOR(); 

                }
                break;
            case 29 :
                // src/tr/fn/grammar/Fun.g:1:217: PLUS
                {
                mPLUS(); 

                }
                break;
            case 30 :
                // src/tr/fn/grammar/Fun.g:1:222: MINUS
                {
                mMINUS(); 

                }
                break;
            case 31 :
                // src/tr/fn/grammar/Fun.g:1:228: STAR
                {
                mSTAR(); 

                }
                break;
            case 32 :
                // src/tr/fn/grammar/Fun.g:1:233: SLASH
                {
                mSLASH(); 

                }
                break;
            case 33 :
                // src/tr/fn/grammar/Fun.g:1:239: PERCENT
                {
                mPERCENT(); 

                }
                break;
            case 34 :
                // src/tr/fn/grammar/Fun.g:1:247: ID
                {
                mID(); 

                }
                break;
            case 35 :
                // src/tr/fn/grammar/Fun.g:1:250: INT
                {
                mINT(); 

                }
                break;
            case 36 :
                // src/tr/fn/grammar/Fun.g:1:254: WS
                {
                mWS(); 

                }
                break;
            case 37 :
                // src/tr/fn/grammar/Fun.g:1:257: NL
                {
                mNL(); 

                }
                break;
            case 38 :
                // src/tr/fn/grammar/Fun.g:1:260: ML_COMMENT
                {
                mML_COMMENT(); 

                }
                break;
            case 39 :
                // src/tr/fn/grammar/Fun.g:1:271: SL_COMMENT
                {
                mSL_COMMENT(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA11_eotS =
        "\2\uffff\2\5\2\uffff";
    static final String DFA11_eofS =
        "\6\uffff";
    static final String DFA11_minS =
        "\2\57\2\0\2\uffff";
    static final String DFA11_maxS =
        "\2\57\2\uffff\2\uffff";
    static final String DFA11_acceptS =
        "\4\uffff\1\1\1\2";
    static final String DFA11_specialS =
        "\2\uffff\1\1\1\0\2\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\1",
            "\1\2",
            "\12\3\1\4\2\3\1\4\ufff2\3",
            "\12\3\1\4\2\3\1\4\ufff2\3",
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
            return "137:1: SL_COMMENT : ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r\\n' | '\\r' | '\\n' ) | '//' (~ ( '\\n' | '\\r' ) )* );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_3 = input.LA(1);

                        s = -1;
                        if ( ((LA11_3>='\u0000' && LA11_3<='\t')||(LA11_3>='\u000B' && LA11_3<='\f')||(LA11_3>='\u000E' && LA11_3<='\uFFFF')) ) {s = 3;}

                        else if ( (LA11_3=='\n'||LA11_3=='\r') ) {s = 4;}

                        else s = 5;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_2 = input.LA(1);

                        s = -1;
                        if ( ((LA11_2>='\u0000' && LA11_2<='\t')||(LA11_2>='\u000B' && LA11_2<='\f')||(LA11_2>='\u000E' && LA11_2<='\uFFFF')) ) {s = 3;}

                        else if ( (LA11_2=='\n'||LA11_2=='\r') ) {s = 4;}

                        else s = 5;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA12_eotS =
        "\1\uffff\1\37\1\uffff\1\41\2\uffff\1\43\1\32\1\46\2\32\3\uffff"+
        "\1\53\1\55\1\uffff\3\32\4\uffff\1\63\13\uffff\1\64\2\uffff\1\32"+
        "\1\66\1\67\4\uffff\3\32\4\uffff\1\74\2\uffff\2\32\1\77\1\32\1\uffff"+
        "\1\101\1\102\1\uffff\1\32\2\uffff\1\104\1\uffff";
    static final String DFA12_eofS =
        "\105\uffff";
    static final String DFA12_minS =
        "\1\11\1\135\1\uffff\1\51\2\uffff\1\75\1\156\1\76\1\145\1\146\3"+
        "\uffff\2\75\1\uffff\1\150\1\154\1\157\4\uffff\1\52\13\uffff\1\60"+
        "\2\uffff\1\164\2\60\4\uffff\1\145\1\163\1\164\4\uffff\1\60\2\uffff"+
        "\1\156\1\145\1\60\1\145\1\uffff\2\60\1\uffff\1\143\2\uffff\1\60"+
        "\1\uffff";
    static final String DFA12_maxS =
        "\1\174\1\135\1\uffff\1\51\2\uffff\1\75\1\156\1\76\1\145\1\156\3"+
        "\uffff\2\75\1\uffff\1\150\1\154\1\157\4\uffff\1\57\13\uffff\1\172"+
        "\2\uffff\1\164\2\172\4\uffff\1\145\1\163\1\164\4\uffff\1\172\2\uffff"+
        "\1\156\1\145\1\172\1\145\1\uffff\2\172\1\uffff\1\143\2\uffff\1\172"+
        "\1\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\1\uffff\1\4\1\6\5\uffff\1\15\1\16\1\20\2\uffff\1\24"+
        "\3\uffff\1\33\1\34\1\35\1\37\1\uffff\1\41\1\42\1\43\1\44\1\45\1"+
        "\5\1\1\1\3\1\17\1\23\1\7\1\uffff\1\11\1\36\3\uffff\1\25\1\21\1\26"+
        "\1\22\3\uffff\1\46\1\47\1\40\1\10\1\uffff\1\14\1\27\4\uffff\1\12"+
        "\2\uffff\1\32\1\uffff\1\30\1\31\1\uffff\1\13";
    static final String DFA12_specialS =
        "\105\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\34\1\35\2\uffff\1\35\22\uffff\1\34\1\20\1\uffff\1\13\1\uffff"+
            "\1\31\1\24\1\uffff\1\3\1\15\1\27\1\26\1\4\1\10\1\uffff\1\30"+
            "\12\33\1\5\1\14\1\16\1\6\1\17\2\uffff\32\32\1\1\1\uffff\1\2"+
            "\3\uffff\4\32\1\22\1\7\2\32\1\12\2\32\1\11\1\32\1\23\5\32\1"+
            "\21\6\32\1\uffff\1\25",
            "\1\36",
            "",
            "\1\40",
            "",
            "",
            "\1\42",
            "\1\44",
            "\1\45",
            "\1\47",
            "\1\51\7\uffff\1\50",
            "",
            "",
            "",
            "\1\52",
            "\1\54",
            "",
            "\1\56",
            "\1\57",
            "\1\60",
            "",
            "",
            "",
            "",
            "\1\61\4\uffff\1\62",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            "",
            "",
            "\1\65",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            "",
            "",
            "",
            "",
            "\1\70",
            "\1\71",
            "\1\72",
            "",
            "",
            "",
            "",
            "\12\32\7\uffff\32\32\6\uffff\21\32\1\73\10\32",
            "",
            "",
            "\1\75",
            "\1\76",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            "\1\100",
            "",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            "",
            "\1\103",
            "",
            "",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( OPEN_SQUARE | CLOSE_SQUARE | EMPTY_TUPLE | COMMA | EMPTY_LIST | CONS | DEFINE | LAMBDA | RIGHTARROW | LET | LETREC | IN | HASH | ENDEXPR | LEFTPAREN | RIGHTPAREN | LESS | GREATER | EQUAL | NOTEQUAL | LESSEQUAL | GREATEREQUAL | IF | THEN | ELSE | NOT | AND | OR | PLUS | MINUS | STAR | SLASH | PERCENT | ID | INT | WS | NL | ML_COMMENT | SL_COMMENT );";
        }
    }
 

}