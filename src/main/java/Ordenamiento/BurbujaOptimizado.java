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
public class BurbujaOptimizado extends Ordenamiento{

    public BurbujaOptimizado() {
        super();
    }

    /**
     *
     * @param arreglo
     */
    @Override
    public void ordenarDatos(int[] arreglo) {
        int[] arreglo1 = arreglo.clone();
        boolean is_sorted;
        for (int i = 0; i < arreglo1.length - 1; i++) {
            is_sorted = false;
            for (int j = 0; j < arreglo1.length - 1; j++) {
                if (arreglo1[j + 1] < arreglo1[j]) {
                    int aux;
                    aux = arreglo1[j];
                    arreglo1[j] = arreglo1[j +1 ]; 
                    arreglo1[j +1 ] = aux; 
                    is_sorted = true;  
                }
            }
            if(!is_sorted) break; // Ya está ordenado
        }
    } 
    
    
    

        
       /* for(int i=1; i<a.length; i++) {            //4(n)    
          boolean is_sorted = true;                //1 (n)

          for(int j=0; j < a.length - i; j++) {    //(5n^2 + 14n^2) = 19 n^2
            if(a[j] > a[j+1]) {                    //4
               int temp = a[j];                    //2
               a[j] = a[j+1];                      //4
               a[j+1] = temp;                      //3
               is_sorted = false;                  //1
            }
          }
          
          if(is_sorted){
              return a;
          }
        }
        return null;
    }*/
}


