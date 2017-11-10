/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author daw
 */
public class JavaEjerciciosDel1Al17 {

    //hacer un switch para todos los ejercicios
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("opciones1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                ejercicio1(sc);
                break;
            case 2:
                ejercicio2(sc);
                break;
            case 3:
                ejercicio3(sc);
                break;
            case 4:
                ejercicio4(sc);
                break;
            case 5:
                ejercicio5(sc);
                break;
            case 6:
                ejercicio6(sc);
                break;
            case 7:
                ejercicio7(sc);
                break;
            case 8:
                ejercicio8(sc);
                break;
            case 9:
                ejercicio9(sc);
                break;
            case 10:
                ejercicio10(sc);
                break;
            case 11:
                ejercicio11(sc);
                break;
            case 12:
                ejercicio12(sc);
                break;
            case 13:
                ejercicio13(sc);
                break;
            case 14:
                ejercicio14(sc);
                break;
            case 15:
                ejercicio15(sc);
                break;
            case 16:
                ejercicio16(sc);
                break;
            case 17:
                ejercicio17(sc);
                break;
            default:
                System.out.println("No hay mas ejercicios");
        }
    }

    public static void ejercicio1(Scanner sc) {
        // hacer un array para intoducir los numeros
        int[] numeros = new int[5];
        // perdir los numeros  y guardarlos en el array
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Escribe un numero");
            numeros[i] = sc.nextInt();
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }

    public static void ejercicio2(Scanner sc) {
        // hacer un array para intoducir los numeros
        int[] numeros = new int[5];
        // perdir los numeros  y guardarlos en el array
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Escribe un numero");
            numeros[i] = sc.nextInt();
        }
        for (int i = 4; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }

    public static void ejercicio3(Scanner sc) {
        int contadorPositivos, contadorNegativos, contadorCeros, sumapositivos, sumanegativos;
        sumapositivos = 0;
        sumanegativos = 0;
        contadorPositivos = 0;
        contadorNegativos = 0;
        contadorCeros = 0;
        // crear array para todos los numeros
        int[] numerosReales = new int[5];
        // introducir los numeros en el array
        for (int i = 0; i < numerosReales.length; i++) {
            System.out.println("Escribe un numero");
            numerosReales[i] = sc.nextInt();
        }
        // recorrer array y mirar cuales on pares y cuales impares
        for (int i = 0; i < numerosReales.length; i++) {
            if (numerosReales[i] == 0) {
                contadorCeros++;
            } else if (numerosReales[i] % 2 == 0) {
                contadorPositivos++;
            } else if (numerosReales[i] % 2 != 0) {
                contadorNegativos++;
            }
        }
        // creara dos nuevos arrays uno par pares y otro para impares
        int[] numerosPositivos = new int[contadorPositivos];
        int[] numerosNegativos = new int[contadorNegativos];
        // guardar los pares e impares en sus respectivos arrays
        for (int i = 0; i < numerosPositivos.length; i++) {
            if (numerosReales[i] == 0) {
                System.out.println("Eso es un cero");
            } else if (numerosReales[i] % 2 == 0) {
                numerosPositivos[i] = numerosReales[i];
                sumapositivos+= numerosPositivos[i];

            } else {
                numerosNegativos[i] = numerosReales[i];
                sumanegativos+= numerosNegativos[i];
            }
        }
        //Hacer la media y enseñar
        System.out.println("la mdeia de los positivos es "+sumapositivos/contadorPositivos);
        System.out.println("la media de los negativos es "+sumanegativos/contadorNegativos);
        System.out.println("los ceros son "+contadorCeros);

    }

    public static void ejercicio4(Scanner sc) {

    }

    public static void ejercicio5(Scanner sc) {

    }

    public static void ejercicio6(Scanner sc) {

    }

    public static void ejercicio7(Scanner sc) {

    }

    public static void ejercicio8(Scanner sc) {

    }

    public static void ejercicio9(Scanner sc) {

    }

    public static void ejercicio10(Scanner sc) {

    }

    public static void ejercicio11(Scanner sc) {

    }

    public static void ejercicio12(Scanner sc) {

    }

    public static void ejercicio13(Scanner sc) {

    }

    public static void ejercicio14(Scanner sc) {

    }

    public static void ejercicio15(Scanner sc) {

    }

    public static void ejercicio16(Scanner sc) {

    }

    public static void ejercicio17(Scanner sc) {

    }
}
