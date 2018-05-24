/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author oscar
 */
public class Leon extends Animal{
    
    private int tamGarras;

    public int getTamGarras() {
        return tamGarras;
    }

    public void setTamGarras(int tamGarras) {
        this.tamGarras = tamGarras;
    }

    public Leon() {
    }

    public Leon(int tamGarras) {
        this.tamGarras = tamGarras;
    }

    public Leon(int tamGarras, String nombre) {
        super(nombre);
        this.tamGarras = tamGarras;
    }
    
}
