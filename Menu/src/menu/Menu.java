/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import javax.swing.JOptionPane;

/**
 *
 * @author Oscar
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int opcion; String op;
         int resp;
        String primerNumero;
        String segundoNumero;
        int numero1;
        int numero2;
        int suma; 
         do{
         op=JOptionPane.showInputDialog("Menu\n\n Que opcion deasea realizar:\n\n1.-Suma int\n2.-Suma short\n3.-Suma long\n4.-Suma byte\n5.-Suma Float\n6.-suma Double");
         opcion=Integer.parseInt(op);
         switch (opcion){
             case 1:
        primerNumero = JOptionPane.showInputDialog("Escriba el primer Numero");
       segundoNumero = JOptionPane.showInputDialog("Escriba el segundo Numero");
       numero1 = Integer.parseInt(primerNumero);
       numero2 = Integer.parseInt(segundoNumero);
       suma = numero1 + numero2;
       JOptionPane.showMessageDialog(null,"La suma es:\n"+ suma, "Resultados",JOptionPane.PLAIN_MESSAGE);
                 break;
             case 2:
       primerNumero = JOptionPane.showInputDialog("Escriba el primer Numero");
       segundoNumero = JOptionPane.showInputDialog("Escriba el segundo Numero");
      short s1 = Short.parseShort(primerNumero);
      short s2 = Short.parseShort(segundoNumero);
       suma = s1 + s2;
       JOptionPane.showMessageDialog(null,"La suma es:\n"+ suma, "Resultados",JOptionPane.PLAIN_MESSAGE);
                 break;
             case 3:
       primerNumero = JOptionPane.showInputDialog("Escriba el primer Numero");
       segundoNumero = JOptionPane.showInputDialog("Escriba el segundo Numeero");
       long l1 = Long.parseLong(primerNumero);
       long l2 = Long.parseLong(segundoNumero);
       long l3 = l1 + l2;
       JOptionPane.showMessageDialog(null,"La suma es:\n"+ l3, "Resultados",JOptionPane.PLAIN_MESSAGE);
                 break;
             case 4:
       primerNumero = JOptionPane.showInputDialog("Escriba el primer Numero");
       segundoNumero = JOptionPane.showInputDialog("Escriba el segundo Numero");
       byte b1 = Byte.parseByte(primerNumero);
       byte b2 = Byte.parseByte(segundoNumero);
       suma = b1 + b2;
       JOptionPane.showMessageDialog(null,"La suma es:\n"+ suma, "Resultados",JOptionPane.PLAIN_MESSAGE);
                 break;
             case 5:
       primerNumero = JOptionPane.showInputDialog("Escriba el primer Numero");
       segundoNumero = JOptionPane.showInputDialog("Escriba el segundo Numero");
       float f1 = Float.parseFloat(primerNumero);
       float f2 = Float.parseFloat(segundoNumero);
       float f3 = f1 + f2;
       JOptionPane.showMessageDialog(null,"La suma es:\n"+ f3, "Resultados",JOptionPane.PLAIN_MESSAGE);
                 break;
             case 6:
       primerNumero = JOptionPane.showInputDialog("Escriba el primer Numero");
       segundoNumero = JOptionPane.showInputDialog("Escriba el segundo Numero");
       double d1 = Double.parseDouble(primerNumero);
       double d2 = Double.parseDouble(segundoNumero);
       double d3 = d1 + d2;
       JOptionPane.showMessageDialog(null,"La suma es:\n"+ d3, "Resultados",JOptionPane.PLAIN_MESSAGE);
                 break;
             default:
                 JOptionPane.showMessageDialog(null,"Elijio una opcion no \nvalida","Error de opcion",JOptionPane.WARNING_MESSAGE);
                 }
           String respu=JOptionPane.showInputDialog("Si quiere regresar al programa\n precione 1 de lo contrario precione 2");
           resp=Integer.parseInt(respu);
         }while(resp==1);
    }
    
}
