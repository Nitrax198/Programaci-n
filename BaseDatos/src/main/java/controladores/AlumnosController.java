/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import dao.AlumnosDAO;
import dao.ConexionSimpleBD;
import java.io.File;
import java.net.URL;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import model.Alumno;
import servicios.AlumnosServicios;

/**
 * FXML Controller class
 *
 * @author daw
 */
public class AlumnosController implements Initializable {

//    private ConexionSimpleBD cx;
    private AlumnosServicios cx;
    private PgPrincipalController controller;
    /**
     * Initializes the controller class.
     */
    @FXML
    private TextField nombrefx;
    @FXML
    private DatePicker fechaNacfx;
    @FXML
    private CheckBox fxMayoriaEdad;
    @FXML
    private ListView<Alumno> fxListAlum;

//    CheckBox DatePicker TextField
    @FXML
    public void BotonCreate(ActionEvent event) {

        if (nombrefx.getText() != null && fechaNacfx.getValue() != null) {
            String nombre = nombrefx.getText();
            Date fechaNac = java.sql.Date.valueOf(fechaNacfx.getValue());
            boolean MayorEd = fxMayoriaEdad.isSelected();
            Alumno a = new Alumno(nombre, fechaNac, MayorEd);
            cx.insertAlumno(a);
            Alert b = new Alert(Alert.AlertType.INFORMATION, "El alumno se ha creado con exito", ButtonType.CLOSE);
            b.showAndWait();
        }
        fxListAlum.refresh();
        cargarDatosLista();

    }

    @FXML
    public void BotonUpdate(ActionEvent event) {
        String nombre = nombrefx.getText();
        Date fechaNac = java.sql.Date.valueOf(fechaNacfx.getValue());
        boolean MayorEd = fxMayoriaEdad.isSelected();
        Alumno a = new Alumno(nombre, fechaNac, MayorEd);
        a.setId(fxListAlum.getSelectionModel().getSelectedItem().getId());
        cx.updateAlumno(a);
        Alert b = new Alert(Alert.AlertType.INFORMATION, "Alumno actualizado", ButtonType.CLOSE);
        b.showAndWait();
    }

    @FXML
    public void BotonDelete(ActionEvent event) {
        long id = fxListAlum.getSelectionModel().getSelectedItem().getId();
        cx.deleteAlumno(id);
        cargarDatosLista();
        Alert b = new Alert(Alert.AlertType.INFORMATION, "¿Está seguro de que lo quiere borrar? Pues ya es tarde ", ButtonType.CLOSE);
        b.showAndWait();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cx = new AlumnosServicios();
        cargarDatosLista();
    }

    public void setController(PgPrincipalController controller) {
        this.controller = controller;
    }

    public void cargarDatosLista() {

        fxListAlum.getItems().clear();
        fxListAlum.getItems().addAll(
                cx.getAllAlumnos());
    }
    public void cargarAlumnosCajas() {
        nombrefx.setText(fxListAlum.getSelectionModel().getSelectedItem().getNombre());
    }
}
