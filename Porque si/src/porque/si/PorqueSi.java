/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package porque.si;

import java.util.Scanner;
import java.lang.Math;

public class PorqueSi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int j=1 ,i=3000;
        int numerador=0, denominador=0; 
        double sumatoria=0,producto=1,pi, anterior, actual;
       Scanner obj = new Scanner(System.in);
       
       do
       {
        sumatoria =0;
        numerador=0; denominador=0;
        numerador += Math.pow(2*j,2);
        //denominador += (((2*j)-1)*((2*j)+1));
        denominador += ((4*Math.pow(j,2))-1);
        sumatoria += Math.pow(2*j,2)/((4*Math.pow(j,2))-1);
         j++;
         producto *=sumatoria;
       }while(j<=i);
        pi= 2*producto;
      
        
        System.out.println("numerador "+numerador);
        System.out.println("denominador "+denominador);
        System.out.println("sumatoria "+sumatoria);
        System.out.println("producto "+producto);
        System.out.println("pi "+pi);
    }
    
}
