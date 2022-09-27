/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frigorifico;

/**
 *
 * @author Oscar
 */
public class SiFrigorifico {
    private int NumSerie,edad;
        private char sexo; 
	private String sexoo;
	private double peso;
	
	
	public void setNumSerie(int NumSerie){
		this.NumSerie=NumSerie;
	}
	public int getNumSerie(){
		return NumSerie;
	}
	public void setEdad(int edad){
		this.edad=edad;
	}
	public int getEdad(){
		return edad;
	}
	public void setSexo(char sexo){
		this.sexo=sexo;
	}
	public char getSexo(){
		return sexo;
	}
	public void setPeso(double peso){
		this.peso=peso;
	}
	public double getPeso(){
		return peso;
	}
}
