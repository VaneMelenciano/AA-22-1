/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herramientas;

import java.util.Random;

/**
 *
 * @author Vanessa
 */
public class GenerarDatos {
    
    public GenerarDatos(){
        
    }
    //Primero se generan los datos, antes de analizar los algoritmos de ordenamiento
    
        //caso medio 
        //arreglo con elementos pseudoaleatorios
    public static double[] CasoMedio(int n, int[] rango){
        // n es la dimension de cuantos elementos se quieren
        //el rango es entre que numeros está el arreglo, ej. un arreglo entre 0 y 100, de 5 elementos (n)
        double[] arreglo = new double[n];
         Random rnd = new Random();
        for (int x=0;x<n;x++)
            arreglo[x] = rnd.nextInt(rango[1] - rango[0] + 1) + rango[0];       
        return arreglo;
    }
    public static int[] CasoMedioInt(int n, int[] rango){
        // n es la dimension de cuantos elementos se quieren
        //el rango es entre que numeros está el arreglo, ej. un arreglo entre 0 y 100, de 5 elementos (n)
        int[] arreglo = new int[n];
         Random rnd = new Random();
        for (int x=0;x<n;x++)
            arreglo[x] = rnd.nextInt(rango[1] - rango[0] + 1) + rango[0];       
        return arreglo;
    }
   
    
        //peor caso
        //arreglo ordenado de manera descendiente
    public static double[] PeorCaso(int n){
        //n es la dimension del arreglo
        double[] arreglo = new double[n];
        int aux = n;
        for(int i=0, j=aux; i<n && j>0; i++, j--){
            arreglo[i] = j;
        }
        return arreglo;
    }
    public static int[] PeorCasoInt(int n){
        //n es la dimension del arreglo
        int[] arreglo = new int[n];
        int aux = n;
        for(int i=0, j=aux; i<n && j>0; i++, j--){
            arreglo[i] = j;
        }
        return arreglo;
    }
            
    
        //mejor caso
        //arreglo ordenado
    public static double[] MejorCaso(int n){
        //n es la dimension del arreglo
        double[] arreglo = new double[n];
        for(int i=0, j=1; i<n && i<=n; i++, j++){
            arreglo[i] = j;
        }
        return arreglo;
    }
    public static int[] MejorCasoInt(int n){
        //n es la dimension del arreglo
        int[] arreglo = new int[n];
        for(int i=0, j=1; i<n && i<=n; i++, j++){
            arreglo[i] = j;
        }
        return arreglo;
    }
}
