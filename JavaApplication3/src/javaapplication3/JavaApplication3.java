/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author daw
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("opciones1,2,3,4,5,6,7,8,9,10,11,12,13");
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
            default:
                System.out.println("No hay mas ejercicios");
        }
    }

    public static void ejercicio1(Scanner sc) {

        //pedir dos numeros
        int numero1, numero2;

        System.out.print("Escribe el primer numero: ");
        numero1 = sc.nextInt();
        System.out.print("Escribe un segundo número: ");
        numero2 = sc.nextInt();
        System.out.println("\n");
        if (numero1 >= numero2) {
            System.out.println("eres to tonto");
        } else {

            for (int i = numero1; i <= numero2; i++) {
                System.out.print("numero " + i + ", ");
            }
        }
    }

    public static void ejercicio2(Scanner sc) {
        for (int i = 5; i <= 100; i += 5) {
            System.out.println("numero" + i + ", ");

        }

    }

    public static void ejercicio3(Scanner sc) {
        int num, suma, media;
        suma=0;
        for (int i = 0; i < 15; i++) {
            System.out.println("Escribe un numero");
            num = sc.nextInt();
            suma += num;
        }

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
}
