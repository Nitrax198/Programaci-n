/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.examensorplresa;

import java.util.Scanner;

/**
 *
 * @author daw
 */
public class JavaExamenSorplresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ejercicio 1,2");
        int ejercicio = sc.nextInt();
        switch (ejercicio) {
            case 1:
                ejercicio1(sc);
                break;
            case 2:
                ejercicio2(sc);
                break;
            default:
                System.out.println("No hay mas ejercicios");
        }

    }

    public static void ejercicio1(Scanner sc) {
        //declarar e inicializar variables
        //declarar las dos barajas como arrays
        int baraja1 [] = new int [40];
        int baraja2 [] = new int [40];
        //llenar las dos barajas
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                baraja1[i]=i;
                baraja1[i]=i;
            }
        }
        //barajar ambas barajas
        
        //recorrer ambos arrays y comparar las posiciones , guardar la mas baja en cada caso
    }

    public static void ejercicio2(Scanner sc) {

    }

}
