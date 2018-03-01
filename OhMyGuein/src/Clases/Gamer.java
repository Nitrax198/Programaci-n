/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author daw
 */
public class Gamer {
    private int rankin;
    private String nombre;
    private int numTorneos;
    ArrayList<String> trofeos;

    public int getRankin() {
        return rankin;
    }

    public void setRankin(int rankin) {
        this.rankin = rankin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumTorneos() {
        return numTorneos;
    }

    public void setNumTorneos(int numTorneos) {
        this.numTorneos = numTorneos;
    }

    public ArrayList<String> getTrofeos() {
        return trofeos;
    }

    public void setTrofeos(ArrayList<String> trofeos) {
        this.trofeos = trofeos;
    }

    public Gamer(int rankin, String nombre, int numTorneos) {
        this.rankin = rankin;
        this.nombre = nombre;
        this.numTorneos = numTorneos;
        this.trofeos = new ArrayList<>();
    }
    
    public void addTrofeo(String trofeo){
        this.trofeos.add(trofeo);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + this.rankin;
        hash = 43 * hash + Objects.hashCode(this.nombre);
        hash = 43 * hash + this.numTorneos;
        hash = 43 * hash + Objects.hashCode(this.trofeos);
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
        final Gamer other = (Gamer) obj;
        if (this.rankin != other.rankin) {
            return false;
        }
        if (this.numTorneos != other.numTorneos) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.trofeos, other.trofeos)) {
            return false;
        }
        return true;
    }
    
}
