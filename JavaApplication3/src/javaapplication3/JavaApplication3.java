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
        suma = 0;
        for (int i = 0; i < 15; i++) {
            System.out.println("Escribe un numero");
            num = sc.nextInt();
            suma += num;
        }
        System.out.println("media, " + suma / 15);
    }

    public static void ejercicio4(Scanner sc) {
        //escribir cuantos valores hay que escribir
        double NumeroDeValores, Suma, Valor;
        Suma = 0;
        System.out.println("Escribe cuantos valores quieres introducir");
        NumeroDeValores = sc.nextInt();
        //Escribir los valores y leer teclado
        for (int i = 0; i < NumeroDeValores; i++) {
            System.out.println("Escribe un numero");
            Valor = sc.nextInt();
            Suma += Valor;
        }
        //Hacer la media y enseñarla
        System.out.println("La media es, " + (Suma / NumeroDeValores));
    }

    public static void ejercicio5(Scanner sc) {
        int Horas, Min, seg, Horas2, Min2, suma;
        //Escribir las horas , minutos y segundos que sumar
        System.out.println("Escribe las horas");
        Horas = sc.nextInt();
        System.out.println("Escribe los minutos");
        Min = sc.nextInt();
        System.out.println("Escribe los segundos");
        seg = sc.nextInt();
        //Transformar todo a segundos
        Horas2 = Horas * 3600;
        Min2 = Min * 60;
        //sumar y mostrar en pantalla
        suma = Horas2 + Min2 + seg;
        System.out.println("los segundos totales son: " + suma);
    }

    public static void ejercicio6(Scanner sc) {
        int SegundosIniciales, SegundosRestantes, Horas, Minutos, SegundosFinales;
        //pedir numero
        System.out.println("Escribe un numero");
        SegundosIniciales = sc.nextInt();
        Horas = SegundosIniciales / 3600;
        SegundosRestantes = SegundosIniciales - (Horas * 3600);
        Minutos = SegundosRestantes / 60;
        SegundosFinales = SegundosRestantes - (Minutos * 60);
        System.out.println("Las horas, minutos y segundos son" + Horas + " " + Minutos + " " + SegundosFinales);
        //calcular horas minutos y segundos

        //mostrar resultado
    }

    public static void ejercicio7(Scanner sc) {
        int numero, Maximo = 0, Minimo = 0;
        //solicitar numeros(for)y comparar numeros(if)
        for (int i = 0; i < 10; i++) {
            System.out.println("Escribe un numero");
            numero = sc.nextInt();
            System.out.println("Numero" + numero);
            if (i == 0) {
                Maximo = numero;
                Minimo = numero;
            } else if (numero > Maximo) {
                Maximo = numero;
            } else if (numero < Minimo) {
                Minimo = numero;
            }

        }

        System.out.println("El numero mayor es " + Maximo + " El numero menor es " + Minimo);
        //enseñar resultado
    }

    public static void ejercicio8(Scanner sc) {
        //leer numero,hacer un contador, comparar numeros y sumarlas multiplicaciones
        int numero, factorial;
        factorial = 1;
        System.out.println("Escribe un numero");
        numero = sc.nextInt();

        for (int i = 1; i <= numero; i++) {
            factorial *= i;

        }
        System.out.println("El factorial es " + factorial);
    }

    public static void ejercicio9(Scanner sc) {
        int Numero1, Numero2, Numero3, Mayor, Menor, Medio;
        //pedir 3 numeros
        System.out.println("Escribe 3 numeros");
        Numero1 = sc.nextInt();
        Numero2 = sc.nextInt();
        Numero3 = sc.nextInt();
        //comparar numeros
        if (Numero1 > Numero2 && Numero1 > Numero3) {
            Mayor = Numero1;
            if (Numero2 > Numero3) {
                Medio = Numero2;
                Menor = Numero3;
            } else {
                Medio = Numero3;
                Menor = Numero2;
            }

        } else if (Numero2 > Numero1 && Numero2 > Numero3) {
            Mayor = Numero2;
            if (Numero1 > Numero3) {
                Medio = Numero1;
                Menor = Numero3;
            } else {
                Medio = Numero3;
                Menor = Numero1;
            }
        } else {
            Mayor = Numero3;
            if (Numero2 > Numero1) {
                Medio = Numero2;
                Menor = Numero1;
            } else {
                Medio = Numero1;
                Menor = Numero2;
            }
        }
        System.out.println("Aquí tienes los números ordenados de mayor a menor " + Mayor + ">" + Medio + ">" + Menor + ".");
        //esponer resultado
    }

    public static void ejercicio10(Scanner sc) {
        int nota;
        String mensaje1 = null;
        //pedir nota
        System.out.println("Escribe tu nota");
        nota = sc.nextInt();
        switch (nota) {
            case 1:
                mensaje1 = "uno";
                break;
            case 2:
                mensaje1 = "dos";
                break;
            case 3:
                mensaje1 = "tres";
                break;
            case 4:
                mensaje1 = "cuatro";
                break;
            case 5:
                mensaje1 = "cinco";
                break;
            case 6:
                mensaje1 = "seis";
                break;
            case 7:
                mensaje1 = "siete";
                break;
            case 8:
                mensaje1 = "ocho";
                break;
            case 9:
                mensaje1 = "nueve";
                break;
            case 10:
                mensaje1 = "diez";
            case 0:
                mensaje1 = "cero";
            default:
                mensaje1 = "No te sobres flipao";
        }
        //escribir respuesta
        System.out.println(mensaje1);
        // enseñar nota
    }

    public static void ejercicio11(Scanner sc) {
        // declara las variables
        String mensaje2 = null;
        int notadeclase;
        System.out.println("Escribe tu nota");
        notadeclase = sc.nextInt();
        //compara los numeros
        if (notadeclase < 5) {
            mensaje2 = "insuficiente";
        } else if (notadeclase == 5) {
            mensaje2 = "suficiente";
        } else if (notadeclase == 6) {
            mensaje2 = "Bien";
        } else if (notadeclase < 9 && notadeclase > 6) {
            mensaje2 = "Notable";
        } else if (notadeclase > 8 && notadeclase < 11) {
            mensaje2 = "Sobresaliente";
        } else {
            mensaje2 = "eres to tonto";
        }
        //escribe el resultado
        System.out.println(mensaje2);
    }

    public static void ejercicio12(Scanner sc) {
        int numeroalumnos, notas, media, suma;
        suma = 0;
        media = 0;
        // declarar variables
        System.out.println("Escribe el numero de alumnos");
        numeroalumnos = sc.nextInt();
        for (int i = 0; i < numeroalumnos; i++) {
            System.out.println("Escribe las notas");
            notas = sc.nextInt();
            if (notas >= 5 && notas < 10) {
                System.out.println("aprobado " + notas);
            } else if (notas < 5 && notas > 0) {
                System.out.println("Suspenso " + notas);
            } else {
                System.out.println("Esa nota no existe " + notas);
            }
            suma += notas;
            media = suma / numeroalumnos;
        }
        System.out.println("La media es " + media);
        // pedir numero de alumnos y notas

        //comparar notas
        //calcular media
        //escribir aprovados, suspensos y meida
    }

    public static void ejercicio13(Scanner sc) {
        int primo;
        boolean resto;
        int a;
        System.out.println("Escribe un numero");
        primo = sc.nextInt();
        for ( a = 2; a <= primo; a++) {
            resto = true;
            for (int i = 2; i <a ; i++) {
                if (a % i == 0) {
                    resto = false;
                }
                
                //introducir variables
                //calcular un numero primo
                //Calcular un numero primo las veces que te pidan
                //Escribir los numeros primos
            }
            if (resto) {
                System.out.println("Primo " + a);
            }
        }
        
    }
}
