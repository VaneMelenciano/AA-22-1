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
public class FibonacciIterativo extends Tiempo{
    public FibonacciIterativo(){
        super();
    }
    @Override
    public void algoritmo(long n){
        resultado = fibonnacciI(n);
    }
    public long fibonnacciI(long n){ //Iterativo
        long siguiente = 1, actual = 0, temporal = 0;
	for (long x = 1; x <= n; x++) {
            temporal = actual;
            actual = siguiente;
            siguiente = siguiente + temporal;
	}
	return actual;
    }
}
