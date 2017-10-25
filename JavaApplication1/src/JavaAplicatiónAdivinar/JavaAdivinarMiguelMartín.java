/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaAplicatiónAdivinar;

import com.sun.glass.ui.SystemClipboard;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author daw
 */
public class JavaAdivinarMiguelMartín {
    
    
    
    
    
    public static void main(String[] args) {
        //elegir numero aleatorio55
        Random generadorNumerosAleatorios = new Random();
        int RangoMax;
        int RangoMin;
        int contador= 0;
        int num;
        int Intentos;
        System.out.println("Escribe un número Maximo");
        Scanner ScRMa = new Scanner (System.in);
        RangoMax = ScRMa.nextInt();
        System.out.println("Escribe un número Minimo");
        Scanner ScRMi = new Scanner (System.in);
        RangoMin = ScRMi.nextInt();
        System.out.println("Escrime un numero para tus intentos");
        Scanner ScI = new Scanner (System.in);
        Intentos = ScI.nextInt();
        
        
        int aleatorio = generadorNumerosAleatorios.nextInt(RangoMax-RangoMin+1)+RangoMin ;
        
        do {
            contador++;
            //pedir numero al usuario 
            System.out.println("escribe un numero");
            Scanner sc = new Scanner (System.in);
            num = sc.nextInt();       
            //comprobar si es igual, mayor o menor
            String mensaje = "";
            if (num == aleatorio) {
                mensaje = "ok acertaste " + (Intentos-contador);
            } else if (num > aleatorio) {
                mensaje = "Has puesto un numero Mayor, te quedan  " + (Intentos-contador) + " intentos";
            } else if (num < aleatorio) {
                mensaje = "has puesto un numero Menor, te quedan  " + (Intentos-contador) + " intentos";
            }
            //sacar por pantalla lo que pasa
            System.out.println(mensaje);
        } while ((contador != Intentos)
                &&
                (num != aleatorio));
            if (contador == Intentos){
                System.out.println("Game Over");
            }
            else {
                System.out.println("You Win");
            }
    }
 
 
        // volver a pedir numero si no esta bien, ir arriba
    

}