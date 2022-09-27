/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Oscar
 */
class Rectangulo extends Figura{
    protected double ancho, alto;
    public Rectangulo(int x, int y){
        super(x,y);
    }
    public double area1(double ancho, double alto){
        return ancho*alto;
    }
}
