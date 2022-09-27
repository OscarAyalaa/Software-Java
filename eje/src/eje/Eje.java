/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje;

/**
 *
 * @author Oscar
 */ 
import java.io.*;
public class Eje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException{
        String cd;
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        System.out.print("introduzca una linea por el teclado\n");
        System.out.flush();
        cd = br.readLine();
        System.out.print("Linea de entrada" +cd);
    }
    
}
