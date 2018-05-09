/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

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
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import model.Alumno;

/**
 * FXML Controller class
 *
 * @author daw
 */
public class AlumnosController implements Initializable {

    private ConexionSimpleBD cx;
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

//    CheckBox DatePicker TextField
    @FXML
    public void BotonCreate(ActionEvent event) {
        if (nombrefx.getText() == null) {
            System.out.println("Por favor escribe el nombre");
        }
        if (fechaNacfx.getValue() == null) {
            System.out.println("Por favor escribe una fecha ");
        }
        if (nombrefx.getText() != null && fechaNacfx.getValue() != null) {
            String nombre = nombrefx.getText();
            Date fechaNac = java.sql.Date.valueOf(fechaNacfx.getValue());
            boolean MayorEd = fxMayoriaEdad.isSelected();
            Alumno a = new Alumno(nombre, fechaNac, MayorEd);
            cx.insertAlumnoJDBC(a);
        }
        controller.getFxListAlum().refresh();
        controller.cargarDatosLista();
    }

    @FXML
    public void BotonUpdate(ActionEvent event) {
        String nombre = nombrefx.getText();
        Date fechaNac = java.sql.Date.valueOf(fechaNacfx.getValue());
        boolean MayorEd = fxMayoriaEdad.isSelected();
        Alumno a = new Alumno(nombre, fechaNac, MayorEd);
        a.setId(controller.getFxListAlum().getSelectionModel().getSelectedItem().getId());
        cx.updateAlumnoJDBC(a);
    }

    @FXML
    public void BotonDelete(ActionEvent event) {
        long id = controller.getFxListAlum().getSelectionModel().getSelectedItem().getId();
        cx.deleteAlumno(id);
        controller.cargarDatosLista();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        controller.cargarDatosLista();
    }

    public void setController(PgPrincipalController controller) {
        this.controller = controller;
    }
}
