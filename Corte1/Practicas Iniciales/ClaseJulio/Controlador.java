public class Controlador {
    private Vista view;

    public Controlador(Vista view) {
        this.view = view;
    }

    public void iniciar() {
        int opcion;
        do {
            opcion = view.mostrarMenu();
            Ecuacion ecuacion = null;
            String resultado = "";

            switch (opcion) {
                case 1:
                    double[] coefLineal = view.pedirCoeficientesLineal();
                    ecuacion = new EcuacionLineal(coefLineal[0], coefLineal[1]);
                    break;
                case 2:
                    double[] coefCuadratica = view.pedirCoeficientesCuadratica();
                    ecuacion = new EcuacionCuadratica(coefCuadratica[0], coefCuadratica[1], coefCuadratica[2]);
                    break;
                case 3:
                    double[] coefCubica = view.pedirCoeficientesCubica();
                    ecuacion = new EcuacionCubica(coefCubica[0], coefCubica[1], coefCubica[2], coefCubica[3]);
                    break;
                case 4:
                    double[] coefCuartica = view.pedirCoeficientesCuartica();
                    ecuacion = new EcuacionCuartica(coefCuartica[0], coefCuartica[1], coefCuartica[2], coefCuartica[3], coefCuartica[4]);
                    break;
                case 5:
                    view.mostrarMensaje("Saliendo del programa...");
                    break;
                default:
                    view.mostrarMensaje("Opción no válida. Intente de nuevo.");
            }

            if (ecuacion != null) {
                resultado = ecuacion.resolver();
                view.mostrarResultado(resultado);
            }

        } while (opcion != 5);
        
        view.cerrarScanner();
    }
}