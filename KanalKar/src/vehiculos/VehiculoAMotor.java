/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;

/**
 *
 * @author daw
 */
public class VehiculoAMotor extends Vehiculo{
    protected String matricula;
    protected int kmDeUso;

    public VehiculoAMotor(String matricula, int kmDeUso, String color, String marca, float precioCompra, float precioVenta) {
        super(color, marca, precioCompra, precioVenta);
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

    
}
