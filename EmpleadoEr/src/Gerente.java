/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Oscar
 */
public class Gerente  extends Empleado{
    protected String departamento;
    public String getDetalles(){
        return "Nombre: "+nombre+"\n"+"Salario: "+salario+"\n"+"Gerente de: "+departamento;
    }
}
