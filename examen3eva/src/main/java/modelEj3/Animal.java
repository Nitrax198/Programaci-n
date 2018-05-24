/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelEj3;

import java.util.List;

/**
 *
 * @author daw
 */
public class Animal {
    private String nombre;
    private String raza;
    private int peso;
    private List<Muerte> muertes;

    public Animal() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public List<Muerte> getMuertes() {
        return muertes;
    }

    public void setMuertes(List<Muerte> muertes) {
        this.muertes = muertes;
    }
    
    
}
