/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aa2022;



import Ordenamiento.MergeSort;
import Ordenamiento.QuickSort;
import Recursividad.FactorialIterativo;
import Recursividad.FactorialRecursivo;
import Recursividad.FibonacciIterativo;
import Recursividad.FibonacciRecursivo;
import Recursividad.SumaRecursiva;

/**
 *
 * @author Vanessa
 */
public class TestMainRecursividad {
    public static void main(String[] args) {
        /*Suma s = new Suma();
        s.calcularTiempo(1876540,8377); //2532100 1661700  //suma normal: 4100
        
        s.sumaRecursiva(1876540,8377); //1933701 nano
        System.out.println();*/
        //FACTORIAL
        /*for(int n=1; n<31;n++){
            FactorialRecursivo fr = new FactorialRecursivo();
            fr.calcularTiempo(n);
            FactorialIterativo fi = new FactorialIterativo();
            fi.calcularTiempo(n);  
            System.out.println(n +"\t" + fr.gettTotal() +"\t" + fi.gettTotal());
        }*/
        //FIBONACCI
        /*for(int n=0; n<200;n++){
            FibonacciRecursivo fr1 = new FibonacciRecursivo();
            fr1.calcularTiempo(n);
            FibonacciIterativo fi = new FibonacciIterativo();
            fi.calcularTiempo(n);
            System.out.println(n +"\t" + fr1.gettTotal() +"\t" + fi.gettTotal());
        }*/
//SUMA
        /*int n1= 10000, n2=1700;
        for(int n=0; n<500; n++){
            n1+=100; n2+=100;
            SumaRecursiva sr = new SumaRecursiva();
            sr.calcularTiempo(n1, n2);
            Suma s = new Suma();
            s.calcularTiempo(n1, n2);
            System.out.print( n1 + "\t" + n2 + "\t");
            System.out.println(n +"\t" + sr.gettTotal() +"\t" + s.gettTotal());
        }*/
        
        //Merge Sort
        /*MergeSort m = new MergeSort();
        int[] A = {2, 4, 3, 1, 5};
        m.mergeSortAlgoritmo(A, 0, A.length-1); //0, 5
        System.out.println();
        
        int[] B = m.getArregloOrdenado();
        for(int i=0; i<B.length; i++){
            System.out.print(B[i]);
        }*/
        /*int[] A = {3, 2, 5, 4, 1};
        QuickSort sq = new QuickSort();
       // sq.quickSortAlgoritmo(A, 0, A.length-1);
       sq.quickSortAlgoritmo(A, 0, A.length-1);
       //sq.quickSortAlgoritmo(A);
        int[] B = sq.getArregloOrdenado();
        for(int i=0; i<B.length; i++){
            System.out.print(B[i]);
        }*/
    }
}
