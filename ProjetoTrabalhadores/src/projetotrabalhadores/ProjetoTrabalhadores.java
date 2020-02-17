package projetotrabalhadores;

import javax.swing.JOptionPane;

public class ProjetoTrabalhadores {

    public static void main(String[] args) {
        // Em lugar da leitura de dados solicitada, vou criar 4 objetos
        // fixos, só para testae as lógicas restantes:
        Trabalhador tr1 = new Trabalhador("111.222.333.44", "Ana Lopes", "R Melo Alves", 22, 'F', 4500);
        Trabalhador tr2 = new Trabalhador("111.222.333.44", "Luiz Lima", "R Melo Alves", 22, 'M', 6000);
        Trabalhador tr3 = new Trabalhador("111.222.333.44", "Pedro Alves", "R Melo Alves", 22, 'M', 3500);
        Trabalhador tr4 = new Trabalhador("111.222.333.44", "Betty Silva", "R Melo Alves", 22, 'F', 5000);

        float media = (tr1.getSalario() + tr2.getSalario() + tr3.getSalario() + tr4.getSalario()) / 4;
        JOptionPane.showMessageDialog(null, "A média dos salários dos 4 trabalhadores é R$ " + media);

        //média dos salarios das mulheres
        int qtdemulh = 0;
        float somamulh = 0;
        if (tr1.getSexo() == 'F') {
            qtdemulh++; //conto esta mulher
            somamulh += tr1.getSalario();//somo seu salário
        }
        if (tr2.getSexo() == 'F') {
            qtdemulh++; //conto esta mulher
            somamulh += tr2.getSalario();//somo seu salário
        }
        if (tr3.getSexo() == 'F') {
            qtdemulh++; //conto esta mulher
            somamulh += tr3.getSalario();//somo seu salário
        }
        if (tr4.getSexo() == 'F') {
            qtdemulh++; //conto esta mulher
            somamulh += tr4.getSalario();//somo seu salário
        }
        if (qtdemulh > 0) {
            float mediamulh = somamulh / qtdemulh;
            JOptionPane.showMessageDialog(null, "A média dos salarios das mulhres é R$" + mediamulh);
        } else {
            JOptionPane.showMessageDialog(null, "Esta empresa não tem mulhres. MACHISTA!");
        }
        //visualizar os dados do trabalhador que recebe o maior salario na empresa:
        float maior = 0; //variavel para guardra o maior salario
        Trabalhador trMaior = null; //para guardar o trabalhador que ganha mais
        if (tr1.getSalario() > maior) {
            maior = tr1.getSalario();
            trMaior = tr1;
        }
        if (tr2.getSalario() > maior) {
            maior = tr2.getSalario();
            trMaior = tr2;
        }
        if (tr3.getSalario() > maior) {
            maior = tr3.getSalario();
            trMaior = tr3;
        }
        if (tr4.getSalario() > maior) {
            maior = tr4.getSalario();
            trMaior = tr4;
        }
        JOptionPane.showMessageDialog(null, "O maior salário da empresa é R$" +maior);
        JOptionPane.showMessageDialog(null, "O Trabalhador com maior salario na empresa é?" + trMaior.toString());

    }
}
