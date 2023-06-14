
package pkg3colee.Entidades.Servicio;

import java.util.HashSet;
import java.util.Scanner;
import pkg3colee.Entidades.Libro;

public class ServicioLibro {

    ServicioLibro sl = new ServicioLibro();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashSet<Libro> hl = new HashSet();
    Libro l = new Libro();
    String r;

    public HashSet<Libro> crearLibro() {
        do {
            System.out.println("Ingrese título del libro");
            l.setTitulo(leer.next());
            System.out.println("Ingrese autor del libro");
            l.setAutor(leer.next());
            System.out.println("Ingrese número de ejemplares");
            l.setNe(leer.nextInt());
            System.out.println("Ingrese número de ejemplares prestados");
            l.setPre(leer.nextInt());
            hl.add(l);
            System.out.println("Presione n si no desea crear otro libro?");
            r = leer.next();
        } while (!"n".equals(r));
        return hl;
    }

    public void prestamo() {
        boolean flag = false;
        System.out.println("Ingrese el título del libro a prestar");
        String n = leer.next();
        for (Libro libro : hl) {
            if (libro.getTitulo().equalsIgnoreCase(n) && libro.getNe() > 0) {
                libro.getPre();
                flag = true;
                System.out.println(flag);
            } else {
                System.out.println(flag);
            }
        }
    }

    public void devolucion() {
        boolean flag = false;
        System.out.println("Ingrese el título del libro a prestar");
        String n = leer.next();
        for (Libro libro : hl) {
            if ((libro.getTitulo().equalsIgnoreCase(n)) && (libro.getNe() > 0)) {
                libro.getPre();
                flag = true;
                System.out.println(flag);
            } else {
                System.out.println(flag);
            }
        }
    }


}
