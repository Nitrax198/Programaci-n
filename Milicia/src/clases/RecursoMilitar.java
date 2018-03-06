/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;

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
}
