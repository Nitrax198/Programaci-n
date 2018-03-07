/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author daw
 */
public class Puesto {
    private String nombrePuesto;
    private int nivelExpMinimo;
    private int salarioHoraPuesto;
    private Freelance freelanceAsociado;

    public Puesto(String nombrePuesto, int nivelExpMinimo, int salarioHoraPuesto) {
        this.nombrePuesto = nombrePuesto;
        this.nivelExpMinimo = nivelExpMinimo;
        this.salarioHoraPuesto = salarioHoraPuesto;
    }

    public String getNombrePuesto() {
        return nombrePuesto;
    }

    public void setNombrePuesto(String nombrePuesto) {
        this.nombrePuesto = nombrePuesto;
    }

    public int getNivelExpMinimo() {
        return nivelExpMinimo;
    }

    public void setNivelExpMinimo(int nivelExpMinimo) {
        this.nivelExpMinimo = nivelExpMinimo;
    }

    public int getSalarioHoraPuesto() {
        return salarioHoraPuesto;
    }

    public void setSalarioHoraPuesto(int salarioHoraPuesto) {
        this.salarioHoraPuesto = salarioHoraPuesto;
    }

    public Freelance getFreelanceAsociado() {
        return freelanceAsociado;
    }

    public void setFreelanceAsociado(Freelance freelanceAsociado) {
        this.freelanceAsociado = freelanceAsociado;
    }
    
    public boolean comprobarNivelExp(String lenguaje) {
        boolean nivelExp;
        nivelExp = false;
            if (freelanceAsociado.obtenerNivelExp(lenguaje) > nivelExpMinimo) {
                nivelExp = true;
        }
        return nivelExp;
    }
    public void addFreelance(Freelance freelance){
        freelanceAsociado = freelance;
    }
    public void deleteFreelance(Freelance freelance){
        freelanceAsociado = null;
    }
    
}
