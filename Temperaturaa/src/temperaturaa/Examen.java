/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperaturaa;

/**
 *
 * @author Oscar
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Examen {
	public static void main(String[] args) throws Exception, IOException{
		BufferedReader br =new BufferedReader (new InputStreamReader(System.in));
		int t=0, opc=0;
		char con;
		con='s';
		do
		{
System.out.println("Menu (X__X)\n 1.°C a °F\n2.°C a K\n3. K a °C  ");
	    opc= Integer.parseInt( br.readLine());
	    	switch(opc){
		case 1:
			System.out.println("Ingrese la temperatura en Celsius");
			t= Integer.parseInt( br.readLine());
			Pro fah=new Pro();
System.out.println("El resultado es " + " " + fah.Fahrenheit(t)+" Grados Fahrenheit");
			break;
		case 2:
			System.out.println("Ingrese la temperatura en Celsius");
			t= Integer.parseInt( br.readLine());
			if (t>=-273){
				Pro kel=new Pro();
System.out.println("El resultado es " + " " + kel.Kelvin(t)+" Grados Kelvin");
			 }
			 else{
				 try
			     {
					 IlegalException e = new IlegalException("Temperatura fuera de rango");
				     throw e;
			        }
			        catch(Exception excepcion)
			        {
				         excepcion.printStackTrace();
			        }
				 throw new Exception();
			 }		
			break;
		case 3:
			System.out.println("Ingrese la temperatura en Kelvin");
			t= Integer.parseInt( br.readLine());
			if (t>=0){
				Pro cel=new Pro();
System.out.println("El resultado es " + " " + cel.Celcius(t)+" Grados Celcius");
			 }
			 else{
				 try
			     {
					 IlegalException e = new IlegalException("Temperatura fuera de rango");
				     throw e;
			        }
			        catch(Exception excepcion)
			        {
				         excepcion.printStackTrace();
			        }
				 throw new Exception();
			 }		
			break;
	    	}
		System.out.println("\n\nQuiere continuar?\nS/N\n");
		con = br.readLine(). charAt (0);
	}
 	while((con=='s') || (con=='S'));
}
}
