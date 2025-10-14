public class EcuacionCuadratica extends Ecuacion {
    private double a, b, c;

    public EcuacionCuadratica(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String resolver() {
        if (a == 0) {
            // Si a=0, se convierte en una ecuación lineal. Delegamos la responsabilidad.
            EcuacionLineal lineal = new EcuacionLineal(b, c);
            return "Coeficiente 'a' es cero. Resolviendo como ecuación lineal: " + lineal.resolver();
        }

        double discriminante = b * b - 4 * a * c;

        if (discriminante > 0) {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            return String.format("Dos soluciones reales: x1 = %.2f, x2 = %.2f", x1, x2);
        } else if (discriminante == 0) {
            double x = -b / (2 * a);
            return String.format("Una única solución real: x = %.2f", x);
        } else {
            double real = -b / (2 * a);
            double imaginario = Math.sqrt(-discriminante) / (2 * a);
            return String.format("Soluciones complejas: x1 = %.2f + %.2fi, x2 = %.2f - %.2fi", real, imaginario, real, imaginario);
        }
    }
}