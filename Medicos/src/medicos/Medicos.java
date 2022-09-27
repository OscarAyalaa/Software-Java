/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicos;

/**
 *
 * @author Oscar
 */
public class Medicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     System.out.println("Crear un cirujano");
       Cirujano c=new Cirujano();     
       c.TrabajaEnElHospital=true;
       c.hacerIncision();
       c.TratarPaciente();
       System.out.println(""+c.TrabajaEnElHospital);
       System.out.println("Crear un Medico de cabecera");
       MedicoDeCabecera me=new MedicoDeCabecera();
       me.TrabajaEnElHospital=false;
       me.VisitaLasCasas=true;
       
    }
    
}
