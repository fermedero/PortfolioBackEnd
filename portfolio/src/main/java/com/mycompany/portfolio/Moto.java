/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.portfolio;

/**
 *
 * @author MEDERO
 */
public class Moto extends Vehiculo{
    int cilindrada;

    public Moto() {
    }

    public Moto(int cilindrada, int numRegistro, int cantRuedas, String marca, String modelo) {
        super(numRegistro, cantRuedas, marca, modelo);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    
    
    
}
