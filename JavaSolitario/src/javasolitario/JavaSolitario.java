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
        int contadorNumeroDeCartasPorTurno;
        contadorNumeroDeCartasPorTurno=40;
        //Declaramos los arrays necesarios
        //0 oros, 1 copas, 2 espadas 3 bastos
        Scanner sc = new Scanner(System.in);
        int[] baraja = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,};
        int[] palos = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
        int[] mazos = new int[4];
        //Barajamos los arrays
        barajarArray(baraja, palos);
        //sacamos cartas de 2 en 2
        do {            
            for (int i = 1; i < (contadorNumeroDeCartasPorTurno/2); i += 2) {
            System.out.println(baraja[i]);
            if (baraja[i] == mazos[palos[i]] + 1) {
                mazos[palos[i]] = baraja[i];
                baraja[i] = 0;
                palos[i] = 0;
                contadorNumeroDeCartasPorTurno--;
                //utilizamos función para ver si los anteriores también se pueden guardar
                comprobarAnteriores(baraja, mazos, palos, i,contadorNumeroDeCartasPorTurno);
            }
        }
        } while (contadorNumeroDeCartasPorTurno > 1);
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

    public static void comprobarAnteriores(int[] arrayBaraja, int[] arrayMazo, int[] arrayPalo, int posicion, int contadorNumeroDeCartasPorTurno) {
        while (arrayMazo[arrayPalo[posicion - 1]] == arrayBaraja[posicion - 1] - 1) {
            arrayMazo[arrayPalo[posicion - 1]] = arrayBaraja[posicion - 1];
            posicion--;
            arrayPalo[posicion] = 0;
            arrayBaraja[posicion] = 0;
            contadorNumeroDeCartasPorTurno--;
        }
    }
    // hacer una función que quite los ceros
    public static void quitarCeros(int[] arrayBaraja, int[] arrayPalo){
        //hacer un for que recorra todo el array y que cuando encuentre un cero hacer otro for dentro que mueva todos los numeros una posición
        for (int i = 0; i < arrayBaraja.length; i++) {
            if (true) {
                
            }
        }
    }
}
