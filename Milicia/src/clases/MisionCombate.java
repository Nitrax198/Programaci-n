/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.time.LocalDate;

/**
 *
 * @author Miguel
 */
public class MisionCombate extends Mision{
    private int nivelMinimoPontMuerte;

    public MisionCombate(int nivelMinimoPontMuerte, int idMision, LocalDate fecha, String lugar, int expGanada) {
        super(idMision, fecha, lugar, expGanada);
        this.nivelMinimoPontMuerte = nivelMinimoPontMuerte;
    }

    public int getNivelMinimoPontMuerte() {
        return nivelMinimoPontMuerte;
    }

    public void setNivelMinimoPontMuerte(int nivelMinimoPontMuerte) {
        this.nivelMinimoPontMuerte = nivelMinimoPontMuerte;
    }
    
}
