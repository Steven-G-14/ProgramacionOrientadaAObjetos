import java.util.InputMismatchException;
import java.util.Scanner;

public class Vista {
    private Scanner scanner;

    public Vista() {
        this.scanner = new Scanner(System.in);
    }

    public int mostrarMenu() {
        System.out.println("\n=== MENÚ DE ECUACIONES ===");
        System.out.println("1. Resolver ecuación lineal (ax + b = 0)");
        System.out.println("2. Resolver ecuación cuadrática (ax² + bx + c = 0)");
        System.out.println("3. Resolver ecuación cúbica (ax³ + bx² + cx + d = 0)");
        System.out.println("4. Resolver ecuación cuártica (ax⁴ + bx³ + cx² + dx + e = 0)");
        System.out.println("5. Salir");
        System.out.print("Elige una opción: ");
        try {
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea
            return opcion;
        } catch (InputMismatchException e) {
            scanner.nextLine(); // Limpiar el buffer de entrada
            return -1; // Devolver un valor que indique una opción inválida
        }
    }

    public double[] pedirCoeficientesLineal() {
        System.out.print("Ingrese el valor de a: ");
        double a = scanner.nextDouble();
        System.out.print("Ingrese el valor de b: ");
        double b = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea
        return new double[]{a, b};
    }

    public double[] pedirCoeficientesCuadratica() {
        System.out.print("Ingrese el valor de a: ");
        double a = scanner.nextDouble();
        System.out.print("Ingrese el valor de b: ");
        double b = scanner.nextDouble();
        System.out.print("Ingrese el valor de c: ");
        double c = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea
        return new double[]{a, b, c};
    }

    public double[] pedirCoeficientesCubica() {
        System.out.print("Ingrese el valor de a: ");
        double a = scanner.nextDouble();
        System.out.print("Ingrese el valor de b: ");
        double b = scanner.nextDouble();
        System.out.print("Ingrese el valor de c: ");
        double c = scanner.nextDouble();
        System.out.print("Ingrese el valor de d: ");
        double d = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea
        return new double[]{a, b, c, d};
    }

    public double[] pedirCoeficientesCuartica() {
        System.out.print("Ingrese el valor de a: ");
        double a = scanner.nextDouble();
        System.out.print("Ingrese el valor de b: ");
        double b = scanner.nextDouble();
        System.out.print("Ingrese el valor de c: ");
        double c = scanner.nextDouble();
        System.out.print("Ingrese el valor de d: ");
        double d = scanner.nextDouble();
        System.out.print("Ingrese el valor de e: ");
        double e = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea
        return new double[]{a, b, c, d, e};
    }

    public void mostrarResultado(String resultado) {
        System.out.println("\n--- RESULTADO ---");
        System.out.println(resultado);
        System.out.println("-----------------\n");
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void cerrarScanner() {
        scanner.close();
    }
}