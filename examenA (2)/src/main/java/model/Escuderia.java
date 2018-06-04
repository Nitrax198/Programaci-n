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
public class Escuderia {

    private int id;

    private String nombre;

    private String marca;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Escuderia() {
    }

    public Escuderia(String nombre, String marca) {
        this.nombre = nombre;
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Escuderia{" + "id=" + id + ", nombre=" + nombre + ", marca=" + marca + '}';
    }
}
