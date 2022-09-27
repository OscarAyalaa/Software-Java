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
public class Serie {
    private String titulo,genero,creador;
    private int NumTemporadas=3;
    private boolean status,prestado,entregado;
    private double PrecioRenta;
    
    public Serie(String titulo,String genero,String creador,int NumTemporadas, boolean status, double PrecioRenta){
        this.NumTemporadas=NumTemporadas;
        this.PrecioRenta=PrecioRenta;
        this.creador=creador;
        this.genero=genero;
        this.status=status;
        this.titulo=titulo;
    }
    public Serie(String titulo, String creador){
        this.titulo=titulo;
        this.creador=creador;
    }
    public Serie(String titulo,String genero,String creador, double PrecioRenta ){
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
    public void setNumTemporada(int NumTemporadas){
        this.NumTemporadas=NumTemporadas;
    }
    public int getNumTemporada(){
        return NumTemporadas;
    }
    public void setStatus(boolean status){
        this.status=status;
    }
    public boolean getStatus(){
        return status;
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
    public double getPrecioRenta(){
        return PrecioRenta;
    }
    public boolean entregar(){
       return status;
    }
    public boolean devolver(){
        return status;
    }
    public boolean isEntregado(){
        return status;
    }
}
