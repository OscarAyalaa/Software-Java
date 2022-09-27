/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Oscar
 */
public class Try2 {
    public static void main(String arg[])
	         {
		         int [] array = new int[20];
		         try
		         {
			         array[-3] = 24;	
		         }
                         //remarca el error en el catchya que  esta mencionando que marca error
                         //en la posicion del array y que lo ignore y corra el mensaje puesto en caso de dar el error.
		         catch(ArrayIndexOutOfBoundsException excepcion)
		         {
			         System.out.println(" Error de índice en un array");
		         }
	         }
}
