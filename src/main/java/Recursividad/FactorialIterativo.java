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
public class FactorialIterativo extends Tiempo{
    public FactorialIterativo(){
        super();
    }  
    @Override
    public void algoritmo(long n1){
        resultado = factorial(n1);
    }   
    
    public long factorial(long n){
        if (n <= 0) return 1;
        long res = 1;
        while (n > 1) {
                res *= n;
                n--;
        }
        return res;
    }
}
