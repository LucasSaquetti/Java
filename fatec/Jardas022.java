import java.util.Scanner;

public class Jardas022 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o comprimento em jardas ");
        double jardas = scanner.nextDouble();
        double metros = 0.91 * jardas;
        System.out.print(jardas + " jardas correspondem a: " + String.format("%.2f", metros) + " metros");

        scanner.close();
    }
    
}
