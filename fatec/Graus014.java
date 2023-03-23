import java.util.Scanner;

public class Graus014 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um ângulo em graus: ");
        double graus = scanner.nextDouble();
        double radiano = graus * 3.14 / 180;

        System.out.print(graus + " graus correspondem a: " + String.format("%.2f", radiano) + " radianos");

        scanner.close();
    }
    
}
