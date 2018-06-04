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
import model.Cliente;
import model.Coche;
import model.Concesionario;

/**
 *
 * @author daw
 */
public class VentaCochesDAO {

    public List<Concesionario> getAllConcesionarios() {
        List<Concesionario> lista = new ArrayList<>();
        Concesionario nuevo = null;
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
            sql = "SELECT * FROM CONCESIONARIOS";
            rs = stmt.executeQuery(sql);

//STEP 5: Extract data from result set
            while (rs.next()) {
                //Retrieve by column name
                int id = rs.getInt("ID");
                String nombre = rs.getString("NOMBRE");
                String marca = rs.getString("MARCA");;
                nuevo = new Concesionario();
                nuevo.setId(id);
                nuevo.setNombre(nombre);
                nuevo.setMarca(marca);
                lista.add(nuevo);
            }

        } catch (Exception ex) {
            Logger.getLogger(VentaCochesDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {

                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(VentaCochesDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return lista;
    }
    
    public List<Cliente> getAllClientes() {
        List<Cliente> lista = new ArrayList<>();
        Cliente nuevo = null;
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
            sql = "SELECT * FROM CLIENTES";
            rs = stmt.executeQuery(sql);

//STEP 5: Extract data from result set
            while (rs.next()) {
                //Retrieve by column name
                int id = rs.getInt("ID");
                String nombre = rs.getString("NOMBRE");
                nuevo = new Cliente();
                nuevo.setId(id);
                nuevo.setNombre(nombre);
                lista.add(nuevo);
            }

        } catch (Exception ex) {
            Logger.getLogger(VentaCochesDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {

                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(VentaCochesDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return lista;
    }

    public List<Coche> getCochesFromConcesionario(Concesionario c) {
        List<Coche> lista = new ArrayList<>();
        Coche nuevo = null;
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            Class.forName(Configuration.getInstance().getDriverDB());

            con = DriverManager.getConnection(
                    Configuration.getInstance().getUrlDB(),
                    Configuration.getInstance().getUserDB(),
                    Configuration.getInstance().getPassDB());

            stmt = con.prepareStatement("SELECT * FROM COCHES where ID_CONCESIONARIO=?");
            stmt.setInt(1, c.getId());
            rs = stmt.executeQuery();

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
            Logger.getLogger(VentaCochesDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {

                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(VentaCochesDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return lista;
    }
}
