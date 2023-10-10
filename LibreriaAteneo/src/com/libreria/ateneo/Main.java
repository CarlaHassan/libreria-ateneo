
package com.libreria.ateneo;

/**
 *
 * @author carla
 */
public class Main {
    public static void main(String[] args) {
        Catalogo cat = new Catalogo();
        Autor jk = new Autor("jk", "Rowlin", "britanica");
        Autor gm = new Autor("Gabriel", "Garcia Marquez", "colombiano");
        Autor mc = new Autor("Miguel"," De Cervantes", "Espanol");
        Libro harry = new Libro("Harry Potter", jk, 19000, "12345678");
        Libro cien = new Libro("100 años de soledad", gm, 25000, "1234567");
        Libro quijote = new Libro("El quijote de la mancha", mc, 30000, "125478");
        
        
        cat.agregarLibro(harry);
        cat.agregarLibro(cien);
        cat.agregarLibro(quijote);
        
        cat.mostrarCatalogo();
        
        cat.eliminarLibroIsbn("125478");
        System.out.println("------------------------------");
        System.out.println("");
        cat.mostrarCatalogo();
        
        System.out.println("*******************************");
        System.out.println("");
        cat.buscarLibroApellido("Rowlin");
    }
}
