
package pkg5col.Entidades.Servicio.Utilidades;

import java.util.Comparator;
import pkg5col.Entidades.Paises;

public class Comparadores {
    
    
    public static Comparator<Paises> ordenarpaises= new Comparator<Paises>() {
        @Override
        public int compare(Paises t, Paises t1) {
            return t.getNombre().compareTo(t1.getNombre());
        }
    };
    
}
