/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Pruebas {

   /* public static double Producto(double[] poly1, double[] poly2,int orden)
    {
        boolean control = true;
        int n=orden;
        double producto = 0;
        
        for(int i=0; i<n; i++)
        {
            producto += poly1[i]*poly2[i];
        }
        return producto;
    }*/
    
    public static void printMatriz(double[][] poly, int n)
    {
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print("[" + poly[i][j] + "] ");
            }
            System.out.println();
        }
    }
    
    public static void Matriz()
    {
        int orden = 0;
        double entrada = 0;
        Scanner e = new Scanner(System.in);
    
        System.out.println("Ingrese el orden de la matriz cuadrada: ");
        orden = e.nextInt();
        double matriz[][] = new double[orden][orden];
        double matrizI[][] = new double [orden][orden];
        System.out.println("Ingrese las siguinetes posiciones: ");
        for(int i=0; i<orden; i++)//renglon
        {
            for(int j=0; j<orden; j++)//columna
            {
                System.out.println("posicion [" + i + "][" + j + "]: ");
                entrada = e.nextDouble();
                matriz[i][j] = entrada;
            }
        }
        System.out.println("\n\nmatriz Ingresada:");
        printMatriz(matriz,orden);
        //Comprobar(matriz, orden);
         LinealmenteI(matriz,orden);
       // System.out.println("\n\nmatriz orotgonalizada:");
       // printMatriz(matrizI,orden);
       
    }
    
    public static void LinealmenteI(double[][] poly, int n)
    {
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(poly[0][0]!=1)
                {
                    poly[j][0]=poly[j][0]*1/poly[0][0];
                }
              System.out.print("[" + poly[i][j] + "] ");
            }   
        }
            
    }
    
    public static void Menu()
    {
        int opc = 0;
        
        Scanner e = new Scanner(System.in);
        do
        {
            System.out.println("Este programa determina a partir de 2 vectores \nsi estos son ortogonales"
            + "bajo el producto interno\n");
            Matriz();
            System.out.println("\nCorrer de nuevo el programa: \n1.-SI\n2.-NO");
            opc = e.nextInt();
        }while(opc == 1);
        System.out.print("Fin");
    }
    public static void main(String[] args) {
        Menu();
    }
    
}
