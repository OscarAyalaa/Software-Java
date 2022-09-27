/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuenta;

/**
 *
 * @author Oscar
 */
public class Cuentaa {
   private String Nombre;
   private int Numero;
   private double Saldo;
   public Cuentaa(){
       Nombre ="";
       Numero=0;
       Saldo=0.0d;
   }
   public Cuentaa(int Numero,String Nombre,double Saldo){
       this.Nombre=Nombre;
       this.Numero=Numero;
       this.Saldo=Saldo;
   }
   public String obtenNombre(){
    return Nombre;
}
   public int obtenNumero(){
       return Numero;
   }
   public  double obtenSaldo(){
       return Saldo;
   }
   public void cambiaNombre(String Nombre){
       this.Nombre=Nombre;
   }
   public void cambiaNumero(int Numero){
       this.Numero=Numero;
   }
   public void cambiaSaldo(double Saldo){
       this.Saldo=Saldo;
   }
   public void Deposita(double cantidad){
       cambiaSaldo(obtenSaldo()+cantidad);
   }
   public boolean retira(double cantidad){
       if (cantidad<=obtenSaldo()){
           cambiaSaldo(obtenSaldo()-cantidad);
           return true;
       }
       else{
           try{  Exception e = new Exception("Saldo insuficiente");
			         throw e;}  
                catch(Exception e){          
 System.out.println("Saldo insuficiente para realizar el retiro");}
       }
       return false;
   }
}
