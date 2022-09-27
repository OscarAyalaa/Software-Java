/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

import javax.swing.JOptionPane;

/**
 *
 * @author Oscar
 */
public class APersona {
    public static void main(String[]args){
        String nombre = JOptionPane.showInputDialog(null,"Introduce el nombre");
        String edad = JOptionPane.showInputDialog(null,"Introduce la edad");
        int ed = Integer.parseInt(edad);
        Persona p1 = new Persona(nombre, ed);
        JOptionPane.showMessageDialog(null,"Sunombre es:\n"+p1.nombre+"\nSu edad es:\n"+p1.edad);     
    }
    
}
