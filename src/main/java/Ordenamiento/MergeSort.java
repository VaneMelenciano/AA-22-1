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
public class MergeSort extends CalculoTiempo{
    private int[] arregloOrdenado;
    public MergeSort() {
        super();
    }
    /**
     *
     * @param A
     */
    @Override
    public void ordenarDatos(int[] A) {
        mergeSortAlgoritmo(A, 0, A.length-1);
    }
    public void mergeSortAlgoritmo(int[] A, int begin, int end){
        if(begin < end){ 
            int mit = (begin + end) / 2;
            mergeSortAlgoritmo(A, begin, mit);
            mergeSortAlgoritmo(A, mit+1, end); 
            merge(A, begin, mit, end);
        }
    }
    public void merge(int A[],int izq, int m, int der){
        int i, j, k;
        int [] B = new int[A.length]; //array auxiliar
        for (i=izq; i<=der; i++)      //copia ambas mitades en el array auxiliar                                       
             B[i]=A[i];
        i=izq; j=m+1; k=izq;
        //0    3      0
        while (i<=m && j<=der) //copia el siguiente elemento más grande    
               if (B[i]<=B[j])
                   A[k++]=B[i++];
               else
                   A[k++]=B[j++];

        while (i<=m)         //copia los elementos que quedan de la
              A[k++]=B[i++]; //primera mitad 
        this.arregloOrdenado=A;
     }
    
    public int[] getArregloOrdenado() {
        return arregloOrdenado;
    }
    
}
