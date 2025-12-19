// Generated from C:/Users/dell/IdeaProjects/Compiler/src/Grammer/PyFlaskLexer.g4 by ANTLR 4.13.2
package Grammer;
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
		FROM=1, IMPORT=2, DEF=3, RETURN=4, IF=5, ELSE=6, FOR=7, IN=8, BREAK=9, 
		NONE=10, AS=11, AT=12, LPAREN=13, RPAREN=14, LBRACK=15, RBRACK=16, LBRACE=17, 
		RBRACE=18, COLON=19, COMMA=20, EQUAL=21, EQ_COMP=22, DOT=23, PLUS=24, 
		MINUS=25, ID=26, NUMBER=27, STRING=28, NEWLINE=29, INDENT=30, DEDENT=31, 
		WS=32, COMMENT=33;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"FROM", "IMPORT", "DEF", "RETURN", "IF", "ELSE", "FOR", "IN", "BREAK", 
			"NONE", "AS", "AT", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "LBRACE", 
			"RBRACE", "COLON", "COMMA", "EQUAL", "EQ_COMP", "DOT", "PLUS", "MINUS", 
			"ID", "NUMBER", "STRING", "NEWLINE", "INDENT", "DEDENT", "WS", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'from'", "'import'", "'def'", "'return'", "'if'", "'else'", "'for'", 
			"'in'", "'break'", "'None'", "'as'", "'@'", "'('", "')'", "'['", "']'", 
			"'{'", "'}'", "':'", "','", "'='", "'=='", "'.'", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FROM", "IMPORT", "DEF", "RETURN", "IF", "ELSE", "FOR", "IN", "BREAK", 
			"NONE", "AS", "AT", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "LBRACE", 
			"RBRACE", "COLON", "COMMA", "EQUAL", "EQ_COMP", "DOT", "PLUS", "MINUS", 
			"ID", "NUMBER", "STRING", "NEWLINE", "INDENT", "DEDENT", "WS", "COMMENT"
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


	    private java.util.Stack<Integer> indents = new java.util.Stack<>();

	    private void emitToken(int type, String text) {
	        org.antlr.v4.runtime.Token t = _factory.create(
	            new org.antlr.v4.runtime.misc.Pair<org.antlr.v4.runtime.TokenSource, org.antlr.v4.runtime.CharStream>(this, _input),
	            type, text, DEFAULT_TOKEN_CHANNEL, _tokenStartCharIndex, _tokenStartCharIndex,
	            _tokenStartLine, _tokenStartCharPositionInLine
	        );
	        emit(t);
	    }

	    void emitIndentDedent() {
	        String text = getText();
	        int lastNewline = text.lastIndexOf('\n');
	        String spaces = (lastNewline != -1) ? text.substring(lastNewline + 1) : "";

	        int currentIndent = getIndentationCount(spaces);
	        int previousIndent = indents.isEmpty() ? 0 : indents.peek();

	        if (currentIndent > previousIndent) {
	            indents.push(currentIndent);
	            emitToken(INDENT, "");
	        } else {
	            while (!indents.isEmpty() && indents.peek() > currentIndent) {
	                indents.pop();
	                emitToken(DEDENT, "");
	            }
	        }
	    }

	    int getIndentationCount(String spaces) {
	        int count = 0;
	        for (char c : spaces.toCharArray()) {
	            if (c == ' ') count++;
	            else if (c == '\t') count += 4;
	        }
	        return count;
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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 28:
			NEWLINE_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void NEWLINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 emitIndentDedent(); 
			break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 29:
			return INDENT_sempred((RuleContext)_localctx, predIndex);
		case 30:
			return DEDENT_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean INDENT_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return false;
		}
		return true;
	}
	private boolean DEDENT_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return false;
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0000!\u00f8\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0005\u0019\u0097\b\u0019\n"+
		"\u0019\f\u0019\u009a\t\u0019\u0001\u001a\u0003\u001a\u009d\b\u001a\u0001"+
		"\u001a\u0004\u001a\u00a0\b\u001a\u000b\u001a\f\u001a\u00a1\u0001\u001a"+
		"\u0001\u001a\u0004\u001a\u00a6\b\u001a\u000b\u001a\f\u001a\u00a7\u0003"+
		"\u001a\u00aa\b\u001a\u0001\u001b\u0001\u001b\u0005\u001b\u00ae\b\u001b"+
		"\n\u001b\f\u001b\u00b1\t\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0005"+
		"\u001b\u00b6\b\u001b\n\u001b\f\u001b\u00b9\t\u001b\u0001\u001b\u0003\u001b"+
		"\u00bc\b\u001b\u0001\u001c\u0003\u001c\u00bf\b\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0005\u001c\u00c4\b\u001c\n\u001c\f\u001c\u00c7\t\u001c"+
		"\u0001\u001c\u0003\u001c\u00ca\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0005\u001c\u00cf\b\u001c\n\u001c\f\u001c\u00d2\t\u001c\u0003\u001c\u00d4"+
		"\b\u001c\u0005\u001c\u00d6\b\u001c\n\u001c\f\u001c\u00d9\t\u001c\u0001"+
		"\u001c\u0005\u001c\u00dc\b\u001c\n\u001c\f\u001c\u00df\t\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001f\u0004\u001f\u00ea\b\u001f\u000b\u001f\f\u001f"+
		"\u00eb\u0001\u001f\u0001\u001f\u0001 \u0001 \u0005 \u00f2\b \n \f \u00f5"+
		"\t \u0001 \u0001 \u0000\u0000!\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013"+
		"\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d"+
		";\u001e=\u001f? A!\u0001\u0000\u0007\u0003\u0000AZ__az\u0004\u000009A"+
		"Z__az\u0001\u000009\u0003\u0000\n\n\r\r\"\"\u0003\u0000\n\n\r\r\'\'\u0002"+
		"\u0000\t\t  \u0002\u0000\n\n\r\r\u0108\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"+
		"\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000"+
		"\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000"+
		"-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001"+
		"\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000"+
		"\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000"+
		";\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001"+
		"\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0001C\u0001\u0000\u0000"+
		"\u0000\u0003H\u0001\u0000\u0000\u0000\u0005O\u0001\u0000\u0000\u0000\u0007"+
		"S\u0001\u0000\u0000\u0000\tZ\u0001\u0000\u0000\u0000\u000b]\u0001\u0000"+
		"\u0000\u0000\rb\u0001\u0000\u0000\u0000\u000ff\u0001\u0000\u0000\u0000"+
		"\u0011i\u0001\u0000\u0000\u0000\u0013o\u0001\u0000\u0000\u0000\u0015t"+
		"\u0001\u0000\u0000\u0000\u0017w\u0001\u0000\u0000\u0000\u0019y\u0001\u0000"+
		"\u0000\u0000\u001b{\u0001\u0000\u0000\u0000\u001d}\u0001\u0000\u0000\u0000"+
		"\u001f\u007f\u0001\u0000\u0000\u0000!\u0081\u0001\u0000\u0000\u0000#\u0083"+
		"\u0001\u0000\u0000\u0000%\u0085\u0001\u0000\u0000\u0000\'\u0087\u0001"+
		"\u0000\u0000\u0000)\u0089\u0001\u0000\u0000\u0000+\u008b\u0001\u0000\u0000"+
		"\u0000-\u008e\u0001\u0000\u0000\u0000/\u0090\u0001\u0000\u0000\u00001"+
		"\u0092\u0001\u0000\u0000\u00003\u0094\u0001\u0000\u0000\u00005\u009c\u0001"+
		"\u0000\u0000\u00007\u00bb\u0001\u0000\u0000\u00009\u00be\u0001\u0000\u0000"+
		"\u0000;\u00e2\u0001\u0000\u0000\u0000=\u00e5\u0001\u0000\u0000\u0000?"+
		"\u00e9\u0001\u0000\u0000\u0000A\u00ef\u0001\u0000\u0000\u0000CD\u0005"+
		"f\u0000\u0000DE\u0005r\u0000\u0000EF\u0005o\u0000\u0000FG\u0005m\u0000"+
		"\u0000G\u0002\u0001\u0000\u0000\u0000HI\u0005i\u0000\u0000IJ\u0005m\u0000"+
		"\u0000JK\u0005p\u0000\u0000KL\u0005o\u0000\u0000LM\u0005r\u0000\u0000"+
		"MN\u0005t\u0000\u0000N\u0004\u0001\u0000\u0000\u0000OP\u0005d\u0000\u0000"+
		"PQ\u0005e\u0000\u0000QR\u0005f\u0000\u0000R\u0006\u0001\u0000\u0000\u0000"+
		"ST\u0005r\u0000\u0000TU\u0005e\u0000\u0000UV\u0005t\u0000\u0000VW\u0005"+
		"u\u0000\u0000WX\u0005r\u0000\u0000XY\u0005n\u0000\u0000Y\b\u0001\u0000"+
		"\u0000\u0000Z[\u0005i\u0000\u0000[\\\u0005f\u0000\u0000\\\n\u0001\u0000"+
		"\u0000\u0000]^\u0005e\u0000\u0000^_\u0005l\u0000\u0000_`\u0005s\u0000"+
		"\u0000`a\u0005e\u0000\u0000a\f\u0001\u0000\u0000\u0000bc\u0005f\u0000"+
		"\u0000cd\u0005o\u0000\u0000de\u0005r\u0000\u0000e\u000e\u0001\u0000\u0000"+
		"\u0000fg\u0005i\u0000\u0000gh\u0005n\u0000\u0000h\u0010\u0001\u0000\u0000"+
		"\u0000ij\u0005b\u0000\u0000jk\u0005r\u0000\u0000kl\u0005e\u0000\u0000"+
		"lm\u0005a\u0000\u0000mn\u0005k\u0000\u0000n\u0012\u0001\u0000\u0000\u0000"+
		"op\u0005N\u0000\u0000pq\u0005o\u0000\u0000qr\u0005n\u0000\u0000rs\u0005"+
		"e\u0000\u0000s\u0014\u0001\u0000\u0000\u0000tu\u0005a\u0000\u0000uv\u0005"+
		"s\u0000\u0000v\u0016\u0001\u0000\u0000\u0000wx\u0005@\u0000\u0000x\u0018"+
		"\u0001\u0000\u0000\u0000yz\u0005(\u0000\u0000z\u001a\u0001\u0000\u0000"+
		"\u0000{|\u0005)\u0000\u0000|\u001c\u0001\u0000\u0000\u0000}~\u0005[\u0000"+
		"\u0000~\u001e\u0001\u0000\u0000\u0000\u007f\u0080\u0005]\u0000\u0000\u0080"+
		" \u0001\u0000\u0000\u0000\u0081\u0082\u0005{\u0000\u0000\u0082\"\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0005}\u0000\u0000\u0084$\u0001\u0000\u0000"+
		"\u0000\u0085\u0086\u0005:\u0000\u0000\u0086&\u0001\u0000\u0000\u0000\u0087"+
		"\u0088\u0005,\u0000\u0000\u0088(\u0001\u0000\u0000\u0000\u0089\u008a\u0005"+
		"=\u0000\u0000\u008a*\u0001\u0000\u0000\u0000\u008b\u008c\u0005=\u0000"+
		"\u0000\u008c\u008d\u0005=\u0000\u0000\u008d,\u0001\u0000\u0000\u0000\u008e"+
		"\u008f\u0005.\u0000\u0000\u008f.\u0001\u0000\u0000\u0000\u0090\u0091\u0005"+
		"+\u0000\u0000\u00910\u0001\u0000\u0000\u0000\u0092\u0093\u0005-\u0000"+
		"\u0000\u00932\u0001\u0000\u0000\u0000\u0094\u0098\u0007\u0000\u0000\u0000"+
		"\u0095\u0097\u0007\u0001\u0000\u0000\u0096\u0095\u0001\u0000\u0000\u0000"+
		"\u0097\u009a\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000"+
		"\u0098\u0099\u0001\u0000\u0000\u0000\u00994\u0001\u0000\u0000\u0000\u009a"+
		"\u0098\u0001\u0000\u0000\u0000\u009b\u009d\u0005-\u0000\u0000\u009c\u009b"+
		"\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009f"+
		"\u0001\u0000\u0000\u0000\u009e\u00a0\u0007\u0002\u0000\u0000\u009f\u009e"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u009f"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a9"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a5\u0005.\u0000\u0000\u00a4\u00a6\u0007"+
		"\u0002\u0000\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001"+
		"\u0000\u0000\u0000\u00a8\u00aa\u0001\u0000\u0000\u0000\u00a9\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa6\u0001\u0000"+
		"\u0000\u0000\u00ab\u00af\u0005\"\u0000\u0000\u00ac\u00ae\b\u0003\u0000"+
		"\u0000\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ae\u00b1\u0001\u0000\u0000"+
		"\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000"+
		"\u0000\u00b0\u00b2\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000"+
		"\u0000\u00b2\u00bc\u0005\"\u0000\u0000\u00b3\u00b7\u0005\'\u0000\u0000"+
		"\u00b4\u00b6\b\u0004\u0000\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000\u00b6"+
		"\u00b9\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b8\u0001\u0000\u0000\u0000\u00b8\u00ba\u0001\u0000\u0000\u0000\u00b9"+
		"\u00b7\u0001\u0000\u0000\u0000\u00ba\u00bc\u0005\'\u0000\u0000\u00bb\u00ab"+
		"\u0001\u0000\u0000\u0000\u00bb\u00b3\u0001\u0000\u0000\u0000\u00bc8\u0001"+
		"\u0000\u0000\u0000\u00bd\u00bf\u0005\r\u0000\u0000\u00be\u00bd\u0001\u0000"+
		"\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c1\u0005\n\u0000\u0000\u00c1\u00d7\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c4\u0007\u0005\u0000\u0000\u00c3\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c7\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u00d3\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c8\u00ca\u0005\r\u0000\u0000"+
		"\u00c9\u00c8\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000"+
		"\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00d4\u0005\n\u0000\u0000\u00cc"+
		"\u00d0\u0005#\u0000\u0000\u00cd\u00cf\b\u0006\u0000\u0000\u00ce\u00cd"+
		"\u0001\u0000\u0000\u0000\u00cf\u00d2\u0001\u0000\u0000\u0000\u00d0\u00ce"+
		"\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d3\u00c9"+
		"\u0001\u0000\u0000\u0000\u00d3\u00cc\u0001\u0000\u0000\u0000\u00d4\u00d6"+
		"\u0001\u0000\u0000\u0000\u00d5\u00c5\u0001\u0000\u0000\u0000\u00d6\u00d9"+
		"\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d8"+
		"\u0001\u0000\u0000\u0000\u00d8\u00dd\u0001\u0000\u0000\u0000\u00d9\u00d7"+
		"\u0001\u0000\u0000\u0000\u00da\u00dc\u0007\u0005\u0000\u0000\u00db\u00da"+
		"\u0001\u0000\u0000\u0000\u00dc\u00df\u0001\u0000\u0000\u0000\u00dd\u00db"+
		"\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de\u00e0"+
		"\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00e0\u00e1"+
		"\u0006\u001c\u0000\u0000\u00e1:\u0001\u0000\u0000\u0000\u00e2\u00e3\u0004"+
		"\u001d\u0000\u0000\u00e3\u00e4\t\u0000\u0000\u0000\u00e4<\u0001\u0000"+
		"\u0000\u0000\u00e5\u00e6\u0004\u001e\u0001\u0000\u00e6\u00e7\t\u0000\u0000"+
		"\u0000\u00e7>\u0001\u0000\u0000\u0000\u00e8\u00ea\u0007\u0005\u0000\u0000"+
		"\u00e9\u00e8\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000"+
		"\u00eb\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000"+
		"\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed\u00ee\u0006\u001f\u0001\u0000"+
		"\u00ee@\u0001\u0000\u0000\u0000\u00ef\u00f3\u0005#\u0000\u0000\u00f0\u00f2"+
		"\b\u0006\u0000\u0000\u00f1\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f5\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001"+
		"\u0000\u0000\u0000\u00f4\u00f6\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f7\u0006 \u0001\u0000\u00f7B\u0001\u0000\u0000"+
		"\u0000\u0012\u0000\u0098\u009c\u00a1\u00a7\u00a9\u00af\u00b7\u00bb\u00be"+
		"\u00c5\u00c9\u00d0\u00d3\u00d7\u00dd\u00eb\u00f3\u0002\u0001\u001c\u0000"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}