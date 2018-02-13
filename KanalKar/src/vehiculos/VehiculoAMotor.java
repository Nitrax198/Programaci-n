/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;

import java.util.Objects;

/**
 *
 * @author daw
 */
public class VehiculoAMotor extends Vehiculo{
    protected String matricula;
    protected int kmDeUso;

    public VehiculoAMotor(String matricula, int kmDeUso, String color, String marca, float precioCompra) {
        super(color, marca, precioCompra);
        this.matricula = matricula;
        this.kmDeUso = kmDeUso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getKmDeUso() {
        return kmDeUso;
    }

    public void setKmDeUso(int kmDeUso) {
        this.kmDeUso = kmDeUso;
    }

    @Override
    public String toString() {
        return "VehiculoAMotor{" + "matricula=" + matricula + ", kmDeUso=" + kmDeUso + '}'+ super.toString();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.matricula);
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
        final VehiculoAMotor other = (VehiculoAMotor) obj;
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        return true;
    }

    
}
