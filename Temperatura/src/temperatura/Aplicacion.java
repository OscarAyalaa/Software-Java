/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatura;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @author Oscar
 */
public class Aplicacion {

    public static void main(String[] args) throws IOException {
        char opcion;
       BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
       Kelvin k = new Kelvin();
       Farenheig f = new Farenheig();
       opcion=' ';
       while (opcion != '3') {
           System.out.println("Menu (X__X)");
           System.out.println();
           System.out.println("1.-De C a K");
           System.out.println("2.-De C a F");
           System.out.println("3.-Salir");
           System.out.println("Opcion (1-3)");
           opcion = in.readLine().charAt(0);
switch(opcion){
    case ('1'):
        k.ObtenK();
        break;
    case ('2'):
        f.obtenF();
        break;
    case ('3'):
        System.out.println("Esta saliendo del programa");
        break;
    default:
        JOptionPane.showMessageDialog(null,"Elijio una opcion no \nvalida","Error de opcion",JOptionPane.WARNING_MESSAGE);
}
    }
    
}
}
