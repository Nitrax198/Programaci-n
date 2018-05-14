/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import config.Configuration;
import dao.AlumnosDAO;
import dao.AsignaturasDAO;
import dao.ConexionSimpleBD;
import dao.NotasDAO;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import model.Alumno;
import model.Asignatura;

/**
 * FXML Controller class
 *
 * @author daw
 */
public class PgPrincipalController implements Initializable {

    private AlumnosDAO cx;
    private AsignaturasDAO cz;
    private NotasDAO cy;
    /**
     * Initializes the controller class.
     */
    @FXML
    private BorderPane fxRoot;

    @FXML
    private AnchorPane sceneAlm;

    private Alumno alumno;
    private Asignatura asignatura;

    @FXML
    private AnchorPane sceneAsig;

    @FXML
    private AnchorPane sceneAlm_Asig;

    @FXML
    private AnchorPane sceneNotas;

    long id;

    @FXML
    public void BotonIrAlumnos(ActionEvent event) {

        fxRoot.setCenter(sceneAlm);
    }

    @FXML
    public void BotonIrAsignaturas(ActionEvent event) {

        fxRoot.setCenter(sceneAsig);
    }

    @FXML
    public void BotonIrAlm_Asig(ActionEvent event) {

        fxRoot.setCenter(sceneAlm_Asig);
    }

    @FXML
    public void BotonIrNotas(ActionEvent event) {

        fxRoot.setCenter(sceneNotas);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        try {
            // TODO
            AlumnosDAO a = new AlumnosDAO();
            cx = new AlumnosDAO();
            AsignaturasDAO b = new AsignaturasDAO();
            cz = new AsignaturasDAO();

            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource("/fxml/Alumnos.fxml"));
            sceneAlm = loader.load();
            AlumnosController controllerAlm = loader.getController();
            controllerAlm.setController(this);

            loader = new FXMLLoader(
                    getClass().getResource("/fxml/Asignaturas.fxml"));
            sceneAsig = loader.load();
            AsignaturasController controllerAsig = loader.getController();
            controllerAsig.setController(this);

            loader = new FXMLLoader(
                    getClass().getResource("/fxml/VincularAlumnos.fxml"));
            sceneAlm_Asig = loader.load();
            VincularAlumnosController controllerAlm_Asig = loader.getController();
            controllerAlm_Asig.setController(this);

            loader = new FXMLLoader(
                    getClass().getResource("/fxml/AñadirNotas.fxml"));
            sceneNotas = loader.load();
            AñadirNotasController controllerNotas = loader.getController();
            controllerNotas.setController(this);

        } catch (IOException ex) {
            Logger.getLogger(PgPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
        fxRoot.setCenter(sceneAlm);
    }

    public void cargarSceneAlm() {
        fxRoot.setCenter(sceneAlm);
    }

    public void cargarSceneAsig() {
        fxRoot.setCenter(sceneAsig);
    }
    
    public void cargarSceneNotas() {
        fxRoot.setCenter(sceneNotas);
    }
    
    public void cargarSceneAlm_Asig() {
        fxRoot.setCenter(sceneAlm_Asig);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

}
