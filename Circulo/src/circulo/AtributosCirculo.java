
package circulo;


public class AtributosCirculo {
    private double raio;

    public AtributosCirculo() {
    }

    public AtributosCirculo(double raio) {
        this.raio = raio;
    }

    @Override
    public String toString() {
        return "Raio do circulo= " + raio + "\n "
                + "Diametro do circulo = " + getDiametro() + "\n Area do circulo = " +getArea();
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    public double getDiametro(){
        return raio * 2;
    }
    
    public double getArea(){
        return (Math.pow(raio, 2)) * 3.14;
    }
}
