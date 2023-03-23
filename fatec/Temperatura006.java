
import javax.swing.JOptionPane;

public class Temperatura006 {
    public static void main(String[]args){
        double celsius = Double.parseDouble(JOptionPane.showInputDialog("Digite uma temperatura"));
        double fahrenhient = celsius * 1.8 + 32;
        JOptionPane.showMessageDialog(null, celsius + " graus Celsius correspondem a: " + fahrenhient + " Fahrenhient");
    }

}