/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursividad;

/**
 *
 * @author Vanessa
 * Suma recursiva de dos numeros enteros
 */
public class SumaRecursiva extends Tiempo{

    public SumaRecursiva(){
        super();
    }

    /**
     *
     * @param n1
     * @param n2
     */
    @Override
    public void algoritmo(long n1, long n2){
        resultado = sumaRecursiva(n1, n2);
    }
    /*public long sumaRecursiva(long n1, long n2){ //5 ,5
        if (n2 == 0)return n1;
        else return (sumaRecursiva(n1+1, n2-1)); //sumaRecursiva(n1+1, n2-1);
    }*/
    public long sumaRecursiva(long n1, long n2) {                                                                            
        if (n2 == 0) return n1;
        else return 1 + sumaRecursiva(n1, n2 - 1); 
    }
}
