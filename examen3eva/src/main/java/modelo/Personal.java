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
public class Personal {
    
    private int sueldo;
    @XmlElement( name = "nombre" )
    private String nombre;

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public Personal() {
    }

    public Personal(int sueldo, String nombre) {
        this.sueldo = sueldo;
        this.nombre = nombre;
    }

    
    
}
