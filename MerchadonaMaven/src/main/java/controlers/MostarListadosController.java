/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import merchadona.modelo.Cajera;
import merchadona.modelo.Empleado;
import merchadona.modelo.Producto;
import merchadona.modelo.Reponedor;

/**
 * FXML Controller class
 *
 * @author daw
 */
public class MostarListadosController implements Initializable {

    private Escena1Controller controller;
    /**
     * Initializes the controller class.
     */
    @FXML
    private ListView<Producto> fxList;
    
    @FXML
    private ListView<Cajera> fxListCajero;
    
    @FXML
    private ListView<Reponedor> fxListReponedor;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cargarDatosLista();
    }

    public void setController(Escena1Controller controller) {
        this.controller = controller;
    }

    public void cargarDatosLista() {
        fxList.getItems().clear();
        fxList.getItems().addAll(
                this.controller.getMerchadona().getProductos());

        fxListCajero.getItems().clear();
        fxListCajero.getItems().addAll(
                this.controller.getMerchadona().listaCajeras());

        fxListReponedor.getItems().clear();
        fxListReponedor.getItems().addAll(
                this.controller.getMerchadona().listaReponedor());

    }

    }
