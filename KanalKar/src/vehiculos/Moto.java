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
public class Moto extends VehiculoAMotor{
    
    public Moto(String matricula, int kmDeUso, String color, String marca, float precioCompra) {
        super(matricula, kmDeUso, color, marca, precioCompra);
    }

    @Override
    public String toString() {
        return "Moto{" + '}'+ super.toString();
    }
    
   
}
