// Generated from C:/Users/dell/IdeaProjects/Compiler/src/JinjaGrammer/JinjaParser.g4 by ANTLR 4.13.2
package JinjaGrammer;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class JinjaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HTML_COMMENT=1, HTML_TEXT=2, HTML_DOCTYPE=3, TAG_OPEN=4, SEA_WS=5, JINJA_EXPR_START=6, 
		JINJA_BLOCK_START=7, JINJA_COMMENT=8, TAG_CLOSE=9, TAG_SLASH_CLOSE=10, 
		TAG_SLASH=11, TAG_EQUALS=12, TAG_NAME=13, TAG_WS=14, TAG_STRING=15, JINJA_WS=16, 
		JINJA_END_EXPR=17, JINJA_END_BLOCK=18, JINJA_IF=19, JINJA_ELIF=20, JINJA_ELSE=21, 
		JINJA_FOR=22, JINJA_IN=23, JINJA_SET=24, JINJA_ENDIF=25, JINJA_ENDFOR=26, 
		JINJA_CONTINUE=27, JINJA_BREAK=28, JINJA_NONE=29, JINJA_TRUE=30, JINJA_FALSE=31, 
		JINJA_AND=32, JINJA_OR=33, JINJA_NOT=34, JINJA_IS=35, JINJA_EQ=36, JINJA_NEQ=37, 
		JINJA_GTE=38, JINJA_LTE=39, JINJA_GT=40, JINJA_LT=41, JINJA_ASSIGN=42, 
		JINJA_ADD=43, JINJA_SUB=44, JINJA_MUL=45, JINJA_DIV=46, JINJA_MOD=47, 
		JINJA_DOT=48, JINJA_PIPE=49, JINJA_LPAREN=50, JINJA_RPAREN=51, JINJA_LBRACK=52, 
		JINJA_RBRACK=53, JINJA_COLON=54, JINJA_COMMA=55, JINJA_INT=56, JINJA_STRING=57, 
		JINJA_ID=58;
	public static final int
		RULE_document = 0, RULE_node = 1, RULE_htmlElement = 2, RULE_endTag = 3, 
		RULE_htmlAttribute = 4, RULE_htmlContent = 5, RULE_jinjaExpr = 6, RULE_jinjaStmt = 7, 
		RULE_stmt = 8, RULE_ifStmt = 9, RULE_elifStmt = 10, RULE_elseStmt = 11, 
		RULE_forStmt = 12, RULE_setStmt = 13, RULE_expression = 14, RULE_logicalOrExpr = 15, 
		RULE_logicalAndExpr = 16, RULE_logicalNotExpr = 17, RULE_comparisonExpr = 18, 
		RULE_additiveExpr = 19, RULE_multiplicativeExpr = 20, RULE_unaryExpr = 21, 
		RULE_postfixExpr = 22, RULE_postfixPart = 23, RULE_sliceExpr = 24, RULE_primary = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"document", "node", "htmlElement", "endTag", "htmlAttribute", "htmlContent", 
			"jinjaExpr", "jinjaStmt", "stmt", "ifStmt", "elifStmt", "elseStmt", "forStmt", 
			"setStmt", "expression", "logicalOrExpr", "logicalAndExpr", "logicalNotExpr", 
			"comparisonExpr", "additiveExpr", "multiplicativeExpr", "unaryExpr", 
			"postfixExpr", "postfixPart", "sliceExpr", "primary"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "'{{'", "'{%'", null, null, "'/>'", 
			null, null, null, null, null, null, "'}}'", "'%}'", "'if'", "'elif'", 
			"'else'", "'for'", "'in'", "'set'", "'endif'", "'endfor'", "'continue'", 
			"'break'", "'none'", "'true'", "'false'", "'and'", "'or'", "'not'", "'is'", 
			"'=='", "'!='", "'>='", "'<='", null, null, null, "'+'", "'-'", "'*'", 
			null, "'%'", "'.'", "'|'", "'('", "')'", "'['", "']'", "':'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "HTML_COMMENT", "HTML_TEXT", "HTML_DOCTYPE", "TAG_OPEN", "SEA_WS", 
			"JINJA_EXPR_START", "JINJA_BLOCK_START", "JINJA_COMMENT", "TAG_CLOSE", 
			"TAG_SLASH_CLOSE", "TAG_SLASH", "TAG_EQUALS", "TAG_NAME", "TAG_WS", "TAG_STRING", 
			"JINJA_WS", "JINJA_END_EXPR", "JINJA_END_BLOCK", "JINJA_IF", "JINJA_ELIF", 
			"JINJA_ELSE", "JINJA_FOR", "JINJA_IN", "JINJA_SET", "JINJA_ENDIF", "JINJA_ENDFOR", 
			"JINJA_CONTINUE", "JINJA_BREAK", "JINJA_NONE", "JINJA_TRUE", "JINJA_FALSE", 
			"JINJA_AND", "JINJA_OR", "JINJA_NOT", "JINJA_IS", "JINJA_EQ", "JINJA_NEQ", 
			"JINJA_GTE", "JINJA_LTE", "JINJA_GT", "JINJA_LT", "JINJA_ASSIGN", "JINJA_ADD", 
			"JINJA_SUB", "JINJA_MUL", "JINJA_DIV", "JINJA_MOD", "JINJA_DOT", "JINJA_PIPE", 
			"JINJA_LPAREN", "JINJA_RPAREN", "JINJA_LBRACK", "JINJA_RBRACK", "JINJA_COLON", 
			"JINJA_COMMA", "JINJA_INT", "JINJA_STRING", "JINJA_ID"
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
	public String getGrammarFileName() { return "JinjaParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JinjaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DocumentContext extends ParserRuleContext {
		public DocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document; }
	 
		public DocumentContext() { }
		public void copyFrom(DocumentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DocumentRootContext extends DocumentContext {
		public TerminalNode EOF() { return getToken(JinjaParser.EOF, 0); }
		public List<NodeContext> node() {
			return getRuleContexts(NodeContext.class);
		}
		public NodeContext node(int i) {
			return getRuleContext(NodeContext.class,i);
		}
		public DocumentRootContext(DocumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterDocumentRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitDocumentRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitDocumentRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_document);
		int _la;
		try {
			_localctx = new DocumentRootContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 222L) != 0)) {
				{
				{
				setState(52);
				node();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
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
	public static class NodeContext extends ParserRuleContext {
		public NodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node; }
	 
		public NodeContext() { }
		public void copyFrom(NodeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NodeHtmlCommentContext extends NodeContext {
		public TerminalNode HTML_COMMENT() { return getToken(JinjaParser.HTML_COMMENT, 0); }
		public NodeHtmlCommentContext(NodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterNodeHtmlComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitNodeHtmlComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitNodeHtmlComment(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NodeJinjaExprContext extends NodeContext {
		public JinjaExprContext jinjaExpr() {
			return getRuleContext(JinjaExprContext.class,0);
		}
		public NodeJinjaExprContext(NodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterNodeJinjaExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitNodeJinjaExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitNodeJinjaExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NodeHtmlTextContext extends NodeContext {
		public TerminalNode HTML_TEXT() { return getToken(JinjaParser.HTML_TEXT, 0); }
		public NodeHtmlTextContext(NodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterNodeHtmlText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitNodeHtmlText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitNodeHtmlText(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NodeHtmlContext extends NodeContext {
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public NodeHtmlContext(NodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterNodeHtml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitNodeHtml(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitNodeHtml(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NodeHtmlDoctypeContext extends NodeContext {
		public TerminalNode HTML_DOCTYPE() { return getToken(JinjaParser.HTML_DOCTYPE, 0); }
		public NodeHtmlDoctypeContext(NodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterNodeHtmlDoctype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitNodeHtmlDoctype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitNodeHtmlDoctype(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NodeJinjaStmtContext extends NodeContext {
		public JinjaStmtContext jinjaStmt() {
			return getRuleContext(JinjaStmtContext.class,0);
		}
		public NodeJinjaStmtContext(NodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterNodeJinjaStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitNodeJinjaStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitNodeJinjaStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NodeContext node() throws RecognitionException {
		NodeContext _localctx = new NodeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_node);
		try {
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAG_OPEN:
				_localctx = new NodeHtmlContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				htmlElement();
				}
				break;
			case JINJA_EXPR_START:
				_localctx = new NodeJinjaExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				jinjaExpr();
				}
				break;
			case JINJA_BLOCK_START:
				_localctx = new NodeJinjaStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				jinjaStmt();
				}
				break;
			case HTML_TEXT:
				_localctx = new NodeHtmlTextContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(63);
				match(HTML_TEXT);
				}
				break;
			case HTML_COMMENT:
				_localctx = new NodeHtmlCommentContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(64);
				match(HTML_COMMENT);
				}
				break;
			case HTML_DOCTYPE:
				_localctx = new NodeHtmlDoctypeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(65);
				match(HTML_DOCTYPE);
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
	public static class HtmlElementContext extends ParserRuleContext {
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
	 
		public HtmlElementContext() { }
		public void copyFrom(HtmlElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlNormalElementContext extends HtmlElementContext {
		public TerminalNode TAG_OPEN() { return getToken(JinjaParser.TAG_OPEN, 0); }
		public TerminalNode TAG_NAME() { return getToken(JinjaParser.TAG_NAME, 0); }
		public TerminalNode TAG_CLOSE() { return getToken(JinjaParser.TAG_CLOSE, 0); }
		public EndTagContext endTag() {
			return getRuleContext(EndTagContext.class,0);
		}
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public HtmlContentContext htmlContent() {
			return getRuleContext(HtmlContentContext.class,0);
		}
		public HtmlNormalElementContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterHtmlNormalElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitHtmlNormalElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitHtmlNormalElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlSelfClosingElementContext extends HtmlElementContext {
		public TerminalNode TAG_OPEN() { return getToken(JinjaParser.TAG_OPEN, 0); }
		public TerminalNode TAG_NAME() { return getToken(JinjaParser.TAG_NAME, 0); }
		public TerminalNode TAG_SLASH_CLOSE() { return getToken(JinjaParser.TAG_SLASH_CLOSE, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public HtmlSelfClosingElementContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterHtmlSelfClosingElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitHtmlSelfClosingElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitHtmlSelfClosingElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_htmlElement);
		int _la;
		try {
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new HtmlNormalElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				match(TAG_OPEN);
				setState(69);
				match(TAG_NAME);
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TAG_NAME) {
					{
					{
					setState(70);
					htmlAttribute();
					}
					}
					setState(75);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(76);
				match(TAG_CLOSE);
				setState(78);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(77);
					htmlContent();
					}
					break;
				}
				setState(80);
				endTag();
				}
				break;
			case 2:
				_localctx = new HtmlSelfClosingElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				match(TAG_OPEN);
				setState(82);
				match(TAG_NAME);
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TAG_NAME) {
					{
					{
					setState(83);
					htmlAttribute();
					}
					}
					setState(88);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(89);
				match(TAG_SLASH_CLOSE);
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
	public static class EndTagContext extends ParserRuleContext {
		public EndTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endTag; }
	 
		public EndTagContext() { }
		public void copyFrom(EndTagContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlEndTagContext extends EndTagContext {
		public TerminalNode TAG_OPEN() { return getToken(JinjaParser.TAG_OPEN, 0); }
		public TerminalNode TAG_SLASH() { return getToken(JinjaParser.TAG_SLASH, 0); }
		public TerminalNode TAG_NAME() { return getToken(JinjaParser.TAG_NAME, 0); }
		public TerminalNode TAG_CLOSE() { return getToken(JinjaParser.TAG_CLOSE, 0); }
		public HtmlEndTagContext(EndTagContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterHtmlEndTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitHtmlEndTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitHtmlEndTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndTagContext endTag() throws RecognitionException {
		EndTagContext _localctx = new EndTagContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_endTag);
		try {
			_localctx = new HtmlEndTagContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(TAG_OPEN);
			setState(93);
			match(TAG_SLASH);
			setState(94);
			match(TAG_NAME);
			setState(95);
			match(TAG_CLOSE);
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
	public static class HtmlAttributeContext extends ParserRuleContext {
		public HtmlAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttribute; }
	 
		public HtmlAttributeContext() { }
		public void copyFrom(HtmlAttributeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttrContext extends HtmlAttributeContext {
		public TerminalNode TAG_NAME() { return getToken(JinjaParser.TAG_NAME, 0); }
		public TerminalNode TAG_EQUALS() { return getToken(JinjaParser.TAG_EQUALS, 0); }
		public TerminalNode TAG_STRING() { return getToken(JinjaParser.TAG_STRING, 0); }
		public HtmlAttrContext(HtmlAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterHtmlAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitHtmlAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitHtmlAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributeContext htmlAttribute() throws RecognitionException {
		HtmlAttributeContext _localctx = new HtmlAttributeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_htmlAttribute);
		try {
			_localctx = new HtmlAttrContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(TAG_NAME);
			setState(98);
			match(TAG_EQUALS);
			setState(99);
			match(TAG_STRING);
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
	public static class HtmlContentContext extends ParserRuleContext {
		public HtmlContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlContent; }
	 
		public HtmlContentContext() { }
		public void copyFrom(HtmlContentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContentBlockContext extends HtmlContentContext {
		public List<NodeContext> node() {
			return getRuleContexts(NodeContext.class);
		}
		public NodeContext node(int i) {
			return getRuleContext(NodeContext.class,i);
		}
		public HtmlContentBlockContext(HtmlContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterHtmlContentBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitHtmlContentBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitHtmlContentBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContentContext htmlContent() throws RecognitionException {
		HtmlContentContext _localctx = new HtmlContentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_htmlContent);
		try {
			int _alt;
			_localctx = new HtmlContentBlockContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(102); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(101);
					node();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(104); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class JinjaExprContext extends ParserRuleContext {
		public JinjaExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaExpr; }
	 
		public JinjaExprContext() { }
		public void copyFrom(JinjaExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaExpressionContext extends JinjaExprContext {
		public TerminalNode JINJA_EXPR_START() { return getToken(JinjaParser.JINJA_EXPR_START, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode JINJA_END_EXPR() { return getToken(JinjaParser.JINJA_END_EXPR, 0); }
		public JinjaExpressionContext(JinjaExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinjaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinjaExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinjaExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaExprContext jinjaExpr() throws RecognitionException {
		JinjaExprContext _localctx = new JinjaExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_jinjaExpr);
		try {
			_localctx = new JinjaExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(JINJA_EXPR_START);
			setState(107);
			expression();
			setState(108);
			match(JINJA_END_EXPR);
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
	public static class JinjaStmtContext extends ParserRuleContext {
		public JinjaStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaStmt; }
	 
		public JinjaStmtContext() { }
		public void copyFrom(JinjaStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaStatementContext extends JinjaStmtContext {
		public TerminalNode JINJA_BLOCK_START() { return getToken(JinjaParser.JINJA_BLOCK_START, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode JINJA_END_BLOCK() { return getToken(JinjaParser.JINJA_END_BLOCK, 0); }
		public JinjaStatementContext(JinjaStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinjaStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinjaStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinjaStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaStmtContext jinjaStmt() throws RecognitionException {
		JinjaStmtContext _localctx = new JinjaStmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_jinjaStmt);
		try {
			_localctx = new JinjaStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(JINJA_BLOCK_START);
			setState(111);
			stmt();
			setState(112);
			match(JINJA_END_BLOCK);
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
	public static class StmtContext extends ParserRuleContext {
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtElifContext extends StmtContext {
		public ElifStmtContext elifStmt() {
			return getRuleContext(ElifStmtContext.class,0);
		}
		public StmtElifContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterStmtElif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitStmtElif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitStmtElif(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtBreakContext extends StmtContext {
		public TerminalNode JINJA_BREAK() { return getToken(JinjaParser.JINJA_BREAK, 0); }
		public StmtBreakContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterStmtBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitStmtBreak(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitStmtBreak(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtForContext extends StmtContext {
		public ForStmtContext forStmt() {
			return getRuleContext(ForStmtContext.class,0);
		}
		public StmtForContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterStmtFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitStmtFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitStmtFor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtIfContext extends StmtContext {
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public StmtIfContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterStmtIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitStmtIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitStmtIf(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtEndForContext extends StmtContext {
		public TerminalNode JINJA_ENDFOR() { return getToken(JinjaParser.JINJA_ENDFOR, 0); }
		public StmtEndForContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterStmtEndFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitStmtEndFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitStmtEndFor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtElseContext extends StmtContext {
		public ElseStmtContext elseStmt() {
			return getRuleContext(ElseStmtContext.class,0);
		}
		public StmtElseContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterStmtElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitStmtElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitStmtElse(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtSetContext extends StmtContext {
		public SetStmtContext setStmt() {
			return getRuleContext(SetStmtContext.class,0);
		}
		public StmtSetContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterStmtSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitStmtSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitStmtSet(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtContinueContext extends StmtContext {
		public TerminalNode JINJA_CONTINUE() { return getToken(JinjaParser.JINJA_CONTINUE, 0); }
		public StmtContinueContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterStmtContinue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitStmtContinue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitStmtContinue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtEndIfContext extends StmtContext {
		public TerminalNode JINJA_ENDIF() { return getToken(JinjaParser.JINJA_ENDIF, 0); }
		public StmtEndIfContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterStmtEndIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitStmtEndIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitStmtEndIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stmt);
		try {
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JINJA_IF:
				_localctx = new StmtIfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				ifStmt();
				}
				break;
			case JINJA_ELIF:
				_localctx = new StmtElifContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				elifStmt();
				}
				break;
			case JINJA_ELSE:
				_localctx = new StmtElseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				elseStmt();
				}
				break;
			case JINJA_FOR:
				_localctx = new StmtForContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(117);
				forStmt();
				}
				break;
			case JINJA_SET:
				_localctx = new StmtSetContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(118);
				setStmt();
				}
				break;
			case JINJA_ENDIF:
				_localctx = new StmtEndIfContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(119);
				match(JINJA_ENDIF);
				}
				break;
			case JINJA_ENDFOR:
				_localctx = new StmtEndForContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(120);
				match(JINJA_ENDFOR);
				}
				break;
			case JINJA_CONTINUE:
				_localctx = new StmtContinueContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(121);
				match(JINJA_CONTINUE);
				}
				break;
			case JINJA_BREAK:
				_localctx = new StmtBreakContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(122);
				match(JINJA_BREAK);
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
	public static class IfStmtContext extends ParserRuleContext {
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
	 
		public IfStmtContext() { }
		public void copyFrom(IfStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends IfStmtContext {
		public TerminalNode JINJA_IF() { return getToken(JinjaParser.JINJA_IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IfStatementContext(IfStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ifStmt);
		try {
			_localctx = new IfStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(JINJA_IF);
			setState(126);
			expression();
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
	public static class ElifStmtContext extends ParserRuleContext {
		public ElifStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elifStmt; }
	 
		public ElifStmtContext() { }
		public void copyFrom(ElifStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElifStatementContext extends ElifStmtContext {
		public TerminalNode JINJA_ELIF() { return getToken(JinjaParser.JINJA_ELIF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ElifStatementContext(ElifStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterElifStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitElifStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitElifStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElifStmtContext elifStmt() throws RecognitionException {
		ElifStmtContext _localctx = new ElifStmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_elifStmt);
		try {
			_localctx = new ElifStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(JINJA_ELIF);
			setState(129);
			expression();
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
	public static class ElseStmtContext extends ParserRuleContext {
		public ElseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStmt; }
	 
		public ElseStmtContext() { }
		public void copyFrom(ElseStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElseStatementContext extends ElseStmtContext {
		public TerminalNode JINJA_ELSE() { return getToken(JinjaParser.JINJA_ELSE, 0); }
		public ElseStatementContext(ElseStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStmtContext elseStmt() throws RecognitionException {
		ElseStmtContext _localctx = new ElseStmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_elseStmt);
		try {
			_localctx = new ElseStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(JINJA_ELSE);
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
	public static class ForStmtContext extends ParserRuleContext {
		public ForStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStmt; }
	 
		public ForStmtContext() { }
		public void copyFrom(ForStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends ForStmtContext {
		public TerminalNode JINJA_FOR() { return getToken(JinjaParser.JINJA_FOR, 0); }
		public TerminalNode JINJA_ID() { return getToken(JinjaParser.JINJA_ID, 0); }
		public TerminalNode JINJA_IN() { return getToken(JinjaParser.JINJA_IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForStatementContext(ForStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStmtContext forStmt() throws RecognitionException {
		ForStmtContext _localctx = new ForStmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_forStmt);
		try {
			_localctx = new ForStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(JINJA_FOR);
			setState(134);
			match(JINJA_ID);
			setState(135);
			match(JINJA_IN);
			setState(136);
			expression();
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
	public static class SetStmtContext extends ParserRuleContext {
		public SetStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setStmt; }
	 
		public SetStmtContext() { }
		public void copyFrom(SetStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SetStatementContext extends SetStmtContext {
		public TerminalNode JINJA_SET() { return getToken(JinjaParser.JINJA_SET, 0); }
		public TerminalNode JINJA_ID() { return getToken(JinjaParser.JINJA_ID, 0); }
		public TerminalNode JINJA_ASSIGN() { return getToken(JinjaParser.JINJA_ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SetStatementContext(SetStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterSetStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitSetStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitSetStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetStmtContext setStmt() throws RecognitionException {
		SetStmtContext _localctx = new SetStmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_setStmt);
		try {
			_localctx = new SetStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(JINJA_SET);
			setState(139);
			match(JINJA_ID);
			setState(140);
			match(JINJA_ASSIGN);
			setState(141);
			expression();
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
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprRootContext extends ExpressionContext {
		public LogicalOrExprContext logicalOrExpr() {
			return getRuleContext(LogicalOrExprContext.class,0);
		}
		public ExprRootContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterExprRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitExprRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitExprRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expression);
		try {
			_localctx = new ExprRootContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			logicalOrExpr();
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
	public static class LogicalOrExprContext extends ParserRuleContext {
		public LogicalOrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpr; }
	 
		public LogicalOrExprContext() { }
		public void copyFrom(LogicalOrExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprOrContext extends LogicalOrExprContext {
		public List<LogicalAndExprContext> logicalAndExpr() {
			return getRuleContexts(LogicalAndExprContext.class);
		}
		public LogicalAndExprContext logicalAndExpr(int i) {
			return getRuleContext(LogicalAndExprContext.class,i);
		}
		public List<TerminalNode> JINJA_OR() { return getTokens(JinjaParser.JINJA_OR); }
		public TerminalNode JINJA_OR(int i) {
			return getToken(JinjaParser.JINJA_OR, i);
		}
		public ExprOrContext(LogicalOrExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterExprOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitExprOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitExprOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOrExprContext logicalOrExpr() throws RecognitionException {
		LogicalOrExprContext _localctx = new LogicalOrExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_logicalOrExpr);
		int _la;
		try {
			_localctx = new ExprOrContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			logicalAndExpr();
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JINJA_OR) {
				{
				{
				setState(146);
				match(JINJA_OR);
				setState(147);
				logicalAndExpr();
				}
				}
				setState(152);
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
	public static class LogicalAndExprContext extends ParserRuleContext {
		public LogicalAndExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpr; }
	 
		public LogicalAndExprContext() { }
		public void copyFrom(LogicalAndExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprAndContext extends LogicalAndExprContext {
		public List<LogicalNotExprContext> logicalNotExpr() {
			return getRuleContexts(LogicalNotExprContext.class);
		}
		public LogicalNotExprContext logicalNotExpr(int i) {
			return getRuleContext(LogicalNotExprContext.class,i);
		}
		public List<TerminalNode> JINJA_AND() { return getTokens(JinjaParser.JINJA_AND); }
		public TerminalNode JINJA_AND(int i) {
			return getToken(JinjaParser.JINJA_AND, i);
		}
		public ExprAndContext(LogicalAndExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterExprAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitExprAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitExprAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalAndExprContext logicalAndExpr() throws RecognitionException {
		LogicalAndExprContext _localctx = new LogicalAndExprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_logicalAndExpr);
		int _la;
		try {
			_localctx = new ExprAndContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			logicalNotExpr();
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JINJA_AND) {
				{
				{
				setState(154);
				match(JINJA_AND);
				setState(155);
				logicalNotExpr();
				}
				}
				setState(160);
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
	public static class LogicalNotExprContext extends ParserRuleContext {
		public LogicalNotExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalNotExpr; }
	 
		public LogicalNotExprContext() { }
		public void copyFrom(LogicalNotExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprAtomContext extends LogicalNotExprContext {
		public ComparisonExprContext comparisonExpr() {
			return getRuleContext(ComparisonExprContext.class,0);
		}
		public ExprAtomContext(LogicalNotExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterExprAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitExprAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitExprAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprNotContext extends LogicalNotExprContext {
		public TerminalNode JINJA_NOT() { return getToken(JinjaParser.JINJA_NOT, 0); }
		public LogicalNotExprContext logicalNotExpr() {
			return getRuleContext(LogicalNotExprContext.class,0);
		}
		public ExprNotContext(LogicalNotExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterExprNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitExprNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitExprNot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalNotExprContext logicalNotExpr() throws RecognitionException {
		LogicalNotExprContext _localctx = new LogicalNotExprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_logicalNotExpr);
		try {
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JINJA_NOT:
				_localctx = new ExprNotContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				match(JINJA_NOT);
				setState(162);
				logicalNotExpr();
				}
				break;
			case JINJA_NONE:
			case JINJA_TRUE:
			case JINJA_FALSE:
			case JINJA_SUB:
			case JINJA_LPAREN:
			case JINJA_INT:
			case JINJA_STRING:
			case JINJA_ID:
				_localctx = new ExprAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				comparisonExpr();
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
	public static class ComparisonExprContext extends ParserRuleContext {
		public ComparisonExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonExpr; }
	 
		public ComparisonExprContext() { }
		public void copyFrom(ComparisonExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprCompareContext extends ComparisonExprContext {
		public List<AdditiveExprContext> additiveExpr() {
			return getRuleContexts(AdditiveExprContext.class);
		}
		public AdditiveExprContext additiveExpr(int i) {
			return getRuleContext(AdditiveExprContext.class,i);
		}
		public List<TerminalNode> JINJA_EQ() { return getTokens(JinjaParser.JINJA_EQ); }
		public TerminalNode JINJA_EQ(int i) {
			return getToken(JinjaParser.JINJA_EQ, i);
		}
		public List<TerminalNode> JINJA_NEQ() { return getTokens(JinjaParser.JINJA_NEQ); }
		public TerminalNode JINJA_NEQ(int i) {
			return getToken(JinjaParser.JINJA_NEQ, i);
		}
		public List<TerminalNode> JINJA_GT() { return getTokens(JinjaParser.JINJA_GT); }
		public TerminalNode JINJA_GT(int i) {
			return getToken(JinjaParser.JINJA_GT, i);
		}
		public List<TerminalNode> JINJA_GTE() { return getTokens(JinjaParser.JINJA_GTE); }
		public TerminalNode JINJA_GTE(int i) {
			return getToken(JinjaParser.JINJA_GTE, i);
		}
		public List<TerminalNode> JINJA_LT() { return getTokens(JinjaParser.JINJA_LT); }
		public TerminalNode JINJA_LT(int i) {
			return getToken(JinjaParser.JINJA_LT, i);
		}
		public List<TerminalNode> JINJA_LTE() { return getTokens(JinjaParser.JINJA_LTE); }
		public TerminalNode JINJA_LTE(int i) {
			return getToken(JinjaParser.JINJA_LTE, i);
		}
		public List<TerminalNode> JINJA_IS() { return getTokens(JinjaParser.JINJA_IS); }
		public TerminalNode JINJA_IS(int i) {
			return getToken(JinjaParser.JINJA_IS, i);
		}
		public ExprCompareContext(ComparisonExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterExprCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitExprCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitExprCompare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonExprContext comparisonExpr() throws RecognitionException {
		ComparisonExprContext _localctx = new ComparisonExprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_comparisonExpr);
		int _la;
		try {
			_localctx = new ExprCompareContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			additiveExpr();
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4363686772736L) != 0)) {
				{
				{
				setState(167);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4363686772736L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(168);
				additiveExpr();
				}
				}
				setState(173);
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
	public static class AdditiveExprContext extends ParserRuleContext {
		public AdditiveExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpr; }
	 
		public AdditiveExprContext() { }
		public void copyFrom(AdditiveExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprAddContext extends AdditiveExprContext {
		public List<MultiplicativeExprContext> multiplicativeExpr() {
			return getRuleContexts(MultiplicativeExprContext.class);
		}
		public MultiplicativeExprContext multiplicativeExpr(int i) {
			return getRuleContext(MultiplicativeExprContext.class,i);
		}
		public List<TerminalNode> JINJA_ADD() { return getTokens(JinjaParser.JINJA_ADD); }
		public TerminalNode JINJA_ADD(int i) {
			return getToken(JinjaParser.JINJA_ADD, i);
		}
		public List<TerminalNode> JINJA_SUB() { return getTokens(JinjaParser.JINJA_SUB); }
		public TerminalNode JINJA_SUB(int i) {
			return getToken(JinjaParser.JINJA_SUB, i);
		}
		public ExprAddContext(AdditiveExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterExprAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitExprAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitExprAdd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExprContext additiveExpr() throws RecognitionException {
		AdditiveExprContext _localctx = new AdditiveExprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_additiveExpr);
		int _la;
		try {
			_localctx = new ExprAddContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			multiplicativeExpr();
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JINJA_ADD || _la==JINJA_SUB) {
				{
				{
				setState(175);
				_la = _input.LA(1);
				if ( !(_la==JINJA_ADD || _la==JINJA_SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(176);
				multiplicativeExpr();
				}
				}
				setState(181);
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
	public static class MultiplicativeExprContext extends ParserRuleContext {
		public MultiplicativeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpr; }
	 
		public MultiplicativeExprContext() { }
		public void copyFrom(MultiplicativeExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprMulContext extends MultiplicativeExprContext {
		public List<UnaryExprContext> unaryExpr() {
			return getRuleContexts(UnaryExprContext.class);
		}
		public UnaryExprContext unaryExpr(int i) {
			return getRuleContext(UnaryExprContext.class,i);
		}
		public List<TerminalNode> JINJA_MUL() { return getTokens(JinjaParser.JINJA_MUL); }
		public TerminalNode JINJA_MUL(int i) {
			return getToken(JinjaParser.JINJA_MUL, i);
		}
		public List<TerminalNode> JINJA_DIV() { return getTokens(JinjaParser.JINJA_DIV); }
		public TerminalNode JINJA_DIV(int i) {
			return getToken(JinjaParser.JINJA_DIV, i);
		}
		public List<TerminalNode> JINJA_MOD() { return getTokens(JinjaParser.JINJA_MOD); }
		public TerminalNode JINJA_MOD(int i) {
			return getToken(JinjaParser.JINJA_MOD, i);
		}
		public ExprMulContext(MultiplicativeExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterExprMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitExprMul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitExprMul(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExprContext multiplicativeExpr() throws RecognitionException {
		MultiplicativeExprContext _localctx = new MultiplicativeExprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_multiplicativeExpr);
		int _la;
		try {
			_localctx = new ExprMulContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			unaryExpr();
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 246290604621824L) != 0)) {
				{
				{
				setState(183);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 246290604621824L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(184);
				unaryExpr();
				}
				}
				setState(189);
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
	public static class UnaryExprContext extends ParserRuleContext {
		public UnaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpr; }
	 
		public UnaryExprContext() { }
		public void copyFrom(UnaryExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprUnaryMinusContext extends UnaryExprContext {
		public TerminalNode JINJA_SUB() { return getToken(JinjaParser.JINJA_SUB, 0); }
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public ExprUnaryMinusContext(UnaryExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterExprUnaryMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitExprUnaryMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitExprUnaryMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprUnaryContext extends UnaryExprContext {
		public PostfixExprContext postfixExpr() {
			return getRuleContext(PostfixExprContext.class,0);
		}
		public ExprUnaryContext(UnaryExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterExprUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitExprUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitExprUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExprContext unaryExpr() throws RecognitionException {
		UnaryExprContext _localctx = new UnaryExprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_unaryExpr);
		try {
			setState(193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JINJA_SUB:
				_localctx = new ExprUnaryMinusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				match(JINJA_SUB);
				setState(191);
				unaryExpr();
				}
				break;
			case JINJA_NONE:
			case JINJA_TRUE:
			case JINJA_FALSE:
			case JINJA_LPAREN:
			case JINJA_INT:
			case JINJA_STRING:
			case JINJA_ID:
				_localctx = new ExprUnaryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				postfixExpr();
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
	public static class PostfixExprContext extends ParserRuleContext {
		public PostfixExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpr; }
	 
		public PostfixExprContext() { }
		public void copyFrom(PostfixExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprPostfixContext extends PostfixExprContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public List<PostfixPartContext> postfixPart() {
			return getRuleContexts(PostfixPartContext.class);
		}
		public PostfixPartContext postfixPart(int i) {
			return getRuleContext(PostfixPartContext.class,i);
		}
		public ExprPostfixContext(PostfixExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterExprPostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitExprPostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitExprPostfix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixExprContext postfixExpr() throws RecognitionException {
		PostfixExprContext _localctx = new PostfixExprContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_postfixExpr);
		int _la;
		try {
			_localctx = new ExprPostfixContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			primary();
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5348024557502464L) != 0)) {
				{
				{
				setState(196);
				postfixPart();
				}
				}
				setState(201);
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
	public static class PostfixPartContext extends ParserRuleContext {
		public PostfixPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixPart; }
	 
		public PostfixPartContext() { }
		public void copyFrom(PostfixPartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PostfixPropertyContext extends PostfixPartContext {
		public TerminalNode JINJA_DOT() { return getToken(JinjaParser.JINJA_DOT, 0); }
		public TerminalNode JINJA_ID() { return getToken(JinjaParser.JINJA_ID, 0); }
		public PostfixPropertyContext(PostfixPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterPostfixProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitPostfixProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitPostfixProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PostfixIndexContext extends PostfixPartContext {
		public TerminalNode JINJA_LBRACK() { return getToken(JinjaParser.JINJA_LBRACK, 0); }
		public SliceExprContext sliceExpr() {
			return getRuleContext(SliceExprContext.class,0);
		}
		public TerminalNode JINJA_RBRACK() { return getToken(JinjaParser.JINJA_RBRACK, 0); }
		public PostfixIndexContext(PostfixPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterPostfixIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitPostfixIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitPostfixIndex(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PostfixFilterContext extends PostfixPartContext {
		public TerminalNode JINJA_PIPE() { return getToken(JinjaParser.JINJA_PIPE, 0); }
		public TerminalNode JINJA_ID() { return getToken(JinjaParser.JINJA_ID, 0); }
		public PostfixFilterContext(PostfixPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterPostfixFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitPostfixFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitPostfixFilter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixPartContext postfixPart() throws RecognitionException {
		PostfixPartContext _localctx = new PostfixPartContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_postfixPart);
		try {
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JINJA_DOT:
				_localctx = new PostfixPropertyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				match(JINJA_DOT);
				setState(203);
				match(JINJA_ID);
				}
				break;
			case JINJA_PIPE:
				_localctx = new PostfixFilterContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				match(JINJA_PIPE);
				setState(205);
				match(JINJA_ID);
				}
				break;
			case JINJA_LBRACK:
				_localctx = new PostfixIndexContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(206);
				match(JINJA_LBRACK);
				setState(207);
				sliceExpr();
				setState(208);
				match(JINJA_RBRACK);
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
	public static class SliceExprContext extends ParserRuleContext {
		public SliceExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sliceExpr; }
	 
		public SliceExprContext() { }
		public void copyFrom(SliceExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SliceRangeContext extends SliceExprContext {
		public TerminalNode JINJA_COLON() { return getToken(JinjaParser.JINJA_COLON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SliceRangeContext(SliceExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterSliceRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitSliceRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitSliceRange(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SliceIndexContext extends SliceExprContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SliceIndexContext(SliceExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterSliceIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitSliceIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitSliceIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SliceExprContext sliceExpr() throws RecognitionException {
		SliceExprContext _localctx = new SliceExprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_sliceExpr);
		int _la;
		try {
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new SliceRangeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 505546671296348160L) != 0)) {
					{
					setState(212);
					expression();
					}
				}

				setState(215);
				match(JINJA_COLON);
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 505546671296348160L) != 0)) {
					{
					setState(216);
					expression();
					}
				}

				}
				break;
			case 2:
				_localctx = new SliceIndexContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				expression();
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
	public static class PrimaryContext extends ParserRuleContext {
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	 
		public PrimaryContext() { }
		public void copyFrom(PrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralIdContext extends PrimaryContext {
		public TerminalNode JINJA_ID() { return getToken(JinjaParser.JINJA_ID, 0); }
		public LiteralIdContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterLiteralId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitLiteralId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitLiteralId(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralNoneContext extends PrimaryContext {
		public TerminalNode JINJA_NONE() { return getToken(JinjaParser.JINJA_NONE, 0); }
		public LiteralNoneContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterLiteralNone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitLiteralNone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitLiteralNone(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralParenContext extends PrimaryContext {
		public TerminalNode JINJA_LPAREN() { return getToken(JinjaParser.JINJA_LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode JINJA_RPAREN() { return getToken(JinjaParser.JINJA_RPAREN, 0); }
		public LiteralParenContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterLiteralParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitLiteralParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitLiteralParen(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralStringContext extends PrimaryContext {
		public TerminalNode JINJA_STRING() { return getToken(JinjaParser.JINJA_STRING, 0); }
		public LiteralStringContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterLiteralString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitLiteralString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitLiteralString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralTrueContext extends PrimaryContext {
		public TerminalNode JINJA_TRUE() { return getToken(JinjaParser.JINJA_TRUE, 0); }
		public LiteralTrueContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterLiteralTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitLiteralTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitLiteralTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralFalseContext extends PrimaryContext {
		public TerminalNode JINJA_FALSE() { return getToken(JinjaParser.JINJA_FALSE, 0); }
		public LiteralFalseContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterLiteralFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitLiteralFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitLiteralFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralIntContext extends PrimaryContext {
		public TerminalNode JINJA_INT() { return getToken(JinjaParser.JINJA_INT, 0); }
		public LiteralIntContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterLiteralInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitLiteralInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitLiteralInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_primary);
		try {
			setState(232);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JINJA_ID:
				_localctx = new LiteralIdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				match(JINJA_ID);
				}
				break;
			case JINJA_INT:
				_localctx = new LiteralIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				match(JINJA_INT);
				}
				break;
			case JINJA_STRING:
				_localctx = new LiteralStringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(224);
				match(JINJA_STRING);
				}
				break;
			case JINJA_TRUE:
				_localctx = new LiteralTrueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(225);
				match(JINJA_TRUE);
				}
				break;
			case JINJA_FALSE:
				_localctx = new LiteralFalseContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(226);
				match(JINJA_FALSE);
				}
				break;
			case JINJA_NONE:
				_localctx = new LiteralNoneContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(227);
				match(JINJA_NONE);
				}
				break;
			case JINJA_LPAREN:
				_localctx = new LiteralParenContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(228);
				match(JINJA_LPAREN);
				setState(229);
				expression();
				setState(230);
				match(JINJA_RPAREN);
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

	public static final String _serializedATN =
		"\u0004\u0001:\u00eb\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0001\u0000\u0005\u00006\b\u0000\n\u0000\f\u0000"+
		"9\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001C\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002H\b\u0002\n\u0002\f\u0002K\t\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002O\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002U\b\u0002\n\u0002\f\u0002X\t\u0002"+
		"\u0001\u0002\u0003\u0002[\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0004\u0005g\b\u0005\u000b\u0005\f\u0005h\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0003\b|\b\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0005\u000f\u0095\b\u000f\n\u000f\f\u000f\u0098"+
		"\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u009d\b\u0010"+
		"\n\u0010\f\u0010\u00a0\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u00a5\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u00aa"+
		"\b\u0012\n\u0012\f\u0012\u00ad\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0005\u0013\u00b2\b\u0013\n\u0013\f\u0013\u00b5\t\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0005\u0014\u00ba\b\u0014\n\u0014\f\u0014\u00bd\t\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00c2\b\u0015\u0001\u0016"+
		"\u0001\u0016\u0005\u0016\u00c6\b\u0016\n\u0016\f\u0016\u00c9\t\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0003\u0017\u00d3\b\u0017\u0001\u0018\u0003\u0018\u00d6"+
		"\b\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u00da\b\u0018\u0001\u0018"+
		"\u0003\u0018\u00dd\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0003\u0019\u00e9\b\u0019\u0001\u0019\u0000\u0000\u001a\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02\u0000\u0003\u0001\u0000#)\u0001\u0000+,\u0001\u0000-/\u00f6\u0000"+
		"7\u0001\u0000\u0000\u0000\u0002B\u0001\u0000\u0000\u0000\u0004Z\u0001"+
		"\u0000\u0000\u0000\u0006\\\u0001\u0000\u0000\u0000\ba\u0001\u0000\u0000"+
		"\u0000\nf\u0001\u0000\u0000\u0000\fj\u0001\u0000\u0000\u0000\u000en\u0001"+
		"\u0000\u0000\u0000\u0010{\u0001\u0000\u0000\u0000\u0012}\u0001\u0000\u0000"+
		"\u0000\u0014\u0080\u0001\u0000\u0000\u0000\u0016\u0083\u0001\u0000\u0000"+
		"\u0000\u0018\u0085\u0001\u0000\u0000\u0000\u001a\u008a\u0001\u0000\u0000"+
		"\u0000\u001c\u008f\u0001\u0000\u0000\u0000\u001e\u0091\u0001\u0000\u0000"+
		"\u0000 \u0099\u0001\u0000\u0000\u0000\"\u00a4\u0001\u0000\u0000\u0000"+
		"$\u00a6\u0001\u0000\u0000\u0000&\u00ae\u0001\u0000\u0000\u0000(\u00b6"+
		"\u0001\u0000\u0000\u0000*\u00c1\u0001\u0000\u0000\u0000,\u00c3\u0001\u0000"+
		"\u0000\u0000.\u00d2\u0001\u0000\u0000\u00000\u00dc\u0001\u0000\u0000\u0000"+
		"2\u00e8\u0001\u0000\u0000\u000046\u0003\u0002\u0001\u000054\u0001\u0000"+
		"\u0000\u000069\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u000078\u0001"+
		"\u0000\u0000\u00008:\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u0000"+
		":;\u0005\u0000\u0000\u0001;\u0001\u0001\u0000\u0000\u0000<C\u0003\u0004"+
		"\u0002\u0000=C\u0003\f\u0006\u0000>C\u0003\u000e\u0007\u0000?C\u0005\u0002"+
		"\u0000\u0000@C\u0005\u0001\u0000\u0000AC\u0005\u0003\u0000\u0000B<\u0001"+
		"\u0000\u0000\u0000B=\u0001\u0000\u0000\u0000B>\u0001\u0000\u0000\u0000"+
		"B?\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000BA\u0001\u0000\u0000"+
		"\u0000C\u0003\u0001\u0000\u0000\u0000DE\u0005\u0004\u0000\u0000EI\u0005"+
		"\r\u0000\u0000FH\u0003\b\u0004\u0000GF\u0001\u0000\u0000\u0000HK\u0001"+
		"\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000"+
		"JL\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000LN\u0005\t\u0000\u0000"+
		"MO\u0003\n\u0005\u0000NM\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000"+
		"OP\u0001\u0000\u0000\u0000P[\u0003\u0006\u0003\u0000QR\u0005\u0004\u0000"+
		"\u0000RV\u0005\r\u0000\u0000SU\u0003\b\u0004\u0000TS\u0001\u0000\u0000"+
		"\u0000UX\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000VW\u0001\u0000"+
		"\u0000\u0000WY\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000Y[\u0005"+
		"\n\u0000\u0000ZD\u0001\u0000\u0000\u0000ZQ\u0001\u0000\u0000\u0000[\u0005"+
		"\u0001\u0000\u0000\u0000\\]\u0005\u0004\u0000\u0000]^\u0005\u000b\u0000"+
		"\u0000^_\u0005\r\u0000\u0000_`\u0005\t\u0000\u0000`\u0007\u0001\u0000"+
		"\u0000\u0000ab\u0005\r\u0000\u0000bc\u0005\f\u0000\u0000cd\u0005\u000f"+
		"\u0000\u0000d\t\u0001\u0000\u0000\u0000eg\u0003\u0002\u0001\u0000fe\u0001"+
		"\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000"+
		"hi\u0001\u0000\u0000\u0000i\u000b\u0001\u0000\u0000\u0000jk\u0005\u0006"+
		"\u0000\u0000kl\u0003\u001c\u000e\u0000lm\u0005\u0011\u0000\u0000m\r\u0001"+
		"\u0000\u0000\u0000no\u0005\u0007\u0000\u0000op\u0003\u0010\b\u0000pq\u0005"+
		"\u0012\u0000\u0000q\u000f\u0001\u0000\u0000\u0000r|\u0003\u0012\t\u0000"+
		"s|\u0003\u0014\n\u0000t|\u0003\u0016\u000b\u0000u|\u0003\u0018\f\u0000"+
		"v|\u0003\u001a\r\u0000w|\u0005\u0019\u0000\u0000x|\u0005\u001a\u0000\u0000"+
		"y|\u0005\u001b\u0000\u0000z|\u0005\u001c\u0000\u0000{r\u0001\u0000\u0000"+
		"\u0000{s\u0001\u0000\u0000\u0000{t\u0001\u0000\u0000\u0000{u\u0001\u0000"+
		"\u0000\u0000{v\u0001\u0000\u0000\u0000{w\u0001\u0000\u0000\u0000{x\u0001"+
		"\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000{z\u0001\u0000\u0000\u0000"+
		"|\u0011\u0001\u0000\u0000\u0000}~\u0005\u0013\u0000\u0000~\u007f\u0003"+
		"\u001c\u000e\u0000\u007f\u0013\u0001\u0000\u0000\u0000\u0080\u0081\u0005"+
		"\u0014\u0000\u0000\u0081\u0082\u0003\u001c\u000e\u0000\u0082\u0015\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0005\u0015\u0000\u0000\u0084\u0017\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0005\u0016\u0000\u0000\u0086\u0087\u0005"+
		":\u0000\u0000\u0087\u0088\u0005\u0017\u0000\u0000\u0088\u0089\u0003\u001c"+
		"\u000e\u0000\u0089\u0019\u0001\u0000\u0000\u0000\u008a\u008b\u0005\u0018"+
		"\u0000\u0000\u008b\u008c\u0005:\u0000\u0000\u008c\u008d\u0005*\u0000\u0000"+
		"\u008d\u008e\u0003\u001c\u000e\u0000\u008e\u001b\u0001\u0000\u0000\u0000"+
		"\u008f\u0090\u0003\u001e\u000f\u0000\u0090\u001d\u0001\u0000\u0000\u0000"+
		"\u0091\u0096\u0003 \u0010\u0000\u0092\u0093\u0005!\u0000\u0000\u0093\u0095"+
		"\u0003 \u0010\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0095\u0098\u0001"+
		"\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0096\u0097\u0001"+
		"\u0000\u0000\u0000\u0097\u001f\u0001\u0000\u0000\u0000\u0098\u0096\u0001"+
		"\u0000\u0000\u0000\u0099\u009e\u0003\"\u0011\u0000\u009a\u009b\u0005 "+
		"\u0000\u0000\u009b\u009d\u0003\"\u0011\u0000\u009c\u009a\u0001\u0000\u0000"+
		"\u0000\u009d\u00a0\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000"+
		"\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f!\u0001\u0000\u0000\u0000"+
		"\u00a0\u009e\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005\"\u0000\u0000\u00a2"+
		"\u00a5\u0003\"\u0011\u0000\u00a3\u00a5\u0003$\u0012\u0000\u00a4\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a5#\u0001"+
		"\u0000\u0000\u0000\u00a6\u00ab\u0003&\u0013\u0000\u00a7\u00a8\u0007\u0000"+
		"\u0000\u0000\u00a8\u00aa\u0003&\u0013\u0000\u00a9\u00a7\u0001\u0000\u0000"+
		"\u0000\u00aa\u00ad\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000"+
		"\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac%\u0001\u0000\u0000\u0000"+
		"\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ae\u00b3\u0003(\u0014\u0000\u00af"+
		"\u00b0\u0007\u0001\u0000\u0000\u00b0\u00b2\u0003(\u0014\u0000\u00b1\u00af"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b5\u0001\u0000\u0000\u0000\u00b3\u00b1"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\'\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b6\u00bb\u0003"+
		"*\u0015\u0000\u00b7\u00b8\u0007\u0002\u0000\u0000\u00b8\u00ba\u0003*\u0015"+
		"\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00ba\u00bd\u0001\u0000\u0000"+
		"\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000"+
		"\u0000\u00bc)\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000"+
		"\u00be\u00bf\u0005,\u0000\u0000\u00bf\u00c2\u0003*\u0015\u0000\u00c0\u00c2"+
		"\u0003,\u0016\u0000\u00c1\u00be\u0001\u0000\u0000\u0000\u00c1\u00c0\u0001"+
		"\u0000\u0000\u0000\u00c2+\u0001\u0000\u0000\u0000\u00c3\u00c7\u00032\u0019"+
		"\u0000\u00c4\u00c6\u0003.\u0017\u0000\u00c5\u00c4\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c9\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000"+
		"\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8-\u0001\u0000\u0000\u0000\u00c9"+
		"\u00c7\u0001\u0000\u0000\u0000\u00ca\u00cb\u00050\u0000\u0000\u00cb\u00d3"+
		"\u0005:\u0000\u0000\u00cc\u00cd\u00051\u0000\u0000\u00cd\u00d3\u0005:"+
		"\u0000\u0000\u00ce\u00cf\u00054\u0000\u0000\u00cf\u00d0\u00030\u0018\u0000"+
		"\u00d0\u00d1\u00055\u0000\u0000\u00d1\u00d3\u0001\u0000\u0000\u0000\u00d2"+
		"\u00ca\u0001\u0000\u0000\u0000\u00d2\u00cc\u0001\u0000\u0000\u0000\u00d2"+
		"\u00ce\u0001\u0000\u0000\u0000\u00d3/\u0001\u0000\u0000\u0000\u00d4\u00d6"+
		"\u0003\u001c\u000e\u0000\u00d5\u00d4\u0001\u0000\u0000\u0000\u00d5\u00d6"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d9"+
		"\u00056\u0000\u0000\u00d8\u00da\u0003\u001c\u000e\u0000\u00d9\u00d8\u0001"+
		"\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u00dd\u0001"+
		"\u0000\u0000\u0000\u00db\u00dd\u0003\u001c\u000e\u0000\u00dc\u00d5\u0001"+
		"\u0000\u0000\u0000\u00dc\u00db\u0001\u0000\u0000\u0000\u00dd1\u0001\u0000"+
		"\u0000\u0000\u00de\u00e9\u0005:\u0000\u0000\u00df\u00e9\u00058\u0000\u0000"+
		"\u00e0\u00e9\u00059\u0000\u0000\u00e1\u00e9\u0005\u001e\u0000\u0000\u00e2"+
		"\u00e9\u0005\u001f\u0000\u0000\u00e3\u00e9\u0005\u001d\u0000\u0000\u00e4"+
		"\u00e5\u00052\u0000\u0000\u00e5\u00e6\u0003\u001c\u000e\u0000\u00e6\u00e7"+
		"\u00053\u0000\u0000\u00e7\u00e9\u0001\u0000\u0000\u0000\u00e8\u00de\u0001"+
		"\u0000\u0000\u0000\u00e8\u00df\u0001\u0000\u0000\u0000\u00e8\u00e0\u0001"+
		"\u0000\u0000\u0000\u00e8\u00e1\u0001\u0000\u0000\u0000\u00e8\u00e2\u0001"+
		"\u0000\u0000\u0000\u00e8\u00e3\u0001\u0000\u0000\u0000\u00e8\u00e4\u0001"+
		"\u0000\u0000\u0000\u00e93\u0001\u0000\u0000\u0000\u00157BINVZh{\u0096"+
		"\u009e\u00a4\u00ab\u00b3\u00bb\u00c1\u00c7\u00d2\u00d5\u00d9\u00dc\u00e8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}