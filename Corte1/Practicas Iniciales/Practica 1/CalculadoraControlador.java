public class CalculadoraControlador {
    public static void main(String[] args) {
        CalculadoraModelo modelo = new CalculadoraModelo();
        CalculadoraVista vista = new CalculadoraVista();

        boolean continuar = true;

        while (continuar) {
            try {
                String opcion = vista.mostrarMenu();
                if (opcion == null || opcion.equals("5")) {
                    continuar = false;
                    continue;
                }
       
               double num1 = vista.pedirNumero("Ingrese el primer número:");
                double num2 = vista.pedirNumero("Ingrese el segundo número:");
                double resultado = 0;

                switch (opcion) {
                    case "1":
                        resultado = modelo.sumar(num1, num2);
                        break;
                    case "2":
                        resultado = modelo.restar(num1, num2);
                        break;
                    case "3":
                        resultado = modelo.multiplicar(num1, num2);
                        break;
                    case "4":
                        resultado = modelo.dividir(num1, num2);
                        break;
                    default:
                        vista.mostrarError("Opción inválida.");
                        continue;
                }
                

                vista.mostrarResultado(resultado);

            } catch (NumberFormatException e) {
                vista.mostrarError("Entrada inválida. Por favor ingrese números válidos.");
            } catch (ArithmeticException e) {
                vista.mostrarError(e.getMessage());
            } catch (Exception e) {
                vista.mostrarError("Ha ocurrido un error inesperado.");
            }
        }
    }
}