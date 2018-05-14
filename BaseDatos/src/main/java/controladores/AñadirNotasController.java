/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import dao.AlumnosDAO;
import dao.AsignaturasDAO;
import dao.NotasDAO;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author daw
 */
public class AñadirNotasController implements Initializable {

    private AlumnosDAO cx;
    private AsignaturasDAO cz;
    private NotasDAO cy;
    private PgPrincipalController controller;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    public void setController(PgPrincipalController controller) {
        this.controller = controller;
    }
}
