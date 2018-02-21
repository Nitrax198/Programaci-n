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
public class Reponedore extends Empleade{
    private int numeroProdRepuestos;

    public Reponedore( String nombre, int id) {
        super(nombre, id);
        this.numeroProdRepuestos = 0;
    }

    public int getNumeroProdRepuestos() {
        return numeroProdRepuestos;
    }

    public void setNumeroProdRepuestos(int numeroProdRepuestos) {
        this.numeroProdRepuestos = numeroProdRepuestos;
    }
    
}
