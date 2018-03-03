/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohmyguein;

import java.util.Scanner;

/**
 *
 * @author daw
 */
public class OhMyGuein {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionalidad f = new Funcionalidad();
        // TODO code application logic here
        System.out.println("Elije el numero de ejercicio del 1 al 3, los enunciados son:\n"
                + "1. Crear un torneo. \n"
                + "2. Mostrar el ranking \n"
                + "3. Mostrar los torneos \n");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                f.addCampeonato();
                break;
            case 2:
                f.listarCampeonatos();
                break;
            case 3:
                f.ranking();
                break;
            default:
                System.out.println("Fatal ERROR");
        }
    }

}
