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
import model.Coche;
import model.Concesionario;

/**
 *
 * @author daw
 */
public class CochesDAO {

    public List<Coche> getAllCoches() {
        List<Coche> lista = new ArrayList<>();
        Coche nuevo = null;
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
            sql = "SELECT * FROM COCHES";
            rs = stmt.executeQuery(sql);

//STEP 5: Extract data from result set
            while (rs.next()) {
                //Retrieve by column name
                int id = rs.getInt("ID");
                String modelo = rs.getString("MODELO");
                int precio = rs.getInt("PRECIO");
                int idConcesionario = rs.getInt("ID_CONCESIONARIO");

                nuevo = new Coche();
                nuevo.setId(id);
                nuevo.setModelo(modelo);
                nuevo.setPrecio(precio);
                nuevo.setIdConcesionario(idConcesionario);
                lista.add(nuevo);
            }

        } catch (Exception ex) {
            Logger.getLogger(CochesDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {

                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(CochesDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return lista;
    }  

    public boolean insertCoche(Coche c) {
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

            stmt = con.prepareStatement("INSERT INTO COCHES "
                    + "(MODELO,PRECIO,ID_CONCESIONARIO)  "
                    + "VALUES (?,?,?)", Statement.RETURN_GENERATED_KEYS);

            stmt.setString(1, c.getModelo());

            stmt.setInt(2, c.getPrecio());

            stmt.setInt(3, c.getIdConcesionario());

            filas = stmt.executeUpdate();

            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                c.setId(rs.getInt(1));
            }
        } catch (Exception ex) {
            Logger.getLogger(ConcesionariosDAO.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(ConcesionariosDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return insertado;

    }
}
