/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areadefiguras;

/**
 *
 * @author Oscar
 */import java.lang.Math;
import javax.swing.JOptionPane;
public class OperacionAreas {
    public int area(int base, int altura){
        int r;
                r=base*altura;
                return r;
    }
    public double area(double base1,double altura){
        double r;
               r=(base1*altura)/2;
               return r;
    }
    public double area(double radio){
        double r;
        r = 3.1416*Math.pow(radio,2);
        return r;
    }
    public double area(int perimetro,double apotema){
        double r;
        r=(perimetro*apotema)/2;
        return r;
    }
    public double area(int lado){
        double r;
        r=lado*lado;
        return r;
    }
   
    public void menu(){
        int opcion,c; String op,a,b;
        double d,w;
        int base,altura;
        op=JOptionPane.showInputDialog("Menu\n\n Que Area desea realizar:\n1.-Rectangulo\n2.-Cuadrado\n3.-Triangulo\n4.-Circulo\n5.-Hexagono\n6.-Salir");
        opcion=Integer.parseInt(op);
        OperacionAreas x = new OperacionAreas();
    switch(opcion){
        case 1:
            b=JOptionPane.showInputDialog("Introduzca la base del rectangulo:\n");
            base=Integer.parseInt(b);
            a=JOptionPane.showInputDialog("Introduzca la altura del rectangulo:\n");
            altura=Integer.parseInt(a);
            c = x.area(base, altura);
            JOptionPane.showMessageDialog(null,"El resultado es: "+c);
            break;
        case 2:
             String l=JOptionPane.showInputDialog("Introduzca cuanto bale el lado del cuadrado:\n");
            int lado=Integer.parseInt(l);
             w= x.area(lado);
            JOptionPane.showMessageDialog(null,"El resultado es: "+w);
            break;
        case 3:
             b=JOptionPane.showInputDialog("Introduzca la base del Triangulo:\n");
            double base1=Double.parseDouble(b);
             a=JOptionPane.showInputDialog("Introduzca la altura del Triangulo:\n");
            double altura1=Double.parseDouble(a);
            d = x.area(base1,altura1);
            JOptionPane.showMessageDialog(null,"El resultado es: "+d);
            break;
        case 4:
             String ra=JOptionPane.showInputDialog("Introduzca cuanto bale el radio del circulo:\n");
            double radio=Double.parseDouble(ra);
             w= x.area(radio);
            JOptionPane.showMessageDialog(null,"El resultado es: "+w);
            break;
        case 5:
            String per=JOptionPane.showInputDialog("Introduzca el primetro del hexagono:\n");
            int perimetro=Integer.parseInt(per);
             String apo=JOptionPane.showInputDialog("Introduzca el apotema de Hexagono:\n");
            double apotema=Double.parseDouble(apo);
            d = x.area(perimetro,apotema);
            JOptionPane.showMessageDialog(null,"El resultado es: "+d);
            break;
        case 6:
            JOptionPane.showMessageDialog(null,"Esta saliendo del programa");
            break;
            default:
                JOptionPane.showMessageDialog(null,"Elijio una opcion no \nvalida","Error de opcion",JOptionPane.WARNING_MESSAGE);
               }
    }
    
}
