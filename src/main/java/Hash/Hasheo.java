/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hash;

import static java.util.Objects.hash;

/**
 *
 * @author Vanessa
 */
public class Hasheo extends FuerzaBruta{
    private char[] arrAux;
    
    public Hasheo(int[] arreglo, int[] subcadena){
        super(arreglo, subcadena);
        this.arrAux = new char[this.longitud2];
    }
    @Override
    public boolean algoritmo(){
        if(this.validas){
            //hash de subcadena
            for(int k=0; k<this.longitud2; k++){
               this.arrAux[k] = (char) this.subCadena[k];
            }
            int hashSub = this.hashCode();
            //recorre cadena
            for(int i=0; i<=this.longitud1-this.longitud2; i++){
                int j = 0;
                while(j<this.longitud2){ //extrae elementos desde i hasta la longitud de la subcadena
                    this.arrAux[j] = (char) this.arreglo[i+j];
                    j++;
                }
                if(hashSub == this.hashCode()){
                    return true;
                }
            }
        }
        return false;   
    }
    @Override
    public int hashCode() {
        /*int h = hash;
        if (h == 0 && value.length > 0) {
            char val[] = value;
            for (int i = 0; i < value.length; i++) {
                h = 31 * h + val[i];
            }
            hash = h;
        }
        return h;*/
        int h=0;
        //int val[] = this.arreglo;
        char val[] = this.arrAux;
        for (int i = 0; i < this.longitud2; i++) {
            h = 31 * h + val[i];
        }
        return h;
    }
}
