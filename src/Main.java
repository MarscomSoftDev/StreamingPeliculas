import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Main {
    public static void main (String[] args){
        System.out.println("Bienvenid@ a Screen Match");
        System.out.println("Pelicula: Matrix");

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnPlan = true;
        double notaDeLaPelicula = 3.9;
        double media = (8.2 + 6.0 +9.0) / 3;

        System.out.println(media);

        String sinopsis = """ 
                Matrix, es una paradoja
                la mejor pelicula del fin del milenio
                fue lanzada en:   
                """+ fechaDeLanzamiento;
        System.out.println(sinopsis);

    int clasificacion = (int) media / 2;
        System.out.println("clasificacion: " + clasificacion);

    }
}
