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
		FONT_WEIGHT=23, BACKGROUND_COLOR=24, VALUE_FONT_WEIGHT=25, VALUE_FONT_SIZE=26, 
		VALUE_DISPLAY=27, VALUE_POSITION=28, BORDER_STYLE=29, VALUE_TEXT_ALIGN=30, 
		SIZE_1=31, SIZE_2=32, COLOR_VALUE=33, NONE_KW=34, AUTO_KW=35, VALUE_GENERAL=36, 
		CSS_ID=37, CSS_CLASS=38, CSS_PSEUDO=39, STAR=40, CSS_ELEMENT=41, FLOAT=42, 
		STRING=43, CSS_COMMENT=44, WS=45;
	public static final int
		RULE_style = 0, RULE_statement = 1, RULE_importStatement = 2, RULE_rule = 3, 
		RULE_selectorGroup = 4, RULE_selector = 5, RULE_simpleSelector = 6, RULE_elementName = 7, 
		RULE_property = 8, RULE_box_atom = 9, RULE_box_value = 10, RULE_size1_rule = 11, 
		RULE_size2_rule = 12, RULE_textalign_rule = 13, RULE_color_rule = 14, 
		RULE_font_size_rule = 15, RULE_font_family = 16, RULE_display_rule = 17, 
		RULE_display_value = 18, RULE_border_rule = 19, RULE_mediaRule = 20, RULE_opacity_rule = 21, 
		RULE_position_rule = 22, RULE_font_weight_rule = 23, RULE_background_rule = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"style", "statement", "importStatement", "rule", "selectorGroup", "selector", 
			"simpleSelector", "elementName", "property", "box_atom", "box_value", 
			"size1_rule", "size2_rule", "textalign_rule", "color_rule", "font_size_rule", 
			"font_family", "display_rule", "display_value", "border_rule", "mediaRule", 
			"opacity_rule", "position_rule", "font_weight_rule", "background_rule"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'['", "']'", "'('", "')'", "','", "':'", "'.'", 
			"'#'", "';'", "'import'", "'@media'", "'color'", "'font-family'", "'font-size'", 
			"'text-align'", "'background'", "'opacity'", "'border'", "'display'", 
			"'position'", "'font-weight'", "'background-color'", null, null, null, 
			null, null, null, null, null, null, "'none'", "'auto'", null, null, null, 
			null, "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LKB", "RKB", "LSB", "RSB", "LP", "RP", "COMMA", "COLON", "DOT", 
			"HASH", "SEMICOLON", "IMPORT", "MEDIA", "COLOR", "FONT_FAMILY", "FONT_SIZE", 
			"TEXT_ALIGN", "BAK_GROUND", "OPACITY", "BORDER", "DISPLAY", "POSITION", 
			"FONT_WEIGHT", "BACKGROUND_COLOR", "VALUE_FONT_WEIGHT", "VALUE_FONT_SIZE", 
			"VALUE_DISPLAY", "VALUE_POSITION", "BORDER_STYLE", "VALUE_TEXT_ALIGN", 
			"SIZE_1", "SIZE_2", "COLOR_VALUE", "NONE_KW", "AUTO_KW", "VALUE_GENERAL", 
			"CSS_ID", "CSS_CLASS", "CSS_PSEUDO", "STAR", "CSS_ELEMENT", "FLOAT", 
			"STRING", "CSS_COMMENT", "WS"
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
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4260607570050L) != 0)) {
				{
				{
				setState(50);
				statement();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
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
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				importStatement();
				}
				break;
			case LKB:
			case COMMA:
			case CSS_ID:
			case CSS_CLASS:
			case CSS_PSEUDO:
			case STAR:
			case CSS_ELEMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				rule_();
				}
				break;
			case MEDIA:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
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
			setState(63);
			match(IMPORT);
			setState(64);
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
		public SelectorGroupContext selectorGroup() {
			return getRuleContext(SelectorGroupContext.class,0);
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
			setState(66);
			selectorGroup();
			setState(67);
			match(LKB);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6475726848L) != 0)) {
				{
				{
				setState(68);
				property();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
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
	public static class SelectorGroupContext extends ParserRuleContext {
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ParserCss.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserCss.COMMA, i);
		}
		public SelectorGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterSelectorGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitSelectorGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitSelectorGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorGroupContext selectorGroup() throws RecognitionException {
		SelectorGroupContext _localctx = new SelectorGroupContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_selectorGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			selector();
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(77);
				match(COMMA);
				setState(78);
				selector();
				}
				}
				setState(83);
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
	public static class SelectorContext extends ParserRuleContext {
		public SimpleSelectorContext simpleSelector() {
			return getRuleContext(SimpleSelectorContext.class,0);
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
		enterRule(_localctx, 10, RULE_selector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			simpleSelector();
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
		public ElementNameContext elementName() {
			return getRuleContext(ElementNameContext.class,0);
		}
		public List<TerminalNode> CSS_ID() { return getTokens(ParserCss.CSS_ID); }
		public TerminalNode CSS_ID(int i) {
			return getToken(ParserCss.CSS_ID, i);
		}
		public List<TerminalNode> CSS_CLASS() { return getTokens(ParserCss.CSS_CLASS); }
		public TerminalNode CSS_CLASS(int i) {
			return getToken(ParserCss.CSS_CLASS, i);
		}
		public List<TerminalNode> CSS_PSEUDO() { return getTokens(ParserCss.CSS_PSEUDO); }
		public TerminalNode CSS_PSEUDO(int i) {
			return getToken(ParserCss.CSS_PSEUDO, i);
		}
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
		enterRule(_localctx, 12, RULE_simpleSelector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STAR || _la==CSS_ELEMENT) {
				{
				setState(86);
				elementName();
				}
			}

			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 962072674304L) != 0)) {
				{
				{
				setState(89);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 962072674304L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(94);
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
	public static class ElementNameContext extends ParserRuleContext {
		public TerminalNode CSS_ELEMENT() { return getToken(ParserCss.CSS_ELEMENT, 0); }
		public TerminalNode STAR() { return getToken(ParserCss.STAR, 0); }
		public ElementNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterElementName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitElementName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitElementName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementNameContext elementName() throws RecognitionException {
		ElementNameContext _localctx = new ElementNameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_elementName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_la = _input.LA(1);
			if ( !(_la==STAR || _la==CSS_ELEMENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
		enterRule(_localctx, 16, RULE_property);
		try {
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIZE_1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				size1_rule();
				}
				break;
			case SIZE_2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				size2_rule();
				}
				break;
			case TEXT_ALIGN:
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				textalign_rule();
				}
				break;
			case COLOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(100);
				color_rule();
				}
				break;
			case FONT_SIZE:
				enterOuterAlt(_localctx, 5);
				{
				setState(101);
				font_size_rule();
				}
				break;
			case FONT_FAMILY:
				enterOuterAlt(_localctx, 6);
				{
				setState(102);
				font_family();
				}
				break;
			case DISPLAY:
				enterOuterAlt(_localctx, 7);
				{
				setState(103);
				display_rule();
				}
				break;
			case OPACITY:
				enterOuterAlt(_localctx, 8);
				{
				setState(104);
				opacity_rule();
				}
				break;
			case BORDER:
				enterOuterAlt(_localctx, 9);
				{
				setState(105);
				border_rule();
				}
				break;
			case POSITION:
				enterOuterAlt(_localctx, 10);
				{
				setState(106);
				position_rule();
				}
				break;
			case FONT_WEIGHT:
				enterOuterAlt(_localctx, 11);
				{
				setState(107);
				font_weight_rule();
				}
				break;
			case BACKGROUND_COLOR:
				enterOuterAlt(_localctx, 12);
				{
				setState(108);
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
	public static class Box_atomContext extends ParserRuleContext {
		public TerminalNode VALUE_GENERAL() { return getToken(ParserCss.VALUE_GENERAL, 0); }
		public TerminalNode AUTO_KW() { return getToken(ParserCss.AUTO_KW, 0); }
		public TerminalNode NONE_KW() { return getToken(ParserCss.NONE_KW, 0); }
		public Box_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_box_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterBox_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitBox_atom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitBox_atom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Box_atomContext box_atom() throws RecognitionException {
		Box_atomContext _localctx = new Box_atomContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_box_atom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 120259084288L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class Box_valueContext extends ParserRuleContext {
		public List<Box_atomContext> box_atom() {
			return getRuleContexts(Box_atomContext.class);
		}
		public Box_atomContext box_atom(int i) {
			return getRuleContext(Box_atomContext.class,i);
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
		enterRule(_localctx, 20, RULE_box_value);
		try {
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				box_atom();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				box_atom();
				setState(115);
				box_atom();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				box_atom();
				setState(118);
				box_atom();
				setState(119);
				box_atom();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(121);
				box_atom();
				setState(122);
				box_atom();
				setState(123);
				box_atom();
				setState(124);
				box_atom();
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
		enterRule(_localctx, 22, RULE_size1_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(SIZE_1);
			setState(129);
			match(COLON);
			setState(130);
			_la = _input.LA(1);
			if ( !(_la==AUTO_KW || _la==VALUE_GENERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(131);
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
		enterRule(_localctx, 24, RULE_size2_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(SIZE_2);
			setState(134);
			match(COLON);
			setState(135);
			box_value();
			setState(136);
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
		enterRule(_localctx, 26, RULE_textalign_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(TEXT_ALIGN);
			setState(139);
			match(COLON);
			setState(140);
			match(VALUE_TEXT_ALIGN);
			setState(141);
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
		enterRule(_localctx, 28, RULE_color_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(COLOR);
			setState(144);
			match(COLON);
			setState(145);
			match(COLOR_VALUE);
			setState(146);
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
		public TerminalNode SEMICOLON() { return getToken(ParserCss.SEMICOLON, 0); }
		public TerminalNode VALUE_GENERAL() { return getToken(ParserCss.VALUE_GENERAL, 0); }
		public TerminalNode VALUE_FONT_SIZE() { return getToken(ParserCss.VALUE_FONT_SIZE, 0); }
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
		enterRule(_localctx, 30, RULE_font_size_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(FONT_SIZE);
			setState(149);
			match(COLON);
			setState(150);
			_la = _input.LA(1);
			if ( !(_la==VALUE_FONT_SIZE || _la==VALUE_GENERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(151);
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
		public TerminalNode CSS_ELEMENT() { return getToken(ParserCss.CSS_ELEMENT, 0); }
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
		enterRule(_localctx, 32, RULE_font_family);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(FONT_FAMILY);
			setState(154);
			match(COLON);
			setState(155);
			match(CSS_ELEMENT);
			setState(156);
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
		public Display_valueContext display_value() {
			return getRuleContext(Display_valueContext.class,0);
		}
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
		enterRule(_localctx, 34, RULE_display_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(DISPLAY);
			setState(159);
			match(COLON);
			setState(160);
			display_value();
			setState(161);
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
	public static class Display_valueContext extends ParserRuleContext {
		public TerminalNode VALUE_DISPLAY() { return getToken(ParserCss.VALUE_DISPLAY, 0); }
		public TerminalNode NONE_KW() { return getToken(ParserCss.NONE_KW, 0); }
		public Display_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_display_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterDisplay_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitDisplay_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitDisplay_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Display_valueContext display_value() throws RecognitionException {
		Display_valueContext _localctx = new Display_valueContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_display_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_la = _input.LA(1);
			if ( !(_la==VALUE_DISPLAY || _la==NONE_KW) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class Border_ruleContext extends ParserRuleContext {
		public TerminalNode BORDER() { return getToken(ParserCss.BORDER, 0); }
		public TerminalNode COLON() { return getToken(ParserCss.COLON, 0); }
		public TerminalNode NONE_KW() { return getToken(ParserCss.NONE_KW, 0); }
		public TerminalNode SEMICOLON() { return getToken(ParserCss.SEMICOLON, 0); }
		public TerminalNode VALUE_GENERAL() { return getToken(ParserCss.VALUE_GENERAL, 0); }
		public TerminalNode BORDER_STYLE() { return getToken(ParserCss.BORDER_STYLE, 0); }
		public TerminalNode COLOR_VALUE() { return getToken(ParserCss.COLOR_VALUE, 0); }
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
		enterRule(_localctx, 38, RULE_border_rule);
		int _la;
		try {
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				match(BORDER);
				setState(166);
				match(COLON);
				setState(167);
				match(NONE_KW);
				setState(168);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				match(BORDER);
				setState(170);
				match(COLON);
				setState(171);
				match(VALUE_GENERAL);
				setState(172);
				match(BORDER_STYLE);
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLOR_VALUE) {
					{
					setState(173);
					match(COLOR_VALUE);
					}
				}

				setState(176);
				match(SEMICOLON);
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
		enterRule(_localctx, 40, RULE_mediaRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(MEDIA);
			setState(180);
			match(LKB);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4260607557762L) != 0)) {
				{
				{
				setState(181);
				rule_();
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(187);
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
		enterRule(_localctx, 42, RULE_opacity_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(OPACITY);
			setState(190);
			match(COLON);
			setState(191);
			match(VALUE_GENERAL);
			setState(192);
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
		enterRule(_localctx, 44, RULE_position_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(POSITION);
			setState(195);
			match(COLON);
			setState(196);
			match(VALUE_POSITION);
			setState(197);
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
		enterRule(_localctx, 46, RULE_font_weight_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(FONT_WEIGHT);
			setState(200);
			match(COLON);
			setState(201);
			match(VALUE_FONT_WEIGHT);
			setState(202);
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
		enterRule(_localctx, 48, RULE_background_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(BACKGROUND_COLOR);
			setState(205);
			match(COLON);
			setState(206);
			match(COLOR_VALUE);
			setState(207);
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
		"\u0004\u0001-\u00d2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0001\u0000\u0005\u00004\b\u0000\n\u0000\f\u00007\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001>\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003F\b\u0003\n\u0003\f\u0003I\t\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004P\b\u0004\n\u0004\f\u0004"+
		"S\t\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0003\u0006X\b\u0006\u0001"+
		"\u0006\u0005\u0006[\b\u0006\n\u0006\f\u0006^\t\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bn\b\b\u0001\t\u0001\t\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u007f\b\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00af"+
		"\b\u0013\u0001\u0013\u0003\u0013\u00b2\b\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0005\u0014\u00b7\b\u0014\n\u0014\f\u0014\u00ba\t\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0000\u0000\u0019"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.0\u0000\u0006\u0001\u0000%\'\u0001\u0000()\u0001"+
		"\u0000\"$\u0001\u0000#$\u0002\u0000\u001a\u001a$$\u0002\u0000\u001b\u001b"+
		"\"\"\u00d0\u00005\u0001\u0000\u0000\u0000\u0002=\u0001\u0000\u0000\u0000"+
		"\u0004?\u0001\u0000\u0000\u0000\u0006B\u0001\u0000\u0000\u0000\bL\u0001"+
		"\u0000\u0000\u0000\nT\u0001\u0000\u0000\u0000\fW\u0001\u0000\u0000\u0000"+
		"\u000e_\u0001\u0000\u0000\u0000\u0010m\u0001\u0000\u0000\u0000\u0012o"+
		"\u0001\u0000\u0000\u0000\u0014~\u0001\u0000\u0000\u0000\u0016\u0080\u0001"+
		"\u0000\u0000\u0000\u0018\u0085\u0001\u0000\u0000\u0000\u001a\u008a\u0001"+
		"\u0000\u0000\u0000\u001c\u008f\u0001\u0000\u0000\u0000\u001e\u0094\u0001"+
		"\u0000\u0000\u0000 \u0099\u0001\u0000\u0000\u0000\"\u009e\u0001\u0000"+
		"\u0000\u0000$\u00a3\u0001\u0000\u0000\u0000&\u00b1\u0001\u0000\u0000\u0000"+
		"(\u00b3\u0001\u0000\u0000\u0000*\u00bd\u0001\u0000\u0000\u0000,\u00c2"+
		"\u0001\u0000\u0000\u0000.\u00c7\u0001\u0000\u0000\u00000\u00cc\u0001\u0000"+
		"\u0000\u000024\u0003\u0002\u0001\u000032\u0001\u0000\u0000\u000047\u0001"+
		"\u0000\u0000\u000053\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u0000"+
		"68\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u000089\u0005\u0000\u0000"+
		"\u00019\u0001\u0001\u0000\u0000\u0000:>\u0003\u0004\u0002\u0000;>\u0003"+
		"\u0006\u0003\u0000<>\u0003(\u0014\u0000=:\u0001\u0000\u0000\u0000=;\u0001"+
		"\u0000\u0000\u0000=<\u0001\u0000\u0000\u0000>\u0003\u0001\u0000\u0000"+
		"\u0000?@\u0005\f\u0000\u0000@A\u0005\u000b\u0000\u0000A\u0005\u0001\u0000"+
		"\u0000\u0000BC\u0003\b\u0004\u0000CG\u0005\u0001\u0000\u0000DF\u0003\u0010"+
		"\b\u0000ED\u0001\u0000\u0000\u0000FI\u0001\u0000\u0000\u0000GE\u0001\u0000"+
		"\u0000\u0000GH\u0001\u0000\u0000\u0000HJ\u0001\u0000\u0000\u0000IG\u0001"+
		"\u0000\u0000\u0000JK\u0005\u0002\u0000\u0000K\u0007\u0001\u0000\u0000"+
		"\u0000LQ\u0003\n\u0005\u0000MN\u0005\u0007\u0000\u0000NP\u0003\n\u0005"+
		"\u0000OM\u0001\u0000\u0000\u0000PS\u0001\u0000\u0000\u0000QO\u0001\u0000"+
		"\u0000\u0000QR\u0001\u0000\u0000\u0000R\t\u0001\u0000\u0000\u0000SQ\u0001"+
		"\u0000\u0000\u0000TU\u0003\f\u0006\u0000U\u000b\u0001\u0000\u0000\u0000"+
		"VX\u0003\u000e\u0007\u0000WV\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000"+
		"\u0000X\\\u0001\u0000\u0000\u0000Y[\u0007\u0000\u0000\u0000ZY\u0001\u0000"+
		"\u0000\u0000[^\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001"+
		"\u0000\u0000\u0000]\r\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000"+
		"_`\u0007\u0001\u0000\u0000`\u000f\u0001\u0000\u0000\u0000an\u0003\u0016"+
		"\u000b\u0000bn\u0003\u0018\f\u0000cn\u0003\u001a\r\u0000dn\u0003\u001c"+
		"\u000e\u0000en\u0003\u001e\u000f\u0000fn\u0003 \u0010\u0000gn\u0003\""+
		"\u0011\u0000hn\u0003*\u0015\u0000in\u0003&\u0013\u0000jn\u0003,\u0016"+
		"\u0000kn\u0003.\u0017\u0000ln\u00030\u0018\u0000ma\u0001\u0000\u0000\u0000"+
		"mb\u0001\u0000\u0000\u0000mc\u0001\u0000\u0000\u0000md\u0001\u0000\u0000"+
		"\u0000me\u0001\u0000\u0000\u0000mf\u0001\u0000\u0000\u0000mg\u0001\u0000"+
		"\u0000\u0000mh\u0001\u0000\u0000\u0000mi\u0001\u0000\u0000\u0000mj\u0001"+
		"\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000ml\u0001\u0000\u0000\u0000"+
		"n\u0011\u0001\u0000\u0000\u0000op\u0007\u0002\u0000\u0000p\u0013\u0001"+
		"\u0000\u0000\u0000q\u007f\u0003\u0012\t\u0000rs\u0003\u0012\t\u0000st"+
		"\u0003\u0012\t\u0000t\u007f\u0001\u0000\u0000\u0000uv\u0003\u0012\t\u0000"+
		"vw\u0003\u0012\t\u0000wx\u0003\u0012\t\u0000x\u007f\u0001\u0000\u0000"+
		"\u0000yz\u0003\u0012\t\u0000z{\u0003\u0012\t\u0000{|\u0003\u0012\t\u0000"+
		"|}\u0003\u0012\t\u0000}\u007f\u0001\u0000\u0000\u0000~q\u0001\u0000\u0000"+
		"\u0000~r\u0001\u0000\u0000\u0000~u\u0001\u0000\u0000\u0000~y\u0001\u0000"+
		"\u0000\u0000\u007f\u0015\u0001\u0000\u0000\u0000\u0080\u0081\u0005\u001f"+
		"\u0000\u0000\u0081\u0082\u0005\b\u0000\u0000\u0082\u0083\u0007\u0003\u0000"+
		"\u0000\u0083\u0084\u0005\u000b\u0000\u0000\u0084\u0017\u0001\u0000\u0000"+
		"\u0000\u0085\u0086\u0005 \u0000\u0000\u0086\u0087\u0005\b\u0000\u0000"+
		"\u0087\u0088\u0003\u0014\n\u0000\u0088\u0089\u0005\u000b\u0000\u0000\u0089"+
		"\u0019\u0001\u0000\u0000\u0000\u008a\u008b\u0005\u0011\u0000\u0000\u008b"+
		"\u008c\u0005\b\u0000\u0000\u008c\u008d\u0005\u001e\u0000\u0000\u008d\u008e"+
		"\u0005\u000b\u0000\u0000\u008e\u001b\u0001\u0000\u0000\u0000\u008f\u0090"+
		"\u0005\u000e\u0000\u0000\u0090\u0091\u0005\b\u0000\u0000\u0091\u0092\u0005"+
		"!\u0000\u0000\u0092\u0093\u0005\u000b\u0000\u0000\u0093\u001d\u0001\u0000"+
		"\u0000\u0000\u0094\u0095\u0005\u0010\u0000\u0000\u0095\u0096\u0005\b\u0000"+
		"\u0000\u0096\u0097\u0007\u0004\u0000\u0000\u0097\u0098\u0005\u000b\u0000"+
		"\u0000\u0098\u001f\u0001\u0000\u0000\u0000\u0099\u009a\u0005\u000f\u0000"+
		"\u0000\u009a\u009b\u0005\b\u0000\u0000\u009b\u009c\u0005)\u0000\u0000"+
		"\u009c\u009d\u0005\u000b\u0000\u0000\u009d!\u0001\u0000\u0000\u0000\u009e"+
		"\u009f\u0005\u0015\u0000\u0000\u009f\u00a0\u0005\b\u0000\u0000\u00a0\u00a1"+
		"\u0003$\u0012\u0000\u00a1\u00a2\u0005\u000b\u0000\u0000\u00a2#\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a4\u0007\u0005\u0000\u0000\u00a4%\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a6\u0005\u0014\u0000\u0000\u00a6\u00a7\u0005\b\u0000\u0000"+
		"\u00a7\u00a8\u0005\"\u0000\u0000\u00a8\u00b2\u0005\u000b\u0000\u0000\u00a9"+
		"\u00aa\u0005\u0014\u0000\u0000\u00aa\u00ab\u0005\b\u0000\u0000\u00ab\u00ac"+
		"\u0005$\u0000\u0000\u00ac\u00ae\u0005\u001d\u0000\u0000\u00ad\u00af\u0005"+
		"!\u0000\u0000\u00ae\u00ad\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000"+
		"\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b2\u0005\u000b"+
		"\u0000\u0000\u00b1\u00a5\u0001\u0000\u0000\u0000\u00b1\u00a9\u0001\u0000"+
		"\u0000\u0000\u00b2\'\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005\r\u0000"+
		"\u0000\u00b4\u00b8\u0005\u0001\u0000\u0000\u00b5\u00b7\u0003\u0006\u0003"+
		"\u0000\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b7\u00ba\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000"+
		"\u0000\u00b9\u00bb\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000"+
		"\u0000\u00bb\u00bc\u0005\u0002\u0000\u0000\u00bc)\u0001\u0000\u0000\u0000"+
		"\u00bd\u00be\u0005\u0013\u0000\u0000\u00be\u00bf\u0005\b\u0000\u0000\u00bf"+
		"\u00c0\u0005$\u0000\u0000\u00c0\u00c1\u0005\u000b\u0000\u0000\u00c1+\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c3\u0005\u0016\u0000\u0000\u00c3\u00c4\u0005"+
		"\b\u0000\u0000\u00c4\u00c5\u0005\u001c\u0000\u0000\u00c5\u00c6\u0005\u000b"+
		"\u0000\u0000\u00c6-\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005\u0017\u0000"+
		"\u0000\u00c8\u00c9\u0005\b\u0000\u0000\u00c9\u00ca\u0005\u0019\u0000\u0000"+
		"\u00ca\u00cb\u0005\u000b\u0000\u0000\u00cb/\u0001\u0000\u0000\u0000\u00cc"+
		"\u00cd\u0005\u0018\u0000\u0000\u00cd\u00ce\u0005\b\u0000\u0000\u00ce\u00cf"+
		"\u0005!\u0000\u0000\u00cf\u00d0\u0005\u000b\u0000\u0000\u00d01\u0001\u0000"+
		"\u0000\u0000\u000b5=GQW\\m~\u00ae\u00b1\u00b8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}