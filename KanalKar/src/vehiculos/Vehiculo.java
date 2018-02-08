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
public class Vehiculo {
     protected String color;
     protected String marca;
     protected float precioCompra;
     protected float precioVenta;

    public Vehiculo(String color, String marca, float precioCompra, float precioVenta) {
        this.color = color;
        this.marca = marca;
        this.precioCompra = precioCompra;
        this.precioVenta = precioCompra*1.25f;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(float precioCompra) {
        this.precioCompra = precioCompra;
    }

    public float getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(float precioVenta) {
        this.precioVenta = precioVenta;
    }
     
     
     
}


