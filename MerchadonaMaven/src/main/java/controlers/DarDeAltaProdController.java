/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlers;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDateTime;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import merchadona.modelo.Perecedero;

/**
 * FXML Controller class
 *
 * @author daw
 */
public class DarDeAltaProdController implements Initializable {

    private Escena1Controller controller;
    private TextField fxnombreProd;
    private TextField fxPrecioProd;
    /**
     * Initializes the controller class.
     */
    @FXML
    private void BotonPerecedero(ActionEvent event) throws IOException {
        boolean altaOk = this.controller.getMerchadona().darAltaProdPer(fxnombreProd.getText(), Double.parseDouble(fxPrecioProd.getText()));

        if (altaOk) {
            Alert a = new Alert(Alert.AlertType.INFORMATION, "Alta OK", ButtonType.CLOSE);
            a.showAndWait();
        } else {
            Alert a = new Alert(Alert.AlertType.ERROR, "El producto ya existe", ButtonType.CLOSE);
            a.showAndWait();
        }
    }

    @FXML
    private void BotonInperecedero(ActionEvent event) throws IOException {
        boolean altaOk = this.controller.getMerchadona().darAltaProd(fxnombreProd.getText(), Double.parseDouble(fxPrecioProd.getText()));

        if (altaOk) {
            Alert a = new Alert(Alert.AlertType.INFORMATION, "Alta OK", ButtonType.CLOSE);
            a.showAndWait();
        } else {
            Alert a = new Alert(Alert.AlertType.ERROR, "El producto ya existe", ButtonType.CLOSE);
            a.showAndWait();
        }
    }

    @FXML
    private void BotonBorrar(ActionEvent event) throws IOException {
        boolean altaOk = this.controller.getMerchadona().EliminarProducto(fxnombreProd.getText());

        if (altaOk) {
            Alert a = new Alert(Alert.AlertType.INFORMATION, "Baja OK", ButtonType.CLOSE);
            a.showAndWait();
        } else {
            Alert a = new Alert(Alert.AlertType.ERROR, "El producto no existe", ButtonType.CLOSE);
            a.showAndWait();
        }
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void setController(Escena1Controller controller) {
        this.controller = controller;
    }
}
