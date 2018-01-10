/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasolitario;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author daw
 */
public class JavaSolitario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            // TODO code application logic here
            //declarar baraja y variables
            // sacar cartas de 2 en 2
            //crear  array de palos que se mueva a la vez que la baraja
            //cuando se quita una carta mover el 0 al final
            //crear array de 4 en el que ir guardando las cartas
    //declaramos las variables
    int Posicion;
    //Declaramos los arrays necesarios
        //0 oros, 1 copas, 2 espadas 3 bastos
        Scanner sc = new Scanner(System.in);
        int[] baraja = {1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10,};
        int[] palos = {0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,3,3,3,3,3,3,3,3,3,3};
        int[] mazos = new int[4];
    //Barajamos los arrays
        barajarArray(baraja,palos);
    //sacamos cartas de 2 en 2
        for (int i = 1; i < 40; i+=2) {
            System.out.println(baraja[i]);
            if (baraja[i]==mazos[palos[i]]+1) {
                mazos[palos[i]]=baraja[i];
            }
        }
    }

    public static void barajarArray(int[] array, int[] array2) {
        Random generadorNumerosAleatorios = new Random();
        int posicion;
        int posicion2;
        int swap;

        for (int i = 0; i < 20; i++) {
            posicion = generadorNumerosAleatorios.nextInt(array.length);
            posicion2 = generadorNumerosAleatorios.nextInt(array.length);
            swap = array[posicion];
            array[posicion] = array[posicion2];
            array[posicion2] = swap;
            swap = array2[posicion];
            array2[posicion] = array2[posicion2];
            array2[posicion2] = swap;
        }
    }
    public static void comprobarAnteriores(int[]arrayBaraja,int[]arrayMazo,int[]arrayPosiciones,int posicion){
//        while (arrayBaraja[posicion-1]==arrayBaraja[posicion]+1) {            
//            arrayMazo[arrayPosiciones[posicion]]=arrayBaraja[posicion-1];
//            posicion--;
//        } esta mal(comprovar primero el palo)
    }

}
