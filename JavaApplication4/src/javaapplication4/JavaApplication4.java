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
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //pido numeroN para el total del array y declaro la variable
        int numeroN, pares, impares,sumapares, sumaimpares;
        sumapares = 0;
        sumaimpares = 0;
        impares = 0;
        pares = 0;
        System.out.println("Escribe un numero para saber cuantos valores hay");
        Scanner sc = new Scanner(System.in);
        numeroN = sc.nextInt();
        int[] numeros = new int[numeroN];
        //poner un valor en cada numeroN del Array
        for (int i = 0; i < numeroN; i++) {
            System.out.println("Escribe un valor");
            numeros[i] = sc.nextInt();
        }
        //Recorrer numeros en busca de pares e impares del array
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i] + "son pares");
                pares++;
            } else {
                System.out.println(numeros[i] + "son impares");
                impares++;
            }
        }
        //crear dos arrays, uno para pares y otro para impares
        int[] numerosimpares = new int[impares];
        int[] numerospares = new int[pares];
        //introducir numeros paraes e impares del primer array en sus respectivos arrays
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0){
                numerospares [pares] = numeros[i];
            }
            else {
                numerosimpares[impares] = numeros[i];
            }
        }
        for (int i = 0; i < pares; i++) {
            sumapares += numerospares[pares];
        }
        for (int i = 0; i < impares; i++) {
            sumaimpares += numerosimpares[impares];
        }
        //hacer media de pares e impares por separado
        System.out.println(sumapares/pares);
        System.out.println(sumaimpares/impares);
    }
}
