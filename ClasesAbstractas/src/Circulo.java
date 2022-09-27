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
 class Circulo extends Figura {
     protected double radio;
     //se esta  mandando a llamar el constructor y para ello
    //se emplea la palabra super, ademas de que estamos sobrecargando el constructor con mas variables
    //pertenecientes a la clase Circulo
    public Circulo(int x,int y,double radio){
        super(x,y);
        this.radio=radio;
    }
    //En esta parte ya se esta definiendo el metodo area cosa que no se habia hecho en la clase abstracta 
    //el area se define dependiendo de la forma en la que se saca el aerea de dicha figura
    public double area(){
        return Math.PI*radio*radio;
    }
}
