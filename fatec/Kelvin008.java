import java.util.Scanner;

public class Kelvin008 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma temperatura em Kelvin ");
        double Kelvin = scanner.nextDouble();
        double celsius = Kelvin - 273.15;
         
        System.out.print(Kelvin + " em Kelvin correspondem a " + String.format("%.1f", celsius) + " graus Celsius");

        scanner.close();
    }

}
