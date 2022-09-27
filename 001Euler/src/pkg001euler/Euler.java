
package pkg001euler;

import java.util.Scanner;
import java.lang.Math;

public class Euler {

    public static double Tolerancia()
    {
        double tolerancia;
        int cifrasSig;
        Scanner sct = new Scanner(System.in);
        System.out.println("\nIngrese la cantidad de cifras significativas: ");
        cifrasSig = sct.nextInt();
        tolerancia = 0.5*Math.pow(10,2-cifrasSig);
        //System.out.println("\ntolerancia en funcion: " + tolerancia);
        return tolerancia;
    }
    
    public static double Error(double x1, double x2)//(anterior,actual)
    {
        double error, valorAnterior=x1, valorActual=x2;
        
        error=Math.abs(((valorActual-valorAnterior)/valorActual)*100);
        return error;
    }
    
    public static double SumaEuler(int j)
    {
        double sumatoria = 0;
        
        sumatoria += 1/Math.pow(j,2);
        return sumatoria;
    }
    
    public static double Raiz(double suma)
    {
        double raiz;
        
        raiz=Math.sqrt(6*suma);
        return raiz;
    }
    
    public static double Aproximacion(Boolean tipoError)
    {
        int j = 1;
        double error = 0, valorActual = 0, valorAnterior = 0, tolerancia, pi = 0, piAux=0;
        
        tolerancia=Tolerancia();
        valorActual=Math.PI;
        do
        {
            if(tipoError == true)//se requiere el error porcentual
            {
                valorActual=SumaEuler(j);
                error = Error(valorAnterior,valorActual);
                valorAnterior=valorActual;
                pi += valorActual;
            }
            else//se utiliza el valor guardado de pi
            {
                piAux +=SumaEuler(j);//Se encarga de mantener el acumulado de las sumatorias
                pi =Raiz(piAux);//solo hace raiz
                error = Error(pi,valorActual);
            }
            j++;
        }while(error>=tolerancia);
        
        if(tipoError == true)
        {
            pi=Raiz(pi);
        }
        System.out.println("\n__________________________________________________");
        System.out.println("\nCantidad de iteraciones: " + j + "\nValor de pi: " + pi + "\nError: " + error);
        System.out.println("__________________________________________________");
        return valorActual;
    }
    
    public static void Menu()
    {
        int opcionTipoError, nuevaVuelta;
        Boolean tipoError = null;
        Scanner menu = new Scanner(System.in);
        do{
            do{
                System.out.println("\n\nTipo de ERROR a emplear. \n1.- Error Relativo.\n2.- Error Real.\nSeleccionar: ");
                opcionTipoError = menu.nextInt();
                switch(opcionTipoError)
                {
                    case 1:
                        tipoError = true;//error porcentual
                        break;
                    case 2:
                        tipoError = false;//error real
                        break;
                    default:
                        System.out.println("Valor no reconocido. ");
                }
            }while(opcionTipoError<1 || opcionTipoError>2);
            Aproximacion(tipoError);
            System.out.println("\nQuiere probar otra vez: \n1.-Si\n2.-No");
            nuevaVuelta=menu.nextInt();
        }while(nuevaVuelta==1);
        System.out.println("Fin del programa.");
    }
    
    public static void main(String[] args) {
        Menu();
    }
}
