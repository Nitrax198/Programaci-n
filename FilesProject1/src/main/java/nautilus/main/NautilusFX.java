/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nautilus.main;

import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author daw
 */
public class NautilusFX extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {

            //BorderPane root = FXMLLoader.load(getClass().getResource("/fxml/FXMLMenu.fxml"));
            FXMLLoader loaderMenu = new FXMLLoader(
              getClass().getResource("/fxml/PgPrincipal.fxml"));
            AnchorPane root = loaderMenu.load();
           
            
            Scene scene = new Scene(root);
            
            primaryStage.setTitle("Hello World!");
            primaryStage.setScene(scene);
            primaryStage.show();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
