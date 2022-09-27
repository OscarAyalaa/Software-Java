/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Oscar
 */
// Se esta haciendo uso de la erencia por parte de la clase Figura
class Rectangulo extends Figura {
    protected double ancho,alto;
    //se esta  mandando a llamar el constructor y para ello
    //se emplea la palabra super, ademas de que estamos sobrecargando el constructor con mas variables
    //pertenecientes a la clase Rectangulo
    public Rectangulo(int x, int y, double ancho, double alto ){
        super(x,y);
    this.ancho=ancho;
    this.alto=alto;
    }
    //En esta parte ya se esta definiendo el metodo area cosa que no se habia hecho en la clase abstracta 
    //el area se define dependiendo de la forma en la que se saca el aerea de dicha figura
    public double area(){
        return ancho*alto;
    }
}
