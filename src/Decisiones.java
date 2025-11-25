public class Decisiones {

    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;
        String tipoDePlan = "pluss";

        if (fechaDeLanzamiento >= 2022){
            System.out.println("Peliculas mas populares");
        } else {
            System.out.println("Pelicula retro que aun vale la pena ver");
        }

        if (incluidoEnElPlan && tipoDePlan.equals("pluss")){
            System.out.println("Disfruta de tu pelicula");
        } else {
            System.out.println("Pelicula no disponible en su plan actual");
        }

    }
}
