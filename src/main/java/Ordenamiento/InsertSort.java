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
public class InsertSort extends Ordenamiento{
    public InsertSort(){
        super();
    }

    /**
     *
     * @param arreglo
     */
    @Override
    public void ordenarDatos(int[] arreglo) {
        /*this.initTime = System.currentTimeMillis();
        int n = data.length;
        double key;
        int j;
        for (int i = 1; i < n; i++) {
            key = data[i];
            // y asignación.
            j = i - 1;
            
            //Se mueven hacia adelante los elementos de data[0,...i-1] hasta que la llave sea mayor o igual que data[j]
            
            while(j >= 0 && data[j] > key) {
                data[j+1] = data[j];
                j--;
            }
            // Insertamos la llave en donde corresponde
            data[j + 1] = key;
        }
        this.endTime = System.currentTimeMillis();
        this.totalTime = this.endTime - this.initTime; */
    }  
}
