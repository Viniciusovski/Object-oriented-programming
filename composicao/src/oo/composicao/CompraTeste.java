package oo.composicao;

public class CompraTeste {
    public static void main(String[] args) {
        
        Compra c1 = new Compra();
        c1.cliente = "João Pedro";
        c1.itens.add(new Item("Caneta", 20, 7.45));
        c1.itens.add(new Item("Borracha", 15, 5.80));
        c1.itens.add(new Item("Mochila", 3, 250.65));
        
        System.out.println(c1.itens.size());
        System.out.println(c1.getValotTotal());
    }
    
}
