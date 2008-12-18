// $ANTLR 3.1.1 src/tr/fn/grammar/Puf.g 2008-12-18 04:42:00

package tr.fn.grammar;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class PufLexer extends Lexer {
    public static final int STAR=23;
    public static final int FLHS=16;
    public static final int CASE=13;
    public static final int APP=4;
    public static final int GREATEREQUAL=31;
    public static final int AND=19;
    public static final int ID=27;
    public static final int DEFINE=14;
    public static final int EOF=-1;
    public static final int IF=11;
    public static final int NOTEQUAL=33;
    public static final int T__55=55;
    public static final int ML_COMMENT=36;
    public static final int TUPLE=5;
    public static final int LETREC=10;
    public static final int T__51=51;
    public static final int GREATER=29;
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
    public static final int OR=18;
    public static final int SL_COMMENT=37;
    public static final int LESSEQUAL=32;
    public static final int LET=9;

    @Override
    public void reportError(RecognitionException e) {
        throw new RuntimeException(e);
    }


    // delegates
    // delegators

    public PufLexer() {;} 
    public PufLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public PufLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "src/tr/fn/grammar/Puf.g"; }

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/tr/fn/grammar/Puf.g:13:7: ( '=' )
            // src/tr/fn/grammar/Puf.g:13:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/tr/fn/grammar/Puf.g:14:7: ( ';' )
            // src/tr/fn/grammar/Puf.g:14:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/tr/fn/grammar/Puf.g:15:7: ( '(' )
            // src/tr/fn/grammar/Puf.g:15:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/tr/fn/grammar/Puf.g:16:7: ( ',' )
            // src/tr/fn/grammar/Puf.g:16:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/tr/fn/grammar/Puf.g:17:7: ( ')' )
            // src/tr/fn/grammar/Puf.g:17:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/tr/fn/grammar/Puf.g:18:7: ( 'let' )
            // src/tr/fn/grammar/Puf.g:18:9: 'let'
            {
            match("let"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/tr/fn/grammar/Puf.g:19:7: ( 'in' )
            // src/tr/fn/grammar/Puf.g:19:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/tr/fn/grammar/Puf.g:20:7: ( 'if' )
            // src/tr/fn/grammar/Puf.g:20:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/tr/fn/grammar/Puf.g:21:7: ( 'then' )
            // src/tr/fn/grammar/Puf.g:21:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/tr/fn/grammar/Puf.g:22:7: ( 'else' )
            // src/tr/fn/grammar/Puf.g:22:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/tr/fn/grammar/Puf.g:23:7: ( '[' )
            // src/tr/fn/grammar/Puf.g:23:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/tr/fn/grammar/Puf.g:24:7: ( ']' )
            // src/tr/fn/grammar/Puf.g:24:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/tr/fn/grammar/Puf.g:25:7: ( 'fn' )
            // src/tr/fn/grammar/Puf.g:25:9: 'fn'
            {
            match("fn"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/tr/fn/grammar/Puf.g:26:7: ( '->' )
            // src/tr/fn/grammar/Puf.g:26:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/tr/fn/grammar/Puf.g:27:7: ( 'letrec' )
            // src/tr/fn/grammar/Puf.g:27:9: 'letrec'
            {
            match("letrec"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/tr/fn/grammar/Puf.g:28:7: ( 'case' )
            // src/tr/fn/grammar/Puf.g:28:9: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/tr/fn/grammar/Puf.g:29:7: ( 'of' )
            // src/tr/fn/grammar/Puf.g:29:9: 'of'
            {
            match("of"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/tr/fn/grammar/Puf.g:30:7: ( '[]' )
            // src/tr/fn/grammar/Puf.g:30:9: '[]'
            {
            match("[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "LESS"
    public final void mLESS() throws RecognitionException {
        try {
            int _type = LESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/tr/fn/grammar/Puf.g:218:14: ( '<' )
            // src/tr/fn/grammar/Puf.g:218:16: '<'
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
            // src/tr/fn/grammar/Puf.g:219:14: ( '>' )
            // src/tr/fn/grammar/Puf.g:219:16: '>'
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
            // src/tr/fn/grammar/Puf.g:220:14: ( '==' )
            // src/tr/fn/grammar/Puf.g:220:16: '=='
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
            // src/tr/fn/grammar/Puf.g:221:14: ( '!=' )
            // src/tr/fn/grammar/Puf.g:221:16: '!='
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
            // src/tr/fn/grammar/Puf.g:222:14: ( '<=' )
            // src/tr/fn/grammar/Puf.g:222:16: '<='
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
            // src/tr/fn/grammar/Puf.g:223:14: ( '>=' )
            // src/tr/fn/grammar/Puf.g:223:16: '>='
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

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/tr/fn/grammar/Puf.g:225:14: ( '&&' )
            // src/tr/fn/grammar/Puf.g:225:16: '&&'
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
            // src/tr/fn/grammar/Puf.g:226:14: ( '||' )
            // src/tr/fn/grammar/Puf.g:226:16: '||'
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
            // src/tr/fn/grammar/Puf.g:227:14: ( '+' )
            // src/tr/fn/grammar/Puf.g:227:16: '+'
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
            // src/tr/fn/grammar/Puf.g:228:14: ( '-' )
            // src/tr/fn/grammar/Puf.g:228:16: '-'
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
            // src/tr/fn/grammar/Puf.g:229:14: ( '*' )
            // src/tr/fn/grammar/Puf.g:229:16: '*'
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
            // src/tr/fn/grammar/Puf.g:230:14: ( '/' )
            // src/tr/fn/grammar/Puf.g:230:16: '/'
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
            // src/tr/fn/grammar/Puf.g:231:14: ( '%' )
            // src/tr/fn/grammar/Puf.g:231:16: '%'
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

    // $ANTLR start "CONS"
    public final void mCONS() throws RecognitionException {
        try {
            int _type = CONS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/tr/fn/grammar/Puf.g:232:14: ( ':' )
            // src/tr/fn/grammar/Puf.g:232:16: ':'
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

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/tr/fn/grammar/Puf.g:234:14: ( ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) ) ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | ( '0' .. '9' ) )* | '#' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>='A' && LA3_0<='Z')||(LA3_0>='a' && LA3_0<='z')) ) {
                alt3=1;
            }
            else if ( (LA3_0=='#') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // src/tr/fn/grammar/Puf.g:234:16: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) ) ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | ( '0' .. '9' ) )*
                    {
                    // src/tr/fn/grammar/Puf.g:234:16: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) )
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
                            // src/tr/fn/grammar/Puf.g:234:17: ( 'a' .. 'z' )
                            {
                            // src/tr/fn/grammar/Puf.g:234:17: ( 'a' .. 'z' )
                            // src/tr/fn/grammar/Puf.g:234:18: 'a' .. 'z'
                            {
                            matchRange('a','z'); 

                            }


                            }
                            break;
                        case 2 :
                            // src/tr/fn/grammar/Puf.g:234:32: ( 'A' .. 'Z' )
                            {
                            // src/tr/fn/grammar/Puf.g:234:32: ( 'A' .. 'Z' )
                            // src/tr/fn/grammar/Puf.g:234:33: 'A' .. 'Z'
                            {
                            matchRange('A','Z'); 

                            }


                            }
                            break;

                    }

                    // src/tr/fn/grammar/Puf.g:234:46: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | ( '0' .. '9' ) )*
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
                    	    // src/tr/fn/grammar/Puf.g:234:47: ( 'a' .. 'z' )
                    	    {
                    	    // src/tr/fn/grammar/Puf.g:234:47: ( 'a' .. 'z' )
                    	    // src/tr/fn/grammar/Puf.g:234:48: 'a' .. 'z'
                    	    {
                    	    matchRange('a','z'); 

                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // src/tr/fn/grammar/Puf.g:234:62: ( 'A' .. 'Z' )
                    	    {
                    	    // src/tr/fn/grammar/Puf.g:234:62: ( 'A' .. 'Z' )
                    	    // src/tr/fn/grammar/Puf.g:234:63: 'A' .. 'Z'
                    	    {
                    	    matchRange('A','Z'); 

                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // src/tr/fn/grammar/Puf.g:234:77: ( '0' .. '9' )
                    	    {
                    	    // src/tr/fn/grammar/Puf.g:234:77: ( '0' .. '9' )
                    	    // src/tr/fn/grammar/Puf.g:234:78: '0' .. '9'
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
                    break;
                case 2 :
                    // src/tr/fn/grammar/Puf.g:235:16: '#'
                    {
                    match('#'); 

                    }
                    break;

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
            // src/tr/fn/grammar/Puf.g:237:14: ( ( '0' .. '9' )+ )
            // src/tr/fn/grammar/Puf.g:237:16: ( '0' .. '9' )+
            {
            // src/tr/fn/grammar/Puf.g:237:16: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // src/tr/fn/grammar/Puf.g:237:17: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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
            // src/tr/fn/grammar/Puf.g:239:14: ( ( ' ' | '\\t' )+ )
            // src/tr/fn/grammar/Puf.g:239:16: ( ' ' | '\\t' )+
            {
            // src/tr/fn/grammar/Puf.g:239:16: ( ' ' | '\\t' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\t'||LA5_0==' ') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // src/tr/fn/grammar/Puf.g:
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
    // $ANTLR end "WS"

    // $ANTLR start "NL"
    public final void mNL() throws RecognitionException {
        try {
            int _type = NL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // src/tr/fn/grammar/Puf.g:241:14: ( ( ( '\\r' )? '\\n' )+ )
            // src/tr/fn/grammar/Puf.g:241:16: ( ( '\\r' )? '\\n' )+
            {
            // src/tr/fn/grammar/Puf.g:241:16: ( ( '\\r' )? '\\n' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='\n'||LA7_0=='\r') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // src/tr/fn/grammar/Puf.g:241:17: ( '\\r' )? '\\n'
            	    {
            	    // src/tr/fn/grammar/Puf.g:241:17: ( '\\r' )?
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0=='\r') ) {
            	        alt6=1;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // src/tr/fn/grammar/Puf.g:241:17: '\\r'
            	            {
            	            match('\r'); 

            	            }
            	            break;

            	    }

            	    match('\n'); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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
            // src/tr/fn/grammar/Puf.g:243:14: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // src/tr/fn/grammar/Puf.g:243:16: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // src/tr/fn/grammar/Puf.g:243:21: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // src/tr/fn/grammar/Puf.g:243:48: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
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
            // src/tr/fn/grammar/Puf.g:245:14: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r\\n' | '\\r' | '\\n' ) | '//' (~ ( '\\n' | '\\r' ) )* )
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // src/tr/fn/grammar/Puf.g:245:16: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r\\n' | '\\r' | '\\n' )
                    {
                    match("//"); 

                    // src/tr/fn/grammar/Puf.g:245:21: (~ ( '\\n' | '\\r' ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // src/tr/fn/grammar/Puf.g:245:21: ~ ( '\\n' | '\\r' )
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

                    // src/tr/fn/grammar/Puf.g:245:35: ( '\\r\\n' | '\\r' | '\\n' )
                    int alt10=3;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        int LA10_1 = input.LA(2);

                        if ( (LA10_1=='\n') ) {
                            alt10=1;
                        }
                        else {
                            alt10=2;}
                    }
                    else if ( (LA10_0=='\n') ) {
                        alt10=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;
                    }
                    switch (alt10) {
                        case 1 :
                            // src/tr/fn/grammar/Puf.g:245:36: '\\r\\n'
                            {
                            match("\r\n"); 


                            }
                            break;
                        case 2 :
                            // src/tr/fn/grammar/Puf.g:245:45: '\\r'
                            {
                            match('\r'); 

                            }
                            break;
                        case 3 :
                            // src/tr/fn/grammar/Puf.g:245:52: '\\n'
                            {
                            match('\n'); 

                            }
                            break;

                    }

                     skip(); 

                    }
                    break;
                case 2 :
                    // src/tr/fn/grammar/Puf.g:246:16: '//' (~ ( '\\n' | '\\r' ) )*
                    {
                    match("//"); 

                    // src/tr/fn/grammar/Puf.g:246:21: (~ ( '\\n' | '\\r' ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // src/tr/fn/grammar/Puf.g:246:21: ~ ( '\\n' | '\\r' )
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
                    	    break loop11;
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
        // src/tr/fn/grammar/Puf.g:1:8: ( T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | LESS | GREATER | EQUAL | NOTEQUAL | LESSEQUAL | GREATEREQUAL | AND | OR | PLUS | MINUS | STAR | SLASH | PERCENT | CONS | ID | INT | WS | NL | ML_COMMENT | SL_COMMENT )
        int alt13=38;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // src/tr/fn/grammar/Puf.g:1:10: T__38
                {
                mT__38(); 

                }
                break;
            case 2 :
                // src/tr/fn/grammar/Puf.g:1:16: T__39
                {
                mT__39(); 

                }
                break;
            case 3 :
                // src/tr/fn/grammar/Puf.g:1:22: T__40
                {
                mT__40(); 

                }
                break;
            case 4 :
                // src/tr/fn/grammar/Puf.g:1:28: T__41
                {
                mT__41(); 

                }
                break;
            case 5 :
                // src/tr/fn/grammar/Puf.g:1:34: T__42
                {
                mT__42(); 

                }
                break;
            case 6 :
                // src/tr/fn/grammar/Puf.g:1:40: T__43
                {
                mT__43(); 

                }
                break;
            case 7 :
                // src/tr/fn/grammar/Puf.g:1:46: T__44
                {
                mT__44(); 

                }
                break;
            case 8 :
                // src/tr/fn/grammar/Puf.g:1:52: T__45
                {
                mT__45(); 

                }
                break;
            case 9 :
                // src/tr/fn/grammar/Puf.g:1:58: T__46
                {
                mT__46(); 

                }
                break;
            case 10 :
                // src/tr/fn/grammar/Puf.g:1:64: T__47
                {
                mT__47(); 

                }
                break;
            case 11 :
                // src/tr/fn/grammar/Puf.g:1:70: T__48
                {
                mT__48(); 

                }
                break;
            case 12 :
                // src/tr/fn/grammar/Puf.g:1:76: T__49
                {
                mT__49(); 

                }
                break;
            case 13 :
                // src/tr/fn/grammar/Puf.g:1:82: T__50
                {
                mT__50(); 

                }
                break;
            case 14 :
                // src/tr/fn/grammar/Puf.g:1:88: T__51
                {
                mT__51(); 

                }
                break;
            case 15 :
                // src/tr/fn/grammar/Puf.g:1:94: T__52
                {
                mT__52(); 

                }
                break;
            case 16 :
                // src/tr/fn/grammar/Puf.g:1:100: T__53
                {
                mT__53(); 

                }
                break;
            case 17 :
                // src/tr/fn/grammar/Puf.g:1:106: T__54
                {
                mT__54(); 

                }
                break;
            case 18 :
                // src/tr/fn/grammar/Puf.g:1:112: T__55
                {
                mT__55(); 

                }
                break;
            case 19 :
                // src/tr/fn/grammar/Puf.g:1:118: LESS
                {
                mLESS(); 

                }
                break;
            case 20 :
                // src/tr/fn/grammar/Puf.g:1:123: GREATER
                {
                mGREATER(); 

                }
                break;
            case 21 :
                // src/tr/fn/grammar/Puf.g:1:131: EQUAL
                {
                mEQUAL(); 

                }
                break;
            case 22 :
                // src/tr/fn/grammar/Puf.g:1:137: NOTEQUAL
                {
                mNOTEQUAL(); 

                }
                break;
            case 23 :
                // src/tr/fn/grammar/Puf.g:1:146: LESSEQUAL
                {
                mLESSEQUAL(); 

                }
                break;
            case 24 :
                // src/tr/fn/grammar/Puf.g:1:156: GREATEREQUAL
                {
                mGREATEREQUAL(); 

                }
                break;
            case 25 :
                // src/tr/fn/grammar/Puf.g:1:169: AND
                {
                mAND(); 

                }
                break;
            case 26 :
                // src/tr/fn/grammar/Puf.g:1:173: OR
                {
                mOR(); 

                }
                break;
            case 27 :
                // src/tr/fn/grammar/Puf.g:1:176: PLUS
                {
                mPLUS(); 

                }
                break;
            case 28 :
                // src/tr/fn/grammar/Puf.g:1:181: MINUS
                {
                mMINUS(); 

                }
                break;
            case 29 :
                // src/tr/fn/grammar/Puf.g:1:187: STAR
                {
                mSTAR(); 

                }
                break;
            case 30 :
                // src/tr/fn/grammar/Puf.g:1:192: SLASH
                {
                mSLASH(); 

                }
                break;
            case 31 :
                // src/tr/fn/grammar/Puf.g:1:198: PERCENT
                {
                mPERCENT(); 

                }
                break;
            case 32 :
                // src/tr/fn/grammar/Puf.g:1:206: CONS
                {
                mCONS(); 

                }
                break;
            case 33 :
                // src/tr/fn/grammar/Puf.g:1:211: ID
                {
                mID(); 

                }
                break;
            case 34 :
                // src/tr/fn/grammar/Puf.g:1:214: INT
                {
                mINT(); 

                }
                break;
            case 35 :
                // src/tr/fn/grammar/Puf.g:1:218: WS
                {
                mWS(); 

                }
                break;
            case 36 :
                // src/tr/fn/grammar/Puf.g:1:221: NL
                {
                mNL(); 

                }
                break;
            case 37 :
                // src/tr/fn/grammar/Puf.g:1:224: ML_COMMENT
                {
                mML_COMMENT(); 

                }
                break;
            case 38 :
                // src/tr/fn/grammar/Puf.g:1:235: SL_COMMENT
                {
                mSL_COMMENT(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA12_eotS =
        "\2\uffff\2\5\2\uffff";
    static final String DFA12_eofS =
        "\6\uffff";
    static final String DFA12_minS =
        "\2\57\2\0\2\uffff";
    static final String DFA12_maxS =
        "\2\57\2\uffff\2\uffff";
    static final String DFA12_acceptS =
        "\4\uffff\1\1\1\2";
    static final String DFA12_specialS =
        "\2\uffff\1\1\1\0\2\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\1",
            "\1\2",
            "\12\3\1\4\2\3\1\4\ufff2\3",
            "\12\3\1\4\2\3\1\4\ufff2\3",
            "",
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
            return "245:1: SL_COMMENT : ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r\\n' | '\\r' | '\\n' ) | '//' (~ ( '\\n' | '\\r' ) )* );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_3 = input.LA(1);

                        s = -1;
                        if ( ((LA12_3>='\u0000' && LA12_3<='\t')||(LA12_3>='\u000B' && LA12_3<='\f')||(LA12_3>='\u000E' && LA12_3<='\uFFFF')) ) {s = 3;}

                        else if ( (LA12_3=='\n'||LA12_3=='\r') ) {s = 4;}

                        else s = 5;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_2 = input.LA(1);

                        s = -1;
                        if ( ((LA12_2>='\u0000' && LA12_2<='\t')||(LA12_2>='\u000B' && LA12_2<='\f')||(LA12_2>='\u000E' && LA12_2<='\uFFFF')) ) {s = 3;}

                        else if ( (LA12_2=='\n'||LA12_2=='\r') ) {s = 4;}

                        else s = 5;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA13_eotS =
        "\1\uffff\1\37\4\uffff\4\32\1\46\1\uffff\1\32\1\51\2\32\1\55\1\57"+
        "\5\uffff\1\62\10\uffff\1\32\1\64\1\65\2\32\2\uffff\1\70\2\uffff"+
        "\1\32\1\72\7\uffff\1\74\2\uffff\2\32\1\uffff\1\32\1\uffff\1\32\1"+
        "\uffff\1\101\1\102\1\103\1\32\3\uffff\1\105\1\uffff";
    static final String DFA13_eofS =
        "\106\uffff";
    static final String DFA13_minS =
        "\1\11\1\75\4\uffff\1\145\1\146\1\150\1\154\1\135\1\uffff\1\156\1"+
        "\76\1\141\1\146\2\75\5\uffff\1\52\10\uffff\1\164\2\60\1\145\1\163"+
        "\2\uffff\1\60\2\uffff\1\163\1\60\7\uffff\1\60\2\uffff\1\156\1\145"+
        "\1\uffff\1\145\1\uffff\1\145\1\uffff\3\60\1\143\3\uffff\1\60\1\uffff";
    static final String DFA13_maxS =
        "\1\174\1\75\4\uffff\1\145\1\156\1\150\1\154\1\135\1\uffff\1\156"+
        "\1\76\1\141\1\146\2\75\5\uffff\1\57\10\uffff\1\164\2\172\1\145\1"+
        "\163\2\uffff\1\172\2\uffff\1\163\1\172\7\uffff\1\172\2\uffff\1\156"+
        "\1\145\1\uffff\1\145\1\uffff\1\145\1\uffff\3\172\1\143\3\uffff\1"+
        "\172\1\uffff";
    static final String DFA13_acceptS =
        "\2\uffff\1\2\1\3\1\4\1\5\5\uffff\1\14\6\uffff\1\26\1\31\1\32\1\33"+
        "\1\35\1\uffff\1\37\1\40\1\41\1\42\1\43\1\44\1\25\1\1\5\uffff\1\22"+
        "\1\13\1\uffff\1\16\1\34\2\uffff\1\27\1\23\1\30\1\24\1\45\1\46\1"+
        "\36\1\uffff\1\7\1\10\2\uffff\1\15\1\uffff\1\21\1\uffff\1\6\4\uffff"+
        "\1\11\1\12\1\20\1\uffff\1\17";
    static final String DFA13_specialS =
        "\106\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\34\1\35\2\uffff\1\35\22\uffff\1\34\1\22\1\uffff\1\32\1\uffff"+
            "\1\30\1\23\1\uffff\1\3\1\5\1\26\1\25\1\4\1\15\1\uffff\1\27\12"+
            "\33\1\31\1\2\1\20\1\1\1\21\2\uffff\32\32\1\12\1\uffff\1\13\3"+
            "\uffff\2\32\1\16\1\32\1\11\1\14\2\32\1\7\2\32\1\6\2\32\1\17"+
            "\4\32\1\10\6\32\1\uffff\1\24",
            "\1\36",
            "",
            "",
            "",
            "",
            "\1\40",
            "\1\42\7\uffff\1\41",
            "\1\43",
            "\1\44",
            "\1\45",
            "",
            "\1\47",
            "\1\50",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\56",
            "",
            "",
            "",
            "",
            "",
            "\1\60\4\uffff\1\61",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\63",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            "\1\66",
            "\1\67",
            "",
            "",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            "",
            "",
            "\1\71",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\32\7\uffff\32\32\6\uffff\21\32\1\73\10\32",
            "",
            "",
            "\1\75",
            "\1\76",
            "",
            "\1\77",
            "",
            "\1\100",
            "",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            "\1\104",
            "",
            "",
            "",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
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
            return "1:1: Tokens : ( T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | LESS | GREATER | EQUAL | NOTEQUAL | LESSEQUAL | GREATEREQUAL | AND | OR | PLUS | MINUS | STAR | SLASH | PERCENT | CONS | ID | INT | WS | NL | ML_COMMENT | SL_COMMENT );";
        }
    }
 

}