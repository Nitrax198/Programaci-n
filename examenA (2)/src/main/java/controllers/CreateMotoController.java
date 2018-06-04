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
import model.Escuderia;
import model.Moto;
import model.Pilot;
import servicios.MotosServices;

/**
 * FXML Controller class
 *
 * @author daw
 */
public class CreateMotoController implements Initializable {
    private PrincipalSceneController controller;
    
    @FXML
    private ListView<Pilot> fxListPilotos;
    
    @FXML
    private ListView<Escuderia> fxListEscuderias;
    
    @FXML
    private ListView<Moto> fxListMotos;
    
    @FXML
    private TextField fxNumero;

    /**
     * Initializes the controller class.
     */
    
        @FXML
    public void handleCrear(ActionEvent event) {
        int numero = 0;
        boolean ok = true;

        if (fxListPilotos.getSelectionModel().getSelectedItem() == null && fxNumero.getText().trim().length() == 0 && fxListEscuderias.getSelectionModel().getSelectedItem() == null) {
            Alert a = new Alert(Alert.AlertType.ERROR, "Tienes que seleccionar la escuderia y el piloto y rellenar el numero", ButtonType.CLOSE);
            a.showAndWait();
            ok = false;
        } else {
            if (fxNumero.getText().trim().length() == 0) {
                Alert a = new Alert(Alert.AlertType.ERROR, "Tienes que rellenar el Numero", ButtonType.CLOSE);
                a.showAndWait();
                ok = false;
            } else if (fxListPilotos.getSelectionModel().getSelectedItem() == null) {
                Alert a = new Alert(Alert.AlertType.ERROR, "Tienes que seleccionar un Piloto", ButtonType.CLOSE);
                a.showAndWait();
                ok = false;
            } else if (fxListEscuderias.getSelectionModel().getSelectedItem() == null) {
                Alert a = new Alert(Alert.AlertType.ERROR, "Tienes que seleccionar una Escuderia", ButtonType.CLOSE);
                a.showAndWait();
                ok = false;
            }
            try {
                 numero = Integer.parseInt(fxNumero.getText());
            } catch (Exception ex) {
                Alert a = new Alert(Alert.AlertType.ERROR, "El Numero tiene que ser un número", ButtonType.CLOSE);
                a.showAndWait();
                ok = false;
            }
        }
        if (ok) {

            Moto m = new Moto(numero, fxListEscuderias.getSelectionModel().getSelectedItem().getId(),fxListPilotos.getSelectionModel().getSelectedItem().getId());
            MotosServices conex = new MotosServices();

            if (conex.insertMoto(m)) {
                fxListMotos.getItems().add(m);
                Alert b = new Alert(Alert.AlertType.INFORMATION, "Moto creada correctamente", ButtonType.CLOSE);
                b.showAndWait();
                fxListEscuderias.refresh();
            } else {
                Alert b = new Alert(Alert.AlertType.ERROR, "Ha ocurrido un problema al crear La moto", ButtonType.CLOSE);
                b.showAndWait();
            }
        }
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        cargarLista();
    }    
    public void setController(PrincipalSceneController controller) {
        this.controller = controller;
    }
    public void cargarLista() {
        MotosServices conex = new MotosServices();
        fxListMotos.getItems().clear();
        fxListMotos.getItems().addAll(
                conex.getAllPilots());

        fxListEscuderias.getItems().clear();
        fxListEscuderias.getItems().addAll(conex.getAllEscuderias());
        fxListPilotos.getItems().clear();
        fxListPilotos.getItems().addAll(conex.getAllEscuderias());
    }
    
}
