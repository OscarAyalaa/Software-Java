/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Oscar
 */
public class CamionCompartimientos extends Camion {
    public int compartimientos=1;
    public void setCompartimientos(int c){
        compartimientos = c;
    }
    public int getCompartimientos(){
    return compartimientos;
}
    public int CargaCompartimientos(){
        return carga/compartimientos;
    }
    public String Descripcion(){
        return getMarca() + compartimientos;
    }
}
