/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import dao.AlumnosDAO;
import dao.AsignaturasDAO;
import dao.NotasDAO;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import model.Alumno;
import model.Asignatura;
import servicios.AlumnosServicios;
import servicios.AsignaturasServicios;
import servicios.NotasServivios;

/**
 * FXML Controller class
 *
 * @author daw
 */
public class AñadirNotasController implements Initializable {

    private AlumnosServicios cx;
    private AsignaturasServicios cz;
    private NotasServivios cy;
    private PgPrincipalController controller;

    @FXML
    private ListView<Alumno> fxListAlum;

    @FXML
    private ComboBox<Asignatura> fxListAsig;
    
    @FXML
    private TextField fxNota;

    /**
     * Initializes the controller class.
     */
    @FXML
    public void BotonAñadirNota(ActionEvent event) {
        Alumno a = fxListAlum.getSelectionModel().getSelectedItem();
        Asignatura b = fxListAsig.getSelectionModel().getSelectedItem();
        int nota = Integer.parseInt(fxNota.getText());
        cy.updateNotas(a, b, nota);
        cargarDatosLista();
        Alert c = new Alert(Alert.AlertType.INFORMATION, "La nota ha sido actualizada", ButtonType.CLOSE);
        c.showAndWait();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        cx = new AlumnosServicios();
        cz = new AsignaturasServicios();
        cy = new NotasServivios();
        cargarDatosLista();
    }

    public void setController(PgPrincipalController controller) {
        this.controller = controller;
    }

    public void cargarDatosLista() {

        fxListAsig.getItems().clear();
        fxListAsig.getItems().addAll(
                cz.getAsignaturasAlumnos());

        fxListAlum.getItems().clear();
        fxListAlum.getItems().addAll(
                cx.getAllAlumnos());
    }
}
