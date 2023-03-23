import javax.swing.JOptionPane;

public class Distancia {
    public static void main(String[]args){
        //entradas P1
        double x1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de x1"));
        double y1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de y1"));
        //entradas P2
        double x2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de x2"));
        double y2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de y2"));

        double distancia;
        //calculo da distancia
        distancia = Math.sqrt(Math.pow(x1-x2,2) + (Math.pow(y1-y2, 2)));
        //saida
        JOptionPane.showMessageDialog(null, ("A distância entre os dois pontos é: " + distancia));

    }

    }
    

