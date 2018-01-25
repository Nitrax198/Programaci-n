/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

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
        int numAlumnos = 0;
        // TODO code application logic here
        //Array de actividades[3]
        //Array de Alumnos[50)][3]
        // Inicialización 
        // Menú
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Elije el numero de ejercicio del 1 al 7, los enunciados son:\n"
                + "1. Dar Alta. \n"
                + "2. Baja Alumno \n"
                + "3. Matricular Alumno \n"
                + "4. Recibo Alumno \n"
                + "5. Recibo Actividad \n"
                + "6. Imprimir Alumnos \n"
                + "7. Imprimir Actividades \n");
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
