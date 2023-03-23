import java.util.Scanner;

public class Libras020 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor em quilogramas: ");
        double quilogramas = scanner.nextDouble();
        double libras = quilogramas / 0.45;

        System.out.print(quilogramas + " correspondem a " + String.format("%.2f", libras) + " libras");

        scanner.close();
    }

    
}
