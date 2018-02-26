/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author daw
 */
public class Clasificados {
    private int posicion;
    ArrayList<Gamer> participantes;

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public ArrayList<Gamer> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(ArrayList<Gamer> participantes) {
        this.participantes = participantes;
    }

    public Clasificados(int posicion) {
        this.posicion = posicion;
        this.participantes = new ArrayList<>();
    }
    
    public void addJugador(Gamer gamer){
        this.participantes.add(gamer);
    }
}
