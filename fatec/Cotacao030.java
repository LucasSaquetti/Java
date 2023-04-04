/*
 * Leia um valor em real e a cotacao do dolar. Em seguida, imprima o valor correspondente em dolares
 */

import javax.swing.JOptionPane;

public class Cotacao030 {
    public static void main(String[]args){
        double real = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em real: "));
        double cotacao = Double.parseDouble(JOptionPane.showInputDialog("Digite a cotação do dólar: "));
        double conversao = real * cotacao;

        JOptionPane.showMessageDialog(null, real + " corresponde a " + conversao + " dólares");
    }
    
}
