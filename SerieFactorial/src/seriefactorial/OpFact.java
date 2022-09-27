/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seriefactorial;

/**
 *
 * @author Oscar
 */
public class OpFact {
    public int factorial(int numeros){
        int cont=0; int s; int acum;
        int d=1;
        do{
        s=d;
	acum=d;
	numeros=d-1;
	do
	{
		acum=acum*d;
		d=d-1;
		cont++;
	}while(cont<s-1);
        d++;
        return acum; 
        }while(d<=numeros);
    }
}
