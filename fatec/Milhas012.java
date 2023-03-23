import java.util.Scanner;

public class Milhas012 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma velocidade em milhas ");
        double milhas = scanner.nextDouble();

        double quilometros = 1.61 * milhas;

        System.out.print(milhas + " mi correspondem a: " + String.format("%.2f", quilometros) + " km/h");

        scanner.close();
    }
    
}
