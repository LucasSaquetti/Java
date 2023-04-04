/*
 * Leia um valor de volume em litros e apresente-o convertido em metros cubicos m³.
 *  A formula de conversao é: M = L / 1000 , sendo L o volume em litros e M o volume em metros
cubicos.
 */

import java.util.Scanner;

public class Litros019 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite os valores em litros: ");
        double litros = scanner.nextDouble();
        double metrosCubicos = litros / 1000;

       System.out.print(litros + " correspondem a: " + metrosCubicos + " m³");

       scanner.close();
    }
    
}
