/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuerpoDeElite;

import clases.Mision;
import clases.RecursoHumano;
import clases.RecursoMaterial;
import clases.RecursoMilitar;
import clases.RecursoVehiculo;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Funcionalidad {

    Scanner sc = new Scanner(System.in);
    private ArrayList<RecursoMilitar> recursos;
    private Map<Integer, Mision> misiones;

    public Funcionalidad() {
        this.misiones = new LinkedHashMap<>();
        this.recursos = new ArrayList<>();
        recursos.add(new RecursoHumano(5, 30, 5, 20, 10, "Jake"));
        recursos.add(new RecursoHumano(10, 40, 15, 30, 20, "Charlie"));
        recursos.add(new RecursoHumano(1, 10, 0, 20, 5, "Novato"));
        recursos.add(new RecursoMaterial(10, 30, 10, "AKA"));
        recursos.add(new RecursoMaterial(20, 60, 50, "lanzaCohetes"));
        recursos.add(new RecursoMaterial(5, 10, 60, "LaSantaGranadaDeAntioquia"));
        recursos.add(new RecursoVehiculo(6, 20, 0, 30, "Batmovil"));
        recursos.add(new RecursoVehiculo(4, 10, 50, 40, "tanque"));
        recursos.add(new RecursoVehiculo(2, 5, 10, 20, "Batmovil"));
    }

    public void crearMision() {
        int dia, mes, año, exp, id, opcion;
        String lugar;
        System.out.println("Dime el dia de la misión");
        dia = sc.nextInt();
        sc.nextLine();
        System.out.println("Dime el mes de la misión");
        mes = sc.nextInt();
        sc.nextLine();
        System.out.println("Dime el año de la misión");
        año = sc.nextInt();
        sc.nextLine();
        LocalDate fecha = LocalDate.of(año, mes, dia);
        System.out.println(" dime el lugar de la mision");
        lugar = sc.nextLine();
        System.out.println(" dime la experiencia de esta misión");
        exp = sc.nextInt();
        System.out.println(" dime el codigo de esta misión");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Que tipo de mision es: 1 Misión de Reconocimiento 0 Misión de Combate");
        opcion = sc.nextInt();
        sc.nextLine();
        switch (opcion) {
            case 1:

                break;
            case 2:

                break;
            default:
                System.out.println("No hay misiones de escolta");
                break;
        }
    }

    public void GenerarMisioReconocimiento(int id) {
        int opcion, confirmar, posicionRecurso ;
        posicionRecurso = -1;
        confirmar = -1;
        boolean estresado = false;
        boolean conVehiculo = false;
        boolean capacidad = false;
//        boolean asignado = false;
        for (int i = 0; i < recursos.size(); i++) {
            if (recursos.get(i) instanceof RecursoHumano) {
                if (((RecursoHumano) recursos.get(i)).getNivelStress()>20) {
                    estresado=true;
                }
            }
        }
        System.out.println("Que tipo de recurso quieres 1 material 2 vehiculo 3 humano");
        opcion = sc.nextInt();
        sc.nextLine();
        switch(opcion){
            case 1: 
                for (int i = 0; i < recursos.size()&& confirmar != 1; i++) {
                    if (recursos.get(i) instanceof RecursoMaterial) {
                        System.out.println(recursos.get(i).toString());
                        System.out.println("¿este? 1 si 0 no");
                        confirmar = sc.nextInt();
                        sc.nextLine();
                        posicionRecurso = i;
                    }
                }
                break;
            case 2:
                for (int i = 0; i < recursos.size()&& confirmar != 1; i++) {
                    if (recursos.get(i) instanceof RecursoVehiculo) {
                        System.out.println(recursos.get(i).toString());
                        System.out.println("¿este? 1 si 0 no");
                        confirmar = sc.nextInt();
                        sc.nextLine();
                        posicionRecurso = i;
                    }
                }
                break;
            case 3:
                for (int i = 0; i < recursos.size()&& confirmar != 1; i++) {
                    if (recursos.get(i) instanceof RecursoHumano) {
                        System.out.println(recursos.get(i).toString());
                        System.out.println("¿este? 1 si 0 no");
                        confirmar = sc.nextInt();
                        sc.nextLine();
                        posicionRecurso = i;
                    }
                }
                break;
            default:
                System.out.println("ese recurso no existe");
                break;
        }
        
    }
}
