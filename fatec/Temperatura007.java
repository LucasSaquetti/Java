/*
 * . Leia uma temperatura em graus Fahrenheit e apresente-a convertida em graus Celsius.
A formula de conversao é: C = 5.0 ∗ (F − 32.0)/9.0, sendo C a temperatura em Celsius
e F a temperatura em Fahrenheit.
 */

import javax.swing.JOptionPane;

public class Temperatura007 {
    public static void main(String[]args){
        double fahrenhient = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em fahrenhient"));
        double celsius = 5 * (fahrenhient - 32) / 9;

        JOptionPane.showMessageDialog(null, fahrenhient + " Fahrenhient correspondem a " + celsius + " graus Celsius");
    }

    
}
