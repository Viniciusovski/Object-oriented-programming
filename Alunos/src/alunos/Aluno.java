
package alunos;


public class Aluno {
    private String rgm, nome;
    private char sexo;
    private float notaA, notaB, notaC, notaD;

    public Aluno() {
    }

    public Aluno(String rgm, String nome, char sexo, float notaA, float notaB, float notaC, float notaD) {
        this.rgm = rgm;
        this.nome = nome;
        this.sexo = sexo;
        this.notaA = notaA;
        this.notaB = notaB;
        this.notaC = notaC;
        this.notaD = notaD;
    }
    
    public float getMedia(){
        return((notaA+notaB+notaC+notaD)/4.0f);
        /* ou poderíamos, em vários passos:
        float res;
        res = (notaA+notaB+notaC+notaD)4.0f;
        */
    }

    @Override
    public String toString() {
        return "Aluno{" + "rgm=" + rgm + ", nome=" + 
                nome + ", sexo=" + sexo + ", notaA=" + notaA 
                + ", notaB=" + notaB + ", notaC=" + notaC 
                + ", notaD=" + notaD + ",média=" + getMedia() + '}';
    }
    
    
    
}
