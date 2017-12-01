/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examensorplresa;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author daw
 */
public class JavaExamenSorplresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ejercicio 1,2");
        int ejercicio = sc.nextInt();
        switch (ejercicio) {
            case 1:
                ejercicio1(sc);
                break;
            case 2:
                ejercicio2(sc);
                break;
            default:
                System.out.println("No hay mas ejercicios");
        }

    }

    public static void ejercicio1(Scanner sc) {
        //declarar e inicializar variables
        int contadorCartas, contadorBaraja1, contadorBaraja2;
        contadorCartas = 0;
        contadorBaraja2 = 0;
        contadorBaraja1 = 0;
        //declarar las dos barajas como arrays
        int baraja1[] = new int[40];
        int baraja2[] = new int[40];
        //llenar las dos barajas
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 11; j++) {
                baraja1[contadorCartas] = j;
                baraja2[contadorCartas] = j;
                contadorCartas++;
            }
        }
        //barajar ambas barajas
        barajarArray(baraja1);
        barajarArray(baraja2);
        barajarArray(baraja2);
        //definir un tercer array
        int arrayPosicionesBaraja1[] = new int[10];
        int arrayPosicionesBaraja2[] = new int[10];
        int arrayPosicionesFinal[] = new int[10];
        //recorrer ambos arrays y comparar las posiciones , guardar la mas baja en cada caso
        for (int i = 39; i > 0; i--) {
            if (baraja1[contadorBaraja1] >= 1 && baraja1[contadorBaraja1] <= 10) {
                arrayPosicionesBaraja1[baraja1[contadorBaraja1] - 1] = contadorBaraja1;
                contadorBaraja1++;
            }
        }
        for (int i = 39; i > 0; i--) {
            if (baraja2[contadorBaraja2] >= 1 && baraja2[contadorBaraja2] <= 10) {
                arrayPosicionesBaraja2[baraja2[contadorBaraja2] - 1] = contadorBaraja2;
                contadorBaraja2++;
            }
        }
        for (int i = 0; i < 10; i++) {
            if (arrayPosicionesBaraja1[i] > arrayPosicionesBaraja2[i]) {
                arrayPosicionesFinal[i] = arrayPosicionesBaraja2[i];
            } else {
                arrayPosicionesFinal[i] = arrayPosicionesBaraja1[i];
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(arrayPosicionesFinal[i]);
        }
    }

    public static void ejercicio2(Scanner sc) {
        //declarar variables
        int numeroDePosiciones, ladoElegido, NumeroQueCambiar1, NumeroQueCambiar2, contadorPosiciones, contadorArrayPosiciones;
        contadorPosiciones = 0;
        contadorArrayPosiciones = 0;
        //declarar array
        int array[] = new int[10];
        //rellenar array   
        for (int i = 0; i < 10; i++) {
            array[i] = i+1;
        }
        System.out.println("escribe cuantas posciones quieres que cambien los numeros impares");
        numeroDePosiciones = sc.nextInt();
        System.out.println("Y ahora escribe hacia que lado, 1 para derecha y 0 para izquierda");
        ladoElegido = sc.nextInt();
        for (int i = 0; i < 10; i++) {
            if (array[i] % 2 == 0) {
                contadorPosiciones++;
            }
        }

        int arrayPosiciones[] = new int[contadorPosiciones];

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                arrayPosiciones[contadorArrayPosiciones] = i;
                contadorPosiciones++;
            }
        }

        if (ladoElegido == 1) {
            for (int i = 0; i < numeroDePosiciones/2; i++) {
                NumeroQueCambiar1 = array[arrayPosiciones[i + 1]];
                array[arrayPosiciones[i + 1]] =array[arrayPosiciones[i]];
                NumeroQueCambiar2 = array[arrayPosiciones[i + 2]];
                array[arrayPosiciones[i + 2]] =array[arrayPosiciones[i+1]];
            }
        } 
        else {
            for (int i = numeroDePosiciones+1; i > (numeroDePosiciones/2)-1; i--) {
                NumeroQueCambiar1 = array[arrayPosiciones[i + 1]];
                array[arrayPosiciones[i + 1]] =array[arrayPosiciones[i]];
                NumeroQueCambiar2 = array[arrayPosiciones[i + 2]];
                array[arrayPosiciones[i + 2]] =array[arrayPosiciones[i+1]];
            }
                }
        for (int i = 0; i < 10; i++) {
            System.out.println(array[i]);
        }

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
