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
        //pido numero para el total del array y declaro la variable
        int numero, pares, impares,sumapares, sumaimpares;
        sumapares = 0;
        sumaimpares = 0;
        impares = 0;
        pares = 0;
        System.out.println("Escribe un numero para saber cuantos valores hay");
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();
        int[] numeros = new int[numero];
        //poner un valor en cada numero del Array
        for (int i = 0; i < numero; i++) {
            System.out.println("Escribe un valor");
            numeros[i] = sc.nextInt();
        }
        //Recorrer numeros en busca de pares e impares del array
        for (int b = 0; b < numeros.length; b++) {
            if (numeros[b] % 2 == 0) {
                System.out.println(numeros[b] + "son pares");
                pares++;
            } else {
                System.out.println(numeros[b] + "son impares");
                impares++;
            }
        }
        //crear dos arrays, uno para pares y otro para impares
        int[] numerosimpares = new int[impares];
        int[] numerospares = new int[pares];
        //introducir numeros paraes e impares del primer array en sus respectivos arrays
        for (int a = 0; a < numeros.length; a++) {
            if (numeros[i] % 2 == 0){
                numerospares [a] = numeros[i];
            }
            else {
                numerosimpares[a] = numeros[i];
            }
        }
        for (int j = 0; j < pares; j++) {
            sumapares += numerospares[j];
        }
        for (int c = 0; c < impares; c++) {
            sumaimpares += numerosimpares[a];
        }
        //hacer media de pares e impares por separado
        System.out.println(sumapares/pares);
        System.out.println(sumaimpares/impares);
    }
}
