/*
 * Faca um programa que leia o valor de um produto e imprima o valor com desconto, tendo
em vista que o desconto foi de 12%
 */

import javax.swing.JOptionPane;

public class Desconto037 {
    public static void main(String[]args){
        double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto: "));
        double desconto = preco * 0.12;
        double valorFinal = preco - desconto;

        JOptionPane.showMessageDialog(null, "O valor do produto com desconto é de: R$" + String.format("%.2f", valorFinal));
    }
    
}
