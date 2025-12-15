// Generated from C:/Users/dell/IdeaProjects/Compiler/src/Grammer/python/PyFlaskParser.g4 by ANTLR 4.13.2
package Grammer.python;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class PyFlaskParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DEF=1, RETURN=2, IF=3, ELSE=4, FOR=5, IN=6, IMPORT=7, FROM=8, APP=9, ROUTE=10, 
		RENDER=11, REQUEST=12, ID=13, NUMBER=14, STRING=15, LPAREN=16, RPAREN=17, 
		COLON=18, COMMA=19, EQUAL=20, DOT=21, NEWLINE=22, WS=23;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_importStmt = 2, RULE_routeStmt = 3, 
		RULE_functionDef = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "importStmt", "routeStmt", "functionDef"
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

	@Override
	public String getGrammarFileName() { return "PyFlaskParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PyFlaskParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PyFlaskParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyFlaskParserListener ) ((PyFlaskParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyFlaskParserListener ) ((PyFlaskParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyFlaskParserVisitor ) return ((PyFlaskParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8578L) != 0)) {
				{
				{
				setState(10);
				statement();
				}
				}
				setState(15);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(16);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public ImportStmtContext importStmt() {
			return getRuleContext(ImportStmtContext.class,0);
		}
		public RouteStmtContext routeStmt() {
			return getRuleContext(RouteStmtContext.class,0);
		}
		public FunctionDefContext functionDef() {
			return getRuleContext(FunctionDefContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyFlaskParserListener ) ((PyFlaskParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyFlaskParserListener ) ((PyFlaskParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyFlaskParserVisitor ) return ((PyFlaskParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(21);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
			case FROM:
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				importStmt();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(19);
				routeStmt();
				}
				break;
			case DEF:
				enterOuterAlt(_localctx, 3);
				{
				setState(20);
				functionDef();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportStmtContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(PyFlaskParser.IMPORT, 0); }
		public List<TerminalNode> ID() { return getTokens(PyFlaskParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PyFlaskParser.ID, i);
		}
		public TerminalNode NEWLINE() { return getToken(PyFlaskParser.NEWLINE, 0); }
		public TerminalNode FROM() { return getToken(PyFlaskParser.FROM, 0); }
		public ImportStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyFlaskParserListener ) ((PyFlaskParserListener)listener).enterImportStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyFlaskParserListener ) ((PyFlaskParserListener)listener).exitImportStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyFlaskParserVisitor ) return ((PyFlaskParserVisitor<? extends T>)visitor).visitImportStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStmtContext importStmt() throws RecognitionException {
		ImportStmtContext _localctx = new ImportStmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importStmt);
		try {
			setState(31);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(23);
				match(IMPORT);
				setState(24);
				match(ID);
				setState(25);
				match(NEWLINE);
				}
				break;
			case FROM:
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				match(FROM);
				setState(27);
				match(ID);
				setState(28);
				match(IMPORT);
				setState(29);
				match(ID);
				setState(30);
				match(NEWLINE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RouteStmtContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PyFlaskParser.ID, 0); }
		public TerminalNode DOT() { return getToken(PyFlaskParser.DOT, 0); }
		public TerminalNode ROUTE() { return getToken(PyFlaskParser.ROUTE, 0); }
		public TerminalNode LPAREN() { return getToken(PyFlaskParser.LPAREN, 0); }
		public TerminalNode STRING() { return getToken(PyFlaskParser.STRING, 0); }
		public TerminalNode RPAREN() { return getToken(PyFlaskParser.RPAREN, 0); }
		public TerminalNode NEWLINE() { return getToken(PyFlaskParser.NEWLINE, 0); }
		public RouteStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routeStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyFlaskParserListener ) ((PyFlaskParserListener)listener).enterRouteStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyFlaskParserListener ) ((PyFlaskParserListener)listener).exitRouteStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyFlaskParserVisitor ) return ((PyFlaskParserVisitor<? extends T>)visitor).visitRouteStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RouteStmtContext routeStmt() throws RecognitionException {
		RouteStmtContext _localctx = new RouteStmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_routeStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(ID);
			setState(34);
			match(DOT);
			setState(35);
			match(ROUTE);
			setState(36);
			match(LPAREN);
			setState(37);
			match(STRING);
			setState(38);
			match(RPAREN);
			setState(39);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDefContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(PyFlaskParser.DEF, 0); }
		public TerminalNode ID() { return getToken(PyFlaskParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(PyFlaskParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PyFlaskParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(PyFlaskParser.COLON, 0); }
		public TerminalNode NEWLINE() { return getToken(PyFlaskParser.NEWLINE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyFlaskParserListener ) ((PyFlaskParserListener)listener).enterFunctionDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyFlaskParserListener ) ((PyFlaskParserListener)listener).exitFunctionDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyFlaskParserVisitor ) return ((PyFlaskParserVisitor<? extends T>)visitor).visitFunctionDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefContext functionDef() throws RecognitionException {
		FunctionDefContext _localctx = new FunctionDefContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionDef);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(DEF);
			setState(42);
			match(ID);
			setState(43);
			match(LPAREN);
			setState(44);
			match(RPAREN);
			setState(45);
			match(COLON);
			setState(46);
			match(NEWLINE);
			setState(50);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(47);
					statement();
					}
					} 
				}
				setState(52);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u00176\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0005\u0000\f\b\u0000\n\u0000\f\u0000\u000f\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0016\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002 \b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u00041\b\u0004\n\u0004\f\u00044\t\u0004\u0001\u0004"+
		"\u0000\u0000\u0005\u0000\u0002\u0004\u0006\b\u0000\u00005\u0000\r\u0001"+
		"\u0000\u0000\u0000\u0002\u0015\u0001\u0000\u0000\u0000\u0004\u001f\u0001"+
		"\u0000\u0000\u0000\u0006!\u0001\u0000\u0000\u0000\b)\u0001\u0000\u0000"+
		"\u0000\n\f\u0003\u0002\u0001\u0000\u000b\n\u0001\u0000\u0000\u0000\f\u000f"+
		"\u0001\u0000\u0000\u0000\r\u000b\u0001\u0000\u0000\u0000\r\u000e\u0001"+
		"\u0000\u0000\u0000\u000e\u0010\u0001\u0000\u0000\u0000\u000f\r\u0001\u0000"+
		"\u0000\u0000\u0010\u0011\u0005\u0000\u0000\u0001\u0011\u0001\u0001\u0000"+
		"\u0000\u0000\u0012\u0016\u0003\u0004\u0002\u0000\u0013\u0016\u0003\u0006"+
		"\u0003\u0000\u0014\u0016\u0003\b\u0004\u0000\u0015\u0012\u0001\u0000\u0000"+
		"\u0000\u0015\u0013\u0001\u0000\u0000\u0000\u0015\u0014\u0001\u0000\u0000"+
		"\u0000\u0016\u0003\u0001\u0000\u0000\u0000\u0017\u0018\u0005\u0007\u0000"+
		"\u0000\u0018\u0019\u0005\r\u0000\u0000\u0019 \u0005\u0016\u0000\u0000"+
		"\u001a\u001b\u0005\b\u0000\u0000\u001b\u001c\u0005\r\u0000\u0000\u001c"+
		"\u001d\u0005\u0007\u0000\u0000\u001d\u001e\u0005\r\u0000\u0000\u001e "+
		"\u0005\u0016\u0000\u0000\u001f\u0017\u0001\u0000\u0000\u0000\u001f\u001a"+
		"\u0001\u0000\u0000\u0000 \u0005\u0001\u0000\u0000\u0000!\"\u0005\r\u0000"+
		"\u0000\"#\u0005\u0015\u0000\u0000#$\u0005\n\u0000\u0000$%\u0005\u0010"+
		"\u0000\u0000%&\u0005\u000f\u0000\u0000&\'\u0005\u0011\u0000\u0000\'(\u0005"+
		"\u0016\u0000\u0000(\u0007\u0001\u0000\u0000\u0000)*\u0005\u0001\u0000"+
		"\u0000*+\u0005\r\u0000\u0000+,\u0005\u0010\u0000\u0000,-\u0005\u0011\u0000"+
		"\u0000-.\u0005\u0012\u0000\u0000.2\u0005\u0016\u0000\u0000/1\u0003\u0002"+
		"\u0001\u00000/\u0001\u0000\u0000\u000014\u0001\u0000\u0000\u000020\u0001"+
		"\u0000\u0000\u000023\u0001\u0000\u0000\u00003\t\u0001\u0000\u0000\u0000"+
		"42\u0001\u0000\u0000\u0000\u0004\r\u0015\u001f2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}