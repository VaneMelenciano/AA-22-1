/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aa2022;

import Ajedrez.Caballo;
import Ajedrez.Tablero;
import javax.swing.JFrame;

/**
 *
 * @author Vanessa
 */
public class TestMainAjedrez {
    public static void main(String[] args) {
        int n=20;
        //punto inicial del caballo
        int x=6, y=6;
        Caballo a = new Caballo(x, y, n);
        
        JFrame ventana = new JFrame("Tablero de ajedrez");
        Tablero tablero = new Tablero(n, a.getTablero());
        ventana.add(tablero);
        ventana.pack();
        ventana.setVisible(true);
    }
}
