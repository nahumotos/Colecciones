
package pkg5col;

import pkg5col.Entidades.Servicio.ServicioPaises;

public class Main {
    public static void main(String[] args) {
        
        ServicioPaises p = new ServicioPaises();
        p.crearPais();
        System.out.println("-----------");
        p.mostrar();
        System.out.println("-----------");
        p.ordP();
        System.out.println("-----------");
        System.out.println("ingrese el pais a remover");
        p.eliminar();
        p.ordP();
        
    }
    
}
