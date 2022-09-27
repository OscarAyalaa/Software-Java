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
    public static void main(String[]args){
        //Se esta creando un objeto  c de la clase Circulo  y se le estandando
        //los valores para esa figura y de esta manera pider sacar el area.
        Circulo c = new Circulo(0,0,5.5);
        System.out.println("Area del circulo: "+c.area());
        //Se esta creando un objeto  r de la clase Rectangulo  y se le estandando
        //los valores para esa figura y de esta manera pider sacar el area.
        Rectangulo r = new Rectangulo(0,0,5.5,2.0);
        System.out.println("Area del Rectangulo: "+r.area());
        // lo que sigue del codigo es solo una forma alternativa.
        //Se esta haciendo uso de una variable polimorfica que dice que puede contener
        //varios objetos de distintos tipos y tambien se le estan asignando los valorea a cada figura
        Figura f = new Circulo(0,0,5.5);
        System.out.println("Area del circulo: "+f.area());
        f = new Rectangulo(0,0,5.5,2.0);
        System.out.println("Area del rectangulo: "+f.area());
    }
    
}
