/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author daw
 */
public class RecursoHumano extends Recurso {

    private int stress;
    @XmlElement( name = "numBajasCuchillo" )
    private int numBajasCuchillo;
    @XmlElement( name = "habilidadMaquinas" )
    private int habilidadMaquinas;
    @XmlElement( name = "Exp" )
    private int exp;

    public RecursoHumano(int stress, int numBajasCuchillo, int habilidadMaquinas, int exp, int potenciaDeMuerte, String nombre) {
        super(potenciaDeMuerte, nombre);
        this.stress = stress;
        this.numBajasCuchillo = numBajasCuchillo;
        this.habilidadMaquinas = habilidadMaquinas;
        this.exp = exp;
    }

    public RecursoHumano() {
    }
    
    public void setStress(int stress) {
        this.stress = stress;
    }

    public void sumarStress(int stress) {
        this.stress += stress;
    }

    public int getStress() {
        return stress;
    }

    public void sumarExp(int exp) {
        this.exp += exp;
    }
   
    
    
    @Override
    public String toString() {
        return "Soldado: " + nombre + "\nEstrés: " + stress + "\nNúmero de bajas a cuchillo: " + numBajasCuchillo + "\nHabilidad con máquinas: " + habilidadMaquinas + "\nExperiencia: " + exp + "\nPotencia de muerte: " + potenciaDeMuerte;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final RecursoHumano other = (RecursoHumano) obj;
        if (this.stress != other.stress) {
            return false;
        }
        if (this.numBajasCuchillo != other.numBajasCuchillo) {
            return false;
        }
        if (this.habilidadMaquinas != other.habilidadMaquinas) {
            return false;
        }
        if (this.exp != other.exp) {
            return false;
        }
        return true;
    }

    

}
