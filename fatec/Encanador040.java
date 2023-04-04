/*
 * Uma empresa contrata um encanador a R$ 30,00 por dia. Faça um programa que solicite
o numero de dias trabalhados pelo encanador e imprima a quantia líquida que devera ser
paga, sabendo-se que sao descontados 8% para imposto de renda.
 */

import java.util.Scanner;

public class Encanador040 {
    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos dias o encanador trabalhou: ");
        int dias = scanner.nextInt();

        double liquida = (dias * 30.0) * 0.92;

        System.out.println("O encanador receberá R$" + liquida);

        scanner.close();
    }
}
