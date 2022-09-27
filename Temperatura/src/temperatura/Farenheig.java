/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatura;

import java.util.Scanner;

/**
 *
 * @author Oscar
 */
public class Farenheig extends Centigrados {
    static Scanner lector = new Scanner (System.in);
    public double obtenF(){
        System.out.println("Introduce ºC");
        temperatura = lector.nextDouble();
        double farenheit=temperatura*2-temperatura/5;
        farenheit=farenheit+32;
        System.out.println(temperatura+" ºC equivale a "+farenheit+" farenheit");
        return 0;
    }
}
