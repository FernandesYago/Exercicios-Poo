import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        CalculadoraDeNotas calculadora = new CalculadoraDeNotas();

        String nota = JOptionPane.showInputDialog("Digite a sua nota final:");

        double notaDouble = Double.parseDouble(nota);

        String conceito = calculadora.obterConceito(notaDouble);

        JOptionPane.showMessageDialog(null, conceito);
    }
}
