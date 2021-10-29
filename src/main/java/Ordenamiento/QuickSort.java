/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ordenamiento;
//import org.apache.commons.lang3.ArrayUtils;

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
        //quickSortAlgoritmo(A);
    }
    public void quickSortAlgoritmo(int[] A, int izq, int der){ //5 4 3 2 1 -> 2
        /*System.out.print("\n    A: ");
        for(int k=0; k<A.length; k++){
            System.out.print(A[k]);
        }System.out.print("\n");*/
        
        int pivote = A[izq]; //primer elemento como pivote
        //System.out.println("p: " +pivote);
        int i = izq; // i realiza la búsqueda de izquierda a derecha
        int j = der; // j realiza la búsqueda de derecha a izquierda  
        //System.out.println("i: " +i + "  j: " + j);
        int aux;
        
        // mientras no se crucen las busquedas ( i y j)
        while (i<j){ 
            // buscar elemento mayor al pivote 
            while (A[i]<= pivote && i<j) i++;
            // buscar el elemento menor al pivote
            while(A[j]>pivote) j--;
            //System.out.println("i: " +i + "  j: " + j);
          // si no se han cruzado i y j
          // hacer intercambio
          if (i < j) {
             // System.out.println("entro");
            aux = A[i];
            A[i] = A[j];
            A[j] = aux;
            /*for(int k=0; k<A.length; k++){
                System.out.print(A[k]);
            }System.out.print("\n");*/
          }
        }
        // colocar el pivote en su lugar de forma en que tendremos los menores 
        // a su izquierda y los mayores a su derecha
        A[izq] = A[j]; //el elemento de en medio lo manda al pricipio
        A[j] = pivote; //el pivote lo pone en medio
        /// ordenar el sub arreglo izq
        /*for(int k=0; k<A.length; k++){
            System.out.print(A[k]);
        }System.out.print("\n");*/
        
        this.arregloOrdenado = A;
        if (izq<j-1)
            quickSortAlgoritmo(A,izq,j-1);
            /// ordena el sub arreglo der
        if (j+1 < der)
            // ordena subarray derecho
            quickSortAlgoritmo(A, j+1, der);
    }
    public int[] getArregloOrdenado() {
        return arregloOrdenado;
    }
    
}
