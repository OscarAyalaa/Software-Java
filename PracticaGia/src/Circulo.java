/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Oscar
 */
class Circulo extends Figura {
    protected double radio;
    public Circulo(int x,int y){
    super(x,y);
}
    public double area1(double radio){
        return Math.PI*radio*radio;
    }
    
}
