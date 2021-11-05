/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ajedrez;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vanessa
 */
public class Ajedrez {
    private int[][] tablero;
    private int n;
    List<Integer[]> p; //posibles siguientes posiciones
    public Ajedrez(int x, int y){
        this.n=8;
       if(x>0 && x<n && y>0 && y<n){
        this.tablero = new int[this.n][this.n]; 
        this.p = new ArrayList<>();
        sigPosiciones();
        llenarTablero(x, y); 
        imprimirTalero();
       }else{
           System.out.println("Punto inicial fuera del tablero");
       }
    }
    public Ajedrez(int x, int y, int n){
       this.n=n;
       if(x>0 && x<n && y>0 && y<n){
        this.tablero = new int[n][n]; 
        this.p = new ArrayList<>();
        sigPosiciones();
        llenarTablero(x, y);
        imprimirTalero();
       }else{
           System.out.println("Punto inicial fuera del tablero");
       }
    }   
    /*
    p0 = x+2,y+1
    p1 = x+2,y-1
    p2 = x+1,y-2
    p3 = x-1,y-2
    p4 = x-2,y-1
    p5 = x-1,y+1
    p6 = x-1,y+2
    p7 = x+1,y+2
    */
    public void llenarTablero(int x1, int y1){
        /*se pone en el tablero en num 1*/
        int x =x1, y=y1; //posiciones actuales
        int numAct = 1;
        this.tablero[x][y] = numAct++;
        
        while(numAct<=(this.n*this.n) ){ //hasta llenar el tablero
            //System.out.println("Act: " + x + "  " + y);
            //imprimirTalero();
            int xA=0, yA=0; //coordenadas auxiliares para la sig posición
            int xMin=0, yMin=0, min=0; //min es para poner la menor cantidad de siguinetes posiciones
            /*calculamos la primera siguiente posición*/
            boolean primeraPos = false;
            int k=0;
            while(!primeraPos && k<this.n){ //si k llega a 8 y primeraPos es falso, no hay posibilidades
               xA = x + p.get(k)[0];
               //System.out.println("\tx = " + x + "  sum:" + p.get(k)[0]);
               //System.out.println("\ty = " + y + "  sum:" + p.get(k)[1]);
               yA = y + p.get(k)[1]; 
           
               if(xA>=0 && yA>=0 && xA<this.n && yA<this.n && this.tablero[yA][xA]==0){ //si xA,yA está dentro del tablero
                   xMin=xA; yMin=yA;
                   min = calcularPosibilidades(xA, yA);
                   primeraPos=true;
                   //System.out.println("\tPrimera: " + xMin + " "+ yMin + "  posi: " + min);
               }
               k++;
            }//k=3
            /*siguientes posiciones*/
            if(k<(this.n+1) && primeraPos==true){ //si k es menor a n+1 y sí existe la primera posición, puede haber más
                //menor a nueve, porque si k es 8, sí existe una posibilidad, y es la última
                for(int i=k; i<8; i++){
                    xA = x + p.get(i)[0];
                    yA = y + p.get(i)[1];
                    
                    if(xA>=0 && yA>=0 && xA<this.n && yA<this.n && this.tablero[yA][xA]==0){ //si xA,yA está dentro del tablero y está desocupado el lugar
                       //System.out.println("\tx = " + x + "  sum:" + p.get(k)[0]);
                        //System.out.println("\ty = " + y + "  sum:" + p.get(k)[1]);
                    
                        int minAux = calcularPosibilidades(xA, yA);
                       //System.out.println("\tOtra pos: " + xA + " "+ yA + "  posi: " + minAux);
                        if( minAux <= min){
                           min = minAux;
                           xMin=xA; yMin=yA;
                       }
                    }
                }
                //la siguiente posicion será xMin, yMin
                this.tablero[yMin][xMin] = numAct++;
                //System.out.println("Sig: " + xMin + "  " + yMin);
                x=xMin; y=yMin; //asignamos siguinetes posibilidades
                //imprimirTalero();
            }
            else{//ya no hay siguientes posiciones  
                break;
            }
        }
    }
    //calcula cuales son las posibles siguientes posibilidades
    //public List<Integer[]> calcularPosibilidades(int x, int y){
    public int calcularPosibilidades(int x, int y){
        //System.out.println("\tx1=" + x + "y1=" +y);
        int xA=0, yA=0, cont=0; 
        //List<Integer[]> pos = new ArrayList<>(); //posibilidades
        for(int i=0; i<8; i++){
            xA = x + p.get(i)[0];
            yA = y + p.get(i)[1];
            //System.out.println("\tx=" + xA + "y=" +yA);
            if(xA>=0 && yA>=0 && xA<this.n && yA<this.n && this.tablero[yA][xA]==0){ //si xA,yA está dentro del tablero
                //pos.set(i, new Integer[] {xA, yA}); //se agrega esa posibilidad
                cont++;
            }
        }
        //return pos;
        return cont;
    }
    
    public void sigPosiciones(){ //respecto a los saltos de caballo
        p.add(new Integer[] {2, -1});
        p.add( new Integer[] {2, 1});
        p.add( new Integer[] {1, 2});
        p.add( new Integer[] {-1, 2});
        p.add( new Integer[] {-2, 1});
        p.add( new Integer[] {-2, -1});
        p.add( new Integer[] {-1, -2});
        p.add( new Integer[] {1, -2});
    }
    public void imprimirTalero(){
        for(int i=0; i<this.n; i++){
            for(int j=0; j<n; j++)
                System.out.print(this.tablero[i][j] + "\t");
            System.out.println();
        }
    }
}
