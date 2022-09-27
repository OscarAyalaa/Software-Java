/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Oscar
 */
public abstract class Figura {
    protected int x;
    protected int y;
    //se crea un constructor para las variables x e y , estas caracteristicas son comunes entre las figuras.
    public Figura(int x, int y){
        this.x=x;
        this.y=y;
    }
    //Se esta creando un metodo abstracto el cual se definira dependiendo de que figura se tenga que sacar el area
    //debido a que cada figura se saca el area de una manera diferente.
    public abstract double area();
}
