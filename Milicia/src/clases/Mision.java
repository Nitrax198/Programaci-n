/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Miguel
 */
public class Mision {
    
    private int idMision;
    private boolean exito;
    private LocalDate fecha;
    private String lugar;
    private int expGanada;
    ArrayList<RecursoMision> recursos; 

    public Mision(int idMision, LocalDate fecha, String lugar, int expGanada) {
        this.idMision = idMision;
        this.exito = false;
        this.fecha = fecha;
        this.lugar = lugar;
        this.expGanada = expGanada;
        this.recursos =  new  ArrayList<>();
    }

    public boolean isExito() {
        return exito;
    }

    public void setExito(boolean exito) {
        this.exito = exito;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getExpGanada() {
        return expGanada;
    }

    public void setExpGanada(int expGanada) {
        this.expGanada = expGanada;
    }

    public int getIdMision() {
        return idMision;
    }

    public void setIdMision(int idMision) {
        this.idMision = idMision;
    }
    
    public void addRecurso(RecursoMilitar recurso, String tipo) {
        recursos.add(new RecursoMision(tipo,recurso ));
    }
}
