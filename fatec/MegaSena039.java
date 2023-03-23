import java.util.Scanner;

public class MegaSena039 {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a premiação total da Mega Sena ");
        double vMegaSena = scanner.nextDouble();
        double primeiro = vMegaSena * 46 / 100;
        double segundo = vMegaSena * 32 / 100;
        double resto = vMegaSena - (primeiro + segundo);
        double terceiro = resto;

        //saida
        System.out.print("A premiação do primeiro ganhador é de R$" + String.format("%.2f", primeiro) + 
        "\nA premiação do segundo ganhador é de R$" + String.format("%.2f", segundo) +  
        "\nA premiação do terceiro ganhador é de R$" + String.format("%.2f", terceiro));

        scanner.close();
    }
}
