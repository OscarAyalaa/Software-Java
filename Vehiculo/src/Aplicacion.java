/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Oscar
 */
public class Aplicacion {
    public static void main(String arg[]){
        Autobus bus1 = new Autobus();
        bus1.setPatente("AX1313");
        bus1.setMarca("Mercedes");
        bus1.setAsientos(40);
        Camion cam1 = new Camion();
        cam1.setPatente("BX1515");
        cam1.setMarca("Iveco");
        cam1.setCarga(200);
        CamionCompartimientos cam2 = new CamionCompartimientos();
        cam2.setPatente("CX1818");
        cam2.setMarca("Ford");
        cam2.setCarga(2500);
        cam2.setCompartimientos(5);
        System.out.println(cam2.CargaCompartimientos());
        System.out.println(cam2.Descripcion());
    };
}
