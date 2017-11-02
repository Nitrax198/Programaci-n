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
        int numero,valores;
        System.out.println("Escribe un numero");
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();
        int[] numeros = new int [numero];
        //poner un valor en cada numero del Array
        for (int i = 0; i < numero; i++) {
            System.out.println("Escribe un numero");
            valores = sc.nextInt();
            numeros [i] = valores;
        }
        //Mirar numeros pares e impares del array
        //hacer media de pares e impares
    }  
}
