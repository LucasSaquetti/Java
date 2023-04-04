/*
 * Leia uma temperatura em graus Celsius e apresente-a convertida em graus Fahrenheit.
A formula de conversao é: F = C∗(9.0/5.0)+32.0, sendo F a temperatura em Fahrenheit
e C a temperatura em Celsius.
 */

import javax.swing.JOptionPane;

public class Temperatura006 {
    public static void main(String[]args){
        double celsius = Double.parseDouble(JOptionPane.showInputDialog("Digite uma temperatura"));
        double fahrenhient = celsius * 1.8 + 32;
        JOptionPane.showMessageDialog(null, celsius + " graus Celsius correspondem a: " + fahrenhient + " Fahrenhient");
    }

}