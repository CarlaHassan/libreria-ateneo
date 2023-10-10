
package com.libreria.ateneo;

/**
 *
 * @author carla
 */
public class Libro {
    private String titulo;
    private String autor;
    private int precio;
    private String isbn;

    //constructo vacio
    public Libro() {
    }
    //constructor con parametros
    public Libro(String titulo, String autor, int precio, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.isbn = isbn;
    }
    //getter and setter
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + ", isbn=" + isbn + '}';
    }
    //custumer
    
    public void imprimirInfo (){
        System.out.println("-----------------------");
        System.out.println("Titulo: " + this.titulo + "\nAutor: " + this.autor +  "\nPrecio: " + this.precio + "\nISBN: " + this.isbn);
    
    }
    public double calcularIva(){
        double IVA = 0.19;
        return this.precio * IVA;
    
    }
    public void ajustarPrecio (){
        double iva =this.calcularIva();
        this.precio =(int)(this.precio - iva);
    }
}
