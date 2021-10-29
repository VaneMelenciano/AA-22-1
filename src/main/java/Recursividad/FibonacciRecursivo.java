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
public class FibonacciRecursivo extends Tiempo{
    int contador;
    public FibonacciRecursivo(){
        super();
        this.contador=0;
    }
    @Override
    public void algoritmo(int n){
        resultado = fibonacciR(n);
    }
    public long fibonacciR(int n){
        if(n == 0 || n == 1) return n;
        contador+=2;
        //System.out.println("f(" + (n-2) + ")  +   f("+ (n-1)+")");
        return (fibonacciR(n - 2) + fibonacciR(n - 1));
    }
    public int getContador(){
        return this.contador;
    }
}
