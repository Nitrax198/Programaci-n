package controllers;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class ControllerMenu implements Initializable {

    @FXML
    private BorderPane fxRoot;

    @FXML
    private Menu fxBotonConcesionarios;

    @FXML
    private Menu fxBotonCoches;

    @FXML
    private Menu fxBotonVentaCoches;

    @FXML
    public void handleCrearCoches(ActionEvent event) throws IOException {
        AnchorPane anchor;
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/FXMLCoches.fxml"));
        anchor = loader.load();

        ControllerCoches controller = loader.getController();
//        controller.cargarDatosTablaAlumnos();

        fxBotonConcesionarios.setVisible(true);
        fxBotonCoches.setVisible(false);
        fxBotonVentaCoches.setVisible(true);

        fxRoot.setCenter(anchor);
    }

    @FXML
    public void handleCrudConcesionarios(ActionEvent event) throws IOException {
        AnchorPane anchor;
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/FXMLConcesionarios.fxml"));
        anchor = loader.load();

        ControllerConcesionarios controller = loader.getController();

        fxBotonConcesionarios.setVisible(false);
        fxBotonCoches.setVisible(true);
        fxBotonVentaCoches.setVisible(true);

        fxRoot.setCenter(anchor);
    }

    @FXML
    public void handleVentaCoches(ActionEvent event) throws IOException {
        AnchorPane anchor;
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/FXMLVentaCoches.fxml"));
        anchor = loader.load();

        ControllerVentaCoches controller = loader.getController();

        fxBotonConcesionarios.setVisible(true);
        fxBotonCoches.setVisible(true);
        fxBotonVentaCoches.setVisible(false);

        fxRoot.setCenter(anchor);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }
}
