/*
 * Leia um valor de comprimento em jardas e apresente-o convertido em metros. A formula
de conversao e: M = 0, 91 ∗ J, sendo J o comprimento em jardas e M o comprimento
em metros.
 */

import java.util.Scanner;

public class Jardas022 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o comprimento em jardas ");
        double jardas = scanner.nextDouble();
        double metros = 0.91 * jardas;
        System.out.print(jardas + " jardas correspondem a: " + String.format("%.2f", metros) + " metros");

        scanner.close();
    }
    
}
