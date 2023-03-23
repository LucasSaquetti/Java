import java.util.Scanner;

public class Milhas013 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma velocidade em quilometros ");
        double quilometros = scanner.nextDouble();
        double milhas = quilometros / 1.61;

        System.out.print(quilometros + " km/h correspondem a: " + String.format("%.2f", milhas) + " mi");

        scanner.close();
    }
    
}
