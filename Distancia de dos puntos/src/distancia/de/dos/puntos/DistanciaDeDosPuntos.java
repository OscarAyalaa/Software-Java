/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distancia.de.dos.puntos;

/**
 *
 * @author Oscar
 */import javax.swing.JOptionPane;
import java.lang.Math; 

public class DistanciaDeDosPuntos {
    
    public static void main(String[] args) {
        double x,y,r,re;
    String num = JOptionPane.showInputDialog(null,"Introduce la distancia del primer punto A:\n");
    int x1 = Integer.parseInt(num);
    String num2 = JOptionPane.showInputDialog(null,"Introduce la distancia del segundo punto A:\n");
    int y1 = Integer.parseInt(num2);
    String num3 = JOptionPane.showInputDialog(null,"Introduce la distancia del primer punto b:\n");
    int x2 = Integer.parseInt(num3);
    String num4 = JOptionPane.showInputDialog(null,"Introduce la distancia del segundo punto b:\n");
    int y2 = Integer.parseInt(num4);
    Punto d = new Punto(x1,x2,y1,y2);
    x = Math.pow((x1-x2),2);
    y = Math.pow((y2-y1),2);
    r= x+y;
    re=Math.sqrt(r);
    JOptionPane.showMessageDialog(null,"La distancia es:\n"+re);
    }
}

