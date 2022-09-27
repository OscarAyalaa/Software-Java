package alumnos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Oscar
 */
public class Aalumnos {
    public static void main(String[]args)throws IOException{
       BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Alumno 1:\n");
        System.out.println("introduzca el nombre:\n");
        System.out.flush();
        String nombre = br.readLine();
        Alumnos Al1 = new Alumnos(nombre);
        
        
        System.out.println("Alumno 2:\n");
        System.out.println("Introduzca el nombre:\n");
        System.out.flush();
        String nombre2 = br.readLine();
        System.out.println("Introduzca la edad:\n");
        System.out.flush();
        String edad = br.readLine();
        int edad2 = Integer.parseInt(edad);
        Alumnos Al2 =new Alumnos(nombre2,edad2);
        
        
        System.out.println("Alumno 3:\n");
        System.out.println("Introduzca el nombre:\n");
        System.out.flush();
        String nombre3 = br.readLine();
        System.out.println("Introduzca la edad:\n");
        System.out.flush();
        String edad3 = br.readLine();
        int edad33 = Integer.parseInt(edad3);
        System.out.println("Introduzca la carrera:\n");
        System.out.flush();
        String Carrera3 = br.readLine();
        Alumnos Al3 =new Alumnos(nombre3,edad33,Carrera3);
       
        
        System.out.println("Alumno 4:\n");
        System.out.println("Introduzca el nombre:\n");
        System.out.flush();
        String nombre4 = br.readLine();
        System.out.println("Introduzca la edad:\n");
        System.out.flush();
        String edad4 = br.readLine();
        int edad44 = Integer.parseInt(edad4);
        System.out.println("Introduzca la carrera:\n");
        System.out.flush();
        String Carrera4 = br.readLine();
        System.out.println("Introduzca el No.Control");
        System.out.flush();
        String NoControl =br.readLine();
        int NoControl4 = Integer.parseInt(NoControl);
        Alumnos Al4 =new Alumnos(nombre4,edad44,Carrera4,NoControl4);
        
        
        
         System.out.println("Alumno 1: Su Nombre es:"+Al1.nombre);
         System.out.println("Alumno 2: Su Nombre es:"+Al2.nombre+"  La edad es:"+Al2.edad);
         System.out.println("Alumno 3: Su Nombre es:"+Al3.nombre+"  La edad es:"+Al3.edad+"  La carrera es:"+Al3.carrera);
         System.out.println("Alumno 4: Su Nombre es:"+Al4.nombre+"  La edad es:"+Al4.edad+"  La carrera es:"+Al4.carrera+"  el Numero de control es:"+Al4.NoControl);
    }
}
