package controllers;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import form.Cliente;
import java.io.IOException;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author daw
 */
public class FXMLPractica1Controller implements Initializable {

    List<Cliente> clientes;
    private int indice;

    @FXML
    private TextField fxTextNombre;
    @FXML
    private TextField fxEdad;

    @FXML
    private Button fxBotonNuevo;

    @FXML
    private Button fxBotonIz;

    @FXML
    private Button fxBotonDer;

    private String mensaje = "cliente";

    @FXML
    private void handleNuevo(ActionEvent event) throws IOException {
        String nombre;
        int edad;
        nombre = fxTextNombre.getText();
        edad = Integer.parseInt(fxEdad.getText());
        
        clientes.add(new Cliente(nombre, edad));
    }
    @FXML
    private void handleFlechaIz(ActionEvent event) throws IOException {
        indice --;
        fxTextNombre.setText(clientes.get(indice).getNombre());
        fxEdad.setText("" + clientes.get(indice).getEdad());
        
    }
    @FXML
    private void handleFlechaDer(ActionEvent event) throws IOException {
        indice++;
        fxTextNombre.setText(clientes.get(indice).getNombre());
        fxEdad.setText("" + clientes.get(indice).getEdad());
        
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        this.clientes = new LinkedList<>();
        clientes.add(new Cliente("Kaiba", 15));
        clientes.add(new Cliente("Yugi", 14));
        clientes.add(new Cliente("Souma", 16));
        clientes.add(new Cliente("Koji", 17));
        indice = 0;
        fxTextNombre.setText(clientes.get(indice).getNombre());
        fxEdad.setText(clientes.get(indice).getEdad()+"");
    }

}
