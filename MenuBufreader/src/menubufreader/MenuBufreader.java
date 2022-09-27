/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menubufreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @author Oscar
 */
public class MenuBufreader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
       int opcion; 
       int numero1;
       int numero2;
       int suma; 
         
         BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
         System.out.println("Menu\n\n Que opcion deasea realizar:\n\n1.-Suma int\n2.-Suma short\n3.-Suma long\n4.-Suma byte\n5.-Suma Float\n6.-suma Double\nsu seleccion es:");
         System.out.flush();
        String op = br.readLine();
         opcion=Integer.parseInt(op);
         
         switch (opcion){
             case 1:
       System.out.println("Escriba el primer Numero");
       System.out.flush();
       String primerNumero = br.readLine();
       System.out.println("Escriba el segundo Numero");
       System.out.flush();
       String segundoNumero = br.readLine();
       numero1 = Integer.parseInt(primerNumero);
       numero2 = Integer.parseInt(segundoNumero);
       suma = numero1 + numero2;
       System.out.println("La suma es:\n"+ suma);
                 break;
             case 2:
       System.out.println("Escriba el primer Numero");
       System.out.flush();
       String primerNumeroshort = br.readLine();
       System.out.println("Escriba el segundo Numero");
       System.out.flush();
       String segundoNumeroshort = br.readLine();
      short s1 = Short.parseShort(primerNumeroshort);
      short s2 = Short.parseShort(segundoNumeroshort);
       suma = s1 + s2;
       System.out.println("La suma es:\n"+ suma);
                 break;
             case 3:
       System.out.println("Escriba el primer Numero");
       System.out.flush();
       String primerNumerolong = br.readLine();
       System.out.println("Escriba el segundo Numero");
       System.out.flush();
       String segundoNumerolong = br.readLine();
       long l1 = Long.parseLong(primerNumerolong);
       long l2 = Long.parseLong(segundoNumerolong);
       long l3 = l1 + l2;
       System.out.println("La suma es:\n"+ l3);
                 break;
             case 4:
      System.out.println("Escriba el primer Numero");
       System.out.flush();
       String primerNumerobyte = br.readLine();
       System.out.println("Escriba el segundo Numero");
       System.out.flush();
       String segundoNumerobyte = br.readLine();
       byte b1 = Byte.parseByte(primerNumerobyte);
       byte b2 = Byte.parseByte(segundoNumerobyte);
       suma = b1 + b2;
       System.out.println("La suma es:\n"+ suma);
                 break;
             case 5:
      System.out.println("Escriba el primer Numero");
       System.out.flush();
       String primerNumerofloat = br.readLine();
       System.out.println("Escriba el segundo Numero");
       System.out.flush();
       String segundoNumerofloat = br.readLine();
       float f1 = Float.parseFloat(primerNumerofloat);
       float f2 = Float.parseFloat(segundoNumerofloat);
       float f3 = f1 + f2;
       System.out.println("La suma es:\n"+ f3);
                 break;
             case 6:
      System.out.println("Escriba el primer Numero");
       System.out.flush();
       String primerNumerodouble = br.readLine();
       System.out.println("Escriba el segundo Numero");
       System.out.flush();
       String segundoNumerodouble = br.readLine();
       double d1 = Double.parseDouble(primerNumerodouble);
       double d2 = Double.parseDouble(segundoNumerodouble);
       double d3 = d1 + d2;
       System.out.println("La suma es:\n"+ d3);
                break;
             default:
                 System.out.println("Elijio una opcion no \nvalida");
                 }
           
    }
    
}
