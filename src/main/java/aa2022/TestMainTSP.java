/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aa2022;

import TSP.Tokenizador;
import TSP.VecinosCercanos;

/**
 *
 * @author Vanessa
 */
public class TestMainTSP {
    public static void main(String[] args) {
        //VecinosCercanos
        
        Tokenizador t = new Tokenizador();
        /*int[][] m = t.getMatriz();
        for(int i=0; i<m.length; i++){
            for(int j=0; j<m.length; j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }*/
        VecinosCercanos vc = new VecinosCercanos(t.getMatriz(), 'B');
        //VecinosCercanos vc = new VecinosCercanos(t.getMatriz());
        vc.imprimir();
    }
}
