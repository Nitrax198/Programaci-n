/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import merchadona.modelo.Empleado;
import merchadona.servicios.Merchadona;

/**
 * FXML Controller class
 *
 * @author daw
 */
public class Escena1Controller implements Initializable {

    private AnchorPane scene;
    private AnchorPane scene2;
//    private AnchorPane tabla;
//    private MostarListadosController controllerT;

    private Merchadona merchadona;
    private Empleado empleadoActual;
    private int empleadoID;
    
    @FXML
    private MenuBar fxMenu;
    
    @FXML
    private BorderPane fxRoot;

    @FXML
    public void handleScene1(ActionEvent event) throws IOException {

        fxRoot.setCenter(scene);
    }
    @FXML
    public void handleScene2(ActionEvent event) throws IOException {

        fxRoot.setCenter(scene2);
    }

//    @FXML
//    public void handleSceneTablas(ActionEvent event) throws IOException {
//        controllerT.cargarDatosLista();
//        fxRoot.setCenter(tabla);
//    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        try {
            // TODO
           
            merchadona = new Merchadona();
            FXMLLoader loader = new FXMLLoader(
              getClass().getResource("/fxml/Registrarse"));
            scene = loader.load();
            RegistrarseController controller = loader.getController();
            controller.setController(this);

            loader = new FXMLLoader(
              getClass().getResource("/fxml/Registrarse"));
            scene2 = loader.load();
            RegistrarseController controllerNew = loader.getController();
            controllerNew.setController(this);

//            loader = new FXMLLoader(
//              getClass().getResource(Constantes.PANTALLA_TABLAS));
//            tabla = loader.load();
//            controllerT = loader.getController();
//            controllerT.setController(this);

        } catch (IOException ex) {
            Logger.getLogger(Escena1Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         fxMenu.setVisible(false);
        fxRoot.setCenter(scene);
    }

}
