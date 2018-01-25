/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polideportivo;

import actividades.Actividad;
import actividades.Alumno;
import actividades.Horario;
import java.util.Scanner;

/**
 *
 * @author daw
 */
public class Polideportivo {

    Alumno[] alumnos ;
    Actividad[] actividades ;
    private int numAlumnos = 0;

    public Polideportivo() {
        alumnos = new Alumno[50];
        actividades = new Actividad[11];
         Horario horario1 = new Horario("L,X y V", 10, 11);
        Horario horario2 = new Horario("L,X y V", 11, 12);
        Horario horario3 = new Horario("L,X y V", 19, 20);
        Horario horario4 = new Horario("M y J", 9, 10);
        Horario horario5 = new Horario("M y J", 10, 11);
        Horario horario6 = new Horario("M y J", 18, 19);
        Horario horario7 = new Horario("L,X y V", 19, 20);
        Horario horario8 = new Horario("M y J", 18, 19);

        Actividad a1 = new Actividad("Aerobic", 35, 47.60f, horario1/*,new Alumnos ("Hola","hola2")*/);
        Actividad a2 = new Actividad("Aerobic", 35, 47.60f, horario2/*,new Alumnos ("Hola","hola2")*/);
        Actividad a3 = new Actividad("Aerobic", 35, 47.60f, horario3/*,new Alumnos ("Hola","hola2")*/);
        Actividad a4 = new Actividad("Aerobic", 35, 35.70f, horario4/*,new Alumnos ("Hola","hola2")*/);
        Actividad a5 = new Actividad("Aerobic", 35, 35.70f, horario5/*,new Alumnos ("Hola","hola2")*/);
        Actividad a6 = new Actividad("Aerobic", 35, 35.70f, horario6/*,new Alumnos ("Hola","hola2")*/);
        Actividad a7 = new Actividad("ArgtesMarciales", 15, 45.00f, horario7/*,new Alumnos ("Hola","hola2")*/);
        Actividad a8 = new Actividad("ArgtesMarciales", 15, 34.00f, horario8/*,new Alumnos ("Hola","hola2")*/);

       
        actividades[0] = a1;
        actividades[1] = a2;
        actividades[2] = a3;
        actividades[3] = a4;
        actividades[4] = a5;
        actividades[5] = a6;
        actividades[6] = a7;
        actividades[7] = a8;

        actividades[8] = new Actividad("ArgtesMarciales", 15, 34.00f, new Horario("M y J", 19, 20));
        actividades[9] = new Actividad("Natacion", 35, 47.60f, new Horario("L,X y V", 18, 19));
        actividades[10] = new Actividad("Natacion", 35, 35.70f, new Horario("M y J", 17, 18));

        System.out.println("precio " + actividades[2].getPrecio());
        System.out.println("hora " + actividades[8].getHorario().getHoraFinal());
        System.out.println("actividad 1  " + actividades[1]);

    }
    
    public Alumno darDeAltaAlumno(Scanner sc) {
        // pedir nombre y apellidos por teclado

        System.out.println("Por Favor, Introduzca el nombre y el primer apellido del alumno a matricular");
        Alumno nombreYApellido = new Alumno(sc.nextLine(), sc.nextLine());
        //crear el alumno
        alumnos[numAlumnos] = nombreYApellido;
                numAlumnos++;
        //devolver alumno
        return nombreYApellido;
    }

    public void darDeBajaAlumno( Scanner sc) {
        //encontrar alumnos
        int posicionDelAlumno;
        posicionDelAlumno = encontrarAlumno(sc);
        //Dar de baja de las actividades,aumentar plaza
        alumnos[posicionDelAlumno] = alumnos[numAlumnos - 1];
        alumnos[numAlumnos - 1] = null;
        numAlumnos--;
        //reordenar array para no dejar huecos
    }

    private int encontrarAlumno(Scanner sc) {
        int posicionDelAlumno;
        posicionDelAlumno = -1;
        Alumno a;

        //Recorrer array de alumnos buscando nombre y apellidos
        System.out.println("Por favor, escriba el nombre y el primer apellido del alumnos matriculadoq ue se quiera daar de baja");
        a = new Alumno(sc.nextLine(), sc.nextLine());
        for (int i = 0; i < numAlumnos && posicionDelAlumno == -1; i++) {
            if (alumnos[i].equals(a)) {
                posicionDelAlumno = i;
            }
        }
        //alumnos[i].getnombre().equals(a.getNombre()) && 
        //alumnos[i].getApellidos().equals(apellidos)
        //Cuando lo encuentre lo devuelve

        return posicionDelAlumno;
    }

    public void matricularAlumnos(Scanner sc) {
        int posicionAlumno,posicionActividad;
        posicionAlumno = encontrarAlumno(sc);
        //pedir alumnos
        for (int i = 0; i < this.actividades.length; i++) {
            System.out.println(actividades[i].toString());
        }
        System.out.println("Escribe la actividad en la que quieres matricular al alumno");
        posicionActividad = sc.nextInt();
                         sc.nextLine();
                         
        actividades[posicionActividad].setPlazasLibres(actividades[posicionActividad].getPlazasLibres()-1);
                         
        alumnos[posicionAlumno].setPagaAlMes(alumnos[posicionAlumno].getPagaAlMes()+actividades[posicionActividad].getPrecio());
        //encontrarle en el array
        //encontrar actividad
        //quitar plaza
        //aumentar el dinero del alumno
        
    }

}
