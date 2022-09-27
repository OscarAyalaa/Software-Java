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
public class VideoClub {
    private int ContadorPelicula=0;
    private int AcumularPelicula=0;
    private int ContadorSerie=0;
    private int AcumularSerie=0;
    public void RegistrarPelicula(Pelicula param){
        System.out.println(param);
       ContadorPelicula++;
       AcumularPelicula+=param.PrecioRenta();
    }
    public void RegistrarSerie(Serie param){
        System.out.println(param);
        ContadorSerie++;
         AcumularSerie += param.getPrecioRenta();
    }
}
