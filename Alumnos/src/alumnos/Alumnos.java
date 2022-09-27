/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnos;

/**
 *
 * @author Oscar
 */
public class Alumnos {
    String nombre;
    int NoControl;
    int edad;
    String carrera;
    public Alumnos(String nombre){
        this.nombre=nombre;
    }
    public Alumnos(String nombre,int edad){
        this.nombre=nombre;
        this.edad=edad;
    }
    public Alumnos(String nombre,int edad,String carrera){
        this.nombre=nombre;
        this.edad=edad;
        this.carrera=carrera;
    }
    public Alumnos(String nombre,int edad,String carrera,int NoControl){
        this.nombre=nombre;
        this.edad=edad;
        this.carrera=carrera;
        this.NoControl=NoControl;
    }
    }
    

