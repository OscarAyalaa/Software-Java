/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglomultiplo;

import javax.swing.JOptionPane;

/**
 *
 * @author Oscar
 */
public class ArregloMultiplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int arreglo[]= new int[21]; int cont=0; int acum=0;
     for(int x=1; x<=20; x++)
    {
       String num=JOptionPane.showInputDialog("Introduce un numero en la posicion:"+x);
        arreglo[x] = Integer.parseInt(num);
    }
     JOptionPane.showMessageDialog(null,"Los datos han sido ingresados correctamente\n y apareceran en la consola");
     System.out.println("Los datos son:\n");
     for(int x=1; x<=20; x++)
    {
       System.out.println(""+arreglo[x]);
    }
    
     for(int x=1; x<=20; x++)
    {
      double r =arreglo[x]%6;
      if(r==0)
      {
          cont++;
          acum=acum+arreglo[x];
      }
    }
     int s=acum/cont;
     JOptionPane.showMessageDialog(null,"El promedio del multiplo de 6 en el arreglo es: "+s);
    }
    
}
