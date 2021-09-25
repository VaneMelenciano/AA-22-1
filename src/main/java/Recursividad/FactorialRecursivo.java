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
public class FactorialRecursivo extends Tiempo{ // 5! = 5*4*3*2*1 ->  5! = 5*4! -> 5! = 5*4! = 5*4*3!
    public FactorialRecursivo(){
        super();
    }
    /**
     *
     * @param n1
     * @return
     */
    @Override
    public void algoritmo(long n1){
        resultado = factorial(n1);
    }
    
    public long factorial(long n){
        if (n==0|| n == 1) return 1;
        return n*factorial(n-1);
    }
}
