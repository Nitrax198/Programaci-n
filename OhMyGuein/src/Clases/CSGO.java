/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author daw
 */
public class CSGO extends Gamer{
    private String equipo;
    private int numKills ;
    private String mapa;

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public int getNumKills() {
        return numKills;
    }

    public void setNumKills(int numKills) {
        this.numKills = numKills;
    }

    public String getMapa() {
        return mapa;
    }

    public void setMapa(String mapa) {
        this.mapa = mapa;
    }

    public CSGO(String equipo, int numKills, String mapa, int rankin, String nombre, int numTorneos) {
        super(rankin, nombre, numTorneos);
        this.equipo = equipo;
        this.numKills = numKills;
        this.mapa = mapa;
    }

    @Override
    public String toString() {
        return "CSGO{" + "equipo=" + equipo + ", numKills=" + numKills + ", mapa=" + mapa + '}';
    }
    
}
