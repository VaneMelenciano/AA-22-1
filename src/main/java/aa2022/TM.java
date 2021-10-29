/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aa2022;


import Herramientas.Comparador;
import Herramientas.Grafica;
import Ordenamiento.Algoritmo;
import Ordenamiento.BurbujaOptimizado;
import Recursividad.FibonacciDinamico;
import Recursividad.FibonacciRecursivo;
import java.util.ArrayList;

/**
 *
 * @author Vanessa
 */
public class TM {
    public static void main(String[] args) {
        /*FibonacciRecursivo fr = new FibonacciRecursivo();
        System.out.println("R= " +fr.fibonacciR(7));
        System.out.println(fr.getContador() + "\n\n");
        FibonacciDinamico fd = new FibonacciDinamico();
        System.out.println("R= " +fd.fibonacciDinamico(7));
        System.out.println(fd.getContador());*/
        
        int num = 43;
        long resultRec[] = new long[num];
        long resultDin[] = new long[num];
        for(int i=1; i<num; i++){
            System.out.println(i);
            FibonacciRecursivo fr1 = new FibonacciRecursivo();
            FibonacciDinamico fd1 = new FibonacciDinamico();
            fr1.fibonacciR(i);fd1.fibonacciDinamico(i);
            resultRec[i] =fr1.getContador();
            resultDin[i] = fd1.getContador();
            System.out.println(resultRec[i] + "  ,  " + resultDin[i] + "\n");
        }
        Grafica g1 = new Grafica("N","Llamadas recursivas","Fibonacci");
         g1.agregarSerie("Recursivo", resultRec);
         g1.agregarSerie("Dinamico", resultDin);
       //g1.agregarSerie("Burbuja Optimizada", tiempos2);
        //g1.agregarSerie("Insert Sort", tiempos3);
        //g1.agregarSerie("Merge Sort", tiempos4);
        //g1.agregarSerie("Quick Sort", tiempos5);
        
        
        g1.crearGrafica();
        g1.mostrarGrafica();
        
        //Comparador c = new Comparador();
        /*ArrayList<Algoritmo> algoritmos = new ArrayList<>();
        algoritmos.add(new BurbujaOptimizado());
        algoritmos.add(new FibonacciRecursivo());
        algoritmos.add(new FibonacciDinamico());*/
    }
}
