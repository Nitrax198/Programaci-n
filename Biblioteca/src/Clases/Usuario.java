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
    private int numeroLibrosPrestados;
    //hacer que el array de libros sea de 3

    public int getNumeroLibrosPrestados() {
        return numeroLibrosPrestados;
    }

    public void setNumeroLibrosPrestados(int numeroLibrosPrestados) {
        this.numeroLibrosPrestados = numeroLibrosPrestados;
    }

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.librosPrestados = new Libro[3];
        this.numeroLibrosPrestados = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void prestarLibro(Libro libro) {
        boolean fin;
        fin = false;
        for (int i = 0; i < librosPrestados.length && !fin; i++) {
            if (librosPrestados[i] != null) {
                librosPrestados[i] = libro;
                numeroLibrosPrestados++;
                fin = true;
                
            } else {
                fin = true;
            }
        }
    }

    public void devolverLibro(Libro libro) {
        for (int i = 0; i < librosPrestados.length; i++) {
            if (librosPrestados[i].equals(libro)) {
                librosPrestados[i]= null;
                numeroLibrosPrestados++;
            }
        }
    }

    public void devolverTodosLosLibros() {
        for (int i = 0; i < librosPrestados.length; i++) {
            librosPrestados[i] = null;
        }
    }

    public void numeroDeLibrosPrestados() {
        System.out.println(numeroLibrosPrestados);

    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre +  ", librosPrestados=" + librosPrestados + '}';
    }

    void ImprimirLibro(Libro libro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
