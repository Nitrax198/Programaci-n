/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polideportivo;

import actividades.Actividades;
import actividades.Alumnos;
import actividades.Horario;
import java.util.Scanner;

/**
 *
 * @author daw
 */
public class Polideportivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numAlumnos = 0;
        // TODO code application logic here
        //Array de actividades[3]
        //Array de Alumnos[50)][3]
        // Inicialización 
        // Menú
        Horario horario1 = new Horario("L,X y V", 10, 11);
        Horario horario2 = new Horario("L,X y V", 11, 12);
        Horario horario3 = new Horario("L,X y V", 19, 20);
        Horario horario4 = new Horario("M y J", 9, 10);
        Horario horario5 = new Horario("M y J", 10, 11);
        Horario horario6 = new Horario("M y J", 18, 19);
        Horario horario7 = new Horario("L,X y V", 19, 20);
        Horario horario8 = new Horario("M y J", 18, 19);

        Actividades a1 = new Actividades("Aerobic", 35, 47.60f, horario1/*,new Alumnos ("Hola","hola2")*/);
        Actividades a2 = new Actividades("Aerobic", 35, 47.60f, horario2/*,new Alumnos ("Hola","hola2")*/);
        Actividades a3 = new Actividades("Aerobic", 35, 47.60f, horario3/*,new Alumnos ("Hola","hola2")*/);
        Actividades a4 = new Actividades("Aerobic", 35, 35.70f, horario4/*,new Alumnos ("Hola","hola2")*/);
        Actividades a5 = new Actividades("Aerobic", 35, 35.70f, horario5/*,new Alumnos ("Hola","hola2")*/);
        Actividades a6 = new Actividades("Aerobic", 35, 35.70f, horario6/*,new Alumnos ("Hola","hola2")*/);
        Actividades a7 = new Actividades("ArgtesMarciales", 15, 45.00f, horario7/*,new Alumnos ("Hola","hola2")*/);
        Actividades a8 = new Actividades("ArgtesMarciales", 15, 34.00f, horario8/*,new Alumnos ("Hola","hola2")*/);

        Alumnos[] alumnos = new Alumnos[50];
        Actividades[] actividades = new Actividades[11];

        actividades[0] = a1;
        actividades[1] = a2;
        actividades[2] = a3;
        actividades[3] = a4;
        actividades[4] = a5;
        actividades[5] = a6;
        actividades[6] = a7;
        actividades[7] = a8;

        actividades[8] = new Actividades("ArgtesMarciales", 15, 34.00f, new Horario("M y J", 19, 20));
        actividades[9] = new Actividades("Natacion", 35, 47.60f, new Horario("L,X y V", 18, 19));
        actividades[10] = new Actividades("Natacion", 35, 35.70f, new Horario("M y J", 17, 18));

        System.out.println("precio " + actividades[2].getPrecio());
        System.out.println("hora " + actividades[8].getHorario().getHoraFinal());
        System.out.println("actividad 1  " + actividades[1]);

        Scanner sc = new Scanner(System.in);
        System.out.println("Elije el numero de ejercicio del 1 al 7, los enunciados son:\n"
                + "1. Dar Alta. \n"
                + "2. Baja Alumno \n"
                + "3. Matricular Alumno \n"
                + "4. Recibo Alumno \n"
                + "5. Recibo Actividad \n"
                + "6. Imprimir Alumnos \n"
                + "7. Imprimir Actividades \n");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                alumnos[numAlumnos] = darDeAltaAlumno(alumnos,sc);
                numAlumnos++;
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            default:
                System.out.println("opcion no valida");
        }

    }

    public static Alumnos darDeAltaAlumno(Alumnos[] alumnos,Scanner sc) {
        // pedir nombre y apellidos por teclado
        
        System.out.println("Por Favor, Introduzca el nombre y el primer apellido del alumno a matricular");
       Alumnos nombreYApellido = new Alumnos(sc.nextLine(),sc.nextLine());
        //crear el alumno
        
        //devolver alumno
        return nombreYApellido;
    }

    public static void darDeBajaAlumno(Alumnos[] alumnos,Scanner sc,int numAlumnos) {
        //encontrar alumnos
        int posicionDelAlumno,encontrado;
        posicionDelAlumno = encontrarAlumno(alumnos, sc, numAlumnos);
        //Dar de baja de las actividades,aumentar plaza
        alumnos[posicionDelAlumno]= alumnos[numAlumnos-1];
        alumnos[numAlumnos-1]= null;
        numAlumnos--;
        //reordenar array para no dejar huecos
    }

    public static int encontrarAlumno(Alumnos[] alumnos,Scanner sc,int numAlumnos) {
        int posicionDelAlumno;
        posicionDelAlumno= -1;
        Alumnos a;
        
        //Recorrer array de alumnos buscando nombre y apellidos
        System.out.println("Por favor, escriba el nombre y el primer apellido del alumnos matriculadoq ue se quiera daar de baja");
        a = new Alumnos(sc.nextLine(),sc.nextLine());
        for (int i = 0; i < numAlumnos && posicionDelAlumno==-1 ; i++) {
            if (alumnos[i].equals(a)) {
                posicionDelAlumno=i;
            }
        }
        //alumnos[i].getnombre().equals(a.getNombre()) && 
        //alumnos[i].getApellidos().equals(apellidos)
        //Cuando lo encuentre lo devuelve

        return posicionDelAlumno;
    }

    public static void matricularAlumnos(Alumnos[] alumnos, Actividades[] actividades) {
        //pedir alumnos
        //encontrarle en el array
        //encontrar actividad
        //quitar plaza
        //aumentar el dinero del alumno
    }
                       
}
