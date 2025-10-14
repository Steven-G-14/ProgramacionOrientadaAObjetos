public class Aritmetica {
    public static void main(String[] args) {
        // 1. Crear la Vista
        Vista view = new Vista();
        
        // 2. Crear el Controlador y pasarle la Vista
        Controlador controller = new Controlador(view);
        
        // 3. Iniciar la aplicación
        controller.iniciar();
    }
}