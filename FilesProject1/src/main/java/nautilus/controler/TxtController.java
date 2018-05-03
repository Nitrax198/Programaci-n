/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nautilus.controler;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ListView;

/**
 * FXML Controller class
 *
 * @author daw
 */
public class TxtController implements Initializable {

    private PgPrincipalController controller;
    /**
     * Initializes the controller class.
     */
    @FXML
    private ListView<File> fxlistado;
    private File fileCopiado;
    private File fileCrear;
    private File fileCopiar;
    private File fileBorrar;
    private String Nombre;
    private String NombreRen;
    private String RutaSelected;
    

    InputStream inStream = null;
    OutputStream outStream = null;

    @FXML
    public void BotonPegar(ActionEvent event) {
        fileCopiar = new File(RutaSelected);
        Nombre = fileCopiar.getName();
        if (fileCopiado.isFile()) {

            try {

                fileCopiado = new File(controller.getFxRutaActual().getText() + '/' + Nombre);

                inStream = new FileInputStream(fileCopiar);
                outStream = new FileOutputStream(fileCopiado);

                byte[] buffer = new byte[1024];

                int length;
                //copy the file content in bytes 
                while ((length = inStream.read(buffer)) > 0) {

                    outStream.write(buffer, 0, length);

                }

                inStream.close();
                outStream.close();

//                System.out.println("File is copied successful!");
            } catch (IOException e) {
                Alert a = new Alert(Alert.AlertType.ERROR, "Delete operation is failed.", ButtonType.CLOSE);
                a.showAndWait();
            }

        } else {
            Alert a = new Alert(Alert.AlertType.ERROR, "No Es un fichero", ButtonType.CLOSE);
            a.showAndWait();
        }
    }

    @FXML
    public void BotonBorrar(ActionEvent event) {
        try {

            fileBorrar = controller.getSeleccionado();

            if (fileBorrar.delete()) {
                Alert a = new Alert(Alert.AlertType.ERROR, "is deleted!", ButtonType.CLOSE);
                a.showAndWait();
            } else {
                Alert a = new Alert(Alert.AlertType.ERROR, "Delete operation is failed.", ButtonType.CLOSE);
                a.showAndWait();
            }

        } catch (Exception e) {

            Logger.getLogger(TxtController.class.getName()).log(Level.SEVERE, null, e);

        }
    }

    @FXML
    public void BotonCrear(ActionEvent event) {

        fileCrear = new File(controller.getFxRutaActual().getText());
        if (fileCrear.isFile()) {
            try {

                if (fileCrear.createNewFile()) {
                    Alert a = new Alert(Alert.AlertType.ERROR, "File is created!.", ButtonType.CLOSE);
                    a.showAndWait();
                } else {
                    Alert a = new Alert(Alert.AlertType.ERROR, "File already exists.", ButtonType.CLOSE);
                    a.showAndWait();
                }

            } catch (IOException e) {
                Logger.getLogger(TxtController.class.getName()).log(Level.SEVERE, null, e);
            }
        } else {
            Alert a = new Alert(Alert.AlertType.ERROR, "It is not a File.", ButtonType.CLOSE);
            a.showAndWait();
        }
    }

    @FXML
    public void BotonRenombrar(ActionEvent event) {
        File oldfile = controller.getSeleccionado();
        NombreRen = controller.getSeleccionado().getName();
        File newfile = new File(NombreRen + '2');

        if (oldfile.renameTo(newfile)) {
            Alert a = new Alert(Alert.AlertType.ERROR, "Rename succesful.", ButtonType.CLOSE);
            a.showAndWait();
        } else {
            Alert a = new Alert(Alert.AlertType.ERROR, "Rename failed.", ButtonType.CLOSE);
            a.showAndWait();
        }
    }

    @FXML
    public void BotonCopiar(ActionEvent event) {
        RutaSelected = controller.getSeleccionado().getAbsolutePath();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        cargarFiles();
    }

    public void setController(PgPrincipalController controller) {
        this.controller = controller;
    }

    private void cargarFiles() {
        File fileActual = new File(controller.getFxRutaActual().getText());
        fxlistado.getItems().clear();
        fxlistado.getItems().addAll(fileActual.listFiles());
    }
}
