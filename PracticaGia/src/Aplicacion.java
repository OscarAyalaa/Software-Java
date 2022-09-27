/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Oscar
 */
public class Aplicacion {
    public static void main(String[] args){
        Circulo c = new Circulo(0, 0);
    System.out.println("Area del circulo: "+c.area1(5.5));
    Rectangulo r = new Rectangulo(0, 0);
    System.out.println("Area del rectangulo: "+r.area1(5.5,2.0));
    }
}
