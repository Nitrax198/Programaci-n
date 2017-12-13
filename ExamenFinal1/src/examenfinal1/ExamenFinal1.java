/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinal1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author daw
 */
public class ExamenFinal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
            // TODO code application logic here

        }
    }

    public static void ejercicio1(Scanner sc) {
        //declarar variables
        int contador1, contador2;
        contador1 = 0;
        contador2 = 0;
        int tamañoPosiciones, tamañoBaraja;
        tamañoBaraja = 40;
        tamañoPosiciones = 10;
        //declarar arrays
        int baraja1[] = new int[40];
        int baraja2[] = new int[40];
        int posiciones1[] = new int[10];
        int posiciones2[] = new int[10];
        //rellenar array
        rellenarBarajas(baraja1, baraja2);
        //barajamos ambas barajas
        barajarArray(baraja1);
        barajarArray(baraja2);
        barajarArray(baraja2);
        //recorrer array guardando las posiciones del ultimo numero
        for (int i = 1; i <= 10; i++) {
            //recorrer el array sumando las posiciones da cada carta de uno en uno
            for (int j = 0; j < baraja1.length; j++) {
                if (baraja1[j] == i) {
                    posiciones1[i - 1] += j;

                }
                if (baraja2[j] == i) {
                    posiciones2[i - 1] += j;

                }
            }
        }
        for (int i = 0; i < 10; i++) {
            if (baraja1[i] > baraja2[i]) {
                contador1++;
            } else if (baraja2[i] > baraja1[i]) {
                contador2++;
            } else {
                System.out.println("Habeis empatado");
            }
        }
        //escribir ambos arrays y el total de puntos
        if (contador1 > contador2) {
            System.out.println("Ha ganado el jugador 1 con " + contador1 + " puntos");
        } else if (contador2 > contador1) {
            System.out.println("Ha ganado el jugador 2 con " + contador2 + " puntos");
        } else {
            System.out.println("Habeis empatado");
        }
        ImprimirArray(posiciones2, tamañoPosiciones);

        ImprimirArray(posiciones1, tamañoPosiciones);
    }

    public static void ejercicio2(Scanner sc) {
        //declarar variables
        boolean comprobacion = true;
        //declarar arrays
        int array[] = new int[10];
        //rellenar arrays
        rellenarArrays(array);
        //comprobar que estan de izquierad a derecha primero los negativos y luego los positivos
        comprobarArrays(comprobacion, array);
        //encriptar el array
        if (comprobacion == true) {
            encriptarArrays(array);
            for (int i = 0; i < 10; i++) {
                System.out.print(array[i] + " ");
            }
        }
        //desencriptar el array
        desencriptarArrays(array);
    }

    public static void ImprimirArray(int[] array, int tamaño) {
        for (int i = 0; i < tamaño; i++) {
            System.out.print(array[i] + "-");
        }
        System.out.println("");
    }

    public static void barajarArray(int[] array) {
        Random generadorNumerosAleatorios = new Random();
        int posicion;
        int posicion2;
        int swap;

        for (int i = 0; i < 400; i++) {
            posicion = generadorNumerosAleatorios.nextInt(array.length);
            posicion2 = generadorNumerosAleatorios.nextInt(array.length);
            swap = array[posicion];
            array[posicion] = array[posicion2];
            array[posicion2] = swap;
        }
    }

    public static void rellenarBarajas(int[] array, int[] array2) {
        int contadorCreacion = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                array[contadorCreacion] = j + 1;
                array2[contadorCreacion] = j + 1;
                contadorCreacion++;
            }
        }
    }

    public static void rellenarArrays(int[] array) {
        int contadorCreacion = 0;
        for (int j = -5; j < 6; j++) {
            if (j != 0) {
                array[contadorCreacion] = j;
                contadorCreacion++;
            }
        }
    }

    public static boolean comprobarArrays(boolean comprobar, int[] array) {
        boolean ordenados = true;
        boolean negativos = false;
        for (int i = 0; i < 10; i++) {
            if (array[i] < 0) {
                negativos = true;
            }
        }
        for (int i = 0; i < 9; i++) {
            if (array[i] > array[i + 1]) {
                ordenados = false;
            }
        }
        if (ordenados == true && negativos == true) {
            comprobar = true;
        } else {
            comprobar = false;
        }
        return comprobar;
    }

    public static void encriptarArrays(int[] array) {
        int numerosNegativos, numeroDeVecesRestantes, contadorPositivos, contadorNegativos, guardarNumero, contadorArrayPrincipal;
        numerosNegativos = 0;
        contadorArrayPrincipal = 0;
        contadorPositivos = 0;
        for (int i = 0; i < 10; i++) {
            if (array[i] < 0) {
                numerosNegativos++;
            }
        }
        contadorNegativos = numerosNegativos - 1;
        int arrayNegativos[] = new int[numerosNegativos];
        numeroDeVecesRestantes = 10 - numerosNegativos;
        int arrayPositivos[] = new int[numeroDeVecesRestantes];
        for (int i = 0; i < arrayNegativos.length; i++) {
            arrayNegativos[i] = array[i] * -1;
        }
        for (int i = 0; i < numeroDeVecesRestantes; i++) {
            arrayPositivos[i] = array[numerosNegativos];
            numerosNegativos++;
        }
        //vamos comparando ambos arrays y guardando en el tercero los valores
        for (int i = 0; contadorNegativos > 0 && contadorPositivos < arrayPositivos.length; i++) {
            if (arrayNegativos[contadorNegativos] > arrayPositivos[contadorPositivos]) {
                array[contadorArrayPrincipal] = arrayPositivos[contadorPositivos];
                contadorPositivos++;
                contadorArrayPrincipal++;
            } else if (arrayNegativos[contadorNegativos] < arrayPositivos[contadorPositivos]) {
                array[contadorArrayPrincipal] = arrayNegativos[contadorNegativos] * -1;
                contadorNegativos--;
                contadorArrayPrincipal++;
            } else {
                array[contadorArrayPrincipal] = arrayNegativos[contadorNegativos] * -1;
                contadorNegativos--;
                contadorArrayPrincipal++;
                array[contadorArrayPrincipal] = arrayPositivos[contadorPositivos];
                contadorPositivos++;
                contadorArrayPrincipal++;
            }
        }
        for (int i = 0; i < 10 - contadorPositivos + contadorNegativos; i++) {
            if (contadorPositivos == arrayPositivos.length) {
                array[contadorArrayPrincipal] = arrayNegativos[contadorNegativos] * -1;
            } else if (contadorNegativos == 0) {
                array[contadorArrayPrincipal] = arrayPositivos[contadorPositivos];
            }
        }
        array[8] *= -1;
    }

    public static void desencriptarArrays(int[] array) {
        int contadorPositivos, contadorNegativos, contadorPositivos2;
        contadorPositivos = 0;
        contadorPositivos2 = 0;
        for (int i = 0; i < 10; i++) {
            if (array[i] > 0) {
                contadorPositivos++;
            }
        }
        contadorNegativos = 10 - contadorPositivos;
        int arrayNegativos[] = new int[contadorNegativos];
        int arrayPositivos[] = new int[contadorPositivos];
        for (int i = 9; i >= 0; i--) {
            if (array[i] > 0) {
                arrayPositivos[contadorPositivos - 1] = array[i];
                contadorPositivos--;
                contadorPositivos2++;
            } else if (array[i] < 0) {
                arrayNegativos[contadorNegativos - 1] = array[i];
                contadorNegativos--;
            }
        }
        for (int i = array.length; i >= contadorPositivos2; i++) {
            array[i-1] = arrayPositivos[contadorPositivos2-1];
        }
        for (int i = 10 - array.length; i > 0; i++) {
            array[i] = arrayNegativos[10 - contadorPositivos2];
        }
    }
}
