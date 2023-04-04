/*
 * . Sejam a e b os catetos de um triangulo, onde a hipotenusa e obtida pela equacao: 
hipotenusa = √a² + b². Faca um programa que receba os valores de a e b e calcule
o valor da hipotenusa atraves da equacao. Imprima o resultado dessa operacao
 */

import java.util.Scanner;

public class Hipotenusa035 {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do cateto a: ");
        double a = scanner.nextDouble();
        System.out.print("Digite o valor do cateto b: ");
        double b = scanner.nextDouble();

        double hipotenusa = Math.sqrt(Math.pow(a, 2) + (Math.pow(b, 2)));

        System.out.print("O valor da hipotenusa é: " + hipotenusa);

        scanner.close();
    }
    
}
