
package pkg4col.Entidades.Servicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import pkg4col.Entidades.Pelicula;
import static pkg4col.Entidades.Servicio.Utilidad.Comparators.compararD1;
import static pkg4col.Entidades.Servicio.Utilidad.Comparators.compararD2;
import static pkg4col.Entidades.Servicio.Utilidad.Comparators.compararDirector;
import static pkg4col.Entidades.Servicio.Utilidad.Comparators.compararTitulo;


public class ServicioPelicula {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    Pelicula p = new Pelicula();
    ArrayList<Pelicula> listaPeli = new ArrayList();

    public void crearPelicula() {
        listaPeli= new ArrayList();
        String r;
        do {
            p=new Pelicula();
            System.out.println("Ingrese el nombre de la pelicula");
            p.setTitulo(leer.next());
            System.out.println("Ingrese el nombre del director");
            p.setDirector(leer.next());
            System.out.println("Ingrese la duracion de la pelicula");
            p.setDuracion(leer.nextInt());

            listaPeli.add(p);
            
            do {
                System.out.println("Desea crear otra pelicula? S = si , N = no");
                r = leer.next();
            } while (!r.equalsIgnoreCase("S") && (!r.equalsIgnoreCase("N")));
        } while (!r.equalsIgnoreCase("N"));
    }
    
    
    public void mostrar(){
        listaPeli.forEach((Pelicula pelicula) -> {
            System.out.println(pelicula.toString());
        }); 
    }
    
    public void mostrarmay1(){
        for (int i = 0; i < listaPeli.size(); i++) {
            if (1 < listaPeli.get(i).getDuracion()) {
                System.out.println(listaPeli.get(i).toString());
            }
        }  
    } 

    public void d1(){
        Collections.sort(listaPeli, compararD1);
    }
    
    public void d2(){
        Collections.sort(listaPeli, compararD2);
    } 
    
    public void ct(){
        Collections.sort(listaPeli, compararTitulo);
    } 
    
    public void cd(){
        Collections.sort(listaPeli, compararDirector);
    } 
}
