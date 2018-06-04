package controllers;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.google.common.io.CharStreams;
import com.google.common.io.Files;
import com.google.common.io.CharSink;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import model.Cliente;
import model.Coche;
import model.Concesionario;
import servicios.VentaCocheService;

/**
 * FXML Controller class
 *
 * @author daw
 */
public class ControllerVentaCoches implements Initializable {

    @FXML
    private ListView<Concesionario> fxListConcesionarios;

    @FXML
    private ListView<Coche> fxListCoches;

    @FXML
    private ListView<Cliente> fxListClientes;

    @FXML
    public void handleConcesionariosClicked(MouseEvent event) {
        if (fxListConcesionarios.getSelectionModel().getSelectedItem() != null) {
            VentaCocheService conex = new VentaCocheService();
            fxListCoches.getItems().clear();
            fxListCoches.getItems().addAll(conex.getCochesFromConcesionario(fxListConcesionarios.getSelectionModel().getSelectedItem()));
        }
    }

    @FXML
    public void handleCerrarTransaccion(ActionEvent event) throws IOException {
        int sumaTransacciones = 0;
        int transacciones;
        if (fxListClientes.getSelectionModel().getSelectedItem() != null & fxListCoches.getSelectionModel().getSelectedItem() != null && fxListConcesionarios.getSelectionModel().getSelectedItem() != null) {
            File fichero = new File("transacciones.txt");
            if (!fichero.exists()) {
                fichero.createNewFile();
            }
            String transaccionesAnteriores = CharStreams.toString(new FileReader(fichero));
            try {
                transacciones = Integer.parseInt(transaccionesAnteriores);
            } catch (Exception ex) {
                transacciones = 0;
            }
            sumaTransacciones = transacciones + fxListCoches.getSelectionModel().getSelectedItem().getPrecio();

            String transaccionFinal = sumaTransacciones + "";

            CharSink sink = Files.asCharSink(fichero, Charset.forName("UTF-8"));
            sink.write(transaccionFinal);

        }

    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        cargarLista();
    }

    public void cargarLista() {
        VentaCocheService conex = new VentaCocheService();
        fxListConcesionarios.getItems().clear();
        fxListConcesionarios.getItems().addAll(conex.getAllConcesionarios());

        fxListClientes.getItems().addAll(conex.getAllClientes());
    }
}
