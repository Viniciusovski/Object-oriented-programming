package projetoveiculos;

public class Veiculo {
    private String placa, marca, modelo;
    private int anoFab; 
    private float quilometragem;

    public Veiculo() {
    }

    public Veiculo(String placa, String marca, String modelo, int anoFab, float quilometragem) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.anoFab = anoFab;
        this.quilometragem = quilometragem;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFab() {
        return anoFab;
    }

    public void setAnoFab(int anoFab) {
        this.anoFab = anoFab;
    }

    public float getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(float quilometragem) {
        this.quilometragem = quilometragem;
    }

    @Override
    public String toString() {
        return "Veículo{" + "placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + ", anoFab=" + anoFab + ", quilometragem=" + quilometragem + '}';
    }

}
