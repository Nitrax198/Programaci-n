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
import model.Moto;

/**
 *
 * @author daw
 */
public class MotosDAO {

    public boolean insertMoto(Moto m) {
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

            stmt = con.prepareStatement("INSERT INTO MOTOS "
                    + "(NUMERO,ID_ESCUDERIA,ID_PILOTO)  "
                    + "VALUES (?,?,?)", Statement.RETURN_GENERATED_KEYS);

            stmt.setInt(1, m.getNumero());

            stmt.setInt(2, m.getId_Escuderia());

            stmt.setInt(3, m.getId_Piloto());

            filas = stmt.executeUpdate();

            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                m.setId(rs.getInt(1));
            }
        } catch (Exception ex) {
            Logger.getLogger(MotosDAO.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(MotosDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return insertado;

    }
}
