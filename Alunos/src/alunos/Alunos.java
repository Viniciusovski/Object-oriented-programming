
package alunos;
import javax.swing.*; //importar as classes do pacote swing


public class Alunos {

    
    public static void main(String[] args) {
        //Vamos criar dois obejtos da classe Aluno, com dados digitados pelo usuário:
        String orgm, onome;
        char osexo;
        float na, nb, nc, nd;
        
        //primeiro aluno:
        orgm = JOptionPane.showInputDialog(null, "Digite o RGM do 1° Aluno", "RGM", JOptionPane.QUESTION_MESSAGE);
        onome = JOptionPane.showInputDialog(null, "Digite o nome do 1° Aluno", "Nome", JOptionPane.QUESTION_MESSAGE);
        osexo = JOptionPane.showInputDialog(null, "Digte o sexo do 1° Aluno", "Sexo", JOptionPane.QUESTION_MESSAGE).charAt(0); // 1° Letra
        na = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a Nota A do 1° Aluno", "Nota A", JOptionPane.QUESTION_MESSAGE));
        nb = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a Nota B do 1° Aluno", "Nota B", JOptionPane.QUESTION_MESSAGE));
        nc = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a Nota C do 1° Aluno", "Nota C", JOptionPane.QUESTION_MESSAGE));
        nd = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a Nota D do 1° Aluno", "Nota D", JOptionPane.QUESTION_MESSAGE));
        
        //criamos o primeiro objeto com os dados fornecido pelo usuário:
        Aluno eu  = new Aluno(orgm, onome, osexo, na, nb, nc, nd);
        //mostramos todos os dados do 1° Aluno:
        JOptionPane.showInputDialog(null, eu.toString());
        
        
        //segundo aluno:
        orgm = JOptionPane.showInputDialog(null, "Digite o RGM do 2° Aluno", "RGM", JOptionPane.QUESTION_MESSAGE);
        onome = JOptionPane.showInputDialog(null, "Digite o nome do 2° Aluno", "Nome", JOptionPane.QUESTION_MESSAGE);
        osexo = JOptionPane.showInputDialog(null, "Digte o sexo do 2° Aluno", "Sexo", JOptionPane.QUESTION_MESSAGE).charAt(0); // 1° Letra
        na = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a Nota A do 2° Aluno", "Nota A", JOptionPane.QUESTION_MESSAGE));
        nb = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a Nota B do 2° Aluno", "Nota B", JOptionPane.QUESTION_MESSAGE));
        nc = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a Nota C do 2° Aluno", "Nota C", JOptionPane.QUESTION_MESSAGE));
        nd = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a Nota D do 2° Aluno", "Nota D", JOptionPane.QUESTION_MESSAGE));
        
        //criamos o primeiro objeto com os dados fornecido pelo usuário:
        Aluno colega  = new Aluno(orgm, onome, osexo, na, nb, nc, nd);
        //mostramos todos os dados do 1° Aluno:
        JOptionPane.showInputDialog(null, eu.toString());
        
        
    }
    
}
