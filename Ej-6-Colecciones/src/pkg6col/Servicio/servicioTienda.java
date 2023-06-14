
package pkg6col.Servicio;

import java.util.HashMap;
import pkg6col.Servicio.Entidades.Producto;

public class servicioTienda {

    java.util.Scanner leer = new java.util.Scanner(System.in);
    HashMap<String, Double> ListaProd = new HashMap();

    public void crearStock() {
        String salir;

        do {
            Producto Prod = new Producto();
            System.out.println("Ingrese el nombre del producto");
            Prod.setProducto(leer.next());
            System.out.println("Ingrese el precio");
            Prod.setPrecio(leer.nextDouble());
            ListaProd.put(Prod.getProducto(), Prod.getPrecio());
            System.out.println("Desea crear otro producto?");
            salir = leer.next();
        } while (!salir.equalsIgnoreCase("n"));
    }

    public void modificarPrecio() {
        System.out.println("Ingrese nombre de producto para modificar su precio");
        String mp = leer.next();
        System.out.println("Ingrese el nuevo precio");
        Double np = leer.nextDouble();
        if (ListaProd.containsKey(mp)) {
            ListaProd.put(mp, np);
        }
    }

    public void eliminarProducto() {
        System.out.println("Ingrese nombre de producto a eliminar");
        String llave= leer.next();
        ListaProd.remove(llave);
    }

    public void motrarProductos() {
        System.out.println(ListaProd);
    }
}
