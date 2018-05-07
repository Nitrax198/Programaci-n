/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import config.Configuration;
import dao.AlumnosDAO;
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
    
    List<Alumno> lista = new ArrayList<>();
    
    long id;
    
    @FXML
    public void BotonIrAlumnos(ActionEvent event) {
        
        fxRoot.setCenter(sceneAlm);
    }
    @FXML
    public void BotonIrAsignaturas(ActionEvent event) {
        
        fxRoot.setCenter(sceneAsig);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        try {
            // TODO

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
    public int AñadirAlumno(Alumno a) {
        Connection con = null;
        PreparedStatement stmt = null;
        int filas = -1;
        try {
            Class.forName(Configuration.getInstance().getDriverDB());

            con = DriverManager.getConnection(
              Configuration.getInstance().getUrlDB(),
              Configuration.getInstance().getUserDB(),
              Configuration.getInstance().getPassDB());

            stmt = con.prepareStatement("INSERT INTO alumnos "
              + "(NOMBRE,FECHA_NACIMIENTO,MAYOR_EDAD)  "
              + "VALUES (?,?,?)", Statement.RETURN_GENERATED_KEYS);

            stmt.setString(1, a.getNombre());

            stmt.setDate(2,
              new java.sql.Date(a.getFecha_nacimiento().getTime()));

            stmt.setBoolean(3, a.getMayor_edad());

            

            filas = stmt.executeUpdate();
            
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                a.setId(rs.getInt(1));
            }
        } catch (Exception ex) {
            Logger.getLogger(AlumnosDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {

                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(AlumnosDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return filas;

    }
    public void DarId() {
        for (int i = 0; i < lista.size(); i++) {
            id = i+1;
        }
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
