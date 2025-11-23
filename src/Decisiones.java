public class Decisiones {


    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnPlan = true;
        double notaDeLaPelicula = 3.9;
        String tipoPlan = "plus";

        if (fechaDeLanzamiento >= 2022){
            System.out.println("Peliculas mas populares");
        }else {
            System.out.println("Peliculas retro que aun vale la pena ver");
        }

        if (incluidoEnPlan && tipoPlan.equals("plus")){
            System.out.println("disfruta de tu pelicula");
        } else {
            System.out.println("No disponible en tu plan actual");
        }

    }
}
