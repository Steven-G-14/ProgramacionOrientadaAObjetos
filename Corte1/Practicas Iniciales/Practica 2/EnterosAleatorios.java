

  public class EnterosAleatorios
 {
  public static void main(String[] args)
  {
     //Los Objetos
     Dado modelo = new Dado();
     Vista vista = new Vista();

     //Titulo 
     vista.mostrarTitulo();

     vista.mostrarMenu();

     int opcion;
      do {
                
                opcion = vista.mostrarMenu(); 

                switch(opcion){
                   
                
                case 1:
                        System.out.println("You selected Option A.");
                        // Call a method or perform actions for Option A
                        break;
                    case 2:
                        System.out.println("You selected Option B.");
                        // Call a method or perform actions for Option B
                        break;
                    case 3:
                        System.out.println("Exiting the program. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } while (opcion != 3); // Loop until the user chooses to exit

            scanner.close(); // Close the scanner when done
        }
    }

    for (int contador = 1; contador <= 20; contador++)
     {
      modelo.setCara(modelo.generaraAleatorio());
      vista.mostrarDato(modelo.getCara());

    

        // si contador es divisible entre 5, empieza una nueva línea de salida
        if (contador % 5 == 0)
            vista.saltarLinea();
        }
    }
 } // fin de la clase EnterosAleatorios