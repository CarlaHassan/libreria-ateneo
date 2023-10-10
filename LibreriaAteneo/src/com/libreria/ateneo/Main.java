
package com.libreria.ateneo;

/**
 *
 * @author carla
 */
public class Main {
    public static void main(String[] args) {
        Libro harry = new Libro("Harry Potter", "jkl", 19000, "12345678");
        
        System.out.println(harry.getTitulo());
        
        harry.setTitulo("Harry Potter y la piedra filosofal");
        
        System.out.println(harry.getTitulo());
        
        harry.imprimirInfo();
        System.out.println(harry.calcularIva());
        harry.ajustarPrecio();
        harry.imprimirInfo();
        
        System.out.println(harry.toString());
        
        
        
          
    }
}
