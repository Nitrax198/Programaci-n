/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Funcionalidad.Calculadora;
import java.util.Scanner;

/**
 *
 * @author daw
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Calculadora cal = new Calculadora(10,2,0);
        System.out.println("La suma es: "+cal.sumar());
        System.out.println("Escribe dos numeros");
        cal.setOp1(sc.nextInt());
        cal.setOp2(sc.nextInt());
        System.out.println("La suma es: "+cal.sumar());
        System.out.println("La resta es: "+cal.restar());
        System.out.println("La resta es: "+cal.restarMayor());
    }

}
