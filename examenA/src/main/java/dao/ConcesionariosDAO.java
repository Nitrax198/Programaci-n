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
import model.Concesionario;

/**
 *
 * @author daw
 */
public class ConcesionariosDAO {

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

    public boolean insertConcesionarioJDBC(Concesionario c) {
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

            stmt = con.prepareStatement("INSERT INTO CONCESIONARIOS "
                    + "(NOMBRE,MARCA)  "
                    + "VALUES (?,?)", Statement.RETURN_GENERATED_KEYS);

            stmt.setString(1, c.getNombre());

            stmt.setString(2, c.getMarca());

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

    public boolean updateConcesionarioJDBC(Concesionario c) {
        Connection con = null;
        PreparedStatement stmt = null;
        int filas = -1;
        boolean updateado = true;
        try {
            Class.forName(Configuration.getInstance().getDriverDB());

            con = DriverManager.getConnection(
                    Configuration.getInstance().getUrlDB(),
                    Configuration.getInstance().getUserDB(),
                    Configuration.getInstance().getPassDB());

            stmt = con.prepareStatement("UPDATE CONCESIONARIOS "
                    + "SET NOMBRE=?,MARCA=? "
                    + "WHERE id=?");

            stmt.setString(1, c.getNombre());

            stmt.setString(2, c.getMarca());

            stmt.setInt(3, c.getId());

            filas = stmt.executeUpdate();

        } catch (Exception ex) {
            Logger.getLogger(ConcesionariosDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (filas == -1) {
                updateado = false;
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
        return updateado;

    }

    public boolean deleteConcesionario(Concesionario c) {

        Connection con = null;
        PreparedStatement stmt = null;
        int numFilas = -1;
        boolean borrado = false;
        try {
            Class.forName(Configuration.getInstance().getDriverDB());

            con = DriverManager.getConnection(
                    Configuration.getInstance().getUrlDB(),
                    Configuration.getInstance().getUserDB(),
                    Configuration.getInstance().getPassDB());

            stmt = con.prepareStatement("DELETE FROM CONCESIONARIOS where ID=? ");

            stmt.setInt(1, c.getId());

            numFilas = stmt.executeUpdate();

        } catch (Exception ex) {
            Logger.getLogger(ConcesionariosDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (numFilas == 1) {
                borrado = true;
            }
        }
        return borrado;

    }

    public boolean existCocheFromConcesionario(Concesionario c) {
        List<Concesionario> lista = new ArrayList<>();
        Concesionario nuevo = null;
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean existe = false;
        try {
            Class.forName(Configuration.getInstance().getDriverDB());

            con = DriverManager.getConnection(
                    Configuration.getInstance().getUrlDB(),
                    Configuration.getInstance().getUserDB(),
                    Configuration.getInstance().getPassDB());

            stmt = con.prepareStatement("SELECT * FROM COCHES where ID_CONCESIONARIO=?");
            stmt.setInt(1, c.getId());
//            String sql;
//            sql = "SELECT * FROM COCHES where ID_CONCESIONARIO=" + c.getId();
            rs = stmt.executeQuery();
            if (rs.next()) {
                existe = true;
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
        return existe;
    }

    public boolean deleteConcesionarioAndCoches(Concesionario c) {

        Connection con = null;
        PreparedStatement stmt = null;
        int numFilas = -1;
        boolean borrado = false;
        try {
            Class.forName(Configuration.getInstance().getDriverDB());

            con = DriverManager.getConnection(
                    Configuration.getInstance().getUrlDB(),
                    Configuration.getInstance().getUserDB(),
                    Configuration.getInstance().getPassDB());

            con.setAutoCommit(false);
            //Se borran los coches del concesionario
            stmt = con.prepareStatement("DELETE FROM COCHES where ID_CONCESIONARIO=? ");
            stmt.setInt(1, c.getId());
            numFilas = stmt.executeUpdate();

            //Se borra el concesionario
            stmt = con.prepareStatement("DELETE FROM CONCESIONARIO where ID=? ");
            stmt.setInt(1, c.getId());
            numFilas = stmt.executeUpdate();

            con.commit();

        } catch (Exception ex) {
            Logger.getLogger(ConcesionariosDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                con.rollback();
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(CrearModelo.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (numFilas == 1) {
                borrado = true;
            }
        }
        return borrado;

    }

}
