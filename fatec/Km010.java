import java.util.Scanner;

public class Km010 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a velocidade em km/h: ");
        double quilometros = scanner.nextDouble();

        double ms = quilometros / 3.6;

        System.out.print(quilometros + " km/h correspondem a: " + String.format("%.1f", ms )+ " m/s");

        scanner.close();

    }
    
}
