/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasieteymedia;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author daw
 */
public class JavaSieteYMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        //definir variables
        boolean pedir = true, seguirOrdenador = true;
        double suma, sumaOrdenador;
        int contador1, respuesta, contadorCartas;
        contadorCartas = 2;
        contador1 = 0;
        //hacer un array de 40 espacios que vaya de 10 en 10
        int[] baraja = new int[40];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                baraja[contador1] = j;
                contador1++;
            }
        }
        //barajar las cartas
        barajarArray(baraja);
        //dar carta al usuario
        System.out.println(baraja[0]);
        suma = baraja[0];
        //preguntar si quiere mas
        do {
            System.out.println("¿Quieres mas? pon 0 para no y uno para si");
            respuesta = sc.nextInt();
            //si quierer mas ir sumando cartas dadadas
            if (respuesta == 1) {
                if (baraja[contadorCartas] == 8 || baraja[contadorCartas] == 9 || baraja[contadorCartas] == 10) {
                    suma += 0.5;
                    contadorCartas++;
                    System.out.println(suma);
                } else {
                    System.out.println(baraja[contadorCartas]);
                    suma += baraja[contadorCartas];
                    contadorCartas++;
                    System.out.println(suma);
                }
            } else if (respuesta == 0) {
                pedir = false;
            }

        } while (pedir == true);
        //si no quiere mas repetir todo con el ordenador
        System.out.println(baraja[1]);
        sumaOrdenador = baraja[1];
        do {
            if (baraja[1] <= 6&&suma<7.5) {
                if (baraja[contadorCartas] == 8 || baraja[contadorCartas] == 9 || baraja[contadorCartas] == 10) {
                    sumaOrdenador += 0.5;
                    contadorCartas++;
                    System.out.println(sumaOrdenador);
                } else if (baraja[1] < 6) {
                    sumaOrdenador += baraja[contadorCartas];
                    contadorCartas++;
                    System.out.println(sumaOrdenador);
                }
            } else {
                seguirOrdenador = false;
            }
        } while (seguirOrdenador == true);
        //comparar a ver quien ha ganado

        if (suma < 7.5 && sumaOrdenador > 7.5) {
            System.out.println("Ha ganado el usuario felicidades");
        } else if (suma < 7.5 && sumaOrdenador < 7.5) {
            if (suma < sumaOrdenador) {
                System.out.println("Ha ganado el usuario felicidades");
            } else {
                System.out.println("Ha ganado la maquina,Manco");
            }
        } else if (suma>7.5&&sumaOrdenador<7.5) {
            System.out.println("Ha ganado la maquina,Manco");
        }
        System.out.println(suma);
        System.out.println(sumaOrdenador);
    }

    public static void barajarArray(int[] array) {
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
        }
    }

}
