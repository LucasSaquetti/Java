import java.util.Scanner;

public class AreaCirculo034 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do raio do círculo ");
        double raio = scanner.nextDouble();
        double area = 3.14 * (raio * raio);
        System.out.print("A área do círculo é igual a: " + area);

        scanner.close();
    }   
}
