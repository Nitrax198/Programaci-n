/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import dao.ConexionSimpleBD;
import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import model.Alumno;
import model.Asignatura;

/**
 * FXML Controller class
 *
 * @author daw
 */
public class AsignaturasController implements Initializable {

    private ConexionSimpleBD cx;
    private PgPrincipalController controller;
    /**
     * Initializes the controller class.
     */
    @FXML
    private TextField nombrefx;

    @FXML
    private TextField ciclofx;

    @FXML
    private TextField cursofx;

//    CheckBox DatePicker TextField
    @FXML
    public void BotonCreate(ActionEvent event) {
        if (nombrefx.getText() == null) {
            System.out.println("Por favor escribe el nombre");
        }
        if (ciclofx.getText() == null) {
            System.out.println("Por favor escribe el ciclo");
        }
        if (cursofx.getText() == null) {
            System.out.println("Por favor escribe el curso");
        }
        if (nombrefx.getText() != null && cursofx.getText() != null && ciclofx.getText() != null) {
            String nombre = nombrefx.getText();
            String curso = nombrefx.getText();
            String ciclo = nombrefx.getText();
            Asignatura s = new Asignatura(nombre, curso, ciclo);
            cx.insertAsignaturasJDBC(s);
        }
        controller.getFxListAsig().refresh();
        controller.cargarDatosLista();
    }

    @FXML
    public void BotonUpdate(ActionEvent event) {
        String nombre = nombrefx.getText();
        String curso = nombrefx.getText();
        String ciclo = nombrefx.getText();
        Asignatura s = new Asignatura(nombre, curso, ciclo);
        s.setId(controller.getFxListAsig().getSelectionModel().getSelectedItem().getId());
        cx.updateAsignaturasJDBC(s);
    }

    @FXML
    public void BotonDelete(ActionEvent event) {
        long id = controller.getFxListAsig().getSelectionModel().getSelectedItem().getId();
        cx.deleteAsignaturas(id);
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
