/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ortogonalizacion;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ortogonalizacion {

      public static double Producto(double[] poly1, double[] poly2,int orden)
    {
        boolean control = true;
        int n=orden;
        double producto = 0;
        
        for(int i=0; i<n; i++)
        {
            producto += poly1[i]*poly2[i];
        }
        return producto;
    }
    
    public static double Comprobar(double[][] matriz,int n)
    {
        double producto =0;
        int marcadorIzq = 0, marcadorDer = 0, cont = 0;
        double poly1[] = new double [n];
        double poly2[] = new double [n];
        
        for(int i=0; i<n; i++)
        {
                if(i<n-1)
                {
                    for(int j=0; j<n; j++)
                    {
                            poly1[j] = matriz[j][cont];
                            poly2[j] = matriz[j][i+1];
                    }/*
                    System.out.println("\n\nimpresion del polinomio 1");
                    printVector(poly1,n);
                    System.out.println("\nimpresion del polinomio 2");
                    printVector(poly2,n);*/
                    if(Producto(poly1, poly2, n) > 10E-10)
                    {
                        System.out.println("la matriz no es ortogonal en:\nvector a: ");
                        printVector(poly1,n);
                        System.out.println("vector b:");
                        printVector(poly2,n);
                    }
                }
                else
                {
                    i = cont;
                    cont++;
                }
        }
        
        return producto;
    }
    
    public static void printVector(double [] poly, int n)
    {
        for(int i=0; i<n; i++)
        {
            System.out.println("[i]= " + poly[i]);
        }
    }
    
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
        double matrizOrtogonal[][] = new double [orden][orden];
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
        matrizOrtogonal=Ortogonalizar(matriz,orden);
        System.out.println("\n\nmatriz orotgonalizada:");
        printMatriz(matrizOrtogonal,orden);
        Comprobar(matrizOrtogonal,orden);
    }
    
    public static double[][] Ortogonalizar(double[][] poly, int n)
    {
        double[][] matriz = new double[n][n];
        double productoNumerador = 0,  productoDenominador= 0;
        double[] poly1 = new double[n];
        double[] poly2 = new double[n];
        int cont = 0;
        
        for(int i=0; i<n; i++)
        {
            matriz[i][0] += poly[i][0];//v1
        }
        cont=1;
        while(cont<n)
        {
            System.out.println("____________________________________");
            for(int i=1; i<=cont; i++)
            {
                for(int j=0; j<n; j++)
                {
                    poly1[j] = matriz[j][i-1];//v1
                    poly2[j] = poly[j][cont];
                }
                System.out.println("\nvector v"+ i + ":");
                printVector(poly1,n);
                System.out.println("vector u" + (cont) + ":");
                printVector(poly2,n);
                productoNumerador = Producto(poly1,poly2,n);
                productoDenominador = Producto(poly1,poly1,n);
                System.out.println("\nnumerador: " + productoNumerador);
                System.out.println("denominador: " + productoDenominador + "\n termino" + i + ": ");
                for(int j=0; j<n; j++)
                {
                    matriz[j][cont] += -productoNumerador*matriz[j][i-1]/productoDenominador; 
                    System.out.println(matriz[j][cont]);
                }
            }
            for(int i=0; i<n; i++)
            {
                matriz[i][cont] += poly[i][cont];
            }
            System.out.println("____________________________________");
            cont++;
        }
        return matriz;
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
    

