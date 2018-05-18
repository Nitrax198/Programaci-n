/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import dao.AsignaturasDAO;
import dao.ConexionSimpleBD;
import java.net.URL;
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
import model.Alumno;
import model.Asignatura;
import servicios.AsignaturasServicios;

/**
 * FXML Controller class
 *
 * @author daw
 */
public class AsignaturasController implements Initializable {

    private AsignaturasServicios cx;
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
    @FXML
    private ListView<Asignatura> fxListAsig;

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
            cx.insertAsignaturas(s);
            Alert b = new Alert(Alert.AlertType.INFORMATION, "La Asignatura ha sido creada con exito", ButtonType.CLOSE);
            b.showAndWait();
        }
        fxListAsig.refresh();
        cargarDatosLista();
    }

    @FXML
    public void BotonUpdate(ActionEvent event) {
        Asignatura asig = fxListAsig.getSelectionModel().getSelectedItem();
        String nombre = nombrefx.getText();
        String curso = cursofx.getText();
        String ciclo = ciclofx.getText();
        asig.setNombre(nombre);
        asig.setCiclo(ciclo);
        asig.setCurso(curso);
        cx.updateAsignaturas(asig);
        fxListAsig.refresh();
        Alert b = new Alert(Alert.AlertType.INFORMATION, "Asignatura Actualizada", ButtonType.CLOSE);
        b.showAndWait();
    }

    @FXML
    public void BotonDelete(ActionEvent event) {
        long id = fxListAsig.getSelectionModel().getSelectedItem().getId();
        cx.deleteAsignaturas(id);
        cargarDatosLista();
        Alert b = new Alert(Alert.AlertType.INFORMATION, "¿Está seguro de que lo quiere borrar? Pues ya es tarde ", ButtonType.CLOSE);
        b.showAndWait();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cx = new AsignaturasServicios();
        cargarDatosLista();
        
    }

    public void setController(PgPrincipalController controller) {
        this.controller = controller;
    }

    public void cargarDatosLista() {

        fxListAsig.getItems().clear();
        fxListAsig.getItems().addAll(
                cx.getAllAsignaturas());

    }
    public void cargarAsignaturaCajas() {
        nombrefx.setText(fxListAsig.getSelectionModel().getSelectedItem().getNombre());
        cursofx.setText(fxListAsig.getSelectionModel().getSelectedItem().getCurso());
        ciclofx.setText(fxListAsig.getSelectionModel().getSelectedItem().getCiclo());
    }
}
