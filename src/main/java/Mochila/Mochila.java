/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mochila;

import java.util.ArrayList;

/**
 *
 * @author Vanessa
 */
public final class Mochila {
    ArrayList<Item> items;
    public int[][] matriz; //MATRIZ DE BENEFICIONS //historico de las soluciones optimas para versiones más pequeñas de la mochila
    int capacidadM;
    int numElementos;
    int beneficioMax;
    private ArrayList<Integer> elementos;
    public Mochila(ArrayList<Item> items, int c){
        this.items=items;
        this.capacidadM=c;
        this.numElementos=this.items.size();
        this.matriz=new int[this.numElementos+1][this.capacidadM+1];
        llenarMatriz();
    }
    public void llenarMatriz(){
        for(int i=0; i<=this.capacidadM; i++)
            this.matriz[0][i] = 0;
        for(int i=1; i<=this.numElementos; i++)
            this.matriz[i][0] = 0;
        
        for(int i=1; i<=this.numElementos; i++){
                int wi = this.items.get(i-1).getPeso();
                int bi = this.items.get(i-1).getBeneficio();
            for(int w=0; w<=this.capacidadM; w++){
                int wwi = w-wi;
                if(wi <= w){
                    if( (bi + this.matriz[i-1][wwi]) > this.matriz[i-1][w])
                        this.matriz[i][w]=bi+this.matriz[i-1][wwi];
                    else
                        this.matriz[i][w]=this.matriz[i-1][w];
                }else
                    this.matriz[i][w] = this.matriz[i-1][w];
            }
        }
        this.beneficioMax = this.matriz[this.numElementos][this.capacidadM];
        encontrarElementos();
    }
    public void encontrarElementos(){
        int i=this.numElementos, k=this.capacidadM;
        this.elementos=new ArrayList<Integer>();
        while(i>0 && k>0){
            if(this.matriz[i][k] != this.matriz[i-1][k]){
                this.getElementos().add(i);
                i=i-1; k=k-this.items.get(i).getPeso();
            }
            else
                i=i-1; 
        }
    }

    /**
     * @return the elementos
     */
    public ArrayList<Integer> getElementos() {
        return elementos;
    }
    public void imprimirE(){
        //int c=0;
        System.out.println("Beneficio maximo: " + this.beneficioMax);
        System.out.print("Elementos seleccionado: ");
        for(int i=this.elementos.size()-1; i>0; i--){
            System.out.print((this.elementos.get(i)-1) + ", ");
            if((i == this.elementos.size()-13 || i == this.elementos.size()-26) && i>=1)
                System.out.println();
            //c+=this.items.get((this.elementos.get(i))-1).getPeso();
            //System.out.print("\"" + this.items.get(this.elementos.get(i)).getPeso() + "\"");
        }System.out.print((this.elementos.get(0)-1));
        //System.out.print("\"" + this.items.get(this.elementos.get(0)).getPeso() + "\"");
        //c+=this.items.get((this.elementos.get(0))-1).getPeso();
        //System.out.println("\n" + c);
    }
}
