/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationtresenrallayconecta4;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class TresEnRallaMio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //declarar variables
        char tipo;
        boolean fin = false;
        boolean turno = false;
        int contadorGameOver, x, y;
        contadorGameOver = 0;
        //Primero creamos un array bidimensional de 3X3 de caracteres
        char[][] tablero = new char[3][3];
        //rellenamos el tablero con guiones para que a la hora de mostrarlo sea mas claro
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = '-';
            }
        }
        System.out.println("Mira guapo, el tablero es así");
        imprimirTablero(tablero);
        //hacer un do while hasta que uno de los jugadores gane o se llene el tablero
        do {
            //ir cambiando de turno (true es x)
            if (turno == true) {
                tipo = 'X';
                //que cada jugador vaya escribiendo lo que toque
                do {
                    System.out.println("Le toca al jugador X; Dime las coordenadas(Primero la fila)(numeros entre 0 y 2)");
                    x = sc.nextInt();
                    y = sc.nextInt();
                } while (comprobarCasilla(tablero, x, y) == false);
                tablero[x][y] = 'X';
                contadorGameOver++;
                turno = !turno;
                fin = comprobarTresEnRalla(tablero, tipo, x, y);
            } else if (turno == false) {
                tipo = 'O';
                //que cada jugador vaya escribiendo lo que toque
                do {
                    System.out.println("Le toca al jugador O; Dime las coordenadas(Primero la fila)(numeros entre 0 y 2)");
                    x = sc.nextInt();
                    y = sc.nextInt();
                } while (comprobarCasilla(tablero, x, y) == false);
                tablero[x][y] = 'O';
                contadorGameOver++;
                turno = !turno;
                fin = comprobarTresEnRalla(tablero, tipo, x, y);
            }
            imprimirTablero(tablero);
        } while (fin == false && contadorGameOver < 9);

    }

    public static void imprimirTablero(char tablero[][]) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static boolean comprobarCasilla(char tablero[][], int x, int y) {
        boolean comprobarOcupado = true;
        if (tablero[x][y] != '-') {
            comprobarOcupado = false;
            System.out.println("Te has equivocado de coordenadas,por favor introducelas de nuevo");
        }
        return comprobarOcupado;
    }

    public static boolean comprobarFila(char[][] tablero, char tipo, int filas) {
        boolean tresEnRaya = true;
        for (int i = 0; i < 3 && tresEnRaya; i++) {
            if (tablero[filas][i] != tipo) {
                tresEnRaya = false;
            }
        }

        return tresEnRaya;
    }

    public static boolean comprobarColumna(char[][] tablero, char tipo, int columnas) {
        boolean tresEnRaya = true;
        for (int i = 0; i < 3 && tresEnRaya; i++) {
            if (tablero[i][columnas] != tipo) {
                tresEnRaya = false;
            }
        }

        return tresEnRaya;
    }

    public static boolean comprobarDiagonalIzquierda(char[][] tablero, char tipo, int filas, int columnas) {
        boolean tresEnRaya = true;
        for (int i = 0; i < 3 && tresEnRaya; i++) {
            if (tablero[i][i] != tipo) {
                tresEnRaya = false;
            }

        }

        return tresEnRaya;
    }

    public static boolean comprobarDiagonalDerecha(char[][] tablero, char tipo, int filas, int columnas) {
        boolean tresEnRaya = true;
        for (int i = 0; i < 3 && tresEnRaya; i++) {
            if (i + (2 - i) == 2) {
                if (tablero[2 - i][i] != tipo) {
                    tresEnRaya = false;
                }
            }
        }

        return tresEnRaya;
    }

    public static boolean comprobarTresEnRalla(char[][] tablero, char tipo, int filas, int columnas) {
        boolean tresEnRaya = true;
        tresEnRaya = comprobarColumna(tablero, tipo, columnas);
        if (tresEnRaya == false) {
            tresEnRaya = comprobarDiagonalIzquierda(tablero, tipo, filas, columnas);
            if (tresEnRaya == false) {
                tresEnRaya = comprobarFila(tablero, tipo, filas);
                if (tresEnRaya == false) {
                    tresEnRaya = comprobarDiagonalDerecha(tablero, tipo, filas, columnas);
                }
            }
        }
        return tresEnRaya;
    }
}
