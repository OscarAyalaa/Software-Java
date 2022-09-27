/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumas;

/**
 *
 * @author Oscar
 */import java.io.*;
public class Sumas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException{
    BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        System.out.println("introduzca el Valor 1:\n");
        System.out.flush();
        String cd = br.readLine();
        int op1= Integer.parseInt(cd);
        System.out.println("Introduzca el valor 2:\n");
        System.out.flush();
        String cd1 =br.readLine();
        int op2= Integer.parseInt(cd1);
        int suma = op1+op2;
        System.out.println("La uma es:\n"+suma);   
    }
    
}
