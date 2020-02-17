
package avalicao;


public class Avalicao {
    private String nome, tipoavalia;
    private float notamaxima;

    public Avalicao() {
    }

    public Avalicao(String nome, String tipoavalia, float notamaxima) {
        this.nome = nome;
        this.tipoavalia = tipoavalia;
        this.notamaxima = notamaxima;
    }
    public float getPercentual(){
        return (notamaxima*100 / 10.0f);
    } 
    
    @Override
    public String toString() {
        return  "Aluno: " + " " +nome +
                "\n Tipo Avaliação: " + tipoavalia +
                "\n Nota Maxima: " +notamaxima +
                "\n Você tem " + getPercentual() + "% da nota final";
    }
}
   

