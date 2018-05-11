/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import dao.ConexionSimpleBD;
import java.io.IOException;
import java.util.List;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import model.Alumno;
import model.Asignatura;

/**
 *
 * @author user
 */
public class Main extends Application{
    
    @Override
    public void start(Stage primaryStage) throws IOException {

            //BorderPane root = FXMLLoader.load(getClass().getResource("/fxml/FXMLMenu.fxml"));
            FXMLLoader loaderMenu = new FXMLLoader(
              getClass().getResource("/fxml/PgPrincipal.fxml"));
            BorderPane root = loaderMenu.load();
           
            
            Scene scene = new Scene(root);
            
            primaryStage.setTitle("Hello World!");
            primaryStage.setScene(scene);
            primaryStage.show();

    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
