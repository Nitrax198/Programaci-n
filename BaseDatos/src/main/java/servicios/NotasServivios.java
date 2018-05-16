/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import dao.NotasDAO;
import model.Alumno;
import model.Asignatura;

/**
 *
 * @author daw
 */
public class NotasServivios {
    
    public int vincularAlumnosYAsignaturas(Alumno a, Asignatura b) {
        NotasDAO dao = new NotasDAO();

        return dao.vincularAlumnosYAsignatura(a, b);
    }
    
    public int updateNotas(Alumno a, Asignatura b,int nota) {
        NotasDAO dao = new NotasDAO();

        return dao.updateNotas(a, b, nota);
    }
    
//    Aún por editar
//    public int Delete(Alumno a, Asignatura b,int nota) {
//        NotasDAO dao = new NotasDAO();
//
//        return dao.updateNotas(a, b, nota);
//    }
}
