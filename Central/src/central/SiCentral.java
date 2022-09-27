/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package central;

/**
 *
 * @author Oscar
 */import javax.swing.JOptionPane;
public class SiCentral {
    private int codigo;
    private int zona;
    double tiempo;
    double CostolocalF=0.85;
    double CostolocalM=0.94;
    int x=1;
    public void setCodigo(int codigo){
        this.codigo= codigo;
    }
    public int getCodigo(){
        return codigo;
    }
    public void setZona(int zona){
        this.zona=zona;
    }
    public int getZona(){
        return zona;
    }
    public void locales(){
        String o,n,t; double acum=0; double costo;
        o=JOptionPane.showInputDialog("Seleccione con 1 y 2 si las llamadas fueron a Numero\n 1.-fijo\n2.-Movil");
        int opcion = Integer.parseInt(o);
        if (opcion==1){
            n=JOptionPane.showInputDialog("Cuantas llamadas a numero fijo fueron realizadas:");
            int num = Integer.parseInt(n);
            do{
                t=JOptionPane.showInputDialog("Cuanto tiempo tardo La llamada "+x);
                tiempo=Double.parseDouble(t);
                acum=acum+tiempo;
              x++;  
            }while(x<=num);
            costo = acum*CostolocalF;
            JOptionPane.showMessageDialog(null,"El costo total por las llamadas locales a numero fijo fue de:\n"+costo);
        }
    else{
        n=JOptionPane.showInputDialog("Cuantas llamadas a numero movil fueron realizadas:");
            int num = Integer.parseInt(n);
            do{
                t=JOptionPane.showInputDialog("Cuanto tiempo tardo La llamada "+x);
                tiempo=Double.parseDouble(t);
                acum=acum+tiempo;
              x++;  
            }while(x<=num);
            costo= acum* CostolocalM;
            JOptionPane.showMessageDialog(null,"El costo total por las llamadas locales a numero movil fue de:\n"+costo);
    }
}
}
