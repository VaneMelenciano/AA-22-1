/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herramientas;

import static Herramientas.GenerarDatos.CasoMedioInt;
import static Herramientas.GenerarDatos.MejorCasoInt;
import static Herramientas.GenerarDatos.PeorCasoInt;
import Ordenamiento.Algoritmo;
import java.util.ArrayList;
import org.jfree.data.xy.XYDataItem;

/**
 *
 * @author Vanessa
 */
/*
Ejecuto el algoritmo 10,000 veces, sin tomar en cuenta el tiempo de ejecución
Así el CPU cache datos necesarios sobre el algoritmo antes de la ejecución con tiempos
*/
public class Comparador {
   private ArrayList <Algoritmo> algoritmos;
   private int iteraciones;
   private int factorCrecimiento;
   private String tituloGrafica;
   private Grafica grafica;
   
   public Comparador(ArrayList<Algoritmo> algoritmos, int iteraciones, int factorCrecimiento, String titulo){
       this.algoritmos = algoritmos;
       this.iteraciones=iteraciones;
       this.factorCrecimiento=factorCrecimiento;
       this.tituloGrafica=titulo;
       comparar();
   }
   public void comparar(){
       this.grafica = new Grafica("N","Tiempo(ms)",this.tituloGrafica);
       for(Algoritmo a: algoritmos){ //genera las series
           this.grafica.agregarSerie(a.getNombre());
       }
       /*for(int i=1; i<iteraciones; i+=this.factorCrecimiento){
           //int rango[] = {1, 100};
           //int[] arreglo1 = CasoMedioInt(i, rango);
           //int[] arreglo2 = PeorCasoInt(i);
           int[] arreglo = MejorCasoInt(i);
           
            for (Algoritmo algoritmo: algoritmos){
                algoritmo.ordenar(arreglo.clone());
                double tiempo =  algoritmo.gettTotal();
                this.grafica.agregarDatoASerie(algoritmo.getNombre(),new XYDataItem(i, tiempo));
            }
       }*/
       //double[] tiempos = new double[this.iteraciones];
       for(int i=1; i<this.iteraciones; i+=this.factorCrecimiento){
           int rango[] = {1, 100};
           int[] arreglo = CasoMedioInt(i, rango);
           //int[] arreglo = PeorCasoInt(i);
           System.out.println(i);
           //int[] arreglo = MejorCasoInt(i);
           for (Algoritmo algoritmo: algoritmos){
               //System.out.println(algoritmo.nombre);
                algoritmo.ordenar(arreglo.clone());
                double tiempo =  algoritmo.gettTotal();
                this.grafica.agregarDatoASerie(algoritmo.getNombre(),new XYDataItem(i, tiempo));
            }
       }
       
   }
   public void grafica(){
       this.grafica.crearGrafica();
       this.grafica.mostrarGrafica();
   }
}
