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
public class Alumnos {
    private String Nombre;
    private String Apellido;
    private float PagaAlMes;

    public Alumnos(String Nombre, String Apellido) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.PagaAlMes = 0;
    }

    
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public float getPagaAlMes() {
        return PagaAlMes;
    }

    public void setPagaAlMes(float PagaAlMes) {
        this.PagaAlMes = PagaAlMes;
    }
    
    
}
