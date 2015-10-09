// $ANTLR 3.5 Expr.g 2015-10-09 15:00:45

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ExprParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "NEWLINE", "POINT", "PTVIRGULE", 
		"VIRGULE", "WS"
	};
	public static final int EOF=-1;
	public static final int ID=4;
	public static final int NEWLINE=5;
	public static final int POINT=6;
	public static final int PTVIRGULE=7;
	public static final int VIRGULE=8;
	public static final int WS=9;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public ExprParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public ExprParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return ExprParser.tokenNames; }
	@Override public String getGrammarFileName() { return "Expr.g"; }



	// $ANTLR start "prog"
	// Expr.g:3:1: prog : ID ( fsuj | nfsuj ) ;
	public final void prog() throws RecognitionException {
		try {
			// Expr.g:3:5: ( ID ( fsuj | nfsuj ) )
			// Expr.g:3:9: ID ( fsuj | nfsuj )
			{
			match(input,ID,FOLLOW_ID_in_prog11); 
			// Expr.g:3:11: ( fsuj | nfsuj )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==NEWLINE) ) {
				alt1=1;
			}
			else if ( (LA1_0==EOF||LA1_0==ID) ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// Expr.g:3:12: fsuj
					{
					pushFollow(FOLLOW_fsuj_in_prog13);
					fsuj();
					state._fsp--;

					}
					break;
				case 2 :
					// Expr.g:3:19: nfsuj
					{
					pushFollow(FOLLOW_nfsuj_in_prog17);
					nfsuj();
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "prog"



	// $ANTLR start "fsuj"
	// Expr.g:5:1: fsuj : NEWLINE ( ID ID ( VIRGULE ID )* PTVIRGULE NEWLINE )* POINT ;
	public final void fsuj() throws RecognitionException {
		try {
			// Expr.g:5:5: ( NEWLINE ( ID ID ( VIRGULE ID )* PTVIRGULE NEWLINE )* POINT )
			// Expr.g:5:9: NEWLINE ( ID ID ( VIRGULE ID )* PTVIRGULE NEWLINE )* POINT
			{
			match(input,NEWLINE,FOLLOW_NEWLINE_in_fsuj27); 
			// Expr.g:6:9: ( ID ID ( VIRGULE ID )* PTVIRGULE NEWLINE )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==ID) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// Expr.g:7:9: ID ID ( VIRGULE ID )* PTVIRGULE NEWLINE
					{
					match(input,ID,FOLLOW_ID_in_fsuj47); 
					match(input,ID,FOLLOW_ID_in_fsuj49); 
					// Expr.g:7:15: ( VIRGULE ID )*
					loop2:
					while (true) {
						int alt2=2;
						int LA2_0 = input.LA(1);
						if ( (LA2_0==VIRGULE) ) {
							alt2=1;
						}

						switch (alt2) {
						case 1 :
							// Expr.g:7:16: VIRGULE ID
							{
							match(input,VIRGULE,FOLLOW_VIRGULE_in_fsuj52); 
							match(input,ID,FOLLOW_ID_in_fsuj54); 
							}
							break;

						default :
							break loop2;
						}
					}

					match(input,PTVIRGULE,FOLLOW_PTVIRGULE_in_fsuj58); 
					match(input,NEWLINE,FOLLOW_NEWLINE_in_fsuj60); 
					}
					break;

				default :
					break loop3;
				}
			}

			match(input,POINT,FOLLOW_POINT_in_fsuj81); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "fsuj"



	// $ANTLR start "nfsuj"
	// Expr.g:12:1: nfsuj : ( ID ID ( VIRGULE ID )* POINT )* ;
	public final void nfsuj() throws RecognitionException {
		try {
			// Expr.g:12:6: ( ( ID ID ( VIRGULE ID )* POINT )* )
			// Expr.g:12:9: ( ID ID ( VIRGULE ID )* POINT )*
			{
			// Expr.g:12:9: ( ID ID ( VIRGULE ID )* POINT )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==ID) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// Expr.g:13:10: ID ID ( VIRGULE ID )* POINT
					{
					match(input,ID,FOLLOW_ID_in_nfsuj109); 
					match(input,ID,FOLLOW_ID_in_nfsuj111); 
					// Expr.g:13:16: ( VIRGULE ID )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( (LA4_0==VIRGULE) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// Expr.g:13:17: VIRGULE ID
							{
							match(input,VIRGULE,FOLLOW_VIRGULE_in_nfsuj114); 
							match(input,ID,FOLLOW_ID_in_nfsuj116); 
							}
							break;

						default :
							break loop4;
						}
					}

					match(input,POINT,FOLLOW_POINT_in_nfsuj120); 
					}
					break;

				default :
					break loop5;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "nfsuj"

	// Delegated rules



	public static final BitSet FOLLOW_ID_in_prog11 = new BitSet(new long[]{0x0000000000000030L});
	public static final BitSet FOLLOW_fsuj_in_prog13 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nfsuj_in_prog17 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEWLINE_in_fsuj27 = new BitSet(new long[]{0x0000000000000050L});
	public static final BitSet FOLLOW_ID_in_fsuj47 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ID_in_fsuj49 = new BitSet(new long[]{0x0000000000000180L});
	public static final BitSet FOLLOW_VIRGULE_in_fsuj52 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ID_in_fsuj54 = new BitSet(new long[]{0x0000000000000180L});
	public static final BitSet FOLLOW_PTVIRGULE_in_fsuj58 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NEWLINE_in_fsuj60 = new BitSet(new long[]{0x0000000000000050L});
	public static final BitSet FOLLOW_POINT_in_fsuj81 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_nfsuj109 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ID_in_nfsuj111 = new BitSet(new long[]{0x0000000000000140L});
	public static final BitSet FOLLOW_VIRGULE_in_nfsuj114 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ID_in_nfsuj116 = new BitSet(new long[]{0x0000000000000140L});
	public static final BitSet FOLLOW_POINT_in_nfsuj120 = new BitSet(new long[]{0x0000000000000012L});
}
