import java.util.Scanner;

public class Kelvin009 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a temperatura em graus celsius ");
        double celsius = scanner.nextDouble();
        double kelvin = celsius + 273.15;

        System.out.print(celsius + " graus Celsius correspondem a " + String.format("%.2f", kelvin) + " Kelvin");

        scanner.close();
    }

    
    
}
