/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seriefactorial;

import javax.swing.JOptionPane;

/**
 *
 * @author Oscar
 */
public class SerieFactorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String numero;
        OpFact x = new OpFact();
     numero = JOptionPane.showInputDialog("Cuantos datos quieres:\n");
     int numeros = Integer.parseInt(numero);
     System.out.println("Los datos son:\n");
     
    }
    
}
