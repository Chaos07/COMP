// $ANTLR 3.5 Expr.g 2015-10-09 15:00:46

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ExprLexer extends Lexer {
	public static final int EOF=-1;
	public static final int ID=4;
	public static final int NEWLINE=5;
	public static final int POINT=6;
	public static final int PTVIRGULE=7;
	public static final int VIRGULE=8;
	public static final int WS=9;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public ExprLexer() {} 
	public ExprLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public ExprLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "Expr.g"; }

	// $ANTLR start "VIRGULE"
	public final void mVIRGULE() throws RecognitionException {
		try {
			int _type = VIRGULE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expr.g:17:8: ( ',' )
			// Expr.g:17:13: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VIRGULE"

	// $ANTLR start "PTVIRGULE"
	public final void mPTVIRGULE() throws RecognitionException {
		try {
			int _type = PTVIRGULE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expr.g:18:10: ( ';' )
			// Expr.g:18:12: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PTVIRGULE"

	// $ANTLR start "POINT"
	public final void mPOINT() throws RecognitionException {
		try {
			int _type = POINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expr.g:19:6: ( '.' )
			// Expr.g:19:9: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "POINT"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expr.g:20:5: ( '<' ( 'a' .. 'z' | 'A' .. 'Z' )+ '>' )
			// Expr.g:20:9: '<' ( 'a' .. 'z' | 'A' .. 'Z' )+ '>'
			{
			match('<'); 
			// Expr.g:20:12: ( 'a' .. 'z' | 'A' .. 'Z' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// Expr.g:
					{
					if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "NEWLINE"
	public final void mNEWLINE() throws RecognitionException {
		try {
			int _type = NEWLINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expr.g:21:8: ( ( '\\r' )? '\\n' )
			// Expr.g:21:9: ( '\\r' )? '\\n'
			{
			// Expr.g:21:9: ( '\\r' )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='\r') ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// Expr.g:21:9: '\\r'
					{
					match('\r'); 
					}
					break;

			}

			match('\n'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEWLINE"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Expr.g:22:5: ( ( ' ' | '\\t' )+ )
			// Expr.g:22:9: ( ' ' | '\\t' )+
			{
			// Expr.g:22:9: ( ' ' | '\\t' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0=='\t'||LA3_0==' ') ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// Expr.g:
					{
					if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// Expr.g:1:8: ( VIRGULE | PTVIRGULE | POINT | ID | NEWLINE | WS )
		int alt4=6;
		switch ( input.LA(1) ) {
		case ',':
			{
			alt4=1;
			}
			break;
		case ';':
			{
			alt4=2;
			}
			break;
		case '.':
			{
			alt4=3;
			}
			break;
		case '<':
			{
			alt4=4;
			}
			break;
		case '\n':
		case '\r':
			{
			alt4=5;
			}
			break;
		case '\t':
		case ' ':
			{
			alt4=6;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 4, 0, input);
			throw nvae;
		}
		switch (alt4) {
			case 1 :
				// Expr.g:1:10: VIRGULE
				{
				mVIRGULE(); 

				}
				break;
			case 2 :
				// Expr.g:1:18: PTVIRGULE
				{
				mPTVIRGULE(); 

				}
				break;
			case 3 :
				// Expr.g:1:28: POINT
				{
				mPOINT(); 

				}
				break;
			case 4 :
				// Expr.g:1:34: ID
				{
				mID(); 

				}
				break;
			case 5 :
				// Expr.g:1:37: NEWLINE
				{
				mNEWLINE(); 

				}
				break;
			case 6 :
				// Expr.g:1:45: WS
				{
				mWS(); 

				}
				break;

		}
	}



}
