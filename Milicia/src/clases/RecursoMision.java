/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Objects;

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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.tipo);
        hash = 59 * hash + Objects.hashCode(this.recurso);
        return hash;
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
        final RecursoMision other = (RecursoMision) obj;
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        if (!Objects.equals(this.recurso, other.recurso)) {
            return false;
        }
        return true;
    }
    
}
