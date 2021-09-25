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
    private int[] A;
    public MergeSort() {
        super();
    }
    /**
     *
     * @param A
     */
    @Override
    public void ordenarDatos(int[] A) { // 5 4 3 2 1
        this.A=A;
        MergeSortAlgoritmo(A, 0, A.length-1); //0, 5
    }
    public void MergeSortAlgoritmo(int[] A, int begin, int end){
        this.A=A;
        for(int i:A){
          System.out.print(i);  
        }
        System.out.println();
        if(begin < end){ //0 < 4  Si
            int mit = (begin + end) / 2; //2
            MergeSortAlgoritmo(A, begin, mit); //primera mitad //5 4 2
            MergeSortAlgoritmo(A, mit+1, end); //segunda mitad // 3 1
            Merge(A, begin, mit, end); //A 0 2 4
        }
    }
    public void Merge(int[] A, int begin, int mit, int end){       
        int l = mit-begin+1; //2-0+1=3
        int r = end-mit; //4-2 = 2
        int L[] = new int[l];//primera mitad
        int R[] = new int[r];//segunda mitad
        
        for (int i = 0; i < l; i++)//primera mitad
            L[i] = A[begin + i];
        /*
        0 = A[0] =5 
        1 = A[1] =4
        2 = A[2] =3
        */
        for (int j = 0; j < r; j++)//segunda mitad
            R[j] = A[mit + 1 + j];
        /*
        0 = A[3] =2
        1 = A[4] =1
        */
        
        L[l] = 32767;
        R[r] = 32767;
        l = 0;
        r = 0;

        for(int i=0; i< end-begin+1; i++){ //5
            if(L[l] < R[r]){ //5<2 //5<1  //5<3267
                A[begin+i] = L[l]; //A[3] = 5
                l ++;
            }
            else{
                A[begin+i] = R[r]; //A[0] = 2  //A[1] = 1 
                r ++;
            }
        }
        this.A=A;
    } // 2 1 5 4 3
}
