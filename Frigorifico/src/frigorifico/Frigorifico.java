/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frigorifico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;
public class Frigorifico {
    

    public static void main(String[] args)throws IOException {
	char opcion;
	Frigorifico arreglo [] =new Frigorifico[100];
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
       arreglo = null;
       opcion=' ';
       while (opcion != '5') {
           System.out.println("Menu (X__X)");
           System.out.println();
           System.out.println("1.-Ingresar datos");
           System.out.println("2.-Desplegar datos");
           System.out.println("3.-Desplegar datos de hembras obesas");
           System.out.println("4.-Salir");
           System.out.println("Opcion deseada(1-4)");
           opcion = in.readLine().charAt(0);
     
      switch(opcion){
    case ('1'):
              ingresar();
               break;
          case ('2'):
               Desplegar();
               break;
          case ('3'):
              Desplegar2();
               break;
          case ('4'):
              JOptionPane.showMessageDialog(null,"Esta salinedo del programa");
              break;
              default:
                JOptionPane.showMessageDialog(null,"Elijio una opcion no \nvalida","Error de opcion",JOptionPane.WARNING_MESSAGE);
      }
       }
    }
       public static void ingresar()throws IOException{
           Frigorifico f = new Frigorifico();
         SiFrigorifico arreglo [] =new SiFrigorifico[100];
	SiFrigorifico Arreglo_HembrasOb [] =new SiFrigorifico[100];
           int ContCordero=0,ContHomb=0;
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));	
	int NumSerie,edad;
        char sexo;
	String sexoo;
	double peso;
        System.out.println("Cual es el numero de serie ");
        NumSerie=Integer.parseInt(in.readLine());
        System.out.println("Cual es la edad ");
        edad=Integer.parseInt(in.readLine());
       System.out.println("Cual es el sexo ");
        sexoo=in.readLine();
        sexo=sexoo.charAt(0);
       System.out.println("Cual es el peso ");
        peso=Double.parseDouble(in.readLine());
        SiFrigorifico cordero = new SiFrigorifico();
        if (sexo=='h' || sexo=='H'){
        	if (peso>40){
        	cordero.setNumSerie(NumSerie); 
                cordero.setEdad(edad); 
                cordero.setSexo(sexo);
                cordero.setPeso(peso);        
                 Arreglo_HembrasOb[ContHomb] = cordero;
                ContCordero++;
        	}
        }
        else{
        cordero.setNumSerie(NumSerie); 
            cordero.setEdad(edad); 
            cordero.setSexo(sexo);
            cordero.setPeso(peso);        
            arreglo[ContCordero] = cordero;
            ContCordero++;      
        }
        
    }
	public static void Desplegar(){
        Frigorifico f = new Frigorifico();
        SiFrigorifico arreglo [] =new SiFrigorifico[100];
	SiFrigorifico Arreglo_HembrasOb [] =new SiFrigorifico[100];
	int ContCordero=0,ContHomb=0;	 
        String imprimir="";
        for(int i=0; i<ContCordero; i++){
            imprimir+="Numero de erie: "+arreglo[i].getNumSerie()+"\n"
              + "lA Edad: "+arreglo[i].getEdad()+"\n"
              + "El Sexo: "+arreglo[i].getSexo()+"\n"
              + "El Peso: "+arreglo[i].getPeso()+"\n\n";        
        }
        System.out.println(""+imprimir);
    }
	public static void Desplegar2(){
           Frigorifico f = new Frigorifico();
        SiFrigorifico arreglo [] =new SiFrigorifico[100];
	SiFrigorifico Arreglo_HembrasOb [] =new SiFrigorifico[100];
		int ContCordero=0,ContHomb=0; 
        String im="";
 
        for(int i=0; i<ContCordero; i++){
            im+="Numero de serie: "+Arreglo_HembrasOb[i].getNumSerie()+"\n"
              + "La Edad es: "+Arreglo_HembrasOb[i].getEdad()+"\n"
              + "El Sexo es: "+Arreglo_HembrasOb[i].getSexo()+"\n"
              + "El Peso es: "+Arreglo_HembrasOb[i].getPeso()+"\n\n";        
        }
        System.out.println(""+im);
    }
}
    

    

