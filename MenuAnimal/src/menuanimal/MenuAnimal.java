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
public class MenuAnimal {
public static void main(String[]args){
     String nombre = JOptionPane.showInputDialog(null,"Introduce el nombre del Gato:\n");
        String raza = JOptionPane.showInputDialog(null,"Introduce la raza del Gato:\n");
        String color = JOptionPane.showInputDialog(null,"Introduce el color del Gato:\n");
        String edad = JOptionPane.showInputDialog(null,"Introduce la edad del Gato:\n");
        String dueño = JOptionPane.showInputDialog(null, "Introduce el nombre del dueño:\n");
       String especie = JOptionPane.showInputDialog(null, "Introduce el nombre del dueño:\n");
        int ed = Integer.parseInt(edad);
    Animal a1 = new Animal(nombre,ed,raza,color,dueño,especie);
    System.out.println("nombre"+a1.nombre+"raza"+a1.raza+"color"+a1.color+"edad"+a1.edad+"dueño"+a1.dueño+"Especie"+Animal.especie);
     int opcion,resp; String op;
     op=JOptionPane.showInputDialog("Menu\n\n Que opcion deseas realizar:\n1.-Perro\n2.-Gato");
      opcion=Integer.parseInt(op);
      switch (opcion){
          case 1:
              MenuPerro Ap =new MenuPerro();
        Ap.MenuPerro();
              break;
          case 2:
              MenuGato Ag =new MenuGato();
        Ag.MenuGato();
              break;
              default:
                 JOptionPane.showMessageDialog(null,"Elijio una opcion no \nvalida","Error de opcion",JOptionPane.WARNING_MESSAGE);
                 }
      }
}



    

