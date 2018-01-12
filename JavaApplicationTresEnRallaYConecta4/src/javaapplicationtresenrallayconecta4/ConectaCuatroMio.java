/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationtresenrallayconecta4;

import java.util.Scanner;

/**
 *
 * @author daw
 */
public class ConectaCuatroMio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //declaramos las variables
        boolean fin, fallo;
        fin = false;
        fallo = true;
        //la variable fin sera falsa hasta que alguien haga tres en raya
        char tipo;
        int ContadorParaVerSiEstaLeno, x, y;
        ContadorParaVerSiEstaLeno = 0;
        //primero prepara el tablero
        //hacer un array de 6*7 (tipo char)en el que guaradar primero todo guiones
        //ir pidiendo fichas e ir guardandolas en sus respectivbas casillas
        //despues hacer función que compruebe si esta ocupada la casilla
        //hacer funciones que comprueben las horizontales,verticales y diagonales
        char[][] tablero = new char[6][7];

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = '-';
            }
        }
        System.out.println("Este es el tablero");
        for (int i = 0; i < tablero.length; i++) {
            System.out.println(tablero[i]);
        }
        // ir pidiendo turno a los jugadores para recibir coordenadas
        //hacer un do while que no se acabe hasta que uno de los jugadores gane o hasta que uno de los jugadores gane
        do {
            //turno del jugador 1
            tipo = 'X';
            do {
                System.out.println("Le toca al jugador X; Dime La columna en la que quieres colocar la ficha(de la 2 a la 7)");
                y = sc.nextInt();
                x = comprobarColumnaParaGuardarLaFicha(y, tablero);
                if (x == -1) {
                    System.out.println("por favor introduce de nuevo la columna, esa está llena");
                } else {
                    fallo = false;
                }
            } while (fallo);
            fallo = true;
            tablero[x][y] = 'X';
            ContadorParaVerSiEstaLeno++;
            //turno del jugador 2
            tipo = 'O';
            do {
                System.out.println("Le toca al jugador 0; Dime La columna en la que quieres colocar la ficha(de la 2 a la 7)");
                y = sc.nextInt();
                x = comprobarColumnaParaGuardarLaFicha(y, tablero);
                if (x == -1) {
                    System.out.println("por favor introduce de nuevo la columna, esa está llena");
                } else {
                    fallo = false;
                }
            } while (fallo);
            fallo = true;
            tablero[x][y] = 'O';
            ContadorParaVerSiEstaLeno++;
        } while (ContadorParaVerSiEstaLeno < 42 && !fin);
    }

    public static int comprobarColumnaParaGuardarLaFicha(int y, char[][] columna) {
        int x;
        x = 6;
        boolean stop = true;
        for (int i = 0; i < columna.length && stop; i++) {
            if (i == 0 && columna[i][y] != '-') {
                System.out.println("Lo siento , la columna está llena");
                stop = false;
                x = -1;
            } else if (i > 0 && columna[i][y] != '-') {
                x = i - 1;
                stop = false;
            } else if (i == 6 && columna[i][y] == '-') {
                x = i;
                stop = false;
            }
        }

        //de esta forma la xva ha ser la coordenada donde se guarde la ficha y además nos aseguramos de que no se sobre escriba con stop
        return x;
    }
//    Hacer 4 funciones, una para comprobar las columnas, otra para comprobar las filas y dos mas para cada diagonal
}
