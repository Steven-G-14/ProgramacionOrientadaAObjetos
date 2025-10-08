import java.security.SecureRandom;

public class Dado {

   // Atributos
  private int cara;

  // Constructores
  public Dado() {
  }

  public Dado(int cara) {
    this.cara = cara;
  }

  // gets y sets
  public int getCara() {
    return cara;
  }

  public void setCara(int cara) {
    this.cara = cara;
  }

  public int generaraAleatorio(){
    int cara;
    SecureRandom numerosAleatorios = new SecureRandom();
    //El objeto numerosAleatorios producira numeros aleatorios
    
    cara = 1  + numerosAleatorios.nextInt(6);
    //elige entero aleatorio del 1 al 6


    return cara;
  }

  
     
    

}
