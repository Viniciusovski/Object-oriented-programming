
package avalicao;
import javax.swing.*;


public class Avaliados {
     public static void main(String[] args){
         String onome, otipoavalia;
         float nota;
         
         onome = JOptionPane.showInputDialog(null, "Digite O nome", JOptionPane.QUESTION_MESSAGE);
         otipoavalia = JOptionPane.showInputDialog(null, "Digite o tipo da avaliação", JOptionPane.QUESTION_MESSAGE);
         nota = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a sua nota nessa avaliação", JOptionPane.QUESTION_MESSAGE));
         
         Avalicao a = new Avalicao (onome, otipoavalia, nota);
         JOptionPane.showInputDialog(null, a.toString());
     }
    
}
