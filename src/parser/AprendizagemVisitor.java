// Generated from C:/Users/GL502V/Documents/Univ/Mestrado/GA/Projeto/src\Aprendizagem.g4 by ANTLR 4.9
package parser;

    import aprendizagem.*;
    import java.util.ArrayList;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AprendizagemParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AprendizagemVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AprendizagemParser#aprendizagem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAprendizagem(AprendizagemParser.AprendizagemContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprendizagemParser#recursos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecursos(AprendizagemParser.RecursosContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprendizagemParser#recursol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecursol(AprendizagemParser.RecursolContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprendizagemParser#recurso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecurso(AprendizagemParser.RecursoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprendizagemParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(AprendizagemParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprendizagemParser#desc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesc(AprendizagemParser.DescContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprendizagemParser#atributos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtributos(AprendizagemParser.AtributosContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprendizagemParser#idade_range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdade_range(AprendizagemParser.Idade_rangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprendizagemParser#tempo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTempo(AprendizagemParser.TempoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprendizagemParser#lista_emocional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_emocional(AprendizagemParser.Lista_emocionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprendizagemParser#emocaol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmocaol(AprendizagemParser.EmocaolContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprendizagemParser#emocao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmocao(AprendizagemParser.EmocaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprendizagemParser#quadrante}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuadrante(AprendizagemParser.QuadranteContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprendizagemParser#x}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitX(AprendizagemParser.XContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprendizagemParser#y}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitY(AprendizagemParser.YContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprendizagemParser#cprogs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCprogs(AprendizagemParser.CprogsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprendizagemParser#cprogl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCprogl(AprendizagemParser.CproglContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprendizagemParser#cprog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCprog(AprendizagemParser.CprogContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprendizagemParser#alunos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlunos(AprendizagemParser.AlunosContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprendizagemParser#aluno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAluno(AprendizagemParser.AlunoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprendizagemParser#idade}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdade(AprendizagemParser.IdadeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprendizagemParser#personalidade}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPersonalidade(AprendizagemParser.PersonalidadeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprendizagemParser#queries}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueries(AprendizagemParser.QueriesContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprendizagemParser#querie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuerie(AprendizagemParser.QuerieContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprendizagemParser#recursoquerie}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecursoquerie(AprendizagemParser.RecursoquerieContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprendizagemParser#tipos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipos(AprendizagemParser.TiposContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprendizagemParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(AprendizagemParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprendizagemParser#recursotarget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecursotarget(AprendizagemParser.RecursotargetContext ctx);
	/**
	 * Visit a parse tree produced by {@link AprendizagemParser#alunotarget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlunotarget(AprendizagemParser.AlunotargetContext ctx);
}