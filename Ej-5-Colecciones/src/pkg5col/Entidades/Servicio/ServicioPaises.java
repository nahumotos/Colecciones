package pkg5col.Entidades.Servicio;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;
import pkg5col.Entidades.Paises;

public class ServicioPaises {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    HashSet<Paises> tpaises = new HashSet();
    Paises p;
    
    public void crearPais(){
        String r;
        do {
            p = new Paises();
            System.out.println("Ingrese nombre de país");
            p.setNombre(leer.next());
            tpaises.add(p);
            System.out.println("¿Desea agregar otro pais?");
            r = leer.next();
        } while (!r.equalsIgnoreCase("N"));

    }
   
    
    public void mostrar(){
        for (Paises tpaise : tpaises) {
            System.out.println(tpaise);
        }
    }

    public void ordP(){
        System.out.println("-----------Paises ordenados-----------");
         p.compareTo(p);
        TreeSet<Paises> listaa = new TreeSet(tpaises);
        for (Paises pa : listaa) {
            System.out.println(pa);
        }
        
    }
    
    
    public void eliminar() {
        Iterator<Paises> it = tpaises.iterator();
        boolean encontrado = false;
        String aux = leer.next();
        while (it.hasNext()) {
            if (aux.equals(it.next().getNombre())) {
                it.remove();
                encontrado = true;
            }
        }
         if (!encontrado) {
            System.out.println("Pais no encontrado");
        }

         for (Paises tpaise : tpaises) {
             System.out.println(tpaise);
        }
    }
    }

