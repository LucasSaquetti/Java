/*
 * Leia um valor de area em metros quadrados m2 e apresente-o convertido em acres. A
formula de conversão e:  A = M ∗ 0, 000247, sendo M a area em metros quadrados e A
a area em acres.
 */

import java.util.Scanner;

public class Area024 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor em metros quadrados: ");
        double mquadrados = scanner.nextDouble();
        double acre = mquadrados * 0.000247;

        System.out.print(mquadrados + " correspondem a: " + acre + " acres");

        scanner.close();
    }
    
}
