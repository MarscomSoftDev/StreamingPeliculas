import java.util.Scanner;

public class LecturaDatos {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el nombre de tu peli favorita");
        String pelicula = teclado.nextLine();
        System.out.println("Escribe la fecha de lanzamiento");
        int fechaDeLanzamiento = teclado.nextInt();
        System.out.println("Que nota le das");
        double notaPelicula = teclado.nextDouble();

        System.out.println(pelicula);
        System.out.println(fechaDeLanzamiento);
        System.out.println(notaPelicula);
    }
}
