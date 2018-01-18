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
    private String Dias;
    private int HoraFinal;
    private int HoraInicial;

    public Horario(String Dias, int HoraFinal, int HoraInicial) {
        this.Dias = Dias;
        this.HoraFinal = HoraFinal;
        this.HoraInicial = HoraInicial;
    }

    public String getDias() {
        return Dias;
    }

    public void setDias(String Dias) {
        this.Dias = Dias;
    }

    public int getHoraFinal() {
        return HoraFinal;
    }

    public void setHoraFinal(int HoraFinal) {
        this.HoraFinal = HoraFinal;
    }

    public int getHoraInicial() {
        return HoraInicial;
    }

    public void setHoraInicial(int HoraInicial) {
        this.HoraInicial = HoraInicial;
    }
    
}
