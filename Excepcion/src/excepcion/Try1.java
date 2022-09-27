/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcion;

/**
 *
 * @author Oscar
 */
public class Try1 {
    public static void main(String[]args){
        int []array = new int[20];
        // el error que va amarcar el programa es en la parte de abajo, el error es por que en el array se esta poniendo una
        //posicion que el arreglo no tiene, la forma de solucionarlo es ponerle un valor en los parametros que se han 
        //declarado en el array
        array[-3]=24;
    }
}
