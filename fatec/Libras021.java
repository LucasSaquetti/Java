/*
 * Leia um valor de massa em libras e apresente-o convertido em quilogramas. A formula
de conversao é:  K = L∗ 0, 45, sendo K a massa em quilogramas e L a massa em libras.

 */

import java.util.Scanner;

public class Libras021 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor em Libras ");
        double libra = scanner.nextDouble();
        double quilogramas = libra * 0.45;
        System.out.print(libra + " Libras correspondem a: " + quilogramas + " kg");

        scanner.close();
    }
    
}
