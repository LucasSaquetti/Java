/*
 * Leia um valor de comprimento em centimetros e apresente-o convertido em polegadas.
A formula de conversao e: P = C  / 2,54 , sendo C o comprimento em centimetros e P o
comprimento em polegadas.

 */

import javax.swing.JOptionPane;

public class Centimetros017 {
    public static void main(String[]args){
        double centimetros = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em centímetros: "));
        double polegadas = centimetros / 2.54;

        JOptionPane.showMessageDialog(null, centimetros + " centímetros correspondem a: " + String.format("%.2f", polegadas));
    }
    
}
