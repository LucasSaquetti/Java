/*
 *  Leia um valor de area em metros quadrados  m2 e apresente-o convertido em hectares.
A formula de conversao é: H = M ∗ 0, 0001, sendo M a area em metros quadrados e  H
a area em hectares.
 */

import java.util.Scanner;

public class MQuadrados026 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de área em metros quadrados: ");
        double mquadrados = scanner.nextDouble();
        double hectares = mquadrados * 0.0001;

        System.out.print(mquadrados + " m² equivalem a: " + hectares + " hectares");

        scanner.close();
    }
    
}
