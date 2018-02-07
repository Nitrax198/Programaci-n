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

    public Biblioteca() {
        this.usuarios = new Usuario[50];
        this.libros = new Libro[50];
    }

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

    public void darDeAltaLibros() {
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
    }

    public void darDeAltaUsusarios() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor introduzca el nombre del usuario que quieres dar de alta");
        String nombre = sc.nextLine();
        Usuario usuario = new Usuario(nombre);
        usuario.setNombre(nombre);
        usuarios[numDeUsuarios] = usuario;
        numDeUsuarios++;
    }

    public void darDeBajaUsusarios(Scanner sc) {
        int posicionUsuario;
        posicionUsuario = encontrarUsuario(sc);

        Usuario u = usuarios[posicionUsuario];
        Libro[] librosDelUS = u.getLibrosPrestados();
        u.devolverTodosLosLibros();
        for (int i = 0; i < 10; i++) {
            librosDelUS[i].setPrestado(false);
        }
        usuarios[posicionUsuario] = usuarios[numDeUsuarios - 1];
        usuarios[numDeUsuarios - 1] = null;
        numDeUsuarios--;
        
    }

    private int encontrarUsuario(Scanner sc) {
        int posicionUsuario;
        posicionUsuario = -1;
        Usuario usuarioBuscado;
        System.out.println("Por favor escriba el nombre de usuario");
        String nombre = sc.next();
        usuarioBuscado = new Usuario(nombre);
        for (int i = 0; i < usuarios.length && posicionUsuario == -1; i++) {
            if (usuarioBuscado.equals(usuarios[i])) {
                posicionUsuario = i;
            }
        }
        return posicionUsuario;
    }

    private int encontrarLibro(Scanner sc) {
        boolean fin;
        fin = false;
        int posicionDelLibro;
        posicionDelLibro = 0;
        for (int i = 0; i < libros.length && !fin; i++) {
            if (libros[i] != null) {
                System.out.println(libros[i].toString() + i + 1);
                System.out.println("/n");
            } else {
                fin = true;
            }
            System.out.println("Por favor escribe el numero del libro");
            posicionDelLibro = sc.nextInt()-1;
            sc.nextLine();
        }
        return posicionDelLibro;
        // metodo uno
//        boolean fin;
//        fin = false;
//        int posicionDelLibro;
//        posicionDelLibro = -1;
//        String tituloDelLibro;
//        System.out.println("por favor escribe el titulo del libro que buscas");
//        tituloDelLibro = sc.nextLine();
//        for (int i = 0; i < libros.length && !fin; i++) {
//            if (libros[i] != null) {
//                if (libros[i].getTitulo().equals(tituloDelLibro)) {
//                    posicionDelLibro=i;
//                    fin = true;
//                }
//            }
//            else{
//                fin = true;
//            }
//        }
//        return posicionDelLibro;
    }

    public void listadoDeLibros(Scanner sc) {
        boolean fin = false;
        for (int i = 0; i < libros.length && !fin; i++) {
            if (libros[i] != null) {
                System.out.println(libros[i].toString());
            } else {
                System.out.println("No quedan libros");
                fin = true;
            }
        }
    }

    public void listadoDeUsuarios(Scanner sc) {
        boolean fin = false;
        for (int i = 0; i < usuarios.length && !fin; i++) {
            if (usuarios[i] != null) {
                System.out.println(usuarios[i].toString());
            } else {
                System.out.println("No quedan usuarios");
                fin = true;
            }
        }
    }

    public void prestarLibro(Scanner sc) {
        int posicionUsuario = encontrarUsuario(sc);
        int posicionLibro = encontrarLibro(sc);
        //comprobar si se puede prestar
        Usuario usuario;
        usuario = usuarios[posicionUsuario];
        Libro libro;
        libro = libros[posicionLibro];
        if (usuario.getNumeroLibrosPrestados() != 3 && libro.isPrestado() != true) {
            usuario.prestarLibro(libro);
            libros[posicionLibro].setPrestado(true);
        } else {
            System.out.println("El usuario no puede sacar mas libros o este ya ha sido prestado");
        }

    }

    public void devolverLibro(Scanner sc) {
        int posicionUsuario = encontrarUsuario(sc);
        int posicionLibro = encontrarLibro(sc);
        Usuario usuario;
        usuario = usuarios[posicionUsuario];
        Libro libro;
        libro = libros[posicionLibro];
        usuario.devolverLibro(libro);
        libros[posicionLibro].setPrestado(false);
    }

}
