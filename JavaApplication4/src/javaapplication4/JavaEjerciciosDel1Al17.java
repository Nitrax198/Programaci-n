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
            } else if (numerosReales[i] > 0) {
                contadorPositivos++;
            } else if (numerosReales[i] < 0) {
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
            } else if (numerosReales[i] > 0) {
                numerosPositivos[i] = numerosReales[i];
                sumapositivos += numerosPositivos[i];

            } else {
                numerosNegativos[i] = numerosReales[i];
                sumanegativos += numerosNegativos[i];
            }
        }
        //Hacer la media y enseñar
        if (contadorPositivos == 0) {
            System.out.println("No hay positivos");
        } else {
            System.out.println("la media de los positivos es " + sumapositivos / contadorPositivos);
        }
        if (contadorNegativos == 0) {
            System.out.println("No hay negativos");
        } else {
            System.out.println("la media de los negativos es " + sumanegativos / contadorNegativos);
        }
        System.out.println("los ceros son " + contadorCeros);

    }

    public static void ejercicio4(Scanner sc) {
        int numeroFinal;
        numeroFinal = 9;
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Escribe un numero");
            numeros[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[i]);
            System.out.println(numeros[numeroFinal]);
            numeroFinal--;
        }
    }

    public static void ejercicio5(Scanner sc) {
        //definir variables a utilizar
        int contador1, contador2;
        contador2 = 0;
        contador1 = 0;
        // hacer las dos tablas en dos arrays
        int[] tabla1 = new int[10];
        int[] tabla2 = new int[10];
        //leer el teclado para escribir los valores en los Arrays
        for (int i = 0; i < tabla1.length; i++) {
            System.out.println("Escribe un numero para la primera Tabla");
            tabla1[i] = sc.nextInt();
            System.out.println("Escribe un numero para la segunda Tabla");
            tabla2[i] = sc.nextInt();
        }
        // definir un  tercer Array
        int[] tabla3 = new int[20];
        //recorrer los dos arrays en introducir los numeros en un tercero
        for (int i = 0; i < tabla3.length; i++) {
            if (i == 0 && contador1 < 10) {
                tabla3[i] = tabla1[contador1];
                contador1++;
            } else if (i % 2 == 0) {
                tabla3[i] = tabla1[contador1];
                contador1++;
            } else if (i % 2 != 0) {
                tabla3[i] = tabla2[contador2];
                contador2++;
            }
        }
        //mostrar los dos Arrays en el orden: 0A,0B,1A,1B...
        for (int i = 0; i < tabla3.length; i++) {
            System.out.println("Los numeros son" + tabla3[i]);
        }
    }

    public static void ejercicio6(Scanner sc) {
        //definir variables
        int contador1, contador2;
        contador1 = 0;
        contador2 = 0;
        // hacer las dos tablas en dos arrays
        int[] tabla1 = new int[12];
        int[] tabla2 = new int[12];
        //leer el teclado para escribir los valores en los Arrays
        for (int i = 0; i < tabla1.length; i++) {
            System.out.println("Escribe un numero para la primera Tabla");
            tabla1[i] = sc.nextInt();
            System.out.println("Escribe un numero para la segunda Tabla");
            tabla2[i] = sc.nextInt();
        }
        //definir un nuevo Array
        int[]tabla3 = new int[24];
        //introducir los valores de los dos primeros arrays en el tercero de 3 en 3
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                tabla3[j]=tabla1[j];
            }
            for (int j = 0; j < 3; j++) {
                
            }
        }
       
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
