import javax.swing.JOptionPane;

public class Metros023 {
    public static void main(String[]args){
        double metros = Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento em metros: "));
        double jardas = metros / 0.91;

        JOptionPane.showMessageDialog(null, metros + " metros correspondem a: " + String.format("%.2f", jardas) + " jardas");
    }
    
}
