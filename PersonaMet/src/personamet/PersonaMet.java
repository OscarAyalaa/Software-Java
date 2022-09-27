/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personamet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Oscar
 */
public class PersonaMet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
       int ced,suel;
      String nom;
      double sue;
      Persona2 obj= new Persona2();
      BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Escribe el nombre");
      System.out.flush();
        String nombre= br.readLine();
        obj.setNombre(nombre);
        System.out.println("Indique el sueldo");
      System.out.flush();
        String sueldo= br.readLine();
        suel = Integer.parseInt(sueldo);
        obj.setSueldo(suel);
        System.out.println("Indique la cedula de la persona");
      System.out.flush();
        String cedula= br.readLine();
        ced = Integer.parseInt(cedula);
        obj.setCedula(ced);
        System.out.println("El nombre es: "+nombre+"\nEl sueldo es de:"+suel+"\nLa cedula es:"+ced);
    }
    
}
