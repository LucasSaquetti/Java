import javax.swing.JOptionPane;

public class Acres025 {
    public static void main(String[]args){
        double acre = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor em acres para a conversão: "));
        double mquadrados = acre * 4048.58;

        JOptionPane.showMessageDialog(null, acre + " acres equivalem a: " + mquadrados + " m²");

    }
    
}
