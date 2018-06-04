/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import dao.EscuderiasDAO;
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
import servicios.EscuderiasServices;

/**
 * FXML Controller class
 *
 * @author daw
 */
public class CreateEscuderiaController implements Initializable {
    private PrincipalSceneController controller;

    @FXML
    private ListView<Escuderia> fxListEscuderias;

    @FXML
    private TextField fxNombre;

    @FXML
    private TextField fxMarca;
    /**
     * Initializes the controller class.
     */
    
    @FXML
    public void handleMouseClick(MouseEvent event) {
        Escuderia seleccionado = fxListEscuderias.getSelectionModel().getSelectedItem();

        fxNombre.setText(seleccionado.getNombre());
        fxMarca.setText(seleccionado.getMarca());
    }
    
    @FXML
    public void handleInsert(ActionEvent event) {

        boolean ok = true;

        if (fxNombre.getText().trim().length() == 0 && fxMarca.getText().trim().length() == 0) {
            Alert a = new Alert(Alert.AlertType.ERROR, "Tienes que rellenar los dos campos", ButtonType.CLOSE);
            a.showAndWait();
            ok = false;
        } else {
            if (fxNombre.getText().trim().length() == 0) {
                Alert a = new Alert(Alert.AlertType.ERROR, "Tienes que rellenar el nombre", ButtonType.CLOSE);
                a.showAndWait();
                ok = false;
            } else if (fxMarca.getText().trim().length() == 0) {
                Alert a = new Alert(Alert.AlertType.ERROR, "Tienes que rellenar la marca", ButtonType.CLOSE);
                a.showAndWait();
                ok = false;
            }
        }
        if (ok) {

            Escuderia e = new Escuderia(fxNombre.getText(), fxMarca.getText());
            EscuderiasServices conex = new EscuderiasServices();

            if (conex.insertEscuderias(e)) {
                fxListEscuderias.getItems().add(e);
                Alert b = new Alert(Alert.AlertType.INFORMATION, "La Escuderia se ha creado", ButtonType.CLOSE);
                b.showAndWait();
                fxListEscuderias.refresh();
            } else {
                Alert b = new Alert(Alert.AlertType.ERROR, "Ha ocurrido un problema al crear la Escuderia", ButtonType.CLOSE);
                b.showAndWait();
            }
        }
        clearCampos();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cargarDatosLista();
    }

    public void setController(PrincipalSceneController controller) {
        this.controller = controller;
    }

    public void cargarDatosLista() {
        EscuderiasDAO conex = new EscuderiasDAO();
        fxListEscuderias.getItems().clear();
        fxListEscuderias.getItems().addAll(
                conex.getAllEscuderias());
    }
    
    private void clearCampos() {
        fxNombre.setText("");
        fxMarca.setText("");
    }
    
}
