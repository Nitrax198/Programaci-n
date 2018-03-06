/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Miguel
 */
public class RecursoMaterial extends RecursoMilitar {
    private int nivelMinimoHabilidad;
    private int ramgoDeAccion;

    public RecursoMaterial(int nivelMinimoHablidad, int ramgoDeAccion, int potenciaDeMuerte, String Nombre) {
        super(potenciaDeMuerte, Nombre);
        this.nivelMinimoHabilidad = nivelMinimoHablidad;
        this.ramgoDeAccion = ramgoDeAccion;
    }

    public int getNivelMinimo() {
        return nivelMinimoHabilidad;
    }

    public void setNivelMinimo(int nivelMinimo) {
        this.nivelMinimoHabilidad = nivelMinimo;
    }

    public int getRamgoDeAccion() {
        return ramgoDeAccion;
    }

    public void setRamgoDeAccion(int ramgoDeAccion) {
        this.ramgoDeAccion = ramgoDeAccion;
    }

    @Override
    public String toString() {
        return "RecursoMaterial{" + "nivelMinimoHabilidad=" + nivelMinimoHabilidad + ", ramgoDeAccion=" + ramgoDeAccion + '}';
    }
    
}
