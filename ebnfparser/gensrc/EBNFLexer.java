// Generated from EBNF.g4 by ANTLR 4.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EBNFLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"''", "','", "'='", "DEFINITION_SEPERATOR_SYMBOL", "')'", "END_OPTION_SYMBOL", 
		"END_REPEAT_SYMBOL", "'-'", "'*'", "'?'", "'('", "START_OPTION_SYMBOL", 
		"START_REPEAT_SYMBOL", "TERMINATOR_SYMBOL", "META_IDENTIFIER", "INTEGER", 
		"TERMINAL_STRING", "COMMENT", "SPECIAL_SEQUENCE", "GAP_SEPERATOR"
	};
	public static final String[] ruleNames = {
		"T__0", "LETTER", "DECIMAL_DIGIT", "START_COMMENT_SYMBOL", "END_COMMENT_SYMBOL", 
		"OTHER_CHARACTER", "SPACE_CHARACTER", "HORIZONTAL_TABULATION_CHARACTER", 
		"NEW_LINE", "VERTICAL_TABULATION_CHARACTER", "FORM_FEED", "FIRST_QUOTE_SYMBOL", 
		"SECOND_QUOTE_SYMBOL", "TERMINAL_CHARACTERS", "META_IDENTIFIER_CHARACTERS", 
		"CONCATENATE_SYMBOL", "DEFINING_SYMBOL", "DEFINITION_SEPERATOR_SYMBOL", 
		"END_GROUP_SYMBOL", "END_OPTION_SYMBOL", "END_REPEAT_SYMBOL", "EXCEPT_SYMBOL", 
		"REPETITION_SYMBOL", "SPECIAL_SEQUENCE_SYMBOL", "START_GROUP_SYMBOL", 
		"START_OPTION_SYMBOL", "START_REPEAT_SYMBOL", "TERMINATOR_SYMBOL", "META_IDENTIFIER", 
		"INTEGER", "TERMINAL_STRING", "COMMENT", "SPECIAL_SEQUENCE", "GAP_SEPERATOR"
	};


	public EBNFLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "EBNF.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 33: GAP_SEPERATOR_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void GAP_SEPERATOR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\26\u00cf\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\3\2\3\3\3\3\3\4\3\4\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\5\17h\n\17\3\20\3\20\3\20\5\20"+
		"m\n\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\5\25z\n"+
		"\25\3\26\3\26\3\26\5\26\177\n\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3"+
		"\32\3\33\3\33\3\33\5\33\u008c\n\33\3\34\3\34\3\34\5\34\u0091\n\34\3\35"+
		"\3\35\3\36\3\36\7\36\u0097\n\36\f\36\16\36\u009a\13\36\3\37\6\37\u009d"+
		"\n\37\r\37\16\37\u009e\3 \3 \6 \u00a3\n \r \16 \u00a4\3 \3 \3 \3 \6 \u00ab"+
		"\n \r \16 \u00ac\3 \3 \5 \u00b1\n \3!\3!\7!\u00b5\n!\f!\16!\u00b8\13!"+
		"\3!\3!\3\"\3\"\7\"\u00be\n\"\f\"\16\"\u00c1\13\"\3\"\3\"\3#\3#\3#\3#\3"+
		"#\6#\u00ca\n#\r#\16#\u00cb\3#\3#\4\u00b6\u00bf$\3\3\1\5\2\1\7\2\1\t\2"+
		"\1\13\2\1\r\2\1\17\2\1\21\2\1\23\2\1\25\2\1\27\2\1\31\2\1\33\2\1\35\2"+
		"\1\37\2\1!\4\1#\5\1%\6\1\'\7\1)\b\1+\t\1-\n\1/\13\1\61\f\1\63\r\1\65\16"+
		"\1\67\17\19\20\1;\21\1=\22\1?\23\1A\24\1C\25\1E\26\2\3\2\t\4C\\c|\3\62"+
		";\f\"\"%(--<<>>@@BB^^`b\u0080\u0080\4\f\f\17\17\5/\60==??\5##\61\61~~"+
		"\4\60\60==\u00d5\2\3\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\3G\3\2\2\2\5H\3\2\2\2\7J\3\2\2\2"+
		"\tL\3\2\2\2\13O\3\2\2\2\rR\3\2\2\2\17T\3\2\2\2\21V\3\2\2\2\23X\3\2\2\2"+
		"\25Z\3\2\2\2\27\\\3\2\2\2\31^\3\2\2\2\33`\3\2\2\2\35g\3\2\2\2\37l\3\2"+
		"\2\2!n\3\2\2\2#p\3\2\2\2%r\3\2\2\2\'t\3\2\2\2)y\3\2\2\2+~\3\2\2\2-\u0080"+
		"\3\2\2\2/\u0082\3\2\2\2\61\u0084\3\2\2\2\63\u0086\3\2\2\2\65\u008b\3\2"+
		"\2\2\67\u0090\3\2\2\29\u0092\3\2\2\2;\u0094\3\2\2\2=\u009c\3\2\2\2?\u00b0"+
		"\3\2\2\2A\u00b2\3\2\2\2C\u00bb\3\2\2\2E\u00c9\3\2\2\2HI\t\2\2\2I\6\3\2"+
		"\2\2JK\t\3\2\2K\b\3\2\2\2LM\7*\2\2MN\7,\2\2N\n\3\2\2\2OP\7,\2\2PQ\7+\2"+
		"\2Q\f\3\2\2\2RS\t\4\2\2S\16\3\2\2\2TU\7\"\2\2U\20\3\2\2\2VW\7\13\2\2W"+
		"\22\3\2\2\2XY\t\5\2\2Y\24\3\2\2\2Z[\7\25\2\2[\26\3\2\2\2\\]\7\16\2\2]"+
		"\30\3\2\2\2^_\7)\2\2_\32\3\2\2\2`a\7$\2\2a\34\3\2\2\2bh\5\5\3\2ch\5\7"+
		"\4\2dh\5\r\7\2eh\5\33\16\2fh\t\6\2\2gb\3\2\2\2gc\3\2\2\2gd\3\2\2\2ge\3"+
		"\2\2\2gf\3\2\2\2h\36\3\2\2\2im\5\5\3\2jm\5\7\4\2km\7\"\2\2li\3\2\2\2l"+
		"j\3\2\2\2lk\3\2\2\2m \3\2\2\2no\7.\2\2o\"\3\2\2\2pq\7?\2\2q$\3\2\2\2r"+
		"s\t\7\2\2s&\3\2\2\2tu\7+\2\2u(\3\2\2\2vz\7_\2\2wx\7\61\2\2xz\7+\2\2yv"+
		"\3\2\2\2yw\3\2\2\2z*\3\2\2\2{\177\7\177\2\2|}\7<\2\2}\177\7+\2\2~{\3\2"+
		"\2\2~|\3\2\2\2\177,\3\2\2\2\u0080\u0081\7/\2\2\u0081.\3\2\2\2\u0082\u0083"+
		"\7,\2\2\u0083\60\3\2\2\2\u0084\u0085\7A\2\2\u0085\62\3\2\2\2\u0086\u0087"+
		"\7*\2\2\u0087\64\3\2\2\2\u0088\u008c\7]\2\2\u0089\u008a\7*\2\2\u008a\u008c"+
		"\7\61\2\2\u008b\u0088\3\2\2\2\u008b\u0089\3\2\2\2\u008c\66\3\2\2\2\u008d"+
		"\u0091\7}\2\2\u008e\u008f\7*\2\2\u008f\u0091\7<\2\2\u0090\u008d\3\2\2"+
		"\2\u0090\u008e\3\2\2\2\u00918\3\2\2\2\u0092\u0093\t\b\2\2\u0093:\3\2\2"+
		"\2\u0094\u0098\5\5\3\2\u0095\u0097\5\37\20\2\u0096\u0095\3\2\2\2\u0097"+
		"\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099<\3\2\2\2"+
		"\u009a\u0098\3\2\2\2\u009b\u009d\5\7\4\2\u009c\u009b\3\2\2\2\u009d\u009e"+
		"\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f>\3\2\2\2\u00a0"+
		"\u00a2\5\31\r\2\u00a1\u00a3\5\35\17\2\u00a2\u00a1\3\2\2\2\u00a3\u00a4"+
		"\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\u00a7\5\31\r\2\u00a7\u00b1\3\2\2\2\u00a8\u00aa\5\33\16\2\u00a9\u00ab"+
		"\5\35\17\2\u00aa\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00aa\3\2\2\2"+
		"\u00ac\u00ad\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\5\33\16\2\u00af\u00b1"+
		"\3\2\2\2\u00b0\u00a0\3\2\2\2\u00b0\u00a8\3\2\2\2\u00b1@\3\2\2\2\u00b2"+
		"\u00b6\5\t\5\2\u00b3\u00b5\13\2\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b8\3"+
		"\2\2\2\u00b6\u00b7\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8"+
		"\u00b6\3\2\2\2\u00b9\u00ba\5\13\6\2\u00baB\3\2\2\2\u00bb\u00bf\5\61\31"+
		"\2\u00bc\u00be\13\2\2\2\u00bd\u00bc\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00bf\3\2"+
		"\2\2\u00c2\u00c3\5\61\31\2\u00c3D\3\2\2\2\u00c4\u00ca\5\17\b\2\u00c5\u00ca"+
		"\5\21\t\2\u00c6\u00ca\5\23\n\2\u00c7\u00ca\5\25\13\2\u00c8\u00ca\5\27"+
		"\f\2\u00c9\u00c4\3\2\2\2\u00c9\u00c5\3\2\2\2\u00c9\u00c6\3\2\2\2\u00c9"+
		"\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00c9\3\2"+
		"\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\b#\2\2\u00ce"+
		"F\3\2\2\2\22\2gly~\u008b\u0090\u0098\u009e\u00a4\u00ac\u00b0\u00b6\u00bf"+
		"\u00c9\u00cb";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}