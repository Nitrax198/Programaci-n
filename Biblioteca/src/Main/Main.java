/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

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
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Elije el numero de ejercicio del 1 al 7, los enunciados son:\n"
                + "1. Dar De Alta Usuario. \n"
                + "2. Dar De Baja Usuario \n"
                + "3. Dar De Alta libro \n"
                + "4. Prestar Un libro \n"
                + "5. Devolver un libro \n"
                + "6. Listado de libros \n"
                + "7. Listado de alumnos \n");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            default:
                System.out.println("opcion no valida");
        }

    }
    
}
