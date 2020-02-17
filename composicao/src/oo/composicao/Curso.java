//RELACIONAMENTO MUITOS PARA MUITOS
package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    final String nome; //final quer dizer a variavel é constante
    List<Aluno> alunos = new ArrayList<>();

    Curso(String nome) {
        this.nome = nome;
    }

    void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
        aluno.cursos.add(this);
    }
}
