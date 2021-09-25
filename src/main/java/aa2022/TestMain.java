/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aa2022;
import Ordenamiento.BurbujaTradicional;
import Ordenamiento.BurbujaOptimizado;
import static Herramientas.GenerarDatos.CasoMedio;
import static Herramientas.GenerarDatos.CasoMedioInt;
import static Herramientas.GenerarDatos.MejorCaso;
import static Herramientas.GenerarDatos.MejorCasoInt;
import static Herramientas.GenerarDatos.PeorCaso;
import static Herramientas.GenerarDatos.PeorCasoInt;
import Herramientas.Grafica;
import Ordenamiento.InsertSort;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Calendar;
//import static Herramientas.Graficar;

/**
 *
 * @author Vanessa
 */
public class TestMain {
    public static void main(String[] args) {
    int[] rango = {1, 90};
    //int dimension = 10000;
    int dimension = 50000;
    int[] arreglo1 = CasoMedioInt(dimension, rango);
    int[] arreglo2 = PeorCasoInt(dimension);
    int[] arreglo3 = MejorCasoInt(dimension);
    
    double[] tiempos1 = new double[dimension];
    double[] tiempos2 = new double[dimension];
    double[] tiempos3 = new double[dimension];
    
    BurbujaTradicional bt = new BurbujaTradicional();
    BurbujaOptimizado bo = new BurbujaOptimizado();
    InsertSort in = new InsertSort();
    
    /*bo.ordenar(arreglo2);
    System.out.println(bo.gettTotal());
    bt.ordenar(arreglo1);
    System.out.println(bt.gettTotal());
    in.ordenar(arreglo1);
    System.out.println(in.gettTotal());*/
    System.out.println(ZonedDateTime.now());
    //for(int n=500, i=0; n<550 && i<50; n++, i++){
    //for(int n=0; n<dimension; n++){
    for(int n=0; n<dimension; n+=5){
        int[] arreglo = PeorCasoInt(n);
        in.ordenar(arreglo.clone());
        tiempos3[n] = in.gettTotal(); 
        bo.ordenar(arreglo.clone());
        tiempos2[n] = bo.gettTotal(); 
        bt.ordenar(arreglo.clone());
        tiempos1[n] = bt.gettTotal();
        
        
        
        System.out.println(n);
        //System.out.println("\n" +n + " " + tiempos[n] + " "+  bo.gettTotal());
    }
    
   
    Grafica g1 = new Grafica("N","Tiempo (ms)","PeorCaso");
        g1.agregarSerie("Burbuja Tradicional", tiempos1);
        g1.agregarSerie("Burbuja Optimizada", tiempos2);
        g1.agregarSerie("Insert Sort", tiempos3);
        g1.crearGrafica();
        g1.mostrarGrafica();
        System.out.println(ZonedDateTime.now());
        
        
    /*BurbujaTradicional bt = new BurbujaTradicional();
    BurbujaOptimizado bo = new BurbujaOptimizado();
    InsertSort in = new InsertSort();
    
        for(int i=500; i<=5300; i+=300){
            int[] rango = {1, 100};
            int dimension = i;
            System.out.println("N: " + dimension);
            //int[][] arreglos; // filas = 3
            ArrayList<int[]> arreglos = new ArrayList<>();
                int[] arreglo1 = CasoMedioInt(dimension, rango);
                int[] arreglo2 = PeorCasoInt(dimension);
                int[] arreglo3 = MejorCasoInt(dimension);
                arreglos.add(arreglo1);
                arreglos.add(arreglo2);
                arreglos.add(arreglo3);
               int j=0;
            for(int[] aux: arreglos){
                System.out.println("\n Caso: " + j);
                bt.ordenar(aux);
                System.out.println(bt.gettTotal());
                bo.ordenar(aux);
                System.out.println(bo.gettTotal());
                in.ordenar(aux);
                System.out.println(in.gettTotal());
                j++;
            }
            
            
        }*/
    }
    
    
    
}
