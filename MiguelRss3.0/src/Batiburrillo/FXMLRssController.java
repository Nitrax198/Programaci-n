/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rss;

import java.awt.TextArea;
import java.awt.TextField;
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
import javafx.scene.layout.FlowPane;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 * FXML Controller class
 *
 * @author user
 */
public class FXMLRssController implements Initializable {

    public HostServices hostServices;

    @FXML
    private FlowPane fxFlowPane;
    Configuration c = null;
    @FXML
    private TextField fxDescripcion;
    @FXML
    private TextArea fxTitulo;
    
    private int indice;
    private int variable;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        c = new Configuration();
        // TODO
//        Button but = new Button("testing");
//        but.setOnAction(click -> {
//        this.hostServices.showDocument("http://www.marca.es");
//        
//        });
    }

    @FXML
    private void handleAnterior(ActionEvent event) throws IOException {
    }
    @FXML
    private void handleSiguiente(ActionEvent event) throws IOException {
    }

    private void cargarRss() {
        try {

            JAXBContext jaxbContext = JAXBContext.newInstance(Rss.class);

            Unmarshaller um = jaxbContext.createUnmarshaller();

            com.mycompany.rss.Configuration c = new com.mycompany.rss.Configuration();

            Rss p = (Rss) um.unmarshal(new URL(c.getUrls().get(0)));
            variable = p.channel.getItem().size();
            fxDescripcion.setText(p.channel.getItem().get(indice).getTitle());
            fxTitulo.setText(p.channel.getItem().get(indice).getDescripcion());
        } catch (JAXBException ex) {
            Logger.getLogger(TestRss.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(TestRss.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
