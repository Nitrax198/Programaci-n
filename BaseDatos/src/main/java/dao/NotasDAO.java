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
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Alumno;
import model.Asignatura;

/**
 *
 * @author daw
 */
public class NotasDAO {
    public int vincularAlumnosYAsignatura(Alumno a, Asignatura b) {
        Connection con = null;
        PreparedStatement stmt = null;
        int filas = -1;
        try {
            Class.forName(Configuration.getInstance().getDriverDB());

            con = DriverManager.getConnection(
                    Configuration.getInstance().getUrlDB(),
                    Configuration.getInstance().getUserDB(),
                    Configuration.getInstance().getPassDB());

            stmt = con.prepareStatement("INSERT INTO notas "
                    + "(ID_ALUMNO,ID_ASIGNATURA)  "
                    + "VALUES (?,?)", Statement.RETURN_GENERATED_KEYS);

            stmt.setLong(1, a.getId());

            stmt.setLong(2, b.getId());

            filas = stmt.executeUpdate();

            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                a.setId(rs.getInt(1));
            }
        } catch (Exception ex) {
            Logger.getLogger(NotasDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {

                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(AlumnosDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return filas;

    }
    public int updateNotas(Alumno a, Asignatura b, int nota) {
        Connection con = null;
        PreparedStatement stmt = null;
        int filas = -1;
        try {
            Class.forName(Configuration.getInstance().getDriverDB());

            con = DriverManager.getConnection(
                    Configuration.getInstance().getUrlDB(),
                    Configuration.getInstance().getUserDB(),
                    Configuration.getInstance().getPassDB());
            
            stmt = con.prepareStatement("UPDATE notas "
                    + "SET NOTA=?"
                    + "WHERE ID_ALUMNO=? AND ID_ASIGNATURA=?", Statement.RETURN_GENERATED_KEYS);

            stmt.setInt(1, nota);

            stmt.setLong(2, a.getId());
            
            stmt.setLong(3, b.getId());

            filas = stmt.executeUpdate();

            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                a.setId(rs.getInt(1));
            }
        } catch (Exception ex) {
            Logger.getLogger(NotasDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {

                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(AlumnosDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return filas;

    }
//    public int Borrar(Alumno a, Asignatura b) {
//        Connection con = null;
//        PreparedStatement stmt = null;
//        int filas = -1;
//        try {
//            Class.forName(Configuration.getInstance().getDriverDB());
//
//            con = DriverManager.getConnection(
//                    Configuration.getInstance().getUrlDB(),
//                    Configuration.getInstance().getUserDB(),
//                    Configuration.getInstance().getPassDB());
//
//            stmt = con.prepareStatement("INSERT INTO notas "
//                    + "(ID_ALUMNO,ID_ASIGNATURA)  "
//                    + "VALUES (?,?)", Statement.RETURN_GENERATED_KEYS);
//
//            stmt.setLong(1, a.getId());
//
//            stmt.setLong(2, b.getId());
//
//            filas = stmt.executeUpdate();
//
//            ResultSet rs = stmt.getGeneratedKeys();
//            if (rs.next()) {
//                a.setId(rs.getInt(1));
//            }
//        } catch (Exception ex) {
//            Logger.getLogger(NotasDAO.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//            try {
//
//                if (stmt != null) {
//                    stmt.close();
//                }
//                if (con != null) {
//                    con.close();
//                }
//            } catch (SQLException ex) {
//                Logger.getLogger(AlumnosDAO.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//        }
//        return filas;
//
//    }
}
