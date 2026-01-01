// Generated from C:/Users/dell/IdeaProjects/Compiler/src/Grammer/PyFlaskLexer.g4 by ANTLR 4.13.2
package Grammer;

    import org.antlr.v4.runtime.*;
    import java.util.*;

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
		LPAREN=1, RPAREN=2, LBRACK=3, RBRACK=4, LBRACE=5, RBRACE=6, ATSIGN=7, 
		DOT=8, COMMA=9, COLON=10, ASSIGN=11, EQ=12, PLUS=13, MINUS=14, STAR=15, 
		SLASH=16, BREAK=17, CONTINUE=18, DEF=19, IF=20, ELSE=21, FOR=22, IN=23, 
		FROM=24, IMPORT=25, RETURN=26, TRUE=27, FALSE=28, NONE=29, IS=30, AND=31, 
		OR=32, NOT=33, ID=34, NUMBER=35, STRING=36, NEWLINE=37, WS=38, COMMENT=39, 
		BLOCKSTART=40, BLOCKEND=41, GT=42, LT=43, GTE=44, LTE=45, NEQ=46;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LPAREN", "RPAREN", "LBRACK", "RBRACK", "LBRACE", "RBRACE", "ATSIGN", 
			"DOT", "COMMA", "COLON", "ASSIGN", "EQ", "PLUS", "MINUS", "STAR", "SLASH", 
			"BREAK", "CONTINUE", "DEF", "IF", "ELSE", "FOR", "IN", "FROM", "IMPORT", 
			"RETURN", "TRUE", "FALSE", "NONE", "IS", "AND", "OR", "NOT", "ID", "NUMBER", 
			"STRING", "NEWLINE", "WS", "COMMENT", "BLOCKSTART", "BLOCKEND", "GT", 
			"LT", "GTE", "LTE", "NEQ"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'['", "']'", "'{'", "'}'", "'@'", "'.'", "','", 
			"':'", "'='", "'=='", "'+'", "'-'", "'*'", "'/'", "'break'", "'continue'", 
			"'def'", "'if'", "'else'", "'for'", "'in'", "'from'", "'import'", "'return'", 
			"'True'", "'False'", "'None'", "'is'", "'and'", "'or'", "'not'", null, 
			null, null, null, null, null, "'<BLOCKSTART>'", "'<BLOCKEND>'", "'>'", 
			"'<'", "'>='", "'<='", "'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LPAREN", "RPAREN", "LBRACK", "RBRACK", "LBRACE", "RBRACE", "ATSIGN", 
			"DOT", "COMMA", "COLON", "ASSIGN", "EQ", "PLUS", "MINUS", "STAR", "SLASH", 
			"BREAK", "CONTINUE", "DEF", "IF", "ELSE", "FOR", "IN", "FROM", "IMPORT", 
			"RETURN", "TRUE", "FALSE", "NONE", "IS", "AND", "OR", "NOT", "ID", "NUMBER", 
			"STRING", "NEWLINE", "WS", "COMMENT", "BLOCKSTART", "BLOCKEND", "GT", 
			"LT", "GTE", "LTE", "NEQ"
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


	    java.util.Stack<Integer> indents = new java.util.Stack<>();
	    java.util.LinkedList<Token> pending = new java.util.LinkedList<>();
	    boolean blockExpected = false;

	    int parenLevel = 0;
	    int bracketLevel = 0;
	    int braceLevel = 0;

	    private CommonToken virtual(int type, String text) {
	        CommonToken t = new CommonToken(type, text);
	        t.setStartIndex(_input.index());
	        t.setStopIndex(_input.index() - 1);
	        t.setLine(getLine());
	        t.setCharPositionInLine(getCharPositionInLine());
	        return t;
	    }

	    void handleNewline() {
	        String indent = "";
	        int c;
	        while ((c = _input.LA(1)) == ' ' || c == '\t') {
	            indent += (char)c;
	            _input.consume();
	        }

	        int indentLevel = indent.length();
	        if (_input.LA(1) == '\r' || _input.LA(1) == '\n' || _input.LA(1) == -1) return;

	        int prev = indents.isEmpty() ? 0 : indents.peek();

	        if (blockExpected) {
	            indents.push(indentLevel);
	            pending.add(virtual(BLOCKSTART, "<BLOCKSTART>"));
	            blockExpected = false;
	        } else if (indentLevel > prev) {
	            indents.push(indentLevel);
	            pending.add(virtual(BLOCKSTART, "<BLOCKSTART>"));
	        } else {
	            while (!indents.isEmpty() && indents.peek() > indentLevel) {
	                indents.pop();
	                pending.add(virtual(BLOCKEND, "<BLOCKEND>"));
	            }
	        }
	    }


	    @Override
	    public Token nextToken() {
	        while (true) {
	            if (!pending.isEmpty()) return pending.pollFirst();

	            Token t = super.nextToken();
	            if (t.getType() == EOF) {
	                while (!indents.isEmpty()) {
	                    indents.pop();
	                    pending.add(virtual(BLOCKEND, "<BLOCKEND>"));
	                }
	                if (!pending.isEmpty()) continue;
	                return t;
	            }
	            if (t.getType() == NEWLINE) {
	                if (parenLevel == 0 && bracketLevel == 0 && braceLevel == 0) {
	                    handleNewline();
	                }
	                continue;
	            }
	            return t;
	        }
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
		case 0:
			LPAREN_action((RuleContext)_localctx, actionIndex);
			break;
		case 1:
			RPAREN_action((RuleContext)_localctx, actionIndex);
			break;
		case 2:
			LBRACK_action((RuleContext)_localctx, actionIndex);
			break;
		case 3:
			RBRACK_action((RuleContext)_localctx, actionIndex);
			break;
		case 4:
			LBRACE_action((RuleContext)_localctx, actionIndex);
			break;
		case 5:
			RBRACE_action((RuleContext)_localctx, actionIndex);
			break;
		case 9:
			COLON_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void LPAREN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 parenLevel++; 
			break;
		}
	}
	private void RPAREN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			 parenLevel--; 
			break;
		}
	}
	private void LBRACK_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			 bracketLevel++; 
			break;
		}
	}
	private void RBRACK_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			 bracketLevel--; 
			break;
		}
	}
	private void LBRACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			 braceLevel++; 
			break;
		}
	}
	private void RBRACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			 braceLevel--; 
			break;
		}
	}
	private void COLON_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:

			    if (parenLevel == 0 && bracketLevel == 0 && braceLevel == 0) {
			        blockExpected = true;
			    }

			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u0000.\u013f\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001"+
		" \u0001!\u0001!\u0005!\u00db\b!\n!\f!\u00de\t!\u0001\"\u0003\"\u00e1\b"+
		"\"\u0001\"\u0004\"\u00e4\b\"\u000b\"\f\"\u00e5\u0001\"\u0001\"\u0004\""+
		"\u00ea\b\"\u000b\"\f\"\u00eb\u0003\"\u00ee\b\"\u0001#\u0001#\u0001#\u0001"+
		"#\u0005#\u00f4\b#\n#\f#\u00f7\t#\u0001#\u0001#\u0001#\u0001#\u0001#\u0005"+
		"#\u00fe\b#\n#\f#\u0101\t#\u0001#\u0003#\u0104\b#\u0001$\u0003$\u0107\b"+
		"$\u0001$\u0001$\u0001%\u0004%\u010c\b%\u000b%\f%\u010d\u0001%\u0001%\u0001"+
		"&\u0001&\u0005&\u0114\b&\n&\f&\u0117\t&\u0001&\u0001&\u0001\'\u0001\'"+
		"\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001)\u0001)\u0001*\u0001*\u0001+\u0001+\u0001"+
		"+\u0001,\u0001,\u0001,\u0001-\u0001-\u0001-\u0000\u0000.\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a"+
		"5\u001b7\u001c9\u001d;\u001e=\u001f? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.\u0001"+
		"\u0000\u0007\u0003\u0000AZ__az\u0004\u000009AZ__az\u0001\u000009\u0002"+
		"\u0000\"\"\\\\\u0002\u0000\'\'\\\\\u0002\u0000\t\t  \u0002\u0000\n\n\r"+
		"\r\u014b\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000"+
		"!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001"+
		"\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000"+
		"\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000"+
		"\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003"+
		"\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001\u0000"+
		"\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000"+
		"\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000A"+
		"\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000E\u0001\u0000"+
		"\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000I\u0001\u0000\u0000\u0000"+
		"\u0000K\u0001\u0000\u0000\u0000\u0000M\u0001\u0000\u0000\u0000\u0000O"+
		"\u0001\u0000\u0000\u0000\u0000Q\u0001\u0000\u0000\u0000\u0000S\u0001\u0000"+
		"\u0000\u0000\u0000U\u0001\u0000\u0000\u0000\u0000W\u0001\u0000\u0000\u0000"+
		"\u0000Y\u0001\u0000\u0000\u0000\u0000[\u0001\u0000\u0000\u0000\u0001]"+
		"\u0001\u0000\u0000\u0000\u0003`\u0001\u0000\u0000\u0000\u0005c\u0001\u0000"+
		"\u0000\u0000\u0007f\u0001\u0000\u0000\u0000\ti\u0001\u0000\u0000\u0000"+
		"\u000bl\u0001\u0000\u0000\u0000\ro\u0001\u0000\u0000\u0000\u000fq\u0001"+
		"\u0000\u0000\u0000\u0011s\u0001\u0000\u0000\u0000\u0013u\u0001\u0000\u0000"+
		"\u0000\u0015x\u0001\u0000\u0000\u0000\u0017z\u0001\u0000\u0000\u0000\u0019"+
		"}\u0001\u0000\u0000\u0000\u001b\u007f\u0001\u0000\u0000\u0000\u001d\u0081"+
		"\u0001\u0000\u0000\u0000\u001f\u0083\u0001\u0000\u0000\u0000!\u0085\u0001"+
		"\u0000\u0000\u0000#\u008b\u0001\u0000\u0000\u0000%\u0094\u0001\u0000\u0000"+
		"\u0000\'\u0098\u0001\u0000\u0000\u0000)\u009b\u0001\u0000\u0000\u0000"+
		"+\u00a0\u0001\u0000\u0000\u0000-\u00a4\u0001\u0000\u0000\u0000/\u00a7"+
		"\u0001\u0000\u0000\u00001\u00ac\u0001\u0000\u0000\u00003\u00b3\u0001\u0000"+
		"\u0000\u00005\u00ba\u0001\u0000\u0000\u00007\u00bf\u0001\u0000\u0000\u0000"+
		"9\u00c5\u0001\u0000\u0000\u0000;\u00ca\u0001\u0000\u0000\u0000=\u00cd"+
		"\u0001\u0000\u0000\u0000?\u00d1\u0001\u0000\u0000\u0000A\u00d4\u0001\u0000"+
		"\u0000\u0000C\u00d8\u0001\u0000\u0000\u0000E\u00e0\u0001\u0000\u0000\u0000"+
		"G\u0103\u0001\u0000\u0000\u0000I\u0106\u0001\u0000\u0000\u0000K\u010b"+
		"\u0001\u0000\u0000\u0000M\u0111\u0001\u0000\u0000\u0000O\u011a\u0001\u0000"+
		"\u0000\u0000Q\u0127\u0001\u0000\u0000\u0000S\u0132\u0001\u0000\u0000\u0000"+
		"U\u0134\u0001\u0000\u0000\u0000W\u0136\u0001\u0000\u0000\u0000Y\u0139"+
		"\u0001\u0000\u0000\u0000[\u013c\u0001\u0000\u0000\u0000]^\u0005(\u0000"+
		"\u0000^_\u0006\u0000\u0000\u0000_\u0002\u0001\u0000\u0000\u0000`a\u0005"+
		")\u0000\u0000ab\u0006\u0001\u0001\u0000b\u0004\u0001\u0000\u0000\u0000"+
		"cd\u0005[\u0000\u0000de\u0006\u0002\u0002\u0000e\u0006\u0001\u0000\u0000"+
		"\u0000fg\u0005]\u0000\u0000gh\u0006\u0003\u0003\u0000h\b\u0001\u0000\u0000"+
		"\u0000ij\u0005{\u0000\u0000jk\u0006\u0004\u0004\u0000k\n\u0001\u0000\u0000"+
		"\u0000lm\u0005}\u0000\u0000mn\u0006\u0005\u0005\u0000n\f\u0001\u0000\u0000"+
		"\u0000op\u0005@\u0000\u0000p\u000e\u0001\u0000\u0000\u0000qr\u0005.\u0000"+
		"\u0000r\u0010\u0001\u0000\u0000\u0000st\u0005,\u0000\u0000t\u0012\u0001"+
		"\u0000\u0000\u0000uv\u0005:\u0000\u0000vw\u0006\t\u0006\u0000w\u0014\u0001"+
		"\u0000\u0000\u0000xy\u0005=\u0000\u0000y\u0016\u0001\u0000\u0000\u0000"+
		"z{\u0005=\u0000\u0000{|\u0005=\u0000\u0000|\u0018\u0001\u0000\u0000\u0000"+
		"}~\u0005+\u0000\u0000~\u001a\u0001\u0000\u0000\u0000\u007f\u0080\u0005"+
		"-\u0000\u0000\u0080\u001c\u0001\u0000\u0000\u0000\u0081\u0082\u0005*\u0000"+
		"\u0000\u0082\u001e\u0001\u0000\u0000\u0000\u0083\u0084\u0005/\u0000\u0000"+
		"\u0084 \u0001\u0000\u0000\u0000\u0085\u0086\u0005b\u0000\u0000\u0086\u0087"+
		"\u0005r\u0000\u0000\u0087\u0088\u0005e\u0000\u0000\u0088\u0089\u0005a"+
		"\u0000\u0000\u0089\u008a\u0005k\u0000\u0000\u008a\"\u0001\u0000\u0000"+
		"\u0000\u008b\u008c\u0005c\u0000\u0000\u008c\u008d\u0005o\u0000\u0000\u008d"+
		"\u008e\u0005n\u0000\u0000\u008e\u008f\u0005t\u0000\u0000\u008f\u0090\u0005"+
		"i\u0000\u0000\u0090\u0091\u0005n\u0000\u0000\u0091\u0092\u0005u\u0000"+
		"\u0000\u0092\u0093\u0005e\u0000\u0000\u0093$\u0001\u0000\u0000\u0000\u0094"+
		"\u0095\u0005d\u0000\u0000\u0095\u0096\u0005e\u0000\u0000\u0096\u0097\u0005"+
		"f\u0000\u0000\u0097&\u0001\u0000\u0000\u0000\u0098\u0099\u0005i\u0000"+
		"\u0000\u0099\u009a\u0005f\u0000\u0000\u009a(\u0001\u0000\u0000\u0000\u009b"+
		"\u009c\u0005e\u0000\u0000\u009c\u009d\u0005l\u0000\u0000\u009d\u009e\u0005"+
		"s\u0000\u0000\u009e\u009f\u0005e\u0000\u0000\u009f*\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a1\u0005f\u0000\u0000\u00a1\u00a2\u0005o\u0000\u0000\u00a2"+
		"\u00a3\u0005r\u0000\u0000\u00a3,\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005"+
		"i\u0000\u0000\u00a5\u00a6\u0005n\u0000\u0000\u00a6.\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a8\u0005f\u0000\u0000\u00a8\u00a9\u0005r\u0000\u0000\u00a9"+
		"\u00aa\u0005o\u0000\u0000\u00aa\u00ab\u0005m\u0000\u0000\u00ab0\u0001"+
		"\u0000\u0000\u0000\u00ac\u00ad\u0005i\u0000\u0000\u00ad\u00ae\u0005m\u0000"+
		"\u0000\u00ae\u00af\u0005p\u0000\u0000\u00af\u00b0\u0005o\u0000\u0000\u00b0"+
		"\u00b1\u0005r\u0000\u0000\u00b1\u00b2\u0005t\u0000\u0000\u00b22\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b4\u0005r\u0000\u0000\u00b4\u00b5\u0005e\u0000"+
		"\u0000\u00b5\u00b6\u0005t\u0000\u0000\u00b6\u00b7\u0005u\u0000\u0000\u00b7"+
		"\u00b8\u0005r\u0000\u0000\u00b8\u00b9\u0005n\u0000\u0000\u00b94\u0001"+
		"\u0000\u0000\u0000\u00ba\u00bb\u0005T\u0000\u0000\u00bb\u00bc\u0005r\u0000"+
		"\u0000\u00bc\u00bd\u0005u\u0000\u0000\u00bd\u00be\u0005e\u0000\u0000\u00be"+
		"6\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005F\u0000\u0000\u00c0\u00c1\u0005"+
		"a\u0000\u0000\u00c1\u00c2\u0005l\u0000\u0000\u00c2\u00c3\u0005s\u0000"+
		"\u0000\u00c3\u00c4\u0005e\u0000\u0000\u00c48\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c6\u0005N\u0000\u0000\u00c6\u00c7\u0005o\u0000\u0000\u00c7\u00c8\u0005"+
		"n\u0000\u0000\u00c8\u00c9\u0005e\u0000\u0000\u00c9:\u0001\u0000\u0000"+
		"\u0000\u00ca\u00cb\u0005i\u0000\u0000\u00cb\u00cc\u0005s\u0000\u0000\u00cc"+
		"<\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005a\u0000\u0000\u00ce\u00cf\u0005"+
		"n\u0000\u0000\u00cf\u00d0\u0005d\u0000\u0000\u00d0>\u0001\u0000\u0000"+
		"\u0000\u00d1\u00d2\u0005o\u0000\u0000\u00d2\u00d3\u0005r\u0000\u0000\u00d3"+
		"@\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005n\u0000\u0000\u00d5\u00d6\u0005"+
		"o\u0000\u0000\u00d6\u00d7\u0005t\u0000\u0000\u00d7B\u0001\u0000\u0000"+
		"\u0000\u00d8\u00dc\u0007\u0000\u0000\u0000\u00d9\u00db\u0007\u0001\u0000"+
		"\u0000\u00da\u00d9\u0001\u0000\u0000\u0000\u00db\u00de\u0001\u0000\u0000"+
		"\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000"+
		"\u0000\u00ddD\u0001\u0000\u0000\u0000\u00de\u00dc\u0001\u0000\u0000\u0000"+
		"\u00df\u00e1\u0005-\u0000\u0000\u00e0\u00df\u0001\u0000\u0000\u0000\u00e0"+
		"\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e3\u0001\u0000\u0000\u0000\u00e2"+
		"\u00e4\u0007\u0002\u0000\u0000\u00e3\u00e2\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e5\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e5"+
		"\u00e6\u0001\u0000\u0000\u0000\u00e6\u00ed\u0001\u0000\u0000\u0000\u00e7"+
		"\u00e9\u0005.\u0000\u0000\u00e8\u00ea\u0007\u0002\u0000\u0000\u00e9\u00e8"+
		"\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u00e9"+
		"\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ee"+
		"\u0001\u0000\u0000\u0000\u00ed\u00e7\u0001\u0000\u0000\u0000\u00ed\u00ee"+
		"\u0001\u0000\u0000\u0000\u00eeF\u0001\u0000\u0000\u0000\u00ef\u00f5\u0005"+
		"\"\u0000\u0000\u00f0\u00f4\b\u0003\u0000\u0000\u00f1\u00f2\u0005\\\u0000"+
		"\u0000\u00f2\u00f4\t\u0000\u0000\u0000\u00f3\u00f0\u0001\u0000\u0000\u0000"+
		"\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f4\u00f7\u0001\u0000\u0000\u0000"+
		"\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000"+
		"\u00f6\u00f8\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000"+
		"\u00f8\u0104\u0005\"\u0000\u0000\u00f9\u00ff\u0005\'\u0000\u0000\u00fa"+
		"\u00fe\b\u0004\u0000\u0000\u00fb\u00fc\u0005\\\u0000\u0000\u00fc\u00fe"+
		"\t\u0000\u0000\u0000\u00fd\u00fa\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001"+
		"\u0000\u0000\u0000\u00fe\u0101\u0001\u0000\u0000\u0000\u00ff\u00fd\u0001"+
		"\u0000\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u0102\u0001"+
		"\u0000\u0000\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0102\u0104\u0005"+
		"\'\u0000\u0000\u0103\u00ef\u0001\u0000\u0000\u0000\u0103\u00f9\u0001\u0000"+
		"\u0000\u0000\u0104H\u0001\u0000\u0000\u0000\u0105\u0107\u0005\r\u0000"+
		"\u0000\u0106\u0105\u0001\u0000\u0000\u0000\u0106\u0107\u0001\u0000\u0000"+
		"\u0000\u0107\u0108\u0001\u0000\u0000\u0000\u0108\u0109\u0005\n\u0000\u0000"+
		"\u0109J\u0001\u0000\u0000\u0000\u010a\u010c\u0007\u0005\u0000\u0000\u010b"+
		"\u010a\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d"+
		"\u010b\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000\u010e"+
		"\u010f\u0001\u0000\u0000\u0000\u010f\u0110\u0006%\u0007\u0000\u0110L\u0001"+
		"\u0000\u0000\u0000\u0111\u0115\u0005#\u0000\u0000\u0112\u0114\b\u0006"+
		"\u0000\u0000\u0113\u0112\u0001\u0000\u0000\u0000\u0114\u0117\u0001\u0000"+
		"\u0000\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0115\u0116\u0001\u0000"+
		"\u0000\u0000\u0116\u0118\u0001\u0000\u0000\u0000\u0117\u0115\u0001\u0000"+
		"\u0000\u0000\u0118\u0119\u0006&\u0007\u0000\u0119N\u0001\u0000\u0000\u0000"+
		"\u011a\u011b\u0005<\u0000\u0000\u011b\u011c\u0005B\u0000\u0000\u011c\u011d"+
		"\u0005L\u0000\u0000\u011d\u011e\u0005O\u0000\u0000\u011e\u011f\u0005C"+
		"\u0000\u0000\u011f\u0120\u0005K\u0000\u0000\u0120\u0121\u0005S\u0000\u0000"+
		"\u0121\u0122\u0005T\u0000\u0000\u0122\u0123\u0005A\u0000\u0000\u0123\u0124"+
		"\u0005R\u0000\u0000\u0124\u0125\u0005T\u0000\u0000\u0125\u0126\u0005>"+
		"\u0000\u0000\u0126P\u0001\u0000\u0000\u0000\u0127\u0128\u0005<\u0000\u0000"+
		"\u0128\u0129\u0005B\u0000\u0000\u0129\u012a\u0005L\u0000\u0000\u012a\u012b"+
		"\u0005O\u0000\u0000\u012b\u012c\u0005C\u0000\u0000\u012c\u012d\u0005K"+
		"\u0000\u0000\u012d\u012e\u0005E\u0000\u0000\u012e\u012f\u0005N\u0000\u0000"+
		"\u012f\u0130\u0005D\u0000\u0000\u0130\u0131\u0005>\u0000\u0000\u0131R"+
		"\u0001\u0000\u0000\u0000\u0132\u0133\u0005>\u0000\u0000\u0133T\u0001\u0000"+
		"\u0000\u0000\u0134\u0135\u0005<\u0000\u0000\u0135V\u0001\u0000\u0000\u0000"+
		"\u0136\u0137\u0005>\u0000\u0000\u0137\u0138\u0005=\u0000\u0000\u0138X"+
		"\u0001\u0000\u0000\u0000\u0139\u013a\u0005<\u0000\u0000\u013a\u013b\u0005"+
		"=\u0000\u0000\u013bZ\u0001\u0000\u0000\u0000\u013c\u013d\u0005!\u0000"+
		"\u0000\u013d\u013e\u0005=\u0000\u0000\u013e\\\u0001\u0000\u0000\u0000"+
		"\u000e\u0000\u00dc\u00e0\u00e5\u00eb\u00ed\u00f3\u00f5\u00fd\u00ff\u0103"+
		"\u0106\u010d\u0115\b\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0002\u0002"+
		"\u0001\u0003\u0003\u0001\u0004\u0004\u0001\u0005\u0005\u0001\t\u0006\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}