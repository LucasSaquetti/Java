import javax.swing.JOptionPane;

public class Centimetros017 {
    public static void main(String[]args){
        double centimetros = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em centímetros: "));
        double polegadas = centimetros / 2.54;

        JOptionPane.showMessageDialog(null, centimetros + " centímetros correspondem a: " + String.format("%.2f", polegadas));
    }
    
}
