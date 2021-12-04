/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hash;


/**
 *
 * @author Vanessa
 */
public class FuerzaBruta{
    int[] arreglo;
    int[] subCadena;
    int longitud1, longitud2;
    boolean validas;
    public FuerzaBruta(int[] arreglo, int[] subcadena){
        if(subcadena!=null && arreglo!=null && subcadena.length<arreglo.length ){
           this.arreglo=arreglo;
           this.subCadena=subcadena; 
           this.longitud1=this.arreglo.length;
           this.longitud2=this.subCadena.length;
           this.validas=true;
        }else{
            System.out.println("Cadenas inválidas");
            this.validas=false;
        }
    }
    
    public boolean algoritmo(){
        if(this.validas){
            for(int i=0; i<=this.longitud1-this.longitud2; i++){ //recorre el arreglo
                if(this.arreglo[i] == this.subCadena[0]){ //compara cada caracter del arreglo con el primero de la subcadena
                    int j=i+1, k=1;
                    while(k<this.longitud2 && this.arreglo[j] == this.subCadena[k]){ //mientras sean iguales
                        j++; k++;
                    }
                    if(k==this.longitud2) return true; //si la subcadena llego hasta el final
                }
            }
        }
        return false;  
    }
}

//1 0 1 1 0 1 1 0 1 1 0 =11
//1 1 1 =3

//si el hasheo determina que no es igual ya no hace fuerza bruta