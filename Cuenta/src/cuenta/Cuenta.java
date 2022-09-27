/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuenta;

/**
 *
 * @author Oscar
 */import java.io.*;
public class Cuenta {

    private static Cuentaa arreglo[];
    public static void pide_arreglo() throws IOException{
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n;
    String Nombre;
    int Numero;
    double Saldo;
    System.out.println("Cuantos objetos quieres creear?");
    n=Integer.parseInt(in.readLine());
    arreglo = new Cuentaa[n];
    for(int i=0; i<n; i++){
        System.out.println("Pon el numero de cuenta"+(i+1)+":");
        Numero=Integer.parseInt(in.readLine());
        System.out.println("Pon el nombre de la cuenta"+(i+1)+":");
        Nombre=in.readLine();
        System.out.println("Pon el saldo de la cuenta"+(i+1)+":");
        Saldo=Double.parseDouble(in.readLine());
        arreglo [i] = new Cuentaa(Numero, Nombre, Saldo);
    }
    }
    public static void despliega_arreglo(){
        System.out.println("Numero Nombre Saldo");
        for(Cuentaa objeto : arreglo){
            System.out.println(""+objeto.obtenNumero()+""+objeto.obtenNombre()+""+objeto.obtenSaldo());
        }
    }
    public static double suma(){
        double total=0.0d;
        for(int i=0; i<arreglo.length; i++){
            Cuentaa objeto= arreglo[i];
            total +=objeto.obtenSaldo();
        }
        return total;
    }
    public static double promedio(){
        double total=0.0d;
        for(int i=0; i<arreglo.length; i++){
            Cuentaa objeto =arreglo[i];
        }
        return total/arreglo.length;
    }
    public static void main(String[] args)throws IOException {
       char opcion;
       BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
       arreglo = null;
       opcion=' ';
       while (opcion != '5') {
           System.out.println("Menu de Cuentas");
           System.out.println();
           System.out.println("1. Pedir datos para crear Cuentas");
           System.out.println("2.-Desplegar todas las cuentas");
           System.out.println("3.-Desplegar suma de los saldos");
           System.out.println("4.-Desplegar promedio de los saldos");
           System.out.println("5.-fin");
           System.out.println("Opcion deseada(1-5)");
           opcion = in.readLine().charAt(0);
       switch (opcion) {
           case ('1'):
               System.out.println("Pidiendo datos arreglo Cuentas");
               pide_arreglo();
               System.out.println("Numero de cuentas creadas "+arreglo.length);
               break;
           case ('2'):
               System.out.println("Desplegando arreglo de cuentas");
               despliega_arreglo();
               break;
           case ('3'):
               System.out.println("Suma de los saldos="+suma());
               break;
           case ('4'):
               System.out.println("Promedio de los saldos"+promedio());
               break;
           case ('5'):
               System.out.println("Essta saliendo del programa");
               break;
           default:
               System.out.println("La opcion debe de ser de (1-5)");
               break;
       };
       }
    }
    
}
