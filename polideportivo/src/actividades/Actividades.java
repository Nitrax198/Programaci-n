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
    private String Tipo;
    private int Plazas;
    private int PlazasLibres;
    private float Precio;
    private Horario horario;
    private Alumnos[] alumnos;
        //tengo que dar de alta,
        //tengo que dar de baja
        //Metricular 
            //buscar
        //generar recibo de actividad
        //generar recibo de Alumnos

    public Actividades(String Tipo, int Plazas, int PlazasLibres, float Precio, Horario horario, Alumnos[] alumnos) {
        this.Tipo = Tipo;
        this.Plazas = Plazas;
        this.PlazasLibres = PlazasLibres;
        this.Precio = Precio;
        this.horario = horario;
        this.alumnos = alumnos;
    }
    

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public int getPlazas() {
        return Plazas;
    }

    public void setPlazas(int Plazas) {
        this.Plazas = Plazas;
    }

    public int getPlazasLibres() {
        return PlazasLibres;
    }

    public void setPlazasLibres(int PlazasLibres) {
        this.PlazasLibres = PlazasLibres;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }
    
}
