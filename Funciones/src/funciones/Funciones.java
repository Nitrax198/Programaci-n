/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO code application logic here

        //función primera
        int pollingui, posiciones;
        pollingui = sc.nextInt();
        posiciones = sc.nextInt();
        int arrayFuncion1[] = new int[pollingui];
        arrayFuncion1 = crearArrays(sc, pollingui, posiciones);

        //Segunda función
        int arrayFuncion2[] = new int[10];
        recorrerArray(sc, arrayFuncion2);

        //tercera función
        int[] numeros = new int[10];
        numeros = shiftArray(sc, numeros);
        
        
        
        //cuarta funcion 
        int[] numeros2 = new int[10];
        int numeroDeVeces;
        System.out.println("Escrube cuantas veces");
        numeroDeVeces= sc.nextInt();
        numeros2= shiftArrayNveces(sc, numeros2, numeroDeVeces);
    }

    public static int[] crearArrays(Scanner sc, int tamaño, int posiciones) {
        //esto es una función
        int array[] = new int[tamaño];
        for (int i = 0; i < posiciones; i++) {
            System.out.println("Escribe un numero");
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static void recorrerArray(Scanner sc, int[] array) {
        //esto es una función
        int direccion;
        System.out.println("escribe en que dirección quieres que vaya, 1 para alante y 0 para atrás");
        direccion = sc.nextInt();
        if (direccion == 1) {
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        } else {
            for (int i = array.length; i > 0; i--) {
                System.out.println(array[i]);
            }
        }
    }

    public static int[] shiftArray(Scanner sc, int[] array) {
        //esto es una función

        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce el numero " + (i + 1));
            array[i] = sc.nextInt();
        }

        for (int i = 0, sale = 0, entra = array[9];
                i < array.length; i++) {
            sale = array[i];
            array[i] = entra;
            entra = sale;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        return array;
    }

    public static int[] shiftArrayNveces(Scanner sc, int[] array, int n) {
        //esto es una función

        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce el numero " + (i + 1));
            array[i] = sc.nextInt();
        }
        for (int j = 0; j < n; j++) {

            for (int i = 0, sale = 0, entra = array[9];
                    i < array.length; i++) {
                sale = array[i];
                array[i] = entra;
                entra = sale;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        return array;
    }

    public static void verValorCarta(String[] args) {
        //esto es una función
    }

}
