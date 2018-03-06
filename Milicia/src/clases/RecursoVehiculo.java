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
public class RecursoVehiculo extends RecursoMaterial{
    private int capacidadDeCarga;

    public RecursoVehiculo(int capacidadDeCarga, int nivelMinimoHabilidad, int ramgoDeAccion, int potenciaDeMuerte, String Nombre) {
        super(nivelMinimoHabilidad, ramgoDeAccion, potenciaDeMuerte, Nombre);
        this.capacidadDeCarga = capacidadDeCarga;
    }

    public int getCapacidadDeCarga() {
        return capacidadDeCarga;
    }

    public void setCapacidadDeCarga(int capacidadDeCarga) {
        this.capacidadDeCarga = capacidadDeCarga;
    }

    @Override
    public String toString() {
        return "RecursoVehiculo{" + "capacidadDeCarga=" + capacidadDeCarga + '}';
    }
    
}
