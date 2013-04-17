// Generated from EBNF.g4 by ANTLR 4.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EBNFParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, CONCATENATE_SYMBOL=2, DEFINING_SYMBOL=3, DEFINITION_SEPERATOR_SYMBOL=4, 
		END_GROUP_SYMBOL=5, END_OPTION_SYMBOL=6, END_REPEAT_SYMBOL=7, EXCEPT_SYMBOL=8, 
		REPETITION_SYMBOL=9, SPECIAL_SEQUENCE_SYMBOL=10, START_GROUP_SYMBOL=11, 
		START_OPTION_SYMBOL=12, START_REPEAT_SYMBOL=13, TERMINATOR_SYMBOL=14, 
		META_IDENTIFIER=15, INTEGER=16, TERMINAL_STRING=17, COMMENT=18, SPECIAL_SEQUENCE=19, 
		GAP_SEPERATOR=20;
	public static final String[] tokenNames = {
		"<INVALID>", "''", "','", "'='", "DEFINITION_SEPERATOR_SYMBOL", "')'", 
		"END_OPTION_SYMBOL", "END_REPEAT_SYMBOL", "'-'", "'*'", "'?'", "'('", 
		"START_OPTION_SYMBOL", "START_REPEAT_SYMBOL", "TERMINATOR_SYMBOL", "META_IDENTIFIER", 
		"INTEGER", "TERMINAL_STRING", "COMMENT", "SPECIAL_SEQUENCE", "GAP_SEPERATOR"
	};
	public static final int
		RULE_syntax = 0, RULE_syntax_rule = 1, RULE_definitions_list = 2, RULE_single_definition = 3, 
		RULE_syntactic_term = 4, RULE_syntactic_factor = 5, RULE_syntactic_primary = 6, 
		RULE_optional_sequence = 7, RULE_repeated_sequence = 8, RULE_grouped_sequence = 9, 
		RULE_empty_sequence = 10;
	public static final String[] ruleNames = {
		"syntax", "syntax_rule", "definitions_list", "single_definition", "syntactic_term", 
		"syntactic_factor", "syntactic_primary", "optional_sequence", "repeated_sequence", 
		"grouped_sequence", "empty_sequence"
	};

	@Override
	public String getGrammarFileName() { return "EBNF.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public EBNFParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SyntaxContext extends ParserRuleContext {
		public List<TerminalNode> COMMENT() { return getTokens(EBNFParser.COMMENT); }
		public Syntax_ruleContext syntax_rule(int i) {
			return getRuleContext(Syntax_ruleContext.class,i);
		}
		public List<Syntax_ruleContext> syntax_rule() {
			return getRuleContexts(Syntax_ruleContext.class);
		}
		public TerminalNode COMMENT(int i) {
			return getToken(EBNFParser.COMMENT, i);
		}
		public SyntaxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syntax; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EBNFListener ) ((EBNFListener)listener).enterSyntax(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EBNFListener ) ((EBNFListener)listener).exitSyntax(this);
		}
	}

	public final SyntaxContext syntax() throws RecognitionException {
		SyntaxContext _localctx = new SyntaxContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_syntax);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(24);
				switch (_input.LA(1)) {
				case COMMENT:
					{
					setState(22); match(COMMENT);
					}
					break;
				case META_IDENTIFIER:
					{
					setState(23); syntax_rule();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(26); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==META_IDENTIFIER || _la==COMMENT );
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

	public static class Syntax_ruleContext extends ParserRuleContext {
		public TerminalNode DEFINING_SYMBOL() { return getToken(EBNFParser.DEFINING_SYMBOL, 0); }
		public TerminalNode TERMINATOR_SYMBOL() { return getToken(EBNFParser.TERMINATOR_SYMBOL, 0); }
		public TerminalNode META_IDENTIFIER() { return getToken(EBNFParser.META_IDENTIFIER, 0); }
		public Definitions_listContext definitions_list() {
			return getRuleContext(Definitions_listContext.class,0);
		}
		public Syntax_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syntax_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EBNFListener ) ((EBNFListener)listener).enterSyntax_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EBNFListener ) ((EBNFListener)listener).exitSyntax_rule(this);
		}
	}

	public final Syntax_ruleContext syntax_rule() throws RecognitionException {
		Syntax_ruleContext _localctx = new Syntax_ruleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_syntax_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28); match(META_IDENTIFIER);
			setState(29); match(DEFINING_SYMBOL);
			setState(30); definitions_list();
			setState(31); match(TERMINATOR_SYMBOL);
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

	public static class Definitions_listContext extends ParserRuleContext {
		public List<TerminalNode> DEFINITION_SEPERATOR_SYMBOL() { return getTokens(EBNFParser.DEFINITION_SEPERATOR_SYMBOL); }
		public List<Single_definitionContext> single_definition() {
			return getRuleContexts(Single_definitionContext.class);
		}
		public Single_definitionContext single_definition(int i) {
			return getRuleContext(Single_definitionContext.class,i);
		}
		public TerminalNode DEFINITION_SEPERATOR_SYMBOL(int i) {
			return getToken(EBNFParser.DEFINITION_SEPERATOR_SYMBOL, i);
		}
		public Definitions_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definitions_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EBNFListener ) ((EBNFListener)listener).enterDefinitions_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EBNFListener ) ((EBNFListener)listener).exitDefinitions_list(this);
		}
	}

	public final Definitions_listContext definitions_list() throws RecognitionException {
		Definitions_listContext _localctx = new Definitions_listContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_definitions_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33); single_definition();
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEFINITION_SEPERATOR_SYMBOL) {
				{
				{
				setState(34); match(DEFINITION_SEPERATOR_SYMBOL);
				setState(35); single_definition();
				}
				}
				setState(40);
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

	public static class Single_definitionContext extends ParserRuleContext {
		public TerminalNode CONCATENATE_SYMBOL(int i) {
			return getToken(EBNFParser.CONCATENATE_SYMBOL, i);
		}
		public Syntactic_termContext syntactic_term(int i) {
			return getRuleContext(Syntactic_termContext.class,i);
		}
		public List<Syntactic_termContext> syntactic_term() {
			return getRuleContexts(Syntactic_termContext.class);
		}
		public List<TerminalNode> CONCATENATE_SYMBOL() { return getTokens(EBNFParser.CONCATENATE_SYMBOL); }
		public Single_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EBNFListener ) ((EBNFListener)listener).enterSingle_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EBNFListener ) ((EBNFListener)listener).exitSingle_definition(this);
		}
	}

	public final Single_definitionContext single_definition() throws RecognitionException {
		Single_definitionContext _localctx = new Single_definitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_single_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41); syntactic_term();
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONCATENATE_SYMBOL) {
				{
				{
				setState(42); match(CONCATENATE_SYMBOL);
				setState(43); syntactic_term();
				}
				}
				setState(48);
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

	public static class Syntactic_termContext extends ParserRuleContext {
		public Syntactic_factorContext syntactic_factor(int i) {
			return getRuleContext(Syntactic_factorContext.class,i);
		}
		public TerminalNode EXCEPT_SYMBOL() { return getToken(EBNFParser.EXCEPT_SYMBOL, 0); }
		public List<Syntactic_factorContext> syntactic_factor() {
			return getRuleContexts(Syntactic_factorContext.class);
		}
		public Syntactic_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syntactic_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EBNFListener ) ((EBNFListener)listener).enterSyntactic_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EBNFListener ) ((EBNFListener)listener).exitSyntactic_term(this);
		}
	}

	public final Syntactic_termContext syntactic_term() throws RecognitionException {
		Syntactic_termContext _localctx = new Syntactic_termContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_syntactic_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49); syntactic_factor();
			setState(52);
			_la = _input.LA(1);
			if (_la==EXCEPT_SYMBOL) {
				{
				setState(50); match(EXCEPT_SYMBOL);
				setState(51); syntactic_factor();
				}
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

	public static class Syntactic_factorContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(EBNFParser.INTEGER, 0); }
		public Syntactic_primaryContext syntactic_primary() {
			return getRuleContext(Syntactic_primaryContext.class,0);
		}
		public TerminalNode REPETITION_SYMBOL() { return getToken(EBNFParser.REPETITION_SYMBOL, 0); }
		public Syntactic_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syntactic_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EBNFListener ) ((EBNFListener)listener).enterSyntactic_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EBNFListener ) ((EBNFListener)listener).exitSyntactic_factor(this);
		}
	}

	public final Syntactic_factorContext syntactic_factor() throws RecognitionException {
		Syntactic_factorContext _localctx = new Syntactic_factorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_syntactic_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_la = _input.LA(1);
			if (_la==INTEGER) {
				{
				setState(54); match(INTEGER);
				setState(55); match(REPETITION_SYMBOL);
				}
			}

			setState(58); syntactic_primary();
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

	public static class Syntactic_primaryContext extends ParserRuleContext {
		public Empty_sequenceContext empty_sequence() {
			return getRuleContext(Empty_sequenceContext.class,0);
		}
		public Optional_sequenceContext optional_sequence() {
			return getRuleContext(Optional_sequenceContext.class,0);
		}
		public Repeated_sequenceContext repeated_sequence() {
			return getRuleContext(Repeated_sequenceContext.class,0);
		}
		public TerminalNode TERMINAL_STRING() { return getToken(EBNFParser.TERMINAL_STRING, 0); }
		public TerminalNode META_IDENTIFIER() { return getToken(EBNFParser.META_IDENTIFIER, 0); }
		public Grouped_sequenceContext grouped_sequence() {
			return getRuleContext(Grouped_sequenceContext.class,0);
		}
		public TerminalNode SPECIAL_SEQUENCE() { return getToken(EBNFParser.SPECIAL_SEQUENCE, 0); }
		public Syntactic_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syntactic_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EBNFListener ) ((EBNFListener)listener).enterSyntactic_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EBNFListener ) ((EBNFListener)listener).exitSyntactic_primary(this);
		}
	}

	public final Syntactic_primaryContext syntactic_primary() throws RecognitionException {
		Syntactic_primaryContext _localctx = new Syntactic_primaryContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_syntactic_primary);
		try {
			setState(67);
			switch (_input.LA(1)) {
			case START_OPTION_SYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(60); optional_sequence();
				}
				break;
			case START_REPEAT_SYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(61); repeated_sequence();
				}
				break;
			case START_GROUP_SYMBOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(62); grouped_sequence();
				}
				break;
			case META_IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(63); match(META_IDENTIFIER);
				}
				break;
			case TERMINAL_STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(64); match(TERMINAL_STRING);
				}
				break;
			case SPECIAL_SEQUENCE:
				enterOuterAlt(_localctx, 6);
				{
				setState(65); match(SPECIAL_SEQUENCE);
				}
				break;
			case 1:
				enterOuterAlt(_localctx, 7);
				{
				setState(66); empty_sequence();
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

	public static class Optional_sequenceContext extends ParserRuleContext {
		public TerminalNode START_OPTION_SYMBOL() { return getToken(EBNFParser.START_OPTION_SYMBOL, 0); }
		public TerminalNode END_OPTION_SYMBOL() { return getToken(EBNFParser.END_OPTION_SYMBOL, 0); }
		public Definitions_listContext definitions_list() {
			return getRuleContext(Definitions_listContext.class,0);
		}
		public Optional_sequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optional_sequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EBNFListener ) ((EBNFListener)listener).enterOptional_sequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EBNFListener ) ((EBNFListener)listener).exitOptional_sequence(this);
		}
	}

	public final Optional_sequenceContext optional_sequence() throws RecognitionException {
		Optional_sequenceContext _localctx = new Optional_sequenceContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_optional_sequence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69); match(START_OPTION_SYMBOL);
			setState(70); definitions_list();
			setState(71); match(END_OPTION_SYMBOL);
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

	public static class Repeated_sequenceContext extends ParserRuleContext {
		public Definitions_listContext definitions_list() {
			return getRuleContext(Definitions_listContext.class,0);
		}
		public TerminalNode START_REPEAT_SYMBOL() { return getToken(EBNFParser.START_REPEAT_SYMBOL, 0); }
		public TerminalNode END_REPEAT_SYMBOL() { return getToken(EBNFParser.END_REPEAT_SYMBOL, 0); }
		public Repeated_sequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeated_sequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EBNFListener ) ((EBNFListener)listener).enterRepeated_sequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EBNFListener ) ((EBNFListener)listener).exitRepeated_sequence(this);
		}
	}

	public final Repeated_sequenceContext repeated_sequence() throws RecognitionException {
		Repeated_sequenceContext _localctx = new Repeated_sequenceContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_repeated_sequence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73); match(START_REPEAT_SYMBOL);
			setState(74); definitions_list();
			setState(75); match(END_REPEAT_SYMBOL);
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

	public static class Grouped_sequenceContext extends ParserRuleContext {
		public TerminalNode START_GROUP_SYMBOL() { return getToken(EBNFParser.START_GROUP_SYMBOL, 0); }
		public TerminalNode END_GROUP_SYMBOL() { return getToken(EBNFParser.END_GROUP_SYMBOL, 0); }
		public Definitions_listContext definitions_list() {
			return getRuleContext(Definitions_listContext.class,0);
		}
		public Grouped_sequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grouped_sequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EBNFListener ) ((EBNFListener)listener).enterGrouped_sequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EBNFListener ) ((EBNFListener)listener).exitGrouped_sequence(this);
		}
	}

	public final Grouped_sequenceContext grouped_sequence() throws RecognitionException {
		Grouped_sequenceContext _localctx = new Grouped_sequenceContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_grouped_sequence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77); match(START_GROUP_SYMBOL);
			setState(78); definitions_list();
			setState(79); match(END_GROUP_SYMBOL);
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

	public static class Empty_sequenceContext extends ParserRuleContext {
		public Empty_sequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empty_sequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EBNFListener ) ((EBNFListener)listener).enterEmpty_sequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EBNFListener ) ((EBNFListener)listener).exitEmpty_sequence(this);
		}
	}

	public final Empty_sequenceContext empty_sequence() throws RecognitionException {
		Empty_sequenceContext _localctx = new Empty_sequenceContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_empty_sequence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81); match(1);
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
		"\2\3\26V\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t"+
		"\t\4\n\t\n\4\13\t\13\4\f\t\f\3\2\3\2\6\2\33\n\2\r\2\16\2\34\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\7\4\'\n\4\f\4\16\4*\13\4\3\5\3\5\3\5\7\5/\n\5\f"+
		"\5\16\5\62\13\5\3\6\3\6\3\6\5\6\67\n\6\3\7\3\7\5\7;\n\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\5\bF\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\2\r\2\4\6\b\n\f\16\20\22\24\26\2\2V\2\32\3\2"+
		"\2\2\4\36\3\2\2\2\6#\3\2\2\2\b+\3\2\2\2\n\63\3\2\2\2\f:\3\2\2\2\16E\3"+
		"\2\2\2\20G\3\2\2\2\22K\3\2\2\2\24O\3\2\2\2\26S\3\2\2\2\30\33\7\24\2\2"+
		"\31\33\5\4\3\2\32\30\3\2\2\2\32\31\3\2\2\2\33\34\3\2\2\2\34\32\3\2\2\2"+
		"\34\35\3\2\2\2\35\3\3\2\2\2\36\37\7\21\2\2\37 \7\5\2\2 !\5\6\4\2!\"\7"+
		"\20\2\2\"\5\3\2\2\2#(\5\b\5\2$%\7\6\2\2%\'\5\b\5\2&$\3\2\2\2\'*\3\2\2"+
		"\2(&\3\2\2\2()\3\2\2\2)\7\3\2\2\2*(\3\2\2\2+\60\5\n\6\2,-\7\4\2\2-/\5"+
		"\n\6\2.,\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\t\3\2\2\2\62"+
		"\60\3\2\2\2\63\66\5\f\7\2\64\65\7\n\2\2\65\67\5\f\7\2\66\64\3\2\2\2\66"+
		"\67\3\2\2\2\67\13\3\2\2\289\7\22\2\29;\7\13\2\2:8\3\2\2\2:;\3\2\2\2;<"+
		"\3\2\2\2<=\5\16\b\2=\r\3\2\2\2>F\5\20\t\2?F\5\22\n\2@F\5\24\13\2AF\7\21"+
		"\2\2BF\7\23\2\2CF\7\25\2\2DF\5\26\f\2E>\3\2\2\2E?\3\2\2\2E@\3\2\2\2EA"+
		"\3\2\2\2EB\3\2\2\2EC\3\2\2\2ED\3\2\2\2F\17\3\2\2\2GH\7\16\2\2HI\5\6\4"+
		"\2IJ\7\b\2\2J\21\3\2\2\2KL\7\17\2\2LM\5\6\4\2MN\7\t\2\2N\23\3\2\2\2OP"+
		"\7\r\2\2PQ\5\6\4\2QR\7\7\2\2R\25\3\2\2\2ST\7\3\2\2T\27\3\2\2\2\t\32\34"+
		"(\60\66:E";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}