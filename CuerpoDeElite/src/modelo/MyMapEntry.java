/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.time.LocalDate;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlValue;

/**
 *
 * @author oscar
 */
public class MyMapEntry {
   @XmlElement
   public String key; 
 
   @XmlElements({
            @XmlElement(name = "MisionDeReconocimiento", type = MisionDeCombate.class),
            @XmlElement(name = "MisionDeCombate", type = Mision.class)
            
    })
   public Mision value;
}
