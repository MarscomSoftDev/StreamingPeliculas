import java.util.Random;
import java.util.Scanner;

public class adivinanzas {
  public  static void main(String[] args) {

      Scanner teclado = new Scanner(System.in);
        int numeroAdivinar = new Random().nextInt(20);
        int intentos = 0;
        int numeroUsuario = 0;

        while (intentos < 5 ){
            System.out.println("ingrese un numero");
            numeroUsuario = teclado.nextInt();

            if (numeroUsuario == numeroAdivinar) {
                System.out.println("Ganaste");
                break;
            }

            if (numeroUsuario < numeroAdivinar){
                System.out.println("el numero es mayor ");
            }else {
                System.out.println("el numero es menor");
            }
            intentos++;
        }
      if (numeroUsuario != numeroAdivinar) {
          System.out.println("Perdiste, se acabaron los intentos. El número era: " + numeroAdivinar);
      }
    }
}
