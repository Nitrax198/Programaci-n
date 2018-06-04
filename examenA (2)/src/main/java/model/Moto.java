/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author daw
 */
public class Moto {
//    ID Numero ID_Escuderia ID_Piloto

    private int id;

    private int numero;

    private int id_Escuderia;

    private int id_Piloto;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getId_Escuderia() {
        return id_Escuderia;
    }

    public void setId_Escuderia(int id_Escuderia) {
        this.id_Escuderia = id_Escuderia;
    }

    public int getId_Piloto() {
        return id_Piloto;
    }

    public void setId_Piloto(int id_Piloto) {
        this.id_Piloto = id_Piloto;
    }

    public Moto() {
    }

    public Moto(int numero, int id_Escuderia, int id_Piloto) {
        this.numero = numero;
        this.id_Escuderia = id_Escuderia;
        this.id_Piloto = id_Piloto;
    }

    @Override
    public String toString() {
        return "Moto{" + "id=" + id + ", numero=" + numero + ", id_Escuderia=" + id_Escuderia + ", id_Piloto=" + id_Piloto + '}';
    }

}
