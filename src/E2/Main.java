
package E2;

import java.util.TreeSet;


public class Main {
    public static void main(String[] args) {
        
        TreeSet<Producto> listaProductos = new TreeSet<>();
        
        listaProductos.add(new Producto(11, "Jabon", 1500,100, "Perfumeria"));
        listaProductos.add(new Producto(12, "Toalla", 2000,50, "Perfumeria"));
        
        
        listaProductos.add(new Producto(21, "Caramelos", 500,20, "Comestible"));
        listaProductos.add(new Producto(22, "Arroz", 3500,25, "Comestible"));
       
        listaProductos.add(new Producto(31, "Lavandina", 4500,10, "Limpieza")); 
        listaProductos.add(new Producto(32, "Detergente", 3500,10, "Limpieza"));
        
        System.out.println("Lista de productos: ");
        for (Producto aux : listaProductos){
            System.out.println(aux);
        }
    }
    
}
