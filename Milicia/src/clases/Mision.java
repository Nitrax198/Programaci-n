/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

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
        this.recursos = new ArrayList<>();
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
        recursos.add(new RecursoMision(tipo, recurso));
    }

    public int mirarCapacidadVehiculo() {
        boolean parase;
        parase = false;
        int capacidadVehiculo, posicion;
        capacidadVehiculo = -1;
        posicion = 0;
        for (int i = 0; i < recursos.size() && !parase; i++) {
            if (recursos.get(i).getRecurso() instanceof RecursoVehiculo) {
                parase = true;
                posicion = i;
            }
            capacidadVehiculo = ((RecursoVehiculo) recursos.get(posicion).getRecurso()).getCapacidadDeCarga();
        }
        return capacidadVehiculo;
    }

    public boolean comprobarHumanos(int capacidadCarga) {
        int contador;
        contador = 0;
        boolean hayDemasiadosHumanos;
        hayDemasiadosHumanos = false;
        for (int i = 0; i < recursos.size(); i++) {
            if (recursos.get(i).getRecurso() instanceof RecursoHumano) {
                contador++;
            }
            if (contador > capacidadCarga) {
                System.out.println("hay demasiados humanos, para ese vehiculo");
                hayDemasiadosHumanos = true;
            }
        }
        return hayDemasiadosHumanos;
    }

    public int comprobarNivelMortalidad() {
        int potenciaMuerte = 0;
        for (int i = 0; i < recursos.size(); i++) {
            potenciaMuerte += recursos.get(i).getRecurso().getPotenciaDeMuerte();
        }
        return  potenciaMuerte;
    }
    public void experiaenciaHumanos(int expRecibida){
        for (int i = 0; i < recursos.size(); i++) {
            if (recursos.get(i).getRecurso() instanceof RecursoHumano) {
                ((RecursoHumano)recursos.get(i).getRecurso()).setNivelExp(expRecibida);
            }
        }
    }
    public void stressHumanos(int stressRecibido){
        for (int i = 0; i < recursos.size(); i++) {
            if (recursos.get(i).getRecurso() instanceof RecursoHumano) {
                ((RecursoHumano)recursos.get(i).getRecurso()).setNivelStress(stressRecibido);
            }
        }
    }
    public void addResultado(Mision m){
        for (int i = 0; i < recursos.size(); i++) {
            recursos.get(i).getRecurso().addMision(m);
        }
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.idMision;
        hash = 97 * hash + (this.exito ? 1 : 0);
        hash = 97 * hash + Objects.hashCode(this.fecha);
        hash = 97 * hash + Objects.hashCode(this.lugar);
        hash = 97 * hash + this.expGanada;
        hash = 97 * hash + Objects.hashCode(this.recursos);
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
        final Mision other = (Mision) obj;
        if (this.idMision != other.idMision) {
            return false;
        }
        if (this.exito != other.exito) {
            return false;
        }
        if (this.expGanada != other.expGanada) {
            return false;
        }
        if (!Objects.equals(this.lugar, other.lugar)) {
            return false;
        }
        if (!Objects.equals(this.fecha, other.fecha)) {
            return false;
        }
        if (!Objects.equals(this.recursos, other.recursos)) {
            return false;
        }
        return true;
    }

}
