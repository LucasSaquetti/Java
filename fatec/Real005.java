import java.util.Scanner;

public class Real005 {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número real: ");
        double num = scanner.nextDouble();
        double divisao = num / 5;
        System.out.print("O resultado é: " + divisao);

        scanner.close();

    }
    
}
