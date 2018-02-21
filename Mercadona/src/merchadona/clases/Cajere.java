/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package merchadona.clases;

/**
 *
 * @author daw
 */
public class Cajere  extends Empleade{
    private float precioTotal;

    public Cajere( String nombre, int id) {
        super(nombre, id);
        this.precioTotal = 0;
    }

    public float getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(float precioTotal) {
        this.precioTotal = precioTotal;
    }
    
}
