/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taylor_003;

import java.util.Scanner;
import java.lang.Math;
import java.math.BigDecimal;

public class Taylor_003 {

    public static long Factorial(int numero)
    {
        long factorial;
        factorial=1;
        if(numero==0)
            return 1;
        else
        {
            while(numero>1)
            {
                factorial=factorial*numero;
                numero--;
            }
            return factorial;
        }
    }
    
    public static void Suma()
    {
        double posicion = 0, numerador=0, acumulador = 0, puntoEvaluar;
        int k;
        
        System.out.println("Indique la cantidad de terminos(N) que desea: ");
        Scanner sct = new Scanner(System.in);
        k=sct.nextInt();
        System.out.println("Que punto se evaluara en la funcion: ");
        puntoEvaluar = sct.nextInt();
        
        System.out.println("La serie es: \nposicion |       valor"); 
        while(k>0)
        {
            k--;
            switch(k%2)
            {
                case 0:
                    numerador =  1;
                    break;
                case 1:
                    numerador = -1;
            }
            numerador /= Factorial((2*k + 1));
            posicion = numerador*Math.pow(puntoEvaluar,(2*k + 1));
            acumulador += posicion;
            System.out.println("   " + (k+1) + "        " + posicion + " ");
        }
        System.out.println("aproximacion: " + acumulador);
    }
    
    public static void Menu()
    {
        int opc;
        Scanner menu = new Scanner(System.in);
        
        do
        {
            Suma();  
            System.out.println("Volver a correr: \n1.-si\n2.-no");
            opc = menu.nextInt();
            System.out.println("se escribio: " + opc);
        }while(opc == 1);
    }
    
    
    public static void main(String[] args) {
       Menu();  
    }  
}
