/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuanimal;

import javax.swing.JOptionPane;

/**
 *
 * @author Oscar
 */
public class MenuPerro {
     public void MenuPerro(){
        String nombre = JOptionPane.showInputDialog(null,"Introduce el nombre del Perro:\n");
        String raza = JOptionPane.showInputDialog(null,"Introduce la raza del Perro:\n");
        String color = JOptionPane.showInputDialog(null,"Introduce el color del Perro:\n");
        String edad = JOptionPane.showInputDialog(null,"Introduce la edad del Perro:\n");
        String dueño = JOptionPane.showInputDialog(null, "Introduce el nombre del dueño:\n");
        int ed = Integer.parseInt(edad);
        JOptionPane.showMessageDialog(null,"El Nombre del Perro es:\n"+nombre+"\nSu raza es:\n"+raza+"\nEs de color:\n"+color+"\nSu edad es:\n"+edad+"\nel dueño es:\n"+dueño);   
}
    
}
