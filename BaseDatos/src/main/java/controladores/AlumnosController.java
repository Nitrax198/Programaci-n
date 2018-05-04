/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import model.Alumno;

/**
 * FXML Controller class
 *
 * @author daw
 */
public class AlumnosController implements Initializable {
    
    private PgPrincipalController controller;
    /**
     * Initializes the controller class.
     */
    @FXML
    private ListView<Alumno> fxlistado;
    
//    CheckBox DatePicker TextField
    
    @FXML
    public void BotonCreate(ActionEvent event) {
    }
    
    @FXML
    public void BotonUpdate(ActionEvent event) {
    }
    
    @FXML
    public void BotonDelete(ActionEvent event) {
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
    public void setController(PgPrincipalController controller) {
        this.controller = controller;
    }
}
