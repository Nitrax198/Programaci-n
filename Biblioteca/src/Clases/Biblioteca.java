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
    private int numDeUsuarios = 0;

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

    public Libro darDeAltaLibros() {
        Scanner sc = new Scanner(System.in);
        System.out.println("por favor introduce el isbn del libro que quieras retirar de la biblioteca");
        String isbn = sc.nextLine();
        System.out.println("por favor introduce el autor del libro que quieras retirar de la biblioteca");
        String autor = sc.nextLine();
        System.out.println("por favor introduce el titulo del libro que quieras retirar de la biblioteca");
        String titulo = sc.nextLine();
        System.out.println("por favor introduce el Numero de paginas del libro que quieras retirar de la biblioteca");
        int numeroDePaginas = sc.nextInt();
        sc.nextLine();
        Libro libroRecibido = new Libro(isbn, autor, titulo, numeroDePaginas);
        libros[numLibros] = libroRecibido;
        numLibros++;

        return libroRecibido;
    }

    public Usuario darDeAltaUsusarios() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor introduzca el nombre del usuario que quieres dar de alta");
        String nombre = sc.nextLine();
        Usuario usuario = new Usuario(nombre);
        usuario.setNombre(nombre);
        usuarios[numDeUsuarios] = usuario;
        numDeUsuarios++;
        return usuario;
    }

    public void darDeBajaUsusarios(Scanner sc) {
        int posicionUsuario;
        posicionUsuario = encontrarUsuario(sc);

        Usuario u = usuarios[posicionUsuario];

        u.devolverTodosLosLibros();

        usuarios[posicionUsuario] = usuarios[numDeUsuarios - 1];
        usuarios[numDeUsuarios - 1] = null;
        numDeUsuarios--;

    }

    private int encontrarUsuario(Scanner sc) {
        int posicionUsuario;
        posicionUsuario = -1;
        Usuario usuarioBuscado;
        System.out.println("Por favor escriba el nombre de usuario");
        String nombre = sc.nextLine();
        usuarioBuscado = new Usuario(nombre);
        for (int i = 0; i < usuarios.length && posicionUsuario == -1; i++) {
            if (usuarios[i].equals(usuarioBuscado)) {
                posicionUsuario = i;
            }
        }
        return posicionUsuario;
    }

//    public int encontrarLibro(Scanner sc) {
//        int posicionLibro;
//        posicionLibro = -1;
//        Libro libroBuscado;
//        System.out.println("Por favor escriba el titulo del Libro");
//        String titulo = sc.nextLine();
//        libroBuscado = new Libro();
//        for (int i = 0; i < usuarios.length && posicionUsuario == -1; i++) {
//            if (usuarios[i].equals(usuarioBuscado)) {
//                posicionUsuario = i;
//            }
//        }
//        return posicionUsuario;
//    }
    public void listadoDeLibros(Scanner sc) {
        boolean fin = false;
        for (int i = 0; i < libros.length  && !fin; i++) {
            if (libros[i] != null) {
                libros[i].toString();
            }
            else {
                System.out.println("No quedan libros");
                fin=true;
            }
        }
    }

    public void listadoDeUsuarios(Scanner sc) {
        boolean fin = false;
        for (int i = 0; i < usuarios.length  && !fin; i++) {
            if (usuarios[i] != null) {
                usuarios[i].toString();
            } 
            else {
                System.out.println("No quedan usuarios");
                fin=true;
            }
        }
    }

}
