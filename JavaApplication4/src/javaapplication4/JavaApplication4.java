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
        int numero, valores, pares, impares;
        impares = 0;
        pares = 0;
        valores = 0;
        System.out.println("EScribe un numero para saber cuantos valores hay");
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();
        int[] numeros = new int[numero];
        //poner un valor en cada numero del Array
        for (int i = 0; i < numero; i++) {
            System.out.println("Escribe un valor");
            valores = sc.nextInt();
            numeros[i] = valores;
        }
        //Recorrer numeros en busca de pares e impares del array
        for (int i = 0; i < numeros.length; i++) {
            if (valores % 2 == 0) {
                System.out.println(valores + "son pares");
                impares++;
            } else {
                System.out.println(valores + "son impares");
                pares++;
            }
        }
        //crear dos arrays, uno para pares y otro para impares
        int[] numerosimpares = new int[impares];
        int[] numerospares = new int[pares];
        //introducir numeros paraes e impares del primer array en sus respectivos arrays
        for (int i = 0; i < numeros.length; i++) {
            if (valores % 2 == 0){
                numerospares [i] = valores;
            }
            else {
                numerosimpares[i] = valores;
            }
        }
        for (int i = 0; i < pares; i++) {
            
        }
        //hacer media de pares e impares por separado
    }
}
