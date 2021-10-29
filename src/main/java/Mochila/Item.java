/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mochila;

/**
 *
 * @author Vanessa
 */
public class Item {
    private int peso;
    private int beneficio;
    public Item(int p, int b){
        this.peso=p;
        this.beneficio=b;
    }

    /**
     * @return the peso
     */
    public int getPeso() {
        return peso;
    }

    /**
     * @return the beneficio
     */
    public int getBeneficio() {
        return beneficio;
    }
    
    
}
