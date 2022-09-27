/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Oscar
 */
public class Try5 {
	         public static void main(String arg[])
	         {
		         try
		         {
                             //Se esta iseñando una excepcion en la cual nosotros estamos creando en que momento sslte un error.
			       Exception e = new Exception("Este es mi propio error.");
			         throw e;
		         }
		         catch(Exception excepcion)
		         {
			         excepcion.printStackTrace();
		         }
	         }
         }
  

