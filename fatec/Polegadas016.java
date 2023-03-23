import javax.swing.JOptionPane;

public class Polegadas016 {
    public static void main(String[]args){
        double polegadas = Double.parseDouble(JOptionPane.showInputDialog("Digite as polegadas: "));
        double centimetros = polegadas * 2.54;

        JOptionPane.showMessageDialog(null, polegadas + " polegadas correspondem a: " + String.format("%.2f", centimetros) + " centímetros");
    }
}