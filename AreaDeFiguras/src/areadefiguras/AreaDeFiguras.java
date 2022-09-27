/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areadefiguras;

import javax.swing.JOptionPane;

/**
 *
 * @author Oscar
 */
public class AreaDeFiguras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int opcion,respu,c; String op,resp;
       do{
       OperacionAreas M =new OperacionAreas();
       M.menu();
    resp=JOptionPane.showInputDialog("Si quieres regresar al programa pon 1  y 2 para no");
    respu = Integer.parseInt(resp);
    }while(respu==1);
    }
    
}
