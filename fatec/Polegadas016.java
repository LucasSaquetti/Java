/*
 * Leia um valor de comprimento em polegadas e apresente-o convertido em centımetros.
A formula de conversao é: C = P ∗ 2, 54, sendo C o comprimento em centımetros e P o
comprimento em polegadas.
 */

import javax.swing.JOptionPane;

public class Polegadas016 {
    public static void main(String[]args){
        double polegadas = Double.parseDouble(JOptionPane.showInputDialog("Digite as polegadas: "));
        double centimetros = polegadas * 2.54;

        JOptionPane.showMessageDialog(null, polegadas + " polegadas correspondem a: " + String.format("%.2f", centimetros) + " centímetros");
    }
}