/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author daw
 */
public class Libro {

    private String isbn;
    private String autor;
    private String titulo;
    private int numeroDePaginas;
    private boolean prestado;

    public Libro(String isbn, String autor, String titulo, int numeroDePaginas) {
        this.isbn = isbn;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.titulo = titulo;
        this.prestado = false;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn +"/nl" + ", autor=" + autor +"/nl" + ", titulo=" + titulo +"/nl" + ", numeroDePaginas=" + numeroDePaginas + '}';
    }

    
}
