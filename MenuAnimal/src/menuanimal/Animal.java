/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuanimal;

/**
 *
 * @author Oscar
 */
public class Animal {
    String nombre;
    String raza;
    String color;
    int edad;
    String dueño;
    static String especie;
    public Animal(String nombre,int edad,String raza,String color,String dueño,String especie){
        this.nombre=nombre;
        this.raza=raza;
        this.color=color;
        this.dueño=dueño;
        this.edad=edad;
        this.especie=especie;
}
}