import javax.swing.JOptionPane;

public class Radianos015 {
    public static void main(String[]args){
        double radiano = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em radianos: "));
        double graus = radiano * 180 / 3.14;

        JOptionPane.showMessageDialog(null, radiano + " correspondem a " + String.format("%.2f", graus) + " graus");

    }
    
}
