package exercicioheranca1;

public class Circulo extends Ponto {
    
    double raio;
    
    Circulo(){
        
    }
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    

    public Circulo(double raio) {
        this.raio = raio;
    }
    
    
    double diametroCir(double diameRaio){
        diameRaio = raio * 2;
        return diameRaio;
    }
    double areaCir(double areaRaio){
        areaRaio = 3.14 * Math.pow(raio, 2);
        return areaRaio;
    }

    @Override
    public String toString() {
        return "Circulo{" + super.toString() + "area=" + areaCir(raio) + " diametro=" + diametroCir(raio);
    }

    
    

    

    
    
}
