package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    final String nome; //final quer dizer a variavel é constante
    final List<Curso> cursos = new ArrayList<>(); //Lista constante, não pode adicionar novos endereços de memoria
    

    Aluno(String nome) {
        this.nome = nome;
    }

    void adicionarCurso(Curso curso) {
        this.cursos.add(curso);
        curso.alunos.add(this);
    }
    
    public String toString(){
        return nome;
    }
}
