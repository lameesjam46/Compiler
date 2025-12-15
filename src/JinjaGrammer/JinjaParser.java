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
		VAR_START=1, VAR_END=2, BLOCK_START=3, BLOCK_END=4, IF=5, ENDIF=6, FOR=7, 
		ENDFOR=8, IN=9, ID=10, TEXT=11, WS=12;
	public static final int
		RULE_template = 0, RULE_element = 1, RULE_variable = 2, RULE_ifStatement = 3, 
		RULE_forStatement = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"template", "element", "variable", "ifStatement", "forStatement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{{'", "'}}'", "'{%'", "'%}'", "'if'", "'endif'", "'for'", "'endfor'", 
			"'in'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "VAR_START", "VAR_END", "BLOCK_START", "BLOCK_END", "IF", "ENDIF", 
			"FOR", "ENDFOR", "IN", "ID", "TEXT", "WS"
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
	public static class TemplateContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(JinjaParser.EOF, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitTemplate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitTemplate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateContext template() throws RecognitionException {
		TemplateContext _localctx = new TemplateContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_template);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2058L) != 0)) {
				{
				{
				setState(10);
				element();
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
	public static class ElementContext extends ParserRuleContext {
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
	 
		public ElementContext() { }
		public void copyFrom(ElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaExprNodeContext extends ElementContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public JinjaExprNodeContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinjaExprNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinjaExprNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinjaExprNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaForNodeContext extends ElementContext {
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public JinjaForNodeContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinjaForNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinjaForNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinjaForNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaIfNodeContext extends ElementContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public JinjaIfNodeContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinjaIfNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinjaIfNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinjaIfNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TextNodeContext extends ElementContext {
		public TerminalNode TEXT() { return getToken(JinjaParser.TEXT, 0); }
		public TextNodeContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterTextNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitTextNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitTextNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_element);
		try {
			setState(22);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new TextNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				match(TEXT);
				}
				break;
			case 2:
				_localctx = new JinjaExprNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(19);
				variable();
				}
				break;
			case 3:
				_localctx = new JinjaIfNodeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(20);
				ifStatement();
				}
				break;
			case 4:
				_localctx = new JinjaForNodeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(21);
				forStatement();
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
	public static class VariableContext extends ParserRuleContext {
		public TerminalNode VAR_START() { return getToken(JinjaParser.VAR_START, 0); }
		public TerminalNode ID() { return getToken(JinjaParser.ID, 0); }
		public TerminalNode VAR_END() { return getToken(JinjaParser.VAR_END, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(VAR_START);
			setState(25);
			match(ID);
			setState(26);
			match(VAR_END);
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
	public static class IfStatementContext extends ParserRuleContext {
		public List<TerminalNode> BLOCK_START() { return getTokens(JinjaParser.BLOCK_START); }
		public TerminalNode BLOCK_START(int i) {
			return getToken(JinjaParser.BLOCK_START, i);
		}
		public TerminalNode IF() { return getToken(JinjaParser.IF, 0); }
		public TerminalNode ID() { return getToken(JinjaParser.ID, 0); }
		public List<TerminalNode> BLOCK_END() { return getTokens(JinjaParser.BLOCK_END); }
		public TerminalNode BLOCK_END(int i) {
			return getToken(JinjaParser.BLOCK_END, i);
		}
		public TerminalNode ENDIF() { return getToken(JinjaParser.ENDIF, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
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

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ifStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(BLOCK_START);
			setState(29);
			match(IF);
			setState(30);
			match(ID);
			setState(31);
			match(BLOCK_END);
			setState(35);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(32);
					element();
					}
					} 
				}
				setState(37);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(38);
			match(BLOCK_START);
			setState(39);
			match(ENDIF);
			setState(40);
			match(BLOCK_END);
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
	public static class ForStatementContext extends ParserRuleContext {
		public List<TerminalNode> BLOCK_START() { return getTokens(JinjaParser.BLOCK_START); }
		public TerminalNode BLOCK_START(int i) {
			return getToken(JinjaParser.BLOCK_START, i);
		}
		public TerminalNode FOR() { return getToken(JinjaParser.FOR, 0); }
		public List<TerminalNode> ID() { return getTokens(JinjaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(JinjaParser.ID, i);
		}
		public TerminalNode IN() { return getToken(JinjaParser.IN, 0); }
		public List<TerminalNode> BLOCK_END() { return getTokens(JinjaParser.BLOCK_END); }
		public TerminalNode BLOCK_END(int i) {
			return getToken(JinjaParser.BLOCK_END, i);
		}
		public TerminalNode ENDFOR() { return getToken(JinjaParser.ENDFOR, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
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

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_forStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(BLOCK_START);
			setState(43);
			match(FOR);
			setState(44);
			match(ID);
			setState(45);
			match(IN);
			setState(46);
			match(ID);
			setState(47);
			match(BLOCK_END);
			setState(51);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(48);
					element();
					}
					} 
				}
				setState(53);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(54);
			match(BLOCK_START);
			setState(55);
			match(ENDFOR);
			setState(56);
			match(BLOCK_END);
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
		"\u0004\u0001\f;\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0005\u0000\f\b\u0000\n\u0000\f\u0000\u000f\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"\u0017\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\"\b\u0003"+
		"\n\u0003\f\u0003%\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u00042\b\u0004\n\u0004\f\u00045\t\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0000\u0000\u0005\u0000"+
		"\u0002\u0004\u0006\b\u0000\u0000;\u0000\r\u0001\u0000\u0000\u0000\u0002"+
		"\u0016\u0001\u0000\u0000\u0000\u0004\u0018\u0001\u0000\u0000\u0000\u0006"+
		"\u001c\u0001\u0000\u0000\u0000\b*\u0001\u0000\u0000\u0000\n\f\u0003\u0002"+
		"\u0001\u0000\u000b\n\u0001\u0000\u0000\u0000\f\u000f\u0001\u0000\u0000"+
		"\u0000\r\u000b\u0001\u0000\u0000\u0000\r\u000e\u0001\u0000\u0000\u0000"+
		"\u000e\u0010\u0001\u0000\u0000\u0000\u000f\r\u0001\u0000\u0000\u0000\u0010"+
		"\u0011\u0005\u0000\u0000\u0001\u0011\u0001\u0001\u0000\u0000\u0000\u0012"+
		"\u0017\u0005\u000b\u0000\u0000\u0013\u0017\u0003\u0004\u0002\u0000\u0014"+
		"\u0017\u0003\u0006\u0003\u0000\u0015\u0017\u0003\b\u0004\u0000\u0016\u0012"+
		"\u0001\u0000\u0000\u0000\u0016\u0013\u0001\u0000\u0000\u0000\u0016\u0014"+
		"\u0001\u0000\u0000\u0000\u0016\u0015\u0001\u0000\u0000\u0000\u0017\u0003"+
		"\u0001\u0000\u0000\u0000\u0018\u0019\u0005\u0001\u0000\u0000\u0019\u001a"+
		"\u0005\n\u0000\u0000\u001a\u001b\u0005\u0002\u0000\u0000\u001b\u0005\u0001"+
		"\u0000\u0000\u0000\u001c\u001d\u0005\u0003\u0000\u0000\u001d\u001e\u0005"+
		"\u0005\u0000\u0000\u001e\u001f\u0005\n\u0000\u0000\u001f#\u0005\u0004"+
		"\u0000\u0000 \"\u0003\u0002\u0001\u0000! \u0001\u0000\u0000\u0000\"%\u0001"+
		"\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000"+
		"$&\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000&\'\u0005\u0003\u0000"+
		"\u0000\'(\u0005\u0006\u0000\u0000()\u0005\u0004\u0000\u0000)\u0007\u0001"+
		"\u0000\u0000\u0000*+\u0005\u0003\u0000\u0000+,\u0005\u0007\u0000\u0000"+
		",-\u0005\n\u0000\u0000-.\u0005\t\u0000\u0000./\u0005\n\u0000\u0000/3\u0005"+
		"\u0004\u0000\u000002\u0003\u0002\u0001\u000010\u0001\u0000\u0000\u0000"+
		"25\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u000034\u0001\u0000\u0000"+
		"\u000046\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u000067\u0005\u0003"+
		"\u0000\u000078\u0005\b\u0000\u000089\u0005\u0004\u0000\u00009\t\u0001"+
		"\u0000\u0000\u0000\u0004\r\u0016#3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}