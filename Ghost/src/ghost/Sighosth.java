/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ghost;

import javax.swing.JOptionPane;

/**
 *
 * @author Oscar
 */
public class Sighosth {
    private int intereses;
    private double saldo;
    int deposito;
    int retiros;
    public void setSaldo(double saldo){
        this.saldo=saldo;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setIntereses(int intereses){
        this.intereses=intereses;
    }
    public int getIntereses(){
        return intereses;
    }
    public double Depositos(double deposito){
        deposito = getSaldo()+deposito;
        setSaldo(deposito);
        return deposito;
    }
    public double Retiros(double retiro){
        retiro=getSaldo();
        if(getSaldo()>retiro){
            retiro=getSaldo()-retiro;
            setSaldo(retiro);
            JOptionPane.showMessageDialog(null,"Se realizo correctamente");
            return retiro;
        }else{
            JOptionPane.showMessageDialog(null,"Su saldo es insuficiente");
        }
        return retiro;
    }
}
