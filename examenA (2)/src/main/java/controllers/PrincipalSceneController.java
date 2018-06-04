/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

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
public class PrincipalSceneController implements Initializable {
    
    @FXML
    private BorderPane fxRoot;
    
    @FXML
    private AnchorPane sceneEsc;
    
    @FXML
    private AnchorPane sceneMot;
    
    @FXML
    private AnchorPane scenePil;
    /**
     * Initializes the controller class.
     */
    
    @FXML
    public void BotonIrMotos(ActionEvent event) {

        fxRoot.setCenter(sceneMot);
    }
    
    @FXML
    public void BotonIrEscuderia(ActionEvent event) {

        fxRoot.setCenter(sceneEsc);
    }
    
    @FXML
    public void BotonIrPilotos(ActionEvent event) {

        fxRoot.setCenter(scenePil);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO@Override
        try {
            // TODO
            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource("/fxml/CreateMoto.fxml"));
            sceneMot = loader.load();
            CreateMotoController controllerMot = loader.getController();
            controllerMot.setController(this);

            loader = new FXMLLoader(
                    getClass().getResource("/fxml/CreateEscuderia.fxml"));
            sceneEsc = loader.load();
            CreateEscuderiaController controllerEsc = loader.getController();
            controllerEsc.setController(this);

            loader = new FXMLLoader(
                    getClass().getResource("/fxml/TwentyOnePilots.fxml"));
            scenePil = loader.load();
            TwentyOnePilotsController controllerPil = loader.getController();
            controllerPil.setController(this);
            
        } catch (IOException ex) {
            Logger.getLogger(PrincipalSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
        fxRoot.setCenter(sceneEsc);
    }
    
    public void cargarSceneEsc() {
        fxRoot.setCenter(sceneEsc);
    }
    public void cargarSceneMot() {
        fxRoot.setCenter(sceneMot);
    }
    public void cargarScenePil() {
        fxRoot.setCenter(scenePil);
    }



    
}
