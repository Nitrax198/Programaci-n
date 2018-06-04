/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import dao.ConcesionariosDAO;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
import javafx.scene.control.TextInputDialog;
import model.Concesionario;

/**
 *
 * @author daw
 */
public class ConcesionarioService {

    public List getAllConcesionarios() {
        ConcesionariosDAO dao = new ConcesionariosDAO();
        return dao.getAllConcesionarios();
    }

    public boolean insertConcesionario(Concesionario c) {
        ConcesionariosDAO dao = new ConcesionariosDAO();
        return dao.insertConcesionarioJDBC(c);
    }

    public boolean updateConcesionario(Concesionario c) {
        ConcesionariosDAO dao = new ConcesionariosDAO();
        return dao.updateConcesionarioJDBC(c);
    }

    public boolean deleteConcesionario(Concesionario c) throws SQLException {
        boolean borrado = false;
        ConcesionariosDAO dao = new ConcesionariosDAO();

        if (dao.existCocheFromConcesionario(c)) {
            //aqui habria que meter un dialog
            borrado = dao.deleteConcesionarioAndCoches(c);

        } else {
            borrado = dao.deleteConcesionario(c);
        }
        return borrado;
    }
}
