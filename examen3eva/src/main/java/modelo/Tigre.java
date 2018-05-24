/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author oscar
 */
public class Tigre extends Animal{
    
    @XmlElement( name = "numeroRayas" )
    private int numeroRayas;

    public Tigre() {
    }

    public Tigre(int numeroRayas) {
        this.numeroRayas = numeroRayas;
    }

    public Tigre(int numeroRayas, String nombre) {
        super(nombre);
        this.numeroRayas = numeroRayas;
    }
    
}
