/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TSP;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Vanessa
 */
public class VecinosCercanos {
    private int[][] matriz; //matriz de distancias
    //private char[] camino; //Ej. A, C, D, B, A
    //private int[] camino; //Ej. A, C, D, B, A
    //private ArrayList<Integer> camino;
    private ArrayList<Character> camino;
    private int total; //total de peso recorridos
    private int[] pesos; //pesos recorridos
    private char inicio;
    public VecinosCercanos(int m[][]){
        this.matriz=m;
        //this.camino = new char[m.length+1]; //solo puede llegar una vez a cada punto y el +1 es porque regresa a A
        this.camino = new ArrayList<Character>();
        this.pesos = new int[m.length];
        this.total=0;
        this.inicio = 'A';
        encontrarCamino();
    }
    public VecinosCercanos(int m[][], char inicio){
        this.matriz=m;
        //this.camino = new char[m.length+1]; //solo puede llegar una vez a cada punto y el +1 es porque regresa a A
        this.camino = new ArrayList<Character>();
        this.pesos = new int[m.length];
        this.total=0;
        this.inicio = inicio;
        encontrarCamino();
    }
    public void encontrarCamino(){
       int i= (int)inicio-65, w=0;
       //this.camino[i]=65;
       this.camino.add(inicio);
       //for(i=0; i<this.matriz.length; i++){
       while(w<this.matriz.length){
           System.out.println("\nw: " + w);
           int aux = 0;//(i==0 ? 1: 0);
           for(int h=0; h<this.matriz.length;h++){
               if(i!=h && this.camino.contains((char)(h+65))==false && this.matriz[i][h]!=0){
                   aux=h;
                    break;
               }
           }
           int minn = this.matriz[i][aux];
           System.out.println("  i: " + i + " minn: " + minn);
           int posMinn= aux;
           
                for(int p=0; p<this.camino.size(); p++){
                   System.out.print( this.camino.get(p) +"  "); 
                }System.out.println();
                boolean encontrado = false; 
            for(int j=aux; j<this.matriz.length; j++){ //recorre renglon
                System.out.println("  j: " + j + "  j+65= " + (j+65));
                int u=j+65;
                System.out.println("  encontrar: " + this.camino.contains((char)(j+65)));
                int auxMin = this.matriz[i][j];
                System.out.println("  aux: " + auxMin);
               if(i!=j && this.camino.contains((char)(j+65))==false && auxMin!=0){ //si no es la diagonal ni se a recorrido aún
                    System.out.println("  entra1");
                   if(auxMin < minn){
                       System.out.println("  entra2");
                        minn = auxMin;
                        posMinn = j;
                        encontrado = true;
                    }
               }
           }
            System.out.println(encontrado + "  "+(this.matriz.length-1));
            if(!encontrado && w==this.matriz.length-1){                
                int l = inicio-65;
                 this.camino.add((char)(inicio));
                   this.total+=this.matriz[i][l];
                //this.camino[w+1]=posMinn+65; //pasar con codigo ASCII la posicion: A, B, C..
                //pasar con codigo ASCII la posicion: A, B, C..
                this.pesos[w]=this.matriz[i][l];
           }else{
                System.out.println("  último1: " + minn + "  pos: "+posMinn);
                i=posMinn;
                this.total+=minn;
                //this.camino[w+1]=posMinn+65; //pasar con codigo ASCII la posicion: A, B, C..
                this.camino.add((char)(posMinn+65)); //pasar con codigo ASCII la posicion: A, B, C..
                this.pesos[w]=minn;
           }
            
           w++;
           
       }
       //this.camino[this.matriz.length]=65;
       //this.camino.add(65);
    }
    public void imprimir(){
        //Camino: Ej. A, C, D, B, A
        /*for(int i=0; i<this.camino.length-1; i++){
            System.out.print((char)this.camino[i] + ", ");
        }System.out.println((char)this.camino[this.camino.length-1]);*/
        System.out.println();
        for(int i=0; i<this.camino.size()-1; i++){
            System.out.print(this.camino.get(i) + ", ");
        }System.out.println(this.camino.get(this.camino.size()-1));
        
        //pesos recorridos y total
        for(int i=0; i<this.pesos.length-1; i++){
            System.out.print(this.pesos[i] + ", ");
        }System.out.println(this.pesos[this.pesos.length-1] + " = " + this.total);
    }
}
