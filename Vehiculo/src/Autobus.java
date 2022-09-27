/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Oscar
 */
public class Autobus extends Vehiculo {
    public int asientos;
    public void setAsientos(int a){
        asientos = a;
    }
    public int getAsientos(){
        return asientos;
    }
    public String queMarca(){
        return getMarca();
    }
}
