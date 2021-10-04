/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ordenamiento;

/**
 *
 * @author Vanessa
 */
public class BurbujaTradicional extends Algoritmo{

    public BurbujaTradicional() {
        super("Burbuja Tradicional");
    }

    @Override
    public void ordenarDatos(int[] arreglo) {
        int[] arreglo1 = arreglo.clone();
      int i, j, aux;
        for (i = 0; i < arreglo1.length - 1; i++) {
            for (j = 0; j < arreglo1.length - 1; j++) {
                if (arreglo1[j + 1] < arreglo1[j]) {
                    aux = arreglo1[j + 1];
                    arreglo1[j + 1] = arreglo1[j]; 
                    arreglo1[j] = aux; 
                }
            }
        }
    }    
    
}
