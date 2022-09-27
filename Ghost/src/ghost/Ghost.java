/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ghost;

import javax.swing.JOptionPane;

/**
 *
 * @author Oscar
 */
public class Ghost {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String op,resp;
        int opcion,respu;
        Sighosth obj = new Sighosth();
        do{
       op=JOptionPane.showInputDialog("Banco Ghost(X__X)\n        Menu\n1.-Saldo\n2.-Deposito\n3.-Consulta de saldo\n4.-Salir ");
    opcion=Integer.parseInt(op);
    switch(opcion){
        case 1:
             String s=JOptionPane.showInputDialog("Introduzca el saldo");
             int saldo =Integer.parseInt(s);
             obj.setSaldo(saldo);
        break;
        case 2:
           
            break;
        case 3:
         JOptionPane.showMessageDialog(null,"Tu Saldo es de");
            break;
        case 4:
            JOptionPane.showMessageDialog(null,"Esta salinedo del programa");
            break;
            default:
                JOptionPane.showMessageDialog(null,"Elijio una opcion no \nvalida","Error de opcion",JOptionPane.WARNING_MESSAGE);
                
    }
    resp=JOptionPane.showInputDialog("Si quieres regresar al programa pon 1  y 2 para no");
    respu = Integer.parseInt(resp);
    }while(respu==1);
    }
    
}
