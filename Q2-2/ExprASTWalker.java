// $ANTLR 3.5 ExprASTWalker.g 2015-10-15 21:41:46

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ExprASTWalker extends TreeParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "Doc", "ID", "NEWLINE", "O", "P", 
		"S", "WS", "'\"'", "','", "'.'", "';'", "'<'", "'>'"
	};
	public static final int EOF=-1;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int Doc=4;
	public static final int ID=5;
	public static final int NEWLINE=6;
	public static final int O=7;
	public static final int P=8;
	public static final int S=9;
	public static final int WS=10;

	// delegates
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public ExprASTWalker(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public ExprASTWalker(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return ExprASTWalker.tokenNames; }
	@Override public String getGrammarFileName() { return "ExprASTWalker.g"; }



	// $ANTLR start "doc"
	// ExprASTWalker.g:7:1: doc : ^( Doc ( line )+ ) ;
	public final void doc() throws RecognitionException {
		try {
			// ExprASTWalker.g:8:5: ( ^( Doc ( line )+ ) )
			// ExprASTWalker.g:9:5: ^( Doc ( line )+ )
			{
			match(input,Doc,FOLLOW_Doc_in_doc43); 
			match(input, Token.DOWN, null); 
			// ExprASTWalker.g:9:11: ( line )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==S) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// ExprASTWalker.g:9:11: line
					{
					pushFollow(FOLLOW_line_in_doc45);
					line();
					state._fsp--;

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			match(input, Token.UP, null); 

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
	// $ANTLR end "doc"



	// $ANTLR start "line"
	// ExprASTWalker.g:11:1: line : ^( S id ( fact[$id.value] )+ ) ;
	public final void line() throws RecognitionException {
		String id1 =null;

		try {
			// ExprASTWalker.g:12:5: ( ^( S id ( fact[$id.value] )+ ) )
			// ExprASTWalker.g:13:5: ^( S id ( fact[$id.value] )+ )
			{
			match(input,S,FOLLOW_S_in_line64); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_id_in_line66);
			id1=id();
			state._fsp--;

			// ExprASTWalker.g:13:12: ( fact[$id.value] )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==P) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// ExprASTWalker.g:13:12: fact[$id.value]
					{
					pushFollow(FOLLOW_fact_in_line68);
					fact(id1);
					state._fsp--;

					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			match(input, Token.UP, null); 

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
	// $ANTLR end "line"



	// $ANTLR start "fact"
	// ExprASTWalker.g:16:1: fact[String sub] : ^( P id ( objs[sub, $id.value] )+ ) ;
	public final void fact(String sub) throws RecognitionException {
		String id2 =null;

		try {
			// ExprASTWalker.g:17:5: ( ^( P id ( objs[sub, $id.value] )+ ) )
			// ExprASTWalker.g:18:5: ^( P id ( objs[sub, $id.value] )+ )
			{
			match(input,P,FOLLOW_P_in_fact94); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_id_in_fact96);
			id2=id();
			state._fsp--;

			// ExprASTWalker.g:18:12: ( objs[sub, $id.value] )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==O) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// ExprASTWalker.g:18:12: objs[sub, $id.value]
					{
					pushFollow(FOLLOW_objs_in_fact98);
					objs(sub, id2);
					state._fsp--;

					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			match(input, Token.UP, null); 

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
	// $ANTLR end "fact"



	// $ANTLR start "objs"
	// ExprASTWalker.g:21:1: objs[String sub, String pred] : ^( O id ) ;
	public final void objs(String sub, String pred) throws RecognitionException {
		String id3 =null;

		try {
			// ExprASTWalker.g:22:5: ( ^( O id ) )
			// ExprASTWalker.g:23:5: ^( O id )
			{
			match(input,O,FOLLOW_O_in_objs124); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_id_in_objs126);
			id3=id();
			state._fsp--;

			match(input, Token.UP, null); 

			System.out.println(sub + " " + pred + " " + id3 + " .");
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
	// $ANTLR end "objs"



	// $ANTLR start "id"
	// ExprASTWalker.g:27:1: id returns [String value] : ( '<' ID '>' | '\"' ID '\"' );
	public final String id() throws RecognitionException {
		String value = null;


		CommonTree ID4=null;
		CommonTree ID5=null;

		try {
			// ExprASTWalker.g:28:5: ( '<' ID '>' | '\"' ID '\"' )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==15) ) {
				alt4=1;
			}
			else if ( (LA4_0==11) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// ExprASTWalker.g:29:5: '<' ID '>'
					{
					match(input,15,FOLLOW_15_in_id158); 
					ID4=(CommonTree)match(input,ID,FOLLOW_ID_in_id159); 
					match(input,16,FOLLOW_16_in_id160); 
					value = '<' + (ID4!=null?ID4.getText():null) + '>';
					}
					break;
				case 2 :
					// ExprASTWalker.g:31:5: '\"' ID '\"'
					{
					match(input,11,FOLLOW_11_in_id174); 
					ID5=(CommonTree)match(input,ID,FOLLOW_ID_in_id175); 
					match(input,11,FOLLOW_11_in_id176); 
					value = '"' + (ID5!=null?ID5.getText():null) + '"';
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "id"

	// Delegated rules



	public static final BitSet FOLLOW_Doc_in_doc43 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_line_in_doc45 = new BitSet(new long[]{0x0000000000000208L});
	public static final BitSet FOLLOW_S_in_line64 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_id_in_line66 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_fact_in_line68 = new BitSet(new long[]{0x0000000000000108L});
	public static final BitSet FOLLOW_P_in_fact94 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_id_in_fact96 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_objs_in_fact98 = new BitSet(new long[]{0x0000000000000088L});
	public static final BitSet FOLLOW_O_in_objs124 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_id_in_objs126 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_15_in_id158 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_id159 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_id160 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_11_in_id174 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ID_in_id175 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_id176 = new BitSet(new long[]{0x0000000000000002L});
}
