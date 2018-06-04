/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package init;

import com.google.common.io.CharStreams;
import config.Configuration;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oscar
 */
public class CrearModelo {

    public void leerFichero() throws FileNotFoundException, IOException {
        List<String> nombres = new ArrayList<>();
        BufferedReader br = null;
        FileReader fr = null;
        try {

            File fichero = new File("clientes.txt");
            
            nombres = CharStreams.readLines(new FileReader(fichero));
//            fr = new FileReader(fichero);
//            br = new BufferedReader(fr);
//
//            String sCurrentLine;
//            while ((sCurrentLine = br.readLine()) != null) {
//                nombres.add(sCurrentLine);
//            }
            insertarClientes(nombres);

        } catch (IOException e) {

            e.printStackTrace();

        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void insertarClientes(List<String> nombres) {
        Connection con = null;
        PreparedStatement stmt = null;
        int filas = -1;
        try {
            Class.forName(Configuration.getInstance().getDriverDB());

            con = DriverManager.getConnection(
                    Configuration.getInstance().getUrlDB(),
                    Configuration.getInstance().getUserDB(),
                    Configuration.getInstance().getPassDB());

            for (int i = 0; i < nombres.size(); i++) {
                stmt = con.prepareStatement("INSERT INTO CLIENTES (NOMBRE)  VALUES (?)");
                stmt.setString(1, nombres.get(i));

                filas = stmt.executeUpdate();
            }

        } catch (Exception ex) {
            Logger.getLogger(CrearModelo.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {

                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(CrearModelo.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    public void insertarDatosPrueba() {
        Connection con = null;
        PreparedStatement stmt = null;
        int filas = -1;
        try {
            Class.forName(Configuration.getInstance().getDriverDB());

            con = DriverManager.getConnection(
                    Configuration.getInstance().getUrlDB(),
                    Configuration.getInstance().getUserDB(),
                    Configuration.getInstance().getPassDB());

            stmt = con.prepareStatement("INSERT INTO CONCESIONARIOS (NOMBRE, MARCA)  VALUES ('IBERICAR','KIA')");

            filas = stmt.executeUpdate();
            stmt = con.prepareStatement("INSERT INTO COCHES (MODELO, PRECIO,ID_CONCESIONARIO)  VALUES ('PICANTO',14000,0)");

            filas = stmt.executeUpdate();

            stmt = con.prepareStatement("INSERT INTO CLIENTES (NOMBRE)  VALUES ('Juan')");

            filas = stmt.executeUpdate();

        } catch (Exception ex) {
            Logger.getLogger(CrearModelo.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {

                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(CrearModelo.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public void crearModeloJDBC() {
        Connection con = null;
        PreparedStatement stmt = null;
        int filas = -1;
        try {
            Class.forName(Configuration.getInstance().getDriverDB());

            con = DriverManager.getConnection(
                    Configuration.getInstance().getUrlDB(),
                    Configuration.getInstance().getUserDB(),
                    Configuration.getInstance().getPassDB());

            stmt = con.prepareStatement("CREATE TABLE CONCESIONARIOS (\n"
                    + "  ID INTEGER IDENTITY PRIMARY KEY ,\n"
                    + "  NOMBRE varchar(250)  DEFAULT NULL,\n"
                    + "  MARCA varchar(250)  DEFAULT NULL\n"
                    + ");");
            filas = stmt.executeUpdate();
            stmt = con.prepareStatement(
                    "CREATE TABLE COCHES (\n"
                    + "  ID INTEGER IDENTITY NOT NULL,\n"
                    + "  MODELO varchar(250) NOT NULL,\n"
                    + "  PRECIO INTEGER NOT NULL,\n"
                    + "  ID_CONCESIONARIO INTEGER NOT NULL,\n"
                    + "  PRIMARY KEY (ID),\n"
                    + "  CONSTRAINT COCHES_CONCESIONARIOS FOREIGN KEY (ID_CONCESIONARIO) REFERENCES CONCESIONARIOS (ID),\n"
                    + ");");

            filas = stmt.executeUpdate();
            stmt = con.prepareStatement("CREATE TABLE CLIENTES (\n"
                    + "  ID INTEGER IDENTITY NOT NULL,\n"
                    + "  NOMBRE varchar(250) NOT NULL,\n"
                    + "  PRIMARY KEY (ID),\n"
                    + ")");
            filas = stmt.executeUpdate();

//            stmt = con.prepareStatement("INSERT INTO alumnos VALUES (403,'manolamhhhh','0032-08-10',0),(412,'Andres Iniesta Iniaquella','1990-11-30',1),(426,'Manolito pue','2017-11-16',1),(431,'papapapajas eso es!!!','2017-11-16',1),(460,'alumno con nota3','2017-01-01',0),(523,'Paco Jones','2017-11-16',1),(525,'holacaracoola','2017-11-30',1),(526,'holacaraculo','2017-11-30',1),(527,'holacaracoola','2017-11-30',1),(530,'admin','2009-11-08',1),(532,'morta','2017-11-30',1),(535,'hola','2019-02-02',0),(723,'test4','2019-02-02',0),(724,'dfgdfg','2018-09-08',1);");
//
//            filas = stmt.executeUpdate();
//
//            stmt = con.prepareStatement("INSERT INTO asignaturas VALUES (83,'damn','damn','damn'),(86,'cabrones','meteos con','EDU'),(94,'yiiha','ahusdau','asdako'),(99,'aaaaa','vvvvv','aaaaa'),(100,'sadasda','asdasdasd','dasdasda'),(111,'hola ','erasto','ketal'),(114,'mu','quien quiera','que seas'),(124,'mu2','que seas','quien quiera'),(129,'peter','peter','peter'),(135,'aa','aa','aa'),(138,'prueba2','2','122'),(142,'pruebba','ba','ba'),(155,'Barsa','Es','Enorme'),(166,'Asignatura','Asignatura','Asignatura'),(175,'asignatura con nota','no tocar','no tocar'),(199,'juan1ssss','juan2','juan1'),(207,'san','tin','valen'),(208,'ingles','tercero','b'),(212,'miau miau','miau miau','miau guau');");
//
//            filas = stmt.executeUpdate();
//             stmt = con.prepareStatement("INSERT INTO notas VALUES (403,83,8),(403,155,0),(412,155,5),(426,166,7),(460,175,10),(530,99,5),(530,100,2),(530,111,3),(530,135,5),(723,208,6);");
//
//            filas = stmt.executeUpdate();
//            
//            stmt = con.prepareStatement("INSERT INTO notas VALUES (403,86,DEFAULT)");
//
//            filas = stmt.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(CrearModelo.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {

                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(CrearModelo.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

}
