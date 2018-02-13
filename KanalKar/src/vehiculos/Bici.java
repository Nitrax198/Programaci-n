/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;

/**
 *
 * @author daw
 */
public class Bici extends Vehiculo {
    private int tamañoDeRueda;
    private int numeroDeMarchas;
    private String tipoDeCambio;

    public Bici(int tamañoDeRueda, int numeroDeMarchas, String tipoDeCambio, String color, String marca, float precioCompra) {
        super(color, marca, precioCompra);
        this.tamañoDeRueda = tamañoDeRueda;
        this.numeroDeMarchas = numeroDeMarchas;
        this.tipoDeCambio = tipoDeCambio;
    }

    public int getTamañoDeRueda() {
        return tamañoDeRueda;
    }

    public void setTamañoDeRueda(int tamañoDeRueda) {
        this.tamañoDeRueda = tamañoDeRueda;
    }

    public int getNumeroDeMarchas() {
        return numeroDeMarchas;
    }

    public void setNumeroDeMarchas(int numeroDeMarchas) {
        this.numeroDeMarchas = numeroDeMarchas;
    }

    public String getTipoDeCambio() {
        return tipoDeCambio;
    }

    public void setTipoDeCambio(String tipoDeCambio) {
        this.tipoDeCambio = tipoDeCambio;
    }
    
    
}
