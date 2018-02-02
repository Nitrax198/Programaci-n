/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Clases.*;
import java.util.Scanner;

/**
 *
 * @author daw
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean Clausurador;
        Clausurador = false;
        Biblioteca b = new Biblioteca();
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Elije el numero de ejercicio del 1 al 7, los enunciados son:\n"
                + "1. Dar De Alta Usuario. \n"
                + "2. Dar De Baja Usuario \n"
                + "3. Dar De Alta libro \n"
                + "4. Prestar Un libro \n"
                + "5. Devolver un libro \n"
                + "6. Listado de libros \n"
                + "7. Listado de alumnos \n"
                + "8.clausurar Biblioteca \n");
        while (!Clausurador) {
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    b.darDeAltaUsusarios();
                    break;
                case 2:
                    b.darDeBajaUsusarios(sc);
                    break;
                case 3:
                    b.darDeAltaLibros();
                    break;
                case 4:
                    b.prestarLibro(sc);
                    break;
                case 5:
                    b.devolverLibro(sc);
                    break;
                case 6:
                    b.listadoDeLibros(sc);
                    break;
                case 7:
                    b.listadoDeUsuarios(sc);
                    break;
                case 8:
                    Clausurador = true;
                    System.out.println("La biblioteca va a cerrar, por favor deposite sus objetos electronicos en la bandeja de entrada");
                    break;
                default:
                    System.out.println("opcion no valida");
            }
        }

    }

}
