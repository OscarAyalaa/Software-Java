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
public class MenuGato {
    public void MenuGato(){
        String nombre = JOptionPane.showInputDialog(null,"Introduce el nombre del Gato:\n");
        String raza = JOptionPane.showInputDialog(null,"Introduce la raza del Gato:\n");
        String color = JOptionPane.showInputDialog(null,"Introduce el color del Gato:\n");
        String edad = JOptionPane.showInputDialog(null,"Introduce la edad del Gato:\n");
        String dueño = JOptionPane.showInputDialog(null, "Introduce el nombre del dueño:\n");
        int ed = Integer.parseInt(edad);
        JOptionPane.showMessageDialog(null,"El Nombre del Gato es:\n"+nombre+"\nSu raza es:\n"+raza+"\nEs de color:\n"+color+"\nSu edad es:\n"+edad+"\nel dueño es:\n"+dueño);   
}
}


