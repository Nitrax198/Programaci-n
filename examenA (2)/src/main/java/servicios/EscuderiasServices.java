/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import dao.EscuderiasDAO;
import java.util.List;
import model.Escuderia;

/**
 *
 * @author daw
 */
public class EscuderiasServices {
    public List getAllEscuderias() {
        EscuderiasDAO dao = new EscuderiasDAO();
        return dao.getAllEscuderias();
    }
    
    public boolean insertEscuderias(Escuderia e) {
        EscuderiasDAO dao = new EscuderiasDAO();
        return dao.insertEscuderiasJDBC(e);
    }
}
