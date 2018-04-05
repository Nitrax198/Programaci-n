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
import javafx.application.HostServices;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import merchadona.modelo.Empleado;
import merchadona.servicios.Merchadona;

/**
 * FXML Controller class
 *
 * @author daw
 */
public class Escena1Controller implements Initializable {

    private AnchorPane scene;
    private AnchorPane sceneReponedor;
    private AnchorPane sceneCajera;
    private AnchorPane sceneAdmin;
    private AnchorPane sceneProd;
    private AnchorPane sceneEmp;
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

        fxRoot.setCenter(sceneReponedor);
    }
    public void handleScene3(ActionEvent event) throws IOException {

        fxRoot.setCenter(sceneCajera);
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
              getClass().getResource("/fxml/Registrarse.fxml"));
            scene = loader.load();
            RegistrarseController controller = loader.getController();
            controller.setController(this);

            loader = new FXMLLoader(
              getClass().getResource("/fxml/EscenReponedor.fxml"));
            sceneReponedor = loader.load();
            EscenaReponedorController controllerReponedor = loader.getController();
            controllerReponedor.setController(this);
            
            loader = new FXMLLoader(
              getClass().getResource("/fxml/EscenaCajera.fxml"));
            sceneCajera = loader.load();
            EscenaCajeraController controllerCajera = loader.getController();
            controllerCajera.setController(this);
            
            loader = new FXMLLoader(
              getClass().getResource("/fxml/EscenaAdmin.fxml"));
            sceneAdmin = loader.load();
            EscenaAdminController controllerAdmin = loader.getController();
            controllerAdmin.setController(this);
            
            loader = new FXMLLoader(
              getClass().getResource("/fxml/DarDeAltaProd.fxml"));
            sceneProd = loader.load();
            DarDeAltaProdController controllerProd = loader.getController();
            controllerProd.setController(this);
            
            loader = new FXMLLoader(
              getClass().getResource("/fxml/DarDeAltaProd.fxml"));
            sceneEmp = loader.load();
            DarDeAltaEmpController controllerEmp = loader.getController();
            controllerEmp.setController(this);

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
    public MenuBar getFxMenu() {
        return fxMenu;
    }
    public Merchadona getMerchadona() {
        return merchadona;
    }

    public Empleado getEmpleadoActual() {
        return empleadoActual;
    }

    public void setEmpleadoActual(Empleado empleadoActual) {
        this.empleadoActual = empleadoActual;
    }

    public int getEmpleadoID() {
        return empleadoID;
    }

    public void setEmpleadoID(int empleadoID) {
        this.empleadoID = empleadoID;
    }

    
    public void habilitaMenuAdmin()
    {
        
    }
}
