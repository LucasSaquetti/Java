/*
 * Leia um angulo em radianos e apresente-o convertido em graus. A formula de conversao é: G = R ∗ 180/π, sendo G o angulo em graus e R em radianos e π = 3.14.
 */

import javax.swing.JOptionPane;

public class Radianos015 {
    public static void main(String[]args){
        double radiano = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em radianos: "));
        double graus = radiano * 180 / 3.14;

        JOptionPane.showMessageDialog(null, radiano + " correspondem a " + String.format("%.2f", graus) + " graus");

    }
    
}
