/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;
/**
 *
 * @author Oscar
 */
public class Aplicacion {
    private static HeroesMarvel arreglo[];
    private static HeroesDC arreglo2[];
    public static void pide_datos() throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String nombre,identidad,poderes,DesTraje,raza,armas;
        arreglo = new HeroesMarvel[4];
        for(int i=0; i<4; i++){
                  System.out.println("crear objeto de heroes de Marvel  "+(i+1)+":");
                  System.out.println("Cual es el nombre del heroe: ");
                  nombre=in.readLine();
                  System.out.println("Cual es su identidad : ");
                  identidad=in.readLine();
                  System.out.println("Cuales son sus poderes:  ");
                  poderes=in.readLine();
                  System.out.println("Cuales la descripcion de su traje:  ");
                  DesTraje=in.readLine();
                  System.out.println("Cual es la raza: ");
                  raza=in.readLine();
                  System.out.println("Que aramas utiliza: ");
                  armas=in.readLine();
                   arreglo [i] = new HeroesMarvel(nombre,identidad,poderes,DesTraje,raza,armas);
                   
              }
        arreglo2 = new HeroesDC[4];
        for(int i=0; i<4; i++){
                  System.out.println("crear objeto de heroes de DC  "+(i+1)+":");
                  System.out.println("Cual es el nombre del heroe :");
                  nombre=in.readLine();
                  System.out.println("Cual es su identidad: ");
                  identidad=in.readLine();
                  System.out.println("Cuales son sus poderes :");
                  poderes=in.readLine();
                  System.out.println("Cuales la descripcion de su traje:");
                  DesTraje=in.readLine();
                  System.out.println("Cual es la raza:");
                  raza=in.readLine();
                  System.out.println("Que aramas utiliza:");
                  armas=in.readLine();
                   arreglo2 [i] = new HeroesDC(nombre,identidad,poderes,DesTraje,raza,armas);     
        }
    }
    public static void mostrar(){
        System.out.println("Heroes de Marvel:");
         for(HeroesMarvel objeto : arreglo){
             System.out.println("Nombre: "+objeto.getNombre()+"\nIdentidad: "+objeto.getIdentidad()+"\nPoderes: "+objeto.getPoderes()+"\nTraje: "+objeto.getTraje()+"\nRaza: "+objeto.getRaza()+"Armas"+objeto.getArmas());
         }
    }
    public static void mostrar2(){
        System.out.println("Heroes de DC:");
         for(HeroesDC objeto : arreglo2){
             System.out.println("Nombre: "+objeto.getNombre()+"\nIdentidad: "+objeto.getIdentidad()+"\nPoderes: "+objeto.getPoderes()+"\nTraje: "+objeto.getTraje()+"\nRaza: "+objeto.getRaza()+"Armas"+objeto.getArmas());
         }
    }
    public static void main(String[] args)throws IOException {
       char opcion;
       BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
       arreglo = null;
       opcion=' ';
       while (opcion != '4') {
           System.out.println("Menu (X__X)");
           System.out.println();
           System.out.println("1.-Datos para los Heroes");
           System.out.println("2.-Heroes de Marvel");
           System.out.println("3.-Heroes de DC");
           System.out.println("4.-SAalir");
           System.out.println("Opcion (1-4)");
           opcion = in.readLine().charAt(0);
switch(opcion){
    case ('1'):
        System.out.println("Pidiendo datos de los heroes");
        pide_datos();
        break;
    case ('2'):
        System.out.println("Heroes de Marvel");
        mostrar();
        break;
    case ('3'):
        System.out.println("Heroes de DC");
        mostrar2();
        break;
    case ('4'):
        System.out.println("Esta saliendo del programa");
        break;
    default:
        JOptionPane.showMessageDialog(null,"Elijio una opcion no \nvalida","Error de opcion",JOptionPane.WARNING_MESSAGE);
}
    }
}
}
