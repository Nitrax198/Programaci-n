package controllers;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import dao.CochesDAO;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import model.Coche;
import model.Concesionario;
import servicios.CocheService;
import servicios.ConcesionarioService;

/**
 * FXML Controller class
 *
 * @author daw
 */
public class ControllerCoches implements Initializable {

    @FXML
    private TextField fxModelo;

    @FXML
    private TextField fxPrecio;

    @FXML
    private Label fxLabelConcesionario;

    @FXML
    private ListView<Coche> fxListCoches;

    @FXML
    private ListView<Concesionario> fxListConcesionarios;

    @FXML
    public void handleCrear(ActionEvent event) {
        int precio = 0;
        boolean ok = true;

        if (fxListConcesionarios.getSelectionModel().getSelectedItem() == null && fxModelo.getText().trim().length() == 0 && fxPrecio.getText().trim().length() == 0) {
            Alert a = new Alert(Alert.AlertType.ERROR, "Tienes que rellenar los dos campos y seleccionar un concesionario", ButtonType.CLOSE);
            a.showAndWait();
            ok = false;
        } else {
            if (fxModelo.getText().trim().length() == 0) {
                Alert a = new Alert(Alert.AlertType.ERROR, "Tienes que rellenar el modleo", ButtonType.CLOSE);
                a.showAndWait();
                ok = false;
            } else if (fxPrecio.getText().trim().length() == 0) {
                Alert a = new Alert(Alert.AlertType.ERROR, "Tienes que rellenar el precio", ButtonType.CLOSE);
                a.showAndWait();
                ok = false;
            } else if (fxListConcesionarios.getSelectionModel().getSelectedItem() == null) {
                Alert a = new Alert(Alert.AlertType.ERROR, "Tienes que seleccionar un concesionario", ButtonType.CLOSE);
                a.showAndWait();
                ok = false;
            }
            try {
                 precio = Integer.parseInt(fxPrecio.getText());
            } catch (Exception ex) {
                Alert a = new Alert(Alert.AlertType.ERROR, "El precio tiene que ser un número", ButtonType.CLOSE);
                a.showAndWait();
                ok = false;
            }
        }
        if (ok) {

            Coche c = new Coche(fxModelo.getText(), precio, fxListConcesionarios.getSelectionModel().getSelectedItem().getId());
            CocheService conex = new CocheService();

            if (conex.insertCoche(c)) {
                fxListCoches.getItems().add(c);
                Alert b = new Alert(Alert.AlertType.INFORMATION, "Coche creado correctamente", ButtonType.CLOSE);
                b.showAndWait();
                fxListConcesionarios.refresh();
            } else {
                Alert b = new Alert(Alert.AlertType.ERROR, "Ha ocurrido un problema al crear el coche", ButtonType.CLOSE);
                b.showAndWait();
            }
        }
        clearCampos();
    }

    @FXML
    public void handleMouseClicked(MouseEvent event) {
        fxLabelConcesionario.setText(fxListConcesionarios.getSelectionModel().getSelectedItem().getId() + "");
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        cargarDatosLista();
    }

    private void clearCampos() {
        fxModelo.setText("");
        fxPrecio.setText("");
        fxListConcesionarios.getSelectionModel().select(null);
        fxLabelConcesionario.setText("");
    }

    public void cargarDatosLista() {
        CocheService conex = new CocheService();
        fxListCoches.getItems().clear();
        fxListCoches.getItems().addAll(
                conex.getAllCoches());

        fxListConcesionarios.getItems().clear();
        fxListConcesionarios.getItems().addAll(conex.getAllConcesionarios());
    }

}
