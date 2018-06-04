/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import dao.PilotosDAO;
import java.util.List;
import model.Pilot;

/**
 *
 * @author daw
 */
public class PilotServices {
    public List getAllPilots() {
        PilotosDAO dao = new PilotosDAO();
        return dao.getAllPilots();
    }
    
    public boolean insertPilotos(Pilot e) {
        PilotosDAO dao = new PilotosDAO();
        return dao.insertPilotosJDBC(e);
    }
}
