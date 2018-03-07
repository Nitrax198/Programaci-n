/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 *
 * @author daw
 */
public class Freelance {
    private String nombre;
    private String dni;
    private Map<String, Experiencia> nivelExpLenguajes;
    private int precoHora;

    public Freelance(String nombre, String dni, int precoHora) {
        this.nombre = nombre;
        this.dni = dni;
        this.nivelExpLenguajes = new LinkedHashMap<>();
        this.precoHora = precoHora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getPrecoHora() {
        return precoHora;
    }

    public void setPrecoHora(int precoHora) {
        this.precoHora = precoHora;
    }
    public void addExp(Experiencia exp, String lenguaje){
        this.nivelExpLenguajes.put(lenguaje,exp);
    }
    public int obtenerNivelExp (String lenguaje){
        int nivelExp;
        nivelExp = nivelExpLenguajes.get(lenguaje).getNivelExp();
        return nivelExp;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + Objects.hashCode(this.nombre);
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
        final Freelance other = (Freelance) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
    
}

