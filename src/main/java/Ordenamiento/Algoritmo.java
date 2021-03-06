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
public abstract class Algoritmo {
    public long tInicio;
    public long tFinal;
    public long tTotal;
    public String nombre;

    public Algoritmo(String n) {
        this.tFinal = 0;
        this.tInicio = 0;
        this.tTotal = 0 ;
        this.nombre=n;
    }
  
    public void ordenar(int[] datos){
        //this.tInicio = System.nanoTime();
        this.tInicio = System.currentTimeMillis(); //le pide al sistema el tiempo registrado en ese moemnto, en milisegundos
        // 10^(-3) s  = 0.001
        ordenarDatos(datos);
        this.tFinal = System.currentTimeMillis(); // vuelve a hacer petición del tiempo para saber cuando termina el ordenamiento
        //this.tInicio = System.nanoTime();
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

    public String getNombre(){
        return nombre;
    }
    public void ordenarDatos(int[] arreglo) {
    } 
}
