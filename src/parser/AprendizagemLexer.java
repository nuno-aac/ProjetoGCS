// Generated from C:/Users/GL502V/Documents/Univ/Mestrado/GA/Projeto/src\Aprendizagem.g4 by ANTLR 4.9
package parser;

    import aprendizagem.*;
    import java.util.ArrayList;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AprendizagemLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		RECURSOS=1, ALUNOS=2, LONG=3, MEDIUM=4, SHORT=5, ALUNOID=6, QUESTION=7, 
		FIND=8, TOTEACH=9, TO=10, WITH=11, NUM=12, TEXT=13, SETA=14, BARRA=15, 
		VIR=16, PVIR=17, PTO=18, LEFTCURL=19, RIGHTCURL=20, LEFTPAREN=21, RIGHTPAREN=22, 
		LEFTSTRAIGHT=23, RIGHTSTRAIGHT=24, RANGE=25, WS=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"RECURSOS", "ALUNOS", "LONG", "MEDIUM", "SHORT", "ALUNOID", "QUESTION", 
			"FIND", "TOTEACH", "TO", "WITH", "NUM", "TEXT", "SETA", "BARRA", "VIR", 
			"PVIR", "PTO", "LEFTCURL", "RIGHTCURL", "LEFTPAREN", "RIGHTPAREN", "LEFTSTRAIGHT", 
			"RIGHTSTRAIGHT", "RANGE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'ALUNOS'", null, null, null, null, "'?'", null, "'TOTEACH'", 
			"'TO'", "'WITH'", null, null, "'->'", "'|'", "','", "';'", "'.'", "'{'", 
			"'}'", "'('", "')'", "'['", "']'", "'..'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "RECURSOS", "ALUNOS", "LONG", "MEDIUM", "SHORT", "ALUNOID", "QUESTION", 
			"FIND", "TOTEACH", "TO", "WITH", "NUM", "TEXT", "SETA", "BARRA", "VIR", 
			"PVIR", "PTO", "LEFTCURL", "RIGHTCURL", "LEFTPAREN", "RIGHTPAREN", "LEFTSTRAIGHT", 
			"RIGHTSTRAIGHT", "RANGE", "WS"
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


	public AprendizagemLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Aprendizagem.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u00a0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\5\7Q\n\7\3\7"+
		"\6\7T\n\7\r\7\16\7U\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\t_\n\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\5\rr\n\r\3\r"+
		"\6\ru\n\r\r\r\16\rv\3\16\6\16z\n\16\r\16\16\16{\3\17\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3"+
		"\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\5\33\u0099\n\33\3\33\3\33"+
		"\5\33\u009d\n\33\3\33\3\33\2\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\3\2\22\3\2TT\3\2GG\3\2EE\3\2WW\3\2UU\3\2QQ\4\2NNnn"+
		"\4\2OOoo\4\2UUuu\3\2\62;\4\2HHhh\4\2KKkk\4\2PPpp\4\2FFff\4\2C\\c|\4\2"+
		"\13\13\"\"\2\u00a7\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\3\67\3\2\2\2"+
		"\5@\3\2\2\2\7G\3\2\2\2\tI\3\2\2\2\13K\3\2\2\2\rP\3\2\2\2\17W\3\2\2\2\21"+
		"^\3\2\2\2\23`\3\2\2\2\25h\3\2\2\2\27k\3\2\2\2\31q\3\2\2\2\33y\3\2\2\2"+
		"\35}\3\2\2\2\37\u0080\3\2\2\2!\u0082\3\2\2\2#\u0084\3\2\2\2%\u0086\3\2"+
		"\2\2\'\u0088\3\2\2\2)\u008a\3\2\2\2+\u008c\3\2\2\2-\u008e\3\2\2\2/\u0090"+
		"\3\2\2\2\61\u0092\3\2\2\2\63\u0094\3\2\2\2\65\u009c\3\2\2\2\678\t\2\2"+
		"\289\t\3\2\29:\t\4\2\2:;\t\5\2\2;<\t\2\2\2<=\t\6\2\2=>\t\7\2\2>?\t\6\2"+
		"\2?\4\3\2\2\2@A\7C\2\2AB\7N\2\2BC\7W\2\2CD\7P\2\2DE\7Q\2\2EF\7U\2\2F\6"+
		"\3\2\2\2GH\t\b\2\2H\b\3\2\2\2IJ\t\t\2\2J\n\3\2\2\2KL\t\n\2\2L\f\3\2\2"+
		"\2MQ\7C\2\2NO\7R\2\2OQ\7I\2\2PM\3\2\2\2PN\3\2\2\2QS\3\2\2\2RT\t\13\2\2"+
		"SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2V\16\3\2\2\2WX\7A\2\2X\20\3\2"+
		"\2\2YZ\t\f\2\2Z[\t\r\2\2[\\\t\16\2\2\\_\t\17\2\2]_\t\f\2\2^Y\3\2\2\2^"+
		"]\3\2\2\2_\22\3\2\2\2`a\7V\2\2ab\7Q\2\2bc\7V\2\2cd\7G\2\2de\7C\2\2ef\7"+
		"E\2\2fg\7J\2\2g\24\3\2\2\2hi\7V\2\2ij\7Q\2\2j\26\3\2\2\2kl\7Y\2\2lm\7"+
		"K\2\2mn\7V\2\2no\7J\2\2o\30\3\2\2\2pr\7/\2\2qp\3\2\2\2qr\3\2\2\2rt\3\2"+
		"\2\2su\t\13\2\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\32\3\2\2\2xz"+
		"\t\20\2\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\34\3\2\2\2}~\7/\2\2"+
		"~\177\7@\2\2\177\36\3\2\2\2\u0080\u0081\7~\2\2\u0081 \3\2\2\2\u0082\u0083"+
		"\7.\2\2\u0083\"\3\2\2\2\u0084\u0085\7=\2\2\u0085$\3\2\2\2\u0086\u0087"+
		"\7\60\2\2\u0087&\3\2\2\2\u0088\u0089\7}\2\2\u0089(\3\2\2\2\u008a\u008b"+
		"\7\177\2\2\u008b*\3\2\2\2\u008c\u008d\7*\2\2\u008d,\3\2\2\2\u008e\u008f"+
		"\7+\2\2\u008f.\3\2\2\2\u0090\u0091\7]\2\2\u0091\60\3\2\2\2\u0092\u0093"+
		"\7_\2\2\u0093\62\3\2\2\2\u0094\u0095\7\60\2\2\u0095\u0096\7\60\2\2\u0096"+
		"\64\3\2\2\2\u0097\u0099\7\17\2\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2"+
		"\2\u0099\u009a\3\2\2\2\u009a\u009d\7\f\2\2\u009b\u009d\t\21\2\2\u009c"+
		"\u0098\3\2\2\2\u009c\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\b\33"+
		"\2\2\u009f\66\3\2\2\2\13\2PU^qv{\u0098\u009c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}