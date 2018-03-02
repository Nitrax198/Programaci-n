/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author daw
 */
public class Campeonato{

    
    private LocalDate fecha;
    private String juego;
    private String premio;
    ArrayList<Clasificado> clasificados;
    
    public Campeonato(LocalDate fecha, String juego, String premio) {
        this.fecha = fecha;
        this.juego = juego;
        this.premio = premio;
        this.clasificados =  new  ArrayList<>();
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getJuego() {
        return juego;
    }

    public void setJuego(String juego) {
        this.juego = juego;
    }

    public String getPremio() {
        return premio;
    }

    public void setPremio(String premio) {
        this.premio = premio;
    }
    
    public void addGamer(Gamer gamer){
        if(clasificados.contains(gamer) == false){
        this.clasificados.add(new Clasificado(-1,gamer));
        }
        else{
            System.out.println("El jugador ya está");
        }
    }
    public void CambiarRanking(Scanner sc){
        int ranking;
        for (int i = 0; i < clasificados.size(); i++) {
            System.out.println("Dime la posición en la que has quedado");
            ranking = sc.nextInt();
            sc.nextLine();
            clasificados.get(i).setPosicion(ranking);
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.fecha);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Campeonato other = (Campeonato) obj;
        if (!Objects.equals(this.fecha, other.fecha)) {
            return false;
        }
        return true;
    }
    
}
