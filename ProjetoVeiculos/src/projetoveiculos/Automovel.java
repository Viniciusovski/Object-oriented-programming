package projetoveiculos;

public class Automovel extends Veiculo {
    private String tipo;  //sedan, hatch ou SUV

    public Automovel() {
    }

    public Automovel(String tipo, String placa, String marca, String modelo, int anoFab, float quilometragem) {
        super(placa, marca, modelo, anoFab, quilometragem); //executa o construtor de Veiculo
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Automóvel{" + super.toString() + ", tipo=" + tipo + '}';
    }
    
    
}
