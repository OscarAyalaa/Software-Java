/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajedrez;

import java.util.Scanner;

/**
 *
 * @author Oscar
 */
public class CAjedrez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                int c=0;
                Scanner dato = new Scanner(System.in);
                System.out.println("\nIntroduzca el tamaño del tablero N*N para ver todas las soluciones");
                System.out.println("Cual es el valor de N:");
                c = dato.nextInt();
		final int  tablero = c;
		Camino Caballo = new Camino(tablero);
		Caballo.ResolverC();	
	}
}
