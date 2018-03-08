/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuerpoDeElite;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class CuerpoDeEliteMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // implements (nombre de la interface)
        Scanner sc = new Scanner(System.in);
        Funcionalidad milicia = new Funcionalidad();
        int opcion = 0;
        System.out.println("1.- Crear misión 2.- Relajar soldados 3.- Resultado mision ");
        opcion = sc.nextInt();
        sc.nextLine();
        switch (opcion) {
            case 1:
                milicia.crearMision();
                break;
            case 2:
                milicia.reljarSoldados();
                break;
            case 3:
                milicia.anotarResultados();
                break;
            default:
                break;
        }
    }

}
