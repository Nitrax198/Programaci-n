/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author daw
 */
public class PgPrincipalController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private BorderPane fxRoot;

    @FXML
    private AnchorPane sceneAlm;

    @FXML
    private AnchorPane sceneAsig;
    
    @FXML
    public void BotonIrAlumnos(ActionEvent event) {
        
        fxRoot.setCenter(sceneAlm);
    }
    @FXML
    public void BotonIrAsignaturas(ActionEvent event) {
        
        fxRoot.setCenter(sceneAsig);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        try {
            // TODO

            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource("/fxml/Alumnos.fxml"));
            sceneAlm = loader.load();
            AlumnosController controllerAlm = loader.getController();
            controllerAlm.setController(this);

            loader = new FXMLLoader(
                    getClass().getResource("/fxml/Asignaturas.fxml"));
            sceneAlm = loader.load();
            AsignaturasController controllerAsig = loader.getController();
            controllerAsig.setController(this);

        } catch (IOException ex) {
            Logger.getLogger(PgPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }

        fxRoot.setCenter(sceneAlm);
    }
    public void cargarSceneAlm() {
        fxRoot.setCenter(sceneAlm);
    }
    public void cargarSceneAsig() {
        fxRoot.setCenter(sceneAsig);
    }
}
