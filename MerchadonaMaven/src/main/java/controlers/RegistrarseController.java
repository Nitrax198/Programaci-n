/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author daw
 */
public class RegistrarseController implements Initializable {

    private Escena1Controller controller;

    @FXML
    private TextField fxUser;

    /**
     * Initializes the controller class.
     */
    @FXML
    private void handleLoginAction(ActionEvent event) throws IOException {

        Alert a = new Alert(Alert.AlertType.ERROR, "El numero no es valido", ButtonType.CLOSE);
        try {
            // mirar varaib le de login
            int empleadoID = Integer.parseInt(fxUser.getText());

            //Empleado emp = this.controller.getMerchadona().login(empleadoID);
            switch (this.controller.getMerchadona().tipoEmpleado(empleadoID)) {
                case 1:
                    this.controller.habilitaMenuAdmin();
                    break;
                case 2:
                    this.controller.habilitaMenuReponedor();
                    break;
                case 3:
                    this.controller.habilitaMenuCajera();
                    break;
                case 0:
                    a.setContentText("id de usuario no valido");
                    a.showAndWait();
                    break;
            }

        } catch (Exception e) {
            a.setContentText("el id no es un número");
            a.showAndWait();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void setController(Escena1Controller controller) {
        this.controller = controller;
    }
}
