// Generated from C:/Users/GL502V/Documents/Univ/Mestrado/GA/Projeto/src\Aprendizagem.g4 by ANTLR 4.9
package parser;

    import aprendizagem.*;
    import java.util.ArrayList;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AprendizagemParser}.
 */
public interface AprendizagemListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AprendizagemParser#aprendizagem}.
	 * @param ctx the parse tree
	 */
	void enterAprendizagem(AprendizagemParser.AprendizagemContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprendizagemParser#aprendizagem}.
	 * @param ctx the parse tree
	 */
	void exitAprendizagem(AprendizagemParser.AprendizagemContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprendizagemParser#recursos}.
	 * @param ctx the parse tree
	 */
	void enterRecursos(AprendizagemParser.RecursosContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprendizagemParser#recursos}.
	 * @param ctx the parse tree
	 */
	void exitRecursos(AprendizagemParser.RecursosContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprendizagemParser#recursol}.
	 * @param ctx the parse tree
	 */
	void enterRecursol(AprendizagemParser.RecursolContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprendizagemParser#recursol}.
	 * @param ctx the parse tree
	 */
	void exitRecursol(AprendizagemParser.RecursolContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprendizagemParser#recurso}.
	 * @param ctx the parse tree
	 */
	void enterRecurso(AprendizagemParser.RecursoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprendizagemParser#recurso}.
	 * @param ctx the parse tree
	 */
	void exitRecurso(AprendizagemParser.RecursoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprendizagemParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(AprendizagemParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprendizagemParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(AprendizagemParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprendizagemParser#desc}.
	 * @param ctx the parse tree
	 */
	void enterDesc(AprendizagemParser.DescContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprendizagemParser#desc}.
	 * @param ctx the parse tree
	 */
	void exitDesc(AprendizagemParser.DescContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprendizagemParser#atributos}.
	 * @param ctx the parse tree
	 */
	void enterAtributos(AprendizagemParser.AtributosContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprendizagemParser#atributos}.
	 * @param ctx the parse tree
	 */
	void exitAtributos(AprendizagemParser.AtributosContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprendizagemParser#idade_range}.
	 * @param ctx the parse tree
	 */
	void enterIdade_range(AprendizagemParser.Idade_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprendizagemParser#idade_range}.
	 * @param ctx the parse tree
	 */
	void exitIdade_range(AprendizagemParser.Idade_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprendizagemParser#interacao}.
	 * @param ctx the parse tree
	 */
	void enterInteracao(AprendizagemParser.InteracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprendizagemParser#interacao}.
	 * @param ctx the parse tree
	 */
	void exitInteracao(AprendizagemParser.InteracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprendizagemParser#tempo}.
	 * @param ctx the parse tree
	 */
	void enterTempo(AprendizagemParser.TempoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprendizagemParser#tempo}.
	 * @param ctx the parse tree
	 */
	void exitTempo(AprendizagemParser.TempoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprendizagemParser#lista_emocional}.
	 * @param ctx the parse tree
	 */
	void enterLista_emocional(AprendizagemParser.Lista_emocionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprendizagemParser#lista_emocional}.
	 * @param ctx the parse tree
	 */
	void exitLista_emocional(AprendizagemParser.Lista_emocionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprendizagemParser#emocaol}.
	 * @param ctx the parse tree
	 */
	void enterEmocaol(AprendizagemParser.EmocaolContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprendizagemParser#emocaol}.
	 * @param ctx the parse tree
	 */
	void exitEmocaol(AprendizagemParser.EmocaolContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprendizagemParser#emocao}.
	 * @param ctx the parse tree
	 */
	void enterEmocao(AprendizagemParser.EmocaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprendizagemParser#emocao}.
	 * @param ctx the parse tree
	 */
	void exitEmocao(AprendizagemParser.EmocaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprendizagemParser#quadrante}.
	 * @param ctx the parse tree
	 */
	void enterQuadrante(AprendizagemParser.QuadranteContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprendizagemParser#quadrante}.
	 * @param ctx the parse tree
	 */
	void exitQuadrante(AprendizagemParser.QuadranteContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprendizagemParser#x}.
	 * @param ctx the parse tree
	 */
	void enterX(AprendizagemParser.XContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprendizagemParser#x}.
	 * @param ctx the parse tree
	 */
	void exitX(AprendizagemParser.XContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprendizagemParser#y}.
	 * @param ctx the parse tree
	 */
	void enterY(AprendizagemParser.YContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprendizagemParser#y}.
	 * @param ctx the parse tree
	 */
	void exitY(AprendizagemParser.YContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprendizagemParser#cprogs}.
	 * @param ctx the parse tree
	 */
	void enterCprogs(AprendizagemParser.CprogsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprendizagemParser#cprogs}.
	 * @param ctx the parse tree
	 */
	void exitCprogs(AprendizagemParser.CprogsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprendizagemParser#cprogl}.
	 * @param ctx the parse tree
	 */
	void enterCprogl(AprendizagemParser.CproglContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprendizagemParser#cprogl}.
	 * @param ctx the parse tree
	 */
	void exitCprogl(AprendizagemParser.CproglContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprendizagemParser#cprog}.
	 * @param ctx the parse tree
	 */
	void enterCprog(AprendizagemParser.CprogContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprendizagemParser#cprog}.
	 * @param ctx the parse tree
	 */
	void exitCprog(AprendizagemParser.CprogContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprendizagemParser#alunos}.
	 * @param ctx the parse tree
	 */
	void enterAlunos(AprendizagemParser.AlunosContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprendizagemParser#alunos}.
	 * @param ctx the parse tree
	 */
	void exitAlunos(AprendizagemParser.AlunosContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprendizagemParser#aluno}.
	 * @param ctx the parse tree
	 */
	void enterAluno(AprendizagemParser.AlunoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprendizagemParser#aluno}.
	 * @param ctx the parse tree
	 */
	void exitAluno(AprendizagemParser.AlunoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprendizagemParser#idade}.
	 * @param ctx the parse tree
	 */
	void enterIdade(AprendizagemParser.IdadeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprendizagemParser#idade}.
	 * @param ctx the parse tree
	 */
	void exitIdade(AprendizagemParser.IdadeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprendizagemParser#personalidade}.
	 * @param ctx the parse tree
	 */
	void enterPersonalidade(AprendizagemParser.PersonalidadeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprendizagemParser#personalidade}.
	 * @param ctx the parse tree
	 */
	void exitPersonalidade(AprendizagemParser.PersonalidadeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprendizagemParser#queries}.
	 * @param ctx the parse tree
	 */
	void enterQueries(AprendizagemParser.QueriesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprendizagemParser#queries}.
	 * @param ctx the parse tree
	 */
	void exitQueries(AprendizagemParser.QueriesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprendizagemParser#querie}.
	 * @param ctx the parse tree
	 */
	void enterQuerie(AprendizagemParser.QuerieContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprendizagemParser#querie}.
	 * @param ctx the parse tree
	 */
	void exitQuerie(AprendizagemParser.QuerieContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprendizagemParser#recursoquerie}.
	 * @param ctx the parse tree
	 */
	void enterRecursoquerie(AprendizagemParser.RecursoquerieContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprendizagemParser#recursoquerie}.
	 * @param ctx the parse tree
	 */
	void exitRecursoquerie(AprendizagemParser.RecursoquerieContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprendizagemParser#tipos}.
	 * @param ctx the parse tree
	 */
	void enterTipos(AprendizagemParser.TiposContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprendizagemParser#tipos}.
	 * @param ctx the parse tree
	 */
	void exitTipos(AprendizagemParser.TiposContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprendizagemParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(AprendizagemParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprendizagemParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(AprendizagemParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprendizagemParser#recursotarget}.
	 * @param ctx the parse tree
	 */
	void enterRecursotarget(AprendizagemParser.RecursotargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprendizagemParser#recursotarget}.
	 * @param ctx the parse tree
	 */
	void exitRecursotarget(AprendizagemParser.RecursotargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link AprendizagemParser#alunotarget}.
	 * @param ctx the parse tree
	 */
	void enterAlunotarget(AprendizagemParser.AlunotargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link AprendizagemParser#alunotarget}.
	 * @param ctx the parse tree
	 */
	void exitAlunotarget(AprendizagemParser.AlunotargetContext ctx);
}