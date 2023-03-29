import java.util.Scanner;

public class Loteria052 {
    public static void main(String[]args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor apostado do primeiro apostador: ");
        double aposta1 = scanner.nextDouble();
        System.out.print("Digite o valor apostado do segundo apostador: ");
        double aposta2 = scanner.nextDouble();
        System.out.print("Digite o valor apostado do terceiro apostador: ");
        double aposta3 = scanner.nextDouble();
        System.out.print("Digite o valor do prêmio: ");
        double vPremio = scanner.nextDouble();

        double valorApostado = aposta1 + aposta2 + aposta3;
        double p1 = aposta1 / valorApostado;
        double p2 = aposta2 / valorApostado;
        double p3 = aposta3 / valorApostado;

        double premio1 = vPremio * p1;
        double premio2 = vPremio * p2;
        double premio3 = vPremio * p3;

        System.out.println("O primeiro apostador recebe: R$" + String.format("%.2f", premio1));
        System.out.println("O segundo apostador recebe: R$" + String.format("%.2f", premio2));
        System.out.println("O terceiro apostador recebe: R$" + String.format("%.2f", premio3));


        scanner.close();
        
    }
}
