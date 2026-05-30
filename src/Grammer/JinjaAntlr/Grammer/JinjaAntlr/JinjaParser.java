// Generated from C:/Users/Lenovo/Desktop/compiler 2/Compiler/src/Grammer/JinjaAntlr/JinjaParser.g4 by ANTLR 4.13.2
package Grammer.JinjaAntlr.Grammer.JinjaAntlr;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class JinjaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HTML_COMMENT=1, HTML_DOCTYPE=2, HTML_TEXT=3, TAG_OPEN=4, SEA_WS=5, JINJA_EXPR_START=6, 
		JINJA_BLOCK_START=7, JINJA_COMMENT=8, TAG_CLOSE=9, TAG_SLASH_CLOSE=10, 
		TAG_SLASH=11, TAG_EQUALS=12, TAG_NAME=13, TAG_WS=14, TAG_STRING=15, JINJA_WS=16, 
		JINJA_END_EXPR=17, JINJA_END_BLOCK=18, JINJA_IF=19, JINJA_ELIF=20, JINJA_ELSE=21, 
		JINJA_FOR=22, JINJA_IN=23, JINJA_SET=24, JINJA_ENDIF=25, JINJA_ENDFOR=26, 
		JINJA_CONTINUE=27, JINJA_BREAK=28, JINJA_NONE=29, JINJA_TRUE=30, JINJA_FALSE=31, 
		JINJA_AND=32, JINJA_OR=33, JINJA_NOT=34, JINJA_IS=35, JINJA_EQ=36, JINJA_NEQ=37, 
		JINJA_GTE=38, JINJA_LTE=39, JINJA_GT=40, JINJA_LT=41, JINJA_ASSIGN=42, 
		JINJA_ADD=43, JINJA_SUB=44, JINJA_MUL=45, JINJA_DIV=46, JINJA_MOD=47, 
		JINJA_DOT=48, JINJA_PIPE=49, JINJA_LPAREN=50, JINJA_RPAREN=51, JINJA_LBRACK=52, 
		JINJA_RBRACK=53, JINJA_COLON=54, JINJA_COMMA=55, JINJA_DOUBLE=56, JINJA_INT=57, 
		JINJA_STRING=58, JINJA_ID=59;
	public static final int
		RULE_document = 0, RULE_node = 1, RULE_htmlElement = 2, RULE_endTag = 3, 
		RULE_htmlAttribute = 4, RULE_htmlContent = 5, RULE_jinjaExpr = 6, RULE_jinjaBlock = 7, 
		RULE_ifBlock = 8, RULE_elifBlock = 9, RULE_elseBlock = 10, RULE_forBlock = 11, 
		RULE_setStmt = 12, RULE_jinjaSimpleStmt = 13, RULE_expression = 14, RULE_logicalOrExpr = 15, 
		RULE_logicalAndExpr = 16, RULE_logicalNotExpr = 17, RULE_comparisonExpr = 18, 
		RULE_additiveExpr = 19, RULE_multiplicativeExpr = 20, RULE_unaryExpr = 21, 
		RULE_postfixExpr = 22, RULE_postfixPart = 23, RULE_sliceExpr = 24, RULE_primary = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"document", "node", "htmlElement", "endTag", "htmlAttribute", "htmlContent", 
			"jinjaExpr", "jinjaBlock", "ifBlock", "elifBlock", "elseBlock", "forBlock", 
			"setStmt", "jinjaSimpleStmt", "expression", "logicalOrExpr", "logicalAndExpr", 
			"logicalNotExpr", "comparisonExpr", "additiveExpr", "multiplicativeExpr", 
			"unaryExpr", "postfixExpr", "postfixPart", "sliceExpr", "primary"
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
			null, "HTML_COMMENT", "HTML_DOCTYPE", "HTML_TEXT", "TAG_OPEN", "SEA_WS", 
			"JINJA_EXPR_START", "JINJA_BLOCK_START", "JINJA_COMMENT", "TAG_CLOSE", 
			"TAG_SLASH_CLOSE", "TAG_SLASH", "TAG_EQUALS", "TAG_NAME", "TAG_WS", "TAG_STRING", 
			"JINJA_WS", "JINJA_END_EXPR", "JINJA_END_BLOCK", "JINJA_IF", "JINJA_ELIF", 
			"JINJA_ELSE", "JINJA_FOR", "JINJA_IN", "JINJA_SET", "JINJA_ENDIF", "JINJA_ENDFOR", 
			"JINJA_CONTINUE", "JINJA_BREAK", "JINJA_NONE", "JINJA_TRUE", "JINJA_FALSE", 
			"JINJA_AND", "JINJA_OR", "JINJA_NOT", "JINJA_IS", "JINJA_EQ", "JINJA_NEQ", 
			"JINJA_GTE", "JINJA_LTE", "JINJA_GT", "JINJA_LT", "JINJA_ASSIGN", "JINJA_ADD", 
			"JINJA_SUB", "JINJA_MUL", "JINJA_DIV", "JINJA_MOD", "JINJA_DOT", "JINJA_PIPE", 
			"JINJA_LPAREN", "JINJA_RPAREN", "JINJA_LBRACK", "JINJA_RBRACK", "JINJA_COLON", 
			"JINJA_COMMA", "JINJA_DOUBLE", "JINJA_INT", "JINJA_STRING", "JINJA_ID"
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
			if ( listener instanceof JinjaParserListener) ((JinjaParserListener)listener).exitDocumentRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor) return ((JinjaParserVisitor<? extends T>)visitor).visitDocumentRoot(this);
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
	public static class NodeJinjaBlockContext extends NodeContext {
		public JinjaBlockContext jinjaBlock() {
			return getRuleContext(JinjaBlockContext.class,0);
		}
		public NodeJinjaBlockContext(NodeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterNodeJinjaBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitNodeJinjaBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitNodeJinjaBlock(this);
			else return visitor.visitChildren(this);
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
				_localctx = new NodeJinjaBlockContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				jinjaBlock();
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
		public List<HtmlContentContext> htmlContent() {
			return getRuleContexts(HtmlContentContext.class);
		}
		public HtmlContentContext htmlContent(int i) {
			return getRuleContext(HtmlContentContext.class,i);
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
			int _alt;
			setState(93);
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
				setState(80);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(77);
						htmlContent();
						}
						} 
					}
					setState(82);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				setState(83);
				endTag();
				}
				break;
			case 2:
				_localctx = new HtmlSelfClosingElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				match(TAG_OPEN);
				setState(85);
				match(TAG_NAME);
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TAG_NAME) {
					{
					{
					setState(86);
					htmlAttribute();
					}
					}
					setState(91);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(92);
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
			setState(95);
			match(TAG_OPEN);
			setState(96);
			match(TAG_SLASH);
			setState(97);
			match(TAG_NAME);
			setState(98);
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
			setState(100);
			match(TAG_NAME);
			setState(101);
			match(TAG_EQUALS);
			setState(102);
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
	public static class HtmlContentNodeContext extends HtmlContentContext {
		public NodeContext node() {
			return getRuleContext(NodeContext.class,0);
		}
		public HtmlContentNodeContext(HtmlContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterHtmlContentNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitHtmlContentNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitHtmlContentNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContentContext htmlContent() throws RecognitionException {
		HtmlContentContext _localctx = new HtmlContentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_htmlContent);
		try {
			_localctx = new HtmlContentNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			node();
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
	public static class JinjaBlockContext extends ParserRuleContext {
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public ForBlockContext forBlock() {
			return getRuleContext(ForBlockContext.class,0);
		}
		public SetStmtContext setStmt() {
			return getRuleContext(SetStmtContext.class,0);
		}
		public JinjaSimpleStmtContext jinjaSimpleStmt() {
			return getRuleContext(JinjaSimpleStmtContext.class,0);
		}
		public JinjaBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinjaBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinjaBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinjaBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaBlockContext jinjaBlock() throws RecognitionException {
		JinjaBlockContext _localctx = new JinjaBlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_jinjaBlock);
		try {
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				ifBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				forBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				setStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(113);
				jinjaSimpleStmt();
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
	public static class IfBlockContext extends ParserRuleContext {
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
	 
		public IfBlockContext() { }
		public void copyFrom(IfBlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockIfContext extends IfBlockContext {
		public List<TerminalNode> JINJA_BLOCK_START() { return getTokens(JinjaParser.JINJA_BLOCK_START); }
		public TerminalNode JINJA_BLOCK_START(int i) {
			return getToken(JinjaParser.JINJA_BLOCK_START, i);
		}
		public TerminalNode JINJA_IF() { return getToken(JinjaParser.JINJA_IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> JINJA_END_BLOCK() { return getTokens(JinjaParser.JINJA_END_BLOCK); }
		public TerminalNode JINJA_END_BLOCK(int i) {
			return getToken(JinjaParser.JINJA_END_BLOCK, i);
		}
		public TerminalNode JINJA_ENDIF() { return getToken(JinjaParser.JINJA_ENDIF, 0); }
		public List<NodeContext> node() {
			return getRuleContexts(NodeContext.class);
		}
		public NodeContext node(int i) {
			return getRuleContext(NodeContext.class,i);
		}
		public List<ElifBlockContext> elifBlock() {
			return getRuleContexts(ElifBlockContext.class);
		}
		public ElifBlockContext elifBlock(int i) {
			return getRuleContext(ElifBlockContext.class,i);
		}
		public ElseBlockContext elseBlock() {
			return getRuleContext(ElseBlockContext.class,0);
		}
		public BlockIfContext(IfBlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterBlockIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitBlockIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitBlockIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ifBlock);
		try {
			int _alt;
			_localctx = new BlockIfContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(JINJA_BLOCK_START);
			setState(117);
			match(JINJA_IF);
			setState(118);
			expression();
			setState(119);
			match(JINJA_END_BLOCK);
			setState(123);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(120);
					node();
					}
					} 
				}
				setState(125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(129);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(126);
					elifBlock();
					}
					} 
				}
				setState(131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(132);
				elseBlock();
				}
				break;
			}
			setState(135);
			match(JINJA_BLOCK_START);
			setState(136);
			match(JINJA_ENDIF);
			setState(137);
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
	public static class ElifBlockContext extends ParserRuleContext {
		public ElifBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elifBlock; }
	 
		public ElifBlockContext() { }
		public void copyFrom(ElifBlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElifBlockStmtContext extends ElifBlockContext {
		public TerminalNode JINJA_BLOCK_START() { return getToken(JinjaParser.JINJA_BLOCK_START, 0); }
		public TerminalNode JINJA_ELIF() { return getToken(JinjaParser.JINJA_ELIF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode JINJA_END_BLOCK() { return getToken(JinjaParser.JINJA_END_BLOCK, 0); }
		public List<NodeContext> node() {
			return getRuleContexts(NodeContext.class);
		}
		public NodeContext node(int i) {
			return getRuleContext(NodeContext.class,i);
		}
		public ElifBlockStmtContext(ElifBlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterElifBlockStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitElifBlockStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitElifBlockStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElifBlockContext elifBlock() throws RecognitionException {
		ElifBlockContext _localctx = new ElifBlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_elifBlock);
		try {
			int _alt;
			_localctx = new ElifBlockStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(JINJA_BLOCK_START);
			setState(140);
			match(JINJA_ELIF);
			setState(141);
			expression();
			setState(142);
			match(JINJA_END_BLOCK);
			setState(146);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(143);
					node();
					}
					} 
				}
				setState(148);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
	public static class ElseBlockContext extends ParserRuleContext {
		public ElseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseBlock; }
	 
		public ElseBlockContext() { }
		public void copyFrom(ElseBlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElseBlockStmtContext extends ElseBlockContext {
		public TerminalNode JINJA_BLOCK_START() { return getToken(JinjaParser.JINJA_BLOCK_START, 0); }
		public TerminalNode JINJA_ELSE() { return getToken(JinjaParser.JINJA_ELSE, 0); }
		public TerminalNode JINJA_END_BLOCK() { return getToken(JinjaParser.JINJA_END_BLOCK, 0); }
		public List<NodeContext> node() {
			return getRuleContexts(NodeContext.class);
		}
		public NodeContext node(int i) {
			return getRuleContext(NodeContext.class,i);
		}
		public ElseBlockStmtContext(ElseBlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterElseBlockStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitElseBlockStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitElseBlockStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseBlockContext elseBlock() throws RecognitionException {
		ElseBlockContext _localctx = new ElseBlockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_elseBlock);
		try {
			int _alt;
			_localctx = new ElseBlockStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(JINJA_BLOCK_START);
			setState(150);
			match(JINJA_ELSE);
			setState(151);
			match(JINJA_END_BLOCK);
			setState(155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(152);
					node();
					}
					} 
				}
				setState(157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
	public static class ForBlockContext extends ParserRuleContext {
		public ForBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forBlock; }
	 
		public ForBlockContext() { }
		public void copyFrom(ForBlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockForContext extends ForBlockContext {
		public List<TerminalNode> JINJA_BLOCK_START() { return getTokens(JinjaParser.JINJA_BLOCK_START); }
		public TerminalNode JINJA_BLOCK_START(int i) {
			return getToken(JinjaParser.JINJA_BLOCK_START, i);
		}
		public TerminalNode JINJA_FOR() { return getToken(JinjaParser.JINJA_FOR, 0); }
		public TerminalNode JINJA_ID() { return getToken(JinjaParser.JINJA_ID, 0); }
		public TerminalNode JINJA_IN() { return getToken(JinjaParser.JINJA_IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> JINJA_END_BLOCK() { return getTokens(JinjaParser.JINJA_END_BLOCK); }
		public TerminalNode JINJA_END_BLOCK(int i) {
			return getToken(JinjaParser.JINJA_END_BLOCK, i);
		}
		public TerminalNode JINJA_ENDFOR() { return getToken(JinjaParser.JINJA_ENDFOR, 0); }
		public List<NodeContext> node() {
			return getRuleContexts(NodeContext.class);
		}
		public NodeContext node(int i) {
			return getRuleContext(NodeContext.class,i);
		}
		public BlockForContext(ForBlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterBlockFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitBlockFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitBlockFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForBlockContext forBlock() throws RecognitionException {
		ForBlockContext _localctx = new ForBlockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_forBlock);
		try {
			int _alt;
			_localctx = new BlockForContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(JINJA_BLOCK_START);
			setState(159);
			match(JINJA_FOR);
			setState(160);
			match(JINJA_ID);
			setState(161);
			match(JINJA_IN);
			setState(162);
			expression();
			setState(163);
			match(JINJA_END_BLOCK);
			setState(167);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(164);
					node();
					}
					} 
				}
				setState(169);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(170);
			match(JINJA_BLOCK_START);
			setState(171);
			match(JINJA_ENDFOR);
			setState(172);
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
	public static class BlockSetContext extends SetStmtContext {
		public TerminalNode JINJA_BLOCK_START() { return getToken(JinjaParser.JINJA_BLOCK_START, 0); }
		public TerminalNode JINJA_SET() { return getToken(JinjaParser.JINJA_SET, 0); }
		public TerminalNode JINJA_ID() { return getToken(JinjaParser.JINJA_ID, 0); }
		public TerminalNode JINJA_ASSIGN() { return getToken(JinjaParser.JINJA_ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode JINJA_END_BLOCK() { return getToken(JinjaParser.JINJA_END_BLOCK, 0); }
		public BlockSetContext(SetStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterBlockSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitBlockSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitBlockSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetStmtContext setStmt() throws RecognitionException {
		SetStmtContext _localctx = new SetStmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_setStmt);
		try {
			_localctx = new BlockSetContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(JINJA_BLOCK_START);
			setState(175);
			match(JINJA_SET);
			setState(176);
			match(JINJA_ID);
			setState(177);
			match(JINJA_ASSIGN);
			setState(178);
			expression();
			setState(179);
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
	public static class JinjaSimpleStmtContext extends ParserRuleContext {
		public JinjaSimpleStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaSimpleStmt; }
	 
		public JinjaSimpleStmtContext() { }
		public void copyFrom(JinjaSimpleStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockSimpleContext extends JinjaSimpleStmtContext {
		public TerminalNode JINJA_BLOCK_START() { return getToken(JinjaParser.JINJA_BLOCK_START, 0); }
		public TerminalNode JINJA_END_BLOCK() { return getToken(JinjaParser.JINJA_END_BLOCK, 0); }
		public TerminalNode JINJA_CONTINUE() { return getToken(JinjaParser.JINJA_CONTINUE, 0); }
		public TerminalNode JINJA_BREAK() { return getToken(JinjaParser.JINJA_BREAK, 0); }
		public BlockSimpleContext(JinjaSimpleStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterBlockSimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitBlockSimple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitBlockSimple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaSimpleStmtContext jinjaSimpleStmt() throws RecognitionException {
		JinjaSimpleStmtContext _localctx = new JinjaSimpleStmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_jinjaSimpleStmt);
		int _la;
		try {
			_localctx = new BlockSimpleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(JINJA_BLOCK_START);
			setState(182);
			_la = _input.LA(1);
			if ( !(_la==JINJA_CONTINUE || _la==JINJA_BREAK) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(183);
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
			setState(185);
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
			setState(187);
			logicalAndExpr();
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JINJA_OR) {
				{
				{
				setState(188);
				match(JINJA_OR);
				setState(189);
				logicalAndExpr();
				}
				}
				setState(194);
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
			setState(195);
			logicalNotExpr();
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JINJA_AND) {
				{
				{
				setState(196);
				match(JINJA_AND);
				setState(197);
				logicalNotExpr();
				}
				}
				setState(202);
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
			setState(206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JINJA_NOT:
				_localctx = new ExprNotContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				match(JINJA_NOT);
				setState(204);
				logicalNotExpr();
				}
				break;
			case JINJA_NONE:
			case JINJA_TRUE:
			case JINJA_FALSE:
			case JINJA_SUB:
			case JINJA_LPAREN:
			case JINJA_DOUBLE:
			case JINJA_INT:
			case JINJA_STRING:
			case JINJA_ID:
				_localctx = new ExprAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
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
			setState(208);
			additiveExpr();
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4363686772736L) != 0)) {
				{
				{
				setState(209);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4363686772736L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(210);
				additiveExpr();
				}
				}
				setState(215);
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
			setState(216);
			multiplicativeExpr();
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JINJA_ADD || _la==JINJA_SUB) {
				{
				{
				setState(217);
				_la = _input.LA(1);
				if ( !(_la==JINJA_ADD || _la==JINJA_SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(218);
				multiplicativeExpr();
				}
				}
				setState(223);
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
			setState(224);
			unaryExpr();
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 246290604621824L) != 0)) {
				{
				{
				setState(225);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 246290604621824L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(226);
				unaryExpr();
				}
				}
				setState(231);
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
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JINJA_SUB:
				_localctx = new ExprUnaryMinusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				match(JINJA_SUB);
				setState(233);
				unaryExpr();
				}
				break;
			case JINJA_NONE:
			case JINJA_TRUE:
			case JINJA_FALSE:
			case JINJA_LPAREN:
			case JINJA_DOUBLE:
			case JINJA_INT:
			case JINJA_STRING:
			case JINJA_ID:
				_localctx = new ExprUnaryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
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
			setState(237);
			primary();
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5348024557502464L) != 0)) {
				{
				{
				setState(238);
				postfixPart();
				}
				}
				setState(243);
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
			setState(252);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JINJA_DOT:
				_localctx = new PostfixPropertyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				match(JINJA_DOT);
				setState(245);
				match(JINJA_ID);
				}
				break;
			case JINJA_PIPE:
				_localctx = new PostfixFilterContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				match(JINJA_PIPE);
				setState(247);
				match(JINJA_ID);
				}
				break;
			case JINJA_LBRACK:
				_localctx = new PostfixIndexContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(248);
				match(JINJA_LBRACK);
				setState(249);
				sliceExpr();
				setState(250);
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
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new SliceRangeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1082007423599771648L) != 0)) {
					{
					setState(254);
					expression();
					}
				}

				setState(257);
				match(JINJA_COLON);
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1082007423599771648L) != 0)) {
					{
					setState(258);
					expression();
					}
				}

				}
				break;
			case 2:
				_localctx = new SliceIndexContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
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
	public static class LiteralDoubleContext extends PrimaryContext {
		public TerminalNode JINJA_DOUBLE() { return getToken(JinjaParser.JINJA_DOUBLE, 0); }
		public LiteralDoubleContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterLiteralDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitLiteralDouble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitLiteralDouble(this);
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
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JINJA_ID:
				_localctx = new LiteralIdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				match(JINJA_ID);
				}
				break;
			case JINJA_DOUBLE:
				_localctx = new LiteralDoubleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				match(JINJA_DOUBLE);
				}
				break;
			case JINJA_INT:
				_localctx = new LiteralIntContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(266);
				match(JINJA_INT);
				}
				break;
			case JINJA_STRING:
				_localctx = new LiteralStringContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(267);
				match(JINJA_STRING);
				}
				break;
			case JINJA_TRUE:
				_localctx = new LiteralTrueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(268);
				match(JINJA_TRUE);
				}
				break;
			case JINJA_FALSE:
				_localctx = new LiteralFalseContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(269);
				match(JINJA_FALSE);
				}
				break;
			case JINJA_NONE:
				_localctx = new LiteralNoneContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(270);
				match(JINJA_NONE);
				}
				break;
			case JINJA_LPAREN:
				_localctx = new LiteralParenContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(271);
				match(JINJA_LPAREN);
				setState(272);
				expression();
				setState(273);
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
		"\u0004\u0001;\u0116\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"\u0001\u0002\u0001\u0002\u0005\u0002O\b\u0002\n\u0002\f\u0002R\t\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002X\b\u0002"+
		"\n\u0002\f\u0002[\t\u0002\u0001\u0002\u0003\u0002^\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007s\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b"+
		"z\b\b\n\b\f\b}\t\b\u0001\b\u0005\b\u0080\b\b\n\b\f\b\u0083\t\b\u0001\b"+
		"\u0003\b\u0086\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0005\t\u0091\b\t\n\t\f\t\u0094\t\t\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0005\n\u009a\b\n\n\n\f\n\u009d\t\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u00a6\b\u000b\n\u000b\f\u000b\u00a9\t\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00bf\b\u000f\n\u000f\f\u000f"+
		"\u00c2\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00c7\b"+
		"\u0010\n\u0010\f\u0010\u00ca\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u00cf\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012"+
		"\u00d4\b\u0012\n\u0012\f\u0012\u00d7\t\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0005\u0013\u00dc\b\u0013\n\u0013\f\u0013\u00df\t\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0005\u0014\u00e4\b\u0014\n\u0014\f\u0014\u00e7"+
		"\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00ec\b\u0015"+
		"\u0001\u0016\u0001\u0016\u0005\u0016\u00f0\b\u0016\n\u0016\f\u0016\u00f3"+
		"\t\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u00fd\b\u0017\u0001\u0018\u0003"+
		"\u0018\u0100\b\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0104\b\u0018"+
		"\u0001\u0018\u0003\u0018\u0107\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0003\u0019\u0114\b\u0019\u0001\u0019\u0000\u0000"+
		"\u001a\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02\u0000\u0004\u0001\u0000\u001b\u001c\u0001"+
		"\u0000#)\u0001\u0000+,\u0001\u0000-/\u0122\u00007\u0001\u0000\u0000\u0000"+
		"\u0002B\u0001\u0000\u0000\u0000\u0004]\u0001\u0000\u0000\u0000\u0006_"+
		"\u0001\u0000\u0000\u0000\bd\u0001\u0000\u0000\u0000\nh\u0001\u0000\u0000"+
		"\u0000\fj\u0001\u0000\u0000\u0000\u000er\u0001\u0000\u0000\u0000\u0010"+
		"t\u0001\u0000\u0000\u0000\u0012\u008b\u0001\u0000\u0000\u0000\u0014\u0095"+
		"\u0001\u0000\u0000\u0000\u0016\u009e\u0001\u0000\u0000\u0000\u0018\u00ae"+
		"\u0001\u0000\u0000\u0000\u001a\u00b5\u0001\u0000\u0000\u0000\u001c\u00b9"+
		"\u0001\u0000\u0000\u0000\u001e\u00bb\u0001\u0000\u0000\u0000 \u00c3\u0001"+
		"\u0000\u0000\u0000\"\u00ce\u0001\u0000\u0000\u0000$\u00d0\u0001\u0000"+
		"\u0000\u0000&\u00d8\u0001\u0000\u0000\u0000(\u00e0\u0001\u0000\u0000\u0000"+
		"*\u00eb\u0001\u0000\u0000\u0000,\u00ed\u0001\u0000\u0000\u0000.\u00fc"+
		"\u0001\u0000\u0000\u00000\u0106\u0001\u0000\u0000\u00002\u0113\u0001\u0000"+
		"\u0000\u000046\u0003\u0002\u0001\u000054\u0001\u0000\u0000\u000069\u0001"+
		"\u0000\u0000\u000075\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u0000"+
		"8:\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u0000:;\u0005\u0000\u0000"+
		"\u0001;\u0001\u0001\u0000\u0000\u0000<C\u0003\u0004\u0002\u0000=C\u0003"+
		"\f\u0006\u0000>C\u0003\u000e\u0007\u0000?C\u0005\u0003\u0000\u0000@C\u0005"+
		"\u0001\u0000\u0000AC\u0005\u0002\u0000\u0000B<\u0001\u0000\u0000\u0000"+
		"B=\u0001\u0000\u0000\u0000B>\u0001\u0000\u0000\u0000B?\u0001\u0000\u0000"+
		"\u0000B@\u0001\u0000\u0000\u0000BA\u0001\u0000\u0000\u0000C\u0003\u0001"+
		"\u0000\u0000\u0000DE\u0005\u0004\u0000\u0000EI\u0005\r\u0000\u0000FH\u0003"+
		"\b\u0004\u0000GF\u0001\u0000\u0000\u0000HK\u0001\u0000\u0000\u0000IG\u0001"+
		"\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JL\u0001\u0000\u0000\u0000"+
		"KI\u0001\u0000\u0000\u0000LP\u0005\t\u0000\u0000MO\u0003\n\u0005\u0000"+
		"NM\u0001\u0000\u0000\u0000OR\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000"+
		"\u0000PQ\u0001\u0000\u0000\u0000QS\u0001\u0000\u0000\u0000RP\u0001\u0000"+
		"\u0000\u0000S^\u0003\u0006\u0003\u0000TU\u0005\u0004\u0000\u0000UY\u0005"+
		"\r\u0000\u0000VX\u0003\b\u0004\u0000WV\u0001\u0000\u0000\u0000X[\u0001"+
		"\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000"+
		"Z\\\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000\\^\u0005\n\u0000"+
		"\u0000]D\u0001\u0000\u0000\u0000]T\u0001\u0000\u0000\u0000^\u0005\u0001"+
		"\u0000\u0000\u0000_`\u0005\u0004\u0000\u0000`a\u0005\u000b\u0000\u0000"+
		"ab\u0005\r\u0000\u0000bc\u0005\t\u0000\u0000c\u0007\u0001\u0000\u0000"+
		"\u0000de\u0005\r\u0000\u0000ef\u0005\f\u0000\u0000fg\u0005\u000f\u0000"+
		"\u0000g\t\u0001\u0000\u0000\u0000hi\u0003\u0002\u0001\u0000i\u000b\u0001"+
		"\u0000\u0000\u0000jk\u0005\u0006\u0000\u0000kl\u0003\u001c\u000e\u0000"+
		"lm\u0005\u0011\u0000\u0000m\r\u0001\u0000\u0000\u0000ns\u0003\u0010\b"+
		"\u0000os\u0003\u0016\u000b\u0000ps\u0003\u0018\f\u0000qs\u0003\u001a\r"+
		"\u0000rn\u0001\u0000\u0000\u0000ro\u0001\u0000\u0000\u0000rp\u0001\u0000"+
		"\u0000\u0000rq\u0001\u0000\u0000\u0000s\u000f\u0001\u0000\u0000\u0000"+
		"tu\u0005\u0007\u0000\u0000uv\u0005\u0013\u0000\u0000vw\u0003\u001c\u000e"+
		"\u0000w{\u0005\u0012\u0000\u0000xz\u0003\u0002\u0001\u0000yx\u0001\u0000"+
		"\u0000\u0000z}\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000{|\u0001"+
		"\u0000\u0000\u0000|\u0081\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000"+
		"\u0000~\u0080\u0003\u0012\t\u0000\u007f~\u0001\u0000\u0000\u0000\u0080"+
		"\u0083\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081"+
		"\u0082\u0001\u0000\u0000\u0000\u0082\u0085\u0001\u0000\u0000\u0000\u0083"+
		"\u0081\u0001\u0000\u0000\u0000\u0084\u0086\u0003\u0014\n\u0000\u0085\u0084"+
		"\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0087"+
		"\u0001\u0000\u0000\u0000\u0087\u0088\u0005\u0007\u0000\u0000\u0088\u0089"+
		"\u0005\u0019\u0000\u0000\u0089\u008a\u0005\u0012\u0000\u0000\u008a\u0011"+
		"\u0001\u0000\u0000\u0000\u008b\u008c\u0005\u0007\u0000\u0000\u008c\u008d"+
		"\u0005\u0014\u0000\u0000\u008d\u008e\u0003\u001c\u000e\u0000\u008e\u0092"+
		"\u0005\u0012\u0000\u0000\u008f\u0091\u0003\u0002\u0001\u0000\u0090\u008f"+
		"\u0001\u0000\u0000\u0000\u0091\u0094\u0001\u0000\u0000\u0000\u0092\u0090"+
		"\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0013"+
		"\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0095\u0096"+
		"\u0005\u0007\u0000\u0000\u0096\u0097\u0005\u0015\u0000\u0000\u0097\u009b"+
		"\u0005\u0012\u0000\u0000\u0098\u009a\u0003\u0002\u0001\u0000\u0099\u0098"+
		"\u0001\u0000\u0000\u0000\u009a\u009d\u0001\u0000\u0000\u0000\u009b\u0099"+
		"\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u0015"+
		"\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009e\u009f"+
		"\u0005\u0007\u0000\u0000\u009f\u00a0\u0005\u0016\u0000\u0000\u00a0\u00a1"+
		"\u0005;\u0000\u0000\u00a1\u00a2\u0005\u0017\u0000\u0000\u00a2\u00a3\u0003"+
		"\u001c\u000e\u0000\u00a3\u00a7\u0005\u0012\u0000\u0000\u00a4\u00a6\u0003"+
		"\u0002\u0001\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a9\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001"+
		"\u0000\u0000\u0000\u00a8\u00aa\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001"+
		"\u0000\u0000\u0000\u00aa\u00ab\u0005\u0007\u0000\u0000\u00ab\u00ac\u0005"+
		"\u001a\u0000\u0000\u00ac\u00ad\u0005\u0012\u0000\u0000\u00ad\u0017\u0001"+
		"\u0000\u0000\u0000\u00ae\u00af\u0005\u0007\u0000\u0000\u00af\u00b0\u0005"+
		"\u0018\u0000\u0000\u00b0\u00b1\u0005;\u0000\u0000\u00b1\u00b2\u0005*\u0000"+
		"\u0000\u00b2\u00b3\u0003\u001c\u000e\u0000\u00b3\u00b4\u0005\u0012\u0000"+
		"\u0000\u00b4\u0019\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005\u0007\u0000"+
		"\u0000\u00b6\u00b7\u0007\u0000\u0000\u0000\u00b7\u00b8\u0005\u0012\u0000"+
		"\u0000\u00b8\u001b\u0001\u0000\u0000\u0000\u00b9\u00ba\u0003\u001e\u000f"+
		"\u0000\u00ba\u001d\u0001\u0000\u0000\u0000\u00bb\u00c0\u0003 \u0010\u0000"+
		"\u00bc\u00bd\u0005!\u0000\u0000\u00bd\u00bf\u0003 \u0010\u0000\u00be\u00bc"+
		"\u0001\u0000\u0000\u0000\u00bf\u00c2\u0001\u0000\u0000\u0000\u00c0\u00be"+
		"\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u001f"+
		"\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c3\u00c8"+
		"\u0003\"\u0011\u0000\u00c4\u00c5\u0005 \u0000\u0000\u00c5\u00c7\u0003"+
		"\"\u0011\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c7\u00ca\u0001\u0000"+
		"\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000"+
		"\u0000\u0000\u00c9!\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000"+
		"\u0000\u00cb\u00cc\u0005\"\u0000\u0000\u00cc\u00cf\u0003\"\u0011\u0000"+
		"\u00cd\u00cf\u0003$\u0012\u0000\u00ce\u00cb\u0001\u0000\u0000\u0000\u00ce"+
		"\u00cd\u0001\u0000\u0000\u0000\u00cf#\u0001\u0000\u0000\u0000\u00d0\u00d5"+
		"\u0003&\u0013\u0000\u00d1\u00d2\u0007\u0001\u0000\u0000\u00d2\u00d4\u0003"+
		"&\u0013\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d4\u00d7\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000"+
		"\u0000\u0000\u00d6%\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d8\u00dd\u0003(\u0014\u0000\u00d9\u00da\u0007\u0002\u0000\u0000"+
		"\u00da\u00dc\u0003(\u0014\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00dc"+
		"\u00df\u0001\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00dd"+
		"\u00de\u0001\u0000\u0000\u0000\u00de\'\u0001\u0000\u0000\u0000\u00df\u00dd"+
		"\u0001\u0000\u0000\u0000\u00e0\u00e5\u0003*\u0015\u0000\u00e1\u00e2\u0007"+
		"\u0003\u0000\u0000\u00e2\u00e4\u0003*\u0015\u0000\u00e3\u00e1\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e7\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6)\u0001\u0000\u0000"+
		"\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005,\u0000\u0000"+
		"\u00e9\u00ec\u0003*\u0015\u0000\u00ea\u00ec\u0003,\u0016\u0000\u00eb\u00e8"+
		"\u0001\u0000\u0000\u0000\u00eb\u00ea\u0001\u0000\u0000\u0000\u00ec+\u0001"+
		"\u0000\u0000\u0000\u00ed\u00f1\u00032\u0019\u0000\u00ee\u00f0\u0003.\u0017"+
		"\u0000\u00ef\u00ee\u0001\u0000\u0000\u0000\u00f0\u00f3\u0001\u0000\u0000"+
		"\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000"+
		"\u0000\u00f2-\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f5\u00050\u0000\u0000\u00f5\u00fd\u0005;\u0000\u0000\u00f6\u00f7"+
		"\u00051\u0000\u0000\u00f7\u00fd\u0005;\u0000\u0000\u00f8\u00f9\u00054"+
		"\u0000\u0000\u00f9\u00fa\u00030\u0018\u0000\u00fa\u00fb\u00055\u0000\u0000"+
		"\u00fb\u00fd\u0001\u0000\u0000\u0000\u00fc\u00f4\u0001\u0000\u0000\u0000"+
		"\u00fc\u00f6\u0001\u0000\u0000\u0000\u00fc\u00f8\u0001\u0000\u0000\u0000"+
		"\u00fd/\u0001\u0000\u0000\u0000\u00fe\u0100\u0003\u001c\u000e\u0000\u00ff"+
		"\u00fe\u0001\u0000\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100"+
		"\u0101\u0001\u0000\u0000\u0000\u0101\u0103\u00056\u0000\u0000\u0102\u0104"+
		"\u0003\u001c\u000e\u0000\u0103\u0102\u0001\u0000\u0000\u0000\u0103\u0104"+
		"\u0001\u0000\u0000\u0000\u0104\u0107\u0001\u0000\u0000\u0000\u0105\u0107"+
		"\u0003\u001c\u000e\u0000\u0106\u00ff\u0001\u0000\u0000\u0000\u0106\u0105"+
		"\u0001\u0000\u0000\u0000\u01071\u0001\u0000\u0000\u0000\u0108\u0114\u0005"+
		";\u0000\u0000\u0109\u0114\u00058\u0000\u0000\u010a\u0114\u00059\u0000"+
		"\u0000\u010b\u0114\u0005:\u0000\u0000\u010c\u0114\u0005\u001e\u0000\u0000"+
		"\u010d\u0114\u0005\u001f\u0000\u0000\u010e\u0114\u0005\u001d\u0000\u0000"+
		"\u010f\u0110\u00052\u0000\u0000\u0110\u0111\u0003\u001c\u000e\u0000\u0111"+
		"\u0112\u00053\u0000\u0000\u0112\u0114\u0001\u0000\u0000\u0000\u0113\u0108"+
		"\u0001\u0000\u0000\u0000\u0113\u0109\u0001\u0000\u0000\u0000\u0113\u010a"+
		"\u0001\u0000\u0000\u0000\u0113\u010b\u0001\u0000\u0000\u0000\u0113\u010c"+
		"\u0001\u0000\u0000\u0000\u0113\u010d\u0001\u0000\u0000\u0000\u0113\u010e"+
		"\u0001\u0000\u0000\u0000\u0113\u010f\u0001\u0000\u0000\u0000\u01143\u0001"+
		"\u0000\u0000\u0000\u001a7BIPY]r{\u0081\u0085\u0092\u009b\u00a7\u00c0\u00c8"+
		"\u00ce\u00d5\u00dd\u00e5\u00eb\u00f1\u00fc\u00ff\u0103\u0106\u0113";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}