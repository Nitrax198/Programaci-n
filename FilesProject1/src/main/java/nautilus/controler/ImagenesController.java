/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nautilus.controler;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author daw
 */
public class ImagenesController implements Initializable {
    private PgPrincipalController controller;
    @FXML
    private ImageView fxImagen;
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
    
    public void verImagen(File imagen) {
        Image image = new Image(imagen.toURI().toString());
        fxImagen.setImage(image);
    }
}
