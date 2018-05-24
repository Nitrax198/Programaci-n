/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.time.LocalDate;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author oscar
 */
@XmlRootElement(name = "ZooIlogico")
public class Zoo {
    @XmlElement( name = "nombre" )
    private String nombre;
    
    private LocalDate fechaApertura;
    @XmlElementWrapper(name = "Animales")
    @XmlElements({
        @XmlElement(name = "Leon", type = Leon.class),
        @XmlElement(name = "Tigre", type = Tigre.class)})
    private List<Animal> animales;
    @XmlElementWrapper(name = "Personas")
    @XmlElements({
        @XmlElement(name = "Zoologo", type = Zoologo.class)})
    private List<Personal> personal;

    public Zoo() {
        
    }

    public Zoo(List<Animal> animales, List<Personal> personal) {
        this.animales = animales;
        this.personal = personal;
        animales.add(new Leon(1, "ddd"));
        animales.add(new Leon(2, "fff"));
        animales.add(new Tigre(3, "ggg"));
        animales.add(new Tigre(4, "hhh"));
        personal.add(new Zoologo("jjj",animales, 3, "kkk"));
        
    }
    
}
