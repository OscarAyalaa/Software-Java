/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Oscar
 */
public class SII {
    public  void Promedio(double p) throws Exception{
		if(p<70){
			try
		     {
				PromedioException e = new PromedioException("Promedio menor a 70, el alumno no puede continuar en la institucion");
			     throw e;
		        }
		        catch(Exception excepcion)
		        {
			         excepcion.printStackTrace();
		        }
			 throw new Exception();
		 }		
		}
	
	public  void Especial(int es) throws Exception{
		if(es>6){
			try
		     {
			 EspecialException e = new EspecialException("El numero de especiales supero el maximo de 6"
			 + ", el alumno no puede continuar en la institucion");
			     throw e;
		        }
		        catch(Exception excepcion)
		        {
			         excepcion.printStackTrace();
		        }
			 throw new Exception();
		}
		}
	
	public  void Semestre(int s) throws Exception{
		if(s>12){
			try
		     {
			 SemestreException e = new SemestreException("Supera el limite de 12 semestres, "
		     + "el alumno no puede continuar en la institucion");
			     throw e;
		        }
		        catch(Exception excepcion)
		        {
			         excepcion.printStackTrace();
		        }
			 throw new Exception();
			 
		 }		
		}
	
	public void Creditos(int c, int s) throws Exception{
		if(c != 5){
			if(s >6){
				try{
					CreditosException e =new CreditosException("El alumno no acompleta todos los creditos necesarios antes del 6 semestre,"
							+ " el alumno no puede continuar en la institucion");
					throw e;
				}
				catch(Exception excepcion)
				{
					excepcion.printStackTrace();
				}
				throw new Exception();
			}
		}
		
	}
	
	public void Servicio(int s, String serv) throws Exception{
		if(serv!= "s" || serv!="S"){
			if(s>9){
				try{
					ServicioException e = new ServicioException("El alumno no a cumplido con su servicio social antes del "
							+"noveno semestre el alumno no puede continuar en la institucion"); 
					throw e;
				}
				catch(Exception excepcion){
					excepcion.printStackTrace();
				}
				throw new Exception();
			
		}
		}
			
	}
	
	public void Practicas(String serv, int s, String prac) throws Exception{
		if( prac != "s" || prac != "S"){
			if(s>=12){
				try{
					PracticasException e = new PracticasException("El alumno no ha realisado sus practicas profecionales en el tiempo establecido"
							+" el alumno no puede continuar en la institucion");
					throw e;
				}
				catch(Exception excepcion){
					excepcion.printStackTrace();
				}
				throw new Exception();
			}
		}
		
		
		
		
	}


}
