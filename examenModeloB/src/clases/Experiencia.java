/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author daw
 */
public class Experiencia {
    private int nivelExp;
    private String lenguajes;

    public Experiencia(int nivelExp, String lenguajes) {
        this.nivelExp = nivelExp;
        this.lenguajes = lenguajes;
    }

    public int getNivelExp() {
        return nivelExp;
    }

    public void setNivelExp(int nivelExp) {
        this.nivelExp = nivelExp;
    }

    public String getLenguajes() {
        return lenguajes;
    }

    public void setLenguajes(String lenguajes) {
        this.lenguajes = lenguajes;
    }
    
}
