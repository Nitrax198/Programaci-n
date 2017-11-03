/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Random;

/**
 *
 * @author daw
 */
public class barajade10cartas {

    public static void main(String[] args) {
        int carta, carta2;
        carta = 0;
        carta2 = 0;
        int puntos, puntos2;
        puntos = 0;
        puntos2 = 0;
        //inicializa dos array de 10 cartas
        int[] mazo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] mazo2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //inicializa una array de 10 cartas
        //barajea los mazos
        barajarArray(mazo);
        barajarArray(mazo2);

        for (int i = 0; i < mazo.length; i++) {
            System.out.println(mazo[i]);
        }

        //ir sacando una a una las cartas y comparandolas a ver quien gana
        for (int i = 0; i < mazo.length; i++) {
            carta = mazo[i];
            System.out.println("la carta es " + carta);
            carta2 = mazo2[i];
            System.out.println("la carta es " + carta2);
            if (carta > carta2) {
            puntos++;
        }
        else if(carta2>carta){
            puntos2++;
        }
        else {
            System.out.println("Habeis empatado");
        }
        }
        //sacar el ganador.
        if(puntos>puntos2){
            System.out.println("Ha ganado el jugador uno");
        }
        else if (puntos2>puntos){
            System.out.println("has ganado jugador 2");
        }
        else {
            System.out.println("habeis empatado");
        }
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
