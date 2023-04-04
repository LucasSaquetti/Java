/*
 * Leia um valor de comprimento em metros e apresente-o convertido em jardas.
 *  A formula de conversao é:  J = M 0,91 , sendo J o comprimento em jardas e M o comprimento em
metros.
 */

import javax.swing.JOptionPane;

public class Metros023 {
    public static void main(String[]args){
        double metros = Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento em metros: "));
        double jardas = metros / 0.91;

        JOptionPane.showMessageDialog(null, metros + " metros correspondem a: " + String.format("%.2f", jardas) + " jardas");
    }
    
}
