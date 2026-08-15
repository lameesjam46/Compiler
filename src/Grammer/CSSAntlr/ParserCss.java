// Generated from C:/Users/DELL/IdeaProjects/untitled3/src/CSS_Antlr/ParserCss.g4 by ANTLR 4.13.2
package Grammer.CSSAntlr;

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
		RULE_selectorGroup = 4, RULE_selector = 5, RULE_simpleSelector = 6, RULE_modifier = 7, 
		RULE_elementName = 8, RULE_property = 9, RULE_box_atom = 10, RULE_box_value = 11, 
		RULE_size1_rule = 12, RULE_size2_rule = 13, RULE_textalign_rule = 14, 
		RULE_color_rule = 15, RULE_font_size_rule = 16, RULE_font_family = 17, 
		RULE_display_rule = 18, RULE_display_value = 19, RULE_border_rule = 20, 
		RULE_mediaRule = 21, RULE_opacity_rule = 22, RULE_position_rule = 23, 
		RULE_font_weight_rule = 24, RULE_background_rule = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"style", "statement", "importStatement", "rule", "selectorGroup", "selector", 
			"simpleSelector", "modifier", "elementName", "property", "box_atom", 
			"box_value", "size1_rule", "size2_rule", "textalign_rule", "color_rule", 
			"font_size_rule", "font_family", "display_rule", "display_value", "border_rule", 
			"mediaRule", "opacity_rule", "position_rule", "font_weight_rule", "background_rule"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'['", "']'", "'('", "')'", "','", "':'", "'.'", 
			"'#'", "';'", "'@import'", "'@media'", "'color'", "'font-family'", "'font-size'", 
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
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4260607570050L) != 0)) {
				{
				{
				setState(52);
				statement();
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
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
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
				setState(61);
				rule_();
				}
				break;
			case MEDIA:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
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
		public TerminalNode STRING() { return getToken(ParserCss.STRING, 0); }
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
			setState(65);
			match(IMPORT);
			setState(66);
			match(STRING);
			setState(67);
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
			setState(69);
			selectorGroup();
			setState(70);
			match(LKB);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6475726848L) != 0)) {
				{
				{
				setState(71);
				property();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
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
			setState(79);
			selector();
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(80);
				match(COMMA);
				setState(81);
				selector();
				}
				}
				setState(86);
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
			setState(87);
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
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
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
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STAR || _la==CSS_ELEMENT) {
				{
				setState(89);
				elementName();
				}
			}

			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 962072674304L) != 0)) {
				{
				{
				setState(92);
				modifier();
				}
				}
				setState(97);
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
	public static class ModifierContext extends ParserRuleContext {
		public TerminalNode CSS_ID() { return getToken(ParserCss.CSS_ID, 0); }
		public TerminalNode CSS_CLASS() { return getToken(ParserCss.CSS_CLASS, 0); }
		public TerminalNode CSS_PSEUDO() { return getToken(ParserCss.CSS_PSEUDO, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
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
		enterRule(_localctx, 16, RULE_elementName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
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
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
	 
		public PropertyContext() { }
		public void copyFrom(PropertyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FontFamilyPropertyContext extends PropertyContext {
		public Font_familyContext font_family() {
			return getRuleContext(Font_familyContext.class,0);
		}
		public FontFamilyPropertyContext(PropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterFontFamilyProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitFontFamilyProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitFontFamilyProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BorderPropertyContext extends PropertyContext {
		public Border_ruleContext border_rule() {
			return getRuleContext(Border_ruleContext.class,0);
		}
		public BorderPropertyContext(PropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterBorderProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitBorderProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitBorderProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Size2PropertyContext extends PropertyContext {
		public Size2_ruleContext size2_rule() {
			return getRuleContext(Size2_ruleContext.class,0);
		}
		public Size2PropertyContext(PropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterSize2Property(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitSize2Property(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitSize2Property(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TextAlignPropertyContext extends PropertyContext {
		public Textalign_ruleContext textalign_rule() {
			return getRuleContext(Textalign_ruleContext.class,0);
		}
		public TextAlignPropertyContext(PropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterTextAlignProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitTextAlignProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitTextAlignProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Size1PropertyContext extends PropertyContext {
		public Size1_ruleContext size1_rule() {
			return getRuleContext(Size1_ruleContext.class,0);
		}
		public Size1PropertyContext(PropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterSize1Property(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitSize1Property(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitSize1Property(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BackgroundPropertyContext extends PropertyContext {
		public Background_ruleContext background_rule() {
			return getRuleContext(Background_ruleContext.class,0);
		}
		public BackgroundPropertyContext(PropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterBackgroundProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitBackgroundProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitBackgroundProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DisplayPropertyContext extends PropertyContext {
		public Display_ruleContext display_rule() {
			return getRuleContext(Display_ruleContext.class,0);
		}
		public DisplayPropertyContext(PropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterDisplayProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitDisplayProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitDisplayProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OpacityPropertyContext extends PropertyContext {
		public Opacity_ruleContext opacity_rule() {
			return getRuleContext(Opacity_ruleContext.class,0);
		}
		public OpacityPropertyContext(PropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterOpacityProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitOpacityProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitOpacityProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PositionPropertyContext extends PropertyContext {
		public Position_ruleContext position_rule() {
			return getRuleContext(Position_ruleContext.class,0);
		}
		public PositionPropertyContext(PropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterPositionProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitPositionProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitPositionProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ColorPropertyContext extends PropertyContext {
		public Color_ruleContext color_rule() {
			return getRuleContext(Color_ruleContext.class,0);
		}
		public ColorPropertyContext(PropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterColorProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitColorProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitColorProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FontSizePropertyContext extends PropertyContext {
		public Font_size_ruleContext font_size_rule() {
			return getRuleContext(Font_size_ruleContext.class,0);
		}
		public FontSizePropertyContext(PropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterFontSizeProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitFontSizeProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitFontSizeProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FontWeightPropertyContext extends PropertyContext {
		public Font_weight_ruleContext font_weight_rule() {
			return getRuleContext(Font_weight_ruleContext.class,0);
		}
		public FontWeightPropertyContext(PropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterFontWeightProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitFontWeightProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitFontWeightProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_property);
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIZE_1:
				_localctx = new Size1PropertyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				size1_rule();
				}
				break;
			case SIZE_2:
				_localctx = new Size2PropertyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				size2_rule();
				}
				break;
			case TEXT_ALIGN:
				_localctx = new TextAlignPropertyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				textalign_rule();
				}
				break;
			case COLOR:
				_localctx = new ColorPropertyContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(105);
				color_rule();
				}
				break;
			case FONT_SIZE:
				_localctx = new FontSizePropertyContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(106);
				font_size_rule();
				}
				break;
			case FONT_FAMILY:
				_localctx = new FontFamilyPropertyContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(107);
				font_family();
				}
				break;
			case DISPLAY:
				_localctx = new DisplayPropertyContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(108);
				display_rule();
				}
				break;
			case OPACITY:
				_localctx = new OpacityPropertyContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(109);
				opacity_rule();
				}
				break;
			case BORDER:
				_localctx = new BorderPropertyContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(110);
				border_rule();
				}
				break;
			case POSITION:
				_localctx = new PositionPropertyContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(111);
				position_rule();
				}
				break;
			case FONT_WEIGHT:
				_localctx = new FontWeightPropertyContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(112);
				font_weight_rule();
				}
				break;
			case BACKGROUND_COLOR:
				_localctx = new BackgroundPropertyContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(113);
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
		enterRule(_localctx, 20, RULE_box_atom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
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
		enterRule(_localctx, 22, RULE_box_value);
		try {
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				box_atom();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				box_atom();
				setState(120);
				box_atom();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(122);
				box_atom();
				setState(123);
				box_atom();
				setState(124);
				box_atom();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(126);
				box_atom();
				setState(127);
				box_atom();
				setState(128);
				box_atom();
				setState(129);
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
		enterRule(_localctx, 24, RULE_size1_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(SIZE_1);
			setState(134);
			match(COLON);
			setState(135);
			_la = _input.LA(1);
			if ( !(_la==AUTO_KW || _la==VALUE_GENERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
		enterRule(_localctx, 26, RULE_size2_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(SIZE_2);
			setState(139);
			match(COLON);
			setState(140);
			box_value();
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
		enterRule(_localctx, 28, RULE_textalign_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(TEXT_ALIGN);
			setState(144);
			match(COLON);
			setState(145);
			match(VALUE_TEXT_ALIGN);
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
		enterRule(_localctx, 30, RULE_color_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(COLOR);
			setState(149);
			match(COLON);
			setState(150);
			match(COLOR_VALUE);
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
		enterRule(_localctx, 32, RULE_font_size_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(FONT_SIZE);
			setState(154);
			match(COLON);
			setState(155);
			_la = _input.LA(1);
			if ( !(_la==VALUE_FONT_SIZE || _la==VALUE_GENERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
		enterRule(_localctx, 34, RULE_font_family);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(FONT_FAMILY);
			setState(159);
			match(COLON);
			setState(160);
			match(CSS_ELEMENT);
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
		enterRule(_localctx, 36, RULE_display_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(DISPLAY);
			setState(164);
			match(COLON);
			setState(165);
			display_value();
			setState(166);
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
		enterRule(_localctx, 38, RULE_display_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
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
		enterRule(_localctx, 40, RULE_border_rule);
		int _la;
		try {
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				match(BORDER);
				setState(171);
				match(COLON);
				setState(172);
				match(NONE_KW);
				setState(173);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				match(BORDER);
				setState(175);
				match(COLON);
				setState(176);
				match(VALUE_GENERAL);
				setState(177);
				match(BORDER_STYLE);
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLOR_VALUE) {
					{
					setState(178);
					match(COLOR_VALUE);
					}
				}

				setState(181);
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
		enterRule(_localctx, 42, RULE_mediaRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(MEDIA);
			setState(185);
			match(LKB);
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4260607557762L) != 0)) {
				{
				{
				setState(186);
				rule_();
				}
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(192);
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
		enterRule(_localctx, 44, RULE_opacity_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(OPACITY);
			setState(195);
			match(COLON);
			setState(196);
			match(VALUE_GENERAL);
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
		enterRule(_localctx, 46, RULE_position_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(POSITION);
			setState(200);
			match(COLON);
			setState(201);
			match(VALUE_POSITION);
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
		enterRule(_localctx, 48, RULE_font_weight_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(FONT_WEIGHT);
			setState(205);
			match(COLON);
			setState(206);
			match(VALUE_FONT_WEIGHT);
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
		enterRule(_localctx, 50, RULE_background_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(BACKGROUND_COLOR);
			setState(210);
			match(COLON);
			setState(211);
			match(COLOR_VALUE);
			setState(212);
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
		"\u0004\u0001-\u00d7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0001\u0000\u0005\u00006\b\u0000\n\u0000\f\u0000"+
		"9\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001@\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003I\b\u0003\n\u0003\f\u0003"+
		"L\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004S\b\u0004\n\u0004\f\u0004V\t\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0003\u0006[\b\u0006\u0001\u0006\u0005\u0006^\b\u0006\n\u0006"+
		"\f\u0006a\t\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\ts\b\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0084"+
		"\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u00b4\b\u0014\u0001\u0014\u0003\u0014\u00b7"+
		"\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u00bc\b\u0015"+
		"\n\u0015\f\u0015\u00bf\t\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0000\u0000\u001a\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02\u0000\u0006"+
		"\u0001\u0000%\'\u0001\u0000()\u0001\u0000\"$\u0001\u0000#$\u0002\u0000"+
		"\u001a\u001a$$\u0002\u0000\u001b\u001b\"\"\u00d4\u00007\u0001\u0000\u0000"+
		"\u0000\u0002?\u0001\u0000\u0000\u0000\u0004A\u0001\u0000\u0000\u0000\u0006"+
		"E\u0001\u0000\u0000\u0000\bO\u0001\u0000\u0000\u0000\nW\u0001\u0000\u0000"+
		"\u0000\fZ\u0001\u0000\u0000\u0000\u000eb\u0001\u0000\u0000\u0000\u0010"+
		"d\u0001\u0000\u0000\u0000\u0012r\u0001\u0000\u0000\u0000\u0014t\u0001"+
		"\u0000\u0000\u0000\u0016\u0083\u0001\u0000\u0000\u0000\u0018\u0085\u0001"+
		"\u0000\u0000\u0000\u001a\u008a\u0001\u0000\u0000\u0000\u001c\u008f\u0001"+
		"\u0000\u0000\u0000\u001e\u0094\u0001\u0000\u0000\u0000 \u0099\u0001\u0000"+
		"\u0000\u0000\"\u009e\u0001\u0000\u0000\u0000$\u00a3\u0001\u0000\u0000"+
		"\u0000&\u00a8\u0001\u0000\u0000\u0000(\u00b6\u0001\u0000\u0000\u0000*"+
		"\u00b8\u0001\u0000\u0000\u0000,\u00c2\u0001\u0000\u0000\u0000.\u00c7\u0001"+
		"\u0000\u0000\u00000\u00cc\u0001\u0000\u0000\u00002\u00d1\u0001\u0000\u0000"+
		"\u000046\u0003\u0002\u0001\u000054\u0001\u0000\u0000\u000069\u0001\u0000"+
		"\u0000\u000075\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u00008:\u0001"+
		"\u0000\u0000\u000097\u0001\u0000\u0000\u0000:;\u0005\u0000\u0000\u0001"+
		";\u0001\u0001\u0000\u0000\u0000<@\u0003\u0004\u0002\u0000=@\u0003\u0006"+
		"\u0003\u0000>@\u0003*\u0015\u0000?<\u0001\u0000\u0000\u0000?=\u0001\u0000"+
		"\u0000\u0000?>\u0001\u0000\u0000\u0000@\u0003\u0001\u0000\u0000\u0000"+
		"AB\u0005\f\u0000\u0000BC\u0005+\u0000\u0000CD\u0005\u000b\u0000\u0000"+
		"D\u0005\u0001\u0000\u0000\u0000EF\u0003\b\u0004\u0000FJ\u0005\u0001\u0000"+
		"\u0000GI\u0003\u0012\t\u0000HG\u0001\u0000\u0000\u0000IL\u0001\u0000\u0000"+
		"\u0000JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KM\u0001\u0000"+
		"\u0000\u0000LJ\u0001\u0000\u0000\u0000MN\u0005\u0002\u0000\u0000N\u0007"+
		"\u0001\u0000\u0000\u0000OT\u0003\n\u0005\u0000PQ\u0005\u0007\u0000\u0000"+
		"QS\u0003\n\u0005\u0000RP\u0001\u0000\u0000\u0000SV\u0001\u0000\u0000\u0000"+
		"TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000U\t\u0001\u0000\u0000"+
		"\u0000VT\u0001\u0000\u0000\u0000WX\u0003\f\u0006\u0000X\u000b\u0001\u0000"+
		"\u0000\u0000Y[\u0003\u0010\b\u0000ZY\u0001\u0000\u0000\u0000Z[\u0001\u0000"+
		"\u0000\u0000[_\u0001\u0000\u0000\u0000\\^\u0003\u000e\u0007\u0000]\\\u0001"+
		"\u0000\u0000\u0000^a\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000"+
		"_`\u0001\u0000\u0000\u0000`\r\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000"+
		"\u0000bc\u0007\u0000\u0000\u0000c\u000f\u0001\u0000\u0000\u0000de\u0007"+
		"\u0001\u0000\u0000e\u0011\u0001\u0000\u0000\u0000fs\u0003\u0018\f\u0000"+
		"gs\u0003\u001a\r\u0000hs\u0003\u001c\u000e\u0000is\u0003\u001e\u000f\u0000"+
		"js\u0003 \u0010\u0000ks\u0003\"\u0011\u0000ls\u0003$\u0012\u0000ms\u0003"+
		",\u0016\u0000ns\u0003(\u0014\u0000os\u0003.\u0017\u0000ps\u00030\u0018"+
		"\u0000qs\u00032\u0019\u0000rf\u0001\u0000\u0000\u0000rg\u0001\u0000\u0000"+
		"\u0000rh\u0001\u0000\u0000\u0000ri\u0001\u0000\u0000\u0000rj\u0001\u0000"+
		"\u0000\u0000rk\u0001\u0000\u0000\u0000rl\u0001\u0000\u0000\u0000rm\u0001"+
		"\u0000\u0000\u0000rn\u0001\u0000\u0000\u0000ro\u0001\u0000\u0000\u0000"+
		"rp\u0001\u0000\u0000\u0000rq\u0001\u0000\u0000\u0000s\u0013\u0001\u0000"+
		"\u0000\u0000tu\u0007\u0002\u0000\u0000u\u0015\u0001\u0000\u0000\u0000"+
		"v\u0084\u0003\u0014\n\u0000wx\u0003\u0014\n\u0000xy\u0003\u0014\n\u0000"+
		"y\u0084\u0001\u0000\u0000\u0000z{\u0003\u0014\n\u0000{|\u0003\u0014\n"+
		"\u0000|}\u0003\u0014\n\u0000}\u0084\u0001\u0000\u0000\u0000~\u007f\u0003"+
		"\u0014\n\u0000\u007f\u0080\u0003\u0014\n\u0000\u0080\u0081\u0003\u0014"+
		"\n\u0000\u0081\u0082\u0003\u0014\n\u0000\u0082\u0084\u0001\u0000\u0000"+
		"\u0000\u0083v\u0001\u0000\u0000\u0000\u0083w\u0001\u0000\u0000\u0000\u0083"+
		"z\u0001\u0000\u0000\u0000\u0083~\u0001\u0000\u0000\u0000\u0084\u0017\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0005\u001f\u0000\u0000\u0086\u0087\u0005"+
		"\b\u0000\u0000\u0087\u0088\u0007\u0003\u0000\u0000\u0088\u0089\u0005\u000b"+
		"\u0000\u0000\u0089\u0019\u0001\u0000\u0000\u0000\u008a\u008b\u0005 \u0000"+
		"\u0000\u008b\u008c\u0005\b\u0000\u0000\u008c\u008d\u0003\u0016\u000b\u0000"+
		"\u008d\u008e\u0005\u000b\u0000\u0000\u008e\u001b\u0001\u0000\u0000\u0000"+
		"\u008f\u0090\u0005\u0011\u0000\u0000\u0090\u0091\u0005\b\u0000\u0000\u0091"+
		"\u0092\u0005\u001e\u0000\u0000\u0092\u0093\u0005\u000b\u0000\u0000\u0093"+
		"\u001d\u0001\u0000\u0000\u0000\u0094\u0095\u0005\u000e\u0000\u0000\u0095"+
		"\u0096\u0005\b\u0000\u0000\u0096\u0097\u0005!\u0000\u0000\u0097\u0098"+
		"\u0005\u000b\u0000\u0000\u0098\u001f\u0001\u0000\u0000\u0000\u0099\u009a"+
		"\u0005\u0010\u0000\u0000\u009a\u009b\u0005\b\u0000\u0000\u009b\u009c\u0007"+
		"\u0004\u0000\u0000\u009c\u009d\u0005\u000b\u0000\u0000\u009d!\u0001\u0000"+
		"\u0000\u0000\u009e\u009f\u0005\u000f\u0000\u0000\u009f\u00a0\u0005\b\u0000"+
		"\u0000\u00a0\u00a1\u0005)\u0000\u0000\u00a1\u00a2\u0005\u000b\u0000\u0000"+
		"\u00a2#\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005\u0015\u0000\u0000\u00a4"+
		"\u00a5\u0005\b\u0000\u0000\u00a5\u00a6\u0003&\u0013\u0000\u00a6\u00a7"+
		"\u0005\u000b\u0000\u0000\u00a7%\u0001\u0000\u0000\u0000\u00a8\u00a9\u0007"+
		"\u0005\u0000\u0000\u00a9\'\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005\u0014"+
		"\u0000\u0000\u00ab\u00ac\u0005\b\u0000\u0000\u00ac\u00ad\u0005\"\u0000"+
		"\u0000\u00ad\u00b7\u0005\u000b\u0000\u0000\u00ae\u00af\u0005\u0014\u0000"+
		"\u0000\u00af\u00b0\u0005\b\u0000\u0000\u00b0\u00b1\u0005$\u0000\u0000"+
		"\u00b1\u00b3\u0005\u001d\u0000\u0000\u00b2\u00b4\u0005!\u0000\u0000\u00b3"+
		"\u00b2\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b7\u0005\u000b\u0000\u0000\u00b6"+
		"\u00aa\u0001\u0000\u0000\u0000\u00b6\u00ae\u0001\u0000\u0000\u0000\u00b7"+
		")\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005\r\u0000\u0000\u00b9\u00bd"+
		"\u0005\u0001\u0000\u0000\u00ba\u00bc\u0003\u0006\u0003\u0000\u00bb\u00ba"+
		"\u0001\u0000\u0000\u0000\u00bc\u00bf\u0001\u0000\u0000\u0000\u00bd\u00bb"+
		"\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00c0"+
		"\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00c0\u00c1"+
		"\u0005\u0002\u0000\u0000\u00c1+\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005"+
		"\u0013\u0000\u0000\u00c3\u00c4\u0005\b\u0000\u0000\u00c4\u00c5\u0005$"+
		"\u0000\u0000\u00c5\u00c6\u0005\u000b\u0000\u0000\u00c6-\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c8\u0005\u0016\u0000\u0000\u00c8\u00c9\u0005\b\u0000\u0000"+
		"\u00c9\u00ca\u0005\u001c\u0000\u0000\u00ca\u00cb\u0005\u000b\u0000\u0000"+
		"\u00cb/\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005\u0017\u0000\u0000\u00cd"+
		"\u00ce\u0005\b\u0000\u0000\u00ce\u00cf\u0005\u0019\u0000\u0000\u00cf\u00d0"+
		"\u0005\u000b\u0000\u0000\u00d01\u0001\u0000\u0000\u0000\u00d1\u00d2\u0005"+
		"\u0018\u0000\u0000\u00d2\u00d3\u0005\b\u0000\u0000\u00d3\u00d4\u0005!"+
		"\u0000\u0000\u00d4\u00d5\u0005\u000b\u0000\u0000\u00d53\u0001\u0000\u0000"+
		"\u0000\u000b7?JTZ_r\u0083\u00b3\u00b6\u00bd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}