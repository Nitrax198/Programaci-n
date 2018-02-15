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
import vehiculos.VehiculoAMotor;

/**
 *
 * @author daw
 */
public class Funcionalidad {
    //necesitamos dos array list para una de las funcionalidades es simplemente recorrer el array de vendidod con array.size e ir sumando los precios de venta

    ArrayList<Vehiculo> stock = new ArrayList<>();
    ArrayList<Vehiculo> ventas = new ArrayList<>();

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
                Coche cocheNuevo = new Coche(matricula, kmDeUso, color, marca, precioCompra);
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
                Moto motoNueva = new Moto(matricula, kmDeUso, color, marca, precioCompra);
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
                Quad quadNuevo = new Quad(matricula, kmDeUso, color, marca, precioCompra);
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

    public void mostrarVehiculos(String string) {
        for (int i = 0; i < stock.size(); i++) {

            if (((Vehiculo) this.stock.get(i)).getMarca().equals(string)) {
                System.out.println(stock.get(i).toString());
            }
            if (((VehiculoAMotor) this.stock.get(i)).getMatricula().equals(string)) {
                System.out.println(stock.get(i).toString());
            }
        }
    }

    public void mostrarVehiculos(float precio) {
        for (int i = 0; i < stock.size(); i++) {
            
        }
    }

    public void mostrarVehiculos(int tipo) {
        switch (tipo) {
            case 1:
                for (int i = 0; i < stock.size(); i++) {
                    if (stock.get(i) instanceof Bici) {
                        System.out.println(stock.get(i).toString());
                    }
                }
                break;
            case 2:
                for (int i = 0; i < stock.size(); i++) {
                    if (stock.get(i) instanceof Coche) {
                        System.out.println(stock.get(i).toString());
                    }
                }
                break;
            case 3:
                for (int i = 0; i < stock.size(); i++) {
                    if (stock.get(i) instanceof Moto) {
                        System.out.println(stock.get(i).toString());
                    }
                }
                break;
            case 4:
                for (int i = 0; i < stock.size(); i++) {
                    if (stock.get(i) instanceof Quad) {
                        System.out.println(stock.get(i).toString());
                    }
                }
                break;
            default:
                System.out.println("Eres to tonto");
        }
    }

    public void venderVehiculo(Scanner sc) {
        int select, tipo;
        String cadena;
        System.out.println("¿Como quieres buscar? 1.Marca 2.Tipo de Vehiculo 3.Matricula 4.Precio");
        select = sc.nextInt();
        sc.nextLine();
        switch (select) {
            case 1:
                System.out.println("Dime la marca");
                cadena=sc.nextLine();
                mostrarVehiculos(cadena);
                break;
            case 2:
                System.out.println("¿Que tipo de vehiculo quieres? 1.Bici 2.Coche 3.Moto 4.Quad");
                tipo = sc.nextInt();
                sc.nextLine();
                mostrarVehiculos(tipo);
                break;
            case 3:
                System.out.println("Dime la matricula");
                cadena=sc.nextLine();
                mostrarVehiculos(cadena);
                break;
            case 4:
                break;
            default:
                System.out.println("Eres to tonto");
        }
    }
}
