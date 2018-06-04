/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import dao.CochesDAO;
import dao.ConcesionariosDAO;
import dao.VentaCochesDAO;
import java.util.List;
import model.Cliente;
import model.Coche;
import model.Concesionario;

/**
 *
 * @author daw
 */
public class VentaCocheService {

    public List<Concesionario> getAllConcesionarios() {
        VentaCochesDAO dao = new VentaCochesDAO();
        return dao.getAllConcesionarios();
    }

    public List<Coche> getCochesFromConcesionario(Concesionario c) {
        VentaCochesDAO dao = new VentaCochesDAO();
        return dao.getCochesFromConcesionario(c);
    }
    
    public List<Cliente> getAllClientes() {
        VentaCochesDAO dao = new VentaCochesDAO();
        return dao.getAllClientes();
    }
}
