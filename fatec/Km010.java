/*
 * Leia uma velocidade em km/h (quilometros por hora) e apresente-a convertida em m/s
(metros por segundo). A formula de conversao é: M = K/3.6, sendo K a velocidade em
km/h e M em m/s.

 */

import java.util.Scanner;

public class Km010 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a velocidade em km/h: ");
        double quilometros = scanner.nextDouble();

        double ms = quilometros / 3.6;

        System.out.print(quilometros + " km/h correspondem a: " + String.format("%.1f", ms )+ " m/s");

        scanner.close();

    }
    
}
