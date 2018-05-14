/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import dao.AlumnosDAO;
import dao.AsignaturasDAO;
import java.util.List;
import model.Alumno;
import model.Asignatura;

/**
 *
 * @author daw
 */
public class AsignaturasServicios {

    public List<Asignatura> getAllAsignaturas() {
        AsignaturasDAO dao = new AsignaturasDAO();

        return dao.getAllAsignaturasJDBC();
    }

    public int InsertAsignaturas(Asignatura a) {
        AsignaturasDAO dao = new AsignaturasDAO();

        return dao.insertAsignaturasJDBC(a);

    }

    public int UpdateAsignaturas(Asignatura a) {
        AsignaturasDAO dao = new AsignaturasDAO();

        return dao.insertAsignaturasJDBC(a);
    }
    public boolean DeleteAsignaturas(long id) {
        AsignaturasDAO dao = new AsignaturasDAO();

        return dao.deleteAsignaturas(id);
    }
}
