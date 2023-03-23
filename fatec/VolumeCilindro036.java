import java.util.Scanner;

public class VolumeCilindro036 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a altura do cilindro: ");
        double altura = scanner.nextDouble();
        System.out.print("Digite o raio do cilindro: ");
        double raio = scanner.nextDouble();

        double volume = 3.141592 * (raio * raio) * altura;

        System.out.print("O volume do cilindro é: " + volume);

        scanner.close();

    }
    
}
