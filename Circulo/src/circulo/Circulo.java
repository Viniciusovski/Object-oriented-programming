
package circulo;

import javax.swing.JOptionPane;


public class Circulo {

    
    public static void main(String[] args) {
        // TODO code application logic here
        double oraio = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio do circulo: ", JOptionPane.QUESTION_MESSAGE));
        if (oraio < 0){
            JOptionPane.showMessageDialog(null, "O valor não pode ser negativo");
        }
        
        AtributosCirculo ocirculo = new AtributosCirculo (oraio);
        JOptionPane.showInputDialog(null, ocirculo.toString());
        
        
        
    }
    
}
