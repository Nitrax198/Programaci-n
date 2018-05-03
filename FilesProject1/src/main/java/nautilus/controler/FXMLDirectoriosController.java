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
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javax.activation.MimetypesFileTypeMap;

/**
 * FXML Controller class
 *
 * @author daw
 */
public class FXMLDirectoriosController implements Initializable {

    private PgPrincipalController controller;

    @FXML
    private ListView<File> fxlistado;

    private String rutaActual;

    private File fileActual;

//    private File seleccionado;
    /**
     * Initializes the controller class.
     */
    ImagenesController d;

    @FXML
    public void handleMouseClick(MouseEvent event) {
        if (event.getClickCount() > 1) {
            controller.setSeleccionado(fxlistado.getSelectionModel().getSelectedItem());

            controller.getFxRutaActual().setText(controller.getSeleccionado().getAbsolutePath());
            cargarFiles();
        }
    }

    @FXML
    public void BotonPalante(ActionEvent event) {
        fileActual = fxlistado.getSelectionModel().getSelectedItem();

        controller.getFxRutaActual().setText(fileActual.getAbsolutePath());
        cargarFiles();

    }

    @FXML
    public void BotonEditar(ActionEvent event) {
        controller.cargarSceneText();
    }

    @FXML
    public void BotonVerImagen(ActionEvent event) {
//        if (controller.getSeleccionado().isFile()) {
            String mimetype = new MimetypesFileTypeMap().getContentType(controller.getSeleccionado());
            String type = mimetype.split("/")[0];
            if (type.equals("image")) {
                d.verImagen(controller.getSeleccionado());
            } else {
                Alert a = new Alert(Alert.AlertType.ERROR, "It is not a Image.", ButtonType.CLOSE);
                a.showAndWait();
            }
//        } else {
//            fxRutaActual.setText(controller.getSeleccionado().getAbsolutePath());
//            cargarFiles();
//        }
    }

    @FXML
    public void BotonPatras(ActionEvent event) {

//        File seleccionado = 
//          fxlistado.getSelectionModel().getSelectedItem();
//
//        fxRutaActual.setText(seleccionado.getAbsolutePath());
//            Así lo hace el profe sin el get parent
        controller.getFxRutaActual().setText(fileActual.getParent());
        cargarFiles();

    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        rutaActual = "/";
        controller.getFxRutaActual().setText(rutaActual);
        cargarFiles();

        // TODO
    }

    private void cargarFiles() {
        fileActual = new File(controller.getFxRutaActual().getText());
        fxlistado.getItems().clear();
        fxlistado.getItems().addAll(fileActual.listFiles());
    }

    public void setController(PgPrincipalController controller) {
        this.controller = controller;
    }

    public ListView<File> getFxlistado() {
        return fxlistado;
    }

    public void setFxlistado(ListView<File> fxlistado) {
        this.fxlistado = fxlistado;
    }

}
