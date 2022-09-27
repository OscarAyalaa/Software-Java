/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenvideoclub;

/**
 *
 * @author Oscar
 */
public class Pelicula {
    private String titulo,genero,creador;
    private double PrecioRenta;
    private boolean status;
    public Pelicula(String titulo,String genero,String creador, double PrecioRenta, boolean status ){
        this.titulo=titulo;
        this.genero=genero;
        this.creador=creador;
        this.PrecioRenta=PrecioRenta;
        this.status=status;
    }
    public Pelicula(String titulo,String creador){
        this.titulo=titulo;
        this.creador=creador;
    }
    public Pelicula(String titulo,String genero,String creador,double PrecioRenta){
        this.titulo=titulo;
        this.genero=genero;
        this.creador=creador;
        this.PrecioRenta=PrecioRenta;
    }
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public String getTitulo(){
        return titulo;
    }
    public void setGenero(String genero){
        this.genero=genero;
    }
    public String getGenero(){
        return genero;
    }
    public void setCreador(String creador){
        this.creador=creador;
    }
    public String getCreador(){
        return creador;
    }
    public void setPrecioRenta(double PrecioRenta){
        this.PrecioRenta=PrecioRenta;
    }
    public double PrecioRenta(){
        return PrecioRenta;
    }
    public void setStatus(boolean status){
        this.status=status;
    }
    public boolean getStatus(){
        return status;
    }
    public boolean entregar(){
        return status;
    }
    public boolean devolver(){
        return status;
    }
    public boolean isEntragado(){
        return status;
    }
}
