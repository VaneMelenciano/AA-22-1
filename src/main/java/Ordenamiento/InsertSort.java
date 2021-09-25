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
public class InsertSort extends CalculoTiempo{
    public InsertSort(){
        super();
    }

    /**
     *
     * @param arreglo
     */
    @Override
    public void ordenarDatos(int[] arreglo) {
        int i, j, key;
        for (i = 1; i < arreglo.length; i++) {
            key = arreglo[i];
            j = i - 1;
            while(j >= 0 && arreglo[j] > key) {
                arreglo[j+1] = arreglo[j];
                j--;
            }
            arreglo[j + 1] = key;
        }
    }  
}
