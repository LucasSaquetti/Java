/*
 * Leia o salario de um funcionario. Calcule e imprima o valor do novo salario, sabendo que 
ele recebeu um aumento de 25%
 */

import java.util.Scanner;

public class Aumento038 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu salário: R$");
        double salario = scanner.nextDouble();

        double aumento = 25 * salario / 100;
        double salarioAumento = salario + aumento;

        System.out.print("Salário anterior: R$" + String.format("%.2f", salario) + "\nSalário após o aumento: R$" + String.format("%.2f", salarioAumento));

        scanner.close();
    }
    
}
