public class EcuacionLineal extends Ecuacion {
    private double a, b;

    public EcuacionLineal(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String resolver() {
        if (a == 0) {
            if (b == 0) {
                return "La ecuación tiene infinitas soluciones.";
            } else {
                return "La ecuación no tiene solución.";
            }
        } else {
            double x = -b / a;
            return String.format("La solución es: x = %.2f", x);
        }
    }
}