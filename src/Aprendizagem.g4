/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
grammar Aprendizagem;

@header {
    import aprendizagem.*;
    import java.util.ArrayList;
}

aprendizagem: { Database data = new Database(); }
              RECURSOS LEFTCURL recursos RIGHTCURL { data.setRecursos($recursos.lista); }
              ALUNOS LEFTCURL alunos RIGHTCURL     { data.setAlunos($alunos.lista); }
              queries[data];

recursos returns[ArrayList<Recurso> lista]: { $lista = new ArrayList<>(); }
          recursol[$lista]
          (PVIR recursol[$lista])*
          PVIR                              { System.out.println("[INFO] Recursos lidos: " + $lista.size()); };

recursol [ArrayList<Recurso> lista]: { Recurso rec = new Recurso(); }
         id VIR                      { rec.setId(Integer.parseInt($id.text)); }
         desc VIR                    { rec.setDesc($desc.text); }
         tipo VIR                    { rec.setTipo($tipo.text); }
         atributos                   { rec.setAtributos($atributos.atr); lista.add(rec); };

recurso returns[Recurso rec]: { $rec = new Recurso(); }
         id VIR               { $rec.setId(Integer.parseInt($id.text)); }
         desc VIR             { $rec.setDesc($desc.text); }
         tipo VIR             { $rec.setTipo($tipo.text); }
         atributos            { $rec.setAtributos($atributos.atr); System.out.println($rec.toString()); };

id: NUM;

desc: TEXT;

atributos returns[Atributos atr]: { $atr = new Atributos(); }
           LEFTPAREN
           idade_range VIR        { $atr.setIdadeMin($idade_range.min); $atr.setIdadeMax($idade_range.max); }
           tempo VIR              { $atr.setTempo($tempo.text.charAt(0)); }
           lista_emocional VIR    { for(Emocao e : $lista_emocional.lista){ $atr.addEmocao(e); } }
           cprogs                 { for(String cp : $cprogs.lista){ $atr.addCprog(cp); } }
           RIGHTPAREN;

idade_range returns[int min, int max]:
             NUM { $max = $NUM.int; }
             RANGE
             NUM { $min = $NUM.int; };

tempo: LONG
     | MEDIUM
     | SHORT;

lista_emocional returns[ArrayList<Emocao> lista]: { $lista = new ArrayList<>(); }
                 LEFTSTRAIGHT
                 emocaol[$lista]
                 (VIR emocaol[$lista])*
                 RIGHTSTRAIGHT;

emocaol[ArrayList<Emocao> lista]:
      TEXT         { Emocao emo = new Emocao($TEXT.text); lista.add(emo); }
      | quadrante  { Emocao emo = new Emocao($quadrante.posX, $quadrante.posY); lista.add(emo); } ;

emocao returns[Emocao emo]:
      TEXT         { $emo = new Emocao($TEXT.text); }
      | quadrante  { $emo = new Emocao($quadrante.posX, $quadrante.posY); } ;

quadrante returns[int posX, int posY]:
           LEFTPAREN
           x            { $posX = Integer.parseInt($x.text); }
           VIR
           y            { $posY = Integer.parseInt($y.text); }
           RIGHTPAREN;

x: NUM;

y: NUM;

cprogs returns[ArrayList<String> lista]: { $lista = new ArrayList<>(); }
        LEFTPAREN
        cprogl[$lista]
        (VIR cprogl[$lista])*
        RIGHTPAREN;

cprogl[ArrayList<String> lista]: TEXT { lista.add($TEXT.text); };

cprog: TEXT;

alunos returns[ArrayList<Aluno> lista]: { $lista = new ArrayList<>(); }
        aluno[$lista]
        (PVIR aluno[$lista])*
        PVIR                            { System.out.println("[INFO] Alunos lidos: " + $lista.size()); };

aluno [ArrayList<Aluno> lista]: { Aluno al = new Aluno(); }
       ALUNOID VIR              { al.setId($ALUNOID.text); }
       idade VIR                { al.setIdade(Integer.parseInt($idade.text)); }
       personalidade            { for(Emocao e : $personalidade.lista){ al.addEmocao(e); } lista.add(al); };

idade: NUM;

personalidade returns[ArrayList<Emocao> lista]: { $lista = new ArrayList<>(); }
               emocao                           { $lista.add($emocao.emo); }
             | lista_emocional                  { $lista = new ArrayList<>($lista_emocional.lista); };


queries[Database d]:
         querie[d]
         (querie[d])*;

querie[Database d]:
      QUESTION FIND recursoquerie TOTEACH cprog TO alunotarget[d] PVIR { d.findRecursosSingleAluno($recursoquerie.lista,$cprog.text,$alunotarget.al,$QUESTION.line); }
      | QUESTION FIND recursoquerie TOTEACH cprog PVIR                 { d.findRecursosCprog($recursoquerie.lista,$cprog.text,$QUESTION.line); }
      | QUESTION FIND ALUNOS TOTEACH recursotarget[d] PVIR             { d.findAlunosSingleRecurso($recursotarget.rec,$QUESTION.line); }
      | QUESTION GET ALUNOID PVIR                                      { d.getSingleAluno($ALUNOID.text,$QUESTION.line); }
      | QUESTION GET id PVIR                                           { d.getSingleRecurso(Integer.parseInt($id.text),$QUESTION.line); };


recursoquerie returns[ArrayList<String> lista]: { $lista = new ArrayList<>(); }
             RECURSOS
             | tipos                            { $lista = $tipos.lista; } ;

tipos returns[ArrayList<String> lista]: { $lista = new ArrayList<>(); }
       LEFTPAREN
       tipo                             { $lista.add($tipo.text); }
       (VIR tipo)*                      { $lista.add($tipo.text); }
       RIGHTPAREN;

tipo: TEXT;

recursotarget[Database d] returns [Recurso rec]:
             id                                  { $rec = d.findRecurso(Integer.parseInt($id.text)); }
             | LEFTPAREN recurso RIGHTPAREN      { $rec = $recurso.rec; };

alunotarget[Database d] returns [Aluno al]: { $al = new Aluno(); }
           ALUNOID                          { $al = d.findAluno($ALUNOID.text); }
           | emocao                         { $al.addEmocao($emocao.emo); };



//LEXER

RECURSOS: [R][E][C][U][R][S][O][S];
ALUNOS:'ALUNOS';

LONG: [Ll];
MEDIUM: [Mm];
SHORT: [Ss];

ALUNOID: ('A'|'PG')[0-9]+;

//QUERIES
QUESTION: '?';
FIND: [Ff][iI][nN][dD]|[fF];
GET: [Gg][eE][tT]|[gG];
TOTEACH: 'TOTEACH';
TO: 'TO';
WITH: 'WITH';

//TOKENS
NUM: '-'?[0-9]+;
TEXT: [a-zA-Z]+;
SETA: '->';
BARRA: '|';
VIR: ',';
PVIR: ';';
PTO: '.';
LEFTCURL: '{';
RIGHTCURL: '}';
LEFTPAREN: '(';
RIGHTPAREN: ')';
LEFTSTRAIGHT: '[';
RIGHTSTRAIGHT: ']';
RANGE: '..';
WS: ('\r'?'\n'|'\t'|' ') -> skip;
