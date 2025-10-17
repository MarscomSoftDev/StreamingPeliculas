public class Decisiones {

    public static void main(String[] args) {
        int fechaLanzamiento = 1999;
        boolean incluidoEnPlan = true;
        double notaDePelicula = 8.2;
        String tipoPlan = "plus";

//        if (fechaLanzamiento >= 2022){
//            System.out.println("Peliculas mas populares");
//        }else {
//            System.out.println("Peliculas retro que aun vale la pena ver");
//        }
        if(incluidoEnPlan && tipoPlan.equals("plus")){
            System.out.println("Distruta de tu pelicula");

        }else {
            System.out.println("pelicula no disponible en tu plan actual");
        }
    }
}
