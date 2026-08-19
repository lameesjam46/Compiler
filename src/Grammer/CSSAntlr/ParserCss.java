// Generated from D:/compiler_2/Compiler/src/Grammer/CSSAntlr/ParserCss.g4 by ANTLR 4.13.2
package Grammer.CSSAntlr;
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
		LKB=1, RKB=2, LSB=3, RSB=4, LP=5, RP=6, COMMA=7, COLON=8, DOT=9, SEMICOLON=10, 
		IMPORT=11, MEDIA=12, STAR=13, BACKGROUND_COLOR=14, BAK_GROUND=15, BORDER_COLLAPSE=16, 
		BORDER_TOP=17, BORDER_RIGHT=18, BORDER_BOTTOM=19, BORDER_LEFT=20, BORDER_RADIUS=21, 
		BORDER=22, COLOR=23, FONT_FAMILY=24, FONT_SIZE=25, FONT_WEIGHT=26, TEXT_ALIGN=27, 
		TEXT_DECORATION=28, OPACITY=29, DISPLAY=30, POSITION=31, BOX_SIZING=32, 
		BOX_SHADOW=33, LINE_HEIGHT=34, MAX_WIDTH=35, MIN_WIDTH=36, CURSOR=37, 
		OVERFLOW=38, GAP=39, JUSTIFY_CONTENT=40, ALIGN_ITEMS=41, FLEX_WRAP=42, 
		FLEX_DIRECTION=43, MARGIN_TOP=44, MARGIN_RIGHT=45, MARGIN_BOTTOM=46, MARGIN_LEFT=47, 
		PADDING_TOP=48, PADDING_RIGHT=49, PADDING_BOTTOM=50, PADDING_LEFT=51, 
		SIZE_1=52, SIZE_2=53, BORDER_COLLAPSE_VALUE=54, BOX_SIZING_VALUE=55, VALUE_FONT_WEIGHT=56, 
		VALUE_FONT_SIZE=57, VALUE_DISPLAY=58, VALUE_POSITION=59, BORDER_STYLE=60, 
		VALUE_TEXT_ALIGN=61, FLEX_ALIGN_VALUE=62, FLEX_WRAP_VALUE=63, FLEX_DIRECTION_VALUE=64, 
		TEXT_DECORATION_VALUE=65, CURSOR_VALUE=66, OVERFLOW_EXTRA_VALUE=67, NONE_KW=68, 
		AUTO_KW=69, COLOR_VALUE=70, FLOAT=71, VALUE_GENERAL=72, STRING=73, CSS_ID=74, 
		CSS_CLASS=75, CSS_PSEUDO=76, CSS_ELEMENT=77, CSS_COMMENT=78, WS=79;
	public static final int
		RULE_style = 0, RULE_statement = 1, RULE_importStatement = 2, RULE_rule = 3, 
		RULE_selectorGroup = 4, RULE_selector = 5, RULE_simpleSelector = 6, RULE_modifier = 7, 
		RULE_elementName = 8, RULE_property = 9, RULE_box_atom = 10, RULE_box_value = 11, 
		RULE_size1_rule = 12, RULE_size2_rule = 13, RULE_textalign_rule = 14, 
		RULE_color_rule = 15, RULE_font_size_rule = 16, RULE_font_family = 17, 
		RULE_fontFamilyItem = 18, RULE_display_rule = 19, RULE_display_value = 20, 
		RULE_border_rule = 21, RULE_border_collapse_rule = 22, RULE_border_side_rule = 23, 
		RULE_opacity_rule = 24, RULE_position_rule = 25, RULE_font_weight_rule = 26, 
		RULE_background_rule = 27, RULE_background_shorthand_rule = 28, RULE_box_sizing_rule = 29, 
		RULE_line_height_rule = 30, RULE_max_width_rule = 31, RULE_min_width_rule = 32, 
		RULE_border_radius_rule = 33, RULE_box_shadow_rule = 34, RULE_cursor_rule = 35, 
		RULE_overflow_rule = 36, RULE_gap_rule = 37, RULE_text_decoration_rule = 38, 
		RULE_justify_content_rule = 39, RULE_align_items_rule = 40, RULE_flex_wrap_rule = 41, 
		RULE_flex_direction_rule = 42, RULE_margin_side_rule = 43, RULE_padding_side_rule = 44, 
		RULE_mediaRule = 45;
	private static String[] makeRuleNames() {
		return new String[] {
			"style", "statement", "importStatement", "rule", "selectorGroup", "selector", 
			"simpleSelector", "modifier", "elementName", "property", "box_atom", 
			"box_value", "size1_rule", "size2_rule", "textalign_rule", "color_rule", 
			"font_size_rule", "font_family", "fontFamilyItem", "display_rule", "display_value", 
			"border_rule", "border_collapse_rule", "border_side_rule", "opacity_rule", 
			"position_rule", "font_weight_rule", "background_rule", "background_shorthand_rule", 
			"box_sizing_rule", "line_height_rule", "max_width_rule", "min_width_rule", 
			"border_radius_rule", "box_shadow_rule", "cursor_rule", "overflow_rule", 
			"gap_rule", "text_decoration_rule", "justify_content_rule", "align_items_rule", 
			"flex_wrap_rule", "flex_direction_rule", "margin_side_rule", "padding_side_rule", 
			"mediaRule"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'['", "']'", "'('", "')'", "','", "':'", "'.'", 
			"';'", "'@import'", "'@media'", "'*'", "'background-color'", "'background'", 
			"'border-collapse'", "'border-top'", "'border-right'", "'border-bottom'", 
			"'border-left'", "'border-radius'", "'border'", "'color'", "'font-family'", 
			"'font-size'", "'font-weight'", "'text-align'", "'text-decoration'", 
			"'opacity'", "'display'", "'position'", "'box-sizing'", "'box-shadow'", 
			"'line-height'", "'max-width'", "'min-width'", "'cursor'", "'overflow'", 
			"'gap'", "'justify-content'", "'align-items'", "'flex-wrap'", "'flex-direction'", 
			"'margin-top'", "'margin-right'", "'margin-bottom'", "'margin-left'", 
			"'padding-top'", "'padding-right'", "'padding-bottom'", "'padding-left'", 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "'none'", "'auto'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LKB", "RKB", "LSB", "RSB", "LP", "RP", "COMMA", "COLON", "DOT", 
			"SEMICOLON", "IMPORT", "MEDIA", "STAR", "BACKGROUND_COLOR", "BAK_GROUND", 
			"BORDER_COLLAPSE", "BORDER_TOP", "BORDER_RIGHT", "BORDER_BOTTOM", "BORDER_LEFT", 
			"BORDER_RADIUS", "BORDER", "COLOR", "FONT_FAMILY", "FONT_SIZE", "FONT_WEIGHT", 
			"TEXT_ALIGN", "TEXT_DECORATION", "OPACITY", "DISPLAY", "POSITION", "BOX_SIZING", 
			"BOX_SHADOW", "LINE_HEIGHT", "MAX_WIDTH", "MIN_WIDTH", "CURSOR", "OVERFLOW", 
			"GAP", "JUSTIFY_CONTENT", "ALIGN_ITEMS", "FLEX_WRAP", "FLEX_DIRECTION", 
			"MARGIN_TOP", "MARGIN_RIGHT", "MARGIN_BOTTOM", "MARGIN_LEFT", "PADDING_TOP", 
			"PADDING_RIGHT", "PADDING_BOTTOM", "PADDING_LEFT", "SIZE_1", "SIZE_2", 
			"BORDER_COLLAPSE_VALUE", "BOX_SIZING_VALUE", "VALUE_FONT_WEIGHT", "VALUE_FONT_SIZE", 
			"VALUE_DISPLAY", "VALUE_POSITION", "BORDER_STYLE", "VALUE_TEXT_ALIGN", 
			"FLEX_ALIGN_VALUE", "FLEX_WRAP_VALUE", "FLEX_DIRECTION_VALUE", "TEXT_DECORATION_VALUE", 
			"CURSOR_VALUE", "OVERFLOW_EXTRA_VALUE", "NONE_KW", "AUTO_KW", "COLOR_VALUE", 
			"FLOAT", "VALUE_GENERAL", "STRING", "CSS_ID", "CSS_CLASS", "CSS_PSEUDO", 
			"CSS_ELEMENT", "CSS_COMMENT", "WS"
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
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14336L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 15L) != 0)) {
				{
				{
				setState(92);
				statement();
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
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
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				importStatement();
				}
				break;
			case STAR:
			case CSS_ID:
			case CSS_CLASS:
			case CSS_PSEUDO:
			case CSS_ELEMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				rule_();
				}
				break;
			case MEDIA:
				enterOuterAlt(_localctx, 3);
				{
				setState(102);
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
			setState(105);
			match(IMPORT);
			setState(106);
			match(STRING);
			setState(107);
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
			setState(109);
			selectorGroup();
			setState(110);
			match(LKB);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 18014398509465600L) != 0)) {
				{
				{
				setState(111);
				property();
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
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
			setState(119);
			selector();
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(120);
				match(COMMA);
				setState(121);
				selector();
				}
				}
				setState(126);
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
		public List<SimpleSelectorContext> simpleSelector() {
			return getRuleContexts(SimpleSelectorContext.class);
		}
		public SimpleSelectorContext simpleSelector(int i) {
			return getRuleContext(SimpleSelectorContext.class,i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(127);
				simpleSelector();
				}
				}
				setState(130); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STAR || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 15L) != 0) );
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
		try {
			int _alt;
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
			case CSS_ELEMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				elementName();
				setState(136);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(133);
						modifier();
						}
						} 
					}
					setState(138);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				}
				break;
			case CSS_ID:
			case CSS_CLASS:
			case CSS_PSEUDO:
				enterOuterAlt(_localctx, 2);
				{
				setState(140); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(139);
						modifier();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(142); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
			setState(146);
			_la = _input.LA(1);
			if ( !(((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 7L) != 0)) ) {
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
			setState(148);
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
	public static class BackgroundShorthandPropertyContext extends PropertyContext {
		public Background_shorthand_ruleContext background_shorthand_rule() {
			return getRuleContext(Background_shorthand_ruleContext.class,0);
		}
		public BackgroundShorthandPropertyContext(PropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterBackgroundShorthandProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitBackgroundShorthandProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitBackgroundShorthandProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TextDecorationPropertyContext extends PropertyContext {
		public Text_decoration_ruleContext text_decoration_rule() {
			return getRuleContext(Text_decoration_ruleContext.class,0);
		}
		public TextDecorationPropertyContext(PropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterTextDecorationProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitTextDecorationProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitTextDecorationProperty(this);
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
	public static class JustifyContentPropertyContext extends PropertyContext {
		public Justify_content_ruleContext justify_content_rule() {
			return getRuleContext(Justify_content_ruleContext.class,0);
		}
		public JustifyContentPropertyContext(PropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterJustifyContentProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitJustifyContentProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitJustifyContentProperty(this);
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
	public static class BorderRadiusPropertyContext extends PropertyContext {
		public Border_radius_ruleContext border_radius_rule() {
			return getRuleContext(Border_radius_ruleContext.class,0);
		}
		public BorderRadiusPropertyContext(PropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterBorderRadiusProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitBorderRadiusProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitBorderRadiusProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MinWidthPropertyContext extends PropertyContext {
		public Min_width_ruleContext min_width_rule() {
			return getRuleContext(Min_width_ruleContext.class,0);
		}
		public MinWidthPropertyContext(PropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterMinWidthProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitMinWidthProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitMinWidthProperty(this);
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
	public static class BorderSidePropertyContext extends PropertyContext {
		public Border_side_ruleContext border_side_rule() {
			return getRuleContext(Border_side_ruleContext.class,0);
		}
		public BorderSidePropertyContext(PropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterBorderSideProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitBorderSideProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitBorderSideProperty(this);
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
	public static class LineHeightPropertyContext extends PropertyContext {
		public Line_height_ruleContext line_height_rule() {
			return getRuleContext(Line_height_ruleContext.class,0);
		}
		public LineHeightPropertyContext(PropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterLineHeightProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitLineHeightProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitLineHeightProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PaddingSidePropertyContext extends PropertyContext {
		public Padding_side_ruleContext padding_side_rule() {
			return getRuleContext(Padding_side_ruleContext.class,0);
		}
		public PaddingSidePropertyContext(PropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterPaddingSideProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitPaddingSideProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitPaddingSideProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MaxWidthPropertyContext extends PropertyContext {
		public Max_width_ruleContext max_width_rule() {
			return getRuleContext(Max_width_ruleContext.class,0);
		}
		public MaxWidthPropertyContext(PropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterMaxWidthProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitMaxWidthProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitMaxWidthProperty(this);
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
	public static class FlexDirectionPropertyContext extends PropertyContext {
		public Flex_direction_ruleContext flex_direction_rule() {
			return getRuleContext(Flex_direction_ruleContext.class,0);
		}
		public FlexDirectionPropertyContext(PropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterFlexDirectionProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitFlexDirectionProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitFlexDirectionProperty(this);
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
	public static class MarginSidePropertyContext extends PropertyContext {
		public Margin_side_ruleContext margin_side_rule() {
			return getRuleContext(Margin_side_ruleContext.class,0);
		}
		public MarginSidePropertyContext(PropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterMarginSideProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitMarginSideProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitMarginSideProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoxSizingPropertyContext extends PropertyContext {
		public Box_sizing_ruleContext box_sizing_rule() {
			return getRuleContext(Box_sizing_ruleContext.class,0);
		}
		public BoxSizingPropertyContext(PropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterBoxSizingProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitBoxSizingProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitBoxSizingProperty(this);
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
	public static class FlexWrapPropertyContext extends PropertyContext {
		public Flex_wrap_ruleContext flex_wrap_rule() {
			return getRuleContext(Flex_wrap_ruleContext.class,0);
		}
		public FlexWrapPropertyContext(PropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterFlexWrapProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitFlexWrapProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitFlexWrapProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AlignItemsPropertyContext extends PropertyContext {
		public Align_items_ruleContext align_items_rule() {
			return getRuleContext(Align_items_ruleContext.class,0);
		}
		public AlignItemsPropertyContext(PropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterAlignItemsProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitAlignItemsProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitAlignItemsProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BorderCollapsePropertyContext extends PropertyContext {
		public Border_collapse_ruleContext border_collapse_rule() {
			return getRuleContext(Border_collapse_ruleContext.class,0);
		}
		public BorderCollapsePropertyContext(PropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterBorderCollapseProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitBorderCollapseProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitBorderCollapseProperty(this);
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
	public static class CursorPropertyContext extends PropertyContext {
		public Cursor_ruleContext cursor_rule() {
			return getRuleContext(Cursor_ruleContext.class,0);
		}
		public CursorPropertyContext(PropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterCursorProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitCursorProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitCursorProperty(this);
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
	public static class BoxShadowPropertyContext extends PropertyContext {
		public Box_shadow_ruleContext box_shadow_rule() {
			return getRuleContext(Box_shadow_ruleContext.class,0);
		}
		public BoxShadowPropertyContext(PropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterBoxShadowProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitBoxShadowProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitBoxShadowProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OverflowPropertyContext extends PropertyContext {
		public Overflow_ruleContext overflow_rule() {
			return getRuleContext(Overflow_ruleContext.class,0);
		}
		public OverflowPropertyContext(PropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterOverflowProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitOverflowProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitOverflowProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GapPropertyContext extends PropertyContext {
		public Gap_ruleContext gap_rule() {
			return getRuleContext(Gap_ruleContext.class,0);
		}
		public GapPropertyContext(PropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterGapProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitGapProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitGapProperty(this);
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

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_property);
		try {
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIZE_1:
				_localctx = new Size1PropertyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				size1_rule();
				}
				break;
			case SIZE_2:
				_localctx = new Size2PropertyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				size2_rule();
				}
				break;
			case TEXT_ALIGN:
				_localctx = new TextAlignPropertyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(152);
				textalign_rule();
				}
				break;
			case COLOR:
				_localctx = new ColorPropertyContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(153);
				color_rule();
				}
				break;
			case FONT_SIZE:
				_localctx = new FontSizePropertyContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(154);
				font_size_rule();
				}
				break;
			case FONT_FAMILY:
				_localctx = new FontFamilyPropertyContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(155);
				font_family();
				}
				break;
			case DISPLAY:
				_localctx = new DisplayPropertyContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(156);
				display_rule();
				}
				break;
			case OPACITY:
				_localctx = new OpacityPropertyContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(157);
				opacity_rule();
				}
				break;
			case BORDER:
				_localctx = new BorderPropertyContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(158);
				border_rule();
				}
				break;
			case BORDER_TOP:
			case BORDER_RIGHT:
			case BORDER_BOTTOM:
			case BORDER_LEFT:
				_localctx = new BorderSidePropertyContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(159);
				border_side_rule();
				}
				break;
			case BORDER_COLLAPSE:
				_localctx = new BorderCollapsePropertyContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(160);
				border_collapse_rule();
				}
				break;
			case POSITION:
				_localctx = new PositionPropertyContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(161);
				position_rule();
				}
				break;
			case FONT_WEIGHT:
				_localctx = new FontWeightPropertyContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(162);
				font_weight_rule();
				}
				break;
			case BACKGROUND_COLOR:
				_localctx = new BackgroundPropertyContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(163);
				background_rule();
				}
				break;
			case BAK_GROUND:
				_localctx = new BackgroundShorthandPropertyContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(164);
				background_shorthand_rule();
				}
				break;
			case BOX_SIZING:
				_localctx = new BoxSizingPropertyContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(165);
				box_sizing_rule();
				}
				break;
			case LINE_HEIGHT:
				_localctx = new LineHeightPropertyContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(166);
				line_height_rule();
				}
				break;
			case MAX_WIDTH:
				_localctx = new MaxWidthPropertyContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(167);
				max_width_rule();
				}
				break;
			case MIN_WIDTH:
				_localctx = new MinWidthPropertyContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(168);
				min_width_rule();
				}
				break;
			case BORDER_RADIUS:
				_localctx = new BorderRadiusPropertyContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(169);
				border_radius_rule();
				}
				break;
			case BOX_SHADOW:
				_localctx = new BoxShadowPropertyContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(170);
				box_shadow_rule();
				}
				break;
			case CURSOR:
				_localctx = new CursorPropertyContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(171);
				cursor_rule();
				}
				break;
			case OVERFLOW:
				_localctx = new OverflowPropertyContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(172);
				overflow_rule();
				}
				break;
			case GAP:
				_localctx = new GapPropertyContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(173);
				gap_rule();
				}
				break;
			case TEXT_DECORATION:
				_localctx = new TextDecorationPropertyContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(174);
				text_decoration_rule();
				}
				break;
			case JUSTIFY_CONTENT:
				_localctx = new JustifyContentPropertyContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(175);
				justify_content_rule();
				}
				break;
			case ALIGN_ITEMS:
				_localctx = new AlignItemsPropertyContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(176);
				align_items_rule();
				}
				break;
			case FLEX_WRAP:
				_localctx = new FlexWrapPropertyContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(177);
				flex_wrap_rule();
				}
				break;
			case FLEX_DIRECTION:
				_localctx = new FlexDirectionPropertyContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(178);
				flex_direction_rule();
				}
				break;
			case MARGIN_TOP:
			case MARGIN_RIGHT:
			case MARGIN_BOTTOM:
			case MARGIN_LEFT:
				_localctx = new MarginSidePropertyContext(_localctx);
				enterOuterAlt(_localctx, 30);
				{
				setState(179);
				margin_side_rule();
				}
				break;
			case PADDING_TOP:
			case PADDING_RIGHT:
			case PADDING_BOTTOM:
			case PADDING_LEFT:
				_localctx = new PaddingSidePropertyContext(_localctx);
				enterOuterAlt(_localctx, 31);
				{
				setState(180);
				padding_side_rule();
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
		public TerminalNode FLOAT() { return getToken(ParserCss.FLOAT, 0); }
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
			setState(183);
			_la = _input.LA(1);
			if ( !(((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 27L) != 0)) ) {
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
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				box_atom();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				box_atom();
				setState(187);
				box_atom();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(189);
				box_atom();
				setState(190);
				box_atom();
				setState(191);
				box_atom();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(193);
				box_atom();
				setState(194);
				box_atom();
				setState(195);
				box_atom();
				setState(196);
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
		public TerminalNode FLOAT() { return getToken(ParserCss.FLOAT, 0); }
		public TerminalNode AUTO_KW() { return getToken(ParserCss.AUTO_KW, 0); }
		public TerminalNode NONE_KW() { return getToken(ParserCss.NONE_KW, 0); }
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
			setState(200);
			match(SIZE_1);
			setState(201);
			match(COLON);
			setState(202);
			_la = _input.LA(1);
			if ( !(((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 27L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(203);
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
			setState(205);
			match(SIZE_2);
			setState(206);
			match(COLON);
			setState(207);
			box_value();
			setState(208);
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
			setState(210);
			match(TEXT_ALIGN);
			setState(211);
			match(COLON);
			setState(212);
			match(VALUE_TEXT_ALIGN);
			setState(213);
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
			setState(215);
			match(COLOR);
			setState(216);
			match(COLON);
			setState(217);
			match(COLOR_VALUE);
			setState(218);
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
		public TerminalNode FLOAT() { return getToken(ParserCss.FLOAT, 0); }
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
			setState(220);
			match(FONT_SIZE);
			setState(221);
			match(COLON);
			setState(222);
			_la = _input.LA(1);
			if ( !(((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & 49153L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(223);
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
		public List<FontFamilyItemContext> fontFamilyItem() {
			return getRuleContexts(FontFamilyItemContext.class);
		}
		public FontFamilyItemContext fontFamilyItem(int i) {
			return getRuleContext(FontFamilyItemContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(ParserCss.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ParserCss.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ParserCss.COMMA, i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(FONT_FAMILY);
			setState(226);
			match(COLON);
			setState(227);
			fontFamilyItem();
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(228);
				match(COMMA);
				setState(229);
				fontFamilyItem();
				}
				}
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(235);
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
	public static class FontFamilyItemContext extends ParserRuleContext {
		public TerminalNode CSS_ELEMENT() { return getToken(ParserCss.CSS_ELEMENT, 0); }
		public TerminalNode STRING() { return getToken(ParserCss.STRING, 0); }
		public FontFamilyItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fontFamilyItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterFontFamilyItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitFontFamilyItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitFontFamilyItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FontFamilyItemContext fontFamilyItem() throws RecognitionException {
		FontFamilyItemContext _localctx = new FontFamilyItemContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_fontFamilyItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==CSS_ELEMENT) ) {
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
		enterRule(_localctx, 38, RULE_display_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(DISPLAY);
			setState(240);
			match(COLON);
			setState(241);
			display_value();
			setState(242);
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
		enterRule(_localctx, 40, RULE_display_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
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
		public List<TerminalNode> VALUE_GENERAL() { return getTokens(ParserCss.VALUE_GENERAL); }
		public TerminalNode VALUE_GENERAL(int i) {
			return getToken(ParserCss.VALUE_GENERAL, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(ParserCss.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(ParserCss.FLOAT, i);
		}
		public List<TerminalNode> BORDER_STYLE() { return getTokens(ParserCss.BORDER_STYLE); }
		public TerminalNode BORDER_STYLE(int i) {
			return getToken(ParserCss.BORDER_STYLE, i);
		}
		public List<TerminalNode> COLOR_VALUE() { return getTokens(ParserCss.COLOR_VALUE); }
		public TerminalNode COLOR_VALUE(int i) {
			return getToken(ParserCss.COLOR_VALUE, i);
		}
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
		enterRule(_localctx, 42, RULE_border_rule);
		int _la;
		try {
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				match(BORDER);
				setState(247);
				match(COLON);
				setState(248);
				match(NONE_KW);
				setState(249);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				match(BORDER);
				setState(251);
				match(COLON);
				setState(253); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(252);
					_la = _input.LA(1);
					if ( !(((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & 7169L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(255); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & 7169L) != 0) );
				setState(257);
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
	public static class Border_collapse_ruleContext extends ParserRuleContext {
		public TerminalNode BORDER_COLLAPSE() { return getToken(ParserCss.BORDER_COLLAPSE, 0); }
		public TerminalNode COLON() { return getToken(ParserCss.COLON, 0); }
		public TerminalNode BORDER_COLLAPSE_VALUE() { return getToken(ParserCss.BORDER_COLLAPSE_VALUE, 0); }
		public TerminalNode SEMICOLON() { return getToken(ParserCss.SEMICOLON, 0); }
		public Border_collapse_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_border_collapse_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterBorder_collapse_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitBorder_collapse_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitBorder_collapse_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Border_collapse_ruleContext border_collapse_rule() throws RecognitionException {
		Border_collapse_ruleContext _localctx = new Border_collapse_ruleContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_border_collapse_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(BORDER_COLLAPSE);
			setState(261);
			match(COLON);
			setState(262);
			match(BORDER_COLLAPSE_VALUE);
			setState(263);
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
	public static class Border_side_ruleContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(ParserCss.COLON, 0); }
		public TerminalNode NONE_KW() { return getToken(ParserCss.NONE_KW, 0); }
		public TerminalNode SEMICOLON() { return getToken(ParserCss.SEMICOLON, 0); }
		public TerminalNode BORDER_TOP() { return getToken(ParserCss.BORDER_TOP, 0); }
		public TerminalNode BORDER_RIGHT() { return getToken(ParserCss.BORDER_RIGHT, 0); }
		public TerminalNode BORDER_BOTTOM() { return getToken(ParserCss.BORDER_BOTTOM, 0); }
		public TerminalNode BORDER_LEFT() { return getToken(ParserCss.BORDER_LEFT, 0); }
		public List<TerminalNode> VALUE_GENERAL() { return getTokens(ParserCss.VALUE_GENERAL); }
		public TerminalNode VALUE_GENERAL(int i) {
			return getToken(ParserCss.VALUE_GENERAL, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(ParserCss.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(ParserCss.FLOAT, i);
		}
		public List<TerminalNode> BORDER_STYLE() { return getTokens(ParserCss.BORDER_STYLE); }
		public TerminalNode BORDER_STYLE(int i) {
			return getToken(ParserCss.BORDER_STYLE, i);
		}
		public List<TerminalNode> COLOR_VALUE() { return getTokens(ParserCss.COLOR_VALUE); }
		public TerminalNode COLOR_VALUE(int i) {
			return getToken(ParserCss.COLOR_VALUE, i);
		}
		public Border_side_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_border_side_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterBorder_side_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitBorder_side_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitBorder_side_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Border_side_ruleContext border_side_rule() throws RecognitionException {
		Border_side_ruleContext _localctx = new Border_side_ruleContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_border_side_rule);
		int _la;
		try {
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1966080L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(266);
				match(COLON);
				setState(267);
				match(NONE_KW);
				setState(268);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1966080L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(270);
				match(COLON);
				setState(272); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(271);
					_la = _input.LA(1);
					if ( !(((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & 7169L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(274); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & 7169L) != 0) );
				setState(276);
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
	public static class Opacity_ruleContext extends ParserRuleContext {
		public TerminalNode OPACITY() { return getToken(ParserCss.OPACITY, 0); }
		public TerminalNode COLON() { return getToken(ParserCss.COLON, 0); }
		public TerminalNode SEMICOLON() { return getToken(ParserCss.SEMICOLON, 0); }
		public TerminalNode VALUE_GENERAL() { return getToken(ParserCss.VALUE_GENERAL, 0); }
		public TerminalNode FLOAT() { return getToken(ParserCss.FLOAT, 0); }
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
		enterRule(_localctx, 48, RULE_opacity_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(OPACITY);
			setState(280);
			match(COLON);
			setState(281);
			_la = _input.LA(1);
			if ( !(_la==FLOAT || _la==VALUE_GENERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(282);
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
		enterRule(_localctx, 50, RULE_position_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(POSITION);
			setState(285);
			match(COLON);
			setState(286);
			match(VALUE_POSITION);
			setState(287);
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
		enterRule(_localctx, 52, RULE_font_weight_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(FONT_WEIGHT);
			setState(290);
			match(COLON);
			setState(291);
			match(VALUE_FONT_WEIGHT);
			setState(292);
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
		enterRule(_localctx, 54, RULE_background_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(BACKGROUND_COLOR);
			setState(295);
			match(COLON);
			setState(296);
			match(COLOR_VALUE);
			setState(297);
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
	public static class Background_shorthand_ruleContext extends ParserRuleContext {
		public TerminalNode BAK_GROUND() { return getToken(ParserCss.BAK_GROUND, 0); }
		public TerminalNode COLON() { return getToken(ParserCss.COLON, 0); }
		public TerminalNode COLOR_VALUE() { return getToken(ParserCss.COLOR_VALUE, 0); }
		public TerminalNode SEMICOLON() { return getToken(ParserCss.SEMICOLON, 0); }
		public Background_shorthand_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_background_shorthand_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterBackground_shorthand_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitBackground_shorthand_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitBackground_shorthand_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Background_shorthand_ruleContext background_shorthand_rule() throws RecognitionException {
		Background_shorthand_ruleContext _localctx = new Background_shorthand_ruleContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_background_shorthand_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(BAK_GROUND);
			setState(300);
			match(COLON);
			setState(301);
			match(COLOR_VALUE);
			setState(302);
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
	public static class Box_sizing_ruleContext extends ParserRuleContext {
		public TerminalNode BOX_SIZING() { return getToken(ParserCss.BOX_SIZING, 0); }
		public TerminalNode COLON() { return getToken(ParserCss.COLON, 0); }
		public TerminalNode BOX_SIZING_VALUE() { return getToken(ParserCss.BOX_SIZING_VALUE, 0); }
		public TerminalNode SEMICOLON() { return getToken(ParserCss.SEMICOLON, 0); }
		public Box_sizing_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_box_sizing_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterBox_sizing_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitBox_sizing_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitBox_sizing_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Box_sizing_ruleContext box_sizing_rule() throws RecognitionException {
		Box_sizing_ruleContext _localctx = new Box_sizing_ruleContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_box_sizing_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(BOX_SIZING);
			setState(305);
			match(COLON);
			setState(306);
			match(BOX_SIZING_VALUE);
			setState(307);
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
	public static class Line_height_ruleContext extends ParserRuleContext {
		public TerminalNode LINE_HEIGHT() { return getToken(ParserCss.LINE_HEIGHT, 0); }
		public TerminalNode COLON() { return getToken(ParserCss.COLON, 0); }
		public TerminalNode SEMICOLON() { return getToken(ParserCss.SEMICOLON, 0); }
		public TerminalNode VALUE_GENERAL() { return getToken(ParserCss.VALUE_GENERAL, 0); }
		public TerminalNode FLOAT() { return getToken(ParserCss.FLOAT, 0); }
		public Line_height_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line_height_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterLine_height_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitLine_height_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitLine_height_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Line_height_ruleContext line_height_rule() throws RecognitionException {
		Line_height_ruleContext _localctx = new Line_height_ruleContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_line_height_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(LINE_HEIGHT);
			setState(310);
			match(COLON);
			setState(311);
			_la = _input.LA(1);
			if ( !(_la==FLOAT || _la==VALUE_GENERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(312);
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
	public static class Max_width_ruleContext extends ParserRuleContext {
		public TerminalNode MAX_WIDTH() { return getToken(ParserCss.MAX_WIDTH, 0); }
		public TerminalNode COLON() { return getToken(ParserCss.COLON, 0); }
		public TerminalNode SEMICOLON() { return getToken(ParserCss.SEMICOLON, 0); }
		public TerminalNode VALUE_GENERAL() { return getToken(ParserCss.VALUE_GENERAL, 0); }
		public TerminalNode FLOAT() { return getToken(ParserCss.FLOAT, 0); }
		public TerminalNode NONE_KW() { return getToken(ParserCss.NONE_KW, 0); }
		public TerminalNode AUTO_KW() { return getToken(ParserCss.AUTO_KW, 0); }
		public Max_width_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_max_width_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterMax_width_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitMax_width_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitMax_width_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Max_width_ruleContext max_width_rule() throws RecognitionException {
		Max_width_ruleContext _localctx = new Max_width_ruleContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_max_width_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(MAX_WIDTH);
			setState(315);
			match(COLON);
			setState(316);
			_la = _input.LA(1);
			if ( !(((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 27L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(317);
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
	public static class Min_width_ruleContext extends ParserRuleContext {
		public TerminalNode MIN_WIDTH() { return getToken(ParserCss.MIN_WIDTH, 0); }
		public TerminalNode COLON() { return getToken(ParserCss.COLON, 0); }
		public TerminalNode SEMICOLON() { return getToken(ParserCss.SEMICOLON, 0); }
		public TerminalNode VALUE_GENERAL() { return getToken(ParserCss.VALUE_GENERAL, 0); }
		public TerminalNode FLOAT() { return getToken(ParserCss.FLOAT, 0); }
		public TerminalNode NONE_KW() { return getToken(ParserCss.NONE_KW, 0); }
		public TerminalNode AUTO_KW() { return getToken(ParserCss.AUTO_KW, 0); }
		public Min_width_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_min_width_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterMin_width_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitMin_width_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitMin_width_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Min_width_ruleContext min_width_rule() throws RecognitionException {
		Min_width_ruleContext _localctx = new Min_width_ruleContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_min_width_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(MIN_WIDTH);
			setState(320);
			match(COLON);
			setState(321);
			_la = _input.LA(1);
			if ( !(((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 27L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(322);
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
	public static class Border_radius_ruleContext extends ParserRuleContext {
		public TerminalNode BORDER_RADIUS() { return getToken(ParserCss.BORDER_RADIUS, 0); }
		public TerminalNode COLON() { return getToken(ParserCss.COLON, 0); }
		public Box_valueContext box_value() {
			return getRuleContext(Box_valueContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ParserCss.SEMICOLON, 0); }
		public Border_radius_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_border_radius_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterBorder_radius_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitBorder_radius_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitBorder_radius_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Border_radius_ruleContext border_radius_rule() throws RecognitionException {
		Border_radius_ruleContext _localctx = new Border_radius_ruleContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_border_radius_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(BORDER_RADIUS);
			setState(325);
			match(COLON);
			setState(326);
			box_value();
			setState(327);
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
	public static class Box_shadow_ruleContext extends ParserRuleContext {
		public TerminalNode BOX_SHADOW() { return getToken(ParserCss.BOX_SHADOW, 0); }
		public TerminalNode COLON() { return getToken(ParserCss.COLON, 0); }
		public TerminalNode COLOR_VALUE() { return getToken(ParserCss.COLOR_VALUE, 0); }
		public TerminalNode SEMICOLON() { return getToken(ParserCss.SEMICOLON, 0); }
		public List<TerminalNode> VALUE_GENERAL() { return getTokens(ParserCss.VALUE_GENERAL); }
		public TerminalNode VALUE_GENERAL(int i) {
			return getToken(ParserCss.VALUE_GENERAL, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(ParserCss.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(ParserCss.FLOAT, i);
		}
		public Box_shadow_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_box_shadow_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterBox_shadow_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitBox_shadow_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitBox_shadow_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Box_shadow_ruleContext box_shadow_rule() throws RecognitionException {
		Box_shadow_ruleContext _localctx = new Box_shadow_ruleContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_box_shadow_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(BOX_SHADOW);
			setState(330);
			match(COLON);
			setState(332); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(331);
				_la = _input.LA(1);
				if ( !(_la==FLOAT || _la==VALUE_GENERAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(334); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==FLOAT || _la==VALUE_GENERAL );
			setState(336);
			match(COLOR_VALUE);
			setState(337);
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
	public static class Cursor_ruleContext extends ParserRuleContext {
		public TerminalNode CURSOR() { return getToken(ParserCss.CURSOR, 0); }
		public TerminalNode COLON() { return getToken(ParserCss.COLON, 0); }
		public TerminalNode CURSOR_VALUE() { return getToken(ParserCss.CURSOR_VALUE, 0); }
		public TerminalNode SEMICOLON() { return getToken(ParserCss.SEMICOLON, 0); }
		public Cursor_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cursor_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterCursor_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitCursor_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitCursor_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cursor_ruleContext cursor_rule() throws RecognitionException {
		Cursor_ruleContext _localctx = new Cursor_ruleContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_cursor_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(CURSOR);
			setState(340);
			match(COLON);
			setState(341);
			match(CURSOR_VALUE);
			setState(342);
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
	public static class Overflow_ruleContext extends ParserRuleContext {
		public TerminalNode OVERFLOW() { return getToken(ParserCss.OVERFLOW, 0); }
		public TerminalNode COLON() { return getToken(ParserCss.COLON, 0); }
		public TerminalNode SEMICOLON() { return getToken(ParserCss.SEMICOLON, 0); }
		public TerminalNode BORDER_STYLE() { return getToken(ParserCss.BORDER_STYLE, 0); }
		public TerminalNode OVERFLOW_EXTRA_VALUE() { return getToken(ParserCss.OVERFLOW_EXTRA_VALUE, 0); }
		public TerminalNode AUTO_KW() { return getToken(ParserCss.AUTO_KW, 0); }
		public TerminalNode NONE_KW() { return getToken(ParserCss.NONE_KW, 0); }
		public Overflow_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_overflow_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterOverflow_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitOverflow_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitOverflow_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Overflow_ruleContext overflow_rule() throws RecognitionException {
		Overflow_ruleContext _localctx = new Overflow_ruleContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_overflow_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			match(OVERFLOW);
			setState(345);
			match(COLON);
			setState(346);
			_la = _input.LA(1);
			if ( !(((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & 897L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(347);
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
	public static class Gap_ruleContext extends ParserRuleContext {
		public TerminalNode GAP() { return getToken(ParserCss.GAP, 0); }
		public TerminalNode COLON() { return getToken(ParserCss.COLON, 0); }
		public TerminalNode SEMICOLON() { return getToken(ParserCss.SEMICOLON, 0); }
		public TerminalNode VALUE_GENERAL() { return getToken(ParserCss.VALUE_GENERAL, 0); }
		public TerminalNode FLOAT() { return getToken(ParserCss.FLOAT, 0); }
		public Gap_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gap_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterGap_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitGap_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitGap_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Gap_ruleContext gap_rule() throws RecognitionException {
		Gap_ruleContext _localctx = new Gap_ruleContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_gap_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(GAP);
			setState(350);
			match(COLON);
			setState(351);
			_la = _input.LA(1);
			if ( !(_la==FLOAT || _la==VALUE_GENERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(352);
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
	public static class Text_decoration_ruleContext extends ParserRuleContext {
		public TerminalNode TEXT_DECORATION() { return getToken(ParserCss.TEXT_DECORATION, 0); }
		public TerminalNode COLON() { return getToken(ParserCss.COLON, 0); }
		public TerminalNode SEMICOLON() { return getToken(ParserCss.SEMICOLON, 0); }
		public TerminalNode NONE_KW() { return getToken(ParserCss.NONE_KW, 0); }
		public TerminalNode TEXT_DECORATION_VALUE() { return getToken(ParserCss.TEXT_DECORATION_VALUE, 0); }
		public Text_decoration_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text_decoration_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterText_decoration_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitText_decoration_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitText_decoration_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Text_decoration_ruleContext text_decoration_rule() throws RecognitionException {
		Text_decoration_ruleContext _localctx = new Text_decoration_ruleContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_text_decoration_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(TEXT_DECORATION);
			setState(355);
			match(COLON);
			setState(356);
			_la = _input.LA(1);
			if ( !(_la==TEXT_DECORATION_VALUE || _la==NONE_KW) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(357);
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
	public static class Justify_content_ruleContext extends ParserRuleContext {
		public TerminalNode JUSTIFY_CONTENT() { return getToken(ParserCss.JUSTIFY_CONTENT, 0); }
		public TerminalNode COLON() { return getToken(ParserCss.COLON, 0); }
		public TerminalNode SEMICOLON() { return getToken(ParserCss.SEMICOLON, 0); }
		public TerminalNode FLEX_ALIGN_VALUE() { return getToken(ParserCss.FLEX_ALIGN_VALUE, 0); }
		public TerminalNode VALUE_TEXT_ALIGN() { return getToken(ParserCss.VALUE_TEXT_ALIGN, 0); }
		public Justify_content_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_justify_content_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterJustify_content_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitJustify_content_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitJustify_content_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Justify_content_ruleContext justify_content_rule() throws RecognitionException {
		Justify_content_ruleContext _localctx = new Justify_content_ruleContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_justify_content_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(JUSTIFY_CONTENT);
			setState(360);
			match(COLON);
			setState(361);
			_la = _input.LA(1);
			if ( !(_la==VALUE_TEXT_ALIGN || _la==FLEX_ALIGN_VALUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(362);
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
	public static class Align_items_ruleContext extends ParserRuleContext {
		public TerminalNode ALIGN_ITEMS() { return getToken(ParserCss.ALIGN_ITEMS, 0); }
		public TerminalNode COLON() { return getToken(ParserCss.COLON, 0); }
		public TerminalNode SEMICOLON() { return getToken(ParserCss.SEMICOLON, 0); }
		public TerminalNode FLEX_ALIGN_VALUE() { return getToken(ParserCss.FLEX_ALIGN_VALUE, 0); }
		public TerminalNode VALUE_TEXT_ALIGN() { return getToken(ParserCss.VALUE_TEXT_ALIGN, 0); }
		public Align_items_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_align_items_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterAlign_items_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitAlign_items_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitAlign_items_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Align_items_ruleContext align_items_rule() throws RecognitionException {
		Align_items_ruleContext _localctx = new Align_items_ruleContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_align_items_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(ALIGN_ITEMS);
			setState(365);
			match(COLON);
			setState(366);
			_la = _input.LA(1);
			if ( !(_la==VALUE_TEXT_ALIGN || _la==FLEX_ALIGN_VALUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(367);
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
	public static class Flex_wrap_ruleContext extends ParserRuleContext {
		public TerminalNode FLEX_WRAP() { return getToken(ParserCss.FLEX_WRAP, 0); }
		public TerminalNode COLON() { return getToken(ParserCss.COLON, 0); }
		public TerminalNode FLEX_WRAP_VALUE() { return getToken(ParserCss.FLEX_WRAP_VALUE, 0); }
		public TerminalNode SEMICOLON() { return getToken(ParserCss.SEMICOLON, 0); }
		public Flex_wrap_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flex_wrap_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterFlex_wrap_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitFlex_wrap_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitFlex_wrap_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Flex_wrap_ruleContext flex_wrap_rule() throws RecognitionException {
		Flex_wrap_ruleContext _localctx = new Flex_wrap_ruleContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_flex_wrap_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(FLEX_WRAP);
			setState(370);
			match(COLON);
			setState(371);
			match(FLEX_WRAP_VALUE);
			setState(372);
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
	public static class Flex_direction_ruleContext extends ParserRuleContext {
		public TerminalNode FLEX_DIRECTION() { return getToken(ParserCss.FLEX_DIRECTION, 0); }
		public TerminalNode COLON() { return getToken(ParserCss.COLON, 0); }
		public TerminalNode FLEX_DIRECTION_VALUE() { return getToken(ParserCss.FLEX_DIRECTION_VALUE, 0); }
		public TerminalNode SEMICOLON() { return getToken(ParserCss.SEMICOLON, 0); }
		public Flex_direction_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flex_direction_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterFlex_direction_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitFlex_direction_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitFlex_direction_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Flex_direction_ruleContext flex_direction_rule() throws RecognitionException {
		Flex_direction_ruleContext _localctx = new Flex_direction_ruleContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_flex_direction_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(FLEX_DIRECTION);
			setState(375);
			match(COLON);
			setState(376);
			match(FLEX_DIRECTION_VALUE);
			setState(377);
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
	public static class Margin_side_ruleContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(ParserCss.COLON, 0); }
		public TerminalNode SEMICOLON() { return getToken(ParserCss.SEMICOLON, 0); }
		public TerminalNode MARGIN_TOP() { return getToken(ParserCss.MARGIN_TOP, 0); }
		public TerminalNode MARGIN_RIGHT() { return getToken(ParserCss.MARGIN_RIGHT, 0); }
		public TerminalNode MARGIN_BOTTOM() { return getToken(ParserCss.MARGIN_BOTTOM, 0); }
		public TerminalNode MARGIN_LEFT() { return getToken(ParserCss.MARGIN_LEFT, 0); }
		public TerminalNode VALUE_GENERAL() { return getToken(ParserCss.VALUE_GENERAL, 0); }
		public TerminalNode FLOAT() { return getToken(ParserCss.FLOAT, 0); }
		public TerminalNode AUTO_KW() { return getToken(ParserCss.AUTO_KW, 0); }
		public Margin_side_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_margin_side_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterMargin_side_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitMargin_side_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitMargin_side_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Margin_side_ruleContext margin_side_rule() throws RecognitionException {
		Margin_side_ruleContext _localctx = new Margin_side_ruleContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_margin_side_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 263882790666240L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(380);
			match(COLON);
			setState(381);
			_la = _input.LA(1);
			if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 13L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(382);
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
	public static class Padding_side_ruleContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(ParserCss.COLON, 0); }
		public TerminalNode SEMICOLON() { return getToken(ParserCss.SEMICOLON, 0); }
		public TerminalNode PADDING_TOP() { return getToken(ParserCss.PADDING_TOP, 0); }
		public TerminalNode PADDING_RIGHT() { return getToken(ParserCss.PADDING_RIGHT, 0); }
		public TerminalNode PADDING_BOTTOM() { return getToken(ParserCss.PADDING_BOTTOM, 0); }
		public TerminalNode PADDING_LEFT() { return getToken(ParserCss.PADDING_LEFT, 0); }
		public TerminalNode VALUE_GENERAL() { return getToken(ParserCss.VALUE_GENERAL, 0); }
		public TerminalNode FLOAT() { return getToken(ParserCss.FLOAT, 0); }
		public TerminalNode AUTO_KW() { return getToken(ParserCss.AUTO_KW, 0); }
		public Padding_side_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_padding_side_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).enterPadding_side_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserCssListener ) ((ParserCssListener)listener).exitPadding_side_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ParserCssVisitor ) return ((ParserCssVisitor<? extends T>)visitor).visitPadding_side_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Padding_side_ruleContext padding_side_rule() throws RecognitionException {
		Padding_side_ruleContext _localctx = new Padding_side_ruleContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_padding_side_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4222124650659840L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(385);
			match(COLON);
			setState(386);
			_la = _input.LA(1);
			if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 13L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(387);
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
		enterRule(_localctx, 90, RULE_mediaRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(MEDIA);
			setState(390);
			match(LKB);
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STAR || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 15L) != 0)) {
				{
				{
				setState(391);
				rule_();
				}
				}
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(397);
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

	public static final String _serializedATN =
		"\u0004\u0001O\u0190\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0001\u0000\u0005\u0000^\b\u0000\n\u0000\f\u0000a\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001h\b"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u0003q\b\u0003\n\u0003\f\u0003t\t\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004{\b"+
		"\u0004\n\u0004\f\u0004~\t\u0004\u0001\u0005\u0004\u0005\u0081\b\u0005"+
		"\u000b\u0005\f\u0005\u0082\u0001\u0006\u0001\u0006\u0005\u0006\u0087\b"+
		"\u0006\n\u0006\f\u0006\u008a\t\u0006\u0001\u0006\u0004\u0006\u008d\b\u0006"+
		"\u000b\u0006\f\u0006\u008e\u0003\u0006\u0091\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00b6"+
		"\b\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00c7\b\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0005\u0011\u00e7\b\u0011\n\u0011\f\u0011\u00ea\t\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0004\u0015\u00fe\b\u0015\u000b\u0015\f\u0015\u00ff\u0001\u0015\u0003"+
		"\u0015\u0103\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0004\u0017\u0111\b\u0017\u000b\u0017\f\u0017\u0112"+
		"\u0001\u0017\u0003\u0017\u0116\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001\"\u0001\"\u0001\"\u0004\"\u014d\b\"\u000b\"\f\"\u014e\u0001"+
		"\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001(\u0001("+
		"\u0001(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001-\u0001-\u0001-\u0005-\u0189\b-\n-\f-\u018c"+
		"\t-\u0001-\u0001-\u0001-\u0000\u0000.\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJLNPRTVXZ\u0000\u000f\u0001\u0000JL\u0002\u0000\r\rMM\u0002\u0000DEG"+
		"H\u0002\u000099GH\u0002\u0000IIMM\u0002\u0000::DD\u0002\u0000<<FH\u0001"+
		"\u0000\u0011\u0014\u0001\u0000GH\u0002\u0000<<CE\u0002\u0000AADD\u0001"+
		"\u0000=>\u0001\u0000,/\u0002\u0000EEGH\u0001\u000003\u0192\u0000_\u0001"+
		"\u0000\u0000\u0000\u0002g\u0001\u0000\u0000\u0000\u0004i\u0001\u0000\u0000"+
		"\u0000\u0006m\u0001\u0000\u0000\u0000\bw\u0001\u0000\u0000\u0000\n\u0080"+
		"\u0001\u0000\u0000\u0000\f\u0090\u0001\u0000\u0000\u0000\u000e\u0092\u0001"+
		"\u0000\u0000\u0000\u0010\u0094\u0001\u0000\u0000\u0000\u0012\u00b5\u0001"+
		"\u0000\u0000\u0000\u0014\u00b7\u0001\u0000\u0000\u0000\u0016\u00c6\u0001"+
		"\u0000\u0000\u0000\u0018\u00c8\u0001\u0000\u0000\u0000\u001a\u00cd\u0001"+
		"\u0000\u0000\u0000\u001c\u00d2\u0001\u0000\u0000\u0000\u001e\u00d7\u0001"+
		"\u0000\u0000\u0000 \u00dc\u0001\u0000\u0000\u0000\"\u00e1\u0001\u0000"+
		"\u0000\u0000$\u00ed\u0001\u0000\u0000\u0000&\u00ef\u0001\u0000\u0000\u0000"+
		"(\u00f4\u0001\u0000\u0000\u0000*\u0102\u0001\u0000\u0000\u0000,\u0104"+
		"\u0001\u0000\u0000\u0000.\u0115\u0001\u0000\u0000\u00000\u0117\u0001\u0000"+
		"\u0000\u00002\u011c\u0001\u0000\u0000\u00004\u0121\u0001\u0000\u0000\u0000"+
		"6\u0126\u0001\u0000\u0000\u00008\u012b\u0001\u0000\u0000\u0000:\u0130"+
		"\u0001\u0000\u0000\u0000<\u0135\u0001\u0000\u0000\u0000>\u013a\u0001\u0000"+
		"\u0000\u0000@\u013f\u0001\u0000\u0000\u0000B\u0144\u0001\u0000\u0000\u0000"+
		"D\u0149\u0001\u0000\u0000\u0000F\u0153\u0001\u0000\u0000\u0000H\u0158"+
		"\u0001\u0000\u0000\u0000J\u015d\u0001\u0000\u0000\u0000L\u0162\u0001\u0000"+
		"\u0000\u0000N\u0167\u0001\u0000\u0000\u0000P\u016c\u0001\u0000\u0000\u0000"+
		"R\u0171\u0001\u0000\u0000\u0000T\u0176\u0001\u0000\u0000\u0000V\u017b"+
		"\u0001\u0000\u0000\u0000X\u0180\u0001\u0000\u0000\u0000Z\u0185\u0001\u0000"+
		"\u0000\u0000\\^\u0003\u0002\u0001\u0000]\\\u0001\u0000\u0000\u0000^a\u0001"+
		"\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000"+
		"`b\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000bc\u0005\u0000\u0000"+
		"\u0001c\u0001\u0001\u0000\u0000\u0000dh\u0003\u0004\u0002\u0000eh\u0003"+
		"\u0006\u0003\u0000fh\u0003Z-\u0000gd\u0001\u0000\u0000\u0000ge\u0001\u0000"+
		"\u0000\u0000gf\u0001\u0000\u0000\u0000h\u0003\u0001\u0000\u0000\u0000"+
		"ij\u0005\u000b\u0000\u0000jk\u0005I\u0000\u0000kl\u0005\n\u0000\u0000"+
		"l\u0005\u0001\u0000\u0000\u0000mn\u0003\b\u0004\u0000nr\u0005\u0001\u0000"+
		"\u0000oq\u0003\u0012\t\u0000po\u0001\u0000\u0000\u0000qt\u0001\u0000\u0000"+
		"\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000su\u0001\u0000"+
		"\u0000\u0000tr\u0001\u0000\u0000\u0000uv\u0005\u0002\u0000\u0000v\u0007"+
		"\u0001\u0000\u0000\u0000w|\u0003\n\u0005\u0000xy\u0005\u0007\u0000\u0000"+
		"y{\u0003\n\u0005\u0000zx\u0001\u0000\u0000\u0000{~\u0001\u0000\u0000\u0000"+
		"|z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}\t\u0001\u0000\u0000"+
		"\u0000~|\u0001\u0000\u0000\u0000\u007f\u0081\u0003\f\u0006\u0000\u0080"+
		"\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082"+
		"\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083"+
		"\u000b\u0001\u0000\u0000\u0000\u0084\u0088\u0003\u0010\b\u0000\u0085\u0087"+
		"\u0003\u000e\u0007\u0000\u0086\u0085\u0001\u0000\u0000\u0000\u0087\u008a"+
		"\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0088\u0089"+
		"\u0001\u0000\u0000\u0000\u0089\u0091\u0001\u0000\u0000\u0000\u008a\u0088"+
		"\u0001\u0000\u0000\u0000\u008b\u008d\u0003\u000e\u0007\u0000\u008c\u008b"+
		"\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u008c"+
		"\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0091"+
		"\u0001\u0000\u0000\u0000\u0090\u0084\u0001\u0000\u0000\u0000\u0090\u008c"+
		"\u0001\u0000\u0000\u0000\u0091\r\u0001\u0000\u0000\u0000\u0092\u0093\u0007"+
		"\u0000\u0000\u0000\u0093\u000f\u0001\u0000\u0000\u0000\u0094\u0095\u0007"+
		"\u0001\u0000\u0000\u0095\u0011\u0001\u0000\u0000\u0000\u0096\u00b6\u0003"+
		"\u0018\f\u0000\u0097\u00b6\u0003\u001a\r\u0000\u0098\u00b6\u0003\u001c"+
		"\u000e\u0000\u0099\u00b6\u0003\u001e\u000f\u0000\u009a\u00b6\u0003 \u0010"+
		"\u0000\u009b\u00b6\u0003\"\u0011\u0000\u009c\u00b6\u0003&\u0013\u0000"+
		"\u009d\u00b6\u00030\u0018\u0000\u009e\u00b6\u0003*\u0015\u0000\u009f\u00b6"+
		"\u0003.\u0017\u0000\u00a0\u00b6\u0003,\u0016\u0000\u00a1\u00b6\u00032"+
		"\u0019\u0000\u00a2\u00b6\u00034\u001a\u0000\u00a3\u00b6\u00036\u001b\u0000"+
		"\u00a4\u00b6\u00038\u001c\u0000\u00a5\u00b6\u0003:\u001d\u0000\u00a6\u00b6"+
		"\u0003<\u001e\u0000\u00a7\u00b6\u0003>\u001f\u0000\u00a8\u00b6\u0003@"+
		" \u0000\u00a9\u00b6\u0003B!\u0000\u00aa\u00b6\u0003D\"\u0000\u00ab\u00b6"+
		"\u0003F#\u0000\u00ac\u00b6\u0003H$\u0000\u00ad\u00b6\u0003J%\u0000\u00ae"+
		"\u00b6\u0003L&\u0000\u00af\u00b6\u0003N\'\u0000\u00b0\u00b6\u0003P(\u0000"+
		"\u00b1\u00b6\u0003R)\u0000\u00b2\u00b6\u0003T*\u0000\u00b3\u00b6\u0003"+
		"V+\u0000\u00b4\u00b6\u0003X,\u0000\u00b5\u0096\u0001\u0000\u0000\u0000"+
		"\u00b5\u0097\u0001\u0000\u0000\u0000\u00b5\u0098\u0001\u0000\u0000\u0000"+
		"\u00b5\u0099\u0001\u0000\u0000\u0000\u00b5\u009a\u0001\u0000\u0000\u0000"+
		"\u00b5\u009b\u0001\u0000\u0000\u0000\u00b5\u009c\u0001\u0000\u0000\u0000"+
		"\u00b5\u009d\u0001\u0000\u0000\u0000\u00b5\u009e\u0001\u0000\u0000\u0000"+
		"\u00b5\u009f\u0001\u0000\u0000\u0000\u00b5\u00a0\u0001\u0000\u0000\u0000"+
		"\u00b5\u00a1\u0001\u0000\u0000\u0000\u00b5\u00a2\u0001\u0000\u0000\u0000"+
		"\u00b5\u00a3\u0001\u0000\u0000\u0000\u00b5\u00a4\u0001\u0000\u0000\u0000"+
		"\u00b5\u00a5\u0001\u0000\u0000\u0000\u00b5\u00a6\u0001\u0000\u0000\u0000"+
		"\u00b5\u00a7\u0001\u0000\u0000\u0000\u00b5\u00a8\u0001\u0000\u0000\u0000"+
		"\u00b5\u00a9\u0001\u0000\u0000\u0000\u00b5\u00aa\u0001\u0000\u0000\u0000"+
		"\u00b5\u00ab\u0001\u0000\u0000\u0000\u00b5\u00ac\u0001\u0000\u0000\u0000"+
		"\u00b5\u00ad\u0001\u0000\u0000\u0000\u00b5\u00ae\u0001\u0000\u0000\u0000"+
		"\u00b5\u00af\u0001\u0000\u0000\u0000\u00b5\u00b0\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b1\u0001\u0000\u0000\u0000\u00b5\u00b2\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000"+
		"\u00b6\u0013\u0001\u0000\u0000\u0000\u00b7\u00b8\u0007\u0002\u0000\u0000"+
		"\u00b8\u0015\u0001\u0000\u0000\u0000\u00b9\u00c7\u0003\u0014\n\u0000\u00ba"+
		"\u00bb\u0003\u0014\n\u0000\u00bb\u00bc\u0003\u0014\n\u0000\u00bc\u00c7"+
		"\u0001\u0000\u0000\u0000\u00bd\u00be\u0003\u0014\n\u0000\u00be\u00bf\u0003"+
		"\u0014\n\u0000\u00bf\u00c0\u0003\u0014\n\u0000\u00c0\u00c7\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c2\u0003\u0014\n\u0000\u00c2\u00c3\u0003\u0014\n"+
		"\u0000\u00c3\u00c4\u0003\u0014\n\u0000\u00c4\u00c5\u0003\u0014\n\u0000"+
		"\u00c5\u00c7\u0001\u0000\u0000\u0000\u00c6\u00b9\u0001\u0000\u0000\u0000"+
		"\u00c6\u00ba\u0001\u0000\u0000\u0000\u00c6\u00bd\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c1\u0001\u0000\u0000\u0000\u00c7\u0017\u0001\u0000\u0000\u0000"+
		"\u00c8\u00c9\u00054\u0000\u0000\u00c9\u00ca\u0005\b\u0000\u0000\u00ca"+
		"\u00cb\u0007\u0002\u0000\u0000\u00cb\u00cc\u0005\n\u0000\u0000\u00cc\u0019"+
		"\u0001\u0000\u0000\u0000\u00cd\u00ce\u00055\u0000\u0000\u00ce\u00cf\u0005"+
		"\b\u0000\u0000\u00cf\u00d0\u0003\u0016\u000b\u0000\u00d0\u00d1\u0005\n"+
		"\u0000\u0000\u00d1\u001b\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005\u001b"+
		"\u0000\u0000\u00d3\u00d4\u0005\b\u0000\u0000\u00d4\u00d5\u0005=\u0000"+
		"\u0000\u00d5\u00d6\u0005\n\u0000\u0000\u00d6\u001d\u0001\u0000\u0000\u0000"+
		"\u00d7\u00d8\u0005\u0017\u0000\u0000\u00d8\u00d9\u0005\b\u0000\u0000\u00d9"+
		"\u00da\u0005F\u0000\u0000\u00da\u00db\u0005\n\u0000\u0000\u00db\u001f"+
		"\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005\u0019\u0000\u0000\u00dd\u00de"+
		"\u0005\b\u0000\u0000\u00de\u00df\u0007\u0003\u0000\u0000\u00df\u00e0\u0005"+
		"\n\u0000\u0000\u00e0!\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005\u0018"+
		"\u0000\u0000\u00e2\u00e3\u0005\b\u0000\u0000\u00e3\u00e8\u0003$\u0012"+
		"\u0000\u00e4\u00e5\u0005\u0007\u0000\u0000\u00e5\u00e7\u0003$\u0012\u0000"+
		"\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e7\u00ea\u0001\u0000\u0000\u0000"+
		"\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000"+
		"\u00e9\u00eb\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000"+
		"\u00eb\u00ec\u0005\n\u0000\u0000\u00ec#\u0001\u0000\u0000\u0000\u00ed"+
		"\u00ee\u0007\u0004\u0000\u0000\u00ee%\u0001\u0000\u0000\u0000\u00ef\u00f0"+
		"\u0005\u001e\u0000\u0000\u00f0\u00f1\u0005\b\u0000\u0000\u00f1\u00f2\u0003"+
		"(\u0014\u0000\u00f2\u00f3\u0005\n\u0000\u0000\u00f3\'\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f5\u0007\u0005\u0000\u0000\u00f5)\u0001\u0000\u0000\u0000"+
		"\u00f6\u00f7\u0005\u0016\u0000\u0000\u00f7\u00f8\u0005\b\u0000\u0000\u00f8"+
		"\u00f9\u0005D\u0000\u0000\u00f9\u0103\u0005\n\u0000\u0000\u00fa\u00fb"+
		"\u0005\u0016\u0000\u0000\u00fb\u00fd\u0005\b\u0000\u0000\u00fc\u00fe\u0007"+
		"\u0006\u0000\u0000\u00fd\u00fc\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001"+
		"\u0000\u0000\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000\u00ff\u0100\u0001"+
		"\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u0103\u0005"+
		"\n\u0000\u0000\u0102\u00f6\u0001\u0000\u0000\u0000\u0102\u00fa\u0001\u0000"+
		"\u0000\u0000\u0103+\u0001\u0000\u0000\u0000\u0104\u0105\u0005\u0010\u0000"+
		"\u0000\u0105\u0106\u0005\b\u0000\u0000\u0106\u0107\u00056\u0000\u0000"+
		"\u0107\u0108\u0005\n\u0000\u0000\u0108-\u0001\u0000\u0000\u0000\u0109"+
		"\u010a\u0007\u0007\u0000\u0000\u010a\u010b\u0005\b\u0000\u0000\u010b\u010c"+
		"\u0005D\u0000\u0000\u010c\u0116\u0005\n\u0000\u0000\u010d\u010e\u0007"+
		"\u0007\u0000\u0000\u010e\u0110\u0005\b\u0000\u0000\u010f\u0111\u0007\u0006"+
		"\u0000\u0000\u0110\u010f\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000"+
		"\u0000\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0112\u0113\u0001\u0000"+
		"\u0000\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u0114\u0116\u0005\n\u0000"+
		"\u0000\u0115\u0109\u0001\u0000\u0000\u0000\u0115\u010d\u0001\u0000\u0000"+
		"\u0000\u0116/\u0001\u0000\u0000\u0000\u0117\u0118\u0005\u001d\u0000\u0000"+
		"\u0118\u0119\u0005\b\u0000\u0000\u0119\u011a\u0007\b\u0000\u0000\u011a"+
		"\u011b\u0005\n\u0000\u0000\u011b1\u0001\u0000\u0000\u0000\u011c\u011d"+
		"\u0005\u001f\u0000\u0000\u011d\u011e\u0005\b\u0000\u0000\u011e\u011f\u0005"+
		";\u0000\u0000\u011f\u0120\u0005\n\u0000\u0000\u01203\u0001\u0000\u0000"+
		"\u0000\u0121\u0122\u0005\u001a\u0000\u0000\u0122\u0123\u0005\b\u0000\u0000"+
		"\u0123\u0124\u00058\u0000\u0000\u0124\u0125\u0005\n\u0000\u0000\u0125"+
		"5\u0001\u0000\u0000\u0000\u0126\u0127\u0005\u000e\u0000\u0000\u0127\u0128"+
		"\u0005\b\u0000\u0000\u0128\u0129\u0005F\u0000\u0000\u0129\u012a\u0005"+
		"\n\u0000\u0000\u012a7\u0001\u0000\u0000\u0000\u012b\u012c\u0005\u000f"+
		"\u0000\u0000\u012c\u012d\u0005\b\u0000\u0000\u012d\u012e\u0005F\u0000"+
		"\u0000\u012e\u012f\u0005\n\u0000\u0000\u012f9\u0001\u0000\u0000\u0000"+
		"\u0130\u0131\u0005 \u0000\u0000\u0131\u0132\u0005\b\u0000\u0000\u0132"+
		"\u0133\u00057\u0000\u0000\u0133\u0134\u0005\n\u0000\u0000\u0134;\u0001"+
		"\u0000\u0000\u0000\u0135\u0136\u0005\"\u0000\u0000\u0136\u0137\u0005\b"+
		"\u0000\u0000\u0137\u0138\u0007\b\u0000\u0000\u0138\u0139\u0005\n\u0000"+
		"\u0000\u0139=\u0001\u0000\u0000\u0000\u013a\u013b\u0005#\u0000\u0000\u013b"+
		"\u013c\u0005\b\u0000\u0000\u013c\u013d\u0007\u0002\u0000\u0000\u013d\u013e"+
		"\u0005\n\u0000\u0000\u013e?\u0001\u0000\u0000\u0000\u013f\u0140\u0005"+
		"$\u0000\u0000\u0140\u0141\u0005\b\u0000\u0000\u0141\u0142\u0007\u0002"+
		"\u0000\u0000\u0142\u0143\u0005\n\u0000\u0000\u0143A\u0001\u0000\u0000"+
		"\u0000\u0144\u0145\u0005\u0015\u0000\u0000\u0145\u0146\u0005\b\u0000\u0000"+
		"\u0146\u0147\u0003\u0016\u000b\u0000\u0147\u0148\u0005\n\u0000\u0000\u0148"+
		"C\u0001\u0000\u0000\u0000\u0149\u014a\u0005!\u0000\u0000\u014a\u014c\u0005"+
		"\b\u0000\u0000\u014b\u014d\u0007\b\u0000\u0000\u014c\u014b\u0001\u0000"+
		"\u0000\u0000\u014d\u014e\u0001\u0000\u0000\u0000\u014e\u014c\u0001\u0000"+
		"\u0000\u0000\u014e\u014f\u0001\u0000\u0000\u0000\u014f\u0150\u0001\u0000"+
		"\u0000\u0000\u0150\u0151\u0005F\u0000\u0000\u0151\u0152\u0005\n\u0000"+
		"\u0000\u0152E\u0001\u0000\u0000\u0000\u0153\u0154\u0005%\u0000\u0000\u0154"+
		"\u0155\u0005\b\u0000\u0000\u0155\u0156\u0005B\u0000\u0000\u0156\u0157"+
		"\u0005\n\u0000\u0000\u0157G\u0001\u0000\u0000\u0000\u0158\u0159\u0005"+
		"&\u0000\u0000\u0159\u015a\u0005\b\u0000\u0000\u015a\u015b\u0007\t\u0000"+
		"\u0000\u015b\u015c\u0005\n\u0000\u0000\u015cI\u0001\u0000\u0000\u0000"+
		"\u015d\u015e\u0005\'\u0000\u0000\u015e\u015f\u0005\b\u0000\u0000\u015f"+
		"\u0160\u0007\b\u0000\u0000\u0160\u0161\u0005\n\u0000\u0000\u0161K\u0001"+
		"\u0000\u0000\u0000\u0162\u0163\u0005\u001c\u0000\u0000\u0163\u0164\u0005"+
		"\b\u0000\u0000\u0164\u0165\u0007\n\u0000\u0000\u0165\u0166\u0005\n\u0000"+
		"\u0000\u0166M\u0001\u0000\u0000\u0000\u0167\u0168\u0005(\u0000\u0000\u0168"+
		"\u0169\u0005\b\u0000\u0000\u0169\u016a\u0007\u000b\u0000\u0000\u016a\u016b"+
		"\u0005\n\u0000\u0000\u016bO\u0001\u0000\u0000\u0000\u016c\u016d\u0005"+
		")\u0000\u0000\u016d\u016e\u0005\b\u0000\u0000\u016e\u016f\u0007\u000b"+
		"\u0000\u0000\u016f\u0170\u0005\n\u0000\u0000\u0170Q\u0001\u0000\u0000"+
		"\u0000\u0171\u0172\u0005*\u0000\u0000\u0172\u0173\u0005\b\u0000\u0000"+
		"\u0173\u0174\u0005?\u0000\u0000\u0174\u0175\u0005\n\u0000\u0000\u0175"+
		"S\u0001\u0000\u0000\u0000\u0176\u0177\u0005+\u0000\u0000\u0177\u0178\u0005"+
		"\b\u0000\u0000\u0178\u0179\u0005@\u0000\u0000\u0179\u017a\u0005\n\u0000"+
		"\u0000\u017aU\u0001\u0000\u0000\u0000\u017b\u017c\u0007\f\u0000\u0000"+
		"\u017c\u017d\u0005\b\u0000\u0000\u017d\u017e\u0007\r\u0000\u0000\u017e"+
		"\u017f\u0005\n\u0000\u0000\u017fW\u0001\u0000\u0000\u0000\u0180\u0181"+
		"\u0007\u000e\u0000\u0000\u0181\u0182\u0005\b\u0000\u0000\u0182\u0183\u0007"+
		"\r\u0000\u0000\u0183\u0184\u0005\n\u0000\u0000\u0184Y\u0001\u0000\u0000"+
		"\u0000\u0185\u0186\u0005\f\u0000\u0000\u0186\u018a\u0005\u0001\u0000\u0000"+
		"\u0187\u0189\u0003\u0006\u0003\u0000\u0188\u0187\u0001\u0000\u0000\u0000"+
		"\u0189\u018c\u0001\u0000\u0000\u0000\u018a\u0188\u0001\u0000\u0000\u0000"+
		"\u018a\u018b\u0001\u0000\u0000\u0000\u018b\u018d\u0001\u0000\u0000\u0000"+
		"\u018c\u018a\u0001\u0000\u0000\u0000\u018d\u018e\u0005\u0002\u0000\u0000"+
		"\u018e[\u0001\u0000\u0000\u0000\u0011_gr|\u0082\u0088\u008e\u0090\u00b5"+
		"\u00c6\u00e8\u00ff\u0102\u0112\u0115\u014e\u018a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}