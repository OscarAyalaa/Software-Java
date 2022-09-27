/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centraal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Oscar
 */
public class Centraal {
 public static void main(String[] args) throws IOException {
    LLamadas s = new LLamadas();
    LLamadas []arrellamada= new LLamadas [2];
     for (int  i=0; i<arrellamada.length; i++){
int t,tiempo;
double c, costo;
System.out.println("proporciona el tiempo del objeto"+ i );
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
tiempo=Integer.parseInt(in.readLine());
System.out.println("proporciona el costo de la llamada del objeto " + i );
costo=Double.parseDouble (in.readLine());
arrellamada[i]= new LLamadas(tiempo,costo);
}
     for (int i=0;i<arrellamada.length; i++){
System.out.println("Datos del objeto"+ i );
System.out.println(""+ arrellamada[i].obtenTiempo() );
System.out.println(""+ arrellamada[i].obtenCosto());
}
double sumacosto=0.0;
for (int i=0;i<arrellamada.length; i++){
System.out.println("Calcular costo de llamada del objeto"+ i );
System.out.println(""+ arrellamada[i].calcularPrecio());
sumacosto=sumacosto+ arrellamada[i].calcularPrecio();
}
System.out.println("El costo total de las llamadas es "+ sumacosto );

    System.out.println();
    System.out.println("Numero total de llamadas: "+s.getTotalLLamadas());
    System.out.println("Total Facturado: "+s.getTotalFacturado());
}
}
