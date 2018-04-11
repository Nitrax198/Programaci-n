package fuerzasEspeciales.main;

import fuerzasEspeciales.controlador.FuerEsp;
import java.io.File;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class main {

    public static void main(String[] args) {
        //variables
        int opc = -2;
        FuerEsp fp = new FuerEsp();
        Scanner s = new Scanner(System.in);
        
        while (opc != 0) {
            do {
                System.out.println("----------MENU----------");
                System.out.println("1. Crear mision.\n"
                        + "2. Resultado de mision..\n"
                        + "3. Poner Estres a 0.\n"
                        + "4. Leer misiones.\n"
                        + "5. Guardar el xml.\n"
                        + "6. Cargar el xml.\n"
                        + "0. Salir.");
                opc = s.nextInt();
                System.out.println();

                switch (opc) {
                    case 1:
                        fp.crearMision();
                        break;
                    case 2:
                        fp.resultadoMision();
                        break;
                    case 3:
                        fp.descansoRecursos();
                        break;
                    case 4:
                        fp.leerNombreMisiones();
                        break;
                    case 0:
                        System.out.println("Adios");
                        break;
                    case 5:
                        guardar(fp);
                        break;
                    case 6:
                        cargar();
                        break;

                    default:
                        System.out.println("Opcion incorrecta");
                }
            } while (opc < 0 || opc > 3);
        }

    }
    public static void guardar(FuerEsp z) {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(FuerEsp.class);
            
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            
            z = new FuerEsp();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            
            jaxbMarshaller.marshal(z, new File("FuerEsp.xml"));
        } catch (JAXBException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public static FuerEsp cargar() {
        FuerEsp z;
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(FuerEsp.class);

            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            Unmarshaller um = jaxbContext.createUnmarshaller();
            z = (FuerEsp) um.unmarshal(new File("FuerEsp.xml"));
        } catch (JAXBException ex) {
            z = new FuerEsp();
//            Java.util.logging.logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return z;
    }


}
