/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlers;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author daw
 */
public class DarDeAltaEmpController implements Initializable {
    private Escena1Controller controller;
    /**
     * Initializes the controller class.
     */
   @FXML
    private ToggleGroup fxTipoEmpleado;
    private TextField fxnombreEmpleado;
    private TextField fxIdEmpleado;
    
//    @FXML
//    private DatePicker fxFecha;
    
//    @FXML 
//    private CheckBox fxCheckPerecedero;
//    

//    @FXML
//    private void clickPerecedero(ActionEvent event)  {
//        fxFecha.setDisable(!fxCheckPerecedero.isSelected());
//    }
    @FXML
    private void clickAltaCajera(ActionEvent event) throws IOException {
        int id=0;
        id = Integer.parseInt(fxIdEmpleado.getText());
        String radio  = ((RadioButton)fxTipoEmpleado.getSelectedToggle()).getText();
//        LocalDate fecha = fxFecha.getValue();
        boolean altaOk = this.controller.getMerchadona().darAltaEmpleado(fxnombreEmpleado.getText(), id, 1);

        if (altaOk) {
            Alert a = new Alert(Alert.AlertType.INFORMATION, "Alta OK", ButtonType.CLOSE);
            //final Stage stage = (Stage) fxUser.getScene().getWindow();
            //a.initOwner(stage);
            a.showAndWait();
        }
        else
        {
            Alert a = new Alert(Alert.AlertType.ERROR, "El id ya existe", ButtonType.CLOSE);
            //final Stage stage = (Stage) fxUser.getScene().getWindow();
            //a.initOwner(stage);
            a.showAndWait();
        }
         
    }
    @FXML
    private void clickAltaReponedor(ActionEvent event) throws IOException {
        int id=0;
        id = Integer.parseInt(fxIdEmpleado.getText());
//        String radio  = ((RadioButton)fxTipoEmpleado.getSelectedToggle()).getText();
//        LocalDate fecha = fxFecha.getValue();
        boolean altaOk = this.controller.getMerchadona().darAltaEmpleado(fxnombreEmpleado.getText(), id, 2);

        if (altaOk) {
            Alert a = new Alert(Alert.AlertType.INFORMATION, "Alta OK", ButtonType.CLOSE);
            //final Stage stage = (Stage) fxUser.getScene().getWindow();
            //a.initOwner(stage);
            a.showAndWait();
        }
        else
        {
            Alert a = new Alert(Alert.AlertType.ERROR, "El id ya existe", ButtonType.CLOSE);
            //final Stage stage = (Stage) fxUser.getScene().getWindow();
            //a.initOwner(stage);
            a.showAndWait();
        }
         
    }
    @FXML
    private void EliminarEmpleado(ActionEvent event) throws IOException {
        int id=0;
        id = Integer.parseInt(fxIdEmpleado.getText());
//        String radio  = ((RadioButton)fxTipoEmpleado.getSelectedToggle()).getText();
//        LocalDate fecha = fxFecha.getValue();
        boolean altaOk = this.controller.getMerchadona().EliminarEmpleado(id);

        if (altaOk) {
            Alert a = new Alert(Alert.AlertType.INFORMATION, "Alta OK", ButtonType.CLOSE);
            //final Stage stage = (Stage) fxUser.getScene().getWindow();
            //a.initOwner(stage);
            a.showAndWait();
        }
        else
        {
            Alert a = new Alert(Alert.AlertType.ERROR, "El id ya existe", ButtonType.CLOSE);
            //final Stage stage = (Stage) fxUser.getScene().getWindow();
            //a.initOwner(stage);
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
