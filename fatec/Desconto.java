import javax.swing.JOptionPane;
public class Desconto {
    public static void main(String[]args){
        //entrada
        double porcentagemDesc = Double.parseDouble(JOptionPane.showInputDialog("Digite a porcentagem de desconto"));
        double precoProd = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto"));
        //operações
        double valorDesc = porcentagemDesc / 100 * precoProd;
        double precoFinal = precoProd - valorDesc;
        //saída
    
    JOptionPane.showMessageDialog(null, "O desconto é de R$" + String.format("%.2f" , valorDesc) + " e o valor do produto final é de R$" + String.format("%.2f", precoFinal));
    }
    
}
