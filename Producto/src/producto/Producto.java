/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package producto;

import java.util.Scanner;
import java.lang.Math;

public class Producto {
    
    public static double Tolerancia()
    {
        double tolerancia;
        int cifrasSig;
        Scanner sct = new Scanner(System.in);
        System.out.println("\nIngrese la cantidad de cifras significativas: ");
        cifrasSig = sct.nextInt();
        tolerancia = 0.5*Math.pow(10,2-cifrasSig);
        return tolerancia;
    }
    
    public static double OpProducto(int j)
    {
        double sumatoria = 0;
        //int numerador=0, denominador=0;
        //numerador += Math.pow(2*j,2);
        //denominador += (((2*j)-1)*((2*j)+1));
        //denominador += ((4*Math.pow(j,2))-1);
        sumatoria += Math.pow(2*j,2)/((4*Math.pow(j,2))-1);
        return sumatoria;
    }
    
    public static double Error(double x1, double x2)//anterior, actual
    {
        double error, valorAnterior=x1, valorActual=x2;
        
        error=Math.abs(((valorActual-valorAnterior)/valorActual)*100);
        return error;
    }
    
   public static double Aproximacion(boolean TipoError)
   {
       int j = 1;
       double error = 0, sumatoria=0,valorActual = 0, valorAnterior = 0, tolerancia, pi = 0, piAux=0;
       double producto=1;
       tolerancia=Tolerancia();
       valorActual = Math.PI;
       
       do{
           
            if(TipoError == true)
            {
                sumatoria =0;
                sumatoria += Math.pow(2*j,2)/((4*Math.pow(j,2))-1);
                j++;
                producto *=sumatoria;
                error=Math.abs(Error(valorAnterior, producto));
                valorAnterior=producto;
           }
           else
           {
                sumatoria =0;
                sumatoria += Math.pow(2*j,2)/((4*Math.pow(j,2))-1);
                j++;
                producto *=sumatoria;
                pi=2*producto;
                
                error=Math.abs(Error(producto, Math.PI));
           }
       }while(error>= tolerancia);
       if(TipoError == true)
        {
            pi=2*(producto);
        }
        System.out.println("\n__________________________________________________");
        System.out.println("\nCantidad de iteraciones: " + j + "\nValor de pi: " + pi + "\nError: " + error);
        System.out.println("__________________________________________________");
        return valorActual;
   }
    
    public static void Menu()
    {
        int opcion, v;
        Boolean TipoError = null;
        
        Scanner obj = new Scanner(System.in);
        do{
            do{
                 System.out.println("  (X______x)  MENU      ");
                 System.out.println("1.-Error Relativo");
                 System.out.println("2.-Error Real\n");
                 System.out.println("Selecciona el tipo de error 1 ó 2 : ");
                 opcion = obj.nextInt();
                 switch(opcion)
                 {
                     case 1:
                           TipoError = true;
                           break;
                     case 2:
                           TipoError = false;
                            break;
                     default:
                            System.out.println("La opcion no es valida\n");
                 }
            }while(opcion<1 || opcion >2);
        Aproximacion(TipoError);
        System.out.println("\nQuiere regresar al menu: \n1.-Si \n2.-NO");
        v = obj.nextInt();
        }while(v == 1);
        System.out.println("\nSaliendo del programa");
    }
    
    public static void main(String[] args) {
        Menu();
    }  
}
