/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author daw
 */
public class Campeonato{
    private LocalDate fecha;
    private String juego;
    private String premio;
    ArrayList<Clasificado> clasificados;
    
    public Campeonato(LocalDate fecha, String juego, String premio, int posicion) {
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
    
    public void addCarta(Clasificado clasificado){
        this.clasificados.add(clasificado);
    }
}
