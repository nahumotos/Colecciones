
package pkg4col;

import pkg4col.Entidades.Servicio.ServicioPelicula;

public class Main {

    public static void main(String[] args) {
        ServicioPelicula p = new ServicioPelicula();
        
        System.out.println("------Crear Peliculas---------------------------------------------");
        p.crearPelicula();
        System.out.println("------Mostrar Peliculas-------------------------------------------");
        p.mostrar();
        System.out.println("------Mostrar Peliculas mayores a 1 H-----------------------------");
        p.mostrarmay1();
        System.out.println("------Mostrar Peliculas en orden de Duracion Descendente----------");
        p.d1();
        p.mostrar();
        System.out.println("------Mostrar Peliculas en orden de Duracion Ascendente-----------");
        p.d2();
        p.mostrar();
        System.out.println("------Ordenar Titulos Alfabeticamente-----------------------------");
        p.cd();
        p.mostrar();
        System.out.println("------Ordenar Directores Alfabeticamente--------------------------");
        p.ct();
        p.mostrar();
    }
    
}
