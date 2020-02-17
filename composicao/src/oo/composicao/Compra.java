package oo.composicao;

import java.util.ArrayList;

public class Compra {
    
    ArrayList<Item> itens = (ArrayList<Item>) new ArrayList<Item>();
    
    String cliente;
    
    double getValotTotal(){
        double total = 0;
        
        for (Item item: itens) {
            total += item.quantidade * item.preco;
        }
        return total;
    }
}
