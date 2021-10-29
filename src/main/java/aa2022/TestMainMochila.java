/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aa2022;

import Mochila.Mochila;
import Mochila.Tokenizador;

/**
 *
 * @author Vanessa
 */
public class TestMainMochila {
     public static void main(String[] args) {
        /*Tokenizador t = new Tokenizador();
        int max[] = {51, 130, 278, 566, 770};
        for(int i=0; i<5; i++){
            System.out.println("\n\nMaxima capacidad de la mochila: " + max[i]);
            Mochila m = new Mochila(t.getItems(), max[i]);
            m.imprimirE();
        }*/
        Tokenizador t = new Tokenizador();
        Mochila m = new Mochila(t.getItems(), 19);
        m.imprimirE();
     }
}
