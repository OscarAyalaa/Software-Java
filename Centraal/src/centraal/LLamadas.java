/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centraal;

/**
 *
 * @author Oscar
 */import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class LLamadas {
    
    int tiempo;
    double costo;
    public LLamadas(){
        tiempo=0;
        costo=0.0;
    }
    public LLamadas(int tiempo, double costo){
        this.tiempo=tiempo;
        this.costo=costo;
    }
    public int obtenTiempo(){
        return tiempo;
    }
    public double obtenCosto(){
        return costo;
    }
    public void ponTiempo(int tiempo){
        this.tiempo=tiempo;
    }
    public void ponCosto(double costo){
    this.costo=costo;
}
    public double calcularPrecio(){
        return obtenTiempo()*obtenCosto();
    }
    
    private int cont=0;
    private double acum=0;
     public int getTotalLLamadas(){
         return cont;
    }
     public double getTotalFacturado(){
         return acum;
     }
     public void registrarLLamada(LLamadas param ){
         System.out.println(param);
         cont++;
         acum += param.calcularPrecio();
     }
    
     
}


