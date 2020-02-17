
package jurosparcelas;

import javax.swing.JOptionPane;

public class JurosParcelas {

    
    public static void main(String[] args) {
        // TODO code application logic here
        float preco = Float.parseFloat(JOptionPane.showInputDialog("Digite o preco: "));
        float parcela = Float.parseFloat(JOptionPane.showInputDialog("Digite o número de parcelas: "));
        if (parcela <= 3){
            float parcelamento = preco / parcela;
            float total = parcelamento * parcela;
            float acres = total * 1.1f;
            JOptionPane.showMessageDialog(null, "O valor total é: " +acres);
            
    }
        if (parcela >= 4){
            float parcelamento = preco / parcela;
            float total = parcelamento * parcela;
            float acres2 = total * 1.2f;
            JOptionPane.showMessageDialog(null, "O valor total é: " +acres2);
            
        }
    
}
}
