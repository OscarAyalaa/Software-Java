/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuarreglos;

import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author Oscar
 */
public class MenuArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
    int numeros[]=new int[10]; int respu; String resp;
    int opcion; String op;
    int cont=0;
    do{
    op=JOptionPane.showInputDialog("Menu\n\n Que deseseas realizar:\n1.-LLenar el arreglo\n2.-Busqueda de un elemento\n3.-Eliminar un elemento del arreglo\n4.-Imprimir el arreglo\n5.-Salir");
    opcion=Integer.parseInt(op);
    switch(opcion){
        case 1:
             for(int x=1; x<=numeros.length; x++)
    {
        System.out.println("Introduce un numero en la posicion:"+x);
        System.out.flush();
        String num = br.readLine();
        numeros[x] = Integer.parseInt(num);
    }
        break;
        case 2:
            System.out.println("Que numero quieres buscar ");
    System.out.flush();
    String num_bus = br.readLine();
    int num_busc = Integer.parseInt(num_bus);
    for (int x=1; x<=numeros.length; x++)
    {
        if(numeros[x]==num_busc)
        {
            cont++;
        }
    }
    System.out.println("El numeero se repite: "+cont);
            break;
        case 3:
         for (int x=1; x<=numeros.length; x++)
         {
            System.out.println(""+ numeros[x]); 
         }
             System.out.println("Que posicion quieres eliminar eliminar");
             System.out.flush();
             String elim=br.readLine();
             int elmi = Integer.parseInt(elim);
            numeros[elmi]=0;
            break;
        case 4:
            System.out.println("Los datos son los siguientes:\n");
            for (int x=1; x<=numeros.length; x++)
         {
            System.out.println(""+ numeros[x]); 
         }
            
        break;
        case 5:
            System.out.println("Esta salinedo del programa");
            break;
            default:
                JOptionPane.showMessageDialog(null,"Elijio una opcion no \nvalida","Error de opcion",JOptionPane.WARNING_MESSAGE);
    }
    System.out.println("Si quieres regresar al programa pon 1 y 2 para no");
    System.out.flush();
    resp=br.readLine();
    respu = Integer.parseInt(resp);
    }while(respu==1);
}
    
}
