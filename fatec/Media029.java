/*
 * Leia quatro notas, calcule a media aritmética e imprima o resultado
 */

import javax.swing.JOptionPane;

public class Media029 {
    public static void main(String[]args){
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota: "));
        double nota4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quarta nota: "));

        double media = (nota1 + nota2 + nota3 + nota4) / 4;


        JOptionPane.showMessageDialog(null, " A média aritimética é: " + media);
    }
    
}
