/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuerpoDeElite;

import clases.Mision;
import clases.MisionCombate;
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
        misiones.put(0012, new Mision(0012, LocalDate.MIN, "Madrid", 10));
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
        Mision m  = new Mision(id, fecha, lugar, exp);
        switch (opcion) {
            case 1:
                misiones.put(id, m);
                GenerarMisioReconocimiento(id);
                break;
            case 2:
                misiones.put(id, m);
                break;
            default:
                System.out.println("No hay misiones de escolta");
                break;
        }
    }

    public void GenerarMisioReconocimiento(int id) {
        int opcion, confirmar, posicionRecurso, capacidadCarga;
        String uso;
        posicionRecurso = -1;
        confirmar = -1;
        boolean estresado = false;
        boolean capacidad = false;
        boolean vehiculoLoPrimero = true;
        boolean recursoAñadido = false;
//        boolean asignado = false;
        System.out.println("dime el uso del recurso");
        uso = sc.nextLine();
        meterVehiculo(id, uso);

        System.out.println("Que tipo de recurso quieres 1 material 2 vehiculo 3 humano");
        opcion = sc.nextInt();
        sc.nextLine();
        do {
            switch (opcion) {
                case 1:
                    for (int i = 0; i < recursos.size() && confirmar != 1; i++) {
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
                    for (int i = 0; i < recursos.size() && confirmar != 1; i++) {
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
                    for (int i = 0; i < recursos.size() && confirmar != 1; i++) {
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

            if (recursos.get(posicionRecurso) instanceof RecursoHumano) {
                if (((RecursoHumano) recursos.get(posicionRecurso)).getNivelStress() > 20) {
                    estresado = true;
                    System.out.println("no se puede meter ese recurso por que está estresado");
                } else {

                    capacidadCarga = misiones.get(id).mirarCapacidadVehiculo();

                    if (!misiones.get(id).comprobarHumanos(capacidadCarga)) {
                        //no se ha pasado de humanos
                        misiones.get(id).addRecurso(recursos.get(posicionRecurso), uso);
                        recursoAñadido = true;
                    }
                }
            } else {
                misiones.get(id).addRecurso(recursos.get(posicionRecurso), uso);
                recursoAñadido = true;
            }
        } while (!recursoAñadido);
    }
    public void GenerarMisioCombate(int id) {
        int opcion, confirmar, posicionRecurso, capacidadCarga;
        String uso;
        posicionRecurso = -1;
        confirmar = -1;
        boolean estresado = false;
        boolean capacidad = false;
        boolean vehiculoLoPrimero = true;
        boolean recursoAñadido = false;
//        boolean asignado = false;
    
        System.out.println("dime el uso del recurso");
        uso = sc.nextLine();
        meterVehiculo(id, uso);

        System.out.println("Que tipo de recurso quieres 1 material 2 vehiculo 3 humano");
        opcion = sc.nextInt();
        sc.nextLine();
        do {
            switch (opcion) {
                case 1:
                    for (int i = 0; i < recursos.size() && confirmar != 1; i++) {
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
                    for (int i = 0; i < recursos.size() && confirmar != 1; i++) {
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
                    for (int i = 0; i < recursos.size() && confirmar != 1; i++) {
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

            if (recursos.get(posicionRecurso) instanceof RecursoHumano) {
                if (((RecursoHumano) recursos.get(posicionRecurso)).getNivelStress() > 20) {
                    estresado = true;
                    System.out.println("no se puede meter ese recurso por que está estresado");
                } else {

                    capacidadCarga = misiones.get(id).mirarCapacidadVehiculo();

                    if (!misiones.get(id).comprobarHumanos(capacidadCarga)) {
                        //no se ha pasado de humanos
                        misiones.get(id).addRecurso(recursos.get(posicionRecurso), uso);
                        recursoAñadido = true;
                    }
                }
            } else {
                misiones.get(id).addRecurso(recursos.get(posicionRecurso), uso);
                recursoAñadido = true;
            }
            if (misiones.get(id) instanceof MisionCombate) {
                if (((MisionCombate) misiones.get(id)).comprobarNivelMortalidad()> misiones.get(id).comprobarNivelMortalidad()) {
                    System.out.println("la mision no se puede realizar");
                    misiones.remove(id);
                }
            }
        } while (!recursoAñadido);
    }

    private void meterVehiculo(int id, String uso) {
        int confirmar, posicionRecurso;
        posicionRecurso = -1;
        confirmar = -1;
        for (int i = 0; i < recursos.size() && confirmar != 1; i++) {
            if (recursos.get(i) instanceof RecursoVehiculo) {
                System.out.println(recursos.get(i).toString());
                System.out.println("¿este? 1 si 0 no");
                confirmar = sc.nextInt();
                sc.nextLine();
                posicionRecurso = i;

            }
            if (recursos.get(posicionRecurso) instanceof RecursoVehiculo) {
                misiones.get(id).addRecurso(recursos.get(posicionRecurso), uso);

            } else {
                System.out.println("Añade un vehiculo primero");
            }
        }
    }

    public void reljarSoldados() {
        int confirmar  = -1;
        int posicionRecurso  = 0;
        System.out.println("Dime quien quieres bajarle el Stress");
        for (int i = 0; i < recursos.size() && confirmar != 1; i++) {
            if (recursos.get(i) instanceof RecursoHumano) {
                System.out.println(recursos.get(i).toString());
                System.out.println("¿este? 1 si 0 no");
                confirmar = sc.nextInt();
                sc.nextLine();
                posicionRecurso = i;
            }
        }
        ((RecursoHumano)recursos.get(posicionRecurso)).setNivelStress(0);
    }
    public void anotarResultados(){
        int respuesta, id;
        respuesta = -1;
        id = -1;
        System.out.println("dime el id de la misión");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("¿La misión ha tenido exito? 1 si 0 no");
        respuesta =  sc.nextInt();
        sc.nextLine();
        if (respuesta == 1) {
            misiones.get(id).experiaenciaHumanos(misiones.get(id).getExpGanada());
            misiones.get(id).stressHumanos(misiones.get(id).getExpGanada()/2);
        }
        else if (respuesta == 0) {
            misiones.get(id).addResultado(misiones.get(id));
        }
    }
}
