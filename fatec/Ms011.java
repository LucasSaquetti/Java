/*
 *Leia uma velocidade em m/s (metros por segundo) e apresente-a convertida em km/h
(quilometros por hora).
 A formula de conversao é: K = M ∗ 3.6, sendo K a velocidade
em km/h e M em m/s. 
 */

import java.util.Scanner;

public class Ms011 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a velocidade em m/s: ");
        double ms = scanner.nextDouble();
        double quilometros = ms * 3.6;

        System.out.print(ms + " m/s correspondem a: " + quilometros + " km/h");

        scanner.close();
    }        
}
