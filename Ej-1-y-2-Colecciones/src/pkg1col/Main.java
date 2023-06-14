package pkg1col;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList raza = new ArrayList();

        String r;
        do {
            System.out.println("Ingrese raza de perro");
            String ra = leer.next();
            raza.add(ra);
            System.out.println("Si desea salir del programa escriba n");
            r = leer.next();
        } while (!"n".equals(r));

        for (int i = 0; i < raza.size(); i++) {
            System.out.print(raza.get(i) + ", ");
        }
        System.out.println("");

        // for each: recorre objetos sin necesidad de incrementador ni condición para finalizar  
        System.out.println("Array con for each");
        for (Object aux : raza) {
            System.out.print(aux + ", ");
        }
        System.out.println("");

        System.out.println("Ingrese una raza a buscar");
        String buscar = leer.next();

        // el iterador sirve para recorrer la coleccion
        Iterator it = raza.iterator();
        // while (it.hasNext()) comprueba si el valor de la variable está dentro del rango
        while (it.hasNext()) {
            String b = (String) it.next();
            if (b.equals(buscar)) {
                it.remove();
            }
        }

        for (int i = 0; i < raza.size(); i++) {
            System.out.print(raza.get(i) + ", ");
        }
        System.out.println("");

    }
}
