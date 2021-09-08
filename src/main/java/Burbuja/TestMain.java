/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Burbuja;
import static Herramientas.GenerarDatos.CasoMedio;
import static Herramientas.GenerarDatos.CasoMedioInt;
import static Herramientas.GenerarDatos.MejorCaso;
import static Herramientas.GenerarDatos.MejorCasoInt;
import static Herramientas.GenerarDatos.PeorCaso;
import static Herramientas.GenerarDatos.PeorCasoInt;
//import static Herramientas.Graficar;

/**
 *
 * @author Vanessa
 */
public class TestMain {
    public static void main(String[] args) {
      //Valores que tiene el arreglo desordenado.
      /*int arreglo[] = {1, 2, 3, 4, 5};
      BurbujaTradicional bt = new BurbujaTradicional();
      BurbujaOptimizado bo = new BurbujaOptimizado();
      int arregloOrdenado[] = bt.ordenar(arreglo);
 
      //imprimimos el arreglo ordenado.
      for(int i = 0; i < arregloOrdenado.length;i++)
        System.out.print(arregloOrdenado[i]);*/
      /*int arreglo[] = {1, 2, 3, 4, 5};
      int arreglo1[] = {5, 4, 3, 2, 1};
      int arreglo2[] = {3, 4, 1, 5, 2};
      BurbujaTradicional bt = new BurbujaTradicional();
      BurbujaOptimizado bo = new BurbujaOptimizado();
      
      bt.ordenar(arreglo);
      bt.ordenar(arreglo1);
      bt.ordenar(arreglo2);
      
      bo.ordenar(arreglo);
      bo.ordenar(arreglo1);
      bo.ordenar(arreglo2);
      
      System.out.println();*/
      
      
    int[] rango = {1, 4};
    int dimension = 5;
    int[] arreglo1 = CasoMedioInt(dimension, rango);
    int[] arreglo2 = PeorCasoInt(dimension);
    int[] arreglo3 = MejorCasoInt(dimension);
    
    BurbujaTradicional bt = new BurbujaTradicional();
    BurbujaOptimizado bo = new BurbujaOptimizado();
    
    bo.ordenar(arreglo3);
    System.out.println(bo.gettTotal());
    
    bt.ordenar(arreglo3);
    System.out.println(bt.gettTotal());
    
    
        /*int n = 5000;
        int[] aux;
        double[] tiempos = new double[n];
        Burbuja b = new Burbuja();
       
        // complejidad algoritmica Sumatoria ( Generar los datos aleatorios + busqueda + almacenar el tiempo)
        for (int j = 0; j < n; j++){
            aux = GeneradorDatos.generarArregloInt(j,1000);
            b.ordenar(aux);
            tiempos[j] = (int) b.gettTotal();
            //System.out.println("j= "+j+" :"+tiempos[j]);
        }  
        System.out.println();
        Grafica g1 = new Grafica("N","Tiempo","Tiempos");
        g1.agregarSerie("t1",tiempos);
        g1.crearGrafica();
        g1.muestraGrafica();*/
        
    }
    
    
    
}
