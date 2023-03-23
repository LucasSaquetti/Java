import java.util.Scanner;

public class RealQuadrado004 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número real ");
        double num = scanner.nextDouble();

        double quadrado = Math.pow(num, 2);
        
        System.out.print("O número real ao quadrado é igual a: " + String.format("%.2f", quadrado));

        scanner.close();

    }
    
}
