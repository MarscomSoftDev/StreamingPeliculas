import java.sql.SQLOutput;

public class Main{
    public static void main(String[] args){
        System.out.println("Bienvenido (a) a Screen Match");
        System.out.println("Pelicula: Matrix");

        int fechaLanzamiento = 1999;
        boolean incluidoEnPlan = true;
        double notaDePelicula = 8.2;

        double mediaDePelicuas = (8.2 + 6.0 + 9.3)/3;

        System.out.println("la media de las peliculas es:" + mediaDePelicuas);

        String sinopsis = """
                Matrix, es una paradoja
                La mejor pelicula del fin del milenio
                Fue lanzada en: """ + fechaLanzamiento;
        System.out.println(sinopsis);

        int clasificacion = (int)mediaDePelicuas / 2;
        System.out.println("clasificaciones: " + clasificacion);

    }

}