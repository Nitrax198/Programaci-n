/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuerpodeelite;

import java.io.File;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author daw
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        CuerpoDeElite cosa = new CuerpoDeElite();
        int opcion = 0;
        do {
            System.out.println("1.- Crear misión"
                    + "\n2.- Relajar soldados"
                    + "\n3.- Lista de misiones"
                    + "\n4.- Lista de recursos"
                    + "\n5.- Guardar"
                    + "\n6.- Cargar");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    cosa.crearMision();
                    break;
                case 2:
                    cosa.bajarStress();
                    break;
                case 3:
                    cosa.listadoMisiones();
                    break;
                case 4:
                    cosa.listadoRecursos();
                    break;
                case 5:
                    guardar(cosa);
                    break;
                case 6:
                    cargar();
                    break;
            }
        } while (opcion != 8);

    }
    public static void guardar(CuerpoDeElite z) {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(CuerpoDeElite.class);
            
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            
            z = new CuerpoDeElite();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            
            jaxbMarshaller.marshal(z, new File("CuerpoDeElite.xml"));
        } catch (JAXBException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public static CuerpoDeElite cargar() {
        CuerpoDeElite z;
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(CuerpoDeElite.class);

            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            Unmarshaller um = jaxbContext.createUnmarshaller();
            z = (CuerpoDeElite) um.unmarshal(new File("CuerpoDeElite.xml"));
        } catch (JAXBException ex) {
            z = new CuerpoDeElite();
//            Java.util.logging.logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return z;
    }


}
