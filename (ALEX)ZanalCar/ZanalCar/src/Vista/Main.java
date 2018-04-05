/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ZanalCar;
import java.util.Scanner;

/**
 *
 * @author Daw
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        ZanalCar zc = new ZanalCar();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("\n0] Salir.\n"
                    + "1] Comprar Vehiculo.\n"
                    + "2] Vender Vehiculo.\n"
                    + "3] Probar Vehiculo.\n"
                    + "4] Facturacion Total.\n"
                    + "5] Inventario.\n"
                    + "Opción: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 0:
                    System.out.println("Saliste con exito.");
                    break;
                case 1:
                    System.out.println("Comprar Vehiculos.");
                    zc.comprarCoche();
                    break;
                case 2:
                    System.out.println("Vender Vehiculo.");
                    zc.listadoVehiculosVender();
                    break;
                case 3:
                    System.out.println("Probar Coche/Quad.");
                    zc.prueba();
                    break;
                case 4:
                    System.out.println("Facturacion empresa.");
                    zc.facturacion();
                    break;
                case 5:
                    System.out.println("Ver inventario.");
                    zc.inventarioStock();
                    zc.inventarioVentas();
                    break;
                default:
                    System.out.println("Opcion incorrecta, vuelve a intentarlo.");
                    break;
            }
        } while (opcion != 0);

    }

}
