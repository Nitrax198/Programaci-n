/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import dao.PilotosDAO;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import model.Escuderia;
import model.Pilot;
import servicios.EscuderiasServices;
import servicios.PilotServices;

/**
 * FXML Controller class
 *
 * @author daw
 */
public class TwentyOnePilotsController implements Initializable {
    private PrincipalSceneController controller;
    
    @FXML
    private ListView<Pilot> fxListPilotos;

    @FXML
    private TextField fxNombre;
    /**
     * Initializes the controller class.
     */
    
    @FXML
    public void handleMouseClick(MouseEvent event) {
        Pilot seleccionado = fxListPilotos.getSelectionModel().getSelectedItem();

        fxNombre.setText(seleccionado.getNombre());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    public void handleInsert(ActionEvent event) {

        boolean ok = true;

        if (fxNombre.getText().trim().length() == 0 ) {
            Alert a = new Alert(Alert.AlertType.ERROR, "Tienes que rellenar los dos campos", ButtonType.CLOSE);
            a.showAndWait();
            ok = false;
        } else {
            if (fxNombre.getText().trim().length() == 0) {
                Alert a = new Alert(Alert.AlertType.ERROR, "Tienes que rellenar el nombre", ButtonType.CLOSE);
                a.showAndWait();
                ok = false;
            } 
        }
        if (ok) {

            Pilot p = new Pilot(fxNombre.getText());
            PilotServices conex = new PilotServices();

            if (conex.insertPilotos(p)) {
                fxListPilotos.getItems().add(p);
                Alert b = new Alert(Alert.AlertType.INFORMATION, "La El piloto se ha creado", ButtonType.CLOSE);
                b.showAndWait();
                fxListPilotos.refresh();
            } else {
                Alert b = new Alert(Alert.AlertType.ERROR, "Ha ocurrido un problema al crear el Piloto", ButtonType.CLOSE);
                b.showAndWait();
            }
        }
        clearCampos();
    }
    
    public void setController(PrincipalSceneController controller) {
        this.controller = controller;
    }
    
    public void cargarDatosLista() {
        PilotosDAO conex = new PilotosDAO();
        fxListPilotos.getItems().clear();
        fxListPilotos.getItems().addAll(
                conex.getAllPilots());
    }
    
    private void clearCampos() {
        fxNombre.setText("");
    }
}
