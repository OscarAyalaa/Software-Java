/*                                                                                                                                                                          
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rfc;

/**
 *
 * @author Oscar
 */
public class Crfc {
    private String nombres;
    private String ap_paterno;
    private String ap_materno;
    private Cfecha fecha;
    private String homoclave;
    private String rfc;
    public Crfc(String nombres, String ap_paterno, String ap_materno, Cfecha fecha)
    {
        this.nombres=nombres;
        this.ap_paterno=ap_paterno;
        this.ap_materno=ap_materno;
        this.fecha=fecha;
    }
    
    private void paterno()                                        
    {         
        
        char c =0;                                           
        rfc=rfc+ap_paterno.trim().substring(0, 1);
       
        for (int i = 1; i <ap_paterno.length(); i++) 
        {
            char l = ap_paterno.charAt(i);      
            if(l == 'A' || l == 'a'|| l == 'E' || l == 'e' || l == 'I' || l == 'i' || l == 'O' || l == 'o' || l == 'U' || l == 'u')
            {
                c = l;
                break;
            }
        }
        rfc=rfc+c;
    }
    private void materno()
    {                                                     
        rfc= rfc.concat(ap_materno.trim().substring(0, 1));
    }
    private void nombres()
    {
        String[] noms=nombres.split(" ");
        if (noms.length>0)
                {
                    if((noms[0].equalsIgnoreCase("jose"))||(noms[0].equalsIgnoreCase("maria")) || (noms[0].equalsIgnoreCase("Lic.")) || (noms[0].equalsIgnoreCase("Gral.")))
                    {
                    
                      rfc=rfc+noms[1].charAt(0);
                    }
                      
            else                                                    
          rfc = rfc.concat(nombres.trim().substring(0, 1));
                }          
    }
    
        
    public String regresaRFC()
    {
       
        String year = String.valueOf(fecha.getAño());
        String m = String.valueOf(fecha.getMes());
        String d = String.valueOf(fecha.getDia());
        char c1=0;
        char c2=0;
        char c3=0;
        char c4 =0;
        
        if(fecha.getDia()< 10)
        {
           c1 ='0';
           c2 = d.charAt(0);
        }
        else{
            c1 = d.charAt(0);
            c2 = d.charAt(1);
        }
        
           if(fecha.getMes()< 10)
        {
           c3 ='0';
           c4= m.charAt(0);
        }
        else{
            c3 = m.charAt(0);
            c4 = m.charAt(1);
        }
                
        rfc="";
        paterno();
        materno();
        nombres();
        validarRfc();
        rfc=rfc.toUpperCase()+" - "+year.substring(2, 4)+""+c3+""+c4+""+c1+""+c2+"  - ";
        Homoclave();
       // rfc = rfc+fecha.getAño()+fecha.getMes()+fecha.getDia();
        return rfc;
    }
    
    private void validarApellidos()
    {
     if(ap_paterno.equals(" "))   
     {
         rfc="";
         rfc=rfc+ap_materno.trim().substring(0, 2); 
         rfc = rfc.concat(nombres.trim().substring(0, 2));
     }
     if(ap_materno.equals(" "))
     {
         rfc="";
         rfc=rfc+ap_paterno.trim().substring(0, 2); 
         rfc = rfc.concat(nombres.trim().substring(0, 2));
     }
    }
    
    private void validarRfc()
    {                                                
        String palabra =rfc.substring(0, 4);
        
        String palabras[]={"pene","bato","bofe","buei","buey","caca","caco","caga","cago","caka","cako","coge","coja","coje",
        "coji","ruin","cojo","culo","feto","foca","gata","guei","guey","joto","kaca","kaga","kago","koge","kojo","sapo","kaka",
        "kulo","loba","loca","loco","loka","loko","lora","loro","mala","mame","mamo","mear","meas","vaca","meon","mion","moci",
        "mula","peda","pedo","puta","puto","qulo","rata","roba","robe","robo","vaga","vago"};
        for(int i=0; i<palabras.length; i++)
        {
            if(palabras[i].equalsIgnoreCase(palabra))
            {
                rfc = palabra.substring(0, 3)+"x";
                
            }
        }
       
    }  
   private void Homoclave(){
        String Nc = "";
        String NombreEnNumero = "";
        String ver = " ";
      String[ ] Caracter = {" ", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "ñ", "a", "b", "c", "d", "e", "f", "g", "h", 
          "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
      
      String[ ] Valor = {"00", "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", 
      "16", "17", "18", "19", "21", "22", "23", "24", "25", "26", "27", "28", "29", "32", "33", "34", "35", "36", "37",
      "38", "39"};
      
       Nc = Nc+ap_paterno+" "+ap_materno+" "+nombres;
       for (int i = 0; i < Nc.length(); i++) {
           
         String l = Nc.charAt(i)+"";
          
           for (int j = 0; j < Caracter.length; j++) {
               if(Caracter[j].equalsIgnoreCase(l)){
                NombreEnNumero = NombreEnNumero+Valor[j];
                if(i==0){
                    NombreEnNumero="0"+NombreEnNumero;
                }
                
               }
           
           ver = NombreEnNumero;
       }
     
   }
       for (int h=0, i = 0; i <ver.length(); i++, h++) {
        int   mul = Integer.parseInt(""+ver.charAt(i));
       
       }
       rfc=rfc+ver;
   }
   
   }
