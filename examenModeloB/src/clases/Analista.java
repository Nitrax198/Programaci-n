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
public class Analista extends Freelance {
    private int nivelExpPA;
    private int precioHorasPA;

    public Analista(int nivelExpPA, int precioHorasPA, String nombre, String dni, int precoHora) {
        super(nombre, dni, precoHora);
        this.nivelExpPA = nivelExpPA;
        this.precioHorasPA = precioHorasPA;
    }

    public int getNivelExpPA() {
        return nivelExpPA;
    }

    public void setNivelExpPA(int nivelExpPA) {
        this.nivelExpPA = nivelExpPA;
    }

    public int getPrecioHorasPA() {
        return precioHorasPA;
    }

    public void setPrecioHorasPA(int precioHorasPA) {
        this.precioHorasPA = precioHorasPA;
    }
    
}
