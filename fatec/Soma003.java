import java.util.Scanner;

public class Soma003 {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do primeiro número ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o valor do segundo número ");
        int num2 = scanner.nextInt();
        System.out.print("Digite o valor do terceiro número ");
        int num3 = scanner.nextInt();

        int soma = num1 + num2 + num3;

        System.out.print("A soma dos três números inteiros é: " + soma);

        scanner.close();
    }

    
}
