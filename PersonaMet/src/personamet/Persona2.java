/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personamet;

/**
 *
 * @author Oscar
 */
public class Persona2 {
     private int cedula;
    private String nombre;
    private double sueldo;
    public void setCedula(int cedula){
        this.cedula = cedula;
    }
    public int getCedula(){
        return cedula;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
       return nombre;
    }
    public void setSueldo(double sueldo){
        this.sueldo=sueldo;
    }
    public double getSueldo(){
        return sueldo;
    }
}


