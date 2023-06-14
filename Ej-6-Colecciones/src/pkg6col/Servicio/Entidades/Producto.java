
package pkg6col.Servicio.Entidades;

import java.util.Objects;

public class Producto {
    private String nombre;
    private Double precio;

    public Producto() {
    }

    public Producto(String producto, Double precio) {
        this.nombre = producto;
        this.precio = precio;
    }

    public String getProducto() {
        return nombre;
    }

    public void setProducto(String producto) {
        this.nombre = producto;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Tienda{" + "producto=" + nombre + ", precio=" + precio + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Producto other = (Producto) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.precio, other.precio)) {
            return false;
        }
        return true;
    }
    
    
}
