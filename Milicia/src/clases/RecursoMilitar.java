/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Miguel
 */
public class RecursoMilitar {
    private int potenciaDeMuerte;
    private String Nombre;
    ArrayList<Mision> misionesHechas;

    public RecursoMilitar(int potenciaDeMuerte, String Nombre) {
        this.potenciaDeMuerte = potenciaDeMuerte;
        this.Nombre = Nombre;
        this.misionesHechas=  new  ArrayList<>();
    }

    public int getPotenciaDeMuerte() {
        return potenciaDeMuerte;
    }

    public void setPotenciaDeMuerte(int potenciaDeMuerte) {
        this.potenciaDeMuerte = potenciaDeMuerte;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    //hacer funcion para recibir getter an seter del array

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.potenciaDeMuerte;
        hash = 97 * hash + Objects.hashCode(this.Nombre);
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
        final RecursoMilitar other = (RecursoMilitar) obj;
        if (this.potenciaDeMuerte != other.potenciaDeMuerte) {
            return false;
        }
        if (!Objects.equals(this.Nombre, other.Nombre)) {
            return false;
        }
        return true;
    }
    
}
