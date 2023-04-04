/*
 * Faca a leitura de tres valores e apresente como resultado a soma dos quadrados dos tres valores lidos.
 */

import javax.swing.JOptionPane;

public class SomaQuadrado028 {
    public static void main(String[]args){
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: "));
        double num3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro número: "));

        double somaQuadrados = (num1 * num1) + (num2 * num2) + (num3 * num3);

        JOptionPane.showMessageDialog(null, "A soma dos quadrados dos números é: " + somaQuadrados);

    }
    
}
