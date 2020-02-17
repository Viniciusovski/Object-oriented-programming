
package exercicioheranca1;

public class ExercicioHeranca1 {
        Ponto p1;
        Circulo c1, c2;
        Retangulo r1;

    public static void main(String[] args) {
        // TODO code application logic here
        new ExercicioHeranca1();
    }
    
    public ExercicioHeranca1(){
        criarDados();
        mostraDados();
    }    
    
    void criarDados(){
        p1 = new Ponto(10, 12);
        c1 = new Circulo(20);
        c2 = new Circulo(9);
        r1 = new Retangulo (14, 25);
    }
    
    void mostraDados(){
        System.out.println(p1.toString());
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(r1.toString());
    }
        
        
        
        
        
        
       
        
        
        
    }
    
