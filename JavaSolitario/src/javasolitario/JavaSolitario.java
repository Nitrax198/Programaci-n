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
        int contadorNumeroDeCartasPorTurno, contadorFinal;
        contadorNumeroDeCartasPorTurno = 40;
        //Declaramos los arrays necesarios
        //0 oros, 1 copas, 2 espadas 3 bastos
        Scanner sc = new Scanner(System.in);
        int[] baraja = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,};
        int[] palos = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
        int[] mazos = new int[4];
        //Barajamos los arrays
        barajarArray(baraja, palos);
        //sacamos cartas de 2 en 2
//        for (int i = 0; i < 10; i++) {
//            baraja[i]=10-i;
//        }
//        for (int i = 10; i < 20; i++) {
//            baraja[i]=20-i;
//        }
//        for (int i = 20; i < 30; i++) {
//            baraja[i]=30-i;
//        }
//        for (int i = 30; i < 40; i++) {
//            baraja[i]=40-i;
//        }
        do {
            contadorFinal = 0;
            for (int i = 1; i < 40 && (baraja[i]!=0 || baraja[i-1]!=0); i += 2) {
                if (baraja[i] == mazos[palos[i]] + 1) {
                    mazos[palos[i]] = baraja[i];
                    baraja[i] = 0;
                    palos[i] = 0;
                    contadorNumeroDeCartasPorTurno--;
                    contadorFinal++;
                    //utilizamos función para ver si los anteriores también se pueden guardar
                    comprobarAnteriores(baraja, mazos, palos, i, contadorNumeroDeCartasPorTurno, contadorFinal);
                }
            }
            for (int i = 0; i < baraja.length; i++) {
                System.out.println(baraja[i]);
            }
            System.out.println("Estas con las cartas que has conseguido sacar");
            for (int i = 0; i < mazos.length; i++) {
                System.out.println(mazos[i]);
            }
            quitarCeros(baraja, palos);
        } while (contadorNumeroDeCartasPorTurno != 0 && contadorFinal != 0);
        if (contadorFinal==0) {
            System.out.println("No se ha podido sacar mas cartas");
        }
        else if (contadorNumeroDeCartasPorTurno==0) {
            System.out.println("Felicidades, has completado el solitario");
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

    public static void comprobarAnteriores(int[] arrayBaraja, int[] arrayMazo, int[] arrayPalo, int posicion, int contadorNumeroDeCartasPorTurno, int contadorFinal) {
        while (posicion !=0 && arrayMazo[arrayPalo[posicion - 1]] == arrayBaraja[posicion - 1] - 1) {
            arrayMazo[arrayPalo[posicion - 1]] = arrayBaraja[posicion - 1];
            posicion--;
            arrayPalo[posicion] = 0;
            arrayBaraja[posicion] = 0;
            contadorNumeroDeCartasPorTurno--;
            contadorFinal++;
        }
    }

    // hacer una función que quite los ceros
    public static void quitarCeros(int[] arrayBaraja, int[] arrayPalo) {
        //hacer un for que recorra todo el array y que cuando encuentre un cero hacer otro for dentro que mueva todos los numeros una posición
        for (int i = 0; i < arrayBaraja.length - 1; i++) {
            if (arrayBaraja[i] == 0) {
                for (int j = 0; j < (arrayBaraja.length - (i + 1)); j++) {
                    arrayBaraja[i] = arrayBaraja[i + (j + 1)];
                    arrayPalo[i] = arrayPalo[i + (j + 1)];
                }
            }
        }
    }
}
