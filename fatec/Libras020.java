/*
 * Leia um valor de massa em quilogramas e apresente-o convertido em libras. A formula 
de conversao˜ é L = kg /0,45 , sendo K a massa em quilogramas e L a massa em libras.
 */

import java.util.Scanner;

public class Libras020 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor em quilogramas: ");
        double quilogramas = scanner.nextDouble();
        double libras = quilogramas / 0.45;

        System.out.print(quilogramas + " correspondem a " + String.format("%.2f", libras) + " libras");

        scanner.close();
    }

    
}
