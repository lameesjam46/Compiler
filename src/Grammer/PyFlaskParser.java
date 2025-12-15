// Generated from C:/Users/dell/IdeaProjects/Compiler/src/Grammer/PyFlaskParser.g4 by ANTLR 4.13.2
package Grammer;
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
		FROM=1, IMPORT=2, DEF=3, RETURN=4, IF=5, ELSE=6, FOR=7, IN=8, ROUTE=9, 
		LPAREN=10, RPAREN=11, LBRACK=12, RBRACK=13, LBRACE=14, RBRACE=15, COLON=16, 
		COMMA=17, EQUAL=18, DOT=19, ID=20, NUMBER=21, STRING=22, NEWLINE=23, WS=24, 
		LINE_COMMENT=25, BLOCK_COMMENT=26;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_importStmt = 2, RULE_importList = 3, 
		RULE_routeStmt = 4, RULE_functionDef = 5, RULE_block = 6, RULE_simpleStmt = 7, 
		RULE_assignment = 8, RULE_exprStart = 9, RULE_expr = 10, RULE_arglist = 11, 
		RULE_arg = 12, RULE_listLiteral = 13, RULE_elementList = 14, RULE_element = 15, 
		RULE_dictLiteral = 16, RULE_pairList = 17, RULE_pair = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "importStmt", "importList", "routeStmt", "functionDef", 
			"block", "simpleStmt", "assignment", "exprStart", "expr", "arglist", 
			"arg", "listLiteral", "elementList", "element", "dictLiteral", "pairList", 
			"pair"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'from'", "'import'", "'def'", "'return'", "'if'", "'else'", "'for'", 
			"'in'", "'route'", "'('", "')'", "'['", "']'", "'{'", "'}'", "':'", "','", 
			"'='", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FROM", "IMPORT", "DEF", "RETURN", "IF", "ELSE", "FOR", "IN", "ROUTE", 
			"LPAREN", "RPAREN", "LBRACK", "RBRACK", "LBRACE", "RBRACE", "COLON", 
			"COMMA", "EQUAL", "DOT", "ID", "NUMBER", "STRING", "NEWLINE", "WS", "LINE_COMMENT", 
			"BLOCK_COMMENT"
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
		public List<TerminalNode> NEWLINE() { return getTokens(PyFlaskParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(PyFlaskParser.NEWLINE, i);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15749150L) != 0)) {
				{
				{
				setState(38);
				statement();
				setState(42);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(39);
						match(NEWLINE);
						}
						} 
					}
					setState(44);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				}
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
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
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public SimpleStmtContext simpleStmt() {
			return getRuleContext(SimpleStmtContext.class,0);
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
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				importStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				routeStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
				functionDef();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(55);
				assignment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(56);
				simpleStmt();
				}
				break;
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
		public ImportListContext importList() {
			return getRuleContext(ImportListContext.class,0);
		}
		public TerminalNode FROM() { return getToken(PyFlaskParser.FROM, 0); }
		public TerminalNode ID() { return getToken(PyFlaskParser.ID, 0); }
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
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				match(IMPORT);
				setState(60);
				importList();
				}
				break;
			case FROM:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				match(FROM);
				setState(62);
				match(ID);
				setState(63);
				match(IMPORT);
				setState(64);
				importList();
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
	public static class ImportListContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PyFlaskParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PyFlaskParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PyFlaskParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PyFlaskParser.COMMA, i);
		}
		public ImportListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyFlaskParserListener ) ((PyFlaskParserListener)listener).enterImportList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyFlaskParserListener ) ((PyFlaskParserListener)listener).exitImportList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyFlaskParserVisitor ) return ((PyFlaskParserVisitor<? extends T>)visitor).visitImportList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportListContext importList() throws RecognitionException {
		ImportListContext _localctx = new ImportListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(ID);
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(68);
				match(COMMA);
				setState(69);
				match(ID);
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RouteStmtContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PyFlaskParser.ID, 0); }
		public TerminalNode DOT() { return getToken(PyFlaskParser.DOT, 0); }
		public TerminalNode ROUTE() { return getToken(PyFlaskParser.ROUTE, 0); }
		public TerminalNode LPAREN() { return getToken(PyFlaskParser.LPAREN, 0); }
		public TerminalNode STRING() { return getToken(PyFlaskParser.STRING, 0); }
		public TerminalNode RPAREN() { return getToken(PyFlaskParser.RPAREN, 0); }
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
		enterRule(_localctx, 8, RULE_routeStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(ID);
			setState(76);
			match(DOT);
			setState(77);
			match(ROUTE);
			setState(78);
			match(LPAREN);
			setState(79);
			match(STRING);
			setState(80);
			match(RPAREN);
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
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
		enterRule(_localctx, 10, RULE_functionDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(DEF);
			setState(83);
			match(ID);
			setState(84);
			match(LPAREN);
			setState(85);
			match(RPAREN);
			setState(86);
			match(COLON);
			setState(87);
			block();
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
	public static class BlockContext extends ParserRuleContext {
		public List<SimpleStmtContext> simpleStmt() {
			return getRuleContexts(SimpleStmtContext.class);
		}
		public SimpleStmtContext simpleStmt(int i) {
			return getRuleContext(SimpleStmtContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(PyFlaskParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(PyFlaskParser.NEWLINE, i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyFlaskParserListener ) ((PyFlaskParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyFlaskParserListener ) ((PyFlaskParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyFlaskParserVisitor ) return ((PyFlaskParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(89);
					simpleStmt();
					setState(93);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(90);
							match(NEWLINE);
							}
							} 
						}
						setState(95);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
					}
					}
					} 
				}
				setState(100);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleStmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(PyFlaskParser.RETURN, 0); }
		public ExprStartContext exprStart() {
			return getRuleContext(ExprStartContext.class,0);
		}
		public SimpleStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyFlaskParserListener ) ((PyFlaskParserListener)listener).enterSimpleStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyFlaskParserListener ) ((PyFlaskParserListener)listener).exitSimpleStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyFlaskParserVisitor ) return ((PyFlaskParserVisitor<? extends T>)visitor).visitSimpleStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleStmtContext simpleStmt() throws RecognitionException {
		SimpleStmtContext _localctx = new SimpleStmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_simpleStmt);
		try {
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				match(RETURN);
				setState(102);
				exprStart();
				}
				break;
			case LBRACK:
			case LBRACE:
			case ID:
			case NUMBER:
			case STRING:
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				exprStart();
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
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PyFlaskParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(PyFlaskParser.EQUAL, 0); }
		public ExprStartContext exprStart() {
			return getRuleContext(ExprStartContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyFlaskParserListener ) ((PyFlaskParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyFlaskParserListener ) ((PyFlaskParserListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyFlaskParserVisitor ) return ((PyFlaskParserVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(ID);
			setState(107);
			match(EQUAL);
			setState(108);
			exprStart();
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
	public static class ExprStartContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(PyFlaskParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(PyFlaskParser.NEWLINE, i);
		}
		public ExprStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyFlaskParserListener ) ((PyFlaskParserListener)listener).enterExprStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyFlaskParserListener ) ((PyFlaskParserListener)listener).exitExprStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyFlaskParserVisitor ) return ((PyFlaskParserVisitor<? extends T>)visitor).visitExprStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprStartContext exprStart() throws RecognitionException {
		ExprStartContext _localctx = new ExprStartContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_exprStart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(110);
				match(NEWLINE);
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116);
			expr();
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
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringExprContext extends ExprContext {
		public TerminalNode STRING() { return getToken(PyFlaskParser.STRING, 0); }
		public StringExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyFlaskParserListener ) ((PyFlaskParserListener)listener).enterStringExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyFlaskParserListener ) ((PyFlaskParserListener)listener).exitStringExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyFlaskParserVisitor ) return ((PyFlaskParserVisitor<? extends T>)visitor).visitStringExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(PyFlaskParser.ID, 0); }
		public IdExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyFlaskParserListener ) ((PyFlaskParserListener)listener).enterIdExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyFlaskParserListener ) ((PyFlaskParserListener)listener).exitIdExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyFlaskParserVisitor ) return ((PyFlaskParserVisitor<? extends T>)visitor).visitIdExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberExprContext extends ExprContext {
		public TerminalNode NUMBER() { return getToken(PyFlaskParser.NUMBER, 0); }
		public NumberExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyFlaskParserListener ) ((PyFlaskParserListener)listener).enterNumberExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyFlaskParserListener ) ((PyFlaskParserListener)listener).exitNumberExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyFlaskParserVisitor ) return ((PyFlaskParserVisitor<? extends T>)visitor).visitNumberExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CallExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(PyFlaskParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(PyFlaskParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PyFlaskParser.RPAREN, 0); }
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public CallExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyFlaskParserListener ) ((PyFlaskParserListener)listener).enterCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyFlaskParserListener ) ((PyFlaskParserListener)listener).exitCallExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyFlaskParserVisitor ) return ((PyFlaskParserVisitor<? extends T>)visitor).visitCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DictExprContext extends ExprContext {
		public DictLiteralContext dictLiteral() {
			return getRuleContext(DictLiteralContext.class,0);
		}
		public DictExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyFlaskParserListener ) ((PyFlaskParserListener)listener).enterDictExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyFlaskParserListener ) ((PyFlaskParserListener)listener).exitDictExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyFlaskParserVisitor ) return ((PyFlaskParserVisitor<? extends T>)visitor).visitDictExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListExprContext extends ExprContext {
		public ListLiteralContext listLiteral() {
			return getRuleContext(ListLiteralContext.class,0);
		}
		public ListExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyFlaskParserListener ) ((PyFlaskParserListener)listener).enterListExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyFlaskParserListener ) ((PyFlaskParserListener)listener).exitListExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyFlaskParserVisitor ) return ((PyFlaskParserVisitor<? extends T>)visitor).visitListExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expr);
		int _la;
		try {
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new CallExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				match(ID);
				setState(119);
				match(LPAREN);
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15749120L) != 0)) {
					{
					setState(120);
					arglist();
					}
				}

				setState(123);
				match(RPAREN);
				}
				break;
			case 2:
				_localctx = new ListExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				listLiteral();
				}
				break;
			case 3:
				_localctx = new DictExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
				dictLiteral();
				}
				break;
			case 4:
				_localctx = new IdExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(126);
				match(ID);
				}
				break;
			case 5:
				_localctx = new StringExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(127);
				match(STRING);
				}
				break;
			case 6:
				_localctx = new NumberExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(128);
				match(NUMBER);
				}
				break;
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
	public static class ArglistContext extends ParserRuleContext {
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PyFlaskParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PyFlaskParser.COMMA, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(PyFlaskParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(PyFlaskParser.NEWLINE, i);
		}
		public ArglistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arglist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyFlaskParserListener ) ((PyFlaskParserListener)listener).enterArglist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyFlaskParserListener ) ((PyFlaskParserListener)listener).exitArglist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyFlaskParserVisitor ) return ((PyFlaskParserVisitor<? extends T>)visitor).visitArglist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArglistContext arglist() throws RecognitionException {
		ArglistContext _localctx = new ArglistContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_arglist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			arg();
			setState(140);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(133); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(132);
							_la = _input.LA(1);
							if ( !(_la==COMMA || _la==NEWLINE) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(135); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(137);
					arg();
					}
					} 
				}
				setState(142);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==NEWLINE) {
				{
				{
				setState(143);
				_la = _input.LA(1);
				if ( !(_la==COMMA || _la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgContext extends ParserRuleContext {
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
	 
		public ArgContext() { }
		public void copyFrom(ArgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PositionalArgContext extends ArgContext {
		public ExprStartContext exprStart() {
			return getRuleContext(ExprStartContext.class,0);
		}
		public PositionalArgContext(ArgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyFlaskParserListener ) ((PyFlaskParserListener)listener).enterPositionalArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyFlaskParserListener ) ((PyFlaskParserListener)listener).exitPositionalArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyFlaskParserVisitor ) return ((PyFlaskParserVisitor<? extends T>)visitor).visitPositionalArg(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class KeywordArgContext extends ArgContext {
		public TerminalNode ID() { return getToken(PyFlaskParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(PyFlaskParser.EQUAL, 0); }
		public ExprStartContext exprStart() {
			return getRuleContext(ExprStartContext.class,0);
		}
		public KeywordArgContext(ArgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyFlaskParserListener ) ((PyFlaskParserListener)listener).enterKeywordArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyFlaskParserListener ) ((PyFlaskParserListener)listener).exitKeywordArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyFlaskParserVisitor ) return ((PyFlaskParserVisitor<? extends T>)visitor).visitKeywordArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_arg);
		try {
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new KeywordArgContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				match(ID);
				setState(150);
				match(EQUAL);
				setState(151);
				exprStart();
				}
				break;
			case 2:
				_localctx = new PositionalArgContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				exprStart();
				}
				break;
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
	public static class ListLiteralContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(PyFlaskParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(PyFlaskParser.RBRACK, 0); }
		public ElementListContext elementList() {
			return getRuleContext(ElementListContext.class,0);
		}
		public ListLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyFlaskParserListener ) ((PyFlaskParserListener)listener).enterListLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyFlaskParserListener ) ((PyFlaskParserListener)listener).exitListLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyFlaskParserVisitor ) return ((PyFlaskParserVisitor<? extends T>)visitor).visitListLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListLiteralContext listLiteral() throws RecognitionException {
		ListLiteralContext _localctx = new ListLiteralContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_listLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(LBRACK);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15749120L) != 0)) {
				{
				setState(156);
				elementList();
				}
			}

			setState(159);
			match(RBRACK);
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
	public static class ElementListContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PyFlaskParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PyFlaskParser.COMMA, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(PyFlaskParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(PyFlaskParser.NEWLINE, i);
		}
		public ElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyFlaskParserListener ) ((PyFlaskParserListener)listener).enterElementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyFlaskParserListener ) ((PyFlaskParserListener)listener).exitElementList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyFlaskParserVisitor ) return ((PyFlaskParserVisitor<? extends T>)visitor).visitElementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementListContext elementList() throws RecognitionException {
		ElementListContext _localctx = new ElementListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_elementList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			element();
			setState(170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(163); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(162);
							_la = _input.LA(1);
							if ( !(_la==COMMA || _la==NEWLINE) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(165); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(167);
					element();
					}
					} 
				}
				setState(172);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==NEWLINE) {
				{
				{
				setState(173);
				_la = _input.LA(1);
				if ( !(_la==COMMA || _la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElementContext extends ParserRuleContext {
		public ExprStartContext exprStart() {
			return getRuleContext(ExprStartContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyFlaskParserListener ) ((PyFlaskParserListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyFlaskParserListener ) ((PyFlaskParserListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyFlaskParserVisitor ) return ((PyFlaskParserVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			exprStart();
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
	public static class DictLiteralContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(PyFlaskParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(PyFlaskParser.RBRACE, 0); }
		public PairListContext pairList() {
			return getRuleContext(PairListContext.class,0);
		}
		public DictLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyFlaskParserListener ) ((PyFlaskParserListener)listener).enterDictLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyFlaskParserListener ) ((PyFlaskParserListener)listener).exitDictLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyFlaskParserVisitor ) return ((PyFlaskParserVisitor<? extends T>)visitor).visitDictLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictLiteralContext dictLiteral() throws RecognitionException {
		DictLiteralContext _localctx = new DictLiteralContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_dictLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(LBRACE);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID || _la==STRING) {
				{
				setState(182);
				pairList();
				}
			}

			setState(185);
			match(RBRACE);
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
	public static class PairListContext extends ParserRuleContext {
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PyFlaskParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PyFlaskParser.COMMA, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(PyFlaskParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(PyFlaskParser.NEWLINE, i);
		}
		public PairListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pairList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyFlaskParserListener ) ((PyFlaskParserListener)listener).enterPairList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyFlaskParserListener ) ((PyFlaskParserListener)listener).exitPairList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyFlaskParserVisitor ) return ((PyFlaskParserVisitor<? extends T>)visitor).visitPairList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PairListContext pairList() throws RecognitionException {
		PairListContext _localctx = new PairListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_pairList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			pair();
			setState(196);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(189); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(188);
						_la = _input.LA(1);
						if ( !(_la==COMMA || _la==NEWLINE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(191); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==COMMA || _la==NEWLINE );
					setState(193);
					pair();
					}
					} 
				}
				setState(198);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==NEWLINE) {
				{
				{
				setState(199);
				_la = _input.LA(1);
				if ( !(_la==COMMA || _la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PairContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(PyFlaskParser.COLON, 0); }
		public ExprStartContext exprStart() {
			return getRuleContext(ExprStartContext.class,0);
		}
		public TerminalNode STRING() { return getToken(PyFlaskParser.STRING, 0); }
		public TerminalNode ID() { return getToken(PyFlaskParser.ID, 0); }
		public PairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PyFlaskParserListener ) ((PyFlaskParserListener)listener).enterPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PyFlaskParserListener ) ((PyFlaskParserListener)listener).exitPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyFlaskParserVisitor ) return ((PyFlaskParserVisitor<? extends T>)visitor).visitPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_pair);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(206);
			match(COLON);
			setState(207);
			exprStart();
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
		"\u0004\u0001\u001a\u00d2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0001\u0000\u0001\u0000\u0005\u0000)\b\u0000\n\u0000\f\u0000,\t"+
		"\u0000\u0005\u0000.\b\u0000\n\u0000\f\u00001\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001:\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002B\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u0003G\b\u0003\n\u0003\f\u0003J\t\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0005\u0006\\\b\u0006\n\u0006\f\u0006_"+
		"\t\u0006\u0005\u0006a\b\u0006\n\u0006\f\u0006d\t\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007i\b\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0005\tp\b\t\n\t\f\ts\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0003\nz\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u0082\b\n\u0001\u000b\u0001\u000b\u0004\u000b\u0086\b\u000b\u000b\u000b"+
		"\f\u000b\u0087\u0001\u000b\u0005\u000b\u008b\b\u000b\n\u000b\f\u000b\u008e"+
		"\t\u000b\u0001\u000b\u0005\u000b\u0091\b\u000b\n\u000b\f\u000b\u0094\t"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u009a\b\f\u0001\r\u0001"+
		"\r\u0003\r\u009e\b\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0004\u000e"+
		"\u00a4\b\u000e\u000b\u000e\f\u000e\u00a5\u0001\u000e\u0005\u000e\u00a9"+
		"\b\u000e\n\u000e\f\u000e\u00ac\t\u000e\u0001\u000e\u0005\u000e\u00af\b"+
		"\u000e\n\u000e\f\u000e\u00b2\t\u000e\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u00b8\b\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0004\u0011\u00be\b\u0011\u000b\u0011\f\u0011\u00bf\u0001"+
		"\u0011\u0005\u0011\u00c3\b\u0011\n\u0011\f\u0011\u00c6\t\u0011\u0001\u0011"+
		"\u0005\u0011\u00c9\b\u0011\n\u0011\f\u0011\u00cc\t\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0000\u0000\u0013\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$\u0000\u0002\u0002\u0000\u0011\u0011\u0017\u0017\u0002\u0000\u0014"+
		"\u0014\u0016\u0016\u00dc\u0000/\u0001\u0000\u0000\u0000\u00029\u0001\u0000"+
		"\u0000\u0000\u0004A\u0001\u0000\u0000\u0000\u0006C\u0001\u0000\u0000\u0000"+
		"\bK\u0001\u0000\u0000\u0000\nR\u0001\u0000\u0000\u0000\fb\u0001\u0000"+
		"\u0000\u0000\u000eh\u0001\u0000\u0000\u0000\u0010j\u0001\u0000\u0000\u0000"+
		"\u0012q\u0001\u0000\u0000\u0000\u0014\u0081\u0001\u0000\u0000\u0000\u0016"+
		"\u0083\u0001\u0000\u0000\u0000\u0018\u0099\u0001\u0000\u0000\u0000\u001a"+
		"\u009b\u0001\u0000\u0000\u0000\u001c\u00a1\u0001\u0000\u0000\u0000\u001e"+
		"\u00b3\u0001\u0000\u0000\u0000 \u00b5\u0001\u0000\u0000\u0000\"\u00bb"+
		"\u0001\u0000\u0000\u0000$\u00cd\u0001\u0000\u0000\u0000&*\u0003\u0002"+
		"\u0001\u0000\')\u0005\u0017\u0000\u0000(\'\u0001\u0000\u0000\u0000),\u0001"+
		"\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000"+
		"+.\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000-&\u0001\u0000\u0000"+
		"\u0000.1\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000/0\u0001\u0000"+
		"\u0000\u000002\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000023\u0005"+
		"\u0000\u0000\u00013\u0001\u0001\u0000\u0000\u00004:\u0003\u0004\u0002"+
		"\u00005:\u0003\b\u0004\u00006:\u0003\n\u0005\u00007:\u0003\u0010\b\u0000"+
		"8:\u0003\u000e\u0007\u000094\u0001\u0000\u0000\u000095\u0001\u0000\u0000"+
		"\u000096\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u000098\u0001\u0000"+
		"\u0000\u0000:\u0003\u0001\u0000\u0000\u0000;<\u0005\u0002\u0000\u0000"+
		"<B\u0003\u0006\u0003\u0000=>\u0005\u0001\u0000\u0000>?\u0005\u0014\u0000"+
		"\u0000?@\u0005\u0002\u0000\u0000@B\u0003\u0006\u0003\u0000A;\u0001\u0000"+
		"\u0000\u0000A=\u0001\u0000\u0000\u0000B\u0005\u0001\u0000\u0000\u0000"+
		"CH\u0005\u0014\u0000\u0000DE\u0005\u0011\u0000\u0000EG\u0005\u0014\u0000"+
		"\u0000FD\u0001\u0000\u0000\u0000GJ\u0001\u0000\u0000\u0000HF\u0001\u0000"+
		"\u0000\u0000HI\u0001\u0000\u0000\u0000I\u0007\u0001\u0000\u0000\u0000"+
		"JH\u0001\u0000\u0000\u0000KL\u0005\u0014\u0000\u0000LM\u0005\u0013\u0000"+
		"\u0000MN\u0005\t\u0000\u0000NO\u0005\n\u0000\u0000OP\u0005\u0016\u0000"+
		"\u0000PQ\u0005\u000b\u0000\u0000Q\t\u0001\u0000\u0000\u0000RS\u0005\u0003"+
		"\u0000\u0000ST\u0005\u0014\u0000\u0000TU\u0005\n\u0000\u0000UV\u0005\u000b"+
		"\u0000\u0000VW\u0005\u0010\u0000\u0000WX\u0003\f\u0006\u0000X\u000b\u0001"+
		"\u0000\u0000\u0000Y]\u0003\u000e\u0007\u0000Z\\\u0005\u0017\u0000\u0000"+
		"[Z\u0001\u0000\u0000\u0000\\_\u0001\u0000\u0000\u0000][\u0001\u0000\u0000"+
		"\u0000]^\u0001\u0000\u0000\u0000^a\u0001\u0000\u0000\u0000_]\u0001\u0000"+
		"\u0000\u0000`Y\u0001\u0000\u0000\u0000ad\u0001\u0000\u0000\u0000b`\u0001"+
		"\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000c\r\u0001\u0000\u0000\u0000"+
		"db\u0001\u0000\u0000\u0000ef\u0005\u0004\u0000\u0000fi\u0003\u0012\t\u0000"+
		"gi\u0003\u0012\t\u0000he\u0001\u0000\u0000\u0000hg\u0001\u0000\u0000\u0000"+
		"i\u000f\u0001\u0000\u0000\u0000jk\u0005\u0014\u0000\u0000kl\u0005\u0012"+
		"\u0000\u0000lm\u0003\u0012\t\u0000m\u0011\u0001\u0000\u0000\u0000np\u0005"+
		"\u0017\u0000\u0000on\u0001\u0000\u0000\u0000ps\u0001\u0000\u0000\u0000"+
		"qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rt\u0001\u0000\u0000"+
		"\u0000sq\u0001\u0000\u0000\u0000tu\u0003\u0014\n\u0000u\u0013\u0001\u0000"+
		"\u0000\u0000vw\u0005\u0014\u0000\u0000wy\u0005\n\u0000\u0000xz\u0003\u0016"+
		"\u000b\u0000yx\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z{\u0001"+
		"\u0000\u0000\u0000{\u0082\u0005\u000b\u0000\u0000|\u0082\u0003\u001a\r"+
		"\u0000}\u0082\u0003 \u0010\u0000~\u0082\u0005\u0014\u0000\u0000\u007f"+
		"\u0082\u0005\u0016\u0000\u0000\u0080\u0082\u0005\u0015\u0000\u0000\u0081"+
		"v\u0001\u0000\u0000\u0000\u0081|\u0001\u0000\u0000\u0000\u0081}\u0001"+
		"\u0000\u0000\u0000\u0081~\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000"+
		"\u0000\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0082\u0015\u0001\u0000"+
		"\u0000\u0000\u0083\u008c\u0003\u0018\f\u0000\u0084\u0086\u0007\u0000\u0000"+
		"\u0000\u0085\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000"+
		"\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000"+
		"\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008b\u0003\u0018\f\u0000"+
		"\u008a\u0085\u0001\u0000\u0000\u0000\u008b\u008e\u0001\u0000\u0000\u0000"+
		"\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000"+
		"\u008d\u0092\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000"+
		"\u008f\u0091\u0007\u0000\u0000\u0000\u0090\u008f\u0001\u0000\u0000\u0000"+
		"\u0091\u0094\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000"+
		"\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0017\u0001\u0000\u0000\u0000"+
		"\u0094\u0092\u0001\u0000\u0000\u0000\u0095\u0096\u0005\u0014\u0000\u0000"+
		"\u0096\u0097\u0005\u0012\u0000\u0000\u0097\u009a\u0003\u0012\t\u0000\u0098"+
		"\u009a\u0003\u0012\t\u0000\u0099\u0095\u0001\u0000\u0000\u0000\u0099\u0098"+
		"\u0001\u0000\u0000\u0000\u009a\u0019\u0001\u0000\u0000\u0000\u009b\u009d"+
		"\u0005\f\u0000\u0000\u009c\u009e\u0003\u001c\u000e\u0000\u009d\u009c\u0001"+
		"\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u009f\u0001"+
		"\u0000\u0000\u0000\u009f\u00a0\u0005\r\u0000\u0000\u00a0\u001b\u0001\u0000"+
		"\u0000\u0000\u00a1\u00aa\u0003\u001e\u000f\u0000\u00a2\u00a4\u0007\u0000"+
		"\u0000\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a9\u0003\u001e"+
		"\u000f\u0000\u00a8\u00a3\u0001\u0000\u0000\u0000\u00a9\u00ac\u0001\u0000"+
		"\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000"+
		"\u0000\u0000\u00ab\u00b0\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000"+
		"\u0000\u0000\u00ad\u00af\u0007\u0000\u0000\u0000\u00ae\u00ad\u0001\u0000"+
		"\u0000\u0000\u00af\u00b2\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000"+
		"\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u001d\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b3\u00b4\u0003\u0012"+
		"\t\u0000\u00b4\u001f\u0001\u0000\u0000\u0000\u00b5\u00b7\u0005\u000e\u0000"+
		"\u0000\u00b6\u00b8\u0003\"\u0011\u0000\u00b7\u00b6\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000"+
		"\u00b9\u00ba\u0005\u000f\u0000\u0000\u00ba!\u0001\u0000\u0000\u0000\u00bb"+
		"\u00c4\u0003$\u0012\u0000\u00bc\u00be\u0007\u0000\u0000\u0000\u00bd\u00bc"+
		"\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u00bd"+
		"\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00c1"+
		"\u0001\u0000\u0000\u0000\u00c1\u00c3\u0003$\u0012\u0000\u00c2\u00bd\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c6\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001"+
		"\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00ca\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c7\u00c9\u0007"+
		"\u0000\u0000\u0000\u00c8\u00c7\u0001\u0000\u0000\u0000\u00c9\u00cc\u0001"+
		"\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001"+
		"\u0000\u0000\u0000\u00cb#\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000"+
		"\u0000\u0000\u00cd\u00ce\u0007\u0001\u0000\u0000\u00ce\u00cf\u0005\u0010"+
		"\u0000\u0000\u00cf\u00d0\u0003\u0012\t\u0000\u00d0%\u0001\u0000\u0000"+
		"\u0000\u0017*/9AH]bhqy\u0081\u0087\u008c\u0092\u0099\u009d\u00a5\u00aa"+
		"\u00b0\u00b7\u00bf\u00c4\u00ca";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}