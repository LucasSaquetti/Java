/*
 * Faca um programa que leia um numero real e o imprima
 */

import java.io.IOException;
import java.util.Scanner;

public class Real002 {
    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite um número real");
            double real = Double.parseDouble(scanner.nextLine());
            System.out.println("O número digitado é: " + real);
        } catch (NumberFormatException e) {

            e.printStackTrace();
        }
    }
}

