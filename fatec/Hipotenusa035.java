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
