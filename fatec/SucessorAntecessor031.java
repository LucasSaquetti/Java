import java.util.Scanner;

public class SucessorAntecessor031 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = scanner.nextInt();

        int antecessor = num - 1;
        int sucessor = num + 1;
        System.out.print("Sucessor: " + sucessor + "\nAntecessor: " + antecessor);
    

        scanner.close();

    }
    
    
}
