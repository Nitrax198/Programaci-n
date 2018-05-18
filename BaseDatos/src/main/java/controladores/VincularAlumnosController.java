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
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
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
public class VincularAlumnosController implements Initializable {

    private AlumnosServicios cx;
    private AsignaturasServicios cz;
    private NotasServivios cy;
    private PgPrincipalController controller;

    @FXML
    private ListView<Alumno> fxListAlum;

    @FXML
    private ComboBox<Asignatura> fxListAsig;

    /**
     * Initializes the controller class.
     */
    @FXML
    public void BotonDelete(ActionEvent event) {
        long id = fxListAlum.getSelectionModel().getSelectedItem().getId();
        Alumno a = fxListAlum.getSelectionModel().getSelectedItem();
        if (cx.deleteAlumno(id) == -2) {
            Alert alert = new Alert(AlertType.CONFIRMATION);
            alert.setTitle("Cuidado");
            alert.setHeaderText("Nadie pasa de esta esquina");
            alert.setContentText("Aquí mandan las divinas");
            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ButtonType.OK) {
                cx.delForce(a);
            }
        }

        cargarDatosLista();
        Alert b = new Alert(Alert.AlertType.INFORMATION, "¿Está seguro de que lo quiere borrar? Pues ya es tarde ", ButtonType.CLOSE);
        b.showAndWait();
    }
    @FXML
    public void BotonVincular(ActionEvent event) {
        Alumno a = fxListAlum.getSelectionModel().getSelectedItem();
        Asignatura b = fxListAsig.getSelectionModel().getSelectedItem();
        cy.vincularAlumnosYAsignaturas(a, b);
        cargarDatosLista();
        Alert c = new Alert(Alert.AlertType.INFORMATION, "¿Está seguro de que lo quiere borrar? Pues ya es tarde ", ButtonType.CLOSE);
        c.showAndWait();
    }
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        cx = new AlumnosServicios();
        cz = new AsignaturasServicios();
        cargarDatosLista();
    }

    public void setController(PgPrincipalController controller) {
        this.controller = controller;
    }

    public void cargarDatosLista() {

        fxListAsig.getItems().clear();
        fxListAsig.getItems().addAll(
                cz.getAllAsignaturas());

        fxListAlum.getItems().clear();
        fxListAlum.getItems().addAll(
                cx.getAllAlumnos());
    }
}
