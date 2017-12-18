/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinaldesdecasa2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class ExamenFinalDesdeCasa2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("ejercicio 1 o 2");
        int opcion = sc.nextInt();
        switch (opcion) {
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
        int[] baraja1 = new int[40];
        int[] baraja2 = new int[40];
        int[] Puntos1 = new int[10];
        int[] Puntos2 = new int[10];
        int resultado1 = 0;
        int resultado2 = 0;
        crearbaraja(baraja1);
        crearbaraja(baraja2);
        barajarArray(baraja1);
        barajarArray(baraja2);
        imprimirArray(baraja1);
        imprimirArray(baraja2);
        for (int i = 0; i < baraja1.length; i++) {
            Puntos1[baraja1[i] - 1] += i;
        }
        for (int i = 0; i < baraja2.length; i++) {
            Puntos2[baraja2[i] - 1] += i;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("El jugador 1 tiene puntos en " + (i + 1) + " son " + Puntos1[i]);
            System.out.println("El jugador 1 tiene puntos en" + (i + 1) + " son " + Puntos2[i]);
        }
        for (int i = 0; i < 10; i++) {
            if (Puntos1[i] > Puntos2[i]) {
                resultado1++;
            } else if (Puntos2[i] > Puntos1[i]) {
                resultado2++;
            }
        }
        if (resultado1 > resultado2) {
            System.out.println("Ha ganado el jugador 1 por " + resultado1 + " a " + resultado2);
        } else if (resultado2 > resultado1) {
            System.out.println("Ha ganado el jugador 2 por " + resultado2 + " a " + resultado1);
        } else {
            System.out.println("Habeis empatado");
        }
    }

    public static void ejercicio2(Scanner sc) {
        int[] array = new int[10];
        int[] arrayParacodificar = new int[10];
        int[] arrayParadecodificada = new int[10];
        int[] arrayPositivos = new int[10];
        int contador = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.println("Escribe un numero " + (i + 1));
            array[i] = sc.nextInt();
        }
        boolean Fallo = comprobarArray(array);
        if (Fallo == true) {
            System.out.println("Te has equivocado");
        } else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] < 0) {
                    arrayPositivos[i] = array[i] * (-1);
                } else {
                    arrayPositivos[i] = array[i];
                }
            }
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < arrayPositivos.length; j++) {
                    if (arrayPositivos[j] == (i + 1)) {
                        arrayParacodificar[contador] = array[j];
                        contador++;
                    }
                }
            }
            for (int i = 0; i < arrayParacodificar.length; i++) {
                System.out.println(arrayParacodificar[i]);
            }
            contador = 0;
            for (int i = -10; i <= 10; i++) {
                for (int j = 0; j < array.length; j++) {
                    if (array[j] == i) {
                        arrayParadecodificada[contador] = array[j];
                        contador++;
                    }
                }
            }
            for (int i = 0; i < arrayParadecodificada.length; i++) {
                System.out.println(arrayParadecodificada[i]);
            }
        }
    }

    public static void crearbaraja(int[] baraja) {
        int contador = 0;
        for (int k = 0; k < 4; k++) {
            for (int j = 1; j < 11; j++) {
                baraja[contador] = j;
                contador++;
            }
        }
    }

    public static void imprimirArray(int[] array) {
        System.out.println("La baraja con sus rayas: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " - ");
        }
        System.out.println();
    }

    public static void barajarArray(int[] array) {
        Random generadorNumerosAleatorios = new Random();
        int posicion;
        int posicion2;
        int swap;
        for (int i = 0; i < 999999; i++) {
            posicion = generadorNumerosAleatorios.nextInt(array.length);
            posicion2 = generadorNumerosAleatorios.nextInt(array.length);
            swap = array[posicion];
            array[posicion] = array[posicion2];
            array[posicion2] = swap;
        }
    }

    public static boolean comprobarArray(int[] array) {
        boolean Comprobar = false;
        for (int i = 0; i < array.length - 2; i++) {
            if ((array[i] == array[(i + 1)]) || (array[i] > array[(i + 1)])) {
                Comprobar = true;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                Comprobar = true;
            } else if (-10 > array[i] || array[i] > 10) {
                Comprobar = true;
            } else if (!(array[0] < 0)) {
                Comprobar = true;
            } else if (!(array[9] > 0)) {
                Comprobar = true;
            }
        }
        return Comprobar;
    }

}
