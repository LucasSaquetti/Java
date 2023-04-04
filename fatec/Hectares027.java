/*
 * Leia um valor de area em hectares e apresente-o convertido em metros quadrados m2.
A formula de conversao e:  M = H ∗ 10000, sendo M a area em metros quadrados e H a area em hectares.
 */

import javax.swing.JOptionPane;

public class Hectares027 {
    public static void main(String[]args){
        double hectares = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor de área em hectares: "));
        double mquadrados = hectares * 10000;
        JOptionPane.showMessageDialog(null, hectares + " hectares correspondem a: " + mquadrados + " m²");
    }
    
}
