/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;

/**
 *
 * @author oscar
 */
public class Zoologo extends Personal{
    @XmlElement( name = "titulo" )
    private String titulo;
    @XmlElementWrapper(name = "Animales")
    @XmlElements({
        @XmlElement(name = "Leon", type = Leon.class),
        @XmlElement(name = "Tigre", type = Tigre.class)})
    private List<Animal> tratados;

    public Zoologo() {
    }

    public Zoologo(String titulo, List<Animal> tratados, int sueldo, String nombre) {
        super(sueldo, nombre);
        this.titulo = titulo;
        this.tratados = tratados;
    }
    
    
}
