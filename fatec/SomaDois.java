import javax.swing.JOptionPane;

public class SomaDois {
    public static void main(String[]args){
        String auxiliar = javax.swing.JOptionPane.showInputDialog("Digite seu primeiro número");
        int num1 = Integer.parseInt(auxiliar);
        int num2 = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Digite seu segundo número"));
        int soma = num1 + num2;
        JOptionPane.showMessageDialog(null, "A soma é: " + soma);
    }
}