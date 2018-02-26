/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author daw
 */
public class LOL extends Gamer{
    private String linea;
    private String escepialidad;

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public String getEscepialidad() {
        return escepialidad;
    }

    public void setEscepialidad(String escepialidad) {
        this.escepialidad = escepialidad;
    }

    public LOL(String linea, String escepialidad, int rankin, String nombre, int numTorneos) {
        super(rankin, nombre, numTorneos);
        this.linea = linea;
        this.escepialidad = escepialidad;
    }
}

