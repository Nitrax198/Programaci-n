/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import config.Configuration;
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
import model.Asignatura;

/**
 *
 * @author oscar
 */
public class AsignaturasDAO {

    public List<Asignatura> getAllAsignaturasJDBC() {
        DBConnection db = new DBConnection();
        List<Asignatura> lista = new ArrayList<>();
        Asignatura nuevo = null;

        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            con = db.getConnection();

            stmt = con.createStatement();
            String sql;

            sql = "SELECT * FROM asignaturas";
            rs = stmt.executeQuery(sql);

            //STEP 5: Extract data from result set
            while (rs.next()) {
                //Retrieve by column name
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String curso = rs.getString("curso");
                String ciclo = rs.getString("ciclo");
                nuevo = new Asignatura();
                nuevo.setCurso(curso);
                nuevo.setId(id);
                nuevo.setCiclo(ciclo);
                nuevo.setNombre(nombre);
                lista.add(nuevo);
            }

        } catch (Exception ex) {
            Logger.getLogger(AsignaturasDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                db.cerrarConexion(con);
            } catch (SQLException ex) {
                Logger.getLogger(AsignaturasDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return lista;

    }
    public List<Asignatura> getAsignaturasAlumno() {
        DBConnection db = new DBConnection();
        List<Asignatura> lista = new ArrayList<>();
        Asignatura nuevo = null;

        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            con = db.getConnection();

            stmt = con.createStatement();
            String sql;

            sql = "SELECT * FROM asignaturas where id in(select  distinct(ID_ASIGNATURA) from notas)";
            rs = stmt.executeQuery(sql);

            //STEP 5: Extract data from result set
            while (rs.next()) {
                //Retrieve by column name
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String curso = rs.getString("curso");
                String ciclo = rs.getString("ciclo");
                nuevo = new Asignatura();
                nuevo.setCurso(curso);
                nuevo.setId(id);
                nuevo.setCiclo(ciclo);
                nuevo.setNombre(nombre);
                lista.add(nuevo);
            }

        } catch (Exception ex) {
            Logger.getLogger(AsignaturasDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                db.cerrarConexion(con);
            } catch (SQLException ex) {
                Logger.getLogger(AsignaturasDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return lista;

    }

    public int insertAsignaturasJDBC(Asignatura s) {
        DBConnection db = new DBConnection();
        Connection con = null;
        PreparedStatement stmt = null;
        int filas = -1;
        try {
            Class.forName(Configuration.getInstance().getDriverDB());

            con = db.getConnection();

            stmt = con.prepareStatement("INSERT INTO asignaturas "
                    + "(NOMBRE,CURSO,CICLO)  "
                    + "VALUES (?,?,?)", Statement.RETURN_GENERATED_KEYS);

            stmt.setString(1, s.getNombre());

            stmt.setString(2, s.getCurso());

            stmt.setString(3, s.getCiclo());

            filas = stmt.executeUpdate();

            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                s.setId(rs.getInt(1));
            }
        } catch (Exception ex) {
            Logger.getLogger(AsignaturasDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {

                if (stmt != null) {
                    stmt.close();
                }
                db.cerrarConexion(con);
            } catch (SQLException ex) {
                Logger.getLogger(AsignaturasDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return filas;

    }

    public int updateAsignaturasJDBC(Asignatura s) {
        DBConnection db = new DBConnection();
        Connection con = null;
        PreparedStatement stmt = null;
        int filas = -1;
        try {
            con = db.getConnection();

            stmt = con.prepareStatement("UPDATE asignaturas "
                    + "SET NOMBRE=?,CURSO=?,CICLO=? "
                    + "WHERE id=?");

            stmt.setString(1, s.getNombre());

            stmt.setString(2, s.getCurso());

            stmt.setString(3, s.getCiclo());

            stmt.setInt(4, (int) s.getId());

            filas = stmt.executeUpdate();

        } catch (Exception ex) {
            Logger.getLogger(AsignaturasDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {

                if (stmt != null) {
                    stmt.close();
                }
                db.cerrarConexion(con);
            } catch (SQLException ex) {
                Logger.getLogger(AsignaturasDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return filas;

    }

    public boolean deleteAsignaturas(long idWhere) {
        DBConnection db = new DBConnection();
        Connection con = null;
        PreparedStatement stmt = null;
        int Filas = -1;
        boolean borrado = false;
        try {
            con = db.getConnection();
            
            stmt = con.prepareStatement("DELETE FROM asignaturas where id=? ");

            stmt.setLong(1, idWhere);

            Filas = stmt.executeUpdate();

        } catch (Exception ex) {
            Logger.getLogger(AsignaturasDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {

                if (stmt != null) {
                    stmt.close();
                }
                db.cerrarConexion(con);
            } catch (SQLException ex) {
                Logger.getLogger(AsignaturasDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return borrado;

    }
}
