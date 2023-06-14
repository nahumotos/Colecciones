
package pkg4colee;

import java.util.HashMap;
import java.util.Scanner;
import pkg4colee.Entidades.CP;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        HashMap<Integer, String> codC = new HashMap();
        CP c= new CP();
        
        int acu = 0;
        do {
            System.out.println("Ingrese número de código postal");
            c.setCod(leer.nextInt());
            System.out.println("Ingrese nombre de ciudad");
            c.setCiudad(leer.next());
            codC.put(c.getCod(),c.getCiudad());
            acu++; 
        } while (acu < 10);
        
        System.out.println(codC);
        
        
        Integer existe;
        System.out.println("Ingrese código postal para ver si existe en el map");
        existe = leer.nextInt();
        if (codC.containsKey(existe)) {
            System.out.println("El código postal pertenece a: ");
            System.out.println(codC.get(existe));
        } else {
            System.out.println("El código postal no fue encontrado");
        }

        
        System.out.println("Agregue código postal y ciudad");
        c.setCod(leer.nextInt());
        c.setCiudad(leer.next());
        codC.put(c.getCod(),c.getCiudad());
        System.out.println(codC);
        
        int acu2 = 0;
        do {
            System.out.println("Ingrese código postal para eliminar su ciudad");
            int delete = leer.nextInt();
            codC.remove(delete);
            acu2++;
        } while (acu2 < 3);
        
        System.out.println(codC);
        

    }
    
}
