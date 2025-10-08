import java.util.Scanner;
import java.util.InputMismatchException;


public class Vista {
    String RESET = "\u001B[0m";
    String BLACK = "\u001B[30m";
    String RED = "\u001B[31m";
    String GREEN = "\u001B[32m";
    String YELLOW = "\u001B[33m";
    String BLUE = "\u001B[34m";
    String PURPLE = "\u001B[35m";
    String CYAN = "\u001B[36m";
    String WHITE = "\u001B[37m";

     Scanner scanner = new Scanner (System.in);
     // Titulo
    public void mostrarTitulo(){
        System.out.print(CYAN);
        System.out.println("============================");
        System.out.print(CYAN);
        System.out.println("Lanzamiento de Dado 20 veces");
        System.out.print(CYAN);
        System.out.println("============================");
        System.out.print(RESET);
       
    } 

    // Menu 
    public int mostrarMenu(){
        int opcion = -1;
        while (true){
            try{
        System.out.print(RED);
        System.out.println("=====MENU=====");
        System.out.print(RESET);
        System.out.print(BLUE);
        System.out.println("1. Tirar Un Dado ");
        System.out.println("2. Salir ");
        System.out.print(RESET);
        System.out.print(RED);
        System.out.println("Seleccione una opcion 1 o 2: ");
        System.out.println("============================\n");
        System.out.print(RESET);
        if (opcion <1 || opcion >2){
            System.out.println("Error: Seleccione una opcion valida (1 o 2)");
            continue;

        }
        break;
                
            } catch (InputMismatchException e){
              System.out.println("Error: Debe Ingresar un numero entero");  
              scanner.next();
            }
        }
        return opcion;
            
    }

    public void mostrarDato(int cara){
        // dato
        System.out.print(WHITE );
        System.out.printf("%d ",cara ); // muestra el valor generado
        System.out.print(RESET );

    }
   
                
     
     public void saltarLinea(){
        System.out.println();
     }

     // Metodo Default
     public void mostrarDefault(){
         System.out.print(WHITE );
        System.out.printf("Opcion no valida. Intente de nuevo."); 
        System.out.print(RESET );
     }
    
}
