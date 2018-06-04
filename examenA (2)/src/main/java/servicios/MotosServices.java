/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import dao.EscuderiasDAO;
import dao.MotosDAO;
import dao.PilotosDAO;
import java.util.List;
import model.Moto;

/**
 *
 * @author daw
 */
public class MotosServices {
    
    public boolean insertMoto(Moto m) {
        MotosDAO dao = new MotosDAO();
        return dao.insertMoto(m);
    }
    public List getAllEscuderias() {
        EscuderiasDAO dao = new EscuderiasDAO();
        return dao.getAllEscuderias();
    }
    public List getAllPilots() {
        PilotosDAO dao = new PilotosDAO();
        return dao.getAllPilots();
    }
}
