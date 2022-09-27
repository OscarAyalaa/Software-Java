/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatura;

import java.util.Scanner;

/**
 *
 * @author Oscar
 */
public class Kelvin extends Centigrados {
     Scanner sc = new Scanner(System.in);
    
    public  double ObtenK(){
        System.out.print("Introduce temperatura en ºC: ");
            temperatura = sc.nextDouble();
            if(temperatura>=-273){
            System.out.println("Grados Kelvin ..: " + (temperatura+273)); 
            }
            else{
                try{  Exception e = new Exception("Fuera de rango");
			         throw e;}  
                catch(Exception e){          
 System.out.println("Fuera de rango");}
            }
        return 0;
    }
    
}

