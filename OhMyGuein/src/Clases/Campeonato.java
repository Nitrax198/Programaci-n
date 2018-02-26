/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.time.LocalDate;

/**
 *
 * @author daw
 */
public class Campeonato extends Clasificados{
    private LocalDate fecha;
    private String juego;
    private String premio;

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

    public Campeonato(LocalDate fecha, String juego, String premio, int posicion) {
        super(posicion);
        this.fecha = fecha;
        this.juego = juego;
        this.premio = premio;
    }
}
