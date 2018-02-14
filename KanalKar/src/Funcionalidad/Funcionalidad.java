/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcionalidad;

import java.util.ArrayList;
import java.util.Scanner;
import vehiculos.Bici;
import vehiculos.Coche;
import vehiculos.Moto;
import vehiculos.Quad;
import vehiculos.Vehiculo;

/**
 *
 * @author daw
 */
public class Funcionalidad {
    //necesitamos dos array list para una de las funcionalidades es simplemente recorrer el array de vendidod con array.size e ir sumando los precios de venta

    ArrayList<Vehiculo> stock = new ArrayList<>();

    public void comprarVehiculo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elije el vehiculo que quiere vender, las opciones son:\n"
                + "1. coche. \n"
                + "2. moto. \n"
                + "3. quad. \n"
                + "4. bici. \n");
        int opcion = sc.nextInt();
        sc.nextLine();
        switch (opcion) {
            case 1:
                System.out.println("por favor introduce la matricula");
                String matricula = sc.nextLine();
                System.out.println("por favor introduce los Km de uso");
                int kmDeUso = sc.nextInt();
                sc.nextLine();
                System.out.println("por favor introduce el color");
                String color = sc.nextLine();
                System.out.println("por favor introduce la marca");
                String marca = sc.nextLine();
                System.out.println("por favor introduce el precio de compra");
                float precioCompra = sc.nextFloat();
                sc.nextLine();
                Coche cocheNuevo = new Coche(matricula,kmDeUso,color,marca,precioCompra);
                stock.add(cocheNuevo);
                break;
            case 2:
                System.out.println("por favor introduce la matricula");
                 matricula = sc.nextLine();
                System.out.println("por favor introduce los Km de uso");
                kmDeUso = sc.nextInt();
                sc.nextLine();
                System.out.println("por favor introduce el color");
                 color = sc.nextLine();
                System.out.println("por favor introduce la marca");
                 marca = sc.nextLine();
                System.out.println("por favor introduce el precio de compra");
                precioCompra = sc.nextFloat();
                sc.nextLine();
                Moto motoNueva = new Moto(matricula,kmDeUso,color,marca,precioCompra);
                stock.add(motoNueva);
                break;
            case 3:
                System.out.println("por favor introduce la matricula");
                matricula = sc.nextLine();
                System.out.println("por favor introduce los Km de uso");
                kmDeUso = sc.nextInt();
                sc.nextLine();
                System.out.println("por favor introduce el color");
                color = sc.nextLine();
                System.out.println("por favor introduce la marca");
                marca = sc.nextLine();
                System.out.println("por favor introduce el precio de compra");
                precioCompra = sc.nextFloat();
                sc.nextLine();
                Quad quadNuevo = new Quad(matricula,kmDeUso,color,marca,precioCompra);
                stock.add(quadNuevo);
                break;
            case 4:
                System.out.println("por favor introduce el tamaño de la rueda");
                int rueda = sc.nextInt();
                sc.nextLine();
                System.out.println("por favor el numero de marchas");
                int tipoDeMarcha = sc.nextInt();
                sc.nextLine();
                System.out.println("por favor introduce el tipo de cambio");
                String tipoDeCambio = sc.nextLine();
                System.out.println("por favor introduce el color");
                color = sc.nextLine();
                System.out.println("por favor introduce la marca");
                marca = sc.nextLine();
                System.out.println("por favor introduce el precio de compra");
                precioCompra = sc.nextFloat();
                sc.nextLine();
                Bici biciNueva = new Bici(rueda, tipoDeMarcha, tipoDeCambio, color, marca, precioCompra);
                stock.add(biciNueva);
                break;
            default:
                System.out.println("ERROR 404 Vehicle not found");
        }
    }

}
