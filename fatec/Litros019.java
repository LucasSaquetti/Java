import java.util.Scanner;

public class Litros019 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite os valores em litros: ");
        double litros = scanner.nextDouble();
        double metrosCubicos = litros / 1000;

       System.out.print(litros + " correspondem a: " + metrosCubicos + " m³");

       scanner.close();
    }
    
}
