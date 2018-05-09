/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rss;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.HostServices;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 * FXML Controller class
 *
 * @author daw
 */
public class FXMLRssAnimeController implements Initializable {

    public HostServices hostServices;
    private Rss rss;
    

    private int indice;

    @FXML
    private FlowPane fxFlowPane;
    Configuration c = null;

    @FXML
    private TextField fxLista;

    @FXML
    private Label fxTitulo;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
//        c = new Configuration();
        try {

            JAXBContext jaxbContext = JAXBContext.newInstance(Rss.class);

            Unmarshaller um = jaxbContext.createUnmarshaller();

            Configuration c = new Configuration();

                Rss p = (Rss) um.unmarshal(new URL(c.getUrls().get(0)));
            
        } catch (JAXBException ex) {
            Logger.getLogger(TestRss.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(TestRss.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO
//        Button but = new Button("testing");
//        but.setOnAction(click -> {
//            this.hostServices.showDocument("http://ramenparados.com/feed/");
//        });
        indice = 0;
        fxLista.setText(rss.channel.getItem().get(indice).getDescripcion());
        fxTitulo.setText(rss.channel.getItem().get(indice).getTitle());
    }

    @FXML
    private void handleAnterior(ActionEvent event) throws IOException {
        indice--;
        fxLista.setText(rss.channel.getItem().get(indice).getDescripcion());
        fxTitulo.setText(rss.channel.getItem().get(indice).getTitle());
    }

    @FXML
    private void handleSiguiente(ActionEvent event) throws IOException {
        indice++;
        fxLista.setText(rss.channel.getItem().get(indice).getDescripcion());
        fxTitulo.setText(rss.channel.getItem().get(indice).getTitle());
    }
//        fxTextNombre.setText(clientes.get(indice).getNombre());
//        fxEdad.setText(clientes.get(indice).getEdad()+"");
}
