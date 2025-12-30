// Generated from C:/Users/DELL/IdeaProjects/untitled3/src/ParserCss.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ParserCss extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LKB=1, RKB=2, LSB=3, RSB=4, LP=5, RP=6, COMMA=7, COLON=8, DOT=9, HASH=10, 
		SEMICOLON=11, IMPORT=12, MEDIA=13, COLOR=14, FONT_FAMILY=15, FONT_SIZE=16, 
		TEXT_ALIGN=17, BAK_GROUND=18, OPACITY=19, BORDER=20, DISPLAY=21, POSITION=22, 
		FONT_WEIGHT=23, BACKGROUND_COLOR=24, VALUE_FONT_WEIGHT=25, VALUE_POSITION=26, 
		VALUE_TEXT_ALIGN=27, SIZE_1=28, SIZE_2=29, COLOR_VALUE=30, IDENT=31, STAR=32, 
		WS=33, FLOAT=34, COMMENT=35, NONE_KW=36, AUTO_KW=37, VALUE_GENERAL=38, 
		VALUE_FONT_SIZE=39, VALUE_DISPLAY=40, BORDER_STYLE=41;
	public static final int
		RULE_style = 0, RULE_statement = 1, RULE_importStatement = 2, RULE_rule = 3, 
		RULE_selector = 4, RULE_simpleSelector = 5, RULE_property = 6, RULE_box_value = 7, 
		RULE_size1_rule = 8, RULE_size2_rule = 9, RULE_textalign_rule = 10, RULE_color_rule = 11, 
		RULE_font_size_rule = 12, RULE_font_family = 13, RULE_display_rule = 14, 
		RULE_border_rule = 15, RULE_border_value = 16, RULE_mediaRule = 17, RULE_opacity_rule = 18, 
		RULE_position_rule = 19, RULE_font_weight_rule = 20, RULE_background_rule = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"style", "statement", "importStatement", "rule", "selector", "simpleSelector", 
			"property", "box_value", "size1_rule", "size2_rule", "textalign_rule", 
			"color_rule", "font_size_rule", "font_family", "display_rule", "border_rule", 
			"border_value", "mediaRule", "opacity_rule", "position_rule", "font_weight_rule", 
			"background_rule"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'['", "']'", "'('", "')'", "','", "':'", "'.'", 
			"'#'", "';'", "'import'", "'@media'", "'color'", "'font_family'", "'font_size'", 
			"'text_align'", "'bakground'", "'opacity'", "'border'", "'display'", 
			"'position'", "'font-weight'", "'background-color'", null, null, null, 
			null, null, null, null, "'*'", null, null, null, "'none'", "'auto'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LKB", "RKB", "LSB", "RSB", "LP", "RP", "COMMA", "COLON", "DOT", 
			"HASH", "SEMICOLON", "IMPORT", "MEDIA", "COLOR", "FONT_FAMILY", "FONT_SIZE", 
			"TEXT_ALIGN", "BAK_GROUND", "OPACITY", "BORDER", "DISPLAY", "POSITION", 
			"FONT_WEIGHT", "BACKGROUND_COLOR", "VALUE_FONT_WEIGHT", "VALUE_POSITION", 
			"VALUE_TEXT_ALIGN", "SIZE_1", "SIZE_2", "COLOR_VALUE", "IDENT", "STAR", 
			"WS", "FLOAT", "COMMENT", "NONE_KW", "AUTO_KW", "VALUE_GENERAL", "VALUE_FONT_SIZE", 
			"VALUE_DISPLAY", "BORDER_STYLE"
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
	public String getGrammarFileName() { return "ParserCss.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ParserCss(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StyleContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ParserCss.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_style; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleContext style() throws RecognitionException {
		StyleContext _localctx = new StyleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_style);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6442464768L) != 0)) {
				{
				{
				setState(44);
				statement();
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
		public ImportStatementContext importStatement() {
			return getRuleContext(ImportStatementContext.class,0);
		}
		public RuleContext rule_() {
			return getRuleContext(RuleContext.class,0);
		}
		public MediaRuleContext mediaRule() {
			return getRuleContext(MediaRuleContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				importStatement();
				}
				break;
			case DOT:
			case HASH:
			case IDENT:
			case STAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				rule_();
				}
				break;
			case MEDIA:
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
				mediaRule();
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
	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(ParserCss.IMPORT, 0); }
		public TerminalNode SEMICOLON() { return getToken(ParserCss.SEMICOLON, 0); }
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(IMPORT);
			setState(58);
			match(SEMICOLON);
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
	public static class RuleContext extends ParserRuleContext {
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class,0);
		}
		public TerminalNode LKB() { return getToken(ParserCss.LKB, 0); }
		public TerminalNode RKB() { return getToken(ParserCss.RKB, 0); }
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public RuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleContext rule_() throws RecognitionException {
		RuleContext _localctx = new RuleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			selector();
			setState(61);
			match(LKB);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 838582272L) != 0)) {
				{
				{
				setState(62);
				property();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
			match(RKB);
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
	public static class SelectorContext extends ParserRuleContext {
		public List<SimpleSelectorContext> simpleSelector() {
			return getRuleContexts(SimpleSelectorContext.class);
		}
		public SimpleSelectorContext simpleSelector(int i) {
			return getRuleContext(SimpleSelectorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ParserCss.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserCss.COMMA, i);
		}
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_selector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			simpleSelector();
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(71);
				match(COMMA);
				setState(72);
				simpleSelector();
				}
				}
				setState(77);
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
	public static class SimpleSelectorContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(ParserCss.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(ParserCss.IDENT, i);
		}
		public TerminalNode DOT() { return getToken(ParserCss.DOT, 0); }
		public TerminalNode HASH() { return getToken(ParserCss.HASH, 0); }
		public TerminalNode COLON() { return getToken(ParserCss.COLON, 0); }
		public TerminalNode STAR() { return getToken(ParserCss.STAR, 0); }
		public SimpleSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterSimpleSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitSimpleSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitSimpleSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleSelectorContext simpleSelector() throws RecognitionException {
		SimpleSelectorContext _localctx = new SimpleSelectorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_simpleSelector);
		try {
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				match(IDENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				match(DOT);
				setState(80);
				match(IDENT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				match(HASH);
				setState(82);
				match(IDENT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
				match(IDENT);
				setState(84);
				match(COLON);
				setState(85);
				match(IDENT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(86);
				match(STAR);
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
	public static class PropertyContext extends ParserRuleContext {
		public Size1_ruleContext size1_rule() {
			return getRuleContext(Size1_ruleContext.class,0);
		}
		public Size2_ruleContext size2_rule() {
			return getRuleContext(Size2_ruleContext.class,0);
		}
		public Textalign_ruleContext textalign_rule() {
			return getRuleContext(Textalign_ruleContext.class,0);
		}
		public Color_ruleContext color_rule() {
			return getRuleContext(Color_ruleContext.class,0);
		}
		public Font_size_ruleContext font_size_rule() {
			return getRuleContext(Font_size_ruleContext.class,0);
		}
		public Font_familyContext font_family() {
			return getRuleContext(Font_familyContext.class,0);
		}
		public Display_ruleContext display_rule() {
			return getRuleContext(Display_ruleContext.class,0);
		}
		public Opacity_ruleContext opacity_rule() {
			return getRuleContext(Opacity_ruleContext.class,0);
		}
		public Border_ruleContext border_rule() {
			return getRuleContext(Border_ruleContext.class,0);
		}
		public Position_ruleContext position_rule() {
			return getRuleContext(Position_ruleContext.class,0);
		}
		public Font_weight_ruleContext font_weight_rule() {
			return getRuleContext(Font_weight_ruleContext.class,0);
		}
		public Background_ruleContext background_rule() {
			return getRuleContext(Background_ruleContext.class,0);
		}
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_property);
		try {
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIZE_1:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				size1_rule();
				}
				break;
			case SIZE_2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				size2_rule();
				}
				break;
			case TEXT_ALIGN:
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
				textalign_rule();
				}
				break;
			case COLOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(92);
				color_rule();
				}
				break;
			case FONT_SIZE:
				enterOuterAlt(_localctx, 5);
				{
				setState(93);
				font_size_rule();
				}
				break;
			case FONT_FAMILY:
				enterOuterAlt(_localctx, 6);
				{
				setState(94);
				font_family();
				}
				break;
			case DISPLAY:
				enterOuterAlt(_localctx, 7);
				{
				setState(95);
				display_rule();
				}
				break;
			case OPACITY:
				enterOuterAlt(_localctx, 8);
				{
				setState(96);
				opacity_rule();
				}
				break;
			case BORDER:
				enterOuterAlt(_localctx, 9);
				{
				setState(97);
				border_rule();
				}
				break;
			case POSITION:
				enterOuterAlt(_localctx, 10);
				{
				setState(98);
				position_rule();
				}
				break;
			case FONT_WEIGHT:
				enterOuterAlt(_localctx, 11);
				{
				setState(99);
				font_weight_rule();
				}
				break;
			case BACKGROUND_COLOR:
				enterOuterAlt(_localctx, 12);
				{
				setState(100);
				background_rule();
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
	public static class Box_valueContext extends ParserRuleContext {
		public List<TerminalNode> VALUE_GENERAL() { return getTokens(ParserCss.VALUE_GENERAL); }
		public TerminalNode VALUE_GENERAL(int i) {
			return getToken(ParserCss.VALUE_GENERAL, i);
		}
		public Box_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_box_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterBox_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitBox_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitBox_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Box_valueContext box_value() throws RecognitionException {
		Box_valueContext _localctx = new Box_valueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_box_value);
		try {
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				match(VALUE_GENERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				match(VALUE_GENERAL);
				setState(105);
				match(VALUE_GENERAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				match(VALUE_GENERAL);
				setState(107);
				match(VALUE_GENERAL);
				setState(108);
				match(VALUE_GENERAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(109);
				match(VALUE_GENERAL);
				setState(110);
				match(VALUE_GENERAL);
				setState(111);
				match(VALUE_GENERAL);
				setState(112);
				match(VALUE_GENERAL);
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
	public static class Size1_ruleContext extends ParserRuleContext {
		public TerminalNode SIZE_1() { return getToken(ParserCss.SIZE_1, 0); }
		public TerminalNode COLON() { return getToken(ParserCss.COLON, 0); }
		public TerminalNode SEMICOLON() { return getToken(ParserCss.SEMICOLON, 0); }
		public TerminalNode VALUE_GENERAL() { return getToken(ParserCss.VALUE_GENERAL, 0); }
		public TerminalNode AUTO_KW() { return getToken(ParserCss.AUTO_KW, 0); }
		public Size1_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_size1_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterSize1_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitSize1_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitSize1_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Size1_ruleContext size1_rule() throws RecognitionException {
		Size1_ruleContext _localctx = new Size1_ruleContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_size1_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(SIZE_1);
			setState(116);
			match(COLON);
			setState(117);
			_la = _input.LA(1);
			if ( !(_la==AUTO_KW || _la==VALUE_GENERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(118);
			match(SEMICOLON);
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
	public static class Size2_ruleContext extends ParserRuleContext {
		public TerminalNode SIZE_2() { return getToken(ParserCss.SIZE_2, 0); }
		public TerminalNode COLON() { return getToken(ParserCss.COLON, 0); }
		public Box_valueContext box_value() {
			return getRuleContext(Box_valueContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ParserCss.SEMICOLON, 0); }
		public Size2_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_size2_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterSize2_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitSize2_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitSize2_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Size2_ruleContext size2_rule() throws RecognitionException {
		Size2_ruleContext _localctx = new Size2_ruleContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_size2_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(SIZE_2);
			setState(121);
			match(COLON);
			setState(122);
			box_value();
			setState(123);
			match(SEMICOLON);
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
	public static class Textalign_ruleContext extends ParserRuleContext {
		public TerminalNode TEXT_ALIGN() { return getToken(ParserCss.TEXT_ALIGN, 0); }
		public TerminalNode COLON() { return getToken(ParserCss.COLON, 0); }
		public TerminalNode VALUE_TEXT_ALIGN() { return getToken(ParserCss.VALUE_TEXT_ALIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(ParserCss.SEMICOLON, 0); }
		public Textalign_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textalign_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterTextalign_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitTextalign_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitTextalign_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Textalign_ruleContext textalign_rule() throws RecognitionException {
		Textalign_ruleContext _localctx = new Textalign_ruleContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_textalign_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(TEXT_ALIGN);
			setState(126);
			match(COLON);
			setState(127);
			match(VALUE_TEXT_ALIGN);
			setState(128);
			match(SEMICOLON);
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
	public static class Color_ruleContext extends ParserRuleContext {
		public TerminalNode COLOR() { return getToken(ParserCss.COLOR, 0); }
		public TerminalNode COLON() { return getToken(ParserCss.COLON, 0); }
		public TerminalNode COLOR_VALUE() { return getToken(ParserCss.COLOR_VALUE, 0); }
		public TerminalNode SEMICOLON() { return getToken(ParserCss.SEMICOLON, 0); }
		public Color_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterColor_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitColor_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitColor_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Color_ruleContext color_rule() throws RecognitionException {
		Color_ruleContext _localctx = new Color_ruleContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_color_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(COLOR);
			setState(131);
			match(COLON);
			setState(132);
			match(COLOR_VALUE);
			setState(133);
			match(SEMICOLON);
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
	public static class Font_size_ruleContext extends ParserRuleContext {
		public TerminalNode FONT_SIZE() { return getToken(ParserCss.FONT_SIZE, 0); }
		public TerminalNode COLON() { return getToken(ParserCss.COLON, 0); }
		public TerminalNode VALUE_GENERAL() { return getToken(ParserCss.VALUE_GENERAL, 0); }
		public TerminalNode SEMICOLON() { return getToken(ParserCss.SEMICOLON, 0); }
		public Font_size_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_font_size_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterFont_size_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitFont_size_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitFont_size_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Font_size_ruleContext font_size_rule() throws RecognitionException {
		Font_size_ruleContext _localctx = new Font_size_ruleContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_font_size_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(FONT_SIZE);
			setState(136);
			match(COLON);
			setState(137);
			match(VALUE_GENERAL);
			setState(138);
			match(SEMICOLON);
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
	public static class Font_familyContext extends ParserRuleContext {
		public TerminalNode FONT_FAMILY() { return getToken(ParserCss.FONT_FAMILY, 0); }
		public TerminalNode COLON() { return getToken(ParserCss.COLON, 0); }
		public TerminalNode IDENT() { return getToken(ParserCss.IDENT, 0); }
		public TerminalNode SEMICOLON() { return getToken(ParserCss.SEMICOLON, 0); }
		public Font_familyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_font_family; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterFont_family(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitFont_family(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitFont_family(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Font_familyContext font_family() throws RecognitionException {
		Font_familyContext _localctx = new Font_familyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_font_family);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(FONT_FAMILY);
			setState(141);
			match(COLON);
			setState(142);
			match(IDENT);
			setState(143);
			match(SEMICOLON);
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
	public static class Display_ruleContext extends ParserRuleContext {
		public TerminalNode DISPLAY() { return getToken(ParserCss.DISPLAY, 0); }
		public TerminalNode COLON() { return getToken(ParserCss.COLON, 0); }
		public TerminalNode VALUE_DISPLAY() { return getToken(ParserCss.VALUE_DISPLAY, 0); }
		public TerminalNode SEMICOLON() { return getToken(ParserCss.SEMICOLON, 0); }
		public Display_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_display_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterDisplay_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitDisplay_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitDisplay_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Display_ruleContext display_rule() throws RecognitionException {
		Display_ruleContext _localctx = new Display_ruleContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_display_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(DISPLAY);
			setState(146);
			match(COLON);
			setState(147);
			match(VALUE_DISPLAY);
			setState(148);
			match(SEMICOLON);
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
	public static class Border_ruleContext extends ParserRuleContext {
		public TerminalNode BORDER() { return getToken(ParserCss.BORDER, 0); }
		public TerminalNode COLON() { return getToken(ParserCss.COLON, 0); }
		public Border_valueContext border_value() {
			return getRuleContext(Border_valueContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ParserCss.SEMICOLON, 0); }
		public Border_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_border_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterBorder_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitBorder_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitBorder_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Border_ruleContext border_rule() throws RecognitionException {
		Border_ruleContext _localctx = new Border_ruleContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_border_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(BORDER);
			setState(151);
			match(COLON);
			setState(152);
			border_value();
			setState(153);
			match(SEMICOLON);
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
	public static class Border_valueContext extends ParserRuleContext {
		public TerminalNode NONE_KW() { return getToken(ParserCss.NONE_KW, 0); }
		public TerminalNode VALUE_GENERAL() { return getToken(ParserCss.VALUE_GENERAL, 0); }
		public TerminalNode BORDER_STYLE() { return getToken(ParserCss.BORDER_STYLE, 0); }
		public TerminalNode COLOR_VALUE() { return getToken(ParserCss.COLOR_VALUE, 0); }
		public Border_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_border_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterBorder_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitBorder_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitBorder_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Border_valueContext border_value() throws RecognitionException {
		Border_valueContext _localctx = new Border_valueContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_border_value);
		int _la;
		try {
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONE_KW:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				match(NONE_KW);
				}
				break;
			case VALUE_GENERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				match(VALUE_GENERAL);
				setState(157);
				match(BORDER_STYLE);
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLOR_VALUE) {
					{
					setState(158);
					match(COLOR_VALUE);
					}
				}

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
	public static class MediaRuleContext extends ParserRuleContext {
		public TerminalNode MEDIA() { return getToken(ParserCss.MEDIA, 0); }
		public TerminalNode LKB() { return getToken(ParserCss.LKB, 0); }
		public TerminalNode RKB() { return getToken(ParserCss.RKB, 0); }
		public List<RuleContext> rule_() {
			return getRuleContexts(RuleContext.class);
		}
		public RuleContext rule_(int i) {
			return getRuleContext(RuleContext.class,i);
		}
		public MediaRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mediaRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterMediaRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitMediaRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitMediaRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MediaRuleContext mediaRule() throws RecognitionException {
		MediaRuleContext _localctx = new MediaRuleContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_mediaRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(MEDIA);
			setState(164);
			match(LKB);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6442452480L) != 0)) {
				{
				{
				setState(165);
				rule_();
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171);
			match(RKB);
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
	public static class Opacity_ruleContext extends ParserRuleContext {
		public TerminalNode OPACITY() { return getToken(ParserCss.OPACITY, 0); }
		public TerminalNode COLON() { return getToken(ParserCss.COLON, 0); }
		public TerminalNode VALUE_GENERAL() { return getToken(ParserCss.VALUE_GENERAL, 0); }
		public TerminalNode SEMICOLON() { return getToken(ParserCss.SEMICOLON, 0); }
		public Opacity_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opacity_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterOpacity_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitOpacity_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitOpacity_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Opacity_ruleContext opacity_rule() throws RecognitionException {
		Opacity_ruleContext _localctx = new Opacity_ruleContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_opacity_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(OPACITY);
			setState(174);
			match(COLON);
			setState(175);
			match(VALUE_GENERAL);
			setState(176);
			match(SEMICOLON);
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
	public static class Position_ruleContext extends ParserRuleContext {
		public TerminalNode POSITION() { return getToken(ParserCss.POSITION, 0); }
		public TerminalNode COLON() { return getToken(ParserCss.COLON, 0); }
		public TerminalNode VALUE_POSITION() { return getToken(ParserCss.VALUE_POSITION, 0); }
		public TerminalNode SEMICOLON() { return getToken(ParserCss.SEMICOLON, 0); }
		public Position_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_position_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterPosition_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitPosition_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitPosition_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Position_ruleContext position_rule() throws RecognitionException {
		Position_ruleContext _localctx = new Position_ruleContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_position_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(POSITION);
			setState(179);
			match(COLON);
			setState(180);
			match(VALUE_POSITION);
			setState(181);
			match(SEMICOLON);
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
	public static class Font_weight_ruleContext extends ParserRuleContext {
		public TerminalNode FONT_WEIGHT() { return getToken(ParserCss.FONT_WEIGHT, 0); }
		public TerminalNode COLON() { return getToken(ParserCss.COLON, 0); }
		public TerminalNode VALUE_FONT_WEIGHT() { return getToken(ParserCss.VALUE_FONT_WEIGHT, 0); }
		public TerminalNode SEMICOLON() { return getToken(ParserCss.SEMICOLON, 0); }
		public Font_weight_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_font_weight_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterFont_weight_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitFont_weight_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitFont_weight_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Font_weight_ruleContext font_weight_rule() throws RecognitionException {
		Font_weight_ruleContext _localctx = new Font_weight_ruleContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_font_weight_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(FONT_WEIGHT);
			setState(184);
			match(COLON);
			setState(185);
			match(VALUE_FONT_WEIGHT);
			setState(186);
			match(SEMICOLON);
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
	public static class Background_ruleContext extends ParserRuleContext {
		public TerminalNode BACKGROUND_COLOR() { return getToken(ParserCss.BACKGROUND_COLOR, 0); }
		public TerminalNode COLON() { return getToken(ParserCss.COLON, 0); }
		public TerminalNode COLOR_VALUE() { return getToken(ParserCss.COLOR_VALUE, 0); }
		public TerminalNode SEMICOLON() { return getToken(ParserCss.SEMICOLON, 0); }
		public Background_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_background_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterBackground_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitBackground_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitBackground_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Background_ruleContext background_rule() throws RecognitionException {
		Background_ruleContext _localctx = new Background_ruleContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_background_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(BACKGROUND_COLOR);
			setState(189);
			match(COLON);
			setState(190);
			match(COLOR_VALUE);
			setState(191);
			match(SEMICOLON);
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
		"\u0004\u0001)\u00c2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0001\u0000\u0005\u0000.\b\u0000\n\u0000\f\u00001\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00018\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003@\b\u0003\n\u0003\f\u0003C\t\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004J\b\u0004\n\u0004\f\u0004"+
		"M\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005X\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006f\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007r\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u00a0\b\u0010\u0003\u0010\u00a2\b"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00a7\b\u0011\n"+
		"\u0011\f\u0011\u00aa\t\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0000\u0000\u0016\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*\u0000\u0001\u0001"+
		"\u0000%&\u00c5\u0000/\u0001\u0000\u0000\u0000\u00027\u0001\u0000\u0000"+
		"\u0000\u00049\u0001\u0000\u0000\u0000\u0006<\u0001\u0000\u0000\u0000\b"+
		"F\u0001\u0000\u0000\u0000\nW\u0001\u0000\u0000\u0000\fe\u0001\u0000\u0000"+
		"\u0000\u000eq\u0001\u0000\u0000\u0000\u0010s\u0001\u0000\u0000\u0000\u0012"+
		"x\u0001\u0000\u0000\u0000\u0014}\u0001\u0000\u0000\u0000\u0016\u0082\u0001"+
		"\u0000\u0000\u0000\u0018\u0087\u0001\u0000\u0000\u0000\u001a\u008c\u0001"+
		"\u0000\u0000\u0000\u001c\u0091\u0001\u0000\u0000\u0000\u001e\u0096\u0001"+
		"\u0000\u0000\u0000 \u00a1\u0001\u0000\u0000\u0000\"\u00a3\u0001\u0000"+
		"\u0000\u0000$\u00ad\u0001\u0000\u0000\u0000&\u00b2\u0001\u0000\u0000\u0000"+
		"(\u00b7\u0001\u0000\u0000\u0000*\u00bc\u0001\u0000\u0000\u0000,.\u0003"+
		"\u0002\u0001\u0000-,\u0001\u0000\u0000\u0000.1\u0001\u0000\u0000\u0000"+
		"/-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u000002\u0001\u0000\u0000"+
		"\u00001/\u0001\u0000\u0000\u000023\u0005\u0000\u0000\u00013\u0001\u0001"+
		"\u0000\u0000\u000048\u0003\u0004\u0002\u000058\u0003\u0006\u0003\u0000"+
		"68\u0003\"\u0011\u000074\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u0000"+
		"76\u0001\u0000\u0000\u00008\u0003\u0001\u0000\u0000\u00009:\u0005\f\u0000"+
		"\u0000:;\u0005\u000b\u0000\u0000;\u0005\u0001\u0000\u0000\u0000<=\u0003"+
		"\b\u0004\u0000=A\u0005\u0001\u0000\u0000>@\u0003\f\u0006\u0000?>\u0001"+
		"\u0000\u0000\u0000@C\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000"+
		"AB\u0001\u0000\u0000\u0000BD\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000"+
		"\u0000DE\u0005\u0002\u0000\u0000E\u0007\u0001\u0000\u0000\u0000FK\u0003"+
		"\n\u0005\u0000GH\u0005\u0007\u0000\u0000HJ\u0003\n\u0005\u0000IG\u0001"+
		"\u0000\u0000\u0000JM\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000"+
		"KL\u0001\u0000\u0000\u0000L\t\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000"+
		"\u0000NX\u0005\u001f\u0000\u0000OP\u0005\t\u0000\u0000PX\u0005\u001f\u0000"+
		"\u0000QR\u0005\n\u0000\u0000RX\u0005\u001f\u0000\u0000ST\u0005\u001f\u0000"+
		"\u0000TU\u0005\b\u0000\u0000UX\u0005\u001f\u0000\u0000VX\u0005 \u0000"+
		"\u0000WN\u0001\u0000\u0000\u0000WO\u0001\u0000\u0000\u0000WQ\u0001\u0000"+
		"\u0000\u0000WS\u0001\u0000\u0000\u0000WV\u0001\u0000\u0000\u0000X\u000b"+
		"\u0001\u0000\u0000\u0000Yf\u0003\u0010\b\u0000Zf\u0003\u0012\t\u0000["+
		"f\u0003\u0014\n\u0000\\f\u0003\u0016\u000b\u0000]f\u0003\u0018\f\u0000"+
		"^f\u0003\u001a\r\u0000_f\u0003\u001c\u000e\u0000`f\u0003$\u0012\u0000"+
		"af\u0003\u001e\u000f\u0000bf\u0003&\u0013\u0000cf\u0003(\u0014\u0000d"+
		"f\u0003*\u0015\u0000eY\u0001\u0000\u0000\u0000eZ\u0001\u0000\u0000\u0000"+
		"e[\u0001\u0000\u0000\u0000e\\\u0001\u0000\u0000\u0000e]\u0001\u0000\u0000"+
		"\u0000e^\u0001\u0000\u0000\u0000e_\u0001\u0000\u0000\u0000e`\u0001\u0000"+
		"\u0000\u0000ea\u0001\u0000\u0000\u0000eb\u0001\u0000\u0000\u0000ec\u0001"+
		"\u0000\u0000\u0000ed\u0001\u0000\u0000\u0000f\r\u0001\u0000\u0000\u0000"+
		"gr\u0005&\u0000\u0000hi\u0005&\u0000\u0000ir\u0005&\u0000\u0000jk\u0005"+
		"&\u0000\u0000kl\u0005&\u0000\u0000lr\u0005&\u0000\u0000mn\u0005&\u0000"+
		"\u0000no\u0005&\u0000\u0000op\u0005&\u0000\u0000pr\u0005&\u0000\u0000"+
		"qg\u0001\u0000\u0000\u0000qh\u0001\u0000\u0000\u0000qj\u0001\u0000\u0000"+
		"\u0000qm\u0001\u0000\u0000\u0000r\u000f\u0001\u0000\u0000\u0000st\u0005"+
		"\u001c\u0000\u0000tu\u0005\b\u0000\u0000uv\u0007\u0000\u0000\u0000vw\u0005"+
		"\u000b\u0000\u0000w\u0011\u0001\u0000\u0000\u0000xy\u0005\u001d\u0000"+
		"\u0000yz\u0005\b\u0000\u0000z{\u0003\u000e\u0007\u0000{|\u0005\u000b\u0000"+
		"\u0000|\u0013\u0001\u0000\u0000\u0000}~\u0005\u0011\u0000\u0000~\u007f"+
		"\u0005\b\u0000\u0000\u007f\u0080\u0005\u001b\u0000\u0000\u0080\u0081\u0005"+
		"\u000b\u0000\u0000\u0081\u0015\u0001\u0000\u0000\u0000\u0082\u0083\u0005"+
		"\u000e\u0000\u0000\u0083\u0084\u0005\b\u0000\u0000\u0084\u0085\u0005\u001e"+
		"\u0000\u0000\u0085\u0086\u0005\u000b\u0000\u0000\u0086\u0017\u0001\u0000"+
		"\u0000\u0000\u0087\u0088\u0005\u0010\u0000\u0000\u0088\u0089\u0005\b\u0000"+
		"\u0000\u0089\u008a\u0005&\u0000\u0000\u008a\u008b\u0005\u000b\u0000\u0000"+
		"\u008b\u0019\u0001\u0000\u0000\u0000\u008c\u008d\u0005\u000f\u0000\u0000"+
		"\u008d\u008e\u0005\b\u0000\u0000\u008e\u008f\u0005\u001f\u0000\u0000\u008f"+
		"\u0090\u0005\u000b\u0000\u0000\u0090\u001b\u0001\u0000\u0000\u0000\u0091"+
		"\u0092\u0005\u0015\u0000\u0000\u0092\u0093\u0005\b\u0000\u0000\u0093\u0094"+
		"\u0005(\u0000\u0000\u0094\u0095\u0005\u000b\u0000\u0000\u0095\u001d\u0001"+
		"\u0000\u0000\u0000\u0096\u0097\u0005\u0014\u0000\u0000\u0097\u0098\u0005"+
		"\b\u0000\u0000\u0098\u0099\u0003 \u0010\u0000\u0099\u009a\u0005\u000b"+
		"\u0000\u0000\u009a\u001f\u0001\u0000\u0000\u0000\u009b\u00a2\u0005$\u0000"+
		"\u0000\u009c\u009d\u0005&\u0000\u0000\u009d\u009f\u0005)\u0000\u0000\u009e"+
		"\u00a0\u0005\u001e\u0000\u0000\u009f\u009e\u0001\u0000\u0000\u0000\u009f"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a2\u0001\u0000\u0000\u0000\u00a1"+
		"\u009b\u0001\u0000\u0000\u0000\u00a1\u009c\u0001\u0000\u0000\u0000\u00a2"+
		"!\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005\r\u0000\u0000\u00a4\u00a8"+
		"\u0005\u0001\u0000\u0000\u00a5\u00a7\u0003\u0006\u0003\u0000\u00a6\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a7\u00aa\u0001\u0000\u0000\u0000\u00a8\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00ab"+
		"\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00ab\u00ac"+
		"\u0005\u0002\u0000\u0000\u00ac#\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005"+
		"\u0013\u0000\u0000\u00ae\u00af\u0005\b\u0000\u0000\u00af\u00b0\u0005&"+
		"\u0000\u0000\u00b0\u00b1\u0005\u000b\u0000\u0000\u00b1%\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b3\u0005\u0016\u0000\u0000\u00b3\u00b4\u0005\b\u0000\u0000"+
		"\u00b4\u00b5\u0005\u001a\u0000\u0000\u00b5\u00b6\u0005\u000b\u0000\u0000"+
		"\u00b6\'\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005\u0017\u0000\u0000\u00b8"+
		"\u00b9\u0005\b\u0000\u0000\u00b9\u00ba\u0005\u0019\u0000\u0000\u00ba\u00bb"+
		"\u0005\u000b\u0000\u0000\u00bb)\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005"+
		"\u0018\u0000\u0000\u00bd\u00be\u0005\b\u0000\u0000\u00be\u00bf\u0005\u001e"+
		"\u0000\u0000\u00bf\u00c0\u0005\u000b\u0000\u0000\u00c0+\u0001\u0000\u0000"+
		"\u0000\n/7AKWeq\u009f\u00a1\u00a8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}