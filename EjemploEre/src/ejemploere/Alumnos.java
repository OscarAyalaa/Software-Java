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
public class Alumnos extends Persona {
    private String rolUCV;
    public Alumnos(){
        rolUCV = "000000-0";
    }
    public void setRolUCV(String r){
        rolUCV= r;
    }
    public String getRolUCV(){
        return rolUCV;
    }
    public String quienSoy(){
        return getRut() + getNombre() + rolUCV;
    }
}
