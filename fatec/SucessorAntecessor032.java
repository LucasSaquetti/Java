import java.util.Scanner;

public class SucessorAntecessor032 {
    public static void main(String[]main){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
            int num = scanner.nextInt();
            int sucTriplo = num * 3 + 1;
            int antDobro = num * 2 - 1;
            int soma = sucTriplo + antDobro;

            System.out.print("Número: " + num + "\nSucessor do triplo: " + sucTriplo + "\nAntecessor do dobro: " + antDobro + "\nSoma dos dois valores: " + soma);

        scanner.close();
    }
}
