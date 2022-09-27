/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package permutaciones;

import java.util.Scanner;

/**
 *
 * @author Oscar
 */
public class Permutaciones {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
       String c; 
       Scanner cadena = new Scanner(System.in);
       System.out.println("Introduzca una cadena ejemplo 'abcd' : ");
       c = cadena.nextLine();
        String str = c;
        StringBuffer strBuf = new StringBuffer(str);
        doPerm(strBuf,str.length());
    }

    private static void doPerm(StringBuffer str, int index){

        if(index <= 0)
            System.out.println(str);            
        else {
            doPerm(str, index-1);
            int currPos = str.length()-index;
            for (int i = currPos+1; i < str.length(); i++) {
                swap(str,currPos, i);
                doPerm(str, index-1);
                swap(str,i, currPos);
            }
        }
    }

    private  static void swap(StringBuffer str, int pos1, int pos2){
        char t1 = str.charAt(pos1);
        str.setCharAt(pos1, str.charAt(pos2));
        str.setCharAt(pos2, t1);
    }
}   