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
public class Actividades {
    private String tipo;
    private int plazas;
    private int plazasLibres;
    private float precio;
    private Horario horario;
//    private Alumnos alumnos;
    
        //tengo que dar de alta,
        //tengo que dar de baja
        //Metricular 
            //buscar
        //generar recibo de actividad
        //generar recibo de Alumnos

    public Actividades(String tipo, int plazas, float precio, Horario horario /*Alumnos alumnos*/) {
        this.tipo = tipo;
        this.plazas = plazas;
        this.plazasLibres = this.plazas;
        this.precio = precio;
        this.horario = horario;
//        this.alumnos = alumnos;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }
    

    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String Tipo) {
        this.tipo = Tipo;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int Plazas) {
        this.plazas = Plazas;
    }

    public int getPlazasLibres() {
        return plazasLibres;
    }

    public void setPlazasLibres(int PlazasLibres) {
        this.plazasLibres = PlazasLibres;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float Precio) {
        this.precio = Precio;
    }
    
}
