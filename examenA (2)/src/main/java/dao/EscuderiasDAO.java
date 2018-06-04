/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import config.Configuration;
import init.CrearModelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Escuderia;

/**
 *
 * @author daw
 */
public class EscuderiasDAO {
    
        public List<Escuderia> getAllEscuderias() {
        List<Escuderia> lista = new ArrayList<>();
        Escuderia nuevo = null;
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            Class.forName(Configuration.getInstance().getDriverDB());

            con = DriverManager.getConnection(
                    Configuration.getInstance().getUrlDB(),
                    Configuration.getInstance().getUserDB(),
                    Configuration.getInstance().getPassDB());

            stmt = con.createStatement();
            String sql;
            sql = "SELECT * FROM ESCUDERIAS";
            rs = stmt.executeQuery(sql);

//STEP 5: Extract data from result set
            while (rs.next()) {
                //Retrieve by column name
                int id = rs.getInt("ID");
                String nombre = rs.getString("NOMBRE");
                String marca = rs.getString("MARCA");;
                nuevo = new Escuderia();
                nuevo.setId(id);
                nuevo.setNombre(nombre);
                nuevo.setMarca(marca);
                lista.add(nuevo);
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
        return lista;
    }

    public boolean insertEscuderiasJDBC(Escuderia e) {
        Connection con = null;
        PreparedStatement stmt = null;
        int filas = -1;
        boolean insertado = false;
        try {
            Class.forName(Configuration.getInstance().getDriverDB());

            con = DriverManager.getConnection(
                    Configuration.getInstance().getUrlDB(),
                    Configuration.getInstance().getUserDB(),
                    Configuration.getInstance().getPassDB());

            stmt = con.prepareStatement("INSERT INTO ESCUDERIAS "
                    + "(NOMBRE,MARCA)  "
                    + "VALUES (?,?)", Statement.RETURN_GENERATED_KEYS);

            stmt.setString(1, e.getNombre());

            stmt.setString(2, e.getMarca());

            filas = stmt.executeUpdate();

            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                e.setId(rs.getInt(1));
            }
        } catch (Exception ex) {
            Logger.getLogger(EscuderiasDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (filas == 1) {
                insertado = true;
            }
            try {

                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(EscuderiasDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return insertado;
    }
}
