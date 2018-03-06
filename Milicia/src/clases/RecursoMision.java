/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Miguel
 */
public class RecursoMision {
    private String tipo;
    private RecursoMilitar recurso;

    public RecursoMision(String tipo, RecursoMilitar recurso) {
        this.tipo = tipo;
        this.recurso = recurso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public RecursoMilitar getRecurso() {
        return recurso;
    }

    public void setRecurso(RecursoMilitar recurso) {
        this.recurso = recurso;
    }
    
}
