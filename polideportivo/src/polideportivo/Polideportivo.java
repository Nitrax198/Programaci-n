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
        Horario horario2 = new Horario("L,X y V", 10,11);
        Horario horario3 = new Horario("L,X y V", 10,11);
        Horario horario4 = new Horario("L,X y V", 10,11);
        Horario horario5 = new Horario("L,X y V", 10,11);
        Horario horario6 = new Horario("L,X y V", 10,11);
        Horario horario7 = new Horario("L,X y V", 10,11);
        Horario horario8 = new Horario("L,X y V", 10,11);
        
        Actividades a1 = new Actividades("Aerobic",35, 47.60f,  horario1/*,new Alumnos ("Hola","hola2")*/);
        Actividades a2 = new Actividades("Aerobic",35, 47.60f,  horario2/*,new Alumnos ("Hola","hola2")*/);
        Actividades a3 = new Actividades("Aerobic",35, 47.60f,  horario3/*,new Alumnos ("Hola","hola2")*/);
        Actividades a4 = new Actividades("Aerobic",35, 47.60f,  horario4/*,new Alumnos ("Hola","hola2")*/);
        Actividades a5 = new Actividades("Aerobic",35, 47.60f,  horario5/*,new Alumnos ("Hola","hola2")*/);
        Actividades a6 = new Actividades("Aerobic",35, 47.60f,  horario6/*,new Alumnos ("Hola","hola2")*/);
        Actividades a7 = new Actividades("Aerobic",35, 47.60f,  horario7/*,new Alumnos ("Hola","hola2")*/);
        Actividades a8 = new Actividades("Aerobic",35, 47.60f,  horario8/*,new Alumnos ("Hola","hola2")*/);
        
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
         
         actividades[8]= new Actividades("Aerobic",35, 47.60f,new Horario("L,X y V", 10,11));
         actividades[9]= new Actividades("Aerobic",35, 47.60f,new Horario("L,X y V", 10,11));
         actividades[10]= new Actividades("Aerobic",35, 47.60f,new Horario("L,X y V", 10,11));
         
         System.out.println("precio "+actividades[2].getPrecio());
         System.out.println("hora "+actividades[8].getHorario().getHoraFinal());

    }
    
//    public static void rellenarArray(Actividades[]){
//        
//    }
}
