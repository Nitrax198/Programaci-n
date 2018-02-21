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
public class Producto {
    private float preciBase;
    private String nombre;
    private int cantidadEnStock;

    public Producto(float preciBase, String nombre) {
        this.preciBase = preciBase;
        this.nombre = nombre;
        this.cantidadEnStock = 0;
    }

    
    
    public float getPreciBase() {
        return preciBase;
    }

    public void setPreciBase(float preciBase) {
        this.preciBase = preciBase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadEnStock() {
        return cantidadEnStock;
    }

    public void setCantidadEnStock(int cantidadEnStock) {
        this.cantidadEnStock = cantidadEnStock;
    }
    
}
