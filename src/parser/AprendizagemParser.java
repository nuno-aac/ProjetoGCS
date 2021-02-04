// Generated from C:/Users/GL502V/Documents/Univ/Mestrado/GA/Projeto/src\Aprendizagem.g4 by ANTLR 4.9
package parser;

    import aprendizagem.*;
    import java.util.ArrayList;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AprendizagemParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		RECURSOS=1, ALUNOS=2, LONG=3, MEDIUM=4, SHORT=5, ALUNOID=6, QUESTION=7, 
		FIND=8, GET=9, TOTEACH=10, TO=11, WITH=12, NUM=13, TEXT=14, SETA=15, BARRA=16, 
		VIR=17, PVIR=18, PTO=19, LEFTCURL=20, RIGHTCURL=21, LEFTPAREN=22, RIGHTPAREN=23, 
		LEFTSTRAIGHT=24, RIGHTSTRAIGHT=25, RANGE=26, WS=27;
	public static final int
		RULE_aprendizagem = 0, RULE_recursos = 1, RULE_recursol = 2, RULE_recurso = 3, 
		RULE_id = 4, RULE_desc = 5, RULE_atributos = 6, RULE_idade_range = 7, 
		RULE_tempo = 8, RULE_lista_emocional = 9, RULE_emocaol = 10, RULE_emocao = 11, 
		RULE_quadrante = 12, RULE_x = 13, RULE_y = 14, RULE_cprogs = 15, RULE_cprogl = 16, 
		RULE_cprog = 17, RULE_alunos = 18, RULE_aluno = 19, RULE_idade = 20, RULE_personalidade = 21, 
		RULE_queries = 22, RULE_querie = 23, RULE_recursoquerie = 24, RULE_tipos = 25, 
		RULE_tipo = 26, RULE_recursotarget = 27, RULE_alunotarget = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"aprendizagem", "recursos", "recursol", "recurso", "id", "desc", "atributos", 
			"idade_range", "tempo", "lista_emocional", "emocaol", "emocao", "quadrante", 
			"x", "y", "cprogs", "cprogl", "cprog", "alunos", "aluno", "idade", "personalidade", 
			"queries", "querie", "recursoquerie", "tipos", "tipo", "recursotarget", 
			"alunotarget"
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

	@Override
	public String getGrammarFileName() { return "Aprendizagem.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AprendizagemParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class AprendizagemContext extends ParserRuleContext {
		public RecursosContext recursos;
		public AlunosContext alunos;
		public TerminalNode RECURSOS() { return getToken(AprendizagemParser.RECURSOS, 0); }
		public List<TerminalNode> LEFTCURL() { return getTokens(AprendizagemParser.LEFTCURL); }
		public TerminalNode LEFTCURL(int i) {
			return getToken(AprendizagemParser.LEFTCURL, i);
		}
		public RecursosContext recursos() {
			return getRuleContext(RecursosContext.class,0);
		}
		public List<TerminalNode> RIGHTCURL() { return getTokens(AprendizagemParser.RIGHTCURL); }
		public TerminalNode RIGHTCURL(int i) {
			return getToken(AprendizagemParser.RIGHTCURL, i);
		}
		public TerminalNode ALUNOS() { return getToken(AprendizagemParser.ALUNOS, 0); }
		public AlunosContext alunos() {
			return getRuleContext(AlunosContext.class,0);
		}
		public QueriesContext queries() {
			return getRuleContext(QueriesContext.class,0);
		}
		public AprendizagemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aprendizagem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprendizagemListener ) ((AprendizagemListener)listener).enterAprendizagem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprendizagemListener ) ((AprendizagemListener)listener).exitAprendizagem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprendizagemVisitor ) return ((AprendizagemVisitor<? extends T>)visitor).visitAprendizagem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AprendizagemContext aprendizagem() throws RecognitionException {
		AprendizagemContext _localctx = new AprendizagemContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_aprendizagem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 Database data = new Database(); 
			setState(59);
			match(RECURSOS);
			setState(60);
			match(LEFTCURL);
			setState(61);
			((AprendizagemContext)_localctx).recursos = recursos();
			setState(62);
			match(RIGHTCURL);
			 data.setRecursos(((AprendizagemContext)_localctx).recursos.lista); 
			setState(64);
			match(ALUNOS);
			setState(65);
			match(LEFTCURL);
			setState(66);
			((AprendizagemContext)_localctx).alunos = alunos();
			setState(67);
			match(RIGHTCURL);
			 data.setAlunos(((AprendizagemContext)_localctx).alunos.lista); 
			setState(69);
			queries(data);
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

	public static class RecursosContext extends ParserRuleContext {
		public ArrayList<Recurso> lista;
		public List<RecursolContext> recursol() {
			return getRuleContexts(RecursolContext.class);
		}
		public RecursolContext recursol(int i) {
			return getRuleContext(RecursolContext.class,i);
		}
		public List<TerminalNode> PVIR() { return getTokens(AprendizagemParser.PVIR); }
		public TerminalNode PVIR(int i) {
			return getToken(AprendizagemParser.PVIR, i);
		}
		public RecursosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recursos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprendizagemListener ) ((AprendizagemListener)listener).enterRecursos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprendizagemListener ) ((AprendizagemListener)listener).exitRecursos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprendizagemVisitor ) return ((AprendizagemVisitor<? extends T>)visitor).visitRecursos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecursosContext recursos() throws RecognitionException {
		RecursosContext _localctx = new RecursosContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_recursos);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			 ((RecursosContext)_localctx).lista =  new ArrayList<>(); 
			setState(72);
			recursol(_localctx.lista);
			setState(77);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(73);
					match(PVIR);
					setState(74);
					recursol(_localctx.lista);
					}
					} 
				}
				setState(79);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(80);
			match(PVIR);
			 System.out.println("[INFO] Recursos lidos: " + _localctx.lista.size()); 
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

	public static class RecursolContext extends ParserRuleContext {
		public ArrayList<Recurso> lista;
		public IdContext id;
		public DescContext desc;
		public TipoContext tipo;
		public AtributosContext atributos;
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public List<TerminalNode> VIR() { return getTokens(AprendizagemParser.VIR); }
		public TerminalNode VIR(int i) {
			return getToken(AprendizagemParser.VIR, i);
		}
		public DescContext desc() {
			return getRuleContext(DescContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public AtributosContext atributos() {
			return getRuleContext(AtributosContext.class,0);
		}
		public RecursolContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public RecursolContext(ParserRuleContext parent, int invokingState, ArrayList<Recurso> lista) {
			super(parent, invokingState);
			this.lista = lista;
		}
		@Override public int getRuleIndex() { return RULE_recursol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprendizagemListener ) ((AprendizagemListener)listener).enterRecursol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprendizagemListener ) ((AprendizagemListener)listener).exitRecursol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprendizagemVisitor ) return ((AprendizagemVisitor<? extends T>)visitor).visitRecursol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecursolContext recursol(ArrayList<Recurso> lista) throws RecognitionException {
		RecursolContext _localctx = new RecursolContext(_ctx, getState(), lista);
		enterRule(_localctx, 4, RULE_recursol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 Recurso rec = new Recurso(); 
			setState(84);
			((RecursolContext)_localctx).id = id();
			setState(85);
			match(VIR);
			 rec.setId(Integer.parseInt((((RecursolContext)_localctx).id!=null?_input.getText(((RecursolContext)_localctx).id.start,((RecursolContext)_localctx).id.stop):null))); 
			setState(87);
			((RecursolContext)_localctx).desc = desc();
			setState(88);
			match(VIR);
			 rec.setDesc((((RecursolContext)_localctx).desc!=null?_input.getText(((RecursolContext)_localctx).desc.start,((RecursolContext)_localctx).desc.stop):null)); 
			setState(90);
			((RecursolContext)_localctx).tipo = tipo();
			setState(91);
			match(VIR);
			 rec.setTipo((((RecursolContext)_localctx).tipo!=null?_input.getText(((RecursolContext)_localctx).tipo.start,((RecursolContext)_localctx).tipo.stop):null)); 
			setState(93);
			((RecursolContext)_localctx).atributos = atributos();
			 rec.setAtributos(((RecursolContext)_localctx).atributos.atr); lista.add(rec); 
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

	public static class RecursoContext extends ParserRuleContext {
		public Recurso rec;
		public IdContext id;
		public DescContext desc;
		public TipoContext tipo;
		public AtributosContext atributos;
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public List<TerminalNode> VIR() { return getTokens(AprendizagemParser.VIR); }
		public TerminalNode VIR(int i) {
			return getToken(AprendizagemParser.VIR, i);
		}
		public DescContext desc() {
			return getRuleContext(DescContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public AtributosContext atributos() {
			return getRuleContext(AtributosContext.class,0);
		}
		public RecursoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recurso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprendizagemListener ) ((AprendizagemListener)listener).enterRecurso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprendizagemListener ) ((AprendizagemListener)listener).exitRecurso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprendizagemVisitor ) return ((AprendizagemVisitor<? extends T>)visitor).visitRecurso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecursoContext recurso() throws RecognitionException {
		RecursoContext _localctx = new RecursoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_recurso);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((RecursoContext)_localctx).rec =  new Recurso(); 
			setState(97);
			((RecursoContext)_localctx).id = id();
			setState(98);
			match(VIR);
			 _localctx.rec.setId(Integer.parseInt((((RecursoContext)_localctx).id!=null?_input.getText(((RecursoContext)_localctx).id.start,((RecursoContext)_localctx).id.stop):null))); 
			setState(100);
			((RecursoContext)_localctx).desc = desc();
			setState(101);
			match(VIR);
			 _localctx.rec.setDesc((((RecursoContext)_localctx).desc!=null?_input.getText(((RecursoContext)_localctx).desc.start,((RecursoContext)_localctx).desc.stop):null)); 
			setState(103);
			((RecursoContext)_localctx).tipo = tipo();
			setState(104);
			match(VIR);
			 _localctx.rec.setTipo((((RecursoContext)_localctx).tipo!=null?_input.getText(((RecursoContext)_localctx).tipo.start,((RecursoContext)_localctx).tipo.stop):null)); 
			setState(106);
			((RecursoContext)_localctx).atributos = atributos();
			 _localctx.rec.setAtributos(((RecursoContext)_localctx).atributos.atr); System.out.println(_localctx.rec.toString()); 
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(AprendizagemParser.NUM, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprendizagemListener ) ((AprendizagemListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprendizagemListener ) ((AprendizagemListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprendizagemVisitor ) return ((AprendizagemVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(NUM);
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

	public static class DescContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(AprendizagemParser.TEXT, 0); }
		public DescContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_desc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprendizagemListener ) ((AprendizagemListener)listener).enterDesc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprendizagemListener ) ((AprendizagemListener)listener).exitDesc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprendizagemVisitor ) return ((AprendizagemVisitor<? extends T>)visitor).visitDesc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescContext desc() throws RecognitionException {
		DescContext _localctx = new DescContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_desc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(TEXT);
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

	public static class AtributosContext extends ParserRuleContext {
		public Atributos atr;
		public Idade_rangeContext idade_range;
		public TempoContext tempo;
		public Lista_emocionalContext lista_emocional;
		public CprogsContext cprogs;
		public TerminalNode LEFTPAREN() { return getToken(AprendizagemParser.LEFTPAREN, 0); }
		public Idade_rangeContext idade_range() {
			return getRuleContext(Idade_rangeContext.class,0);
		}
		public List<TerminalNode> VIR() { return getTokens(AprendizagemParser.VIR); }
		public TerminalNode VIR(int i) {
			return getToken(AprendizagemParser.VIR, i);
		}
		public TempoContext tempo() {
			return getRuleContext(TempoContext.class,0);
		}
		public Lista_emocionalContext lista_emocional() {
			return getRuleContext(Lista_emocionalContext.class,0);
		}
		public CprogsContext cprogs() {
			return getRuleContext(CprogsContext.class,0);
		}
		public TerminalNode RIGHTPAREN() { return getToken(AprendizagemParser.RIGHTPAREN, 0); }
		public AtributosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atributos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprendizagemListener ) ((AprendizagemListener)listener).enterAtributos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprendizagemListener ) ((AprendizagemListener)listener).exitAtributos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprendizagemVisitor ) return ((AprendizagemVisitor<? extends T>)visitor).visitAtributos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtributosContext atributos() throws RecognitionException {
		AtributosContext _localctx = new AtributosContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_atributos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((AtributosContext)_localctx).atr =  new Atributos(); 
			setState(114);
			match(LEFTPAREN);
			setState(115);
			((AtributosContext)_localctx).idade_range = idade_range();
			setState(116);
			match(VIR);
			 _localctx.atr.setIdadeMin(((AtributosContext)_localctx).idade_range.min); _localctx.atr.setIdadeMax(((AtributosContext)_localctx).idade_range.max); 
			setState(118);
			((AtributosContext)_localctx).tempo = tempo();
			setState(119);
			match(VIR);
			 _localctx.atr.setTempo((((AtributosContext)_localctx).tempo!=null?_input.getText(((AtributosContext)_localctx).tempo.start,((AtributosContext)_localctx).tempo.stop):null).charAt(0)); 
			setState(121);
			((AtributosContext)_localctx).lista_emocional = lista_emocional();
			setState(122);
			match(VIR);
			 for(Emocao e : ((AtributosContext)_localctx).lista_emocional.lista){ _localctx.atr.addEmocao(e); } 
			setState(124);
			((AtributosContext)_localctx).cprogs = cprogs();
			 for(String cp : ((AtributosContext)_localctx).cprogs.lista){ _localctx.atr.addCprog(cp); } 
			setState(126);
			match(RIGHTPAREN);
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

	public static class Idade_rangeContext extends ParserRuleContext {
		public int min;
		public int max;
		public Token NUM;
		public List<TerminalNode> NUM() { return getTokens(AprendizagemParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(AprendizagemParser.NUM, i);
		}
		public TerminalNode RANGE() { return getToken(AprendizagemParser.RANGE, 0); }
		public Idade_rangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idade_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprendizagemListener ) ((AprendizagemListener)listener).enterIdade_range(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprendizagemListener ) ((AprendizagemListener)listener).exitIdade_range(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprendizagemVisitor ) return ((AprendizagemVisitor<? extends T>)visitor).visitIdade_range(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Idade_rangeContext idade_range() throws RecognitionException {
		Idade_rangeContext _localctx = new Idade_rangeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_idade_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			((Idade_rangeContext)_localctx).NUM = match(NUM);
			 ((Idade_rangeContext)_localctx).max =  (((Idade_rangeContext)_localctx).NUM!=null?Integer.valueOf(((Idade_rangeContext)_localctx).NUM.getText()):0); 
			setState(130);
			match(RANGE);
			setState(131);
			((Idade_rangeContext)_localctx).NUM = match(NUM);
			 ((Idade_rangeContext)_localctx).min =  (((Idade_rangeContext)_localctx).NUM!=null?Integer.valueOf(((Idade_rangeContext)_localctx).NUM.getText()):0); 
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

	public static class TempoContext extends ParserRuleContext {
		public TerminalNode LONG() { return getToken(AprendizagemParser.LONG, 0); }
		public TerminalNode MEDIUM() { return getToken(AprendizagemParser.MEDIUM, 0); }
		public TerminalNode SHORT() { return getToken(AprendizagemParser.SHORT, 0); }
		public TempoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tempo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprendizagemListener ) ((AprendizagemListener)listener).enterTempo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprendizagemListener ) ((AprendizagemListener)listener).exitTempo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprendizagemVisitor ) return ((AprendizagemVisitor<? extends T>)visitor).visitTempo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TempoContext tempo() throws RecognitionException {
		TempoContext _localctx = new TempoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tempo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LONG) | (1L << MEDIUM) | (1L << SHORT))) != 0)) ) {
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

	public static class Lista_emocionalContext extends ParserRuleContext {
		public ArrayList<Emocao> lista;
		public TerminalNode LEFTSTRAIGHT() { return getToken(AprendizagemParser.LEFTSTRAIGHT, 0); }
		public List<EmocaolContext> emocaol() {
			return getRuleContexts(EmocaolContext.class);
		}
		public EmocaolContext emocaol(int i) {
			return getRuleContext(EmocaolContext.class,i);
		}
		public TerminalNode RIGHTSTRAIGHT() { return getToken(AprendizagemParser.RIGHTSTRAIGHT, 0); }
		public List<TerminalNode> VIR() { return getTokens(AprendizagemParser.VIR); }
		public TerminalNode VIR(int i) {
			return getToken(AprendizagemParser.VIR, i);
		}
		public Lista_emocionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_emocional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprendizagemListener ) ((AprendizagemListener)listener).enterLista_emocional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprendizagemListener ) ((AprendizagemListener)listener).exitLista_emocional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprendizagemVisitor ) return ((AprendizagemVisitor<? extends T>)visitor).visitLista_emocional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_emocionalContext lista_emocional() throws RecognitionException {
		Lista_emocionalContext _localctx = new Lista_emocionalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_lista_emocional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((Lista_emocionalContext)_localctx).lista =  new ArrayList<>(); 
			setState(137);
			match(LEFTSTRAIGHT);
			setState(138);
			emocaol(_localctx.lista);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIR) {
				{
				{
				setState(139);
				match(VIR);
				setState(140);
				emocaol(_localctx.lista);
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(146);
			match(RIGHTSTRAIGHT);
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

	public static class EmocaolContext extends ParserRuleContext {
		public ArrayList<Emocao> lista;
		public Token TEXT;
		public QuadranteContext quadrante;
		public TerminalNode TEXT() { return getToken(AprendizagemParser.TEXT, 0); }
		public QuadranteContext quadrante() {
			return getRuleContext(QuadranteContext.class,0);
		}
		public EmocaolContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EmocaolContext(ParserRuleContext parent, int invokingState, ArrayList<Emocao> lista) {
			super(parent, invokingState);
			this.lista = lista;
		}
		@Override public int getRuleIndex() { return RULE_emocaol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprendizagemListener ) ((AprendizagemListener)listener).enterEmocaol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprendizagemListener ) ((AprendizagemListener)listener).exitEmocaol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprendizagemVisitor ) return ((AprendizagemVisitor<? extends T>)visitor).visitEmocaol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmocaolContext emocaol(ArrayList<Emocao> lista) throws RecognitionException {
		EmocaolContext _localctx = new EmocaolContext(_ctx, getState(), lista);
		enterRule(_localctx, 20, RULE_emocaol);
		try {
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				((EmocaolContext)_localctx).TEXT = match(TEXT);
				 Emocao emo = new Emocao((((EmocaolContext)_localctx).TEXT!=null?((EmocaolContext)_localctx).TEXT.getText():null)); lista.add(emo); 
				}
				break;
			case LEFTPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				((EmocaolContext)_localctx).quadrante = quadrante();
				 Emocao emo = new Emocao(((EmocaolContext)_localctx).quadrante.posX, ((EmocaolContext)_localctx).quadrante.posY); lista.add(emo); 
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

	public static class EmocaoContext extends ParserRuleContext {
		public Emocao emo;
		public Token TEXT;
		public QuadranteContext quadrante;
		public TerminalNode TEXT() { return getToken(AprendizagemParser.TEXT, 0); }
		public QuadranteContext quadrante() {
			return getRuleContext(QuadranteContext.class,0);
		}
		public EmocaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emocao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprendizagemListener ) ((AprendizagemListener)listener).enterEmocao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprendizagemListener ) ((AprendizagemListener)listener).exitEmocao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprendizagemVisitor ) return ((AprendizagemVisitor<? extends T>)visitor).visitEmocao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmocaoContext emocao() throws RecognitionException {
		EmocaoContext _localctx = new EmocaoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_emocao);
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				((EmocaoContext)_localctx).TEXT = match(TEXT);
				 ((EmocaoContext)_localctx).emo =  new Emocao((((EmocaoContext)_localctx).TEXT!=null?((EmocaoContext)_localctx).TEXT.getText():null)); 
				}
				break;
			case LEFTPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				((EmocaoContext)_localctx).quadrante = quadrante();
				 ((EmocaoContext)_localctx).emo =  new Emocao(((EmocaoContext)_localctx).quadrante.posX, ((EmocaoContext)_localctx).quadrante.posY); 
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

	public static class QuadranteContext extends ParserRuleContext {
		public int posX;
		public int posY;
		public XContext x;
		public YContext y;
		public TerminalNode LEFTPAREN() { return getToken(AprendizagemParser.LEFTPAREN, 0); }
		public XContext x() {
			return getRuleContext(XContext.class,0);
		}
		public TerminalNode VIR() { return getToken(AprendizagemParser.VIR, 0); }
		public YContext y() {
			return getRuleContext(YContext.class,0);
		}
		public TerminalNode RIGHTPAREN() { return getToken(AprendizagemParser.RIGHTPAREN, 0); }
		public QuadranteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quadrante; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprendizagemListener ) ((AprendizagemListener)listener).enterQuadrante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprendizagemListener ) ((AprendizagemListener)listener).exitQuadrante(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprendizagemVisitor ) return ((AprendizagemVisitor<? extends T>)visitor).visitQuadrante(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuadranteContext quadrante() throws RecognitionException {
		QuadranteContext _localctx = new QuadranteContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_quadrante);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(LEFTPAREN);
			setState(163);
			((QuadranteContext)_localctx).x = x();
			 ((QuadranteContext)_localctx).posX =  Integer.parseInt((((QuadranteContext)_localctx).x!=null?_input.getText(((QuadranteContext)_localctx).x.start,((QuadranteContext)_localctx).x.stop):null)); 
			setState(165);
			match(VIR);
			setState(166);
			((QuadranteContext)_localctx).y = y();
			 ((QuadranteContext)_localctx).posY =  Integer.parseInt((((QuadranteContext)_localctx).y!=null?_input.getText(((QuadranteContext)_localctx).y.start,((QuadranteContext)_localctx).y.stop):null)); 
			setState(168);
			match(RIGHTPAREN);
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

	public static class XContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(AprendizagemParser.NUM, 0); }
		public XContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_x; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprendizagemListener ) ((AprendizagemListener)listener).enterX(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprendizagemListener ) ((AprendizagemListener)listener).exitX(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprendizagemVisitor ) return ((AprendizagemVisitor<? extends T>)visitor).visitX(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XContext x() throws RecognitionException {
		XContext _localctx = new XContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_x);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(NUM);
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

	public static class YContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(AprendizagemParser.NUM, 0); }
		public YContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_y; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprendizagemListener ) ((AprendizagemListener)listener).enterY(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprendizagemListener ) ((AprendizagemListener)listener).exitY(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprendizagemVisitor ) return ((AprendizagemVisitor<? extends T>)visitor).visitY(this);
			else return visitor.visitChildren(this);
		}
	}

	public final YContext y() throws RecognitionException {
		YContext _localctx = new YContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_y);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(NUM);
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

	public static class CprogsContext extends ParserRuleContext {
		public ArrayList<String> lista;
		public TerminalNode LEFTPAREN() { return getToken(AprendizagemParser.LEFTPAREN, 0); }
		public List<CproglContext> cprogl() {
			return getRuleContexts(CproglContext.class);
		}
		public CproglContext cprogl(int i) {
			return getRuleContext(CproglContext.class,i);
		}
		public TerminalNode RIGHTPAREN() { return getToken(AprendizagemParser.RIGHTPAREN, 0); }
		public List<TerminalNode> VIR() { return getTokens(AprendizagemParser.VIR); }
		public TerminalNode VIR(int i) {
			return getToken(AprendizagemParser.VIR, i);
		}
		public CprogsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cprogs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprendizagemListener ) ((AprendizagemListener)listener).enterCprogs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprendizagemListener ) ((AprendizagemListener)listener).exitCprogs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprendizagemVisitor ) return ((AprendizagemVisitor<? extends T>)visitor).visitCprogs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CprogsContext cprogs() throws RecognitionException {
		CprogsContext _localctx = new CprogsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_cprogs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((CprogsContext)_localctx).lista =  new ArrayList<>(); 
			setState(175);
			match(LEFTPAREN);
			setState(176);
			cprogl(_localctx.lista);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIR) {
				{
				{
				setState(177);
				match(VIR);
				setState(178);
				cprogl(_localctx.lista);
				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(184);
			match(RIGHTPAREN);
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

	public static class CproglContext extends ParserRuleContext {
		public ArrayList<String> lista;
		public Token TEXT;
		public TerminalNode TEXT() { return getToken(AprendizagemParser.TEXT, 0); }
		public CproglContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CproglContext(ParserRuleContext parent, int invokingState, ArrayList<String> lista) {
			super(parent, invokingState);
			this.lista = lista;
		}
		@Override public int getRuleIndex() { return RULE_cprogl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprendizagemListener ) ((AprendizagemListener)listener).enterCprogl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprendizagemListener ) ((AprendizagemListener)listener).exitCprogl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprendizagemVisitor ) return ((AprendizagemVisitor<? extends T>)visitor).visitCprogl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CproglContext cprogl(ArrayList<String> lista) throws RecognitionException {
		CproglContext _localctx = new CproglContext(_ctx, getState(), lista);
		enterRule(_localctx, 32, RULE_cprogl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			((CproglContext)_localctx).TEXT = match(TEXT);
			 lista.add((((CproglContext)_localctx).TEXT!=null?((CproglContext)_localctx).TEXT.getText():null)); 
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

	public static class CprogContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(AprendizagemParser.TEXT, 0); }
		public CprogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cprog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprendizagemListener ) ((AprendizagemListener)listener).enterCprog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprendizagemListener ) ((AprendizagemListener)listener).exitCprog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprendizagemVisitor ) return ((AprendizagemVisitor<? extends T>)visitor).visitCprog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CprogContext cprog() throws RecognitionException {
		CprogContext _localctx = new CprogContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_cprog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(TEXT);
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

	public static class AlunosContext extends ParserRuleContext {
		public ArrayList<Aluno> lista;
		public List<AlunoContext> aluno() {
			return getRuleContexts(AlunoContext.class);
		}
		public AlunoContext aluno(int i) {
			return getRuleContext(AlunoContext.class,i);
		}
		public List<TerminalNode> PVIR() { return getTokens(AprendizagemParser.PVIR); }
		public TerminalNode PVIR(int i) {
			return getToken(AprendizagemParser.PVIR, i);
		}
		public AlunosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alunos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprendizagemListener ) ((AprendizagemListener)listener).enterAlunos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprendizagemListener ) ((AprendizagemListener)listener).exitAlunos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprendizagemVisitor ) return ((AprendizagemVisitor<? extends T>)visitor).visitAlunos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlunosContext alunos() throws RecognitionException {
		AlunosContext _localctx = new AlunosContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_alunos);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			 ((AlunosContext)_localctx).lista =  new ArrayList<>(); 
			setState(192);
			aluno(_localctx.lista);
			setState(197);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(193);
					match(PVIR);
					setState(194);
					aluno(_localctx.lista);
					}
					} 
				}
				setState(199);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(200);
			match(PVIR);
			 System.out.println("[INFO] Alunosos lidos: " + _localctx.lista.size()); 
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

	public static class AlunoContext extends ParserRuleContext {
		public ArrayList<Aluno> lista;
		public Token ALUNOID;
		public IdadeContext idade;
		public PersonalidadeContext personalidade;
		public TerminalNode ALUNOID() { return getToken(AprendizagemParser.ALUNOID, 0); }
		public List<TerminalNode> VIR() { return getTokens(AprendizagemParser.VIR); }
		public TerminalNode VIR(int i) {
			return getToken(AprendizagemParser.VIR, i);
		}
		public IdadeContext idade() {
			return getRuleContext(IdadeContext.class,0);
		}
		public PersonalidadeContext personalidade() {
			return getRuleContext(PersonalidadeContext.class,0);
		}
		public AlunoContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public AlunoContext(ParserRuleContext parent, int invokingState, ArrayList<Aluno> lista) {
			super(parent, invokingState);
			this.lista = lista;
		}
		@Override public int getRuleIndex() { return RULE_aluno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprendizagemListener ) ((AprendizagemListener)listener).enterAluno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprendizagemListener ) ((AprendizagemListener)listener).exitAluno(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprendizagemVisitor ) return ((AprendizagemVisitor<? extends T>)visitor).visitAluno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlunoContext aluno(ArrayList<Aluno> lista) throws RecognitionException {
		AlunoContext _localctx = new AlunoContext(_ctx, getState(), lista);
		enterRule(_localctx, 38, RULE_aluno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 Aluno al = new Aluno(); 
			setState(204);
			((AlunoContext)_localctx).ALUNOID = match(ALUNOID);
			setState(205);
			match(VIR);
			 al.setId((((AlunoContext)_localctx).ALUNOID!=null?((AlunoContext)_localctx).ALUNOID.getText():null)); 
			setState(207);
			((AlunoContext)_localctx).idade = idade();
			setState(208);
			match(VIR);
			 al.setIdade(Integer.parseInt((((AlunoContext)_localctx).idade!=null?_input.getText(((AlunoContext)_localctx).idade.start,((AlunoContext)_localctx).idade.stop):null))); 
			setState(210);
			((AlunoContext)_localctx).personalidade = personalidade();
			 for(Emocao e : ((AlunoContext)_localctx).personalidade.lista){ al.addEmocao(e); } lista.add(al); 
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

	public static class IdadeContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(AprendizagemParser.NUM, 0); }
		public IdadeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idade; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprendizagemListener ) ((AprendizagemListener)listener).enterIdade(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprendizagemListener ) ((AprendizagemListener)listener).exitIdade(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprendizagemVisitor ) return ((AprendizagemVisitor<? extends T>)visitor).visitIdade(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdadeContext idade() throws RecognitionException {
		IdadeContext _localctx = new IdadeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_idade);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(NUM);
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

	public static class PersonalidadeContext extends ParserRuleContext {
		public ArrayList<Emocao> lista;
		public EmocaoContext emocao;
		public Lista_emocionalContext lista_emocional;
		public EmocaoContext emocao() {
			return getRuleContext(EmocaoContext.class,0);
		}
		public Lista_emocionalContext lista_emocional() {
			return getRuleContext(Lista_emocionalContext.class,0);
		}
		public PersonalidadeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_personalidade; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprendizagemListener ) ((AprendizagemListener)listener).enterPersonalidade(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprendizagemListener ) ((AprendizagemListener)listener).exitPersonalidade(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprendizagemVisitor ) return ((AprendizagemVisitor<? extends T>)visitor).visitPersonalidade(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PersonalidadeContext personalidade() throws RecognitionException {
		PersonalidadeContext _localctx = new PersonalidadeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_personalidade);
		try {
			setState(222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT:
			case LEFTPAREN:
				enterOuterAlt(_localctx, 1);
				{
				 ((PersonalidadeContext)_localctx).lista =  new ArrayList<>(); 
				setState(216);
				((PersonalidadeContext)_localctx).emocao = emocao();
				 _localctx.lista.add(((PersonalidadeContext)_localctx).emocao.emo); 
				}
				break;
			case LEFTSTRAIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				((PersonalidadeContext)_localctx).lista_emocional = lista_emocional();
				 ((PersonalidadeContext)_localctx).lista =  new ArrayList<>(((PersonalidadeContext)_localctx).lista_emocional.lista); 
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

	public static class QueriesContext extends ParserRuleContext {
		public Database d;
		public List<QuerieContext> querie() {
			return getRuleContexts(QuerieContext.class);
		}
		public QuerieContext querie(int i) {
			return getRuleContext(QuerieContext.class,i);
		}
		public QueriesContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public QueriesContext(ParserRuleContext parent, int invokingState, Database d) {
			super(parent, invokingState);
			this.d = d;
		}
		@Override public int getRuleIndex() { return RULE_queries; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprendizagemListener ) ((AprendizagemListener)listener).enterQueries(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprendizagemListener ) ((AprendizagemListener)listener).exitQueries(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprendizagemVisitor ) return ((AprendizagemVisitor<? extends T>)visitor).visitQueries(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueriesContext queries(Database d) throws RecognitionException {
		QueriesContext _localctx = new QueriesContext(_ctx, getState(), d);
		enterRule(_localctx, 44, RULE_queries);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			querie(d);
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==QUESTION) {
				{
				{
				setState(225);
				querie(d);
				}
				}
				setState(230);
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

	public static class QuerieContext extends ParserRuleContext {
		public Database d;
		public Token QUESTION;
		public RecursoquerieContext recursoquerie;
		public CprogContext cprog;
		public AlunotargetContext alunotarget;
		public RecursotargetContext recursotarget;
		public Token ALUNOID;
		public IdContext id;
		public TerminalNode QUESTION() { return getToken(AprendizagemParser.QUESTION, 0); }
		public TerminalNode FIND() { return getToken(AprendizagemParser.FIND, 0); }
		public RecursoquerieContext recursoquerie() {
			return getRuleContext(RecursoquerieContext.class,0);
		}
		public TerminalNode TOTEACH() { return getToken(AprendizagemParser.TOTEACH, 0); }
		public CprogContext cprog() {
			return getRuleContext(CprogContext.class,0);
		}
		public TerminalNode TO() { return getToken(AprendizagemParser.TO, 0); }
		public AlunotargetContext alunotarget() {
			return getRuleContext(AlunotargetContext.class,0);
		}
		public TerminalNode PVIR() { return getToken(AprendizagemParser.PVIR, 0); }
		public TerminalNode ALUNOS() { return getToken(AprendizagemParser.ALUNOS, 0); }
		public RecursotargetContext recursotarget() {
			return getRuleContext(RecursotargetContext.class,0);
		}
		public TerminalNode GET() { return getToken(AprendizagemParser.GET, 0); }
		public TerminalNode ALUNOID() { return getToken(AprendizagemParser.ALUNOID, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public QuerieContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public QuerieContext(ParserRuleContext parent, int invokingState, Database d) {
			super(parent, invokingState);
			this.d = d;
		}
		@Override public int getRuleIndex() { return RULE_querie; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprendizagemListener ) ((AprendizagemListener)listener).enterQuerie(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprendizagemListener ) ((AprendizagemListener)listener).exitQuerie(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprendizagemVisitor ) return ((AprendizagemVisitor<? extends T>)visitor).visitQuerie(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuerieContext querie(Database d) throws RecognitionException {
		QuerieContext _localctx = new QuerieContext(_ctx, getState(), d);
		enterRule(_localctx, 46, RULE_querie);
		try {
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				((QuerieContext)_localctx).QUESTION = match(QUESTION);
				setState(232);
				match(FIND);
				setState(233);
				((QuerieContext)_localctx).recursoquerie = recursoquerie();
				setState(234);
				match(TOTEACH);
				setState(235);
				((QuerieContext)_localctx).cprog = cprog();
				setState(236);
				match(TO);
				setState(237);
				((QuerieContext)_localctx).alunotarget = alunotarget(d);
				setState(238);
				match(PVIR);
				 d.findRecursosSingleAluno(((QuerieContext)_localctx).recursoquerie.lista,(((QuerieContext)_localctx).cprog!=null?_input.getText(((QuerieContext)_localctx).cprog.start,((QuerieContext)_localctx).cprog.stop):null),((QuerieContext)_localctx).alunotarget.al,(((QuerieContext)_localctx).QUESTION!=null?((QuerieContext)_localctx).QUESTION.getLine():0)); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				((QuerieContext)_localctx).QUESTION = match(QUESTION);
				setState(242);
				match(FIND);
				setState(243);
				((QuerieContext)_localctx).recursoquerie = recursoquerie();
				setState(244);
				match(TOTEACH);
				setState(245);
				((QuerieContext)_localctx).cprog = cprog();
				setState(246);
				match(PVIR);
				 d.findRecursosCprog(((QuerieContext)_localctx).recursoquerie.lista,(((QuerieContext)_localctx).cprog!=null?_input.getText(((QuerieContext)_localctx).cprog.start,((QuerieContext)_localctx).cprog.stop):null),(((QuerieContext)_localctx).QUESTION!=null?((QuerieContext)_localctx).QUESTION.getLine():0)); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(249);
				((QuerieContext)_localctx).QUESTION = match(QUESTION);
				setState(250);
				match(FIND);
				setState(251);
				match(ALUNOS);
				setState(252);
				match(TOTEACH);
				setState(253);
				((QuerieContext)_localctx).recursotarget = recursotarget(d);
				setState(254);
				match(PVIR);
				 d.findAlunosSingleRecurso(((QuerieContext)_localctx).recursotarget.rec,(((QuerieContext)_localctx).QUESTION!=null?((QuerieContext)_localctx).QUESTION.getLine():0)); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(257);
				((QuerieContext)_localctx).QUESTION = match(QUESTION);
				setState(258);
				match(GET);
				setState(259);
				((QuerieContext)_localctx).ALUNOID = match(ALUNOID);
				setState(260);
				match(PVIR);
				 d.getSingleAluno((((QuerieContext)_localctx).ALUNOID!=null?((QuerieContext)_localctx).ALUNOID.getText():null),(((QuerieContext)_localctx).QUESTION!=null?((QuerieContext)_localctx).QUESTION.getLine():0)); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(262);
				((QuerieContext)_localctx).QUESTION = match(QUESTION);
				setState(263);
				match(GET);
				setState(264);
				((QuerieContext)_localctx).id = id();
				setState(265);
				match(PVIR);
				 d.getSingleRecurso(Integer.parseInt((((QuerieContext)_localctx).id!=null?_input.getText(((QuerieContext)_localctx).id.start,((QuerieContext)_localctx).id.stop):null)),(((QuerieContext)_localctx).QUESTION!=null?((QuerieContext)_localctx).QUESTION.getLine():0)); 
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

	public static class RecursoquerieContext extends ParserRuleContext {
		public ArrayList<String> lista;
		public TiposContext tipos;
		public TerminalNode RECURSOS() { return getToken(AprendizagemParser.RECURSOS, 0); }
		public TiposContext tipos() {
			return getRuleContext(TiposContext.class,0);
		}
		public RecursoquerieContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recursoquerie; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprendizagemListener ) ((AprendizagemListener)listener).enterRecursoquerie(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprendizagemListener ) ((AprendizagemListener)listener).exitRecursoquerie(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprendizagemVisitor ) return ((AprendizagemVisitor<? extends T>)visitor).visitRecursoquerie(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecursoquerieContext recursoquerie() throws RecognitionException {
		RecursoquerieContext _localctx = new RecursoquerieContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_recursoquerie);
		try {
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RECURSOS:
				enterOuterAlt(_localctx, 1);
				{
				 ((RecursoquerieContext)_localctx).lista =  new ArrayList<>(); 
				setState(271);
				match(RECURSOS);
				}
				break;
			case LEFTPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				((RecursoquerieContext)_localctx).tipos = tipos();
				 ((RecursoquerieContext)_localctx).lista =  ((RecursoquerieContext)_localctx).tipos.lista; 
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

	public static class TiposContext extends ParserRuleContext {
		public ArrayList<String> lista;
		public TipoContext tipo;
		public TerminalNode LEFTPAREN() { return getToken(AprendizagemParser.LEFTPAREN, 0); }
		public List<TipoContext> tipo() {
			return getRuleContexts(TipoContext.class);
		}
		public TipoContext tipo(int i) {
			return getRuleContext(TipoContext.class,i);
		}
		public TerminalNode RIGHTPAREN() { return getToken(AprendizagemParser.RIGHTPAREN, 0); }
		public List<TerminalNode> VIR() { return getTokens(AprendizagemParser.VIR); }
		public TerminalNode VIR(int i) {
			return getToken(AprendizagemParser.VIR, i);
		}
		public TiposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprendizagemListener ) ((AprendizagemListener)listener).enterTipos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprendizagemListener ) ((AprendizagemListener)listener).exitTipos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprendizagemVisitor ) return ((AprendizagemVisitor<? extends T>)visitor).visitTipos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TiposContext tipos() throws RecognitionException {
		TiposContext _localctx = new TiposContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_tipos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((TiposContext)_localctx).lista =  new ArrayList<>(); 
			setState(278);
			match(LEFTPAREN);
			setState(279);
			((TiposContext)_localctx).tipo = tipo();
			 _localctx.lista.add((((TiposContext)_localctx).tipo!=null?_input.getText(((TiposContext)_localctx).tipo.start,((TiposContext)_localctx).tipo.stop):null)); 
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIR) {
				{
				{
				setState(281);
				match(VIR);
				setState(282);
				((TiposContext)_localctx).tipo = tipo();
				}
				}
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 _localctx.lista.add((((TiposContext)_localctx).tipo!=null?_input.getText(((TiposContext)_localctx).tipo.start,((TiposContext)_localctx).tipo.stop):null)); 
			setState(289);
			match(RIGHTPAREN);
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

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(AprendizagemParser.TEXT, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprendizagemListener ) ((AprendizagemListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprendizagemListener ) ((AprendizagemListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprendizagemVisitor ) return ((AprendizagemVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_tipo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(TEXT);
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

	public static class RecursotargetContext extends ParserRuleContext {
		public Database d;
		public Recurso rec;
		public IdContext id;
		public RecursoContext recurso;
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode LEFTPAREN() { return getToken(AprendizagemParser.LEFTPAREN, 0); }
		public RecursoContext recurso() {
			return getRuleContext(RecursoContext.class,0);
		}
		public TerminalNode RIGHTPAREN() { return getToken(AprendizagemParser.RIGHTPAREN, 0); }
		public RecursotargetContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public RecursotargetContext(ParserRuleContext parent, int invokingState, Database d) {
			super(parent, invokingState);
			this.d = d;
		}
		@Override public int getRuleIndex() { return RULE_recursotarget; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprendizagemListener ) ((AprendizagemListener)listener).enterRecursotarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprendizagemListener ) ((AprendizagemListener)listener).exitRecursotarget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprendizagemVisitor ) return ((AprendizagemVisitor<? extends T>)visitor).visitRecursotarget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecursotargetContext recursotarget(Database d) throws RecognitionException {
		RecursotargetContext _localctx = new RecursotargetContext(_ctx, getState(), d);
		enterRule(_localctx, 54, RULE_recursotarget);
		try {
			setState(301);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				((RecursotargetContext)_localctx).id = id();
				 ((RecursotargetContext)_localctx).rec =  d.findRecurso(Integer.parseInt((((RecursotargetContext)_localctx).id!=null?_input.getText(((RecursotargetContext)_localctx).id.start,((RecursotargetContext)_localctx).id.stop):null))); 
				}
				break;
			case LEFTPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				match(LEFTPAREN);
				setState(297);
				((RecursotargetContext)_localctx).recurso = recurso();
				setState(298);
				match(RIGHTPAREN);
				 ((RecursotargetContext)_localctx).rec =  ((RecursotargetContext)_localctx).recurso.rec; 
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

	public static class AlunotargetContext extends ParserRuleContext {
		public Database d;
		public Aluno al;
		public Token ALUNOID;
		public EmocaoContext emocao;
		public TerminalNode ALUNOID() { return getToken(AprendizagemParser.ALUNOID, 0); }
		public EmocaoContext emocao() {
			return getRuleContext(EmocaoContext.class,0);
		}
		public AlunotargetContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public AlunotargetContext(ParserRuleContext parent, int invokingState, Database d) {
			super(parent, invokingState);
			this.d = d;
		}
		@Override public int getRuleIndex() { return RULE_alunotarget; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AprendizagemListener ) ((AprendizagemListener)listener).enterAlunotarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AprendizagemListener ) ((AprendizagemListener)listener).exitAlunotarget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AprendizagemVisitor ) return ((AprendizagemVisitor<? extends T>)visitor).visitAlunotarget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlunotargetContext alunotarget(Database d) throws RecognitionException {
		AlunotargetContext _localctx = new AlunotargetContext(_ctx, getState(), d);
		enterRule(_localctx, 56, RULE_alunotarget);
		try {
			setState(309);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALUNOID:
				enterOuterAlt(_localctx, 1);
				{
				 ((AlunotargetContext)_localctx).al =  new Aluno(); 
				setState(304);
				((AlunotargetContext)_localctx).ALUNOID = match(ALUNOID);
				 ((AlunotargetContext)_localctx).al =  d.findAluno((((AlunotargetContext)_localctx).ALUNOID!=null?((AlunotargetContext)_localctx).ALUNOID.getText():null)); 
				}
				break;
			case TEXT:
			case LEFTPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				((AlunotargetContext)_localctx).emocao = emocao();
				 _localctx.al.addEmocao(((AlunotargetContext)_localctx).emocao.emo); 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\u013a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3N\n\3\f\3\16\3Q\13"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\7\13\u0090\n\13\f\13\16\13\u0093"+
		"\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\5\f\u009c\n\f\3\r\3\r\3\r\3\r\3\r"+
		"\5\r\u00a3\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\7\21\u00b6\n\21\f\21\16\21\u00b9\13\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\7\24\u00c6\n\24"+
		"\f\24\16\24\u00c9\13\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00e1"+
		"\n\27\3\30\3\30\7\30\u00e5\n\30\f\30\16\30\u00e8\13\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u010f\n\31\3\32\3\32\3\32\3\32\3\32"+
		"\5\32\u0116\n\32\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u011e\n\33\f\33\16"+
		"\33\u0121\13\33\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\5\35\u0130\n\35\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0138\n"+
		"\36\3\36\2\2\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:\2\3\3\2\5\7\2\u012c\2<\3\2\2\2\4I\3\2\2\2\6U\3\2\2\2\bb\3\2\2"+
		"\2\no\3\2\2\2\fq\3\2\2\2\16s\3\2\2\2\20\u0082\3\2\2\2\22\u0088\3\2\2\2"+
		"\24\u008a\3\2\2\2\26\u009b\3\2\2\2\30\u00a2\3\2\2\2\32\u00a4\3\2\2\2\34"+
		"\u00ac\3\2\2\2\36\u00ae\3\2\2\2 \u00b0\3\2\2\2\"\u00bc\3\2\2\2$\u00bf"+
		"\3\2\2\2&\u00c1\3\2\2\2(\u00cd\3\2\2\2*\u00d7\3\2\2\2,\u00e0\3\2\2\2."+
		"\u00e2\3\2\2\2\60\u010e\3\2\2\2\62\u0115\3\2\2\2\64\u0117\3\2\2\2\66\u0125"+
		"\3\2\2\28\u012f\3\2\2\2:\u0137\3\2\2\2<=\b\2\1\2=>\7\3\2\2>?\7\26\2\2"+
		"?@\5\4\3\2@A\7\27\2\2AB\b\2\1\2BC\7\4\2\2CD\7\26\2\2DE\5&\24\2EF\7\27"+
		"\2\2FG\b\2\1\2GH\5.\30\2H\3\3\2\2\2IJ\b\3\1\2JO\5\6\4\2KL\7\24\2\2LN\5"+
		"\6\4\2MK\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PR\3\2\2\2QO\3\2\2\2RS\7"+
		"\24\2\2ST\b\3\1\2T\5\3\2\2\2UV\b\4\1\2VW\5\n\6\2WX\7\23\2\2XY\b\4\1\2"+
		"YZ\5\f\7\2Z[\7\23\2\2[\\\b\4\1\2\\]\5\66\34\2]^\7\23\2\2^_\b\4\1\2_`\5"+
		"\16\b\2`a\b\4\1\2a\7\3\2\2\2bc\b\5\1\2cd\5\n\6\2de\7\23\2\2ef\b\5\1\2"+
		"fg\5\f\7\2gh\7\23\2\2hi\b\5\1\2ij\5\66\34\2jk\7\23\2\2kl\b\5\1\2lm\5\16"+
		"\b\2mn\b\5\1\2n\t\3\2\2\2op\7\17\2\2p\13\3\2\2\2qr\7\20\2\2r\r\3\2\2\2"+
		"st\b\b\1\2tu\7\30\2\2uv\5\20\t\2vw\7\23\2\2wx\b\b\1\2xy\5\22\n\2yz\7\23"+
		"\2\2z{\b\b\1\2{|\5\24\13\2|}\7\23\2\2}~\b\b\1\2~\177\5 \21\2\177\u0080"+
		"\b\b\1\2\u0080\u0081\7\31\2\2\u0081\17\3\2\2\2\u0082\u0083\7\17\2\2\u0083"+
		"\u0084\b\t\1\2\u0084\u0085\7\34\2\2\u0085\u0086\7\17\2\2\u0086\u0087\b"+
		"\t\1\2\u0087\21\3\2\2\2\u0088\u0089\t\2\2\2\u0089\23\3\2\2\2\u008a\u008b"+
		"\b\13\1\2\u008b\u008c\7\32\2\2\u008c\u0091\5\26\f\2\u008d\u008e\7\23\2"+
		"\2\u008e\u0090\5\26\f\2\u008f\u008d\3\2\2\2\u0090\u0093\3\2\2\2\u0091"+
		"\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0091\3\2"+
		"\2\2\u0094\u0095\7\33\2\2\u0095\25\3\2\2\2\u0096\u0097\7\20\2\2\u0097"+
		"\u009c\b\f\1\2\u0098\u0099\5\32\16\2\u0099\u009a\b\f\1\2\u009a\u009c\3"+
		"\2\2\2\u009b\u0096\3\2\2\2\u009b\u0098\3\2\2\2\u009c\27\3\2\2\2\u009d"+
		"\u009e\7\20\2\2\u009e\u00a3\b\r\1\2\u009f\u00a0\5\32\16\2\u00a0\u00a1"+
		"\b\r\1\2\u00a1\u00a3\3\2\2\2\u00a2\u009d\3\2\2\2\u00a2\u009f\3\2\2\2\u00a3"+
		"\31\3\2\2\2\u00a4\u00a5\7\30\2\2\u00a5\u00a6\5\34\17\2\u00a6\u00a7\b\16"+
		"\1\2\u00a7\u00a8\7\23\2\2\u00a8\u00a9\5\36\20\2\u00a9\u00aa\b\16\1\2\u00aa"+
		"\u00ab\7\31\2\2\u00ab\33\3\2\2\2\u00ac\u00ad\7\17\2\2\u00ad\35\3\2\2\2"+
		"\u00ae\u00af\7\17\2\2\u00af\37\3\2\2\2\u00b0\u00b1\b\21\1\2\u00b1\u00b2"+
		"\7\30\2\2\u00b2\u00b7\5\"\22\2\u00b3\u00b4\7\23\2\2\u00b4\u00b6\5\"\22"+
		"\2\u00b5\u00b3\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8"+
		"\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bb\7\31\2\2"+
		"\u00bb!\3\2\2\2\u00bc\u00bd\7\20\2\2\u00bd\u00be\b\22\1\2\u00be#\3\2\2"+
		"\2\u00bf\u00c0\7\20\2\2\u00c0%\3\2\2\2\u00c1\u00c2\b\24\1\2\u00c2\u00c7"+
		"\5(\25\2\u00c3\u00c4\7\24\2\2\u00c4\u00c6\5(\25\2\u00c5\u00c3\3\2\2\2"+
		"\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca"+
		"\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cb\7\24\2\2\u00cb\u00cc\b\24\1\2"+
		"\u00cc\'\3\2\2\2\u00cd\u00ce\b\25\1\2\u00ce\u00cf\7\b\2\2\u00cf\u00d0"+
		"\7\23\2\2\u00d0\u00d1\b\25\1\2\u00d1\u00d2\5*\26\2\u00d2\u00d3\7\23\2"+
		"\2\u00d3\u00d4\b\25\1\2\u00d4\u00d5\5,\27\2\u00d5\u00d6\b\25\1\2\u00d6"+
		")\3\2\2\2\u00d7\u00d8\7\17\2\2\u00d8+\3\2\2\2\u00d9\u00da\b\27\1\2\u00da"+
		"\u00db\5\30\r\2\u00db\u00dc\b\27\1\2\u00dc\u00e1\3\2\2\2\u00dd\u00de\5"+
		"\24\13\2\u00de\u00df\b\27\1\2\u00df\u00e1\3\2\2\2\u00e0\u00d9\3\2\2\2"+
		"\u00e0\u00dd\3\2\2\2\u00e1-\3\2\2\2\u00e2\u00e6\5\60\31\2\u00e3\u00e5"+
		"\5\60\31\2\u00e4\u00e3\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2"+
		"\u00e6\u00e7\3\2\2\2\u00e7/\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ea\7"+
		"\t\2\2\u00ea\u00eb\7\n\2\2\u00eb\u00ec\5\62\32\2\u00ec\u00ed\7\f\2\2\u00ed"+
		"\u00ee\5$\23\2\u00ee\u00ef\7\r\2\2\u00ef\u00f0\5:\36\2\u00f0\u00f1\7\24"+
		"\2\2\u00f1\u00f2\b\31\1\2\u00f2\u010f\3\2\2\2\u00f3\u00f4\7\t\2\2\u00f4"+
		"\u00f5\7\n\2\2\u00f5\u00f6\5\62\32\2\u00f6\u00f7\7\f\2\2\u00f7\u00f8\5"+
		"$\23\2\u00f8\u00f9\7\24\2\2\u00f9\u00fa\b\31\1\2\u00fa\u010f\3\2\2\2\u00fb"+
		"\u00fc\7\t\2\2\u00fc\u00fd\7\n\2\2\u00fd\u00fe\7\4\2\2\u00fe\u00ff\7\f"+
		"\2\2\u00ff\u0100\58\35\2\u0100\u0101\7\24\2\2\u0101\u0102\b\31\1\2\u0102"+
		"\u010f\3\2\2\2\u0103\u0104\7\t\2\2\u0104\u0105\7\13\2\2\u0105\u0106\7"+
		"\b\2\2\u0106\u0107\7\24\2\2\u0107\u010f\b\31\1\2\u0108\u0109\7\t\2\2\u0109"+
		"\u010a\7\13\2\2\u010a\u010b\5\n\6\2\u010b\u010c\7\24\2\2\u010c\u010d\b"+
		"\31\1\2\u010d\u010f\3\2\2\2\u010e\u00e9\3\2\2\2\u010e\u00f3\3\2\2\2\u010e"+
		"\u00fb\3\2\2\2\u010e\u0103\3\2\2\2\u010e\u0108\3\2\2\2\u010f\61\3\2\2"+
		"\2\u0110\u0111\b\32\1\2\u0111\u0116\7\3\2\2\u0112\u0113\5\64\33\2\u0113"+
		"\u0114\b\32\1\2\u0114\u0116\3\2\2\2\u0115\u0110\3\2\2\2\u0115\u0112\3"+
		"\2\2\2\u0116\63\3\2\2\2\u0117\u0118\b\33\1\2\u0118\u0119\7\30\2\2\u0119"+
		"\u011a\5\66\34\2\u011a\u011f\b\33\1\2\u011b\u011c\7\23\2\2\u011c\u011e"+
		"\5\66\34\2\u011d\u011b\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2"+
		"\u011f\u0120\3\2\2\2\u0120\u0122\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0123"+
		"\b\33\1\2\u0123\u0124\7\31\2\2\u0124\65\3\2\2\2\u0125\u0126\7\20\2\2\u0126"+
		"\67\3\2\2\2\u0127\u0128\5\n\6\2\u0128\u0129\b\35\1\2\u0129\u0130\3\2\2"+
		"\2\u012a\u012b\7\30\2\2\u012b\u012c\5\b\5\2\u012c\u012d\7\31\2\2\u012d"+
		"\u012e\b\35\1\2\u012e\u0130\3\2\2\2\u012f\u0127\3\2\2\2\u012f\u012a\3"+
		"\2\2\2\u01309\3\2\2\2\u0131\u0132\b\36\1\2\u0132\u0133\7\b\2\2\u0133\u0138"+
		"\b\36\1\2\u0134\u0135\5\30\r\2\u0135\u0136\b\36\1\2\u0136\u0138\3\2\2"+
		"\2\u0137\u0131\3\2\2\2\u0137\u0134\3\2\2\2\u0138;\3\2\2\2\17O\u0091\u009b"+
		"\u00a2\u00b7\u00c7\u00e0\u00e6\u010e\u0115\u011f\u012f\u0137";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}