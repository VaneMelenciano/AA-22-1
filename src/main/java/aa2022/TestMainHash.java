/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aa2022;

import Hash.FuerzaBruta;
import Hash.Hasheo;

/**
 *
 * @author Vanessa
 */
public class TestMainHash {
    public static void main(String[] args) {
        int[] arreglo = {1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1}; //834287171
        int[] arreglo2 = {1, 1, 1}; //993
        //FuerzaBruta f = new FuerzaBruta(arreglo, arreglo2);
        //System.out.println(f.algoritmo());
        
        Hasheo h = new Hasheo(arreglo, arreglo2);
        long tInicio = System.nanoTime();
        System.out.println(h.algoritmo());
        long tFinal = System.nanoTime();
        long tTotal = tFinal - tInicio;
        System.out.println(tTotal+"\n");
        
        FuerzaBruta f = new FuerzaBruta(arreglo, arreglo2);
        long tInicio1 = System.nanoTime();
        System.out.println(f.algoritmo());
        long tFinal1 = System.nanoTime();
        long tTotal1 = tFinal1 - tInicio1; 
        System.out.println(tTotal1+"\n");
        
     }
}
