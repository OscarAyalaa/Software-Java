/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Oscar
 */
public class Try4 {
  public static void main(String arg[])  {
		         int [] array = new int[20];
		         try
		         {
         //			array[-3] = 24;
         /*			int b = 0;
			         int a = 23/b;
         */
                             // esta marcando error por que en la variable se esta declarando null y no apnta a nada
                             //y en el equals se le esta queriendo dar un valor y no se puede
			         String s = null;
			         s.equals("QQQQ");
		         }
		         catch(ArrayIndexOutOfBoundsException excepcion)  {
			         System.out.println(" Error de índice en un array");
		         }
		         catch(ArithmeticException excepcion)  {
			         System.out.println(" Error de índice en un array");
		         }
		         catch(Exception excepcion)  {
			         System.out.println("Se ha generado un error que no es   de índices, ni Aritmético");
			         System.out.println("El objeto error es de tipo " + excepcion);
		         }
	         }
         }
  

