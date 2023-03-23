import javax.swing.JOptionPane;

public class MetroCubico018 {
    public static void main(String[]args){
        double metrosCubicos = Double.parseDouble(JOptionPane.showInputDialog(" Digite o valor em metros cubicos: "));
        double litros = metrosCubicos * 1000;

        JOptionPane.showMessageDialog(null, metrosCubicos + " metros cúbicos correspondem a: " + String.format("%.2f", litros) + " litros");

    }
    
}
