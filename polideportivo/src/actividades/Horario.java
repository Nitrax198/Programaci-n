/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividades;

/**
 *
 * @author daw
 */
public class Horario {
    private String dias;
    private int horaFinal;
    private int horaInicial;

    public Horario(String dias, int horaFinal, int horaInicial) {
        this.dias = dias;
        this.horaFinal = horaFinal;
        this.horaInicial = horaInicial;
    }

    public String getDias() {
        return dias;
    }

    public void setDias(String dias) {
        this.dias = dias;
    }

    public int getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(int horaFinal) {
        this.horaFinal = horaFinal;
    }

    public int getHoraInicial() {
        return horaInicial;
    }

    public void setHoraInicial(int horaInicial) {
        this.horaInicial = horaInicial;
    }

    
}
