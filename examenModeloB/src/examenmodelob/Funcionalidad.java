/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenmodelob;

import clases.Analista;
import clases.Experiencia;
import clases.Freelance;
import clases.Proyecto;
import clases.ProyectoDesarrollo;
import clases.Puesto;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author daw
 */
public class Funcionalidad {

    public Scanner sc = new Scanner(System.in);
    private Map<String, Proyecto> proyectos;
    ArrayList<Freelance> freelancs;

    public Funcionalidad() {
        this.proyectos = new LinkedHashMap<>();
        this.freelancs = new ArrayList<>();
        Freelance nuca = new Freelance("Nuca", "08967424F", 8);
        Freelance kaiba = new Freelance("SetoKaiba", "03943224M", 10);
        Analista carlos = new Analista(9, 12, "Carlos", "2345678F", 6);
        Analista koyi = new Analista(10, 20, "KoyiKabuto", "2345678F", 12);
        Experiencia exp1 = new Experiencia(10, "Java");
        Experiencia exp4 = new Experiencia(5, "Java");
        Experiencia exp2 = new Experiencia(7, "Css");
        Experiencia exp5 = new Experiencia(8, "Css");
        Experiencia exp3 = new Experiencia(9, "C++");
        Experiencia exp6 = new Experiencia(6, "C++");
        Experiencia exp7 = new Experiencia(4, "JavaS");
        Experiencia exp8 = new Experiencia(10, "Java");
        Experiencia exp9 = new Experiencia(3, "XML");
        Experiencia exp10 = new Experiencia(8, "CS");
        nuca.addExp(exp1, "Java");
        nuca.addExp(exp2, "Css");
        nuca.addExp(exp3, "C++");
        kaiba.addExp(exp4, "Java");
        kaiba.addExp(exp5, "Css");
        kaiba.addExp(exp6, "C++");
        ((Freelance) carlos).addExp(exp7, "JavaS");
        ((Freelance) carlos).addExp(exp8, "Java");
        ((Freelance) koyi).addExp(exp9, "XML");
        ((Freelance) koyi).addExp(exp10, "CS");
        freelancs.add(nuca);
        freelancs.add(kaiba);
        freelancs.add(carlos);
        freelancs.add(koyi);
        Proyecto p1 = new Proyecto("Z1", "Madrid");
        Proyecto p2 = new Proyecto("AlfaCharlie", "ILOVENY");
        ProyectoDesarrollo p3 = new ProyectoDesarrollo("Java", "GanmaJax", "Tokyo");
        ProyectoDesarrollo p4 = new ProyectoDesarrollo("Css", "YinDelta", "Comarca");
        Puesto pst1 = new Puesto("BOSS", 10, 10);
        Puesto pst8 = new Puesto("BOSS", 10, 10);
        Puesto pst11 = new Puesto("BOSS", 10, 10);
        Puesto pst2 = new Puesto("Junior", 3, 6);
        Puesto pst7 = new Puesto("Junior", 3, 6);
        Puesto pst9 = new Puesto("Junior", 3, 6);
        Puesto pst10 = new Puesto("Junior", 3, 6);
        Puesto pst12 = new Puesto("Junior", 3, 6);
        Puesto pst3 = new Puesto("LittleBoss", 8, 8);
        Puesto pst6 = new Puesto("LittleBoss", 8, 8);
        Puesto pst4 = new Puesto("SuperJunior", 5, 7);
        Puesto pst5 = new Puesto("SuperJunior", 5, 7);
        p1.addExp(pst1);
        p1.addExp(pst2);
        p1.addExp(pst9);
        p2.addExp(pst3);
        p2.addExp(pst4);
        p2.addExp(pst6);
        ((Proyecto) p3).addExp(pst8);
        ((Proyecto) p3).addExp(pst5);
        ((Proyecto) p3).addExp(pst7);
        ((Proyecto) p4).addExp(pst11);
        ((Proyecto) p4).addExp(pst12);
        proyectos.put("Z1", p1);
        proyectos.put("AlfaCharlie", p2);
        proyectos.put("GanmaJax", p3);
        proyectos.put("YinDelta", p4);
    }

    private void asignarFreelance(Scanner sc) {
        int posFree;
        posFree = 0;
        String nombre, lenguaje ,nombreFree,nombrepuesto;
        boolean lleno; lleno=true;
        boolean minimo; minimo=false;
        boolean nivelExp; nivelExp=false;
        System.out.println("dime a quien quieres asignar");
        nombreFree = sc.nextLine();
        System.out.println("dime el nombre del proyecto al que lo quieras añadir");
        nombre = sc.nextLine();
        System.out.println("Dime el puesto");
        nombrepuesto= sc.nextLine();
        for (int i = 0; i < freelancs.size(); i++) {
            if (freelancs.get(i).getNombre().equals(nombreFree)) {
                posFree = i;
            }
        }
        proyectos.get(nombre).addfreelance(freelancs.get(posFree), nombre);
        lleno = proyectos.get(nombre).comprobarSiEstaLleno();
        if (lleno) {
            System.out.println("ERROR");
            
        } else {
            minimo = proyectos.get(nombre).comprobarSalario();
            if (minimo) {
                if (proyectos.get(nombre) instanceof ProyectoDesarrollo) {
                    System.out.println("dime el lenguaje del proyecto");
                    lenguaje = sc.nextLine();
                    nivelExp = proyectos.get(nombre).comprobarMinimaExp(lenguaje);
                    if (nivelExp) {
                        System.out.println("ya está");
                    }
                }
                else if (proyectos.get(nombre) instanceof Proyecto) {
                    
                }
            }
        }
        if (!nivelExp||!minimo||lleno) {
            proyectos.get(nombre).deletefreelance(freelancs.get(posFree), nombre);
        }
    }

    private void mostrarCostes() {
        String nombre;
        int salario;
        System.out.println("dime el nombre del proyecto que quieras ver");
        nombre = sc.nextLine();
        if (proyectos.get(nombre) instanceof Proyecto) {
            salario = proyectos.get(nombre).mostrarSalario();
            System.out.println(proyectos.get(nombre.toString()) + "este proyecto tiene este salario" + salario);
        }
        else if(proyectos.get(nombre) instanceof ProyectoDesarrollo){
            salario=((Proyecto) proyectos.get(nombre)).mostrarSalario();
            System.out.println(proyectos.get(nombre.toString()) + "este proyecto tiene este salario" + salario);
        }

    }

}
