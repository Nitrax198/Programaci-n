/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasieteymedia2.pkg0;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author flotante
 */
public class JavaSieteYMedia20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        //definir variables
        boolean pedir = true, seguirOrdenador = true;
        double suma, sumaIA;
        sumaIA = 0;
        suma = 0;
        int contador1, respuesta, contadorCartas;
        contadorCartas = 0;
        contador1 = 0;
        //hacer un array de 40 espacios que vaya de 10 en 10
        int[] baraja = new int[40];
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 11; j++) {
                baraja[contador1] = j;
                contador1++;
            }
        }
        //barajar las cartas
        barajarArray(baraja);
        //dar carta al usuario

        //preguntar si quiere mas
        do {
            if (baraja[contadorCartas] == 8 || baraja[contadorCartas] == 9 || baraja[contadorCartas] == 10) {
                System.out.println("tu carta es " + baraja[contadorCartas]);
                suma += 0.5;
                System.out.println("tienes un total de " + suma);
            } else {
                System.out.println("tu nueva carta es " + baraja[contadorCartas]);
                suma = baraja[contadorCartas];
                System.out.println("ahora tienes un total de " + suma);
            }
            contadorCartas++;
            System.out.println("¿quieres otra carta?si quieres otra pon1 si no pon 0");
            respuesta = sc.nextInt();
            //si quierer mas ir sumando cartas dadadas
        } while (respuesta == 1 && suma >= 7.5);
        //si no quiere mas repetir todo con el ordenador

        do {
            if (sumaIA < suma && sumaIA < 7.5) {
                if (baraja[contadorCartas] == 8 || baraja[contadorCartas] == 9 || baraja[contadorCartas] == 10) {
                    sumaIA += 0.5;
                    contadorCartas++;
                    System.out.println("el nuevo total es" + sumaIA);
                } else {
                    sumaIA += baraja[contadorCartas];
                    contadorCartas++;
                    System.out.println("el nuevo total es" + sumaIA);
                }
            } else {
                seguirOrdenador = false;
            }
        } while (seguirOrdenador && suma < 7.5);
        //comparar a ver quien ha ganado

        if (suma < 7.5 && sumaIA > 7.5) {
            System.out.println("Ha ganado el usuario felicidades");
        } else if (suma < 7.5 && sumaIA < 7.5) {
            if (suma < sumaIA) {
                System.out.println("Ha ganado el usuario felicidades");
            } else {
                System.out.println("Ha ganado la maquina,Manco");
            }
        } else if (suma > 7.5 && sumaIA < 7.5) {
            System.out.println("Ha ganado la maquina,Manco");
        } else {
            System.out.println("Ha ganado la maquina");
        }
        System.out.println(suma);
        System.out.println(sumaIA);
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
