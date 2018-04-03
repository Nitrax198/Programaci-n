/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuControler;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author daw
 */
public class FXMLController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private BorderPane fxroot;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    public void handleScene1(ActionEvent event) throws IOException {
        AnchorPane anchor;
        //load up OTHER FXML document
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/FXMLScene.fxml"));
        anchor = loader.load();
        FXMLSceneController controller = loader.getController();
        fxroot.setCenter(anchor);

    }

    public void handleScene2(ActionEvent event) throws IOException {
        AnchorPane anchor;
        //load up OTHER FXML document
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/FXMLNewScene.fxml"));
        anchor = loader.load();
        FXMLNewSceneController controller = loader.getController();
        fxroot.setCenter(anchor);

    }
}
