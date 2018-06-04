/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author daw
 */
public class Coche {
    
    private int id;
    private String modelo;
    private int precio;
    private int idConcesionario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getIdConcesionario() {
        return idConcesionario;
    }

    public void setIdConcesionario(int idConcesionario) {
        this.idConcesionario = idConcesionario;
    }

    @Override
    public String toString() {
        return "Coche{" + "id=" + id + ", modelo=" + modelo + ", precio=" + precio + ", idConcesionario=" + idConcesionario + '}';
    }

    public Coche(String modelo, int precio, int idConcesionario) {
        this.modelo = modelo;
        this.precio = precio;
        this.idConcesionario = idConcesionario;
    }

    public Coche() {
    }
    
}
