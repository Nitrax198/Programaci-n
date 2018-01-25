/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividades;

import java.util.Objects;

/**
 *
 * @author daw
 */
public class Alumno {
    private String nombre;
    private String apellido;
    private float pagaAlMes;

    public Alumno(String Nombre, String Apellido) {
        this.nombre = Nombre;
        this.apellido = Apellido;
        this.pagaAlMes = 0;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String Apellido) {
        this.apellido = Apellido;
    }

    public float getPagaAlMes() {
        return pagaAlMes;
    }

    public void setPagaAlMes(float PagaAlMes) {
        this.pagaAlMes = PagaAlMes;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (Float.floatToIntBits(this.pagaAlMes) != Float.floatToIntBits(other.pagaAlMes)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        return true;
    }
    
    
}
