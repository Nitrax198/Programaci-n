/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelEj3;

import java.util.List;

/**
 *
 * @author daw
 */
public class Muerte {
    private String name;
    private List<Hijo> hijos;

    public Muerte() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Hijo> getHijos() {
        return hijos;
    }

    public void setHijos(List<Hijo> hijos) {
        this.hijos = hijos;
    }
    
    
}
