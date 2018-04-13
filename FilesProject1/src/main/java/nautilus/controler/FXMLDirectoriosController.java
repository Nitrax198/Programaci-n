/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nautilus.controler;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author daw
 */
public class FXMLDirectoriosController implements Initializable {
    @FXML
    private ListView<File> fxlistado;
    @FXML
    private Label fxRutaActual;
    
    private String rutaActual ;
    
    private File fileActual ;
    /**
     * Initializes the controller class.
     */
    @FXML
    public void handleMouseClick(MouseEvent event) {
        if (event.getClickCount() > 1) {
            File seleccionado
                    = fxlistado.getSelectionModel().getSelectedItem();

            fxRutaActual.setText(seleccionado.getAbsolutePath());
            cargarFiles();
        }
    }
    
    @FXML
    public void BotonPalante(ActionEvent event){
        fileActual=fxlistado.getSelectionModel().getSelectedItem();

    fxRutaActual.setText(fileActual.getAbsolutePath());
        cargarFiles();
    
    }
  
    
    @FXML
    public void BotonPatras(ActionEvent event){
    
//        File seleccionado = 
//          fxlistado.getSelectionModel().getSelectedItem();
//
//        fxRutaActual.setText(seleccionado.getAbsolutePath());
//            Así lo hace el profe sin el get parent
        fxRutaActual.setText(fileActual.getParent());
        cargarFiles();
    
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        rutaActual = "/";
        fxRutaActual.setText(rutaActual);
        cargarFiles();
        
        // TODO
    }    
    
    private void cargarFiles()
    {
       fileActual = new File(fxRutaActual.getText());
        fxlistado.getItems().clear();
        fxlistado.getItems().addAll(fileActual.listFiles()); 
    }
}
