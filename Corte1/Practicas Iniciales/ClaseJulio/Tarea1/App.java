package app;

import controlador.Controlador;
import modelo.Modelo;
import vista.Interfaz;

public class App {
    public static void main(String[]args) {
        Interfaz vista = new Interfaz();
        Modelo modelo = new Modelo();
        Controlador controlador = new Controlador(vista, modelo);
    }
    
}
