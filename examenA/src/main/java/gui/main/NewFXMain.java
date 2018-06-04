/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.main;

import controllers.ControllerConcesionarios;
import controllers.ControllerMenu;
import init.CrearModelo;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author oscar
 */
public class NewFXMain extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loaderMenu = new FXMLLoader(
                getClass().getResource("/fxml/FXMLmenu.fxml"));
        BorderPane root = loaderMenu.load();
        ControllerMenu menuController = loaderMenu.getController();

        
        AnchorPane anchor;
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/FXMLConcesionarios.fxml"));
        anchor = loader.load();

        ControllerConcesionarios controller = loader.getController();
        controller.cargarDatosLista();

        root.setCenter(anchor);
        Scene scene = new Scene(root);
        stage.setTitle("Vendo Opel Corsa");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        CrearModelo crear = new CrearModelo();
        crear.crearModeloJDBC();
        crear.insertarDatosPrueba();
        crear.leerFichero();
        launch(args);

    }

}
