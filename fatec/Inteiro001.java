/*
 * Faca um programa que leia um numero inteiro e o imprima.
 */

import javax.swing.JOptionPane;

public class Inteiro001 {
    public static void main(String[]args){

        int num = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Digite seu número"));

        JOptionPane.showMessageDialog(null, "Seu número é: " + num);
    }
}
