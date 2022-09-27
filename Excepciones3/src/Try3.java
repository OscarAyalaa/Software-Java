/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Oscar
 */
public class Try3 {
             public static void main(String arg[])
	         {
		         int [] array = new int[20];
		         try
		         {
         //			array[-3] = 24;	
			         int b = 0;
			         int a = 23/b;
		         }
		         catch(ArrayIndexOutOfBoundsException excepcion)
		         {
			         System.out.println(" Error de índice en un array");
		         }
                         //el error que esta causando es que hay un error aritmetico en el programa en el cual se esta dividiendo 
                         //en cero y esto es indefinido
                         //el error ahora no esta en la posicion del arry por que en este caso lo esta declarando entre co entarios
                         //y el programa no lo toma en cuenta
		         catch(ArithmeticException excepcion)
		         {
			         System.out.println(" Error de índice en un array ");
		         }

	         }
         }

