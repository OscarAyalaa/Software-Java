/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

import javax.swing.JOptionPane;

/**
 *
 * @author Oscar
 */
public class Gato {
 public void Gato(){
        String nombre = JOptionPane.showInputDialog(null,"Introduce el nombre del Gato:\n");
        String raza = JOptionPane.showInputDialog(null,"Introduce la raza del Gato:\n");
        String color = JOptionPane.showInputDialog(null,"Introduce el color del Gato:\n");
        String edad = JOptionPane.showInputDialog(null,"Introduce la edad del Gato:\n");
        String dueño = JOptionPane.showInputDialog(null, "Introduce el nombre del dueño:\n");
        int ed = Integer.parseInt(edad);
        Animal Ag = new Animal(nombre,ed,raza,color,dueño);
        JOptionPane.showMessageDialog(null,"El Nombre del Gato es:\n"+Ag.nombre+"\nSu raza es:\n"+Ag.raza+"\nEs de color:\n"+Ag.color+"\nSu edad es:\n"+Ag.edad+"\nel dueño es:\n"+Ag.dueño);   
}
}
