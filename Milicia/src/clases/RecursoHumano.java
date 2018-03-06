/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author Miguel
 */
public class RecursoHumano extends RecursoMilitar{
    private int muertesACuchillo;
    private int nivelExp;
    private int nivelStress;
    private int nivelManejoMaquinaria;

    public RecursoHumano(int muertesACuchillo, int nivelExp, int nivelStress, int nivelManejoMaquinaria, int potenciaDeMuerte, String Nombre) {
        super(potenciaDeMuerte, Nombre);
        this.muertesACuchillo = muertesACuchillo;
        this.nivelExp = nivelExp;
        this.nivelStress = nivelStress;
        this.nivelManejoMaquinaria = nivelManejoMaquinaria;
    }

    public int getMuertesACuchillo() {
        return muertesACuchillo;
    }

    public void setMuertesACuchillo(int muertesACuchillo) {
        this.muertesACuchillo = muertesACuchillo;
    }

    public int getNivelExp() {
        return nivelExp;
    }

    public void setNivelExp(int nivelExp) {
        this.nivelExp = nivelExp;
    }

    public int getNivelStress() {
        return nivelStress;
    }

    public void setNivelStress(int nivelStress) {
        this.nivelStress = nivelStress;
    }

    public int getNivelManejoMaquinaria() {
        return nivelManejoMaquinaria;
    }

    public void setNivelManejoMaquinaria(int nivelManejoMaquinaria) {
        this.nivelManejoMaquinaria = nivelManejoMaquinaria;
    }

    @Override
    public String toString() {
        return "RecursoHumano{" + "muertesACuchillo=" + muertesACuchillo + ", nivelExp=" + nivelExp + ", nivelStress=" + nivelStress + ", nivelManejoMaquinaria=" + nivelManejoMaquinaria + '}';
    }

    
    
}
