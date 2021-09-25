/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursividad;

/**
 *
 * @author Vanessa
 */
public abstract class Tiempo {
    public long tInicio;
    public long tFinal;
    public long tTotal;
    public long resultado;

    public Tiempo() {
        this.tFinal = 0;
        this.tInicio = 0;
        this.tTotal = 0 ;
    }
  
    public void calcularTiempo(long n1, long n2){
        //this.tInicio = System.currentTimeMillis(); //le pide al sistema el tiempo registrado en ese moemnto, en milisegundos
        
        this.tInicio = System.nanoTime();
        algoritmo(n1, n2);
        this.tFinal = System.nanoTime();
        //this.tFinal = System.currentTimeMillis(); // vuelve a hacer petición del tiempo para saber cuando termina el ordenamiento
        this.tTotal = this.tFinal - this.tInicio; //se estima el tiempo total que le llevo ejecutar el ordenamiento
    }
    public void calcularTiempo(long n1){
        this.tInicio = System.nanoTime(); //le pide al sistema el tiempo registrado en ese moemnto, en milisegundos
        // 10^(-3) s  = 0.001
        algoritmo(n1);
        this.tFinal = System.nanoTime(); // vuelve a hacer petición del tiempo para saber cuando termina el ordenamiento
        this.tTotal = this.tFinal - this.tInicio; //se estima el tiempo total que le llevo ejecutar el ordenamiento
    }
    public long gettFinal() {
        return tFinal;
    }

    public long gettInicio() {
        return tInicio;
    }

    public long gettTotal() {
        return tTotal;
    }
    
    public void algoritmo(long n1, long n2){
    }
    public void algoritmo(long n1){
    }
    
    public long getResultado() {
        return resultado;
    }
}
