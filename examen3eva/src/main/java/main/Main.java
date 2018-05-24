/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.File;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import modelo.Zoo;

/**
 *
 * @author daw
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Zoo Zoologico = new Zoo();
        int opcion = 0;
        do {
            System.out.println("1.- Guardar"
                    + "\n2.- Cargar");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    guardar(Zoologico);
                    break;
                case 2:
                    cargar();
                    break;
            }

        } while (opcion != 3);

    }

    public static void guardar(Zoo z) {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Zoo.class);

            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            z = new Zoo();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(z, new File("Zoologico.xml"));
        } catch (JAXBException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static Zoo cargar() {
        Zoo z;
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Zoo.class);

            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            Unmarshaller um = jaxbContext.createUnmarshaller();
            z = (Zoo) um.unmarshal(new File("Zoologico.xml"));
        } catch (JAXBException ex) {
            z = new Zoo();
//            Java.util.logging.logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return z;
    }
}
