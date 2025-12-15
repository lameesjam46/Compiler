// Generated from C:/Users/dell/IdeaProjects/Compiler/src/Grammer/python/PyFlaskLexer.g4 by ANTLR 4.13.2
package Grammer.python;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class PyFlaskLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DEF=1, RETURN=2, IF=3, ELSE=4, FOR=5, IN=6, IMPORT=7, FROM=8, APP=9, ROUTE=10, 
		RENDER=11, REQUEST=12, ID=13, NUMBER=14, STRING=15, LPAREN=16, RPAREN=17, 
		COLON=18, COMMA=19, EQUAL=20, DOT=21, NEWLINE=22, WS=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DEF", "RETURN", "IF", "ELSE", "FOR", "IN", "IMPORT", "FROM", "APP", 
			"ROUTE", "RENDER", "REQUEST", "ID", "NUMBER", "STRING", "LPAREN", "RPAREN", 
			"COLON", "COMMA", "EQUAL", "DOT", "NEWLINE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def'", "'return'", "'if'", "'else'", "'for'", "'in'", "'import'", 
			"'from'", "'Flask'", "'route'", "'render_template'", "'request'", null, 
			null, null, "'('", "')'", "':'", "','", "'='", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DEF", "RETURN", "IF", "ELSE", "FOR", "IN", "IMPORT", "FROM", "APP", 
			"ROUTE", "RENDER", "REQUEST", "ID", "NUMBER", "STRING", "LPAREN", "RPAREN", 
			"COLON", "COMMA", "EQUAL", "DOT", "NEWLINE", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public PyFlaskLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PyFlaskLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0017\u00ae\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0005\f|\b\f\n\f"+
		"\f\f\u007f\t\f\u0001\r\u0004\r\u0082\b\r\u000b\r\f\r\u0083\u0001\r\u0001"+
		"\r\u0004\r\u0088\b\r\u000b\r\f\r\u0089\u0003\r\u008c\b\r\u0001\u000e\u0001"+
		"\u000e\u0005\u000e\u0090\b\u000e\n\u000e\f\u000e\u0093\t\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0003\u0015\u00a4\b\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0004\u0016\u00a9\b\u0016\u000b\u0016\f\u0016\u00aa\u0001"+
		"\u0016\u0001\u0016\u0000\u0000\u0017\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012"+
		"%\u0013\'\u0014)\u0015+\u0016-\u0017\u0001\u0000\u0005\u0003\u0000AZ_"+
		"_az\u0004\u000009AZ__az\u0001\u000009\u0003\u0000\n\n\r\r\"\"\u0002\u0000"+
		"\t\t  \u00b4\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"+
		"\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0001/\u0001\u0000\u0000\u0000\u00033\u0001\u0000\u0000\u0000\u0005"+
		":\u0001\u0000\u0000\u0000\u0007=\u0001\u0000\u0000\u0000\tB\u0001\u0000"+
		"\u0000\u0000\u000bF\u0001\u0000\u0000\u0000\rI\u0001\u0000\u0000\u0000"+
		"\u000fP\u0001\u0000\u0000\u0000\u0011U\u0001\u0000\u0000\u0000\u0013["+
		"\u0001\u0000\u0000\u0000\u0015a\u0001\u0000\u0000\u0000\u0017q\u0001\u0000"+
		"\u0000\u0000\u0019y\u0001\u0000\u0000\u0000\u001b\u0081\u0001\u0000\u0000"+
		"\u0000\u001d\u008d\u0001\u0000\u0000\u0000\u001f\u0096\u0001\u0000\u0000"+
		"\u0000!\u0098\u0001\u0000\u0000\u0000#\u009a\u0001\u0000\u0000\u0000%"+
		"\u009c\u0001\u0000\u0000\u0000\'\u009e\u0001\u0000\u0000\u0000)\u00a0"+
		"\u0001\u0000\u0000\u0000+\u00a3\u0001\u0000\u0000\u0000-\u00a8\u0001\u0000"+
		"\u0000\u0000/0\u0005d\u0000\u000001\u0005e\u0000\u000012\u0005f\u0000"+
		"\u00002\u0002\u0001\u0000\u0000\u000034\u0005r\u0000\u000045\u0005e\u0000"+
		"\u000056\u0005t\u0000\u000067\u0005u\u0000\u000078\u0005r\u0000\u0000"+
		"89\u0005n\u0000\u00009\u0004\u0001\u0000\u0000\u0000:;\u0005i\u0000\u0000"+
		";<\u0005f\u0000\u0000<\u0006\u0001\u0000\u0000\u0000=>\u0005e\u0000\u0000"+
		">?\u0005l\u0000\u0000?@\u0005s\u0000\u0000@A\u0005e\u0000\u0000A\b\u0001"+
		"\u0000\u0000\u0000BC\u0005f\u0000\u0000CD\u0005o\u0000\u0000DE\u0005r"+
		"\u0000\u0000E\n\u0001\u0000\u0000\u0000FG\u0005i\u0000\u0000GH\u0005n"+
		"\u0000\u0000H\f\u0001\u0000\u0000\u0000IJ\u0005i\u0000\u0000JK\u0005m"+
		"\u0000\u0000KL\u0005p\u0000\u0000LM\u0005o\u0000\u0000MN\u0005r\u0000"+
		"\u0000NO\u0005t\u0000\u0000O\u000e\u0001\u0000\u0000\u0000PQ\u0005f\u0000"+
		"\u0000QR\u0005r\u0000\u0000RS\u0005o\u0000\u0000ST\u0005m\u0000\u0000"+
		"T\u0010\u0001\u0000\u0000\u0000UV\u0005F\u0000\u0000VW\u0005l\u0000\u0000"+
		"WX\u0005a\u0000\u0000XY\u0005s\u0000\u0000YZ\u0005k\u0000\u0000Z\u0012"+
		"\u0001\u0000\u0000\u0000[\\\u0005r\u0000\u0000\\]\u0005o\u0000\u0000]"+
		"^\u0005u\u0000\u0000^_\u0005t\u0000\u0000_`\u0005e\u0000\u0000`\u0014"+
		"\u0001\u0000\u0000\u0000ab\u0005r\u0000\u0000bc\u0005e\u0000\u0000cd\u0005"+
		"n\u0000\u0000de\u0005d\u0000\u0000ef\u0005e\u0000\u0000fg\u0005r\u0000"+
		"\u0000gh\u0005_\u0000\u0000hi\u0005t\u0000\u0000ij\u0005e\u0000\u0000"+
		"jk\u0005m\u0000\u0000kl\u0005p\u0000\u0000lm\u0005l\u0000\u0000mn\u0005"+
		"a\u0000\u0000no\u0005t\u0000\u0000op\u0005e\u0000\u0000p\u0016\u0001\u0000"+
		"\u0000\u0000qr\u0005r\u0000\u0000rs\u0005e\u0000\u0000st\u0005q\u0000"+
		"\u0000tu\u0005u\u0000\u0000uv\u0005e\u0000\u0000vw\u0005s\u0000\u0000"+
		"wx\u0005t\u0000\u0000x\u0018\u0001\u0000\u0000\u0000y}\u0007\u0000\u0000"+
		"\u0000z|\u0007\u0001\u0000\u0000{z\u0001\u0000\u0000\u0000|\u007f\u0001"+
		"\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000"+
		"~\u001a\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u0080\u0082"+
		"\u0007\u0002\u0000\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0082\u0083"+
		"\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0001\u0000\u0000\u0000\u0084\u008b\u0001\u0000\u0000\u0000\u0085\u0087"+
		"\u0005.\u0000\u0000\u0086\u0088\u0007\u0002\u0000\u0000\u0087\u0086\u0001"+
		"\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u0087\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008c\u0001"+
		"\u0000\u0000\u0000\u008b\u0085\u0001\u0000\u0000\u0000\u008b\u008c\u0001"+
		"\u0000\u0000\u0000\u008c\u001c\u0001\u0000\u0000\u0000\u008d\u0091\u0005"+
		"\"\u0000\u0000\u008e\u0090\b\u0003\u0000\u0000\u008f\u008e\u0001\u0000"+
		"\u0000\u0000\u0090\u0093\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000"+
		"\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0094\u0001\u0000"+
		"\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0094\u0095\u0005\"\u0000"+
		"\u0000\u0095\u001e\u0001\u0000\u0000\u0000\u0096\u0097\u0005(\u0000\u0000"+
		"\u0097 \u0001\u0000\u0000\u0000\u0098\u0099\u0005)\u0000\u0000\u0099\""+
		"\u0001\u0000\u0000\u0000\u009a\u009b\u0005:\u0000\u0000\u009b$\u0001\u0000"+
		"\u0000\u0000\u009c\u009d\u0005,\u0000\u0000\u009d&\u0001\u0000\u0000\u0000"+
		"\u009e\u009f\u0005=\u0000\u0000\u009f(\u0001\u0000\u0000\u0000\u00a0\u00a1"+
		"\u0005.\u0000\u0000\u00a1*\u0001\u0000\u0000\u0000\u00a2\u00a4\u0005\r"+
		"\u0000\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005\n\u0000"+
		"\u0000\u00a6,\u0001\u0000\u0000\u0000\u00a7\u00a9\u0007\u0004\u0000\u0000"+
		"\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000"+
		"\u00aa\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000"+
		"\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u00ad\u0006\u0016\u0000\u0000"+
		"\u00ad.\u0001\u0000\u0000\u0000\b\u0000}\u0083\u0089\u008b\u0091\u00a3"+
		"\u00aa\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}