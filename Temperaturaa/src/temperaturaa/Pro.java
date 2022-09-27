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
public class Pro {
	public double Kelvin (int t){
		double resultado=0.0;
		resultado= t+273;
		return resultado;
	}
		public double Fahrenheit (int t){
			double resultado=0.0;
			resultado=((9/5)*t)+32;
			return resultado;
	}
		public double Celcius(int t){
			double resultado=0.0;
			resultado= t-273;
			return resultado;
		}
}

