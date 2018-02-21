/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package merchadona;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import merchadona.clases.Cajere;
import merchadona.clases.Constantes;
import merchadona.clases.Empleade;
import merchadona.clases.Reponedore;

/**
 *
 * @author daw
 */
public class MerchadonaF {

    Scanner sc = new Scanner(System.in);
    Map<Integer, Empleade> Empleades = new LinkedHashMap<>();

    public void Logearse(Scanner sc) {
        int id;
        id = 0;
        System.out.println("Por favor escribe en id de empleado");
        id = sc.nextInt();
        sc.nextLine();
        if (id == Constantes.ADMIN_ID) {
            //Hacer codigo para el administrador
        }
        
        else if (Empleades.get(id) == null) {
            System.out.println("No hay ningun/a empleade con ese id");
            if (Empleades.get(id) instanceof Cajere) {
                System.out.println("El/La empleada es un/a cajera/o");
                // hacer codigo para la cajera
            } 
            
            else if(Empleades.get(id) instanceof Reponedore){
             System.out.println("El/La empleada es un/a Reponedora/o");   
             // hacer codigo para la Reponedora
            }
        }
    }
}
