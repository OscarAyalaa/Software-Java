/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

/**
 *
 * @author Oscar
 */import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
    BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
    int arreglo[]=new int[5];
    int cont=0;  
    for(int x=0; x<=4; x++)
    {
        System.out.println("Introduce un numero:\n");
        System.out.flush();
        String num = br.readLine();
        arreglo[x] = Integer.parseInt(num);
    }
    System.out.println("Que numero quieres buscar para ver cuanto se repite: ");
    System.out.flush();
    String num_bus = br.readLine();
    int num_busc = Integer.parseInt(num_bus);
    for (int x=0; x<=4; x++)
    {
        if(arreglo[x]==num_busc)
        {
            cont++;
        }
    }
    System.out.println("El numeero se repite: "+cont);
    }
    
}
