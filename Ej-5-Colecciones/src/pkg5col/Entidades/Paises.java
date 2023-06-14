
package pkg5col.Entidades;

import java.util.Objects;

public class Paises implements Comparable<Paises>{

    private String nombre;

    public Paises() {
    }

    public Paises(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Paises other = (Paises) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
 
    
    @Override
    public String toString() {
        return "Pais{" + "nombre=" + nombre + '}';
    }

    public int compareTo(Paises t) {
        return this.nombre.compareTo(t.getNombre());
    }


    
    
    
}
