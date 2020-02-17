package projetoveiculos;

public class ProjetoVeiculos {
    //para guardar vários objetos:
    private Automovel a1, a2, a3;
    private Caminhao c1, c2;
    
    public static void main(String[] args) {
       new ProjetoVeiculos();
    }
    
    public ProjetoVeiculos() {
        criaVariosObjetos();
        mostraDadosDosObjetos();
    }
    
    public void criaVariosObjetos() {
        a1 = new Automovel("hatch", "GBA-1234", "Fiat", "Pálio", 2017, 4000.0f);
        a2 = new Automovel("sedan", "FDA-4578", "Audi", "A4", 2018, 850.0f);
        a3 = new Automovel("SUV", "GAY-2145", "Mitsubishi", "Eclipse", 2020, 10.0f);
        c1 = new Caminhao(2000.0f, 3, "CDA-1222", "Volvo", "Scania", 1999, 50000.0f);
        c2 = new Caminhao(4000.0f, 4, "EDF-4321", "Fiat", "190E", 2017, 3000.0f);
    }
    
    public void mostraDadosDosObjetos() {
        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a3.toString());
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
