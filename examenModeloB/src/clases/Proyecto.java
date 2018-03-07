/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author daw
 */
public class Proyecto {

    private String nombre;
    private String lugar;
    ArrayList<Puesto> puestos;

    public Proyecto(String nombre, String lugar) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.puestos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void addExp(Puesto puesto) {
        this.puestos.add(puesto);
    }

    public boolean comprobarSiEstaLleno() {
        boolean lleno;
        lleno = false;
        for (int i = 0; i < puestos.size() && !lleno; i++) {
            if (puestos.get(i).getFreelanceAsociado() instanceof Freelance) {
                lleno = true;
            }
        }
        return lleno;
    }

    public boolean comprobarSalario() {
        boolean minimo;
        minimo = false;
        for (int i = 0; i < puestos.size() && !minimo; i++) {
            if (puestos.get(i).getFreelanceAsociado().getPrecoHora() < puestos.get(i).getSalarioHoraPuesto()) {
                minimo = true;
            }
        }
        return minimo;
    }

    public int mostrarSalario() {
        int salario;
        salario = -1;
        for (int i = 0; i < puestos.size() - 1; i += 2) {
            salario = puestos.get(i).getSalarioHoraPuesto() + puestos.get(i + 1).getSalarioHoraPuesto();
        }
        return salario;
    }

    public boolean comprobarMinimaExp(String lenguaje) {
        boolean nivelExp;
        nivelExp = true;
        for (int i = 0; i < puestos.size() && nivelExp; i++) {
           if(puestos.get(i).comprobarNivelExp(lenguaje)) {
               nivelExp = puestos.get(i).comprobarNivelExp(lenguaje);
           }
           else{
               nivelExp = false;
           }
        }
        return nivelExp;
    }
    public void addfreelance(Freelance freelance, String nombre){
        int pos =0;
        for (int i = 0; i < puestos.size(); i++) {
            if (this.nombre.equals(nombre)) {
                pos = i;
            }
        }
        puestos.get(pos).addFreelance(freelance);
    }
    public void deletefreelance(Freelance freelance, String nombre){
        int pos =0;
        for (int i = 0; i < puestos.size(); i++) {
            if (this.nombre.equals(nombre)) {
                pos = i;
            }
        }
        puestos.get(pos).deleteFreelance(freelance);
    }

    @Override
    public String toString() {
        return "Proyecto{" + "nombre=" + nombre + ", lugar=" + lugar + ", puestos=" + puestos + '}';
    }

}
