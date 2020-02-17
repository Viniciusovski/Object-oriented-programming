package exercicioheranca1;

public class Retangulo extends Ponto {
    double ladoA;
    double ladoB;
    
    Retangulo(){
        
    }

    public double getLadoA() {
        return ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }
    

    public Retangulo(double ladoA, double ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }
    
    double diametroRet(){
        return (ladoA*2) + (ladoB*2);
    }
    
    double areaRet(){
        return ladoA * ladoB;
    }

    @Override
    public String toString() {
        return "Retangulo{"+ super.toString() +"diametro=" + diametroRet() +" area=" + areaRet();
    }

    
}

