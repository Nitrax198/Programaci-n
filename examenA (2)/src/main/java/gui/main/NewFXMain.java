/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.main;

import controllers.CreateEscuderiaController;
import controllers.PrincipalSceneController;
import init.CrearModelo;
import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author oscar
 */
public class NewFXMain extends Application {
    
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loaderMenu = new FXMLLoader(
          getClass().getResource("/fxml/PrincipalScene.fxml"));
        Parent root = loaderMenu.load();
       
        Scene scene = new Scene(root);
        
        
        stage.setTitle("Deja vu");
        stage.setScene(scene);
       
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CrearModelo crear = new CrearModelo();
        crear.crearModeloJDBC();
        //crear.insertarDatosPrueba();
        //DESCOMENTAR ESTO PARA QUE CARGUE LA PANTALLA
        launch(args);
        
//        @Override
//    public void start(Stage stage) throws IOException {
//      FXMLLoader loaderMenu = new FXMLLoader(
//                getClass().getResource("/fxml/FXMLPrincipalScene.fxml"));
//        BorderPane root = loaderMenu.load();
//        PrincipalSceneController menuController = loaderMenu.getController();
//
//        
//        AnchorPane anchor;
//        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/CreateEscuderia.fxml"));
//        anchor = loader.load();
//
//        CreateEscuderiaController controller = loader.getController();
//        controller.cargarDatosLista();
//
//        root.setCenter(anchor);
//        Scene scene = new Scene(root);
//        stage.setTitle("Deja vu");
//        stage.setScene(scene);
//        stage.show();
//    }

    }
    
//       FXMLLoader loaderMenu = new FXMLLoader(
//          getClass().getResource("/fxml/PrincipalScene.fxml"));
//        Parent root = loaderMenu.load();
//       
//        Scene scene = new Scene(root);
//        
//        
//        stage.setTitle("Deja vu");
//        stage.setScene(scene);
//       
//        stage.show();
//    }

}
