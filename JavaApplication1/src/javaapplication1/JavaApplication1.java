/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author daw
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
        // primer sumando
        int sumando1;
        System.out.println("Escribe un numero");
        sumando1= sc.nextInt();
        //segundo sumando
        System.out.println("Escribe un segundo numero");
        int sumando2;
        sumando2= sc.nextInt();
        //la suma
        int resultado=sumando1+sumando2;
        //imprimir el resultado
        
        System.out.println("el resultado de la suma es "+resultado);
        System.out.println(sumando1+"+"+sumando2+"="+resultado);
        
        
        
        
        
    }
    
}
