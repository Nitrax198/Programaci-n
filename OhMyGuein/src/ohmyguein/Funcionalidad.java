/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohmyguein;

import Clases.CSGO;
import Clases.Campeonato;
import Clases.Carta;
import Clases.ClashRoyale;
import Clases.Gamer;
import Clases.LOL;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author daw
 */
public class Funcionalidad {

    Scanner sc;
    Map< LocalDate, Campeonato> campeonatos;
    ArrayList<Gamer> inscritos;

    public Funcionalidad() {
        this.sc = new Scanner(System.in);
        this.campeonatos = new LinkedHashMap<>();
        this.inscritos = new ArrayList<>();

        ClashRoyale G1 = new ClashRoyale(1, "Yugi", 20);
        Carta carta1 = new Carta("DragonBOA", 6);
        Carta carta2 = new Carta("DragonNOR", 5);
        G1.addCarta(carta1);
        G1.addCarta(carta2);
        ClashRoyale G2 = new ClashRoyale(1, "kaiba", 20);
        Carta carta3 = new Carta("Exodia", 6);
        Carta carta4 = new Carta("MagoOscuro", 5);
        G1.addCarta(carta1);
        G1.addCarta(carta2);
        inscritos.add(new CSGO("equipo", 5, "mapa", 8, "Nico", 9));
        inscritos.add(new CSGO("equipo2", 3, "mapa2", 7, "Ramon", 6));
        inscritos.add(new LOL("mid", " adc", 0, "Necro", 0));
        inscritos.add(new LOL("bot", " supp", 0, "Faker", 0));
        inscritos.add(G1);
        inscritos.add(G2);
    }

    public void addCampeonato() {
        int año, mes, dia;
        String nombre;
        LocalDate fecha;
        boolean fin;
        fin = false;
        System.out.println("Dime el año del campeonato");
        año = sc.nextInt();
        sc.nextLine();
        System.out.println("Dime el mes del campeonato");
        mes = sc.nextInt();
        sc.nextLine();
        System.out.println("Dime el dia del campeonato");
        dia = sc.nextInt();
        sc.nextLine();
        fecha = LocalDate.of(año, mes, dia);
        do {
            if (campeonatos.containsKey(fecha) == false) {
                System.out.println("De que es el campeonato, puede ser  de lol, de Magic, o de CSGO");
                String tipo;
                tipo = sc.nextLine();
                Campeonato c1 = new Campeonato(fecha, tipo, "Nachos");
                campeonatos.put(fecha, c1);
                fin = true;
            } 
            else {
                System.out.println("Ya hay un campeonato ese dia, por favor elige otro");
            }
        } while (!fin);
        for (int i = 0; i < inscritos.size(); i++) {
            System.out.println(inscritos.get(i).toString());
        }
        System.out.println("Dime el nombre del jugador que quieras apuntar al torneo");
        nombre =  sc.nextLine();
        
        for (int i = 0; i <inscritos.size(); i++) {
            if (inscritos.get(i) instanceof LOL) {
                if (inscritos.get(i).getNombre().equals(nombre)) {
                        campeonatos.get(fecha).addGamer(inscritos.get(i));
                }
            }
            else if(inscritos.get(i) instanceof CSGO){
                if (inscritos.get(i).getNombre().equals(nombre)) {
                    campeonatos.get(fecha).addGamer(inscritos.get(i));
                }
            }
            else if(inscritos.get(i) instanceof ClashRoyale){
                if (inscritos.get(i).getNombre().equals(nombre)) {
                    campeonatos.get(fecha).addGamer(inscritos.get(i));
                }
            }
        }
    }

    public void ranking() {
        
    }

    public void listarCampeonatos() {

    }

}
