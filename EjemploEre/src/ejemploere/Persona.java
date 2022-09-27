/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploere;

/**
 *
 * @author Oscar
 */
public class Persona {
    private String rut;
    private String nombre;
    public Persona(){
        rut = "00000000-0";
        nombre="";
    }
    public void setRut(String r){
        rut = r;
    }
    public String getRut(){
        return rut;
    }
    public void setNombre(String n){
        nombre = n;}
    public String getNombre(){
        return nombre;
    }
}
