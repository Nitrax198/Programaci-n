/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.File;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import modelo.Animal;
import modelo.Leon;
import modelo.Tigre;
import modelo.Zoo;
import modelo.Zoologo;

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
                    + "\n2.- Cargar"
                    + "\n3.- Crear");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    guardar(Zoologico);
                    break;
                case 2:
                    cargar();
                    break;
                case 3:
                    Crear();
                    break;
            }

        } while (opcion != 8);

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
    public static Zoo Crear() {
        List<Animal> animales = null;
        List<Zoologo> personal = null;
        animales.add(new Leon(1, "ddd"));
        animales.add(new Leon(2, "fff"));
        animales.add(new Tigre(3, "ggg"));
        animales.add(new Tigre(4, "hhh"));
        personal.add(new Zoologo("jjj",animales, 3, "kkk"));
        Zoo Zoologico = new Zoo(animales, personal);
        return Zoologico;
    }
}
