/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Oscar
 */
class SuperHeroes {
   private  String nombre;
   private String identidad;
   private  String poderes;
   private String DesTraje;
   private String raza;
   private String armas;
   public void setNombre(String nombre){
       this.nombre=nombre;
   }
    public String getNombre(){
        return nombre;
   
    }
    public void SetIdentidad(String identidad){
        this.identidad=identidad;
    }
    public String getIdentidad(){
        return identidad;
    }
    public void setPoderes(String poderes){
        this.poderes=poderes;
    }
    public String getPoderes(){
        return poderes;
        
    }
    public void setTraje(String traje){
        this.DesTraje=traje;
    }
    public String getTraje(){
        return DesTraje;
    }
    public void setRaza(String raza){
        this.raza=raza;
    }
    public String getRaza(){
        return raza;
    }
    public void setArmas(String armas){
        this.armas=armas;
    }
    public String getArmas(){
        return armas;
    }
    
}


