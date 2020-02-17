//RELACIONAMENTO MUITOS PARA MUITOS
package oo.composicao;

public class CursoTeste {
    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno ("Miha");
        Aluno aluno2 = new Aluno ("Roberta");
        Aluno aluno3 = new Aluno ("Diego");
        
        Curso curso1 = new Curso("Direito");
        Curso curso2 = new Curso("Jornalismo");
        Curso curso3 = new Curso("Medicina");
        
        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);
        
        curso2.adicionarAluno(aluno1);
        curso2.adicionarAluno(aluno3);
        
        aluno1.adicionarCurso(curso3);
        aluno2.adicionarCurso(curso3);
        aluno3.adicionarCurso(curso3);
        
        for(Aluno aluno: curso1.alunos){
            System.out.println("Estou matriculado no curso 1...");
            System.out.println("... e o meu nome é "+ aluno.nome);
            System.out.println();
        }
        
        for(Aluno aluno: curso3.alunos){
            System.out.println("Estou matriculado no curso "+ curso3.nome);
            System.out.println("... e o meu nome é "+ aluno.nome);
            System.out.println();
        }
        
        System.out.println(aluno1.cursos.get(0).alunos);
    }
    
}
