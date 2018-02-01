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
public class Usuario {

    private String nombre;
    private Libro[] librosPrestados;
    //hacer que el array de libros sea de 3
    
    public Usuario(String nombre) {
        this.nombre = nombre;
        this.librosPrestados = new Libro[3];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void prestarLibro() {
    }

    public void devolverLibro() {

    }

    public void devolverTodosLosLibros() {
        for (int i = 0; i < librosPrestados.length ; i++) {
            librosPrestados[i]= null;
        }
    }

    public int numeroDeLibrosPrestados() {
        int numeroDeLibrosPrestados;
        numeroDeLibrosPrestados = 0;

        return numeroDeLibrosPrestados;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", librosPrestados=" + librosPrestados + '}';
    }
    
}
