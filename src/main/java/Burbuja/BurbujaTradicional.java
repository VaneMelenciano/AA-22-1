/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Burbuja;

/**
 *
 * @author Vanessa
 */
public class BurbujaTradicional {
    public long tInicio;
    public long tFinal;
    public long tTotal;

    public BurbujaTradicional() {
        this.tFinal = 0;
        this.tInicio = 0;
        this.tTotal = 0 ;
    }
  
    public void ordenar(int[] datos){
        this.tInicio = System.currentTimeMillis(); //le pide al sistema el tiempo registrado en ese moemnto, en milisegundos
        ordenarDatos(datos);
        this.tFinal = System.currentTimeMillis(); // vuelve a hacer petición del tiempo para saber cuando termina el ordenamiento
        this.tTotal = this.tFinal - this.tInicio; //se estima el tiempo total que le llevo ejecutar el ordenamiento
    }
    public long gettFinal() {
        return tFinal;
    }

    public long gettInicio() {
        return tInicio;
    }

    public long gettTotal() {
        return tTotal;
    }

    private void ordenarDatos(int[] arreglo) {
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
