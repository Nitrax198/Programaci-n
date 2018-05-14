/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author daw
 */
public class Nota {
//    Variableint.ParseLong
//    Variablelong.Parseint
    private int nota;
    private int id_Alumno;
    private int id_Asignatura;

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public int getId_Alumno() {
        return id_Alumno;
    }

    public void setId_Alumno(int id_Alumno) {
        this.id_Alumno = id_Alumno;
    }

    public int getId_Asignatura() {
        return id_Asignatura;
    }

    public void setId_Asignatura(int id_Asignatura) {
        this.id_Asignatura = id_Asignatura;
    }
    
    
}
