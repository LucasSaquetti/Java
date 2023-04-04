/*
 * Leia o tamanho do lado de um quadrado e imprima como resultado a sua area
 */

import java.util.Scanner;

public class AreaQuadrado033 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do lado do quadrado ");
        double lado = scanner.nextDouble();
        double area = lado * lado;

        System.out.print("A área do quadrado é: " + area);

        scanner.close();
    }
    
}
