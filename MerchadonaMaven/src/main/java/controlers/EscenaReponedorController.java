/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuBar;

/**
 * FXML Controller class
 *
 * @author daw
 */
public class EscenaReponedorController implements Initializable {
    private Escena1Controller controller;
    
//    @FXML
//    private MenuBar fxlistaProd;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    public void setController(Escena1Controller controller) {
        this.controller = controller;
    }
}
