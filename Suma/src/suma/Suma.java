/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma;

/**
 *
 * @author Oscar
 */
import javax.swing.JOptionPane;
public class Suma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String primerNumero;
        String segundoNumero;
        int numero1;
        int numero2;
        int suma;
        primerNumero = JOptionPane.showInputDialog("Escriba el primer entero");
       segundoNumero = JOptionPane.showInputDialog("Escriba el segundo entero");
       numero1 = Integer.parseInt(primerNumero);
       numero2 = Integer.parseInt(segundoNumero);
       suma = numero1 + numero2;
       JOptionPane.showMessageDialog(null,"La suma es"+ suma, "Resultados",JOptionPane.PLAIN_MESSAGE);
       System.exit(0);
       
    }
    
}
