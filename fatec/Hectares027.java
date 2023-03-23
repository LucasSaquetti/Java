import javax.swing.JOptionPane;

public class Hectares027 {
    public static void main(String[]args){
        double hectares = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor de área em hectares: "));
        double mquadrados = hectares * 10000;
        JOptionPane.showMessageDialog(null, hectares + " hectares correspondem a: " + mquadrados + " m²");
    }
    
}
