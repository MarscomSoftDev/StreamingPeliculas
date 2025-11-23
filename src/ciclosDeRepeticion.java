import java.util.Scanner;

public class ciclosDeRepeticion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluaciones = 0;

        for (int contador = 0; contador < 3; contador++) {
            System.out.println("Escribe la nota que le darias a la pelicula matrix: ");
            nota = teclado.nextDouble();
            mediaEvaluaciones = mediaEvaluaciones + nota;

        }
        System.out.println("la media de la pelicula es: " + mediaEvaluaciones / 3);
    }
}
