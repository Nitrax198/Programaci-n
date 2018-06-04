/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import dao.ConcesionariosDAO;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import model.Concesionario;
import servicios.ConcesionarioService;

/**
 * FXML Controller class
 *
 * @author daw
 */
public class ControllerConcesionarios implements Initializable {

    /**
     * Initializes the controller class.
     */
    private ControllerMenu controller;

//    private AlumnoService conex;
    private AnchorPane sceneAsignaturas;

    @FXML
    private TextField fxNombre;

    @FXML
    private TextField fxMarca;

    @FXML
    private ListView<Concesionario> fxListConcesionarios;

    @FXML
    public void handleMouseClick(MouseEvent event) {
        Concesionario seleccionado = fxListConcesionarios.getSelectionModel().getSelectedItem();

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

            Concesionario c = new Concesionario(fxNombre.getText(), fxMarca.getText());
            ConcesionarioService conex = new ConcesionarioService();

            if (conex.insertConcesionario(c)) {
                fxListConcesionarios.getItems().add(c);
                Alert b = new Alert(Alert.AlertType.INFORMATION, "Concesionario creado correctamente", ButtonType.CLOSE);
                b.showAndWait();
                fxListConcesionarios.refresh();
            } else {
                Alert b = new Alert(Alert.AlertType.ERROR, "Ha ocurrido un problema al crear el concesionario", ButtonType.CLOSE);
                b.showAndWait();
            }
        }
        clearCampos();
    }

    @FXML
    public void handleUpdate(ActionEvent event) {

        boolean ok = true;

        if (fxListConcesionarios.getSelectionModel().getSelectedItem() == null) {
            Alert a = new Alert(Alert.AlertType.ERROR, "Tienes que seleccionar un concesionario", ButtonType.CLOSE);
            a.showAndWait();
        } else {

            if (fxNombre.getText().trim().length() == 0 && fxMarca.getText().trim().length() == 0) {
                Alert a = new Alert(Alert.AlertType.ERROR, "Tienes que rellenar el nombre y la marca", ButtonType.CLOSE);
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
                ConcesionarioService conex = new ConcesionarioService();
                String nombre = fxNombre.getText();
                String marca = fxMarca.getText();

                Concesionario original = fxListConcesionarios.getSelectionModel().getSelectedItem();

                Concesionario c = new Concesionario(nombre, marca);
                c.setId(original.getId());

                if (conex.updateConcesionario(c)) {

                    fxListConcesionarios.getItems().set(fxListConcesionarios.getItems().indexOf(original), c);
                    Alert b = new Alert(Alert.AlertType.INFORMATION, "Concesionario actualizado correctamente", ButtonType.CLOSE);
                    b.showAndWait();
                    fxListConcesionarios.refresh();
                } else {
                    Alert b = new Alert(Alert.AlertType.ERROR, "Ha ocurrido un problema al actualizar el concesionario", ButtonType.CLOSE);
                    b.showAndWait();
                }
            }
        }
        clearCampos();
    }

    @FXML
    public void handleDelete(ActionEvent event) throws SQLException {
        if (fxListConcesionarios.getSelectionModel().getSelectedItem() == null) {
            Alert a = new Alert(Alert.AlertType.ERROR, "Tienes que seleccionar un concesionario", ButtonType.CLOSE);
            a.showAndWait();
        } else {
            ConcesionarioService conex = new ConcesionarioService();
            Concesionario c = fxListConcesionarios.getSelectionModel().getSelectedItem();
            Integer id = c.getId();

            if (conex.deleteConcesionario(c)) {
                fxListConcesionarios.getItems().remove(c);
                Alert b = new Alert(Alert.AlertType.INFORMATION, "Concesionario borrado correctamente", ButtonType.CLOSE);
                b.showAndWait();
                fxListConcesionarios.refresh();
            } else {
                Alert b = new Alert(Alert.AlertType.ERROR, "Ha ocurrido un problema al borrar el concesionario", ButtonType.CLOSE);
                b.showAndWait();
            }
        }
        clearCampos();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cargarDatosLista();
    }

    public void cargarDatosLista() {
        ConcesionariosDAO conex = new ConcesionariosDAO();
        fxListConcesionarios.getItems().clear();
        fxListConcesionarios.getItems().addAll(
                conex.getAllConcesionarios());
    }

    private void clearCampos() {
        fxNombre.setText("");
        fxMarca.setText("");
    }

    public void setController(ControllerMenu controller) {
        this.controller = controller;
    }

}
