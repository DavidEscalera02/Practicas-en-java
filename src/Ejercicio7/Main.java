package Ejercicio7;

public class Main {
    public static void main(String[] args) {
        Pelicula peli1=new Pelicula("Machete","Robert Rodríguez", Pelicula.tipo.ACCION,180,2010,8.3);
        peli1.imprimir();
        System.out.println("-----------------------------------------");
        Pelicula peli2=new Pelicula("Thor","Kenneth Branagh", Pelicula.tipo.DRAMA,160,2023,7.0);
        peli2.imprimir();
        System.out.println("-------------------------------------------");
        System.out.println("La Pelicula "+peli1.getNombre()+" Es épica :" +peli1.esPeliculaEpica());
        System.out.println("La Pelicula "+peli2.getNombre()+" Es épica :"+peli2.esPeliculaEpica());
        System.out.println("La pelicula "+peli1.getNombre()+" y la Pelicula "+peli2.getNombre()+" Son similares :"+peli1.esSimilar(peli2));

    }
}
