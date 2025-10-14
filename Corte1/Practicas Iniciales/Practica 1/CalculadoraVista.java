import javax.swing.JOptionPane;

public class CalculadoraVista {
    public String mostrarMenu() {
        return JOptionPane.showInputDialog(
            "Seleccione una operación:\n" +
            "1. Sumar\n" +
            "2. Restar\n" +
            "3. Multiplicar\n" +
            "4. Dividir\n" +
            "5. Salir"
        );
    }

    public double pedirNumero(String mensaje) {
        String input = JOptionPane.showInputDialog(mensaje);
        return Double.parseDouble(input);
    }

    public void mostrarResultado(double resultado) {
        JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
    }

    public void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(null, "Error: " + mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }
}