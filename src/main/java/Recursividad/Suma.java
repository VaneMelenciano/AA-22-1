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
public class Suma extends Tiempo{

    public Suma(){
        super();
    }

    /**
     *
     * @param n1
     * @param n2
     */
    @Override
    public void algoritmo(long n1, long n2){
        resultado = suma(n1, n2);
    }
    public long suma(long n1, long n2){ //5 ,5
        return n1 + n2;
    }
}
