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
    public FibonacciRecursivo(){
        super();
    }
    @Override
    public void algoritmo(long n){
        resultado = fibonnacciR(n);
    }
    public long fibonnacciR(long n){
        if(n == 0 || n == 1) return n;
        else return (fibonnacciR(n - 2) + fibonnacciR(n - 1));
    }
}
