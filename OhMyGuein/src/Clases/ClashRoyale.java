/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author daw
 */
public class ClashRoyale extends Gamer{
    ArrayList<Carta> deck;

    public ArrayList<Carta> getDeck() {
        return deck;
    }

    public void setDeck(ArrayList<Carta> deck) {
        this.deck = deck;
    }

    public ClashRoyale(int rankin, String nombre, int numTorneos) {
        super(rankin, nombre, numTorneos);
        this.deck = new ArrayList<>();
        //Las cartad se van añadiendo mas tarde
    }
    public void addCarta(Carta carta){
        this.deck.add(carta);
    }

    @Override
    public String toString() {
        return "ClashRoyale{" + "deck=" + deck + '}';
    }
    
}

