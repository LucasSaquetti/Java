import java.util.Scanner;

public class Encanador040 {
    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos dias o encanador trabalhou: ");
        int dias = scanner.nextInt();

        double liquida = (dias * 30.0) * 0.92;

        System.out.println("O encanador receberá R$" + liquida);

        scanner.close();
    }
}
