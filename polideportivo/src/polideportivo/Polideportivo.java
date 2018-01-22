/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polideportivo;

import actividades.Actividades;
import actividades.Alumnos;
import actividades.Horario;

/**
 *
 * @author daw
 */
public class Polideportivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Array de actividades[3]
        //Array de Alumnos[50)][3]
        // Inicialización 
        // Menú
        Horario horario1 = new Horario("L,X y V", 10,11);
        Horario horario2 = new Horario("L,X y V", 11,12);
        Horario horario3 = new Horario("L,X y V", 19,20);
        Horario horario4 = new Horario("M y J", 9,10);
        Horario horario5 = new Horario("M y J", 10,11);
        Horario horario6 = new Horario("M y J", 18,19);
        Horario horario7 = new Horario("L,X y V", 19,20);
        Horario horario8 = new Horario("M y J", 18,19);
        
        Actividades a1 = new Actividades("Aerobic",35, 47.60f,  horario1/*,new Alumnos ("Hola","hola2")*/);
        Actividades a2 = new Actividades("Aerobic",35, 47.60f,  horario2/*,new Alumnos ("Hola","hola2")*/);
        Actividades a3 = new Actividades("Aerobic",35, 47.60f,  horario3/*,new Alumnos ("Hola","hola2")*/);
        Actividades a4 = new Actividades("Aerobic",35, 35.70f,  horario4/*,new Alumnos ("Hola","hola2")*/);
        Actividades a5 = new Actividades("Aerobic",35, 35.70f,  horario5/*,new Alumnos ("Hola","hola2")*/);
        Actividades a6 = new Actividades("Aerobic",35, 35.70f,  horario6/*,new Alumnos ("Hola","hola2")*/);
        Actividades a7 = new Actividades("ArgtesMarciales",15, 45.00f,  horario7/*,new Alumnos ("Hola","hola2")*/);
        Actividades a8 = new Actividades("ArgtesMarciales",15, 34.00f,  horario8/*,new Alumnos ("Hola","hola2")*/);
        
        Alumnos[]alumnos = new Alumnos[50];
        Actividades[] actividades = new Actividades[11];
          
         actividades[0]=a1;
         actividades[1]=a2;
         actividades[2]=a3;
         actividades[3]=a4;
         actividades[4]=a5;
         actividades[5]=a6;
         actividades[6]=a7;
         actividades[7]=a8;
         
         actividades[8]= new Actividades("ArgtesMarciales",15, 34.00f,new Horario("M y J", 19,20));
         actividades[9]= new Actividades("Natacion",35, 47.60f,new Horario("L,X y V", 18,19));
         actividades[10]= new Actividades("Natacion",35, 35.70f,new Horario("M y J", 17,18));
         
         System.out.println("precio "+actividades[2].getPrecio());
         System.out.println("hora "+actividades[8].getHorario().getHoraFinal());

    }
    
    public static Alumnos darDeAltaAlumno(Alumnos[] alumnos){
    
        
        return null;
}
    public static void darDeBajaAlumno(Alumnos[] alumnos){
    //encontrar alumnos
    
    //Dar de baja de las actividades,aumentar plaza
    
    //reordenar array para no dejar huecos
        
}
    public static int encontrarAlumno(Alumnos[] alumnos,String nombre,String apellido){
    //Recorrer array de alumnos buscando nombre y apellidos
    //alumnos[i].getnombre().equals(nombre) && 
    //alumnos[i].getApellidos().equals(apellidos)
    //Cuando lo encuentre lo devuelve
    
    return 0;
}
    public static void matricularAlumnos(Alumnos[]alumnos ){
        //pedir alumnos
        
        //encontrarle en el array
        
        //encontrar actividad
        
        //quitar plaza
        
        //aumentar el dinero del alumno
    }
    
}
