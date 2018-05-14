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
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import model.Alumno;
import model.Asignatura;

/**
 * FXML Controller class
 *
 * @author daw
 */
public class VincularAlumnosController implements Initializable {

    private AlumnosDAO cx;
    private AsignaturasDAO cz;
    private NotasDAO cy;
    private PgPrincipalController controller;

    @FXML
    private ListView<Alumno> fxListAlum;

    @FXML
    private ListView<Asignatura> fxListAsig;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        AlumnosDAO cx = new AlumnosDAO();
        cx = new AlumnosDAO();
        cargarDatosLista();
        AsignaturasDAO cz = new AsignaturasDAO();
        cz = new AsignaturasDAO();
        cargarDatosLista();
    }

    public void setController(PgPrincipalController controller) {
        this.controller = controller;
    }

    public void cargarDatosLista() {

        fxListAsig.getItems().clear();
        fxListAsig.getItems().addAll(
                cz.getAllAsignaturasJDBC());

        fxListAlum.getItems().clear();
        fxListAlum.getItems().addAll(
                cx.getAllAlumnosJDBC());
    }
}
