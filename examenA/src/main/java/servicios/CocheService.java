/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import dao.CochesDAO;
import dao.ConcesionariosDAO;
import java.util.List;
import model.Coche;

/**
 *
 * @author daw
 */
public class CocheService {
 
    public List getAllConcesionarios() {
        ConcesionariosDAO dao = new ConcesionariosDAO();
        return dao.getAllConcesionarios();
    }
    
    public List getAllCoches() {
        CochesDAO dao = new CochesDAO();
        return dao.getAllCoches();
    }
    
    public boolean insertCoche(Coche c){
        CochesDAO dao = new CochesDAO();
        return dao.insertCoche(c);
    }
    
}
