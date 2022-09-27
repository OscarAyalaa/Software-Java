/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosdeop;

/**
 *
 * @author Oscar
 */
public class SumaMetodo {
    
  public static int suma(int num1,int num2){
      int r;
      r = num1+num2;
      return r;
      
  }  
  public static int resta(int num1,int num2){
      int r;
      r = num1 -num2;
      return r;
  }
 public static int multiplicacion(int num1,int num2){
     int r;
      r = num1 *num2;
      return r;
  }
  public static int divicion(int num1,int num2){
      int r;
      r = num1 /num2;
      return r;
  }
  public static int potencia(int base,int exp){
      int x=1;
      int acum=1;
      while(x<=exp){
          acum=acum*base;
          x++;
      }
      return acum;
  }
  public static int factorial(int num1){
      int cont =0; int s; int acum;
        s=num1;
	acum=num1;
	num1=num1-1;
	do
	{
		acum=acum*num1;
		num1=num1-1;
		cont++;
	}while(cont<s-1);
        return acum;
  }
    
}

