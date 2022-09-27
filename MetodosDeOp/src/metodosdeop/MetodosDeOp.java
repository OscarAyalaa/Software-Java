/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosdeop;

import javax.swing.JOptionPane;

/**
 *
 * @author Oscar
 */
public class MetodosDeOp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String op;
        int opr,resp;
        SumaMetodo x = new SumaMetodo();
        String numero1,numero2;
        int c; int num1,num2; int base,exp;
        do{
        op=JOptionPane.showInputDialog("MENU (X__X) \n\n Que operacion desea realizar:\n\n1.-Suma\n2.-Resta\n3.-Multipicacion\n4.-Divicion\n5.-Potencia\n6.-Factorial");
        opr = Integer.parseInt(op);
        switch(opr)
        {
            case 1:
              numero1 =JOptionPane.showInputDialog("Ingresa el primer numero:");
               num1 =Integer.parseInt(numero1);
              numero2 = JOptionPane.showInputDialog("Ingresa el segundo numero:");
               num2 =Integer.parseInt(numero2);
              c = x.suma(num1,num2);
              JOptionPane.showMessageDialog(null,"El resultado es: "+c);
                break;
            case 2:
                numero1 =JOptionPane.showInputDialog("Ingresa el primer numero:");
              num1 =Integer.parseInt(numero1);
              numero2 = JOptionPane.showInputDialog("Ingresa el segundo numero:");
               num2 =Integer.parseInt(numero2);
              c = x.resta(num1,num2);
              JOptionPane.showMessageDialog(null,"El resultado es: "+c);
                break;
            case 3:
                numero1 =JOptionPane.showInputDialog("Ingresa el primer numero:");
              num1 =Integer.parseInt(numero1);
              numero2 = JOptionPane.showInputDialog("Ingresa el segundo numero:");
               num2 =Integer.parseInt(numero2);
              c = x.multiplicacion(num1,num2);
              JOptionPane.showMessageDialog(null,"El resultado es: "+c);
                break;
            case 4:
               numero1 =JOptionPane.showInputDialog("Ingresa el primer numero:");
              num1 =Integer.parseInt(numero1);
              numero2 = JOptionPane.showInputDialog("Ingresa el segundo numero:");
               num2 =Integer.parseInt(numero2);
              c = x.divicion(num1,num2);
              JOptionPane.showMessageDialog(null,"El resultado es: "+c); 
                break;
            case 5:
                numero1 =JOptionPane.showInputDialog("Ingresa la base:");
              base =Integer.parseInt(numero1);
              numero2 = JOptionPane.showInputDialog("Ingresa el exponencial:");
               exp =Integer.parseInt(numero2);
              c = x.potencia(base,exp);
              JOptionPane.showMessageDialog(null,"El resultado es: "+c); 
            case 6:
                numero1 =JOptionPane.showInputDialog("Ingrese un numero para el factorial:");
              num1 =Integer.parseInt(numero1);
              c = x.factorial(num1);
              JOptionPane.showMessageDialog(null,"El resultado es: "+c);
            default:
                JOptionPane.showMessageDialog(null,"Elijio una opcion no nvalida","Error de opcion",JOptionPane.WARNING_MESSAGE);
        }
        String resp1=JOptionPane.showInputDialog("Siquiere regresar al programa\n precione 1 de lo contrario precione 2 ");
        resp = Integer.parseInt(resp1);
        }while(resp==1);
    }
    
}
