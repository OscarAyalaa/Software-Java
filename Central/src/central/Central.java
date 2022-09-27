/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package central;

import javax.swing.JOptionPane;

/**
 *
 * @author Oscar
 */
public class Central {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String op,resp;
      int opcion,respu;
      do{
          SiCentral obj = new SiCentral();
      op=JOptionPane.showInputDialog("Menu\n\n 1.- LLamadas locales\n 2.- LLamadas nacionales");
      opcion = Integer.parseInt(op);
      switch(opcion){
          case 1:
            obj.locales();      
              break;
          case 2:
              
              break;
          default:
              JOptionPane.showMessageDialog(null,"Elijio una opcion no \nvalida","Error de opcion",JOptionPane.WARNING_MESSAGE);           
      }
       resp=JOptionPane.showInputDialog("Si quieres regresar al programa pon 1  y 2 para no");
    respu = Integer.parseInt(resp);
    }while(respu==1);
    }  
    
}
