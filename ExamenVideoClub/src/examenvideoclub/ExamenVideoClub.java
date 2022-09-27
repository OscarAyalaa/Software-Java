/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenvideoclub;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;
/**
 *
 * @author Oscar
 */
public class ExamenVideoClub {

    /**
     * @param args the command line arguments
     */ private static Pelicula arreglo[];
     private static Serie arreglo2[];
      public static void pide_arreglo()throws IOException{
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
     String titulo,genero,creador;
     double PrecioRenta;
     arreglo = new Pelicula[5];
      for(int i=0; i<5; i++){
                  System.out.println("crear objeto de la pelicula  "+(i+1)+":");
                  System.out.println("Cual es el titulo de la pelicula  "+(i+1)+":");
                  titulo=in.readLine();
                  System.out.println("Cual es el genero de la pelicula  "+(i+1)+":");
                  genero=in.readLine();
                  System.out.println("Cual es el creador de la pelicula  "+(i+1)+":");
                  creador=in.readLine();
                  System.out.println("Cual es el precio de renta por la pelicula  "+(i+1)+":");
                  PrecioRenta=Integer.parseInt(in.readLine());
                   arreglo [i] = new Pelicula(titulo,genero,creador,PrecioRenta);
              }
      arreglo2 = new Serie[5];
      for(int i=0; i<5; i++){
                  System.out.println("crear objeto de la serie  "+(i+1)+":");
                  System.out.println("Cual es el titulo de la serie "+(i+1)+":");
                  titulo=in.readLine();
                  System.out.println("Cual es el genero de la serie  "+(i+1)+":");
                  genero=in.readLine();
                  System.out.println("Cual es el creador de la serie  "+(i+1)+":");
                  creador=in.readLine();
                  System.out.println("Cual es el precio de renta por la serie  "+(i+1)+":");
                  PrecioRenta=Integer.parseInt(in.readLine());
                   arreglo2 [i] = new Serie(titulo,genero,creador,PrecioRenta);
              }
      }
      public static void despliega_arreglo(){
          System.out.println("Peliculas en existencia");
          for(Pelicula objeto : arreglo){
              System.out.println("Tituo: "+objeto.getTitulo()+"\nGenero:  "+objeto.getGenero()+"\nCreador : "+objeto.getCreador()+"\nPrecio de renta:  "+objeto.PrecioRenta());
          }
      }
      public static void despliega_arreglo2(){
          System.out.println("Series en existencia");
          for(Serie objeto : arreglo2){
              System.out.println("Tituo: "+objeto.getTitulo()+"\nGenero:  "+objeto.getGenero()+"\nCreador : "+objeto.getCreador()+"\nPrecio de renta:  "+objeto.getPrecioRenta());
          }
      }
      public static double FacturaPeliculas(){
        double PrecioRenta=0.0d;
        for(int i=0; i<arreglo.length; i++){
            Pelicula objeto= arreglo[i];
            PrecioRenta +=objeto.PrecioRenta();
        }
        return PrecioRenta;
    }
     public static double FacturaSeries(){
        double PrecioRenta=0.0d;
        for(int i=0; i<arreglo2.length; i++){
            Serie objeto= arreglo2[i];
            PrecioRenta +=objeto.getPrecioRenta();
        }
        return PrecioRenta;
    }
    
    public static void main(String[] args)throws IOException {
        char opcion;
       BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
       arreglo = null;
       opcion=' ';
       while (opcion != '5') {
           System.out.println("Menu (X__X)");
           System.out.println();
           System.out.println("1.-Datos para las peliculas");
           System.out.println("2.-Peliculas");
           System.out.println("3.-Series");
           System.out.println("4.-Informe");
           System.out.println("5.-fin");
           System.out.println("Opcion deseada(1-5)");
           opcion = in.readLine().charAt(0);
     
      switch(opcion){
    case ('1'):
               System.out.println("Pidiendo datos");
               pide_arreglo();
               break;
          case ('2'):
               System.out.println("Peliculas :");
               despliega_arreglo();
               break;
          case ('3'):
              System.out.println("Series :");
               despliega_arreglo2();
                  break;
          case ('4'):
              System.out.println("La factura de las peliculas es : "+FacturaPeliculas());
              System.out.println("La factura de las series es de :"+FacturaSeries());
              break;
          case ('5'):
              JOptionPane.showMessageDialog(null,"Esta salinedo del programa");
              break;
              default:
                JOptionPane.showMessageDialog(null,"Elijio una opcion no \nvalida","Error de opcion",JOptionPane.WARNING_MESSAGE);
      }
       }
    }
}
   
    

