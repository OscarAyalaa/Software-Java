
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Oscar
 */
public class Empleado {
    protected String nombre;
    protected double salario;
    protected Date Fechanac;
    public String getDetallles(){
        return "Nombre:"+nombre+"\n"+"Salario"+salario;
    }
}
