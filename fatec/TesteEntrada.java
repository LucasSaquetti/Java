import javax.swing.JOptionPane;

public class TesteEntrada {
    public static void main(String[]args){
        String nome;
        nome = JOptionPane.showInputDialog("Digite seu nome");
        String sobrenome = JOptionPane.showInputDialog("Digite seu nome");
        JOptionPane.showMessageDialog(null, "Seu nome completo é: " + nome + " " + sobrenome);


    }
    
}
