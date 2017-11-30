/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexamencasa;

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

    }

    public static void ejercicio3(Scanner sc) {

    }

    public static void ejercicio4(Scanner sc) {

    }

    public static void ejercicio5(Scanner sc) {

    }

    public static void ejercicio6(Scanner sc) {

    }

}
