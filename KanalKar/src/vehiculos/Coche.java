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
public class Coche extends VehiculoAMotor{
    
    //coches: Ciel Cadilac, delorean, Batmovil, Regalia, Ecto-1, Ford Falcon, Plymouth Fury 

    public Coche(String matricula, int kmDeUso, String color, String marca, float precioCompra, float precioVenta) {
        super(matricula, kmDeUso, color, marca, precioCompra, precioVenta);
    }

}
