/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nautilus.controler;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    @FXML
    private AnchorPane scene;
    @FXML
    private AnchorPane sceneImg;
    @FXML
    private AnchorPane scenePdf;
    @FXML
    private AnchorPane sceneTxt;
    @FXML
    private BorderPane fxRoot;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        try {
            // TODO
            
            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource("/fxml/FXMLDirectoriosController.fxml"));
            scene = loader.load();
            FXMLDirectoriosController controllerDir = loader.getController();
            controllerDir.setController(this);
            
            loader = new FXMLLoader(
                    getClass().getResource("/fxml/ImagenesController.fxml"));
            sceneImg = loader.load();
            ImagenesController controllerImg = loader.getController();
            controllerImg.setController(this);
            
            loader = new FXMLLoader(
                    getClass().getResource("/fxml/PDFsController.fxml"));
            scenePdf = loader.load();
            PDFsController controllerPdf = loader.getController();
            controllerPdf.setController(this);

//            loader = new FXMLLoader(
//              getClass().getResource(Constantes.PANTALLA_TABLAS));
//            tabla = loader.load();
//            controllerT = loader.getController();
//            controllerT.setController(this);
        } catch (IOException ex) {
            Logger.getLogger(PgPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }

        fxRoot.setCenter(scene);
    }

    
}
