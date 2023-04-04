/*
 * Leia uma distancia em quilometros e apresente-a convertida em milhas. 
 *  A formula de conversao é: M = K / 1,61 , sendo K a distancia em quilometros e M em milhas
 */

import java.util.Scanner;

public class Milhas013 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma velocidade em quilometros ");
        double quilometros = scanner.nextDouble();
        double milhas = quilometros / 1.61;

        System.out.print(quilometros + " km/h correspondem a: " + String.format("%.2f", milhas) + " mi");

        scanner.close();
    }
    
}
