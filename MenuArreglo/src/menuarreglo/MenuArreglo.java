/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuarreglo;

import javax.swing.JOptionPane;

/**
 *
 * @author Oscar
 */
public class MenuArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    int numeros[]=new int[11]; int respu; String resp;
    int opcion; String op;
    int cont=0;
    do{
    op=JOptionPane.showInputDialog("Menu\n\n Que deseseas realizar:\n1.-LLenar el arreglo\n2.-Busqueda de un elemento\n3.-Eliminar un elemento del arreglo\n4.-Imprimir el arreglo\n5.-Salir");
    opcion=Integer.parseInt(op);
    switch(opcion){
        case 1:
             for(int x=1; x<=10; x++)
    {
       String num=JOptionPane.showInputDialog("Introduce un numero en la posicion:"+x);
        numeros[x] = Integer.parseInt(num);
    }
             JOptionPane.showMessageDialog(null,"Los datos han sido agregados correctamente");
        break;
        case 2:
            String bus=JOptionPane.showInputDialog("Que numero quieres buscar para saber cuantas veces se repite");
            int num_busc = Integer.parseInt(bus);
            for (int x=0; x<=10; x++)
            {
                if(numeros[x]==num_busc)
        {
            cont++;
        }
            }
         JOptionPane.showMessageDialog(null,"El numeero se repite: "+cont);
            break;
        case 3:
         for (int x=0; x<=10; x++)
         {
            System.out.println(""+numeros[x]); 
         }
             String elim=JOptionPane.showInputDialog("Que posicion quieres eliminar");
             int elmi = Integer.parseInt(elim);
            numeros[elmi]=0;
            break;
        case 4:
            JOptionPane.showMessageDialog(null,"Los datos son los siguientes:");
            System.out.println("Los datos imprimidos son:\n");
            for (int x=0; x<=10; x++)
         {
            System.out.println(""+ numeros[x]); 
         }
            
        break;
        case 5:
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