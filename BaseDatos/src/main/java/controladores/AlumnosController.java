/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.io.File;
import java.net.URL;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
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
    private TextField nombrefx;
    @FXML
    private DatePicker fechaNacfx;
    
//    CheckBox DatePicker TextField
    
    @FXML
    public void BotonCreate(ActionEvent event) {
        String nombre = nombrefx.getText();
        LocalDate fechaNac = fechaNacfx.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(); //como saco lo que hay en una cDatePicker??
        boolean MayorEd = true;
        Alumno a = new Alumno(nombre,fechaNac.,MayorEd);
        
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
