/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexamencasa;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author daw
 */
public class JavaExamenCasa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ejercicios 1,2,3,4,5,6");
        int ejercicio = sc.nextInt();
        switch (ejercicio) {
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
            default:
                System.out.println("No hay mas ejercicios");
        }
    }

    public static void ejercicio1(Scanner sc) {
        //declarar variables
        int contadorArray2, contadorArray3;
        contadorArray3 = 0;
        contadorArray2 = 0;
        //declarar dos Arrays
        int array1[] = new int[10];
        int array2[] = new int[10];
        //rellenar los dos Arrays
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Escribe cuantas veces quieres que se repita un numero en casa posición");
            array2[i] = sc.nextInt();
            array1[i] = i + 1;
        }
        //contar cuantos numero va a haber para el tercer array
        for (int i = 0; i < array2.length; i++) {
            contadorArray2 += array2[i];
        }
        System.out.println("El tercer array va ha tener " + contadorArray2 + " posiciones");
        //declarar el tercer Array teniendo en cuenta el contador
        int array3[] = new int[contadorArray2];
        //rellenar teniendo en cuenta los valores del segundo array
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < array2[i]; j++) {
                array3[contadorArray3] = array1[i];
                contadorArray3++;
            }
        }
        //Mostrar array 3
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }
    }

    public static void ejercicio2(Scanner sc) {
        //declarar variables
        int suma, contador;
        contador = 1;
        suma = 0;
        //declarar Array de 15 posiciones
        int array[] = new int[15];
        //llenarlo con 10 numeros
        for (int i = 0; i < 10; i++) {
            array[i] = i + 1;
        }
        //recorrerlos de dos en dos
        for (int i = 0; i < array.length; i++) {
            suma = array[i] + array[i + 1];
            for (int j = 14; j > contador; j--) {
                array[j] = array[j - 1];
            }
            contador = contador + 3;
            array[i + 2] = suma;
            i = i + 2;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("El array con las sumas es: " + array[i]);
        }
        //desplazar todos los numeros dos posicones
        //sumar los numeros de dos en dos y poner en la siguente posición las uma
    }

    public static void ejercicio3(Scanner sc) {
        //definir variables
        int contadorCartas, contadorPosiciones;
        contadorPosiciones = 0;
        contadorCartas = 0;
        //definir arrays
        int array[] = new int[10];
        int baraja[] = new int[40];
        // rellenar array
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 11; j++) {
                baraja[contadorCartas] = j;
                contadorCartas++;
            }
        }
        //barajar
        barajarArray(baraja);
        //recorrer array buscando los primeros numeros
        for (int i = 39; i > 0; i--) {
            if (baraja[contadorPosiciones] >= 1 && baraja[contadorPosiciones] <= 10) {
                array[baraja[contadorPosiciones] - 1] = i;
                contadorPosiciones++;
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(array[i]);
        }
    }

    public static void ejercicio4(Scanner sc) {
        //declarar variables
        int contador1, contador2, contador3, contador0KIllS;
        contador1 = 0;
        contador2 = 0;
        contador3 = 0;
        contador0KIllS = 0;
        //hacer dos array con 10 numeros que esten ordenados crecientemente
        int[] tabla1 = new int[10];
        int[] tabla2 = new int[10];
        int[] tabla3 = new int[10];
        for (int i = 0; i < 30; i++) {
            tabla1[contador0KIllS] = i + 1;
            tabla2[contador0KIllS] = i + 2;
            tabla3[contador0KIllS] = i + 3;
            i=i+2;
            contador0KIllS++;
        }
        //hacer un tercer array de 20 espacios
        int[] tabla4 = new int[30];
        //introducir de forma ordenadoa los numeros de los dos arrays anteriores en el tercero
        for (int i = 0; i < 28; i++) {
            if (tabla1[contador1] > tabla2[contador2] && tabla1[contador1] > tabla3[contador3]) {
                if (tabla2[contador2] > tabla3[contador3]) {
                    tabla4[i] = tabla3[contador3];
                    contador3++;
                } 
                else {
                    tabla4[i] = tabla2[contador2];
                    contador2++;
                }
            } 
            else if (tabla2[contador2] > tabla1[contador1] && tabla2[contador2] > tabla3[contador3]) {
                if (tabla1[contador1] > tabla3[contador3]) {
                    tabla4[i] = tabla3[contador3];
                    contador3++;
                } 
                else {
                    tabla4[i] = tabla1[contador1];
                    contador1++;
                }
            }
            else if (tabla3[contador3] > tabla1[contador1] && tabla3[contador3] > tabla2[contador2]) {
                if (tabla1[contador1] > tabla2[contador2]) {
                    tabla4[i] = tabla2[contador2];
                    contador2++;
                } 
                else {
                    tabla4[i] = tabla1[contador1];
                    contador1++;
                }
            }
            else{
                System.out.println("Los numeros son iguales");
            }

        }
        if (tabla2[9] > tabla1[9]&&tabla2[9]>tabla3[9]) {
            tabla4[29] = tabla2[9];
        } else if (tabla1[9]>tabla2[9]&&tabla1[9]>tabla3[9]) {
            tabla4[29] = tabla1[9];
        }else if (tabla3[9]>tabla2[9]&&tabla3[9]>tabla1[9]) {
            tabla4[29] = tabla3[9];
        }
        if (tabla2[9] > tabla1[9]&&tabla2[9]>tabla3[9]) {
            if (tabla1[9]>tabla3[9]) {
                tabla4[28] = tabla1[9];
            } else {
                tabla4[28] = tabla3[9];
            }
        } else if (tabla1[9]>tabla2[9]&&tabla1[9]>tabla3[9]) {
            if (tabla2[9]>tabla3[9]) {
                tabla4[28] = tabla2[9];
            } else {
                tabla4[28] = tabla3[9];
            }
        }else if (tabla3[9]>tabla2[9]&&tabla3[9]>tabla1[9]) {
            if (tabla1[9]>tabla2[9]) {
                tabla4[28] = tabla1[9];
            } else {
                tabla4[28] = tabla2[9];
            }
        }

        for (int i = 0; i < 30; i++) {
            System.out.println(tabla4[i]);
        }
    }

    public static void ejercicio5(Scanner sc) {

    }

    public static void ejercicio6(Scanner sc) {

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
