/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursividad;

import java.util.Objects;

/**
 *
 * @author Vanessa
 */
public class FibonacciDinamico extends Tiempo{
    private int contador;
    private Long[] resultados;
    public FibonacciDinamico(){
       super(); 
       this.contador=0;
    }
    @Override
    public void algoritmo(int n){ //para calcular tiempos
        this.resultados = new Long[n];
        resultado = fibonacciD(n, this.resultados);
    }
    
    public long  fibonacciDinamico(int n){
       this.resultados = new Long[n];
        return resultado = fibonacciD(n, this.resultados); 
    }
    public long fibonacciD(int n, Long[] result){
        //Long resultado = result[n-1];
        //if(Objects.nonNull(result[n-1])){ //ya tiene el resultado
        if(result[n-1]!=null){ //ya tiene el resultado
            return result[n-1];
        }
        //no tiene el resultado
        if(n<=2){ 
            return result[n-1] = 1L;
        } else{
            contador+=2;
            //System.out.println("f(" + (n-2) + ")  +   f("+ (n-1)+")");
            return  result[n-1]= (fibonacciD(n - 2, result) + fibonacciD(n - 1, result));
        }
    }
    public int getContador(){
        return this.contador;
    }
    
}
