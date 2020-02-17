package projetoveiculos;

public class Caminhao extends Veiculo {  // Caminhão "é um tipo" de Veículo
      private float cargaMaxima;
      private int quantEixos;

    public Caminhao() {
    }

    public Caminhao(float cargaMaxima, int quantEixos, String placa, String marca, String modelo, int anoFab, float quilometragem) {
        super(placa, marca, modelo, anoFab, quilometragem); //executa o construtor de Veiculo
        this.cargaMaxima = cargaMaxima;
        this.quantEixos = quantEixos;
    }

    public float getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(float cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public int getQuantEixos() {
        return quantEixos;
    }

    public void setQuantEixos(int quantEixos) {
        this.quantEixos = quantEixos;
    }

    @Override
    public String toString() {
        //chamamos o super.toString() para mostrar também: placa, marca, modelo...
        return "Caminhão{" + super.toString() + ", cargaMaxima=" + cargaMaxima + ", quantEixos=" + quantEixos + '}';
    }
    
}
