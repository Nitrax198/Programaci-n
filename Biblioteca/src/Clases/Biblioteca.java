/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Scanner;

/**
 *
 * @author daw
 */
public class Biblioteca {
   
   private Usuario[] usuarios;
   private Libro[] libros;
   private int numLibros = 0;

    public Usuario[] getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuario[] usuarios) {
        this.usuarios = usuarios;
    }

    public Libro[] getLibros() {
        return libros;
    }

    public void setLibros(Libro[] Libros) {
        this.libros = Libros;
    }
   
    
    
    public Libro darDeAltaLibros(){
        Scanner sc = new Scanner(System.in);
        System.out.println("por favor introduce el isbn del libro que quieras retirar de la biblioteca, en ese orden");
        String isbn = "isbn";
        String autor = "isbn";
        String titulo = "isbn";
        Libro libroRecibido = new Libro(isbn, autor,titulo, numLibros);
        libros[numLibros] = libroRecibido;
        numLibros++;
        
        return libroRecibido;
    }
    public Usuario darDeAltaUsusarios(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor introduzca el nombre del usuario que quieres dar de alta");
        Usuario usuario =  new  Usuario();
        usuario.setNombre(sc.nextLine());
        //sin acabar
        return usuario;
    }
    public void darDeBajaUsusarios(Scanner sc){
        
    }
}
