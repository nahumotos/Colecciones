
package pkg6col;

import pkg6col.Servicio.servicioTienda;

public class Main {

    public static void main(String[] args) {
        servicioTienda s = new servicioTienda();
        s.crearStock();
        s.eliminarProducto();
        s.motrarProductos();
        s.modificarPrecio();
        s.motrarProductos();
        
    }
    
}
