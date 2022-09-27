/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author Oscar
 */import javax.swing.JOptionPane;
public class Perro {
    public static void main(String[]args){
        String nombre = JOptionPane.showInputDialog(null,"Introduce el nombre del Perro:\n");
        String raza = JOptionPane.showInputDialog(null,"Introduce la raza del Perro:\n");
        String color = JOptionPane.showInputDialog(null,"Introduce el color del Perro:\n");
        String edad = JOptionPane.showInputDialog(null,"Introduce la edad del Perro:\n");
        String dueño = JOptionPane.showInputDialog(null, "Introduce el nombre del dueño:\n");
        int ed = Integer.parseInt(edad);
        Animal Ap = new Animal(nombre,ed,raza,color,dueño);
        JOptionPane.showMessageDialog(null,"El Nombre del perro es:\n"+Ap.nombre+"\nSu raza es:\n"+Ap.raza+"\nEs de color:\n"+Ap.color+"\nSu edad es:\n"+Ap.edad+"\nel dueño es:\n"+Ap.dueño);
        Gato Ag =new Gato();
        Ag.Gato();
    }
    
}
