import org.apache.commons.math3.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math3.analysis.solvers.LaguerreSolver;
import org.apache.commons.math3.complex.Complex;

public class EcuacionCubica extends Ecuacion {
    private double a, b, c, d;

    public EcuacionCubica(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public String resolver() {
        if (a == 0) {
            return "Coeficiente 'a' es cero. Resolviendo como ecuación cuadrática: " + 
                   new EcuacionCuadratica(b, c, d).resolver();
        }
        
        // Coeficientes en orden: d, c, b, a (constante a término de mayor grado)
        double[] coefficients = {d, c, b, a};
        PolynomialFunction p = new PolynomialFunction(coefficients);
        LaguerreSolver solver = new LaguerreSolver();
        
        try {
            Complex[] roots = solver.solveAllComplex(p.getCoefficients(), 0);
            StringBuilder sb = new StringBuilder("Las soluciones son:\n");
            for (int i = 0; i < roots.length; i++) {
                Complex root = roots[i];
                if (Math.abs(root.getImaginary()) < 1e-9) { // Considerar como real si la parte imaginaria es muy pequeña
                    sb.append(String.format("x%d = %.4f\n", i + 1, root.getReal()));
                } else {
                    sb.append(String.format("x%d = %.4f %s %.4fi\n", 
                        i + 1, 
                        root.getReal(), 
                        root.getImaginary() < 0 ? "-" : "+", 
                        Math.abs(root.getImaginary())));
                }
            }
            return sb.toString();
        } catch (Exception e) {
            return "No se pudieron calcular las raíces: " + e.getMessage();
        }
    }
}