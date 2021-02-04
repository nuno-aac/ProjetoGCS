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
		FIND=8, GET=9, TOTEACH=10, TO=11, WITH=12, NUM=13, TEXT=14, SETA=15, BARRA=16, 
		VIR=17, PVIR=18, PTO=19, LEFTCURL=20, RIGHTCURL=21, LEFTPAREN=22, RIGHTPAREN=23, 
		LEFTSTRAIGHT=24, RIGHTSTRAIGHT=25, RANGE=26, WS=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"RECURSOS", "ALUNOS", "LONG", "MEDIUM", "SHORT", "ALUNOID", "QUESTION", 
			"FIND", "GET", "TOTEACH", "TO", "WITH", "NUM", "TEXT", "SETA", "BARRA", 
			"VIR", "PVIR", "PTO", "LEFTCURL", "RIGHTCURL", "LEFTPAREN", "RIGHTPAREN", 
			"LEFTSTRAIGHT", "RIGHTSTRAIGHT", "RANGE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'ALUNOS'", null, null, null, null, "'?'", null, null, "'TOTEACH'", 
			"'TO'", "'WITH'", null, null, "'->'", "'|'", "','", "';'", "'.'", "'{'", 
			"'}'", "'('", "')'", "'['", "']'", "'..'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "RECURSOS", "ALUNOS", "LONG", "MEDIUM", "SHORT", "ALUNOID", "QUESTION", 
			"FIND", "GET", "TOTEACH", "TO", "WITH", "NUM", "TEXT", "SETA", "BARRA", 
			"VIR", "PVIR", "PTO", "LEFTCURL", "RIGHTCURL", "LEFTPAREN", "RIGHTPAREN", 
			"LEFTSTRAIGHT", "RIGHTSTRAIGHT", "RANGE", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u00a8\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\5\7"+
		"S\n\7\3\7\6\7V\n\7\r\7\16\7W\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\ta\n\t\3\n"+
		"\3\n\3\n\3\n\5\ng\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\16\5\16z\n\16\3\16\6\16}\n\16\r\16\16\16~\3"+
		"\17\6\17\u0082\n\17\r\17\16\17\u0083\3\20\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\33\3\34\5\34\u00a1\n\34\3\34\3\34\5\34\u00a5\n"+
		"\34\3\34\3\34\2\2\35\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\35\3\2\25\3\2TT\3\2GG\3\2EE\3\2WW\3\2UU\3\2QQ\4\2NNnn\4\2OO"+
		"oo\4\2UUuu\3\2\62;\4\2HHhh\4\2KKkk\4\2PPpp\4\2FFff\4\2IIii\4\2GGgg\4\2"+
		"VVvv\4\2C\\c|\4\2\13\13\"\"\2\u00b0\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\39\3\2\2\2\5B\3\2\2\2\7I\3\2\2\2\tK\3\2\2\2\13M\3"+
		"\2\2\2\rR\3\2\2\2\17Y\3\2\2\2\21`\3\2\2\2\23f\3\2\2\2\25h\3\2\2\2\27p"+
		"\3\2\2\2\31s\3\2\2\2\33y\3\2\2\2\35\u0081\3\2\2\2\37\u0085\3\2\2\2!\u0088"+
		"\3\2\2\2#\u008a\3\2\2\2%\u008c\3\2\2\2\'\u008e\3\2\2\2)\u0090\3\2\2\2"+
		"+\u0092\3\2\2\2-\u0094\3\2\2\2/\u0096\3\2\2\2\61\u0098\3\2\2\2\63\u009a"+
		"\3\2\2\2\65\u009c\3\2\2\2\67\u00a4\3\2\2\29:\t\2\2\2:;\t\3\2\2;<\t\4\2"+
		"\2<=\t\5\2\2=>\t\2\2\2>?\t\6\2\2?@\t\7\2\2@A\t\6\2\2A\4\3\2\2\2BC\7C\2"+
		"\2CD\7N\2\2DE\7W\2\2EF\7P\2\2FG\7Q\2\2GH\7U\2\2H\6\3\2\2\2IJ\t\b\2\2J"+
		"\b\3\2\2\2KL\t\t\2\2L\n\3\2\2\2MN\t\n\2\2N\f\3\2\2\2OS\7C\2\2PQ\7R\2\2"+
		"QS\7I\2\2RO\3\2\2\2RP\3\2\2\2SU\3\2\2\2TV\t\13\2\2UT\3\2\2\2VW\3\2\2\2"+
		"WU\3\2\2\2WX\3\2\2\2X\16\3\2\2\2YZ\7A\2\2Z\20\3\2\2\2[\\\t\f\2\2\\]\t"+
		"\r\2\2]^\t\16\2\2^a\t\17\2\2_a\t\f\2\2`[\3\2\2\2`_\3\2\2\2a\22\3\2\2\2"+
		"bc\t\20\2\2cd\t\21\2\2dg\t\22\2\2eg\t\20\2\2fb\3\2\2\2fe\3\2\2\2g\24\3"+
		"\2\2\2hi\7V\2\2ij\7Q\2\2jk\7V\2\2kl\7G\2\2lm\7C\2\2mn\7E\2\2no\7J\2\2"+
		"o\26\3\2\2\2pq\7V\2\2qr\7Q\2\2r\30\3\2\2\2st\7Y\2\2tu\7K\2\2uv\7V\2\2"+
		"vw\7J\2\2w\32\3\2\2\2xz\7/\2\2yx\3\2\2\2yz\3\2\2\2z|\3\2\2\2{}\t\13\2"+
		"\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\34\3\2\2\2\u0080\u0082"+
		"\t\23\2\2\u0081\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0081\3\2\2\2"+
		"\u0083\u0084\3\2\2\2\u0084\36\3\2\2\2\u0085\u0086\7/\2\2\u0086\u0087\7"+
		"@\2\2\u0087 \3\2\2\2\u0088\u0089\7~\2\2\u0089\"\3\2\2\2\u008a\u008b\7"+
		".\2\2\u008b$\3\2\2\2\u008c\u008d\7=\2\2\u008d&\3\2\2\2\u008e\u008f\7\60"+
		"\2\2\u008f(\3\2\2\2\u0090\u0091\7}\2\2\u0091*\3\2\2\2\u0092\u0093\7\177"+
		"\2\2\u0093,\3\2\2\2\u0094\u0095\7*\2\2\u0095.\3\2\2\2\u0096\u0097\7+\2"+
		"\2\u0097\60\3\2\2\2\u0098\u0099\7]\2\2\u0099\62\3\2\2\2\u009a\u009b\7"+
		"_\2\2\u009b\64\3\2\2\2\u009c\u009d\7\60\2\2\u009d\u009e\7\60\2\2\u009e"+
		"\66\3\2\2\2\u009f\u00a1\7\17\2\2\u00a0\u009f\3\2\2\2\u00a0\u00a1\3\2\2"+
		"\2\u00a1\u00a2\3\2\2\2\u00a2\u00a5\7\f\2\2\u00a3\u00a5\t\24\2\2\u00a4"+
		"\u00a0\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\b\34"+
		"\2\2\u00a78\3\2\2\2\f\2RW`fy~\u0083\u00a0\u00a4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}