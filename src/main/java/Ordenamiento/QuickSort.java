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
public class QuickSort extends Algoritmo{
    private int[] arregloOrdenado;
    public QuickSort() {
        super("Quick Sort");
    }
    /**
     *
     * @param A
     */
    @Override
    public void ordenarDatos(int[] A) {
        quickSortAlgoritmo(A, 0, A.length-1);
    }
    public void quickSortAlgoritmo(int[] tmpArray, int izq, int der){
        // seleccionar el pivote 
        int pivote = tmpArray[izq];
        // realiza la busqueda de izq a derecha
        int i = izq;
        // realiza la busqueda de derecha a izq
        int j = der;
        int aux;
        
        // mientras no se crucen las busquedas ( i y j)
        while (i<j){
            // buscar elemento mayor al pivote 
            while (tmpArray[i]<= pivote && i<j) i++;
            
            // buscar el elemento menor al pivote
            while(tmpArray[j]>pivote) j--;
          // si no se han cruzado i y j
          // hacer intercambio
          if (i < j) {
          aux = tmpArray[i];
          tmpArray[i] = tmpArray[j];
          tmpArray[j] = aux;
          
          }
        }
        // colocar el pivote en su lugar de forma en que tendremos los menores 
        // a su izquierda y los mayores a su derecha
        tmpArray[izq] = tmpArray[j];
        tmpArray[j] = pivote;
        /// ordenar el sub arreglo izq
        if (izq<j-1)
            quickSortAlgoritmo(tmpArray,izq,j-1);
          /// ordenar el sub arreglo der
        if (j+1 < der)
            quickSortAlgoritmo(tmpArray, j+1, der);
    }
    
}
