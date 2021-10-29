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
public class MergeSort extends Algoritmo{
    private int[] arregloOrdenado;
    
    public MergeSort() {
        super("Merge Sort");
    }
    /**
     *
     * @param A
     */
    @Override
    public void ordenarDatos(int[] A) {
        mergeSortAlgoritmo(A, 0, A.length-1);
    }
    public void mergeSortAlgoritmo(int[] A, int begin, int end){ /* Metodo recursivo */
        /*System.out.print("\n   A1: ");
        for(int i=0; i<A.length; i++){
            System.out.print(A[i] + " ");
        }
        System.out.println("\nbegin: " + begin + "  end: " + end);*/
        
        if(begin < end){ //comprueba que el arreglo tiene una posición mayor a 1
            int mit = (begin + end) / 2; // obtenemos la mitad del arreglo
            //System.out.println("mit: " + mit);
            mergeSortAlgoritmo(A, begin, mit); // Elementos del lado izquierdo
            mergeSortAlgoritmo(A, mit+1, end);  // Elementos del lado derecho
            merge(A, begin, mit, end);
        }
    }
    public void merge(int A[],int izq, int m, int der){
        /*int i, j, k;
        int[] B = new int[A.length]; //array auxiliar
        for (i=izq; i<=der; i++)//copia ambas mitades en el array auxiliar                                       
             B[i]=A[i];
        i=izq; j=m+1; k=izq;
        
        while (i<=m && j<=der){ //copia el siguiente elemento más grande
               if (B[i]<=B[j])
                   A[k++]=B[i++];
               else
                   A[k++]=B[j++];
        }
        // Si quedan elementos por ordenar 
           //Copiar los elementos restantes a la primera mitad (izq)
        while (i<=m)
              A[k++]=B[i++]; 
        this.arregloOrdenado=A;*/
        int n1 = m - izq +1;
        int n2 = der-m;
        int B[] = new int[n1]; //primera mitad
        int C[] = new int [n2]; //segunda mitad
        for(int i=0; i<n1; i++){
            B[i] = A[izq+i];
        }
        for(int j=0; j<n2; j++){
            C[j] = A[m+j+1];
        }
        int i=0, j=0;
        int k=izq;
        while(i<n1 && j<n2){
            if(B[i] <= C[j]){
                A[k] = B[i]; i++;
            }else{
                A[k] = C[j]; j++;
            }k++;
        }
        while(i<n1){
            A[k] = B[i]; i++; k++;
        }
        while(j < n2){
            A[k] = C[j]; j++; k++;
        }
        this.arregloOrdenado=A;
     }
    
    public int[] getArregloOrdenado() {
        return arregloOrdenado;
    }
    
}
