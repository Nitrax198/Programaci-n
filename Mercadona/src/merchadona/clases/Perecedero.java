/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package merchadona.clases;

import java.time.LocalDate;

/**
 *
 * @author daw
 */
public class Perecedero extends Producto{
    private LocalDate fechaReposicion;

    public Perecedero(LocalDate FechaReposicion, float preciBase, String nombre) {
        super(preciBase, nombre);
        this.fechaReposicion = LocalDate.now();
    }

    public LocalDate getFechaReposicion() {
        return fechaReposicion;
    }

    public void setFechaReposicion(LocalDate FechaReposicion) {
        this.fechaReposicion = FechaReposicion;
    }
    
}
