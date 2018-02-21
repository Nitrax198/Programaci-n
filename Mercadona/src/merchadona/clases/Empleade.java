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
public class Empleade {
    
    private String nombre;
    private int id;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public Empleade(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }
    
    
}
