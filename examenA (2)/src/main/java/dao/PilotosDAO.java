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
import model.Pilot;

/**
 *
 * @author daw
 */
public class PilotosDAO {
    public List<Pilot> getAllPilots() {
        List<Pilot> lista = new ArrayList<>();
        Pilot nuevo = null;
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
            sql = "SELECT * FROM PILOTOS";
            rs = stmt.executeQuery(sql);

//STEP 5: Extract data from result set
            while (rs.next()) {
                //Retrieve by column name
                int id = rs.getInt("ID");
                String nombre = rs.getString("NOMBRE");
                nuevo = new Pilot();
                nuevo.setId(id);
                nuevo.setNombre(nombre);
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

    public boolean insertPilotosJDBC(Pilot p) {
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

            stmt = con.prepareStatement("INSERT INTO PILOTOS "
                    + "(NOMBRE)  "
                    + "VALUES (?)", Statement.RETURN_GENERATED_KEYS);

            stmt.setString(1, p.getNombre());

            filas = stmt.executeUpdate();

            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                p.setId(rs.getInt(1));
            }
        } catch (Exception ex) {
            Logger.getLogger(PilotosDAO.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(PilotosDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return insertado;
    }
}
