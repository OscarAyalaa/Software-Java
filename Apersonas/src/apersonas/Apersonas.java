/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apersonas;

/**
 *
 * @author Oscar
 */
public class Apersonas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona lasPersonas[] = new Persona[10];
        Persona pers1 = new Persona("Luis");
        lasPersonas[4]= pers1;
        lasPersonas[4].setNombre("luis");
        System.out.println(lasPersonas[4].getNombre());
    }
    
}
