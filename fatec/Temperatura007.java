import javax.swing.JOptionPane;

public class Temperatura007 {
    public static void main(String[]args){
        double fahrenhient = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em fahrenhient"));
        double celsius = 5 * (fahrenhient - 32) / 9;

        JOptionPane.showMessageDialog(null, fahrenhient + " Fahrenhient correspondem a " + celsius + " graus Celsius");
    }

    
}
